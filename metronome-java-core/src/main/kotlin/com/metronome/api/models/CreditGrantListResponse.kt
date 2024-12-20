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
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("customer_id")
    @ExcludeMissing
    private val customerId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("invoice_id")
    @ExcludeMissing
    private val invoiceId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("uniqueness_key")
    @ExcludeMissing
    private val uniquenessKey: JsonField<String> = JsonMissing.of(),
    @JsonProperty("reason")
    @ExcludeMissing
    private val reason: JsonField<String> = JsonMissing.of(),
    @JsonProperty("credit_grant_type")
    @ExcludeMissing
    private val creditGrantType: JsonField<String> = JsonMissing.of(),
    @JsonProperty("effective_at")
    @ExcludeMissing
    private val effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("expires_at")
    @ExcludeMissing
    private val expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("priority")
    @ExcludeMissing
    private val priority: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("grant_amount")
    @ExcludeMissing
    private val grantAmount: JsonField<GrantAmount> = JsonMissing.of(),
    @JsonProperty("paid_amount")
    @ExcludeMissing
    private val paidAmount: JsonField<PaidAmount> = JsonMissing.of(),
    @JsonProperty("balance")
    @ExcludeMissing
    private val balance: JsonField<Balance> = JsonMissing.of(),
    @JsonProperty("deductions")
    @ExcludeMissing
    private val deductions: JsonField<List<CreditLedgerEntry>> = JsonMissing.of(),
    @JsonProperty("pending_deductions")
    @ExcludeMissing
    private val pendingDeductions: JsonField<List<CreditLedgerEntry>> = JsonMissing.of(),
    @JsonProperty("products")
    @ExcludeMissing
    private val products: JsonField<List<Product>> = JsonMissing.of(),
    @JsonProperty("custom_fields")
    @ExcludeMissing
    private val customFields: JsonField<CustomFields> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

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

    private var validated: Boolean = false

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
            id = creditGrantListResponse.id
            name = creditGrantListResponse.name
            customerId = creditGrantListResponse.customerId
            invoiceId = creditGrantListResponse.invoiceId
            uniquenessKey = creditGrantListResponse.uniquenessKey
            reason = creditGrantListResponse.reason
            creditGrantType = creditGrantListResponse.creditGrantType
            effectiveAt = creditGrantListResponse.effectiveAt
            expiresAt = creditGrantListResponse.expiresAt
            priority = creditGrantListResponse.priority
            grantAmount = creditGrantListResponse.grantAmount
            paidAmount = creditGrantListResponse.paidAmount
            balance = creditGrantListResponse.balance
            deductions = creditGrantListResponse.deductions
            pendingDeductions = creditGrantListResponse.pendingDeductions
            products = creditGrantListResponse.products
            customFields = creditGrantListResponse.customFields
            additionalProperties = creditGrantListResponse.additionalProperties.toMutableMap()
        }

        /** the Metronome ID of the credit grant */
        fun id(id: String) = id(JsonField.of(id))

        /** the Metronome ID of the credit grant */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun name(name: String) = name(JsonField.of(name))

        fun name(name: JsonField<String>) = apply { this.name = name }

        /** the Metronome ID of the customer */
        fun customerId(customerId: String) = customerId(JsonField.of(customerId))

        /** the Metronome ID of the customer */
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
        fun uniquenessKey(uniquenessKey: JsonField<String>) = apply {
            this.uniquenessKey = uniquenessKey
        }

        fun reason(reason: String) = reason(JsonField.of(reason))

        fun reason(reason: JsonField<String>) = apply { this.reason = reason }

        fun creditGrantType(creditGrantType: String) =
            creditGrantType(JsonField.of(creditGrantType))

        fun creditGrantType(creditGrantType: JsonField<String>) = apply {
            this.creditGrantType = creditGrantType
        }

        fun effectiveAt(effectiveAt: OffsetDateTime) = effectiveAt(JsonField.of(effectiveAt))

        fun effectiveAt(effectiveAt: JsonField<OffsetDateTime>) = apply {
            this.effectiveAt = effectiveAt
        }

        fun expiresAt(expiresAt: OffsetDateTime) = expiresAt(JsonField.of(expiresAt))

        fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply { this.expiresAt = expiresAt }

        fun priority(priority: Double) = priority(JsonField.of(priority))

        fun priority(priority: JsonField<Double>) = apply { this.priority = priority }

        /** the amount of credits initially granted */
        fun grantAmount(grantAmount: GrantAmount) = grantAmount(JsonField.of(grantAmount))

        /** the amount of credits initially granted */
        fun grantAmount(grantAmount: JsonField<GrantAmount>) = apply {
            this.grantAmount = grantAmount
        }

        /** the amount paid for this credit grant */
        fun paidAmount(paidAmount: PaidAmount) = paidAmount(JsonField.of(paidAmount))

        /** the amount paid for this credit grant */
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
        fun balance(balance: JsonField<Balance>) = apply { this.balance = balance }

        fun deductions(deductions: List<CreditLedgerEntry>) = deductions(JsonField.of(deductions))

        fun deductions(deductions: JsonField<List<CreditLedgerEntry>>) = apply {
            this.deductions = deductions
        }

        fun pendingDeductions(pendingDeductions: List<CreditLedgerEntry>) =
            pendingDeductions(JsonField.of(pendingDeductions))

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
        fun products(products: JsonField<List<Product>>) = apply { this.products = products }

        fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

        fun customFields(customFields: JsonField<CustomFields>) = apply {
            this.customFields = customFields
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
                deductions.map { it.toImmutable() },
                pendingDeductions.map { it.toImmutable() },
                products.map { it.toImmutable() },
                customFields,
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
        @JsonProperty("excluding_pending")
        @ExcludeMissing
        private val excludingPending: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("including_pending")
        @ExcludeMissing
        private val includingPending: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("effective_at")
        @ExcludeMissing
        private val effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

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

        private var validated: Boolean = false

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
                excludingPending = balance.excludingPending
                includingPending = balance.includingPending
                effectiveAt = balance.effectiveAt
                additionalProperties = balance.additionalProperties.toMutableMap()
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

            /** The end_date of the customer's current billing period. */
            fun effectiveAt(effectiveAt: OffsetDateTime) = effectiveAt(JsonField.of(effectiveAt))

            /** The end_date of the customer's current billing period. */
            fun effectiveAt(effectiveAt: JsonField<OffsetDateTime>) = apply {
                this.effectiveAt = effectiveAt
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
                    excludingPending,
                    includingPending,
                    effectiveAt,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Balance && excludingPending == other.excludingPending && includingPending == other.includingPending && effectiveAt == other.effectiveAt && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(excludingPending, includingPending, effectiveAt, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Balance{excludingPending=$excludingPending, includingPending=$includingPending, effectiveAt=$effectiveAt, additionalProperties=$additionalProperties}"
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

        @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

        /** the credit type for the amount granted */
        @JsonProperty("credit_type") @ExcludeMissing fun _creditType() = creditType

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

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
                    amount,
                    creditType,
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

        @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

        /** the credit type for the amount paid */
        @JsonProperty("credit_type") @ExcludeMissing fun _creditType() = creditType

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

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
                    amount,
                    creditType,
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

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("name") @ExcludeMissing fun _name() = name

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

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
                    id,
                    name,
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

        return /* spotless:off */ other is CreditGrantListResponse && id == other.id && name == other.name && customerId == other.customerId && invoiceId == other.invoiceId && uniquenessKey == other.uniquenessKey && reason == other.reason && creditGrantType == other.creditGrantType && effectiveAt == other.effectiveAt && expiresAt == other.expiresAt && priority == other.priority && grantAmount == other.grantAmount && paidAmount == other.paidAmount && balance == other.balance && deductions == other.deductions && pendingDeductions == other.pendingDeductions && products == other.products && customFields == other.customFields && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, name, customerId, invoiceId, uniquenessKey, reason, creditGrantType, effectiveAt, expiresAt, priority, grantAmount, paidAmount, balance, deductions, pendingDeductions, products, customFields, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CreditGrantListResponse{id=$id, name=$name, customerId=$customerId, invoiceId=$invoiceId, uniquenessKey=$uniquenessKey, reason=$reason, creditGrantType=$creditGrantType, effectiveAt=$effectiveAt, expiresAt=$expiresAt, priority=$priority, grantAmount=$grantAmount, paidAmount=$paidAmount, balance=$balance, deductions=$deductions, pendingDeductions=$pendingDeductions, products=$products, customFields=$customFields, additionalProperties=$additionalProperties}"
}
