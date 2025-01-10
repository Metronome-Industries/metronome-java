// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class CreditGrantListResponse
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("balance")
    @ExcludeMissing
    private val balance: JsonField<Balance> = JsonMissing.of(),
    @JsonProperty("custom_fields")
    @ExcludeMissing
    private val customFields: JsonField<CustomFields> = JsonMissing.of(),
    @JsonProperty("customer_id")
    @ExcludeMissing
    private val customerId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("deductions")
    @ExcludeMissing
    private val deductions: JsonField<List<CreditLedgerEntry>> = JsonMissing.of(),
    @JsonProperty("effective_at")
    @ExcludeMissing
    private val effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("expires_at")
    @ExcludeMissing
    private val expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("grant_amount")
    @ExcludeMissing
    private val grantAmount: JsonField<GrantAmount> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("paid_amount")
    @ExcludeMissing
    private val paidAmount: JsonField<PaidAmount> = JsonMissing.of(),
    @JsonProperty("pending_deductions")
    @ExcludeMissing
    private val pendingDeductions: JsonField<List<CreditLedgerEntry>> = JsonMissing.of(),
    @JsonProperty("priority")
    @ExcludeMissing
    private val priority: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("credit_grant_type")
    @ExcludeMissing
    private val creditGrantType: JsonField<String> = JsonMissing.of(),
    @JsonProperty("invoice_id")
    @ExcludeMissing
    private val invoiceId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("products")
    @ExcludeMissing
    private val products: JsonField<List<Product>> = JsonMissing.of(),
    @JsonProperty("reason")
    @ExcludeMissing
    private val reason: JsonField<String> = JsonMissing.of(),
    @JsonProperty("uniqueness_key")
    @ExcludeMissing
    private val uniquenessKey: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** the Metronome ID of the credit grant */
    fun id(): String = id.getRequired("id")

    /**
     * The effective balance of the grant as of the end of the customer's current billing period.
     * Expiration deductions will be included only if the grant expires before the end of the
     * current billing period.
     */
    fun balance(): Balance = balance.getRequired("balance")

    fun customFields(): CustomFields = customFields.getRequired("custom_fields")

    /** the Metronome ID of the customer */
    fun customerId(): String = customerId.getRequired("customer_id")

    fun deductions(): List<CreditLedgerEntry> = deductions.getRequired("deductions")

    fun effectiveAt(): OffsetDateTime = effectiveAt.getRequired("effective_at")

    fun expiresAt(): OffsetDateTime = expiresAt.getRequired("expires_at")

    /** the amount of credits initially granted */
    fun grantAmount(): GrantAmount = grantAmount.getRequired("grant_amount")

    fun name(): String = name.getRequired("name")

    /** the amount paid for this credit grant */
    fun paidAmount(): PaidAmount = paidAmount.getRequired("paid_amount")

    fun pendingDeductions(): List<CreditLedgerEntry> =
        pendingDeductions.getRequired("pending_deductions")

    fun priority(): Double = priority.getRequired("priority")

    fun creditGrantType(): Optional<String> =
        Optional.ofNullable(creditGrantType.getNullable("credit_grant_type"))

    /**
     * the Metronome ID of the invoice with the purchase charge for this credit grant, if applicable
     */
    fun invoiceId(): Optional<String> = Optional.ofNullable(invoiceId.getNullable("invoice_id"))

    /**
     * The products which these credits will be applied to. (If unspecified, the credits will be
     * applied to charges for all products.)
     */
    fun products(): Optional<List<Product>> = Optional.ofNullable(products.getNullable("products"))

    fun reason(): Optional<String> = Optional.ofNullable(reason.getNullable("reason"))

    /**
     * Prevents the creation of duplicates. If a request to create a record is made with a
     * previously used uniqueness key, a new record will not be created and the request will fail
     * with a 409 error.
     */
    fun uniquenessKey(): Optional<String> =
        Optional.ofNullable(uniquenessKey.getNullable("uniqueness_key"))

    /** the Metronome ID of the credit grant */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * The effective balance of the grant as of the end of the customer's current billing period.
     * Expiration deductions will be included only if the grant expires before the end of the
     * current billing period.
     */
    @JsonProperty("balance") @ExcludeMissing fun _balance(): JsonField<Balance> = balance

    @JsonProperty("custom_fields")
    @ExcludeMissing
    fun _customFields(): JsonField<CustomFields> = customFields

    /** the Metronome ID of the customer */
    @JsonProperty("customer_id") @ExcludeMissing fun _customerId(): JsonField<String> = customerId

    @JsonProperty("deductions")
    @ExcludeMissing
    fun _deductions(): JsonField<List<CreditLedgerEntry>> = deductions

    @JsonProperty("effective_at")
    @ExcludeMissing
    fun _effectiveAt(): JsonField<OffsetDateTime> = effectiveAt

    @JsonProperty("expires_at")
    @ExcludeMissing
    fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

    /** the amount of credits initially granted */
    @JsonProperty("grant_amount")
    @ExcludeMissing
    fun _grantAmount(): JsonField<GrantAmount> = grantAmount

    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /** the amount paid for this credit grant */
    @JsonProperty("paid_amount")
    @ExcludeMissing
    fun _paidAmount(): JsonField<PaidAmount> = paidAmount

    @JsonProperty("pending_deductions")
    @ExcludeMissing
    fun _pendingDeductions(): JsonField<List<CreditLedgerEntry>> = pendingDeductions

    @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<Double> = priority

    @JsonProperty("credit_grant_type")
    @ExcludeMissing
    fun _creditGrantType(): JsonField<String> = creditGrantType

    /**
     * the Metronome ID of the invoice with the purchase charge for this credit grant, if applicable
     */
    @JsonProperty("invoice_id") @ExcludeMissing fun _invoiceId(): JsonField<String> = invoiceId

    /**
     * The products which these credits will be applied to. (If unspecified, the credits will be
     * applied to charges for all products.)
     */
    @JsonProperty("products") @ExcludeMissing fun _products(): JsonField<List<Product>> = products

    @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

    /**
     * Prevents the creation of duplicates. If a request to create a record is made with a
     * previously used uniqueness key, a new record will not be created and the request will fail
     * with a 409 error.
     */
    @JsonProperty("uniqueness_key")
    @ExcludeMissing
    fun _uniquenessKey(): JsonField<String> = uniquenessKey

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

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

        /** the Metronome ID of the credit grant */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The effective balance of the grant as of the end of the customer's current billing
         * period. Expiration deductions will be included only if the grant expires before the end
         * of the current billing period.
         */
        fun balance(balance: Balance) = balance(JsonField.of(balance))

        /**
         * The effective balance of the grant as of the end of the customer's current billing
         * period. Expiration deductions will be included only if the grant expires before the end
         * of the current billing period.
         */
        fun balance(balance: JsonField<Balance>) = apply { this.balance = balance }

        fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

        fun customFields(customFields: JsonField<CustomFields>) = apply {
            this.customFields = customFields
        }

        /** the Metronome ID of the customer */
        fun customerId(customerId: String) = customerId(JsonField.of(customerId))

        /** the Metronome ID of the customer */
        fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

        fun deductions(deductions: List<CreditLedgerEntry>) = deductions(JsonField.of(deductions))

        fun deductions(deductions: JsonField<List<CreditLedgerEntry>>) = apply {
            this.deductions = deductions.map { it.toMutableList() }
        }

        fun addDeduction(deduction: CreditLedgerEntry) = apply {
            deductions =
                (deductions ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(deduction)
                }
        }

        fun effectiveAt(effectiveAt: OffsetDateTime) = effectiveAt(JsonField.of(effectiveAt))

        fun effectiveAt(effectiveAt: JsonField<OffsetDateTime>) = apply {
            this.effectiveAt = effectiveAt
        }

        fun expiresAt(expiresAt: OffsetDateTime) = expiresAt(JsonField.of(expiresAt))

        fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply { this.expiresAt = expiresAt }

        /** the amount of credits initially granted */
        fun grantAmount(grantAmount: GrantAmount) = grantAmount(JsonField.of(grantAmount))

        /** the amount of credits initially granted */
        fun grantAmount(grantAmount: JsonField<GrantAmount>) = apply {
            this.grantAmount = grantAmount
        }

        fun name(name: String) = name(JsonField.of(name))

        fun name(name: JsonField<String>) = apply { this.name = name }

        /** the amount paid for this credit grant */
        fun paidAmount(paidAmount: PaidAmount) = paidAmount(JsonField.of(paidAmount))

        /** the amount paid for this credit grant */
        fun paidAmount(paidAmount: JsonField<PaidAmount>) = apply { this.paidAmount = paidAmount }

        fun pendingDeductions(pendingDeductions: List<CreditLedgerEntry>) =
            pendingDeductions(JsonField.of(pendingDeductions))

        fun pendingDeductions(pendingDeductions: JsonField<List<CreditLedgerEntry>>) = apply {
            this.pendingDeductions = pendingDeductions.map { it.toMutableList() }
        }

        fun addPendingDeduction(pendingDeduction: CreditLedgerEntry) = apply {
            pendingDeductions =
                (pendingDeductions ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(pendingDeduction)
                }
        }

        fun priority(priority: Double) = priority(JsonField.of(priority))

        fun priority(priority: JsonField<Double>) = apply { this.priority = priority }

        fun creditGrantType(creditGrantType: String?) =
            creditGrantType(JsonField.ofNullable(creditGrantType))

        fun creditGrantType(creditGrantType: Optional<String>) =
            creditGrantType(creditGrantType.orElse(null))

        fun creditGrantType(creditGrantType: JsonField<String>) = apply {
            this.creditGrantType = creditGrantType
        }

        /**
         * the Metronome ID of the invoice with the purchase charge for this credit grant, if
         * applicable
         */
        fun invoiceId(invoiceId: String?) = invoiceId(JsonField.ofNullable(invoiceId))

        /**
         * the Metronome ID of the invoice with the purchase charge for this credit grant, if
         * applicable
         */
        fun invoiceId(invoiceId: Optional<String>) = invoiceId(invoiceId.orElse(null))

        /**
         * the Metronome ID of the invoice with the purchase charge for this credit grant, if
         * applicable
         */
        fun invoiceId(invoiceId: JsonField<String>) = apply { this.invoiceId = invoiceId }

        /**
         * The products which these credits will be applied to. (If unspecified, the credits will be
         * applied to charges for all products.)
         */
        fun products(products: List<Product>) = products(JsonField.of(products))

        /**
         * The products which these credits will be applied to. (If unspecified, the credits will be
         * applied to charges for all products.)
         */
        fun products(products: JsonField<List<Product>>) = apply {
            this.products = products.map { it.toMutableList() }
        }

        /**
         * The products which these credits will be applied to. (If unspecified, the credits will be
         * applied to charges for all products.)
         */
        fun addProduct(product: Product) = apply {
            products =
                (products ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(product)
                }
        }

        fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

        fun reason(reason: Optional<String>) = reason(reason.orElse(null))

        fun reason(reason: JsonField<String>) = apply { this.reason = reason }

        /**
         * Prevents the creation of duplicates. If a request to create a record is made with a
         * previously used uniqueness key, a new record will not be created and the request will
         * fail with a 409 error.
         */
        fun uniquenessKey(uniquenessKey: String?) =
            uniquenessKey(JsonField.ofNullable(uniquenessKey))

        /**
         * Prevents the creation of duplicates. If a request to create a record is made with a
         * previously used uniqueness key, a new record will not be created and the request will
         * fail with a 409 error.
         */
        fun uniquenessKey(uniquenessKey: Optional<String>) =
            uniquenessKey(uniquenessKey.orElse(null))

        /**
         * Prevents the creation of duplicates. If a request to create a record is made with a
         * previously used uniqueness key, a new record will not be created and the request will
         * fail with a 409 error.
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

        fun build(): CreditGrantListResponse =
            CreditGrantListResponse(
                checkNotNull(id) { "`id` is required but was not set" },
                checkNotNull(balance) { "`balance` is required but was not set" },
                checkNotNull(customFields) { "`customFields` is required but was not set" },
                checkNotNull(customerId) { "`customerId` is required but was not set" },
                checkNotNull(deductions) { "`deductions` is required but was not set" }
                    .map { it.toImmutable() },
                checkNotNull(effectiveAt) { "`effectiveAt` is required but was not set" },
                checkNotNull(expiresAt) { "`expiresAt` is required but was not set" },
                checkNotNull(grantAmount) { "`grantAmount` is required but was not set" },
                checkNotNull(name) { "`name` is required but was not set" },
                checkNotNull(paidAmount) { "`paidAmount` is required but was not set" },
                checkNotNull(pendingDeductions) {
                        "`pendingDeductions` is required but was not set"
                    }
                    .map { it.toImmutable() },
                checkNotNull(priority) { "`priority` is required but was not set" },
                creditGrantType,
                invoiceId,
                (products ?: JsonMissing.of()).map { it.toImmutable() },
                reason,
                uniquenessKey,
                additionalProperties.toImmutable(),
            )
    }

    /**
     * The effective balance of the grant as of the end of the customer's current billing period.
     * Expiration deductions will be included only if the grant expires before the end of the
     * current billing period.
     */
    @NoAutoDetect
    class Balance
    @JsonCreator
    private constructor(
        @JsonProperty("effective_at")
        @ExcludeMissing
        private val effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("excluding_pending")
        @ExcludeMissing
        private val excludingPending: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("including_pending")
        @ExcludeMissing
        private val includingPending: JsonField<Double> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The end_date of the customer's current billing period. */
        fun effectiveAt(): OffsetDateTime = effectiveAt.getRequired("effective_at")

        /**
         * The grant's current balance including all posted deductions. If the grant has expired,
         * this amount will be 0.
         */
        fun excludingPending(): Double = excludingPending.getRequired("excluding_pending")

        /**
         * The grant's current balance including all posted and pending deductions. If the grant
         * expires before the end of the customer's current billing period, this amount will be 0.
         */
        fun includingPending(): Double = includingPending.getRequired("including_pending")

        /** The end_date of the customer's current billing period. */
        @JsonProperty("effective_at")
        @ExcludeMissing
        fun _effectiveAt(): JsonField<OffsetDateTime> = effectiveAt

        /**
         * The grant's current balance including all posted deductions. If the grant has expired,
         * this amount will be 0.
         */
        @JsonProperty("excluding_pending")
        @ExcludeMissing
        fun _excludingPending(): JsonField<Double> = excludingPending

        /**
         * The grant's current balance including all posted and pending deductions. If the grant
         * expires before the end of the customer's current billing period, this amount will be 0.
         */
        @JsonProperty("including_pending")
        @ExcludeMissing
        fun _includingPending(): JsonField<Double> = includingPending

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

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

            /** The end_date of the customer's current billing period. */
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
             * The grant's current balance including all posted deductions. If the grant has
             * expired, this amount will be 0.
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
             * The grant's current balance including all posted and pending deductions. If the grant
             * expires before the end of the customer's current billing period, this amount will
             * be 0.
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

            fun build(): Balance =
                Balance(
                    checkNotNull(effectiveAt) { "`effectiveAt` is required but was not set" },
                    checkNotNull(excludingPending) {
                        "`excludingPending` is required but was not set"
                    },
                    checkNotNull(includingPending) {
                        "`includingPending` is required but was not set"
                    },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Balance && effectiveAt == other.effectiveAt && excludingPending == other.excludingPending && includingPending == other.includingPending && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(effectiveAt, excludingPending, includingPending, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Balance{effectiveAt=$effectiveAt, excludingPending=$excludingPending, includingPending=$includingPending, additionalProperties=$additionalProperties}"
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

    /** the amount of credits initially granted */
    @NoAutoDetect
    class GrantAmount
    @JsonCreator
    private constructor(
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("credit_type")
        @ExcludeMissing
        private val creditType: JsonField<CreditTypeData> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun amount(): Double = amount.getRequired("amount")

        /** the credit type for the amount granted */
        fun creditType(): CreditTypeData = creditType.getRequired("credit_type")

        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

        /** the credit type for the amount granted */
        @JsonProperty("credit_type")
        @ExcludeMissing
        fun _creditType(): JsonField<CreditTypeData> = creditType

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): GrantAmount = apply {
            if (validated) {
                return@apply
            }

            amount()
            creditType().validate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

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

            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            /** the credit type for the amount granted */
            fun creditType(creditType: CreditTypeData) = creditType(JsonField.of(creditType))

            /** the credit type for the amount granted */
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

            fun build(): GrantAmount =
                GrantAmount(
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    checkNotNull(creditType) { "`creditType` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is GrantAmount && amount == other.amount && creditType == other.creditType && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, creditType, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "GrantAmount{amount=$amount, creditType=$creditType, additionalProperties=$additionalProperties}"
    }

    /** the amount paid for this credit grant */
    @NoAutoDetect
    class PaidAmount
    @JsonCreator
    private constructor(
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("credit_type")
        @ExcludeMissing
        private val creditType: JsonField<CreditTypeData> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun amount(): Double = amount.getRequired("amount")

        /** the credit type for the amount paid */
        fun creditType(): CreditTypeData = creditType.getRequired("credit_type")

        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

        /** the credit type for the amount paid */
        @JsonProperty("credit_type")
        @ExcludeMissing
        fun _creditType(): JsonField<CreditTypeData> = creditType

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): PaidAmount = apply {
            if (validated) {
                return@apply
            }

            amount()
            creditType().validate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

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

            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            /** the credit type for the amount paid */
            fun creditType(creditType: CreditTypeData) = creditType(JsonField.of(creditType))

            /** the credit type for the amount paid */
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

            fun build(): PaidAmount =
                PaidAmount(
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    checkNotNull(creditType) { "`creditType` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PaidAmount && amount == other.amount && creditType == other.creditType && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, creditType, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PaidAmount{amount=$amount, creditType=$creditType, additionalProperties=$additionalProperties}"
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

        class Builder {

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
                    checkNotNull(id) { "`id` is required but was not set" },
                    checkNotNull(name) { "`name` is required but was not set" },
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CreditGrantListResponse && id == other.id && balance == other.balance && customFields == other.customFields && customerId == other.customerId && deductions == other.deductions && effectiveAt == other.effectiveAt && expiresAt == other.expiresAt && grantAmount == other.grantAmount && name == other.name && paidAmount == other.paidAmount && pendingDeductions == other.pendingDeductions && priority == other.priority && creditGrantType == other.creditGrantType && invoiceId == other.invoiceId && products == other.products && reason == other.reason && uniquenessKey == other.uniquenessKey && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, balance, customFields, customerId, deductions, effectiveAt, expiresAt, grantAmount, name, paidAmount, pendingDeductions, priority, creditGrantType, invoiceId, products, reason, uniquenessKey, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CreditGrantListResponse{id=$id, balance=$balance, customFields=$customFields, customerId=$customerId, deductions=$deductions, effectiveAt=$effectiveAt, expiresAt=$expiresAt, grantAmount=$grantAmount, name=$name, paidAmount=$paidAmount, pendingDeductions=$pendingDeductions, priority=$priority, creditGrantType=$creditGrantType, invoiceId=$invoiceId, products=$products, reason=$reason, uniquenessKey=$uniquenessKey, additionalProperties=$additionalProperties}"
}
