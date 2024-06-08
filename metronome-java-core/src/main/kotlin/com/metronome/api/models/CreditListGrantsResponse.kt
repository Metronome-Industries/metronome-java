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

@JsonDeserialize(builder = CreditListGrantsResponse.Builder::class)
@NoAutoDetect
class CreditListGrantsResponse
private constructor(
    private val data: JsonField<List<Data>>,
    private val nextPage: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun data(): List<Data> = data.getRequired("data")

    fun nextPage(): Optional<String> = Optional.ofNullable(nextPage.getNullable("next_page"))

    @JsonProperty("data") @ExcludeMissing fun _data() = data

    @JsonProperty("next_page") @ExcludeMissing fun _nextPage() = nextPage

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): CreditListGrantsResponse = apply {
        if (!validated) {
            data().forEach { it.validate() }
            nextPage()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CreditListGrantsResponse &&
            this.data == other.data &&
            this.nextPage == other.nextPage &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    data,
                    nextPage,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "CreditListGrantsResponse{data=$data, nextPage=$nextPage, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var data: JsonField<List<Data>> = JsonMissing.of()
        private var nextPage: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(creditListGrantsResponse: CreditListGrantsResponse) = apply {
            this.data = creditListGrantsResponse.data
            this.nextPage = creditListGrantsResponse.nextPage
            additionalProperties(creditListGrantsResponse.additionalProperties)
        }

        fun data(data: List<Data>) = data(JsonField.of(data))

        @JsonProperty("data")
        @ExcludeMissing
        fun data(data: JsonField<List<Data>>) = apply { this.data = data }

        fun nextPage(nextPage: String) = nextPage(JsonField.of(nextPage))

        @JsonProperty("next_page")
        @ExcludeMissing
        fun nextPage(nextPage: JsonField<String>) = apply { this.nextPage = nextPage }

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

        fun build(): CreditListGrantsResponse =
            CreditListGrantsResponse(
                data.map { it.toUnmodifiable() },
                nextPage,
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = Data.Builder::class)
    @NoAutoDetect
    class Data
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
        private val deductions: JsonField<List<Deduction>>,
        private val pendingDeductions: JsonField<List<PendingDeduction>>,
        private val products: JsonField<List<Product>>,
        private val customFields: JsonField<CustomFields>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** the Metronome ID of the credit grant */
        fun id(): String = id.getRequired("id")

        fun name(): String = name.getRequired("name")

        /** the Metronome ID of the customer */
        fun customerId(): String = customerId.getRequired("customer_id")

        /**
         * the Metronome ID of the invoice with the purchase charge for this credit grant, if
         * applicable
         */
        fun invoiceId(): Optional<String> = Optional.ofNullable(invoiceId.getNullable("invoice_id"))

        /**
         * Prevents the creation of duplicates. If a request to create a record is made with a
         * previously used uniqueness key, a new record will not be created and the request will
         * fail with a 409 error.
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
         * The effective balance of the grant as of the end of the customer's current billing
         * period. Expiration deductions will be included only if the grant expires before the end
         * of the current billing period.
         */
        fun balance(): Balance = balance.getRequired("balance")

        fun deductions(): List<Deduction> = deductions.getRequired("deductions")

        fun pendingDeductions(): List<PendingDeduction> =
            pendingDeductions.getRequired("pending_deductions")

        /**
         * The products which these credits will be applied to. (If unspecified, the credits will be
         * applied to charges for all products.)
         */
        fun products(): Optional<List<Product>> =
            Optional.ofNullable(products.getNullable("products"))

        fun customFields(): CustomFields = customFields.getRequired("custom_fields")

        /** the Metronome ID of the credit grant */
        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("name") @ExcludeMissing fun _name() = name

        /** the Metronome ID of the customer */
        @JsonProperty("customer_id") @ExcludeMissing fun _customerId() = customerId

        /**
         * the Metronome ID of the invoice with the purchase charge for this credit grant, if
         * applicable
         */
        @JsonProperty("invoice_id") @ExcludeMissing fun _invoiceId() = invoiceId

        /**
         * Prevents the creation of duplicates. If a request to create a record is made with a
         * previously used uniqueness key, a new record will not be created and the request will
         * fail with a 409 error.
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
         * The effective balance of the grant as of the end of the customer's current billing
         * period. Expiration deductions will be included only if the grant expires before the end
         * of the current billing period.
         */
        @JsonProperty("balance") @ExcludeMissing fun _balance() = balance

        @JsonProperty("deductions") @ExcludeMissing fun _deductions() = deductions

        @JsonProperty("pending_deductions")
        @ExcludeMissing
        fun _pendingDeductions() = pendingDeductions

        /**
         * The products which these credits will be applied to. (If unspecified, the credits will be
         * applied to charges for all products.)
         */
        @JsonProperty("products") @ExcludeMissing fun _products() = products

        @JsonProperty("custom_fields") @ExcludeMissing fun _customFields() = customFields

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Data = apply {
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                this.id == other.id &&
                this.name == other.name &&
                this.customerId == other.customerId &&
                this.invoiceId == other.invoiceId &&
                this.uniquenessKey == other.uniquenessKey &&
                this.reason == other.reason &&
                this.creditGrantType == other.creditGrantType &&
                this.effectiveAt == other.effectiveAt &&
                this.expiresAt == other.expiresAt &&
                this.priority == other.priority &&
                this.grantAmount == other.grantAmount &&
                this.paidAmount == other.paidAmount &&
                this.balance == other.balance &&
                this.deductions == other.deductions &&
                this.pendingDeductions == other.pendingDeductions &&
                this.products == other.products &&
                this.customFields == other.customFields &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
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
                        deductions,
                        pendingDeductions,
                        products,
                        customFields,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Data{id=$id, name=$name, customerId=$customerId, invoiceId=$invoiceId, uniquenessKey=$uniquenessKey, reason=$reason, creditGrantType=$creditGrantType, effectiveAt=$effectiveAt, expiresAt=$expiresAt, priority=$priority, grantAmount=$grantAmount, paidAmount=$paidAmount, balance=$balance, deductions=$deductions, pendingDeductions=$pendingDeductions, products=$products, customFields=$customFields, additionalProperties=$additionalProperties}"

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
            private var deductions: JsonField<List<Deduction>> = JsonMissing.of()
            private var pendingDeductions: JsonField<List<PendingDeduction>> = JsonMissing.of()
            private var products: JsonField<List<Product>> = JsonMissing.of()
            private var customFields: JsonField<CustomFields> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                this.id = data.id
                this.name = data.name
                this.customerId = data.customerId
                this.invoiceId = data.invoiceId
                this.uniquenessKey = data.uniquenessKey
                this.reason = data.reason
                this.creditGrantType = data.creditGrantType
                this.effectiveAt = data.effectiveAt
                this.expiresAt = data.expiresAt
                this.priority = data.priority
                this.grantAmount = data.grantAmount
                this.paidAmount = data.paidAmount
                this.balance = data.balance
                this.deductions = data.deductions
                this.pendingDeductions = data.pendingDeductions
                this.products = data.products
                this.customFields = data.customFields
                additionalProperties(data.additionalProperties)
            }

            /** the Metronome ID of the credit grant */
            fun id(id: String) = id(JsonField.of(id))

            /** the Metronome ID of the credit grant */
            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

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
            fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply {
                this.expiresAt = expiresAt
            }

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
            fun paidAmount(paidAmount: JsonField<PaidAmount>) = apply {
                this.paidAmount = paidAmount
            }

            /**
             * The effective balance of the grant as of the end of the customer's current billing
             * period. Expiration deductions will be included only if the grant expires before the
             * end of the current billing period.
             */
            fun balance(balance: Balance) = balance(JsonField.of(balance))

            /**
             * The effective balance of the grant as of the end of the customer's current billing
             * period. Expiration deductions will be included only if the grant expires before the
             * end of the current billing period.
             */
            @JsonProperty("balance")
            @ExcludeMissing
            fun balance(balance: JsonField<Balance>) = apply { this.balance = balance }

            fun deductions(deductions: List<Deduction>) = deductions(JsonField.of(deductions))

            @JsonProperty("deductions")
            @ExcludeMissing
            fun deductions(deductions: JsonField<List<Deduction>>) = apply {
                this.deductions = deductions
            }

            fun pendingDeductions(pendingDeductions: List<PendingDeduction>) =
                pendingDeductions(JsonField.of(pendingDeductions))

            @JsonProperty("pending_deductions")
            @ExcludeMissing
            fun pendingDeductions(pendingDeductions: JsonField<List<PendingDeduction>>) = apply {
                this.pendingDeductions = pendingDeductions
            }

            /**
             * The products which these credits will be applied to. (If unspecified, the credits
             * will be applied to charges for all products.)
             */
            fun products(products: List<Product>) = products(JsonField.of(products))

            /**
             * The products which these credits will be applied to. (If unspecified, the credits
             * will be applied to charges for all products.)
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

            fun build(): Data =
                Data(
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
         * The effective balance of the grant as of the end of the customer's current billing
         * period. Expiration deductions will be included only if the grant expires before the end
         * of the current billing period.
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

            private var hashCode: Int = 0

            /**
             * The grant's current balance including all posted deductions. If the grant has
             * expired, this amount will be 0.
             */
            fun excludingPending(): Double = excludingPending.getRequired("excluding_pending")

            /**
             * The grant's current balance including all posted and pending deductions. If the grant
             * expires before the end of the customer's current billing period, this amount will
             * be 0.
             */
            fun includingPending(): Double = includingPending.getRequired("including_pending")

            /** The end_date of the customer's current billing period. */
            fun effectiveAt(): OffsetDateTime = effectiveAt.getRequired("effective_at")

            /**
             * The grant's current balance including all posted deductions. If the grant has
             * expired, this amount will be 0.
             */
            @JsonProperty("excluding_pending")
            @ExcludeMissing
            fun _excludingPending() = excludingPending

            /**
             * The grant's current balance including all posted and pending deductions. If the grant
             * expires before the end of the customer's current billing period, this amount will
             * be 0.
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Balance &&
                    this.excludingPending == other.excludingPending &&
                    this.includingPending == other.includingPending &&
                    this.effectiveAt == other.effectiveAt &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            excludingPending,
                            includingPending,
                            effectiveAt,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Balance{excludingPending=$excludingPending, includingPending=$includingPending, effectiveAt=$effectiveAt, additionalProperties=$additionalProperties}"

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
                 * The grant's current balance including all posted and pending deductions. If the
                 * grant expires before the end of the customer's current billing period, this
                 * amount will be 0.
                 */
                fun includingPending(includingPending: Double) =
                    includingPending(JsonField.of(includingPending))

                /**
                 * The grant's current balance including all posted and pending deductions. If the
                 * grant expires before the end of the customer's current billing period, this
                 * amount will be 0.
                 */
                @JsonProperty("including_pending")
                @ExcludeMissing
                fun includingPending(includingPending: JsonField<Double>) = apply {
                    this.includingPending = includingPending
                }

                /** The end_date of the customer's current billing period. */
                fun effectiveAt(effectiveAt: OffsetDateTime) =
                    effectiveAt(JsonField.of(effectiveAt))

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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
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
        }

        @JsonDeserialize(builder = CustomFields.Builder::class)
        @NoAutoDetect
        class CustomFields
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CustomFields = apply {
                if (!validated) {
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CustomFields &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(additionalProperties)
                }
                return hashCode
            }

            override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"

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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): CustomFields = CustomFields(additionalProperties.toUnmodifiable())
            }
        }

        @JsonDeserialize(builder = Deduction.Builder::class)
        @NoAutoDetect
        class Deduction
        private constructor(
            private val amount: JsonField<Double>,
            private val reason: JsonField<String>,
            private val runningBalance: JsonField<Double>,
            private val effectiveAt: JsonField<OffsetDateTime>,
            private val createdBy: JsonField<String>,
            private val creditGrantId: JsonField<String>,
            private val invoiceId: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** an amount representing the change to the customer's credit balance */
            fun amount(): Double = amount.getRequired("amount")

            fun reason(): String = reason.getRequired("reason")

            /**
             * the running balance for this credit type at the time of the ledger entry, including
             * all preceding charges
             */
            fun runningBalance(): Double = runningBalance.getRequired("running_balance")

            fun effectiveAt(): OffsetDateTime = effectiveAt.getRequired("effective_at")

            fun createdBy(): String = createdBy.getRequired("created_by")

            /** the credit grant this entry is related to */
            fun creditGrantId(): String = creditGrantId.getRequired("credit_grant_id")

            /**
             * if this entry is a deduction, the Metronome ID of the invoice where the credit
             * deduction was consumed; if this entry is a grant, the Metronome ID of the invoice
             * where the grant's paid_amount was charged
             */
            fun invoiceId(): Optional<String> =
                Optional.ofNullable(invoiceId.getNullable("invoice_id"))

            /** an amount representing the change to the customer's credit balance */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

            /**
             * the running balance for this credit type at the time of the ledger entry, including
             * all preceding charges
             */
            @JsonProperty("running_balance") @ExcludeMissing fun _runningBalance() = runningBalance

            @JsonProperty("effective_at") @ExcludeMissing fun _effectiveAt() = effectiveAt

            @JsonProperty("created_by") @ExcludeMissing fun _createdBy() = createdBy

            /** the credit grant this entry is related to */
            @JsonProperty("credit_grant_id") @ExcludeMissing fun _creditGrantId() = creditGrantId

            /**
             * if this entry is a deduction, the Metronome ID of the invoice where the credit
             * deduction was consumed; if this entry is a grant, the Metronome ID of the invoice
             * where the grant's paid_amount was charged
             */
            @JsonProperty("invoice_id") @ExcludeMissing fun _invoiceId() = invoiceId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Deduction = apply {
                if (!validated) {
                    amount()
                    reason()
                    runningBalance()
                    effectiveAt()
                    createdBy()
                    creditGrantId()
                    invoiceId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Deduction &&
                    this.amount == other.amount &&
                    this.reason == other.reason &&
                    this.runningBalance == other.runningBalance &&
                    this.effectiveAt == other.effectiveAt &&
                    this.createdBy == other.createdBy &&
                    this.creditGrantId == other.creditGrantId &&
                    this.invoiceId == other.invoiceId &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            amount,
                            reason,
                            runningBalance,
                            effectiveAt,
                            createdBy,
                            creditGrantId,
                            invoiceId,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Deduction{amount=$amount, reason=$reason, runningBalance=$runningBalance, effectiveAt=$effectiveAt, createdBy=$createdBy, creditGrantId=$creditGrantId, invoiceId=$invoiceId, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Double> = JsonMissing.of()
                private var reason: JsonField<String> = JsonMissing.of()
                private var runningBalance: JsonField<Double> = JsonMissing.of()
                private var effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var createdBy: JsonField<String> = JsonMissing.of()
                private var creditGrantId: JsonField<String> = JsonMissing.of()
                private var invoiceId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(deduction: Deduction) = apply {
                    this.amount = deduction.amount
                    this.reason = deduction.reason
                    this.runningBalance = deduction.runningBalance
                    this.effectiveAt = deduction.effectiveAt
                    this.createdBy = deduction.createdBy
                    this.creditGrantId = deduction.creditGrantId
                    this.invoiceId = deduction.invoiceId
                    additionalProperties(deduction.additionalProperties)
                }

                /** an amount representing the change to the customer's credit balance */
                fun amount(amount: Double) = amount(JsonField.of(amount))

                /** an amount representing the change to the customer's credit balance */
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                fun reason(reason: String) = reason(JsonField.of(reason))

                @JsonProperty("reason")
                @ExcludeMissing
                fun reason(reason: JsonField<String>) = apply { this.reason = reason }

                /**
                 * the running balance for this credit type at the time of the ledger entry,
                 * including all preceding charges
                 */
                fun runningBalance(runningBalance: Double) =
                    runningBalance(JsonField.of(runningBalance))

                /**
                 * the running balance for this credit type at the time of the ledger entry,
                 * including all preceding charges
                 */
                @JsonProperty("running_balance")
                @ExcludeMissing
                fun runningBalance(runningBalance: JsonField<Double>) = apply {
                    this.runningBalance = runningBalance
                }

                fun effectiveAt(effectiveAt: OffsetDateTime) =
                    effectiveAt(JsonField.of(effectiveAt))

                @JsonProperty("effective_at")
                @ExcludeMissing
                fun effectiveAt(effectiveAt: JsonField<OffsetDateTime>) = apply {
                    this.effectiveAt = effectiveAt
                }

                fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

                @JsonProperty("created_by")
                @ExcludeMissing
                fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

                /** the credit grant this entry is related to */
                fun creditGrantId(creditGrantId: String) =
                    creditGrantId(JsonField.of(creditGrantId))

                /** the credit grant this entry is related to */
                @JsonProperty("credit_grant_id")
                @ExcludeMissing
                fun creditGrantId(creditGrantId: JsonField<String>) = apply {
                    this.creditGrantId = creditGrantId
                }

                /**
                 * if this entry is a deduction, the Metronome ID of the invoice where the credit
                 * deduction was consumed; if this entry is a grant, the Metronome ID of the invoice
                 * where the grant's paid_amount was charged
                 */
                fun invoiceId(invoiceId: String) = invoiceId(JsonField.of(invoiceId))

                /**
                 * if this entry is a deduction, the Metronome ID of the invoice where the credit
                 * deduction was consumed; if this entry is a grant, the Metronome ID of the invoice
                 * where the grant's paid_amount was charged
                 */
                @JsonProperty("invoice_id")
                @ExcludeMissing
                fun invoiceId(invoiceId: JsonField<String>) = apply { this.invoiceId = invoiceId }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Deduction =
                    Deduction(
                        amount,
                        reason,
                        runningBalance,
                        effectiveAt,
                        createdBy,
                        creditGrantId,
                        invoiceId,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        /** the amount of credits initially granted */
        @JsonDeserialize(builder = GrantAmount.Builder::class)
        @NoAutoDetect
        class GrantAmount
        private constructor(
            private val amount: JsonField<Double>,
            private val creditType: JsonField<CreditType>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun amount(): Double = amount.getRequired("amount")

            /** the credit type for the amount granted */
            fun creditType(): CreditType = creditType.getRequired("credit_type")

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is GrantAmount &&
                    this.amount == other.amount &&
                    this.creditType == other.creditType &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            amount,
                            creditType,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "GrantAmount{amount=$amount, creditType=$creditType, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Double> = JsonMissing.of()
                private var creditType: JsonField<CreditType> = JsonMissing.of()
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
                fun creditType(creditType: CreditType) = creditType(JsonField.of(creditType))

                /** the credit type for the amount granted */
                @JsonProperty("credit_type")
                @ExcludeMissing
                fun creditType(creditType: JsonField<CreditType>) = apply {
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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): GrantAmount =
                    GrantAmount(
                        amount,
                        creditType,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            /** the credit type for the amount granted */
            @JsonDeserialize(builder = CreditType.Builder::class)
            @NoAutoDetect
            class CreditType
            private constructor(
                private val name: JsonField<String>,
                private val id: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                fun name(): String = name.getRequired("name")

                fun id(): String = id.getRequired("id")

                @JsonProperty("name") @ExcludeMissing fun _name() = name

                @JsonProperty("id") @ExcludeMissing fun _id() = id

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): CreditType = apply {
                    if (!validated) {
                        name()
                        id()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CreditType &&
                        this.name == other.name &&
                        this.id == other.id &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                name,
                                id,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "CreditType{name=$name, id=$id, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var name: JsonField<String> = JsonMissing.of()
                    private var id: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(creditType: CreditType) = apply {
                        this.name = creditType.name
                        this.id = creditType.id
                        additionalProperties(creditType.additionalProperties)
                    }

                    fun name(name: String) = name(JsonField.of(name))

                    @JsonProperty("name")
                    @ExcludeMissing
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    fun id(id: String) = id(JsonField.of(id))

                    @JsonProperty("id")
                    @ExcludeMissing
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): CreditType =
                        CreditType(
                            name,
                            id,
                            additionalProperties.toUnmodifiable(),
                        )
                }
            }
        }

        /** the amount paid for this credit grant */
        @JsonDeserialize(builder = PaidAmount.Builder::class)
        @NoAutoDetect
        class PaidAmount
        private constructor(
            private val amount: JsonField<Double>,
            private val creditType: JsonField<CreditType>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun amount(): Double = amount.getRequired("amount")

            /** the credit type for the amount paid */
            fun creditType(): CreditType = creditType.getRequired("credit_type")

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PaidAmount &&
                    this.amount == other.amount &&
                    this.creditType == other.creditType &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            amount,
                            creditType,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "PaidAmount{amount=$amount, creditType=$creditType, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Double> = JsonMissing.of()
                private var creditType: JsonField<CreditType> = JsonMissing.of()
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
                fun creditType(creditType: CreditType) = creditType(JsonField.of(creditType))

                /** the credit type for the amount paid */
                @JsonProperty("credit_type")
                @ExcludeMissing
                fun creditType(creditType: JsonField<CreditType>) = apply {
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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): PaidAmount =
                    PaidAmount(
                        amount,
                        creditType,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            /** the credit type for the amount paid */
            @JsonDeserialize(builder = CreditType.Builder::class)
            @NoAutoDetect
            class CreditType
            private constructor(
                private val name: JsonField<String>,
                private val id: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                fun name(): String = name.getRequired("name")

                fun id(): String = id.getRequired("id")

                @JsonProperty("name") @ExcludeMissing fun _name() = name

                @JsonProperty("id") @ExcludeMissing fun _id() = id

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): CreditType = apply {
                    if (!validated) {
                        name()
                        id()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CreditType &&
                        this.name == other.name &&
                        this.id == other.id &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                name,
                                id,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "CreditType{name=$name, id=$id, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var name: JsonField<String> = JsonMissing.of()
                    private var id: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(creditType: CreditType) = apply {
                        this.name = creditType.name
                        this.id = creditType.id
                        additionalProperties(creditType.additionalProperties)
                    }

                    fun name(name: String) = name(JsonField.of(name))

                    @JsonProperty("name")
                    @ExcludeMissing
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    fun id(id: String) = id(JsonField.of(id))

                    @JsonProperty("id")
                    @ExcludeMissing
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): CreditType =
                        CreditType(
                            name,
                            id,
                            additionalProperties.toUnmodifiable(),
                        )
                }
            }
        }

        @JsonDeserialize(builder = PendingDeduction.Builder::class)
        @NoAutoDetect
        class PendingDeduction
        private constructor(
            private val amount: JsonField<Double>,
            private val reason: JsonField<String>,
            private val runningBalance: JsonField<Double>,
            private val effectiveAt: JsonField<OffsetDateTime>,
            private val createdBy: JsonField<String>,
            private val creditGrantId: JsonField<String>,
            private val invoiceId: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** an amount representing the change to the customer's credit balance */
            fun amount(): Double = amount.getRequired("amount")

            fun reason(): String = reason.getRequired("reason")

            /**
             * the running balance for this credit type at the time of the ledger entry, including
             * all preceding charges
             */
            fun runningBalance(): Double = runningBalance.getRequired("running_balance")

            fun effectiveAt(): OffsetDateTime = effectiveAt.getRequired("effective_at")

            fun createdBy(): String = createdBy.getRequired("created_by")

            /** the credit grant this entry is related to */
            fun creditGrantId(): String = creditGrantId.getRequired("credit_grant_id")

            /**
             * if this entry is a deduction, the Metronome ID of the invoice where the credit
             * deduction was consumed; if this entry is a grant, the Metronome ID of the invoice
             * where the grant's paid_amount was charged
             */
            fun invoiceId(): Optional<String> =
                Optional.ofNullable(invoiceId.getNullable("invoice_id"))

            /** an amount representing the change to the customer's credit balance */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

            /**
             * the running balance for this credit type at the time of the ledger entry, including
             * all preceding charges
             */
            @JsonProperty("running_balance") @ExcludeMissing fun _runningBalance() = runningBalance

            @JsonProperty("effective_at") @ExcludeMissing fun _effectiveAt() = effectiveAt

            @JsonProperty("created_by") @ExcludeMissing fun _createdBy() = createdBy

            /** the credit grant this entry is related to */
            @JsonProperty("credit_grant_id") @ExcludeMissing fun _creditGrantId() = creditGrantId

            /**
             * if this entry is a deduction, the Metronome ID of the invoice where the credit
             * deduction was consumed; if this entry is a grant, the Metronome ID of the invoice
             * where the grant's paid_amount was charged
             */
            @JsonProperty("invoice_id") @ExcludeMissing fun _invoiceId() = invoiceId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): PendingDeduction = apply {
                if (!validated) {
                    amount()
                    reason()
                    runningBalance()
                    effectiveAt()
                    createdBy()
                    creditGrantId()
                    invoiceId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PendingDeduction &&
                    this.amount == other.amount &&
                    this.reason == other.reason &&
                    this.runningBalance == other.runningBalance &&
                    this.effectiveAt == other.effectiveAt &&
                    this.createdBy == other.createdBy &&
                    this.creditGrantId == other.creditGrantId &&
                    this.invoiceId == other.invoiceId &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            amount,
                            reason,
                            runningBalance,
                            effectiveAt,
                            createdBy,
                            creditGrantId,
                            invoiceId,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "PendingDeduction{amount=$amount, reason=$reason, runningBalance=$runningBalance, effectiveAt=$effectiveAt, createdBy=$createdBy, creditGrantId=$creditGrantId, invoiceId=$invoiceId, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Double> = JsonMissing.of()
                private var reason: JsonField<String> = JsonMissing.of()
                private var runningBalance: JsonField<Double> = JsonMissing.of()
                private var effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var createdBy: JsonField<String> = JsonMissing.of()
                private var creditGrantId: JsonField<String> = JsonMissing.of()
                private var invoiceId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(pendingDeduction: PendingDeduction) = apply {
                    this.amount = pendingDeduction.amount
                    this.reason = pendingDeduction.reason
                    this.runningBalance = pendingDeduction.runningBalance
                    this.effectiveAt = pendingDeduction.effectiveAt
                    this.createdBy = pendingDeduction.createdBy
                    this.creditGrantId = pendingDeduction.creditGrantId
                    this.invoiceId = pendingDeduction.invoiceId
                    additionalProperties(pendingDeduction.additionalProperties)
                }

                /** an amount representing the change to the customer's credit balance */
                fun amount(amount: Double) = amount(JsonField.of(amount))

                /** an amount representing the change to the customer's credit balance */
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                fun reason(reason: String) = reason(JsonField.of(reason))

                @JsonProperty("reason")
                @ExcludeMissing
                fun reason(reason: JsonField<String>) = apply { this.reason = reason }

                /**
                 * the running balance for this credit type at the time of the ledger entry,
                 * including all preceding charges
                 */
                fun runningBalance(runningBalance: Double) =
                    runningBalance(JsonField.of(runningBalance))

                /**
                 * the running balance for this credit type at the time of the ledger entry,
                 * including all preceding charges
                 */
                @JsonProperty("running_balance")
                @ExcludeMissing
                fun runningBalance(runningBalance: JsonField<Double>) = apply {
                    this.runningBalance = runningBalance
                }

                fun effectiveAt(effectiveAt: OffsetDateTime) =
                    effectiveAt(JsonField.of(effectiveAt))

                @JsonProperty("effective_at")
                @ExcludeMissing
                fun effectiveAt(effectiveAt: JsonField<OffsetDateTime>) = apply {
                    this.effectiveAt = effectiveAt
                }

                fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

                @JsonProperty("created_by")
                @ExcludeMissing
                fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

                /** the credit grant this entry is related to */
                fun creditGrantId(creditGrantId: String) =
                    creditGrantId(JsonField.of(creditGrantId))

                /** the credit grant this entry is related to */
                @JsonProperty("credit_grant_id")
                @ExcludeMissing
                fun creditGrantId(creditGrantId: JsonField<String>) = apply {
                    this.creditGrantId = creditGrantId
                }

                /**
                 * if this entry is a deduction, the Metronome ID of the invoice where the credit
                 * deduction was consumed; if this entry is a grant, the Metronome ID of the invoice
                 * where the grant's paid_amount was charged
                 */
                fun invoiceId(invoiceId: String) = invoiceId(JsonField.of(invoiceId))

                /**
                 * if this entry is a deduction, the Metronome ID of the invoice where the credit
                 * deduction was consumed; if this entry is a grant, the Metronome ID of the invoice
                 * where the grant's paid_amount was charged
                 */
                @JsonProperty("invoice_id")
                @ExcludeMissing
                fun invoiceId(invoiceId: JsonField<String>) = apply { this.invoiceId = invoiceId }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): PendingDeduction =
                    PendingDeduction(
                        amount,
                        reason,
                        runningBalance,
                        effectiveAt,
                        createdBy,
                        creditGrantId,
                        invoiceId,
                        additionalProperties.toUnmodifiable(),
                    )
            }
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

            private var hashCode: Int = 0

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Product &&
                    this.id == other.id &&
                    this.name == other.name &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            id,
                            name,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Product{id=$id, name=$name, additionalProperties=$additionalProperties}"

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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Product =
                    Product(
                        id,
                        name,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }
    }
}
