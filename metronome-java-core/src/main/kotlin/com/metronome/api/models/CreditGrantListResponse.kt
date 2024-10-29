// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.toUnmodifiable
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = CreditGrantListResponse.Builder::class)
@NoAutoDetect
class CreditGrantListResponse
private constructor(
    private val id: JsonField<String>,
    private val name: JsonField<String>,
    private val customerId: JsonField<String>,
    private val invoiceId: JsonField<String>,
    private val uniquenessKey: JsonField<String>,
    private val reason: JsonField<String>,
    private val creditGrantType: JsonField<String>,
    private val effectiveAt: JsonField<OffsetDateTime>,
    private val expiresAt: JsonField<OffsetDateTime>,
    private val priority: JsonField<Double>,
    private val grantAmount: JsonField<GrantAmount>,
    private val paidAmount: JsonField<PaidAmount>,
    private val balance: JsonField<Balance>,
    private val deductions: JsonField<List<CreditLedgerEntry>>,
    private val pendingDeductions: JsonField<List<CreditLedgerEntry>>,
    private val products: JsonField<List<Product>>,
    private val customFields: JsonField<CustomFields>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** the Metronome ID of the credit grant */
    fun id(): String = id.getRequired("id")

    fun name(): String = name.getRequired("name")

    /** the Metronome ID of the customer */
    fun customerId(): String = customerId.getRequired("customer_id")

    /**
     * the Metronome ID of the invoice with the purchase charge for this credit grant, if applicable
     */
    fun invoiceId(): Optional<String> = Optional.ofNullable(invoiceId.getNullable("invoice_id"))

    /**
     * Prevents the creation of duplicates. If a request to create a record is made with a
     * previously used uniqueness key, a new record will not be created and the request will fail
     * with a 409 error.
     */
    fun uniquenessKey(): Optional<String> =
        Optional.ofNullable(uniquenessKey.getNullable("uniqueness_key"))

    fun reason(): Optional<String> = Optional.ofNullable(reason.getNullable("reason"))

    fun creditGrantType(): Optional<String> =
        Optional.ofNullable(creditGrantType.getNullable("credit_grant_type"))

    fun effectiveAt(): OffsetDateTime = effectiveAt.getRequired("effective_at")

    fun expiresAt(): OffsetDateTime = expiresAt.getRequired("expires_at")

    fun priority(): Double = priority.getRequired("priority")

    /** the amount of credits initially granted */
    fun grantAmount(): GrantAmount = grantAmount.getRequired("grant_amount")

    /** the amount paid for this credit grant */
    fun paidAmount(): PaidAmount = paidAmount.getRequired("paid_amount")

    /**
     * The effective balance of the grant as of the end of the customer's current billing period.
     * Expiration deductions will be included only if the grant expires before the end of the
     * current billing period.
     */
    fun balance(): Balance = balance.getRequired("balance")

    fun deductions(): List<CreditLedgerEntry> = deductions.getRequired("deductions")

    fun pendingDeductions(): List<CreditLedgerEntry> =
        pendingDeductions.getRequired("pending_deductions")

    /**
     * The products which these credits will be applied to. (If unspecified, the credits will be
     * applied to charges for all products.)
     */
    fun products(): Optional<List<Product>> = Optional.ofNullable(products.getNullable("products"))

    fun customFields(): CustomFields = customFields.getRequired("custom_fields")

    /** the Metronome ID of the credit grant */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("name") @ExcludeMissing fun _name() = name

    /** the Metronome ID of the customer */
    @JsonProperty("customer_id") @ExcludeMissing fun _customerId() = customerId

    /**
     * the Metronome ID of the invoice with the purchase charge for this credit grant, if applicable
     */
    @JsonProperty("invoice_id") @ExcludeMissing fun _invoiceId() = invoiceId

    /**
     * Prevents the creation of duplicates. If a request to create a record is made with a
     * previously used uniqueness key, a new record will not be created and the request will fail
     * with a 409 error.
     */
    @JsonProperty("uniqueness_key") @ExcludeMissing fun _uniquenessKey() = uniquenessKey

    @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

    @JsonProperty("credit_grant_type") @ExcludeMissing fun _creditGrantType() = creditGrantType

    @JsonProperty("effective_at") @ExcludeMissing fun _effectiveAt() = effectiveAt

    @JsonProperty("expires_at") @ExcludeMissing fun _expiresAt() = expiresAt

    @JsonProperty("priority") @ExcludeMissing fun _priority() = priority

    /** the amount of credits initially granted */
    @JsonProperty("grant_amount") @ExcludeMissing fun _grantAmount() = grantAmount

    /** the amount paid for this credit grant */
    @JsonProperty("paid_amount") @ExcludeMissing fun _paidAmount() = paidAmount

    /**
     * The effective balance of the grant as of the end of the customer's current billing period.
     * Expiration deductions will be included only if the grant expires before the end of the
     * current billing period.
     */
    @JsonProperty("balance") @ExcludeMissing fun _balance() = balance

    @JsonProperty("deductions") @ExcludeMissing fun _deductions() = deductions

    @JsonProperty("pending_deductions") @ExcludeMissing fun _pendingDeductions() = pendingDeductions

    /**
     * The products which these credits will be applied to. (If unspecified, the credits will be
     * applied to charges for all products.)
     */
    @JsonProperty("products") @ExcludeMissing fun _products() = products

    @JsonProperty("custom_fields") @ExcludeMissing fun _customFields() = customFields

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): CreditGrantListResponse = apply {
        if (!validated) {
            id()
            name()
            customerId()
            invoiceId()
            uniquenessKey()
            reason()
            creditGrantType()
            effectiveAt()
            expiresAt()
            priority()
            grantAmount().validate()
            paidAmount().validate()
            balance().validate()
            deductions().forEach { it.validate() }
            pendingDeductions().forEach { it.validate() }
            products().map { it.forEach { it.validate() } }
            customFields().validate()
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
        private var customerId: JsonField<String> = JsonMissing.of()
        private var invoiceId: JsonField<String> = JsonMissing.of()
        private var uniquenessKey: JsonField<String> = JsonMissing.of()
        private var reason: JsonField<String> = JsonMissing.of()
        private var creditGrantType: JsonField<String> = JsonMissing.of()
        private var effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var expiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var priority: JsonField<Double> = JsonMissing.of()
        private var grantAmount: JsonField<GrantAmount> = JsonMissing.of()
        private var paidAmount: JsonField<PaidAmount> = JsonMissing.of()
        private var balance: JsonField<Balance> = JsonMissing.of()
        private var deductions: JsonField<List<CreditLedgerEntry>> = JsonMissing.of()
        private var pendingDeductions: JsonField<List<CreditLedgerEntry>> = JsonMissing.of()
        private var products: JsonField<List<Product>> = JsonMissing.of()
        private var customFields: JsonField<CustomFields> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(creditGrantListResponse: CreditGrantListResponse) = apply {
            this.id = creditGrantListResponse.id
            this.name = creditGrantListResponse.name
            this.customerId = creditGrantListResponse.customerId
            this.invoiceId = creditGrantListResponse.invoiceId
            this.uniquenessKey = creditGrantListResponse.uniquenessKey
            this.reason = creditGrantListResponse.reason
            this.creditGrantType = creditGrantListResponse.creditGrantType
            this.effectiveAt = creditGrantListResponse.effectiveAt
            this.expiresAt = creditGrantListResponse.expiresAt
            this.priority = creditGrantListResponse.priority
            this.grantAmount = creditGrantListResponse.grantAmount
            this.paidAmount = creditGrantListResponse.paidAmount
            this.balance = creditGrantListResponse.balance
            this.deductions = creditGrantListResponse.deductions
            this.pendingDeductions = creditGrantListResponse.pendingDeductions
            this.products = creditGrantListResponse.products
            this.customFields = creditGrantListResponse.customFields
            additionalProperties(creditGrantListResponse.additionalProperties)
        }

        /** the Metronome ID of the credit grant */
        fun id(id: String) = id(JsonField.of(id))

        /** the Metronome ID of the credit grant */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        fun name(name: String) = name(JsonField.of(name))

        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** the Metronome ID of the customer */
        fun customerId(customerId: String) = customerId(JsonField.of(customerId))

        /** the Metronome ID of the customer */
        @JsonProperty("customer_id")
        @ExcludeMissing
        fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

        /**
         * the Metronome ID of the invoice with the purchase charge for this credit grant, if
         * applicable
         */
        fun invoiceId(invoiceId: String) = invoiceId(JsonField.of(invoiceId))

        /**
         * the Metronome ID of the invoice with the purchase charge for this credit grant, if
         * applicable
         */
        @JsonProperty("invoice_id")
        @ExcludeMissing
        fun invoiceId(invoiceId: JsonField<String>) = apply { this.invoiceId = invoiceId }

        /**
         * Prevents the creation of duplicates. If a request to create a record is made with a
         * previously used uniqueness key, a new record will not be created and the request will
         * fail with a 409 error.
         */
        fun uniquenessKey(uniquenessKey: String) = uniquenessKey(JsonField.of(uniquenessKey))

        /**
         * Prevents the creation of duplicates. If a request to create a record is made with a
         * previously used uniqueness key, a new record will not be created and the request will
         * fail with a 409 error.
         */
        @JsonProperty("uniqueness_key")
        @ExcludeMissing
        fun uniquenessKey(uniquenessKey: JsonField<String>) = apply {
            this.uniquenessKey = uniquenessKey
        }

        fun reason(reason: String) = reason(JsonField.of(reason))

        @JsonProperty("reason")
        @ExcludeMissing
        fun reason(reason: JsonField<String>) = apply { this.reason = reason }

        fun creditGrantType(creditGrantType: String) =
            creditGrantType(JsonField.of(creditGrantType))

        @JsonProperty("credit_grant_type")
        @ExcludeMissing
        fun creditGrantType(creditGrantType: JsonField<String>) = apply {
            this.creditGrantType = creditGrantType
        }

        fun effectiveAt(effectiveAt: OffsetDateTime) = effectiveAt(JsonField.of(effectiveAt))

        @JsonProperty("effective_at")
        @ExcludeMissing
        fun effectiveAt(effectiveAt: JsonField<OffsetDateTime>) = apply {
            this.effectiveAt = effectiveAt
        }

        fun expiresAt(expiresAt: OffsetDateTime) = expiresAt(JsonField.of(expiresAt))

        @JsonProperty("expires_at")
        @ExcludeMissing
        fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply { this.expiresAt = expiresAt }

        fun priority(priority: Double) = priority(JsonField.of(priority))

        @JsonProperty("priority")
        @ExcludeMissing
        fun priority(priority: JsonField<Double>) = apply { this.priority = priority }

        /** the amount of credits initially granted */
        fun grantAmount(grantAmount: GrantAmount) = grantAmount(JsonField.of(grantAmount))

        /** the amount of credits initially granted */
        @JsonProperty("grant_amount")
        @ExcludeMissing
        fun grantAmount(grantAmount: JsonField<GrantAmount>) = apply {
            this.grantAmount = grantAmount
        }

        /** the amount paid for this credit grant */
        fun paidAmount(paidAmount: PaidAmount) = paidAmount(JsonField.of(paidAmount))

        /** the amount paid for this credit grant */
        @JsonProperty("paid_amount")
        @ExcludeMissing
        fun paidAmount(paidAmount: JsonField<PaidAmount>) = apply { this.paidAmount = paidAmount }

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
        @JsonProperty("balance")
        @ExcludeMissing
        fun balance(balance: JsonField<Balance>) = apply { this.balance = balance }

        fun deductions(deductions: List<CreditLedgerEntry>) = deductions(JsonField.of(deductions))

        @JsonProperty("deductions")
        @ExcludeMissing
        fun deductions(deductions: JsonField<List<CreditLedgerEntry>>) = apply {
            this.deductions = deductions
        }

        fun pendingDeductions(pendingDeductions: List<CreditLedgerEntry>) =
            pendingDeductions(JsonField.of(pendingDeductions))

        @JsonProperty("pending_deductions")
        @ExcludeMissing
        fun pendingDeductions(pendingDeductions: JsonField<List<CreditLedgerEntry>>) = apply {
            this.pendingDeductions = pendingDeductions
        }

        /**
         * The products which these credits will be applied to. (If unspecified, the credits will be
         * applied to charges for all products.)
         */
        fun products(products: List<Product>) = products(JsonField.of(products))

        /**
         * The products which these credits will be applied to. (If unspecified, the credits will be
         * applied to charges for all products.)
         */
        @JsonProperty("products")
        @ExcludeMissing
        fun products(products: JsonField<List<Product>>) = apply { this.products = products }

        fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

        @JsonProperty("custom_fields")
        @ExcludeMissing
        fun customFields(customFields: JsonField<CustomFields>) = apply {
            this.customFields = customFields
        }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): CreditGrantListResponse =
            CreditGrantListResponse(
                id,
                name,
                customerId,
                invoiceId,
                uniquenessKey,
                reason,
                creditGrantType,
                effectiveAt,
                expiresAt,
                priority,
                grantAmount,
                paidAmount,
                balance,
                deductions.map { it.toUnmodifiable() },
                pendingDeductions.map { it.toUnmodifiable() },
                products.map { it.toUnmodifiable() },
                customFields,
                additionalProperties.toUnmodifiable(),
            )
    }

    /**
     * The effective balance of the grant as of the end of the customer's current billing period.
     * Expiration deductions will be included only if the grant expires before the end of the
     * current billing period.
     */
    @JsonDeserialize(builder = Balance.Builder::class)
    @NoAutoDetect
    class Balance
    private constructor(
        private val excludingPending: JsonField<Double>,
        private val includingPending: JsonField<Double>,
        private val effectiveAt: JsonField<OffsetDateTime>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

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
        fun effectiveAt(): OffsetDateTime = effectiveAt.getRequired("effective_at")

        /**
         * The grant's current balance including all posted deductions. If the grant has expired,
         * this amount will be 0.
         */
        @JsonProperty("excluding_pending")
        @ExcludeMissing
        fun _excludingPending() = excludingPending

        /**
         * The grant's current balance including all posted and pending deductions. If the grant
         * expires before the end of the customer's current billing period, this amount will be 0.
         */
        @JsonProperty("including_pending")
        @ExcludeMissing
        fun _includingPending() = includingPending

        /** The end_date of the customer's current billing period. */
        @JsonProperty("effective_at") @ExcludeMissing fun _effectiveAt() = effectiveAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Balance = apply {
            if (!validated) {
                excludingPending()
                includingPending()
                effectiveAt()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var excludingPending: JsonField<Double> = JsonMissing.of()
            private var includingPending: JsonField<Double> = JsonMissing.of()
            private var effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(balance: Balance) = apply {
                this.excludingPending = balance.excludingPending
                this.includingPending = balance.includingPending
                this.effectiveAt = balance.effectiveAt
                additionalProperties(balance.additionalProperties)
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
            @JsonProperty("excluding_pending")
            @ExcludeMissing
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
            @JsonProperty("including_pending")
            @ExcludeMissing
            fun includingPending(includingPending: JsonField<Double>) = apply {
                this.includingPending = includingPending
            }

            /** The end_date of the customer's current billing period. */
            fun effectiveAt(effectiveAt: OffsetDateTime) = effectiveAt(JsonField.of(effectiveAt))

            /** The end_date of the customer's current billing period. */
            @JsonProperty("effective_at")
            @ExcludeMissing
            fun effectiveAt(effectiveAt: JsonField<OffsetDateTime>) = apply {
                this.effectiveAt = effectiveAt
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Balance =
                Balance(
                    excludingPending,
                    includingPending,
                    effectiveAt,
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Balance && this.excludingPending == other.excludingPending && this.includingPending == other.includingPending && this.effectiveAt == other.effectiveAt && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(excludingPending, includingPending, effectiveAt, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "Balance{excludingPending=$excludingPending, includingPending=$includingPending, effectiveAt=$effectiveAt, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = CustomFields.Builder::class)
    @NoAutoDetect
    class CustomFields
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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
                additionalProperties(customFields.additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): CustomFields = CustomFields(additionalProperties.toUnmodifiable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CustomFields && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"
    }

    /** the amount of credits initially granted */
    @JsonDeserialize(builder = GrantAmount.Builder::class)
    @NoAutoDetect
    class GrantAmount
    private constructor(
        private val amount: JsonField<Double>,
        private val creditType: JsonField<CreditTypeData>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun amount(): Double = amount.getRequired("amount")

        /** the credit type for the amount granted */
        fun creditType(): CreditTypeData = creditType.getRequired("credit_type")

        @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

        /** the credit type for the amount granted */
        @JsonProperty("credit_type") @ExcludeMissing fun _creditType() = creditType

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): GrantAmount = apply {
            if (!validated) {
                amount()
                creditType().validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var amount: JsonField<Double> = JsonMissing.of()
            private var creditType: JsonField<CreditTypeData> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(grantAmount: GrantAmount) = apply {
                this.amount = grantAmount.amount
                this.creditType = grantAmount.creditType
                additionalProperties(grantAmount.additionalProperties)
            }

            fun amount(amount: Double) = amount(JsonField.of(amount))

            @JsonProperty("amount")
            @ExcludeMissing
            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            /** the credit type for the amount granted */
            fun creditType(creditType: CreditTypeData) = creditType(JsonField.of(creditType))

            /** the credit type for the amount granted */
            @JsonProperty("credit_type")
            @ExcludeMissing
            fun creditType(creditType: JsonField<CreditTypeData>) = apply {
                this.creditType = creditType
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): GrantAmount =
                GrantAmount(
                    amount,
                    creditType,
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is GrantAmount && this.amount == other.amount && this.creditType == other.creditType && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(amount, creditType, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "GrantAmount{amount=$amount, creditType=$creditType, additionalProperties=$additionalProperties}"
    }

    /** the amount paid for this credit grant */
    @JsonDeserialize(builder = PaidAmount.Builder::class)
    @NoAutoDetect
    class PaidAmount
    private constructor(
        private val amount: JsonField<Double>,
        private val creditType: JsonField<CreditTypeData>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun amount(): Double = amount.getRequired("amount")

        /** the credit type for the amount paid */
        fun creditType(): CreditTypeData = creditType.getRequired("credit_type")

        @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

        /** the credit type for the amount paid */
        @JsonProperty("credit_type") @ExcludeMissing fun _creditType() = creditType

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): PaidAmount = apply {
            if (!validated) {
                amount()
                creditType().validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var amount: JsonField<Double> = JsonMissing.of()
            private var creditType: JsonField<CreditTypeData> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(paidAmount: PaidAmount) = apply {
                this.amount = paidAmount.amount
                this.creditType = paidAmount.creditType
                additionalProperties(paidAmount.additionalProperties)
            }

            fun amount(amount: Double) = amount(JsonField.of(amount))

            @JsonProperty("amount")
            @ExcludeMissing
            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            /** the credit type for the amount paid */
            fun creditType(creditType: CreditTypeData) = creditType(JsonField.of(creditType))

            /** the credit type for the amount paid */
            @JsonProperty("credit_type")
            @ExcludeMissing
            fun creditType(creditType: JsonField<CreditTypeData>) = apply {
                this.creditType = creditType
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): PaidAmount =
                PaidAmount(
                    amount,
                    creditType,
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PaidAmount && this.amount == other.amount && this.creditType == other.creditType && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(amount, creditType, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "PaidAmount{amount=$amount, creditType=$creditType, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = Product.Builder::class)
    @NoAutoDetect
    class Product
    private constructor(
        private val id: JsonField<String>,
        private val name: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun id(): String = id.getRequired("id")

        fun name(): String = name.getRequired("name")

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("name") @ExcludeMissing fun _name() = name

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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
                this.id = product.id
                this.name = product.name
                additionalProperties(product.additionalProperties)
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
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Product =
                Product(
                    id,
                    name,
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Product && this.id == other.id && this.name == other.name && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(id, name, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "Product{id=$id, name=$name, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CreditGrantListResponse && this.id == other.id && this.name == other.name && this.customerId == other.customerId && this.invoiceId == other.invoiceId && this.uniquenessKey == other.uniquenessKey && this.reason == other.reason && this.creditGrantType == other.creditGrantType && this.effectiveAt == other.effectiveAt && this.expiresAt == other.expiresAt && this.priority == other.priority && this.grantAmount == other.grantAmount && this.paidAmount == other.paidAmount && this.balance == other.balance && this.deductions == other.deductions && this.pendingDeductions == other.pendingDeductions && this.products == other.products && this.customFields == other.customFields && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(id, name, customerId, invoiceId, uniquenessKey, reason, creditGrantType, effectiveAt, expiresAt, priority, grantAmount, paidAmount, balance, deductions, pendingDeductions, products, customFields, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "CreditGrantListResponse{id=$id, name=$name, customerId=$customerId, invoiceId=$invoiceId, uniquenessKey=$uniquenessKey, reason=$reason, creditGrantType=$creditGrantType, effectiveAt=$effectiveAt, expiresAt=$expiresAt, priority=$priority, grantAmount=$grantAmount, paidAmount=$paidAmount, balance=$balance, deductions=$deductions, pendingDeductions=$pendingDeductions, products=$products, customFields=$customFields, additionalProperties=$additionalProperties}"
}
