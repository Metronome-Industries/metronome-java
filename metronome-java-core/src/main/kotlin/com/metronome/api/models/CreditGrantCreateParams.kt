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
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.getOrThrow
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

class CreditGrantCreateParams
constructor(
    private val body: CreditGrantCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** the Metronome ID of the customer */
    fun customerId(): String = body.customerId()

    /** The credit grant will only apply to usage or charges dated before this timestamp */
    fun expiresAt(): OffsetDateTime = body.expiresAt()

    /** the amount of credits granted */
    fun grantAmount(): GrantAmount = body.grantAmount()

    /** the name of the credit grant as it will appear on invoices */
    fun name(): String = body.name()

    /** the amount paid for this credit grant */
    fun paidAmount(): PaidAmount = body.paidAmount()

    fun priority(): Double = body.priority()

    fun creditGrantType(): Optional<String> = body.creditGrantType()

    /** Custom fields to attach to the credit grant. */
    fun customFields(): Optional<CustomFields> = body.customFields()

    /** The credit grant will only apply to usage or charges dated on or after this timestamp */
    fun effectiveAt(): Optional<OffsetDateTime> = body.effectiveAt()

    /** The date to issue an invoice for the paid_amount. */
    fun invoiceDate(): Optional<OffsetDateTime> = body.invoiceDate()

    /**
     * The product(s) which these credits will be applied to. (If unspecified, the credits will be
     * applied to charges for all products.). The array ordering specified here will be used to
     * determine the order in which credits will be applied to invoice line items
     */
    fun productIds(): Optional<List<String>> = body.productIds()

    fun reason(): Optional<String> = body.reason()

    /**
     * Configure a rollover for this credit grant so if it expires it rolls over a configured amount
     * to a new credit grant. This feature is currently opt-in only. Contact Metronome to be added
     * to the beta.
     */
    fun rolloverSettings(): Optional<RolloverSettings> = body.rolloverSettings()

    /**
     * Prevents the creation of duplicates. If a request to create a record is made with a
     * previously used uniqueness key, a new record will not be created and the request will fail
     * with a 409 error.
     */
    fun uniquenessKey(): Optional<String> = body.uniquenessKey()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    @JvmSynthetic internal fun getBody(): CreditGrantCreateBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class CreditGrantCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("customer_id") private val customerId: String,
        @JsonProperty("expires_at") private val expiresAt: OffsetDateTime,
        @JsonProperty("grant_amount") private val grantAmount: GrantAmount,
        @JsonProperty("name") private val name: String,
        @JsonProperty("paid_amount") private val paidAmount: PaidAmount,
        @JsonProperty("priority") private val priority: Double,
        @JsonProperty("credit_grant_type") private val creditGrantType: String?,
        @JsonProperty("custom_fields") private val customFields: CustomFields?,
        @JsonProperty("effective_at") private val effectiveAt: OffsetDateTime?,
        @JsonProperty("invoice_date") private val invoiceDate: OffsetDateTime?,
        @JsonProperty("product_ids") private val productIds: List<String>?,
        @JsonProperty("reason") private val reason: String?,
        @JsonProperty("rollover_settings") private val rolloverSettings: RolloverSettings?,
        @JsonProperty("uniqueness_key") private val uniquenessKey: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** the Metronome ID of the customer */
        @JsonProperty("customer_id") fun customerId(): String = customerId

        /** The credit grant will only apply to usage or charges dated before this timestamp */
        @JsonProperty("expires_at") fun expiresAt(): OffsetDateTime = expiresAt

        /** the amount of credits granted */
        @JsonProperty("grant_amount") fun grantAmount(): GrantAmount = grantAmount

        /** the name of the credit grant as it will appear on invoices */
        @JsonProperty("name") fun name(): String = name

        /** the amount paid for this credit grant */
        @JsonProperty("paid_amount") fun paidAmount(): PaidAmount = paidAmount

        @JsonProperty("priority") fun priority(): Double = priority

        @JsonProperty("credit_grant_type")
        fun creditGrantType(): Optional<String> = Optional.ofNullable(creditGrantType)

        /** Custom fields to attach to the credit grant. */
        @JsonProperty("custom_fields")
        fun customFields(): Optional<CustomFields> = Optional.ofNullable(customFields)

        /** The credit grant will only apply to usage or charges dated on or after this timestamp */
        @JsonProperty("effective_at")
        fun effectiveAt(): Optional<OffsetDateTime> = Optional.ofNullable(effectiveAt)

        /** The date to issue an invoice for the paid_amount. */
        @JsonProperty("invoice_date")
        fun invoiceDate(): Optional<OffsetDateTime> = Optional.ofNullable(invoiceDate)

        /**
         * The product(s) which these credits will be applied to. (If unspecified, the credits will
         * be applied to charges for all products.). The array ordering specified here will be used
         * to determine the order in which credits will be applied to invoice line items
         */
        @JsonProperty("product_ids")
        fun productIds(): Optional<List<String>> = Optional.ofNullable(productIds)

        @JsonProperty("reason") fun reason(): Optional<String> = Optional.ofNullable(reason)

        /**
         * Configure a rollover for this credit grant so if it expires it rolls over a configured
         * amount to a new credit grant. This feature is currently opt-in only. Contact Metronome to
         * be added to the beta.
         */
        @JsonProperty("rollover_settings")
        fun rolloverSettings(): Optional<RolloverSettings> = Optional.ofNullable(rolloverSettings)

        /**
         * Prevents the creation of duplicates. If a request to create a record is made with a
         * previously used uniqueness key, a new record will not be created and the request will
         * fail with a 409 error.
         */
        @JsonProperty("uniqueness_key")
        fun uniquenessKey(): Optional<String> = Optional.ofNullable(uniquenessKey)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var customerId: String? = null
            private var expiresAt: OffsetDateTime? = null
            private var grantAmount: GrantAmount? = null
            private var name: String? = null
            private var paidAmount: PaidAmount? = null
            private var priority: Double? = null
            private var creditGrantType: String? = null
            private var customFields: CustomFields? = null
            private var effectiveAt: OffsetDateTime? = null
            private var invoiceDate: OffsetDateTime? = null
            private var productIds: MutableList<String>? = null
            private var reason: String? = null
            private var rolloverSettings: RolloverSettings? = null
            private var uniquenessKey: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(creditGrantCreateBody: CreditGrantCreateBody) = apply {
                customerId = creditGrantCreateBody.customerId
                expiresAt = creditGrantCreateBody.expiresAt
                grantAmount = creditGrantCreateBody.grantAmount
                name = creditGrantCreateBody.name
                paidAmount = creditGrantCreateBody.paidAmount
                priority = creditGrantCreateBody.priority
                creditGrantType = creditGrantCreateBody.creditGrantType
                customFields = creditGrantCreateBody.customFields
                effectiveAt = creditGrantCreateBody.effectiveAt
                invoiceDate = creditGrantCreateBody.invoiceDate
                productIds = creditGrantCreateBody.productIds?.toMutableList()
                reason = creditGrantCreateBody.reason
                rolloverSettings = creditGrantCreateBody.rolloverSettings
                uniquenessKey = creditGrantCreateBody.uniquenessKey
                additionalProperties = creditGrantCreateBody.additionalProperties.toMutableMap()
            }

            /** the Metronome ID of the customer */
            fun customerId(customerId: String) = apply { this.customerId = customerId }

            /** The credit grant will only apply to usage or charges dated before this timestamp */
            fun expiresAt(expiresAt: OffsetDateTime) = apply { this.expiresAt = expiresAt }

            /** the amount of credits granted */
            fun grantAmount(grantAmount: GrantAmount) = apply { this.grantAmount = grantAmount }

            /** the name of the credit grant as it will appear on invoices */
            fun name(name: String) = apply { this.name = name }

            /** the amount paid for this credit grant */
            fun paidAmount(paidAmount: PaidAmount) = apply { this.paidAmount = paidAmount }

            fun priority(priority: Double) = apply { this.priority = priority }

            fun creditGrantType(creditGrantType: String) = apply {
                this.creditGrantType = creditGrantType
            }

            /** Custom fields to attach to the credit grant. */
            fun customFields(customFields: CustomFields) = apply {
                this.customFields = customFields
            }

            /**
             * The credit grant will only apply to usage or charges dated on or after this timestamp
             */
            fun effectiveAt(effectiveAt: OffsetDateTime) = apply { this.effectiveAt = effectiveAt }

            /** The date to issue an invoice for the paid_amount. */
            fun invoiceDate(invoiceDate: OffsetDateTime) = apply { this.invoiceDate = invoiceDate }

            /**
             * The product(s) which these credits will be applied to. (If unspecified, the credits
             * will be applied to charges for all products.). The array ordering specified here will
             * be used to determine the order in which credits will be applied to invoice line items
             */
            fun productIds(productIds: List<String>) = apply {
                this.productIds = productIds.toMutableList()
            }

            /**
             * The product(s) which these credits will be applied to. (If unspecified, the credits
             * will be applied to charges for all products.). The array ordering specified here will
             * be used to determine the order in which credits will be applied to invoice line items
             */
            fun addProductId(productId: String) = apply {
                productIds = (productIds ?: mutableListOf()).apply { add(productId) }
            }

            fun reason(reason: String) = apply { this.reason = reason }

            /**
             * Configure a rollover for this credit grant so if it expires it rolls over a
             * configured amount to a new credit grant. This feature is currently opt-in only.
             * Contact Metronome to be added to the beta.
             */
            fun rolloverSettings(rolloverSettings: RolloverSettings) = apply {
                this.rolloverSettings = rolloverSettings
            }

            /**
             * Prevents the creation of duplicates. If a request to create a record is made with a
             * previously used uniqueness key, a new record will not be created and the request will
             * fail with a 409 error.
             */
            fun uniquenessKey(uniquenessKey: String) = apply { this.uniquenessKey = uniquenessKey }

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

            fun build(): CreditGrantCreateBody =
                CreditGrantCreateBody(
                    checkNotNull(customerId) { "`customerId` is required but was not set" },
                    checkNotNull(expiresAt) { "`expiresAt` is required but was not set" },
                    checkNotNull(grantAmount) { "`grantAmount` is required but was not set" },
                    checkNotNull(name) { "`name` is required but was not set" },
                    checkNotNull(paidAmount) { "`paidAmount` is required but was not set" },
                    checkNotNull(priority) { "`priority` is required but was not set" },
                    creditGrantType,
                    customFields,
                    effectiveAt,
                    invoiceDate,
                    productIds?.toImmutable(),
                    reason,
                    rolloverSettings,
                    uniquenessKey,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CreditGrantCreateBody && customerId == other.customerId && expiresAt == other.expiresAt && grantAmount == other.grantAmount && name == other.name && paidAmount == other.paidAmount && priority == other.priority && creditGrantType == other.creditGrantType && customFields == other.customFields && effectiveAt == other.effectiveAt && invoiceDate == other.invoiceDate && productIds == other.productIds && reason == other.reason && rolloverSettings == other.rolloverSettings && uniquenessKey == other.uniquenessKey && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(customerId, expiresAt, grantAmount, name, paidAmount, priority, creditGrantType, customFields, effectiveAt, invoiceDate, productIds, reason, rolloverSettings, uniquenessKey, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CreditGrantCreateBody{customerId=$customerId, expiresAt=$expiresAt, grantAmount=$grantAmount, name=$name, paidAmount=$paidAmount, priority=$priority, creditGrantType=$creditGrantType, customFields=$customFields, effectiveAt=$effectiveAt, invoiceDate=$invoiceDate, productIds=$productIds, reason=$reason, rolloverSettings=$rolloverSettings, uniquenessKey=$uniquenessKey, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: CreditGrantCreateBody.Builder = CreditGrantCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(creditGrantCreateParams: CreditGrantCreateParams) = apply {
            body = creditGrantCreateParams.body.toBuilder()
            additionalHeaders = creditGrantCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = creditGrantCreateParams.additionalQueryParams.toBuilder()
        }

        /** the Metronome ID of the customer */
        fun customerId(customerId: String) = apply { body.customerId(customerId) }

        /** The credit grant will only apply to usage or charges dated before this timestamp */
        fun expiresAt(expiresAt: OffsetDateTime) = apply { body.expiresAt(expiresAt) }

        /** the amount of credits granted */
        fun grantAmount(grantAmount: GrantAmount) = apply { body.grantAmount(grantAmount) }

        /** the name of the credit grant as it will appear on invoices */
        fun name(name: String) = apply { body.name(name) }

        /** the amount paid for this credit grant */
        fun paidAmount(paidAmount: PaidAmount) = apply { body.paidAmount(paidAmount) }

        fun priority(priority: Double) = apply { body.priority(priority) }

        fun creditGrantType(creditGrantType: String) = apply {
            body.creditGrantType(creditGrantType)
        }

        /** Custom fields to attach to the credit grant. */
        fun customFields(customFields: CustomFields) = apply { body.customFields(customFields) }

        /** The credit grant will only apply to usage or charges dated on or after this timestamp */
        fun effectiveAt(effectiveAt: OffsetDateTime) = apply { body.effectiveAt(effectiveAt) }

        /** The date to issue an invoice for the paid_amount. */
        fun invoiceDate(invoiceDate: OffsetDateTime) = apply { body.invoiceDate(invoiceDate) }

        /**
         * The product(s) which these credits will be applied to. (If unspecified, the credits will
         * be applied to charges for all products.). The array ordering specified here will be used
         * to determine the order in which credits will be applied to invoice line items
         */
        fun productIds(productIds: List<String>) = apply { body.productIds(productIds) }

        /**
         * The product(s) which these credits will be applied to. (If unspecified, the credits will
         * be applied to charges for all products.). The array ordering specified here will be used
         * to determine the order in which credits will be applied to invoice line items
         */
        fun addProductId(productId: String) = apply { body.addProductId(productId) }

        fun reason(reason: String) = apply { body.reason(reason) }

        /**
         * Configure a rollover for this credit grant so if it expires it rolls over a configured
         * amount to a new credit grant. This feature is currently opt-in only. Contact Metronome to
         * be added to the beta.
         */
        fun rolloverSettings(rolloverSettings: RolloverSettings) = apply {
            body.rolloverSettings(rolloverSettings)
        }

        /**
         * Prevents the creation of duplicates. If a request to create a record is made with a
         * previously used uniqueness key, a new record will not be created and the request will
         * fail with a 409 error.
         */
        fun uniquenessKey(uniquenessKey: String) = apply { body.uniquenessKey(uniquenessKey) }

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

        fun build(): CreditGrantCreateParams =
            CreditGrantCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /** the amount of credits granted */
    @NoAutoDetect
    class GrantAmount
    @JsonCreator
    private constructor(
        @JsonProperty("amount") private val amount: Double,
        @JsonProperty("credit_type_id") private val creditTypeId: String,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonProperty("amount") fun amount(): Double = amount

        /** the ID of the pricing unit to be used. Defaults to USD (cents) if not passed. */
        @JsonProperty("credit_type_id") fun creditTypeId(): String = creditTypeId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var amount: Double? = null
            private var creditTypeId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(grantAmount: GrantAmount) = apply {
                amount = grantAmount.amount
                creditTypeId = grantAmount.creditTypeId
                additionalProperties = grantAmount.additionalProperties.toMutableMap()
            }

            fun amount(amount: Double) = apply { this.amount = amount }

            /** the ID of the pricing unit to be used. Defaults to USD (cents) if not passed. */
            fun creditTypeId(creditTypeId: String) = apply { this.creditTypeId = creditTypeId }

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
                    checkNotNull(creditTypeId) { "`creditTypeId` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is GrantAmount && amount == other.amount && creditTypeId == other.creditTypeId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, creditTypeId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "GrantAmount{amount=$amount, creditTypeId=$creditTypeId, additionalProperties=$additionalProperties}"
    }

    /** the amount paid for this credit grant */
    @NoAutoDetect
    class PaidAmount
    @JsonCreator
    private constructor(
        @JsonProperty("amount") private val amount: Double,
        @JsonProperty("credit_type_id") private val creditTypeId: String,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonProperty("amount") fun amount(): Double = amount

        /** the ID of the pricing unit to be used. Defaults to USD (cents) if not passed. */
        @JsonProperty("credit_type_id") fun creditTypeId(): String = creditTypeId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var amount: Double? = null
            private var creditTypeId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(paidAmount: PaidAmount) = apply {
                amount = paidAmount.amount
                creditTypeId = paidAmount.creditTypeId
                additionalProperties = paidAmount.additionalProperties.toMutableMap()
            }

            fun amount(amount: Double) = apply { this.amount = amount }

            /** the ID of the pricing unit to be used. Defaults to USD (cents) if not passed. */
            fun creditTypeId(creditTypeId: String) = apply { this.creditTypeId = creditTypeId }

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
                    checkNotNull(creditTypeId) { "`creditTypeId` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PaidAmount && amount == other.amount && creditTypeId == other.creditTypeId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, creditTypeId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PaidAmount{amount=$amount, creditTypeId=$creditTypeId, additionalProperties=$additionalProperties}"
    }

    /** Custom fields to attach to the credit grant. */
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

    /**
     * Configure a rollover for this credit grant so if it expires it rolls over a configured amount
     * to a new credit grant. This feature is currently opt-in only. Contact Metronome to be added
     * to the beta.
     */
    @NoAutoDetect
    class RolloverSettings
    @JsonCreator
    private constructor(
        @JsonProperty("expires_at") private val expiresAt: OffsetDateTime,
        @JsonProperty("priority") private val priority: Double,
        @JsonProperty("rollover_amount") private val rolloverAmount: RolloverAmount,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The date to expire the rollover credits. */
        @JsonProperty("expires_at") fun expiresAt(): OffsetDateTime = expiresAt

        /**
         * The priority to give the rollover credit grant that gets created when a rollover happens.
         */
        @JsonProperty("priority") fun priority(): Double = priority

        /** Specify how much to rollover to the rollover credit grant */
        @JsonProperty("rollover_amount") fun rolloverAmount(): RolloverAmount = rolloverAmount

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var expiresAt: OffsetDateTime? = null
            private var priority: Double? = null
            private var rolloverAmount: RolloverAmount? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(rolloverSettings: RolloverSettings) = apply {
                expiresAt = rolloverSettings.expiresAt
                priority = rolloverSettings.priority
                rolloverAmount = rolloverSettings.rolloverAmount
                additionalProperties = rolloverSettings.additionalProperties.toMutableMap()
            }

            /** The date to expire the rollover credits. */
            fun expiresAt(expiresAt: OffsetDateTime) = apply { this.expiresAt = expiresAt }

            /**
             * The priority to give the rollover credit grant that gets created when a rollover
             * happens.
             */
            fun priority(priority: Double) = apply { this.priority = priority }

            /** Specify how much to rollover to the rollover credit grant */
            fun rolloverAmount(rolloverAmount: RolloverAmount) = apply {
                this.rolloverAmount = rolloverAmount
            }

            fun rolloverAmount(rolloverAmountMaxPercentage: RolloverAmountMaxPercentage) = apply {
                this.rolloverAmount =
                    RolloverAmount.ofRolloverAmountMaxPercentage(rolloverAmountMaxPercentage)
            }

            fun rolloverAmount(rolloverAmountMaxAmount: RolloverAmountMaxAmount) = apply {
                this.rolloverAmount =
                    RolloverAmount.ofRolloverAmountMaxAmount(rolloverAmountMaxAmount)
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

            fun build(): RolloverSettings =
                RolloverSettings(
                    checkNotNull(expiresAt) { "`expiresAt` is required but was not set" },
                    checkNotNull(priority) { "`priority` is required but was not set" },
                    checkNotNull(rolloverAmount) { "`rolloverAmount` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        @JsonDeserialize(using = RolloverAmount.Deserializer::class)
        @JsonSerialize(using = RolloverAmount.Serializer::class)
        class RolloverAmount
        private constructor(
            private val rolloverAmountMaxPercentage: RolloverAmountMaxPercentage? = null,
            private val rolloverAmountMaxAmount: RolloverAmountMaxAmount? = null,
            private val _json: JsonValue? = null,
        ) {

            fun rolloverAmountMaxPercentage(): Optional<RolloverAmountMaxPercentage> =
                Optional.ofNullable(rolloverAmountMaxPercentage)

            fun rolloverAmountMaxAmount(): Optional<RolloverAmountMaxAmount> =
                Optional.ofNullable(rolloverAmountMaxAmount)

            fun isRolloverAmountMaxPercentage(): Boolean = rolloverAmountMaxPercentage != null

            fun isRolloverAmountMaxAmount(): Boolean = rolloverAmountMaxAmount != null

            fun asRolloverAmountMaxPercentage(): RolloverAmountMaxPercentage =
                rolloverAmountMaxPercentage.getOrThrow("rolloverAmountMaxPercentage")

            fun asRolloverAmountMaxAmount(): RolloverAmountMaxAmount =
                rolloverAmountMaxAmount.getOrThrow("rolloverAmountMaxAmount")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T {
                return when {
                    rolloverAmountMaxPercentage != null ->
                        visitor.visitRolloverAmountMaxPercentage(rolloverAmountMaxPercentage)
                    rolloverAmountMaxAmount != null ->
                        visitor.visitRolloverAmountMaxAmount(rolloverAmountMaxAmount)
                    else -> visitor.unknown(_json)
                }
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is RolloverAmount && rolloverAmountMaxPercentage == other.rolloverAmountMaxPercentage && rolloverAmountMaxAmount == other.rolloverAmountMaxAmount /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(rolloverAmountMaxPercentage, rolloverAmountMaxAmount) /* spotless:on */

            override fun toString(): String =
                when {
                    rolloverAmountMaxPercentage != null ->
                        "RolloverAmount{rolloverAmountMaxPercentage=$rolloverAmountMaxPercentage}"
                    rolloverAmountMaxAmount != null ->
                        "RolloverAmount{rolloverAmountMaxAmount=$rolloverAmountMaxAmount}"
                    _json != null -> "RolloverAmount{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid RolloverAmount")
                }

            companion object {

                @JvmStatic
                fun ofRolloverAmountMaxPercentage(
                    rolloverAmountMaxPercentage: RolloverAmountMaxPercentage
                ) = RolloverAmount(rolloverAmountMaxPercentage = rolloverAmountMaxPercentage)

                @JvmStatic
                fun ofRolloverAmountMaxAmount(rolloverAmountMaxAmount: RolloverAmountMaxAmount) =
                    RolloverAmount(rolloverAmountMaxAmount = rolloverAmountMaxAmount)
            }

            interface Visitor<out T> {

                fun visitRolloverAmountMaxPercentage(
                    rolloverAmountMaxPercentage: RolloverAmountMaxPercentage
                ): T

                fun visitRolloverAmountMaxAmount(
                    rolloverAmountMaxAmount: RolloverAmountMaxAmount
                ): T

                fun unknown(json: JsonValue?): T {
                    throw MetronomeInvalidDataException("Unknown RolloverAmount: $json")
                }
            }

            class Deserializer : BaseDeserializer<RolloverAmount>(RolloverAmount::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): RolloverAmount {
                    val json = JsonValue.fromJsonNode(node)

                    tryDeserialize(node, jacksonTypeRef<RolloverAmountMaxPercentage>())?.let {
                        return RolloverAmount(rolloverAmountMaxPercentage = it, _json = json)
                    }
                    tryDeserialize(node, jacksonTypeRef<RolloverAmountMaxAmount>())?.let {
                        return RolloverAmount(rolloverAmountMaxAmount = it, _json = json)
                    }

                    return RolloverAmount(_json = json)
                }
            }

            class Serializer : BaseSerializer<RolloverAmount>(RolloverAmount::class) {

                override fun serialize(
                    value: RolloverAmount,
                    generator: JsonGenerator,
                    provider: SerializerProvider
                ) {
                    when {
                        value.rolloverAmountMaxPercentage != null ->
                            generator.writeObject(value.rolloverAmountMaxPercentage)
                        value.rolloverAmountMaxAmount != null ->
                            generator.writeObject(value.rolloverAmountMaxAmount)
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

            return /* spotless:off */ other is RolloverSettings && expiresAt == other.expiresAt && priority == other.priority && rolloverAmount == other.rolloverAmount && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(expiresAt, priority, rolloverAmount, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RolloverSettings{expiresAt=$expiresAt, priority=$priority, rolloverAmount=$rolloverAmount, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CreditGrantCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CreditGrantCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
