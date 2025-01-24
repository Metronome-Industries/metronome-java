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
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.checkRequired
import com.metronome.api.core.getOrThrow
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/** Create a new credit grant */
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

    /** the Metronome ID of the customer */
    fun _customerId(): JsonField<String> = body._customerId()

    /** The credit grant will only apply to usage or charges dated before this timestamp */
    fun _expiresAt(): JsonField<OffsetDateTime> = body._expiresAt()

    /** the amount of credits granted */
    fun _grantAmount(): JsonField<GrantAmount> = body._grantAmount()

    /** the name of the credit grant as it will appear on invoices */
    fun _name(): JsonField<String> = body._name()

    /** the amount paid for this credit grant */
    fun _paidAmount(): JsonField<PaidAmount> = body._paidAmount()

    fun _priority(): JsonField<Double> = body._priority()

    fun _creditGrantType(): JsonField<String> = body._creditGrantType()

    /** Custom fields to attach to the credit grant. */
    fun _customFields(): JsonField<CustomFields> = body._customFields()

    /** The credit grant will only apply to usage or charges dated on or after this timestamp */
    fun _effectiveAt(): JsonField<OffsetDateTime> = body._effectiveAt()

    /** The date to issue an invoice for the paid_amount. */
    fun _invoiceDate(): JsonField<OffsetDateTime> = body._invoiceDate()

    /**
     * The product(s) which these credits will be applied to. (If unspecified, the credits will be
     * applied to charges for all products.). The array ordering specified here will be used to
     * determine the order in which credits will be applied to invoice line items
     */
    fun _productIds(): JsonField<List<String>> = body._productIds()

    fun _reason(): JsonField<String> = body._reason()

    /**
     * Configure a rollover for this credit grant so if it expires it rolls over a configured amount
     * to a new credit grant. This feature is currently opt-in only. Contact Metronome to be added
     * to the beta.
     */
    fun _rolloverSettings(): JsonField<RolloverSettings> = body._rolloverSettings()

    /**
     * Prevents the creation of duplicates. If a request to create a record is made with a
     * previously used uniqueness key, a new record will not be created and the request will fail
     * with a 409 error.
     */
    fun _uniquenessKey(): JsonField<String> = body._uniquenessKey()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getBody(): CreditGrantCreateBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class CreditGrantCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("customer_id")
        @ExcludeMissing
        private val customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("expires_at")
        @ExcludeMissing
        private val expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("grant_amount")
        @ExcludeMissing
        private val grantAmount: JsonField<GrantAmount> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("paid_amount")
        @ExcludeMissing
        private val paidAmount: JsonField<PaidAmount> = JsonMissing.of(),
        @JsonProperty("priority")
        @ExcludeMissing
        private val priority: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("credit_grant_type")
        @ExcludeMissing
        private val creditGrantType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("custom_fields")
        @ExcludeMissing
        private val customFields: JsonField<CustomFields> = JsonMissing.of(),
        @JsonProperty("effective_at")
        @ExcludeMissing
        private val effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("invoice_date")
        @ExcludeMissing
        private val invoiceDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("product_ids")
        @ExcludeMissing
        private val productIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("reason")
        @ExcludeMissing
        private val reason: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rollover_settings")
        @ExcludeMissing
        private val rolloverSettings: JsonField<RolloverSettings> = JsonMissing.of(),
        @JsonProperty("uniqueness_key")
        @ExcludeMissing
        private val uniquenessKey: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** the Metronome ID of the customer */
        fun customerId(): String = customerId.getRequired("customer_id")

        /** The credit grant will only apply to usage or charges dated before this timestamp */
        fun expiresAt(): OffsetDateTime = expiresAt.getRequired("expires_at")

        /** the amount of credits granted */
        fun grantAmount(): GrantAmount = grantAmount.getRequired("grant_amount")

        /** the name of the credit grant as it will appear on invoices */
        fun name(): String = name.getRequired("name")

        /** the amount paid for this credit grant */
        fun paidAmount(): PaidAmount = paidAmount.getRequired("paid_amount")

        fun priority(): Double = priority.getRequired("priority")

        fun creditGrantType(): Optional<String> =
            Optional.ofNullable(creditGrantType.getNullable("credit_grant_type"))

        /** Custom fields to attach to the credit grant. */
        fun customFields(): Optional<CustomFields> =
            Optional.ofNullable(customFields.getNullable("custom_fields"))

        /** The credit grant will only apply to usage or charges dated on or after this timestamp */
        fun effectiveAt(): Optional<OffsetDateTime> =
            Optional.ofNullable(effectiveAt.getNullable("effective_at"))

        /** The date to issue an invoice for the paid_amount. */
        fun invoiceDate(): Optional<OffsetDateTime> =
            Optional.ofNullable(invoiceDate.getNullable("invoice_date"))

        /**
         * The product(s) which these credits will be applied to. (If unspecified, the credits will
         * be applied to charges for all products.). The array ordering specified here will be used
         * to determine the order in which credits will be applied to invoice line items
         */
        fun productIds(): Optional<List<String>> =
            Optional.ofNullable(productIds.getNullable("product_ids"))

        fun reason(): Optional<String> = Optional.ofNullable(reason.getNullable("reason"))

        /**
         * Configure a rollover for this credit grant so if it expires it rolls over a configured
         * amount to a new credit grant. This feature is currently opt-in only. Contact Metronome to
         * be added to the beta.
         */
        fun rolloverSettings(): Optional<RolloverSettings> =
            Optional.ofNullable(rolloverSettings.getNullable("rollover_settings"))

        /**
         * Prevents the creation of duplicates. If a request to create a record is made with a
         * previously used uniqueness key, a new record will not be created and the request will
         * fail with a 409 error.
         */
        fun uniquenessKey(): Optional<String> =
            Optional.ofNullable(uniquenessKey.getNullable("uniqueness_key"))

        /** the Metronome ID of the customer */
        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        /** The credit grant will only apply to usage or charges dated before this timestamp */
        @JsonProperty("expires_at")
        @ExcludeMissing
        fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

        /** the amount of credits granted */
        @JsonProperty("grant_amount")
        @ExcludeMissing
        fun _grantAmount(): JsonField<GrantAmount> = grantAmount

        /** the name of the credit grant as it will appear on invoices */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /** the amount paid for this credit grant */
        @JsonProperty("paid_amount")
        @ExcludeMissing
        fun _paidAmount(): JsonField<PaidAmount> = paidAmount

        @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<Double> = priority

        @JsonProperty("credit_grant_type")
        @ExcludeMissing
        fun _creditGrantType(): JsonField<String> = creditGrantType

        /** Custom fields to attach to the credit grant. */
        @JsonProperty("custom_fields")
        @ExcludeMissing
        fun _customFields(): JsonField<CustomFields> = customFields

        /** The credit grant will only apply to usage or charges dated on or after this timestamp */
        @JsonProperty("effective_at")
        @ExcludeMissing
        fun _effectiveAt(): JsonField<OffsetDateTime> = effectiveAt

        /** The date to issue an invoice for the paid_amount. */
        @JsonProperty("invoice_date")
        @ExcludeMissing
        fun _invoiceDate(): JsonField<OffsetDateTime> = invoiceDate

        /**
         * The product(s) which these credits will be applied to. (If unspecified, the credits will
         * be applied to charges for all products.). The array ordering specified here will be used
         * to determine the order in which credits will be applied to invoice line items
         */
        @JsonProperty("product_ids")
        @ExcludeMissing
        fun _productIds(): JsonField<List<String>> = productIds

        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

        /**
         * Configure a rollover for this credit grant so if it expires it rolls over a configured
         * amount to a new credit grant. This feature is currently opt-in only. Contact Metronome to
         * be added to the beta.
         */
        @JsonProperty("rollover_settings")
        @ExcludeMissing
        fun _rolloverSettings(): JsonField<RolloverSettings> = rolloverSettings

        /**
         * Prevents the creation of duplicates. If a request to create a record is made with a
         * previously used uniqueness key, a new record will not be created and the request will
         * fail with a 409 error.
         */
        @JsonProperty("uniqueness_key")
        @ExcludeMissing
        fun _uniquenessKey(): JsonField<String> = uniquenessKey

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CreditGrantCreateBody = apply {
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

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

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
                productIds = creditGrantCreateBody.productIds.map { it.toMutableList() }
                reason = creditGrantCreateBody.reason
                rolloverSettings = creditGrantCreateBody.rolloverSettings
                uniquenessKey = creditGrantCreateBody.uniquenessKey
                additionalProperties = creditGrantCreateBody.additionalProperties.toMutableMap()
            }

            /** the Metronome ID of the customer */
            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            /** the Metronome ID of the customer */
            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            /** The credit grant will only apply to usage or charges dated before this timestamp */
            fun expiresAt(expiresAt: OffsetDateTime) = expiresAt(JsonField.of(expiresAt))

            /** The credit grant will only apply to usage or charges dated before this timestamp */
            fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply {
                this.expiresAt = expiresAt
            }

            /** the amount of credits granted */
            fun grantAmount(grantAmount: GrantAmount) = grantAmount(JsonField.of(grantAmount))

            /** the amount of credits granted */
            fun grantAmount(grantAmount: JsonField<GrantAmount>) = apply {
                this.grantAmount = grantAmount
            }

            /** the name of the credit grant as it will appear on invoices */
            fun name(name: String) = name(JsonField.of(name))

            /** the name of the credit grant as it will appear on invoices */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** the amount paid for this credit grant */
            fun paidAmount(paidAmount: PaidAmount) = paidAmount(JsonField.of(paidAmount))

            /** the amount paid for this credit grant */
            fun paidAmount(paidAmount: JsonField<PaidAmount>) = apply {
                this.paidAmount = paidAmount
            }

            fun priority(priority: Double) = priority(JsonField.of(priority))

            fun priority(priority: JsonField<Double>) = apply { this.priority = priority }

            fun creditGrantType(creditGrantType: String) =
                creditGrantType(JsonField.of(creditGrantType))

            fun creditGrantType(creditGrantType: JsonField<String>) = apply {
                this.creditGrantType = creditGrantType
            }

            /** Custom fields to attach to the credit grant. */
            fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

            /** Custom fields to attach to the credit grant. */
            fun customFields(customFields: JsonField<CustomFields>) = apply {
                this.customFields = customFields
            }

            /**
             * The credit grant will only apply to usage or charges dated on or after this timestamp
             */
            fun effectiveAt(effectiveAt: OffsetDateTime) = effectiveAt(JsonField.of(effectiveAt))

            /**
             * The credit grant will only apply to usage or charges dated on or after this timestamp
             */
            fun effectiveAt(effectiveAt: JsonField<OffsetDateTime>) = apply {
                this.effectiveAt = effectiveAt
            }

            /** The date to issue an invoice for the paid_amount. */
            fun invoiceDate(invoiceDate: OffsetDateTime) = invoiceDate(JsonField.of(invoiceDate))

            /** The date to issue an invoice for the paid_amount. */
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
             * The product(s) which these credits will be applied to. (If unspecified, the credits
             * will be applied to charges for all products.). The array ordering specified here will
             * be used to determine the order in which credits will be applied to invoice line items
             */
            fun productIds(productIds: JsonField<List<String>>) = apply {
                this.productIds = productIds.map { it.toMutableList() }
            }

            /**
             * The product(s) which these credits will be applied to. (If unspecified, the credits
             * will be applied to charges for all products.). The array ordering specified here will
             * be used to determine the order in which credits will be applied to invoice line items
             */
            fun addProductId(productId: String) = apply {
                productIds =
                    (productIds ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(productId)
                    }
            }

            fun reason(reason: String) = reason(JsonField.of(reason))

            fun reason(reason: JsonField<String>) = apply { this.reason = reason }

            /**
             * Configure a rollover for this credit grant so if it expires it rolls over a
             * configured amount to a new credit grant. This feature is currently opt-in only.
             * Contact Metronome to be added to the beta.
             */
            fun rolloverSettings(rolloverSettings: RolloverSettings) =
                rolloverSettings(JsonField.of(rolloverSettings))

            /**
             * Configure a rollover for this credit grant so if it expires it rolls over a
             * configured amount to a new credit grant. This feature is currently opt-in only.
             * Contact Metronome to be added to the beta.
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

            fun build(): CreditGrantCreateBody =
                CreditGrantCreateBody(
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

        /** the Metronome ID of the customer */
        fun customerId(customerId: JsonField<String>) = apply { body.customerId(customerId) }

        /** The credit grant will only apply to usage or charges dated before this timestamp */
        fun expiresAt(expiresAt: OffsetDateTime) = apply { body.expiresAt(expiresAt) }

        /** The credit grant will only apply to usage or charges dated before this timestamp */
        fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply { body.expiresAt(expiresAt) }

        /** the amount of credits granted */
        fun grantAmount(grantAmount: GrantAmount) = apply { body.grantAmount(grantAmount) }

        /** the amount of credits granted */
        fun grantAmount(grantAmount: JsonField<GrantAmount>) = apply {
            body.grantAmount(grantAmount)
        }

        /** the name of the credit grant as it will appear on invoices */
        fun name(name: String) = apply { body.name(name) }

        /** the name of the credit grant as it will appear on invoices */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** the amount paid for this credit grant */
        fun paidAmount(paidAmount: PaidAmount) = apply { body.paidAmount(paidAmount) }

        /** the amount paid for this credit grant */
        fun paidAmount(paidAmount: JsonField<PaidAmount>) = apply { body.paidAmount(paidAmount) }

        fun priority(priority: Double) = apply { body.priority(priority) }

        fun priority(priority: JsonField<Double>) = apply { body.priority(priority) }

        fun creditGrantType(creditGrantType: String) = apply {
            body.creditGrantType(creditGrantType)
        }

        fun creditGrantType(creditGrantType: JsonField<String>) = apply {
            body.creditGrantType(creditGrantType)
        }

        /** Custom fields to attach to the credit grant. */
        fun customFields(customFields: CustomFields) = apply { body.customFields(customFields) }

        /** Custom fields to attach to the credit grant. */
        fun customFields(customFields: JsonField<CustomFields>) = apply {
            body.customFields(customFields)
        }

        /** The credit grant will only apply to usage or charges dated on or after this timestamp */
        fun effectiveAt(effectiveAt: OffsetDateTime) = apply { body.effectiveAt(effectiveAt) }

        /** The credit grant will only apply to usage or charges dated on or after this timestamp */
        fun effectiveAt(effectiveAt: JsonField<OffsetDateTime>) = apply {
            body.effectiveAt(effectiveAt)
        }

        /** The date to issue an invoice for the paid_amount. */
        fun invoiceDate(invoiceDate: OffsetDateTime) = apply { body.invoiceDate(invoiceDate) }

        /** The date to issue an invoice for the paid_amount. */
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
         * The product(s) which these credits will be applied to. (If unspecified, the credits will
         * be applied to charges for all products.). The array ordering specified here will be used
         * to determine the order in which credits will be applied to invoice line items
         */
        fun productIds(productIds: JsonField<List<String>>) = apply { body.productIds(productIds) }

        /**
         * The product(s) which these credits will be applied to. (If unspecified, the credits will
         * be applied to charges for all products.). The array ordering specified here will be used
         * to determine the order in which credits will be applied to invoice line items
         */
        fun addProductId(productId: String) = apply { body.addProductId(productId) }

        fun reason(reason: String) = apply { body.reason(reason) }

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
         * Configure a rollover for this credit grant so if it expires it rolls over a configured
         * amount to a new credit grant. This feature is currently opt-in only. Contact Metronome to
         * be added to the beta.
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
         * Prevents the creation of duplicates. If a request to create a record is made with a
         * previously used uniqueness key, a new record will not be created and the request will
         * fail with a 409 error.
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
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("credit_type_id")
        @ExcludeMissing
        private val creditTypeId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun amount(): Double = amount.getRequired("amount")

        /** the ID of the pricing unit to be used. Defaults to USD (cents) if not passed. */
        fun creditTypeId(): String = creditTypeId.getRequired("credit_type_id")

        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

        /** the ID of the pricing unit to be used. Defaults to USD (cents) if not passed. */
        @JsonProperty("credit_type_id")
        @ExcludeMissing
        fun _creditTypeId(): JsonField<String> = creditTypeId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): GrantAmount = apply {
            if (validated) {
                return@apply
            }

            amount()
            creditTypeId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

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

            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            /** the ID of the pricing unit to be used. Defaults to USD (cents) if not passed. */
            fun creditTypeId(creditTypeId: String) = creditTypeId(JsonField.of(creditTypeId))

            /** the ID of the pricing unit to be used. Defaults to USD (cents) if not passed. */
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

            fun build(): GrantAmount =
                GrantAmount(
                    checkRequired("amount", amount),
                    checkRequired("creditTypeId", creditTypeId),
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
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("credit_type_id")
        @ExcludeMissing
        private val creditTypeId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun amount(): Double = amount.getRequired("amount")

        /** the ID of the pricing unit to be used. Defaults to USD (cents) if not passed. */
        fun creditTypeId(): String = creditTypeId.getRequired("credit_type_id")

        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

        /** the ID of the pricing unit to be used. Defaults to USD (cents) if not passed. */
        @JsonProperty("credit_type_id")
        @ExcludeMissing
        fun _creditTypeId(): JsonField<String> = creditTypeId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): PaidAmount = apply {
            if (validated) {
                return@apply
            }

            amount()
            creditTypeId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

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

            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            /** the ID of the pricing unit to be used. Defaults to USD (cents) if not passed. */
            fun creditTypeId(creditTypeId: String) = creditTypeId(JsonField.of(creditTypeId))

            /** the ID of the pricing unit to be used. Defaults to USD (cents) if not passed. */
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

            fun build(): PaidAmount =
                PaidAmount(
                    checkRequired("amount", amount),
                    checkRequired("creditTypeId", creditTypeId),
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

    /**
     * Configure a rollover for this credit grant so if it expires it rolls over a configured amount
     * to a new credit grant. This feature is currently opt-in only. Contact Metronome to be added
     * to the beta.
     */
    @NoAutoDetect
    class RolloverSettings
    @JsonCreator
    private constructor(
        @JsonProperty("expires_at")
        @ExcludeMissing
        private val expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("priority")
        @ExcludeMissing
        private val priority: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("rollover_amount")
        @ExcludeMissing
        private val rolloverAmount: JsonField<RolloverAmount> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The date to expire the rollover credits. */
        fun expiresAt(): OffsetDateTime = expiresAt.getRequired("expires_at")

        /**
         * The priority to give the rollover credit grant that gets created when a rollover happens.
         */
        fun priority(): Double = priority.getRequired("priority")

        /** Specify how much to rollover to the rollover credit grant */
        fun rolloverAmount(): RolloverAmount = rolloverAmount.getRequired("rollover_amount")

        /** The date to expire the rollover credits. */
        @JsonProperty("expires_at")
        @ExcludeMissing
        fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

        /**
         * The priority to give the rollover credit grant that gets created when a rollover happens.
         */
        @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<Double> = priority

        /** Specify how much to rollover to the rollover credit grant */
        @JsonProperty("rollover_amount")
        @ExcludeMissing
        fun _rolloverAmount(): JsonField<RolloverAmount> = rolloverAmount

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): RolloverSettings = apply {
            if (validated) {
                return@apply
            }

            expiresAt()
            priority()
            rolloverAmount().validate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

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

            /** The date to expire the rollover credits. */
            fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply {
                this.expiresAt = expiresAt
            }

            /**
             * The priority to give the rollover credit grant that gets created when a rollover
             * happens.
             */
            fun priority(priority: Double) = priority(JsonField.of(priority))

            /**
             * The priority to give the rollover credit grant that gets created when a rollover
             * happens.
             */
            fun priority(priority: JsonField<Double>) = apply { this.priority = priority }

            /** Specify how much to rollover to the rollover credit grant */
            fun rolloverAmount(rolloverAmount: RolloverAmount) =
                rolloverAmount(JsonField.of(rolloverAmount))

            /** Specify how much to rollover to the rollover credit grant */
            fun rolloverAmount(rolloverAmount: JsonField<RolloverAmount>) = apply {
                this.rolloverAmount = rolloverAmount
            }

            /** Specify how much to rollover to the rollover credit grant */
            fun rolloverAmount(maxPercentage: RolloverAmountMaxPercentage) =
                rolloverAmount(RolloverAmount.ofMaxPercentage(maxPercentage))

            /** Specify how much to rollover to the rollover credit grant */
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

            fun build(): RolloverSettings =
                RolloverSettings(
                    checkRequired("expiresAt", expiresAt),
                    checkRequired("priority", priority),
                    checkRequired("rolloverAmount", rolloverAmount),
                    additionalProperties.toImmutable(),
                )
        }

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

            fun <T> accept(visitor: Visitor<T>): T {
                return when {
                    maxPercentage != null -> visitor.visitMaxPercentage(maxPercentage)
                    max != null -> visitor.visitMax(max)
                    else -> visitor.unknown(_json)
                }
            }

            private var validated: Boolean = false

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is RolloverAmount && maxPercentage == other.maxPercentage && max == other.max /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(maxPercentage, max) /* spotless:on */

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

            interface Visitor<out T> {

                fun visitMaxPercentage(maxPercentage: RolloverAmountMaxPercentage): T

                fun visitMax(max: RolloverAmountMaxAmount): T

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
                            return RolloverAmount(maxPercentage = it, _json = json)
                        }
                    tryDeserialize(node, jacksonTypeRef<RolloverAmountMaxAmount>()) {
                            it.validate()
                        }
                        ?.let {
                            return RolloverAmount(max = it, _json = json)
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
