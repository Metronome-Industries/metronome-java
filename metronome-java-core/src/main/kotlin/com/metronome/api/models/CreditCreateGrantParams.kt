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
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.getOrThrow
import com.metronome.api.core.toUnmodifiable
import com.metronome.api.errors.MetronomeInvalidDataException
import com.metronome.api.models.*
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

class CreditCreateGrantParams
constructor(
    private val customerId: String,
    private val expiresAt: OffsetDateTime,
    private val grantAmount: GrantAmount,
    private val name: String,
    private val paidAmount: PaidAmount,
    private val priority: Double,
    private val creditGrantType: String?,
    private val customFields: CustomFields?,
    private val effectiveAt: OffsetDateTime?,
    private val invoiceDate: OffsetDateTime?,
    private val productIds: List<String>?,
    private val reason: String?,
    private val rolloverSettings: RolloverSettings?,
    private val uniquenessKey: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun customerId(): String = customerId

    fun expiresAt(): OffsetDateTime = expiresAt

    fun grantAmount(): GrantAmount = grantAmount

    fun name(): String = name

    fun paidAmount(): PaidAmount = paidAmount

    fun priority(): Double = priority

    fun creditGrantType(): Optional<String> = Optional.ofNullable(creditGrantType)

    fun customFields(): Optional<CustomFields> = Optional.ofNullable(customFields)

    fun effectiveAt(): Optional<OffsetDateTime> = Optional.ofNullable(effectiveAt)

    fun invoiceDate(): Optional<OffsetDateTime> = Optional.ofNullable(invoiceDate)

    fun productIds(): Optional<List<String>> = Optional.ofNullable(productIds)

    fun reason(): Optional<String> = Optional.ofNullable(reason)

    fun rolloverSettings(): Optional<RolloverSettings> = Optional.ofNullable(rolloverSettings)

    fun uniquenessKey(): Optional<String> = Optional.ofNullable(uniquenessKey)

    @JvmSynthetic
    internal fun getBody(): CreditCreateGrantBody {
        return CreditCreateGrantBody(
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
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = CreditCreateGrantBody.Builder::class)
    @NoAutoDetect
    class CreditCreateGrantBody
    internal constructor(
        private val customerId: String?,
        private val expiresAt: OffsetDateTime?,
        private val grantAmount: GrantAmount?,
        private val name: String?,
        private val paidAmount: PaidAmount?,
        private val priority: Double?,
        private val creditGrantType: String?,
        private val customFields: CustomFields?,
        private val effectiveAt: OffsetDateTime?,
        private val invoiceDate: OffsetDateTime?,
        private val productIds: List<String>?,
        private val reason: String?,
        private val rolloverSettings: RolloverSettings?,
        private val uniquenessKey: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** the Metronome ID of the customer */
        @JsonProperty("customer_id") fun customerId(): String? = customerId

        /** The credit grant will only apply to billing periods that end before this timestamp. */
        @JsonProperty("expires_at") fun expiresAt(): OffsetDateTime? = expiresAt

        /** the amount of credits granted */
        @JsonProperty("grant_amount") fun grantAmount(): GrantAmount? = grantAmount

        /** the name of the credit grant as it will appear on invoices */
        @JsonProperty("name") fun name(): String? = name

        /** the amount paid for this credit grant */
        @JsonProperty("paid_amount") fun paidAmount(): PaidAmount? = paidAmount

        @JsonProperty("priority") fun priority(): Double? = priority

        @JsonProperty("credit_grant_type") fun creditGrantType(): String? = creditGrantType

        /** Custom fields to attach to the credit grant. */
        @JsonProperty("custom_fields") fun customFields(): CustomFields? = customFields

        /**
         * The credit grant will only apply to billing periods that end at or after this timestamp.
         */
        @JsonProperty("effective_at") fun effectiveAt(): OffsetDateTime? = effectiveAt

        /** The date to issue an invoice for the paid_amount. */
        @JsonProperty("invoice_date") fun invoiceDate(): OffsetDateTime? = invoiceDate

        /**
         * The product(s) which these credits will be applied to. (If unspecified, the credits will
         * be applied to charges for all products.). The array ordering specified here will be used
         * to determine the order in which credits will be applied to invoice line items
         */
        @JsonProperty("product_ids") fun productIds(): List<String>? = productIds

        @JsonProperty("reason") fun reason(): String? = reason

        /**
         * Configure a rollover for this credit grant so if it expires it rolls over a configured
         * amount to a new credit grant. This feature is currently opt-in only. Contact Metronome to
         * be added to the beta.
         */
        @JsonProperty("rollover_settings")
        fun rolloverSettings(): RolloverSettings? = rolloverSettings

        /**
         * Prevents the creation of duplicates. If a request to create a record is made with a
         * previously used uniqueness key, a new record will not be created and the request will
         * fail with a 409 error.
         */
        @JsonProperty("uniqueness_key") fun uniquenessKey(): String? = uniquenessKey

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CreditCreateGrantBody &&
                this.customerId == other.customerId &&
                this.expiresAt == other.expiresAt &&
                this.grantAmount == other.grantAmount &&
                this.name == other.name &&
                this.paidAmount == other.paidAmount &&
                this.priority == other.priority &&
                this.creditGrantType == other.creditGrantType &&
                this.customFields == other.customFields &&
                this.effectiveAt == other.effectiveAt &&
                this.invoiceDate == other.invoiceDate &&
                this.productIds == other.productIds &&
                this.reason == other.reason &&
                this.rolloverSettings == other.rolloverSettings &&
                this.uniquenessKey == other.uniquenessKey &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
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
            return hashCode
        }

        override fun toString() =
            "CreditCreateGrantBody{customerId=$customerId, expiresAt=$expiresAt, grantAmount=$grantAmount, name=$name, paidAmount=$paidAmount, priority=$priority, creditGrantType=$creditGrantType, customFields=$customFields, effectiveAt=$effectiveAt, invoiceDate=$invoiceDate, productIds=$productIds, reason=$reason, rolloverSettings=$rolloverSettings, uniquenessKey=$uniquenessKey, additionalProperties=$additionalProperties}"

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
            private var productIds: List<String>? = null
            private var reason: String? = null
            private var rolloverSettings: RolloverSettings? = null
            private var uniquenessKey: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(creditCreateGrantBody: CreditCreateGrantBody) = apply {
                this.customerId = creditCreateGrantBody.customerId
                this.expiresAt = creditCreateGrantBody.expiresAt
                this.grantAmount = creditCreateGrantBody.grantAmount
                this.name = creditCreateGrantBody.name
                this.paidAmount = creditCreateGrantBody.paidAmount
                this.priority = creditCreateGrantBody.priority
                this.creditGrantType = creditCreateGrantBody.creditGrantType
                this.customFields = creditCreateGrantBody.customFields
                this.effectiveAt = creditCreateGrantBody.effectiveAt
                this.invoiceDate = creditCreateGrantBody.invoiceDate
                this.productIds = creditCreateGrantBody.productIds
                this.reason = creditCreateGrantBody.reason
                this.rolloverSettings = creditCreateGrantBody.rolloverSettings
                this.uniquenessKey = creditCreateGrantBody.uniquenessKey
                additionalProperties(creditCreateGrantBody.additionalProperties)
            }

            /** the Metronome ID of the customer */
            @JsonProperty("customer_id")
            fun customerId(customerId: String) = apply { this.customerId = customerId }

            /**
             * The credit grant will only apply to billing periods that end before this timestamp.
             */
            @JsonProperty("expires_at")
            fun expiresAt(expiresAt: OffsetDateTime) = apply { this.expiresAt = expiresAt }

            /** the amount of credits granted */
            @JsonProperty("grant_amount")
            fun grantAmount(grantAmount: GrantAmount) = apply { this.grantAmount = grantAmount }

            /** the name of the credit grant as it will appear on invoices */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /** the amount paid for this credit grant */
            @JsonProperty("paid_amount")
            fun paidAmount(paidAmount: PaidAmount) = apply { this.paidAmount = paidAmount }

            @JsonProperty("priority")
            fun priority(priority: Double) = apply { this.priority = priority }

            @JsonProperty("credit_grant_type")
            fun creditGrantType(creditGrantType: String) = apply {
                this.creditGrantType = creditGrantType
            }

            /** Custom fields to attach to the credit grant. */
            @JsonProperty("custom_fields")
            fun customFields(customFields: CustomFields) = apply {
                this.customFields = customFields
            }

            /**
             * The credit grant will only apply to billing periods that end at or after this
             * timestamp.
             */
            @JsonProperty("effective_at")
            fun effectiveAt(effectiveAt: OffsetDateTime) = apply { this.effectiveAt = effectiveAt }

            /** The date to issue an invoice for the paid_amount. */
            @JsonProperty("invoice_date")
            fun invoiceDate(invoiceDate: OffsetDateTime) = apply { this.invoiceDate = invoiceDate }

            /**
             * The product(s) which these credits will be applied to. (If unspecified, the credits
             * will be applied to charges for all products.). The array ordering specified here will
             * be used to determine the order in which credits will be applied to invoice line items
             */
            @JsonProperty("product_ids")
            fun productIds(productIds: List<String>) = apply { this.productIds = productIds }

            @JsonProperty("reason") fun reason(reason: String) = apply { this.reason = reason }

            /**
             * Configure a rollover for this credit grant so if it expires it rolls over a
             * configured amount to a new credit grant. This feature is currently opt-in only.
             * Contact Metronome to be added to the beta.
             */
            @JsonProperty("rollover_settings")
            fun rolloverSettings(rolloverSettings: RolloverSettings) = apply {
                this.rolloverSettings = rolloverSettings
            }

            /**
             * Prevents the creation of duplicates. If a request to create a record is made with a
             * previously used uniqueness key, a new record will not be created and the request will
             * fail with a 409 error.
             */
            @JsonProperty("uniqueness_key")
            fun uniquenessKey(uniquenessKey: String) = apply { this.uniquenessKey = uniquenessKey }

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

            fun build(): CreditCreateGrantBody =
                CreditCreateGrantBody(
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
                    productIds?.toUnmodifiable(),
                    reason,
                    rolloverSettings,
                    uniquenessKey,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CreditCreateGrantParams &&
            this.customerId == other.customerId &&
            this.expiresAt == other.expiresAt &&
            this.grantAmount == other.grantAmount &&
            this.name == other.name &&
            this.paidAmount == other.paidAmount &&
            this.priority == other.priority &&
            this.creditGrantType == other.creditGrantType &&
            this.customFields == other.customFields &&
            this.effectiveAt == other.effectiveAt &&
            this.invoiceDate == other.invoiceDate &&
            this.productIds == other.productIds &&
            this.reason == other.reason &&
            this.rolloverSettings == other.rolloverSettings &&
            this.uniquenessKey == other.uniquenessKey &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
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
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "CreditCreateGrantParams{customerId=$customerId, expiresAt=$expiresAt, grantAmount=$grantAmount, name=$name, paidAmount=$paidAmount, priority=$priority, creditGrantType=$creditGrantType, customFields=$customFields, effectiveAt=$effectiveAt, invoiceDate=$invoiceDate, productIds=$productIds, reason=$reason, rolloverSettings=$rolloverSettings, uniquenessKey=$uniquenessKey, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
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
        private var productIds: MutableList<String> = mutableListOf()
        private var reason: String? = null
        private var rolloverSettings: RolloverSettings? = null
        private var uniquenessKey: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(creditCreateGrantParams: CreditCreateGrantParams) = apply {
            this.customerId = creditCreateGrantParams.customerId
            this.expiresAt = creditCreateGrantParams.expiresAt
            this.grantAmount = creditCreateGrantParams.grantAmount
            this.name = creditCreateGrantParams.name
            this.paidAmount = creditCreateGrantParams.paidAmount
            this.priority = creditCreateGrantParams.priority
            this.creditGrantType = creditCreateGrantParams.creditGrantType
            this.customFields = creditCreateGrantParams.customFields
            this.effectiveAt = creditCreateGrantParams.effectiveAt
            this.invoiceDate = creditCreateGrantParams.invoiceDate
            this.productIds(creditCreateGrantParams.productIds ?: listOf())
            this.reason = creditCreateGrantParams.reason
            this.rolloverSettings = creditCreateGrantParams.rolloverSettings
            this.uniquenessKey = creditCreateGrantParams.uniquenessKey
            additionalQueryParams(creditCreateGrantParams.additionalQueryParams)
            additionalHeaders(creditCreateGrantParams.additionalHeaders)
            additionalBodyProperties(creditCreateGrantParams.additionalBodyProperties)
        }

        /** the Metronome ID of the customer */
        fun customerId(customerId: String) = apply { this.customerId = customerId }

        /** The credit grant will only apply to billing periods that end before this timestamp. */
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
        fun customFields(customFields: CustomFields) = apply { this.customFields = customFields }

        /**
         * The credit grant will only apply to billing periods that end at or after this timestamp.
         */
        fun effectiveAt(effectiveAt: OffsetDateTime) = apply { this.effectiveAt = effectiveAt }

        /** The date to issue an invoice for the paid_amount. */
        fun invoiceDate(invoiceDate: OffsetDateTime) = apply { this.invoiceDate = invoiceDate }

        /**
         * The product(s) which these credits will be applied to. (If unspecified, the credits will
         * be applied to charges for all products.). The array ordering specified here will be used
         * to determine the order in which credits will be applied to invoice line items
         */
        fun productIds(productIds: List<String>) = apply {
            this.productIds.clear()
            this.productIds.addAll(productIds)
        }

        /**
         * The product(s) which these credits will be applied to. (If unspecified, the credits will
         * be applied to charges for all products.). The array ordering specified here will be used
         * to determine the order in which credits will be applied to invoice line items
         */
        fun addProductId(productId: String) = apply { this.productIds.add(productId) }

        fun reason(reason: String) = apply { this.reason = reason }

        /**
         * Configure a rollover for this credit grant so if it expires it rolls over a configured
         * amount to a new credit grant. This feature is currently opt-in only. Contact Metronome to
         * be added to the beta.
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

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): CreditCreateGrantParams =
            CreditCreateGrantParams(
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
                if (productIds.size == 0) null else productIds.toUnmodifiable(),
                reason,
                rolloverSettings,
                uniquenessKey,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    /** the amount of credits granted */
    @JsonDeserialize(builder = GrantAmount.Builder::class)
    @NoAutoDetect
    class GrantAmount
    private constructor(
        private val amount: Double?,
        private val creditTypeId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("amount") fun amount(): Double? = amount

        @JsonProperty("credit_type_id") fun creditTypeId(): String? = creditTypeId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is GrantAmount &&
                this.amount == other.amount &&
                this.creditTypeId == other.creditTypeId &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        amount,
                        creditTypeId,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "GrantAmount{amount=$amount, creditTypeId=$creditTypeId, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var amount: Double? = null
            private var creditTypeId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(grantAmount: GrantAmount) = apply {
                this.amount = grantAmount.amount
                this.creditTypeId = grantAmount.creditTypeId
                additionalProperties(grantAmount.additionalProperties)
            }

            @JsonProperty("amount") fun amount(amount: Double) = apply { this.amount = amount }

            @JsonProperty("credit_type_id")
            fun creditTypeId(creditTypeId: String) = apply { this.creditTypeId = creditTypeId }

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
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    checkNotNull(creditTypeId) { "`creditTypeId` is required but was not set" },
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    /** the amount paid for this credit grant */
    @JsonDeserialize(builder = PaidAmount.Builder::class)
    @NoAutoDetect
    class PaidAmount
    private constructor(
        private val amount: Double?,
        private val creditTypeId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("amount") fun amount(): Double? = amount

        @JsonProperty("credit_type_id") fun creditTypeId(): String? = creditTypeId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PaidAmount &&
                this.amount == other.amount &&
                this.creditTypeId == other.creditTypeId &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        amount,
                        creditTypeId,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "PaidAmount{amount=$amount, creditTypeId=$creditTypeId, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var amount: Double? = null
            private var creditTypeId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(paidAmount: PaidAmount) = apply {
                this.amount = paidAmount.amount
                this.creditTypeId = paidAmount.creditTypeId
                additionalProperties(paidAmount.additionalProperties)
            }

            @JsonProperty("amount") fun amount(amount: Double) = apply { this.amount = amount }

            @JsonProperty("credit_type_id")
            fun creditTypeId(creditTypeId: String) = apply { this.creditTypeId = creditTypeId }

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
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    checkNotNull(creditTypeId) { "`creditTypeId` is required but was not set" },
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    /** Custom fields to attach to the credit grant. */
    @JsonDeserialize(builder = CustomFields.Builder::class)
    @NoAutoDetect
    class CustomFields
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CustomFields && this.additionalProperties == other.additionalProperties
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): CustomFields = CustomFields(additionalProperties.toUnmodifiable())
        }
    }

    /**
     * Configure a rollover for this credit grant so if it expires it rolls over a configured amount
     * to a new credit grant. This feature is currently opt-in only. Contact Metronome to be added
     * to the beta.
     */
    @JsonDeserialize(builder = RolloverSettings.Builder::class)
    @NoAutoDetect
    class RolloverSettings
    private constructor(
        private val expiresAt: OffsetDateTime?,
        private val priority: Double?,
        private val rolloverAmount: RolloverAmount?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The date to expire the rollover credits. */
        @JsonProperty("expires_at") fun expiresAt(): OffsetDateTime? = expiresAt

        /**
         * The priority to give the rollover credit grant that gets created when a rollover happens.
         */
        @JsonProperty("priority") fun priority(): Double? = priority

        /** Specify how much to rollover to the rollover credit grant */
        @JsonProperty("rollover_amount") fun rolloverAmount(): RolloverAmount? = rolloverAmount

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RolloverSettings &&
                this.expiresAt == other.expiresAt &&
                this.priority == other.priority &&
                this.rolloverAmount == other.rolloverAmount &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        expiresAt,
                        priority,
                        rolloverAmount,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "RolloverSettings{expiresAt=$expiresAt, priority=$priority, rolloverAmount=$rolloverAmount, additionalProperties=$additionalProperties}"

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
                this.expiresAt = rolloverSettings.expiresAt
                this.priority = rolloverSettings.priority
                this.rolloverAmount = rolloverSettings.rolloverAmount
                additionalProperties(rolloverSettings.additionalProperties)
            }

            /** The date to expire the rollover credits. */
            @JsonProperty("expires_at")
            fun expiresAt(expiresAt: OffsetDateTime) = apply { this.expiresAt = expiresAt }

            /**
             * The priority to give the rollover credit grant that gets created when a rollover
             * happens.
             */
            @JsonProperty("priority")
            fun priority(priority: Double) = apply { this.priority = priority }

            /** Specify how much to rollover to the rollover credit grant */
            @JsonProperty("rollover_amount")
            fun rolloverAmount(rolloverAmount: RolloverAmount) = apply {
                this.rolloverAmount = rolloverAmount
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

            fun build(): RolloverSettings =
                RolloverSettings(
                    checkNotNull(expiresAt) { "`expiresAt` is required but was not set" },
                    checkNotNull(priority) { "`priority` is required but was not set" },
                    checkNotNull(rolloverAmount) { "`rolloverAmount` is required but was not set" },
                    additionalProperties.toUnmodifiable(),
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

            private var validated: Boolean = false

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

            fun validate(): RolloverAmount = apply {
                if (!validated) {
                    if (rolloverAmountMaxPercentage == null && rolloverAmountMaxAmount == null) {
                        throw MetronomeInvalidDataException("Unknown RolloverAmount: $_json")
                    }
                    rolloverAmountMaxPercentage?.validate()
                    rolloverAmountMaxAmount?.validate()
                    validated = true
                }
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is RolloverAmount &&
                    this.rolloverAmountMaxPercentage == other.rolloverAmountMaxPercentage &&
                    this.rolloverAmountMaxAmount == other.rolloverAmountMaxAmount
            }

            override fun hashCode(): Int {
                return Objects.hash(rolloverAmountMaxPercentage, rolloverAmountMaxAmount)
            }

            override fun toString(): String {
                return when {
                    rolloverAmountMaxPercentage != null ->
                        "RolloverAmount{rolloverAmountMaxPercentage=$rolloverAmountMaxPercentage}"
                    rolloverAmountMaxAmount != null ->
                        "RolloverAmount{rolloverAmountMaxAmount=$rolloverAmountMaxAmount}"
                    _json != null -> "RolloverAmount{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid RolloverAmount")
                }
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
                    tryDeserialize(node, jacksonTypeRef<RolloverAmountMaxPercentage>()) {
                            it.validate()
                        }
                        ?.let {
                            return RolloverAmount(rolloverAmountMaxPercentage = it, _json = json)
                        }
                    tryDeserialize(node, jacksonTypeRef<RolloverAmountMaxAmount>()) {
                            it.validate()
                        }
                        ?.let {
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

            @JsonDeserialize(builder = RolloverAmountMaxPercentage.Builder::class)
            @NoAutoDetect
            class RolloverAmountMaxPercentage
            private constructor(
                private val type: JsonField<Type>,
                private val value: JsonField<Double>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** Rollover up to a percentage of the original credit grant amount. */
                fun type(): Type = type.getRequired("type")

                /** The maximum percentage (0-1) of the original credit grant to rollover. */
                fun value(): Double = value.getRequired("value")

                /** Rollover up to a percentage of the original credit grant amount. */
                @JsonProperty("type") @ExcludeMissing fun _type() = type

                /** The maximum percentage (0-1) of the original credit grant to rollover. */
                @JsonProperty("value") @ExcludeMissing fun _value() = value

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): RolloverAmountMaxPercentage = apply {
                    if (!validated) {
                        type()
                        value()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is RolloverAmountMaxPercentage &&
                        this.type == other.type &&
                        this.value == other.value &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                type,
                                value,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "RolloverAmountMaxPercentage{type=$type, value=$value, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var type: JsonField<Type> = JsonMissing.of()
                    private var value: JsonField<Double> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(rolloverAmountMaxPercentage: RolloverAmountMaxPercentage) =
                        apply {
                            this.type = rolloverAmountMaxPercentage.type
                            this.value = rolloverAmountMaxPercentage.value
                            additionalProperties(rolloverAmountMaxPercentage.additionalProperties)
                        }

                    /** Rollover up to a percentage of the original credit grant amount. */
                    fun type(type: Type) = type(JsonField.of(type))

                    /** Rollover up to a percentage of the original credit grant amount. */
                    @JsonProperty("type")
                    @ExcludeMissing
                    fun type(type: JsonField<Type>) = apply { this.type = type }

                    /** The maximum percentage (0-1) of the original credit grant to rollover. */
                    fun value(value: Double) = value(JsonField.of(value))

                    /** The maximum percentage (0-1) of the original credit grant to rollover. */
                    @JsonProperty("value")
                    @ExcludeMissing
                    fun value(value: JsonField<Double>) = apply { this.value = value }

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

                    fun build(): RolloverAmountMaxPercentage =
                        RolloverAmountMaxPercentage(
                            type,
                            value,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Type
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Type && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        @JvmField val MAX_PERCENTAGE = Type(JsonField.of("MAX_PERCENTAGE"))

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    enum class Known {
                        MAX_PERCENTAGE,
                    }

                    enum class Value {
                        MAX_PERCENTAGE,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            MAX_PERCENTAGE -> Value.MAX_PERCENTAGE
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            MAX_PERCENTAGE -> Known.MAX_PERCENTAGE
                            else -> throw MetronomeInvalidDataException("Unknown Type: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }
            }

            @JsonDeserialize(builder = RolloverAmountMaxAmount.Builder::class)
            @NoAutoDetect
            class RolloverAmountMaxAmount
            private constructor(
                private val type: JsonField<Type>,
                private val value: JsonField<Double>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** Rollover up to a fixed amount of the original credit grant amount. */
                fun type(): Type = type.getRequired("type")

                /** The maximum amount to rollover. */
                fun value(): Double = value.getRequired("value")

                /** Rollover up to a fixed amount of the original credit grant amount. */
                @JsonProperty("type") @ExcludeMissing fun _type() = type

                /** The maximum amount to rollover. */
                @JsonProperty("value") @ExcludeMissing fun _value() = value

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): RolloverAmountMaxAmount = apply {
                    if (!validated) {
                        type()
                        value()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is RolloverAmountMaxAmount &&
                        this.type == other.type &&
                        this.value == other.value &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                type,
                                value,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "RolloverAmountMaxAmount{type=$type, value=$value, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var type: JsonField<Type> = JsonMissing.of()
                    private var value: JsonField<Double> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(rolloverAmountMaxAmount: RolloverAmountMaxAmount) = apply {
                        this.type = rolloverAmountMaxAmount.type
                        this.value = rolloverAmountMaxAmount.value
                        additionalProperties(rolloverAmountMaxAmount.additionalProperties)
                    }

                    /** Rollover up to a fixed amount of the original credit grant amount. */
                    fun type(type: Type) = type(JsonField.of(type))

                    /** Rollover up to a fixed amount of the original credit grant amount. */
                    @JsonProperty("type")
                    @ExcludeMissing
                    fun type(type: JsonField<Type>) = apply { this.type = type }

                    /** The maximum amount to rollover. */
                    fun value(value: Double) = value(JsonField.of(value))

                    /** The maximum amount to rollover. */
                    @JsonProperty("value")
                    @ExcludeMissing
                    fun value(value: JsonField<Double>) = apply { this.value = value }

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

                    fun build(): RolloverAmountMaxAmount =
                        RolloverAmountMaxAmount(
                            type,
                            value,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Type
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Type && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        @JvmField val MAX_AMOUNT = Type(JsonField.of("MAX_AMOUNT"))

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    enum class Known {
                        MAX_AMOUNT,
                    }

                    enum class Value {
                        MAX_AMOUNT,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            MAX_AMOUNT -> Value.MAX_AMOUNT
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            MAX_AMOUNT -> Known.MAX_AMOUNT
                            else -> throw MetronomeInvalidDataException("Unknown Type: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }
            }
        }
    }
}
