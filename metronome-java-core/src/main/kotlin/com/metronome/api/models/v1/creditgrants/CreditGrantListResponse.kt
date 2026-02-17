// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.creditgrants

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.checkKnown
import com.metronome.api.core.checkRequired
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import com.metronome.api.models.CreditTypeData
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CreditGrantListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val balance: JsonField<Balance>,
    private val customFields: JsonField<CustomFields>,
    private val customerId: JsonField<String>,
    private val deductions: JsonField<List<CreditLedgerEntry>>,
    private val effectiveAt: JsonField<OffsetDateTime>,
    private val expiresAt: JsonField<OffsetDateTime>,
    private val grantAmount: JsonField<GrantAmount>,
    private val name: JsonField<String>,
    private val paidAmount: JsonField<PaidAmount>,
    private val pendingDeductions: JsonField<List<CreditLedgerEntry>>,
    private val priority: JsonField<Double>,
    private val creditGrantType: JsonField<String>,
    private val invoiceId: JsonField<String>,
    private val products: JsonField<List<Product>>,
    private val reason: JsonField<String>,
    private val uniquenessKey: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("balance") @ExcludeMissing balance: JsonField<Balance> = JsonMissing.of(),
        @JsonProperty("custom_fields")
        @ExcludeMissing
        customFields: JsonField<CustomFields> = JsonMissing.of(),
        @JsonProperty("customer_id")
        @ExcludeMissing
        customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("deductions")
        @ExcludeMissing
        deductions: JsonField<List<CreditLedgerEntry>> = JsonMissing.of(),
        @JsonProperty("effective_at")
        @ExcludeMissing
        effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of(),
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
        @JsonProperty("pending_deductions")
        @ExcludeMissing
        pendingDeductions: JsonField<List<CreditLedgerEntry>> = JsonMissing.of(),
        @JsonProperty("priority") @ExcludeMissing priority: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("credit_grant_type")
        @ExcludeMissing
        creditGrantType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("invoice_id") @ExcludeMissing invoiceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("products")
        @ExcludeMissing
        products: JsonField<List<Product>> = JsonMissing.of(),
        @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of(),
        @JsonProperty("uniqueness_key")
        @ExcludeMissing
        uniquenessKey: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        balance,
        customFields,
        customerId,
        deductions,
        effectiveAt,
        expiresAt,
        grantAmount,
        name,
        paidAmount,
        pendingDeductions,
        priority,
        creditGrantType,
        invoiceId,
        products,
        reason,
        uniquenessKey,
        mutableMapOf(),
    )

    /**
     * the Metronome ID of the credit grant
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The effective balance of the grant as of the end of the customer's current billing period.
     * Expiration deductions will be included only if the grant expires before the end of the
     * current billing period.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun balance(): Balance = balance.getRequired("balance")

    /**
     * Custom fields to be added eg. { "key1": "value1", "key2": "value2" }
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customFields(): CustomFields = customFields.getRequired("custom_fields")

    /**
     * the Metronome ID of the customer
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customerId(): String = customerId.getRequired("customer_id")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun deductions(): List<CreditLedgerEntry> = deductions.getRequired("deductions")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun effectiveAt(): OffsetDateTime = effectiveAt.getRequired("effective_at")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun expiresAt(): OffsetDateTime = expiresAt.getRequired("expires_at")

    /**
     * the amount of credits initially granted
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun grantAmount(): GrantAmount = grantAmount.getRequired("grant_amount")

    /**
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
    fun pendingDeductions(): List<CreditLedgerEntry> =
        pendingDeductions.getRequired("pending_deductions")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun priority(): Double = priority.getRequired("priority")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun creditGrantType(): Optional<String> = creditGrantType.getOptional("credit_grant_type")

    /**
     * the Metronome ID of the invoice with the purchase charge for this credit grant, if applicable
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun invoiceId(): Optional<String> = invoiceId.getOptional("invoice_id")

    /**
     * The products which these credits will be applied to. (If unspecified, the credits will be
     * applied to charges for all products.)
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun products(): Optional<List<Product>> = products.getOptional("products")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reason(): Optional<String> = reason.getOptional("reason")

    /**
     * Prevents the creation of duplicates. If a request to create a record is made with a
     * previously used uniqueness key, a new record will not be created and the request will fail
     * with a 409 error.
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
     * Returns the raw JSON value of [balance].
     *
     * Unlike [balance], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("balance") @ExcludeMissing fun _balance(): JsonField<Balance> = balance

    /**
     * Returns the raw JSON value of [customFields].
     *
     * Unlike [customFields], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("custom_fields")
    @ExcludeMissing
    fun _customFields(): JsonField<CustomFields> = customFields

    /**
     * Returns the raw JSON value of [customerId].
     *
     * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customer_id") @ExcludeMissing fun _customerId(): JsonField<String> = customerId

    /**
     * Returns the raw JSON value of [deductions].
     *
     * Unlike [deductions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("deductions")
    @ExcludeMissing
    fun _deductions(): JsonField<List<CreditLedgerEntry>> = deductions

    /**
     * Returns the raw JSON value of [effectiveAt].
     *
     * Unlike [effectiveAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("effective_at")
    @ExcludeMissing
    fun _effectiveAt(): JsonField<OffsetDateTime> = effectiveAt

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
     * Returns the raw JSON value of [pendingDeductions].
     *
     * Unlike [pendingDeductions], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("pending_deductions")
    @ExcludeMissing
    fun _pendingDeductions(): JsonField<List<CreditLedgerEntry>> = pendingDeductions

    /**
     * Returns the raw JSON value of [priority].
     *
     * Unlike [priority], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<Double> = priority

    /**
     * Returns the raw JSON value of [creditGrantType].
     *
     * Unlike [creditGrantType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("credit_grant_type")
    @ExcludeMissing
    fun _creditGrantType(): JsonField<String> = creditGrantType

    /**
     * Returns the raw JSON value of [invoiceId].
     *
     * Unlike [invoiceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("invoice_id") @ExcludeMissing fun _invoiceId(): JsonField<String> = invoiceId

    /**
     * Returns the raw JSON value of [products].
     *
     * Unlike [products], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("products") @ExcludeMissing fun _products(): JsonField<List<Product>> = products

    /**
     * Returns the raw JSON value of [reason].
     *
     * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

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
         * Returns a mutable builder for constructing an instance of [CreditGrantListResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .balance()
         * .customFields()
         * .customerId()
         * .deductions()
         * .effectiveAt()
         * .expiresAt()
         * .grantAmount()
         * .name()
         * .paidAmount()
         * .pendingDeductions()
         * .priority()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CreditGrantListResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var balance: JsonField<Balance>? = null
        private var customFields: JsonField<CustomFields>? = null
        private var customerId: JsonField<String>? = null
        private var deductions: JsonField<MutableList<CreditLedgerEntry>>? = null
        private var effectiveAt: JsonField<OffsetDateTime>? = null
        private var expiresAt: JsonField<OffsetDateTime>? = null
        private var grantAmount: JsonField<GrantAmount>? = null
        private var name: JsonField<String>? = null
        private var paidAmount: JsonField<PaidAmount>? = null
        private var pendingDeductions: JsonField<MutableList<CreditLedgerEntry>>? = null
        private var priority: JsonField<Double>? = null
        private var creditGrantType: JsonField<String> = JsonMissing.of()
        private var invoiceId: JsonField<String> = JsonMissing.of()
        private var products: JsonField<MutableList<Product>>? = null
        private var reason: JsonField<String> = JsonMissing.of()
        private var uniquenessKey: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(creditGrantListResponse: CreditGrantListResponse) = apply {
            id = creditGrantListResponse.id
            balance = creditGrantListResponse.balance
            customFields = creditGrantListResponse.customFields
            customerId = creditGrantListResponse.customerId
            deductions = creditGrantListResponse.deductions.map { it.toMutableList() }
            effectiveAt = creditGrantListResponse.effectiveAt
            expiresAt = creditGrantListResponse.expiresAt
            grantAmount = creditGrantListResponse.grantAmount
            name = creditGrantListResponse.name
            paidAmount = creditGrantListResponse.paidAmount
            pendingDeductions = creditGrantListResponse.pendingDeductions.map { it.toMutableList() }
            priority = creditGrantListResponse.priority
            creditGrantType = creditGrantListResponse.creditGrantType
            invoiceId = creditGrantListResponse.invoiceId
            products = creditGrantListResponse.products.map { it.toMutableList() }
            reason = creditGrantListResponse.reason
            uniquenessKey = creditGrantListResponse.uniquenessKey
            additionalProperties = creditGrantListResponse.additionalProperties.toMutableMap()
        }

        /** the Metronome ID of the credit grant */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The effective balance of the grant as of the end of the customer's current billing
         * period. Expiration deductions will be included only if the grant expires before the end
         * of the current billing period.
         */
        fun balance(balance: Balance) = balance(JsonField.of(balance))

        /**
         * Sets [Builder.balance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.balance] with a well-typed [Balance] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun balance(balance: JsonField<Balance>) = apply { this.balance = balance }

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

        /** the Metronome ID of the customer */
        fun customerId(customerId: String) = customerId(JsonField.of(customerId))

        /**
         * Sets [Builder.customerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

        fun deductions(deductions: List<CreditLedgerEntry>) = deductions(JsonField.of(deductions))

        /**
         * Sets [Builder.deductions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deductions] with a well-typed `List<CreditLedgerEntry>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun deductions(deductions: JsonField<List<CreditLedgerEntry>>) = apply {
            this.deductions = deductions.map { it.toMutableList() }
        }

        /**
         * Adds a single [CreditLedgerEntry] to [deductions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDeduction(deduction: CreditLedgerEntry) = apply {
            deductions =
                (deductions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("deductions", it).add(deduction)
                }
        }

        fun effectiveAt(effectiveAt: OffsetDateTime) = effectiveAt(JsonField.of(effectiveAt))

        /**
         * Sets [Builder.effectiveAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.effectiveAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun effectiveAt(effectiveAt: JsonField<OffsetDateTime>) = apply {
            this.effectiveAt = effectiveAt
        }

        fun expiresAt(expiresAt: OffsetDateTime) = expiresAt(JsonField.of(expiresAt))

        /**
         * Sets [Builder.expiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply { this.expiresAt = expiresAt }

        /** the amount of credits initially granted */
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

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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
        fun paidAmount(paidAmount: JsonField<PaidAmount>) = apply { this.paidAmount = paidAmount }

        fun pendingDeductions(pendingDeductions: List<CreditLedgerEntry>) =
            pendingDeductions(JsonField.of(pendingDeductions))

        /**
         * Sets [Builder.pendingDeductions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pendingDeductions] with a well-typed
         * `List<CreditLedgerEntry>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun pendingDeductions(pendingDeductions: JsonField<List<CreditLedgerEntry>>) = apply {
            this.pendingDeductions = pendingDeductions.map { it.toMutableList() }
        }

        /**
         * Adds a single [CreditLedgerEntry] to [pendingDeductions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPendingDeduction(pendingDeduction: CreditLedgerEntry) = apply {
            pendingDeductions =
                (pendingDeductions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("pendingDeductions", it).add(pendingDeduction)
                }
        }

        fun priority(priority: Double) = priority(JsonField.of(priority))

        /**
         * Sets [Builder.priority] to an arbitrary JSON value.
         *
         * You should usually call [Builder.priority] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun priority(priority: JsonField<Double>) = apply { this.priority = priority }

        fun creditGrantType(creditGrantType: String?) =
            creditGrantType(JsonField.ofNullable(creditGrantType))

        /** Alias for calling [Builder.creditGrantType] with `creditGrantType.orElse(null)`. */
        fun creditGrantType(creditGrantType: Optional<String>) =
            creditGrantType(creditGrantType.getOrNull())

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

        /**
         * the Metronome ID of the invoice with the purchase charge for this credit grant, if
         * applicable
         */
        fun invoiceId(invoiceId: String?) = invoiceId(JsonField.ofNullable(invoiceId))

        /** Alias for calling [Builder.invoiceId] with `invoiceId.orElse(null)`. */
        fun invoiceId(invoiceId: Optional<String>) = invoiceId(invoiceId.getOrNull())

        /**
         * Sets [Builder.invoiceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invoiceId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun invoiceId(invoiceId: JsonField<String>) = apply { this.invoiceId = invoiceId }

        /**
         * The products which these credits will be applied to. (If unspecified, the credits will be
         * applied to charges for all products.)
         */
        fun products(products: List<Product>) = products(JsonField.of(products))

        /**
         * Sets [Builder.products] to an arbitrary JSON value.
         *
         * You should usually call [Builder.products] with a well-typed `List<Product>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun products(products: JsonField<List<Product>>) = apply {
            this.products = products.map { it.toMutableList() }
        }

        /**
         * Adds a single [Product] to [products].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addProduct(product: Product) = apply {
            products =
                (products ?: JsonField.of(mutableListOf())).also {
                    checkKnown("products", it).add(product)
                }
        }

        fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

        /** Alias for calling [Builder.reason] with `reason.orElse(null)`. */
        fun reason(reason: Optional<String>) = reason(reason.getOrNull())

        /**
         * Sets [Builder.reason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reason] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun reason(reason: JsonField<String>) = apply { this.reason = reason }

        /**
         * Prevents the creation of duplicates. If a request to create a record is made with a
         * previously used uniqueness key, a new record will not be created and the request will
         * fail with a 409 error.
         */
        fun uniquenessKey(uniquenessKey: String?) =
            uniquenessKey(JsonField.ofNullable(uniquenessKey))

        /** Alias for calling [Builder.uniquenessKey] with `uniquenessKey.orElse(null)`. */
        fun uniquenessKey(uniquenessKey: Optional<String>) =
            uniquenessKey(uniquenessKey.getOrNull())

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
         * Returns an immutable instance of [CreditGrantListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .balance()
         * .customFields()
         * .customerId()
         * .deductions()
         * .effectiveAt()
         * .expiresAt()
         * .grantAmount()
         * .name()
         * .paidAmount()
         * .pendingDeductions()
         * .priority()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CreditGrantListResponse =
            CreditGrantListResponse(
                checkRequired("id", id),
                checkRequired("balance", balance),
                checkRequired("customFields", customFields),
                checkRequired("customerId", customerId),
                checkRequired("deductions", deductions).map { it.toImmutable() },
                checkRequired("effectiveAt", effectiveAt),
                checkRequired("expiresAt", expiresAt),
                checkRequired("grantAmount", grantAmount),
                checkRequired("name", name),
                checkRequired("paidAmount", paidAmount),
                checkRequired("pendingDeductions", pendingDeductions).map { it.toImmutable() },
                checkRequired("priority", priority),
                creditGrantType,
                invoiceId,
                (products ?: JsonMissing.of()).map { it.toImmutable() },
                reason,
                uniquenessKey,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CreditGrantListResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        balance().validate()
        customFields().validate()
        customerId()
        deductions().forEach { it.validate() }
        effectiveAt()
        expiresAt()
        grantAmount().validate()
        name()
        paidAmount().validate()
        pendingDeductions().forEach { it.validate() }
        priority()
        creditGrantType()
        invoiceId()
        products().ifPresent { it.forEach { it.validate() } }
        reason()
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
            (balance.asKnown().getOrNull()?.validity() ?: 0) +
            (customFields.asKnown().getOrNull()?.validity() ?: 0) +
            (if (customerId.asKnown().isPresent) 1 else 0) +
            (deductions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (effectiveAt.asKnown().isPresent) 1 else 0) +
            (if (expiresAt.asKnown().isPresent) 1 else 0) +
            (grantAmount.asKnown().getOrNull()?.validity() ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (paidAmount.asKnown().getOrNull()?.validity() ?: 0) +
            (pendingDeductions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (priority.asKnown().isPresent) 1 else 0) +
            (if (creditGrantType.asKnown().isPresent) 1 else 0) +
            (if (invoiceId.asKnown().isPresent) 1 else 0) +
            (products.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (reason.asKnown().isPresent) 1 else 0) +
            (if (uniquenessKey.asKnown().isPresent) 1 else 0)

    /**
     * The effective balance of the grant as of the end of the customer's current billing period.
     * Expiration deductions will be included only if the grant expires before the end of the
     * current billing period.
     */
    class Balance
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val effectiveAt: JsonField<OffsetDateTime>,
        private val excludingPending: JsonField<Double>,
        private val includingPending: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("effective_at")
            @ExcludeMissing
            effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("excluding_pending")
            @ExcludeMissing
            excludingPending: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("including_pending")
            @ExcludeMissing
            includingPending: JsonField<Double> = JsonMissing.of(),
        ) : this(effectiveAt, excludingPending, includingPending, mutableMapOf())

        /**
         * The end_date of the customer's current billing period.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun effectiveAt(): OffsetDateTime = effectiveAt.getRequired("effective_at")

        /**
         * The grant's current balance including all posted deductions. If the grant has expired,
         * this amount will be 0.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun excludingPending(): Double = excludingPending.getRequired("excluding_pending")

        /**
         * The grant's current balance including all posted and pending deductions. If the grant
         * expires before the end of the customer's current billing period, this amount will be 0.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun includingPending(): Double = includingPending.getRequired("including_pending")

        /**
         * Returns the raw JSON value of [effectiveAt].
         *
         * Unlike [effectiveAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("effective_at")
        @ExcludeMissing
        fun _effectiveAt(): JsonField<OffsetDateTime> = effectiveAt

        /**
         * Returns the raw JSON value of [excludingPending].
         *
         * Unlike [excludingPending], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("excluding_pending")
        @ExcludeMissing
        fun _excludingPending(): JsonField<Double> = excludingPending

        /**
         * Returns the raw JSON value of [includingPending].
         *
         * Unlike [includingPending], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("including_pending")
        @ExcludeMissing
        fun _includingPending(): JsonField<Double> = includingPending

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
             * Returns a mutable builder for constructing an instance of [Balance].
             *
             * The following fields are required:
             * ```java
             * .effectiveAt()
             * .excludingPending()
             * .includingPending()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Balance]. */
        class Builder internal constructor() {

            private var effectiveAt: JsonField<OffsetDateTime>? = null
            private var excludingPending: JsonField<Double>? = null
            private var includingPending: JsonField<Double>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(balance: Balance) = apply {
                effectiveAt = balance.effectiveAt
                excludingPending = balance.excludingPending
                includingPending = balance.includingPending
                additionalProperties = balance.additionalProperties.toMutableMap()
            }

            /** The end_date of the customer's current billing period. */
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

            /**
             * The grant's current balance including all posted deductions. If the grant has
             * expired, this amount will be 0.
             */
            fun excludingPending(excludingPending: Double) =
                excludingPending(JsonField.of(excludingPending))

            /**
             * Sets [Builder.excludingPending] to an arbitrary JSON value.
             *
             * You should usually call [Builder.excludingPending] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun excludingPending(excludingPending: JsonField<Double>) = apply {
                this.excludingPending = excludingPending
            }

            /**
             * The grant's current balance including all posted and pending deductions. If the grant
             * expires before the end of the customer's current billing period, this amount will
             * be 0.
             */
            fun includingPending(includingPending: Double) =
                includingPending(JsonField.of(includingPending))

            /**
             * Sets [Builder.includingPending] to an arbitrary JSON value.
             *
             * You should usually call [Builder.includingPending] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun includingPending(includingPending: JsonField<Double>) = apply {
                this.includingPending = includingPending
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
             * Returns an immutable instance of [Balance].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .effectiveAt()
             * .excludingPending()
             * .includingPending()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Balance =
                Balance(
                    checkRequired("effectiveAt", effectiveAt),
                    checkRequired("excludingPending", excludingPending),
                    checkRequired("includingPending", includingPending),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Balance = apply {
            if (validated) {
                return@apply
            }

            effectiveAt()
            excludingPending()
            includingPending()
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
            (if (effectiveAt.asKnown().isPresent) 1 else 0) +
                (if (excludingPending.asKnown().isPresent) 1 else 0) +
                (if (includingPending.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Balance &&
                effectiveAt == other.effectiveAt &&
                excludingPending == other.excludingPending &&
                includingPending == other.includingPending &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(effectiveAt, excludingPending, includingPending, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Balance{effectiveAt=$effectiveAt, excludingPending=$excludingPending, includingPending=$includingPending, additionalProperties=$additionalProperties}"
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

    /** the amount of credits initially granted */
    class GrantAmount
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val amount: JsonField<Double>,
        private val creditType: JsonField<CreditTypeData>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("credit_type")
            @ExcludeMissing
            creditType: JsonField<CreditTypeData> = JsonMissing.of(),
        ) : this(amount, creditType, mutableMapOf())

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): Double = amount.getRequired("amount")

        /**
         * the credit type for the amount granted
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun creditType(): CreditTypeData = creditType.getRequired("credit_type")

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

        /**
         * Returns the raw JSON value of [creditType].
         *
         * Unlike [creditType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("credit_type")
        @ExcludeMissing
        fun _creditType(): JsonField<CreditTypeData> = creditType

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
             * .creditType()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [GrantAmount]. */
        class Builder internal constructor() {

            private var amount: JsonField<Double>? = null
            private var creditType: JsonField<CreditTypeData>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(grantAmount: GrantAmount) = apply {
                amount = grantAmount.amount
                creditType = grantAmount.creditType
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

            /** the credit type for the amount granted */
            fun creditType(creditType: CreditTypeData) = creditType(JsonField.of(creditType))

            /**
             * Sets [Builder.creditType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditType] with a well-typed [CreditTypeData] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun creditType(creditType: JsonField<CreditTypeData>) = apply {
                this.creditType = creditType
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
             * .creditType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): GrantAmount =
                GrantAmount(
                    checkRequired("amount", amount),
                    checkRequired("creditType", creditType),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): GrantAmount = apply {
            if (validated) {
                return@apply
            }

            amount()
            creditType().validate()
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
                (creditType.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is GrantAmount &&
                amount == other.amount &&
                creditType == other.creditType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(amount, creditType, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "GrantAmount{amount=$amount, creditType=$creditType, additionalProperties=$additionalProperties}"
    }

    /** the amount paid for this credit grant */
    class PaidAmount
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val amount: JsonField<Double>,
        private val creditType: JsonField<CreditTypeData>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("credit_type")
            @ExcludeMissing
            creditType: JsonField<CreditTypeData> = JsonMissing.of(),
        ) : this(amount, creditType, mutableMapOf())

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): Double = amount.getRequired("amount")

        /**
         * the credit type for the amount paid
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun creditType(): CreditTypeData = creditType.getRequired("credit_type")

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

        /**
         * Returns the raw JSON value of [creditType].
         *
         * Unlike [creditType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("credit_type")
        @ExcludeMissing
        fun _creditType(): JsonField<CreditTypeData> = creditType

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
             * .creditType()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PaidAmount]. */
        class Builder internal constructor() {

            private var amount: JsonField<Double>? = null
            private var creditType: JsonField<CreditTypeData>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(paidAmount: PaidAmount) = apply {
                amount = paidAmount.amount
                creditType = paidAmount.creditType
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

            /** the credit type for the amount paid */
            fun creditType(creditType: CreditTypeData) = creditType(JsonField.of(creditType))

            /**
             * Sets [Builder.creditType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditType] with a well-typed [CreditTypeData] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun creditType(creditType: JsonField<CreditTypeData>) = apply {
                this.creditType = creditType
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
             * .creditType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PaidAmount =
                PaidAmount(
                    checkRequired("amount", amount),
                    checkRequired("creditType", creditType),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): PaidAmount = apply {
            if (validated) {
                return@apply
            }

            amount()
            creditType().validate()
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
                (creditType.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PaidAmount &&
                amount == other.amount &&
                creditType == other.creditType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(amount, creditType, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PaidAmount{amount=$amount, creditType=$creditType, additionalProperties=$additionalProperties}"
    }

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CreditGrantListResponse &&
            id == other.id &&
            balance == other.balance &&
            customFields == other.customFields &&
            customerId == other.customerId &&
            deductions == other.deductions &&
            effectiveAt == other.effectiveAt &&
            expiresAt == other.expiresAt &&
            grantAmount == other.grantAmount &&
            name == other.name &&
            paidAmount == other.paidAmount &&
            pendingDeductions == other.pendingDeductions &&
            priority == other.priority &&
            creditGrantType == other.creditGrantType &&
            invoiceId == other.invoiceId &&
            products == other.products &&
            reason == other.reason &&
            uniquenessKey == other.uniquenessKey &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            balance,
            customFields,
            customerId,
            deductions,
            effectiveAt,
            expiresAt,
            grantAmount,
            name,
            paidAmount,
            pendingDeductions,
            priority,
            creditGrantType,
            invoiceId,
            products,
            reason,
            uniquenessKey,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CreditGrantListResponse{id=$id, balance=$balance, customFields=$customFields, customerId=$customerId, deductions=$deductions, effectiveAt=$effectiveAt, expiresAt=$expiresAt, grantAmount=$grantAmount, name=$name, paidAmount=$paidAmount, pendingDeductions=$pendingDeductions, priority=$priority, creditGrantType=$creditGrantType, invoiceId=$invoiceId, products=$products, reason=$reason, uniquenessKey=$uniquenessKey, additionalProperties=$additionalProperties}"
}
