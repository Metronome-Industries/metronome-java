// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.metronome.api.core.Enum
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.toUnmodifiable
import com.metronome.api.errors.MetronomeInvalidDataException
import com.metronome.api.models.*
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

class CustomerPlanAddParams
constructor(
    private val customerId: String,
    private val planId: String,
    private val startingOn: OffsetDateTime,
    private val endingBefore: OffsetDateTime?,
    private val netPaymentTermsDays: Double?,
    private val overageRateAdjustments: List<OverageRateAdjustment>?,
    private val priceAdjustments: List<PriceAdjustment>?,
    private val trialSpec: TrialSpec?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun customerId(): String = customerId

    fun planId(): String = planId

    fun startingOn(): OffsetDateTime = startingOn

    fun endingBefore(): Optional<OffsetDateTime> = Optional.ofNullable(endingBefore)

    fun netPaymentTermsDays(): Optional<Double> = Optional.ofNullable(netPaymentTermsDays)

    fun overageRateAdjustments(): Optional<List<OverageRateAdjustment>> =
        Optional.ofNullable(overageRateAdjustments)

    fun priceAdjustments(): Optional<List<PriceAdjustment>> = Optional.ofNullable(priceAdjustments)

    fun trialSpec(): Optional<TrialSpec> = Optional.ofNullable(trialSpec)

    @JvmSynthetic
    internal fun getBody(): CustomerPlanAddBody {
        return CustomerPlanAddBody(
            planId,
            startingOn,
            endingBefore,
            netPaymentTermsDays,
            overageRateAdjustments,
            priceAdjustments,
            trialSpec,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> customerId
            else -> ""
        }
    }

    @JsonDeserialize(builder = CustomerPlanAddBody.Builder::class)
    @NoAutoDetect
    class CustomerPlanAddBody
    internal constructor(
        private val planId: String?,
        private val startingOn: OffsetDateTime?,
        private val endingBefore: OffsetDateTime?,
        private val netPaymentTermsDays: Double?,
        private val overageRateAdjustments: List<OverageRateAdjustment>?,
        private val priceAdjustments: List<PriceAdjustment>?,
        private val trialSpec: TrialSpec?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("plan_id") fun planId(): String? = planId

        /**
         * RFC 3339 timestamp for when the plan becomes active for this customer. Must be at 0:00
         * UTC (midnight).
         */
        @JsonProperty("starting_on") fun startingOn(): OffsetDateTime? = startingOn

        /**
         * RFC 3339 timestamp for when the plan ends (exclusive) for this customer. Must be at 0:00
         * UTC (midnight).
         */
        @JsonProperty("ending_before") fun endingBefore(): OffsetDateTime? = endingBefore

        /**
         * Number of days after issuance of invoice after which the invoice is due (e.g. Net 30).
         */
        @JsonProperty("net_payment_terms_days")
        fun netPaymentTermsDays(): Double? = netPaymentTermsDays

        /**
         * An optional list of overage rates that override the rates of the original plan
         * configuration. These new rates will apply to all pricing ramps.
         */
        @JsonProperty("overage_rate_adjustments")
        fun overageRateAdjustments(): List<OverageRateAdjustment>? = overageRateAdjustments

        /**
         * A list of price adjustments can be applied on top of the pricing in the plans. See the
         * [price adjustments documentation](https://docs.metronome.com/pricing/managing-plans/#price-adjustments)
         * for details.
         */
        @JsonProperty("price_adjustments")
        fun priceAdjustments(): List<PriceAdjustment>? = priceAdjustments

        /**
         * A custom trial can be set for the customer's plan. See the
         * [trial configuration documentation](https://docs.metronome.com/provisioning/configure-trials/)
         * for details.
         */
        @JsonProperty("trial_spec") fun trialSpec(): TrialSpec? = trialSpec

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var planId: String? = null
            private var startingOn: OffsetDateTime? = null
            private var endingBefore: OffsetDateTime? = null
            private var netPaymentTermsDays: Double? = null
            private var overageRateAdjustments: List<OverageRateAdjustment>? = null
            private var priceAdjustments: List<PriceAdjustment>? = null
            private var trialSpec: TrialSpec? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customerPlanAddBody: CustomerPlanAddBody) = apply {
                this.planId = customerPlanAddBody.planId
                this.startingOn = customerPlanAddBody.startingOn
                this.endingBefore = customerPlanAddBody.endingBefore
                this.netPaymentTermsDays = customerPlanAddBody.netPaymentTermsDays
                this.overageRateAdjustments = customerPlanAddBody.overageRateAdjustments
                this.priceAdjustments = customerPlanAddBody.priceAdjustments
                this.trialSpec = customerPlanAddBody.trialSpec
                additionalProperties(customerPlanAddBody.additionalProperties)
            }

            @JsonProperty("plan_id") fun planId(planId: String) = apply { this.planId = planId }

            /**
             * RFC 3339 timestamp for when the plan becomes active for this customer. Must be at
             * 0:00 UTC (midnight).
             */
            @JsonProperty("starting_on")
            fun startingOn(startingOn: OffsetDateTime) = apply { this.startingOn = startingOn }

            /**
             * RFC 3339 timestamp for when the plan ends (exclusive) for this customer. Must be at
             * 0:00 UTC (midnight).
             */
            @JsonProperty("ending_before")
            fun endingBefore(endingBefore: OffsetDateTime) = apply {
                this.endingBefore = endingBefore
            }

            /**
             * Number of days after issuance of invoice after which the invoice is due (e.g. Net
             * 30).
             */
            @JsonProperty("net_payment_terms_days")
            fun netPaymentTermsDays(netPaymentTermsDays: Double) = apply {
                this.netPaymentTermsDays = netPaymentTermsDays
            }

            /**
             * An optional list of overage rates that override the rates of the original plan
             * configuration. These new rates will apply to all pricing ramps.
             */
            @JsonProperty("overage_rate_adjustments")
            fun overageRateAdjustments(overageRateAdjustments: List<OverageRateAdjustment>) =
                apply {
                    this.overageRateAdjustments = overageRateAdjustments
                }

            /**
             * A list of price adjustments can be applied on top of the pricing in the plans. See
             * the
             * [price adjustments documentation](https://docs.metronome.com/pricing/managing-plans/#price-adjustments)
             * for details.
             */
            @JsonProperty("price_adjustments")
            fun priceAdjustments(priceAdjustments: List<PriceAdjustment>) = apply {
                this.priceAdjustments = priceAdjustments
            }

            /**
             * A custom trial can be set for the customer's plan. See the
             * [trial configuration documentation](https://docs.metronome.com/provisioning/configure-trials/)
             * for details.
             */
            @JsonProperty("trial_spec")
            fun trialSpec(trialSpec: TrialSpec) = apply { this.trialSpec = trialSpec }

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

            fun build(): CustomerPlanAddBody =
                CustomerPlanAddBody(
                    checkNotNull(planId) { "`planId` is required but was not set" },
                    checkNotNull(startingOn) { "`startingOn` is required but was not set" },
                    endingBefore,
                    netPaymentTermsDays,
                    overageRateAdjustments?.toUnmodifiable(),
                    priceAdjustments?.toUnmodifiable(),
                    trialSpec,
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CustomerPlanAddBody && this.planId == other.planId && this.startingOn == other.startingOn && this.endingBefore == other.endingBefore && this.netPaymentTermsDays == other.netPaymentTermsDays && this.overageRateAdjustments == other.overageRateAdjustments && this.priceAdjustments == other.priceAdjustments && this.trialSpec == other.trialSpec && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(planId, startingOn, endingBefore, netPaymentTermsDays, overageRateAdjustments, priceAdjustments, trialSpec, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "CustomerPlanAddBody{planId=$planId, startingOn=$startingOn, endingBefore=$endingBefore, netPaymentTermsDays=$netPaymentTermsDays, overageRateAdjustments=$overageRateAdjustments, priceAdjustments=$priceAdjustments, trialSpec=$trialSpec, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerPlanAddParams && this.customerId == other.customerId && this.planId == other.planId && this.startingOn == other.startingOn && this.endingBefore == other.endingBefore && this.netPaymentTermsDays == other.netPaymentTermsDays && this.overageRateAdjustments == other.overageRateAdjustments && this.priceAdjustments == other.priceAdjustments && this.trialSpec == other.trialSpec && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(customerId, planId, startingOn, endingBefore, netPaymentTermsDays, overageRateAdjustments, priceAdjustments, trialSpec, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "CustomerPlanAddParams{customerId=$customerId, planId=$planId, startingOn=$startingOn, endingBefore=$endingBefore, netPaymentTermsDays=$netPaymentTermsDays, overageRateAdjustments=$overageRateAdjustments, priceAdjustments=$priceAdjustments, trialSpec=$trialSpec, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var customerId: String? = null
        private var planId: String? = null
        private var startingOn: OffsetDateTime? = null
        private var endingBefore: OffsetDateTime? = null
        private var netPaymentTermsDays: Double? = null
        private var overageRateAdjustments: MutableList<OverageRateAdjustment> = mutableListOf()
        private var priceAdjustments: MutableList<PriceAdjustment> = mutableListOf()
        private var trialSpec: TrialSpec? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customerPlanAddParams: CustomerPlanAddParams) = apply {
            this.customerId = customerPlanAddParams.customerId
            this.planId = customerPlanAddParams.planId
            this.startingOn = customerPlanAddParams.startingOn
            this.endingBefore = customerPlanAddParams.endingBefore
            this.netPaymentTermsDays = customerPlanAddParams.netPaymentTermsDays
            this.overageRateAdjustments(customerPlanAddParams.overageRateAdjustments ?: listOf())
            this.priceAdjustments(customerPlanAddParams.priceAdjustments ?: listOf())
            this.trialSpec = customerPlanAddParams.trialSpec
            additionalQueryParams(customerPlanAddParams.additionalQueryParams)
            additionalHeaders(customerPlanAddParams.additionalHeaders)
            additionalBodyProperties(customerPlanAddParams.additionalBodyProperties)
        }

        fun customerId(customerId: String) = apply { this.customerId = customerId }

        fun planId(planId: String) = apply { this.planId = planId }

        /**
         * RFC 3339 timestamp for when the plan becomes active for this customer. Must be at 0:00
         * UTC (midnight).
         */
        fun startingOn(startingOn: OffsetDateTime) = apply { this.startingOn = startingOn }

        /**
         * RFC 3339 timestamp for when the plan ends (exclusive) for this customer. Must be at 0:00
         * UTC (midnight).
         */
        fun endingBefore(endingBefore: OffsetDateTime) = apply { this.endingBefore = endingBefore }

        /**
         * Number of days after issuance of invoice after which the invoice is due (e.g. Net 30).
         */
        fun netPaymentTermsDays(netPaymentTermsDays: Double) = apply {
            this.netPaymentTermsDays = netPaymentTermsDays
        }

        /**
         * An optional list of overage rates that override the rates of the original plan
         * configuration. These new rates will apply to all pricing ramps.
         */
        fun overageRateAdjustments(overageRateAdjustments: List<OverageRateAdjustment>) = apply {
            this.overageRateAdjustments.clear()
            this.overageRateAdjustments.addAll(overageRateAdjustments)
        }

        /**
         * An optional list of overage rates that override the rates of the original plan
         * configuration. These new rates will apply to all pricing ramps.
         */
        fun addOverageRateAdjustment(overageRateAdjustment: OverageRateAdjustment) = apply {
            this.overageRateAdjustments.add(overageRateAdjustment)
        }

        /**
         * A list of price adjustments can be applied on top of the pricing in the plans. See the
         * [price adjustments documentation](https://docs.metronome.com/pricing/managing-plans/#price-adjustments)
         * for details.
         */
        fun priceAdjustments(priceAdjustments: List<PriceAdjustment>) = apply {
            this.priceAdjustments.clear()
            this.priceAdjustments.addAll(priceAdjustments)
        }

        /**
         * A list of price adjustments can be applied on top of the pricing in the plans. See the
         * [price adjustments documentation](https://docs.metronome.com/pricing/managing-plans/#price-adjustments)
         * for details.
         */
        fun addPriceAdjustment(priceAdjustment: PriceAdjustment) = apply {
            this.priceAdjustments.add(priceAdjustment)
        }

        /**
         * A custom trial can be set for the customer's plan. See the
         * [trial configuration documentation](https://docs.metronome.com/provisioning/configure-trials/)
         * for details.
         */
        fun trialSpec(trialSpec: TrialSpec) = apply { this.trialSpec = trialSpec }

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

        fun build(): CustomerPlanAddParams =
            CustomerPlanAddParams(
                checkNotNull(customerId) { "`customerId` is required but was not set" },
                checkNotNull(planId) { "`planId` is required but was not set" },
                checkNotNull(startingOn) { "`startingOn` is required but was not set" },
                endingBefore,
                netPaymentTermsDays,
                if (overageRateAdjustments.size == 0) null
                else overageRateAdjustments.toUnmodifiable(),
                if (priceAdjustments.size == 0) null else priceAdjustments.toUnmodifiable(),
                trialSpec,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = OverageRateAdjustment.Builder::class)
    @NoAutoDetect
    class OverageRateAdjustment
    private constructor(
        private val customCreditTypeId: String?,
        private val fiatCurrencyCreditTypeId: String?,
        private val toFiatConversionFactor: Double?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("custom_credit_type_id")
        fun customCreditTypeId(): String? = customCreditTypeId

        @JsonProperty("fiat_currency_credit_type_id")
        fun fiatCurrencyCreditTypeId(): String? = fiatCurrencyCreditTypeId

        /** The overage cost in fiat currency for each credit of the custom credit type. */
        @JsonProperty("to_fiat_conversion_factor")
        fun toFiatConversionFactor(): Double? = toFiatConversionFactor

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var customCreditTypeId: String? = null
            private var fiatCurrencyCreditTypeId: String? = null
            private var toFiatConversionFactor: Double? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(overageRateAdjustment: OverageRateAdjustment) = apply {
                this.customCreditTypeId = overageRateAdjustment.customCreditTypeId
                this.fiatCurrencyCreditTypeId = overageRateAdjustment.fiatCurrencyCreditTypeId
                this.toFiatConversionFactor = overageRateAdjustment.toFiatConversionFactor
                additionalProperties(overageRateAdjustment.additionalProperties)
            }

            @JsonProperty("custom_credit_type_id")
            fun customCreditTypeId(customCreditTypeId: String) = apply {
                this.customCreditTypeId = customCreditTypeId
            }

            @JsonProperty("fiat_currency_credit_type_id")
            fun fiatCurrencyCreditTypeId(fiatCurrencyCreditTypeId: String) = apply {
                this.fiatCurrencyCreditTypeId = fiatCurrencyCreditTypeId
            }

            /** The overage cost in fiat currency for each credit of the custom credit type. */
            @JsonProperty("to_fiat_conversion_factor")
            fun toFiatConversionFactor(toFiatConversionFactor: Double) = apply {
                this.toFiatConversionFactor = toFiatConversionFactor
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

            fun build(): OverageRateAdjustment =
                OverageRateAdjustment(
                    checkNotNull(customCreditTypeId) {
                        "`customCreditTypeId` is required but was not set"
                    },
                    checkNotNull(fiatCurrencyCreditTypeId) {
                        "`fiatCurrencyCreditTypeId` is required but was not set"
                    },
                    checkNotNull(toFiatConversionFactor) {
                        "`toFiatConversionFactor` is required but was not set"
                    },
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is OverageRateAdjustment && this.customCreditTypeId == other.customCreditTypeId && this.fiatCurrencyCreditTypeId == other.fiatCurrencyCreditTypeId && this.toFiatConversionFactor == other.toFiatConversionFactor && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(customCreditTypeId, fiatCurrencyCreditTypeId, toFiatConversionFactor, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "OverageRateAdjustment{customCreditTypeId=$customCreditTypeId, fiatCurrencyCreditTypeId=$fiatCurrencyCreditTypeId, toFiatConversionFactor=$toFiatConversionFactor, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = PriceAdjustment.Builder::class)
    @NoAutoDetect
    class PriceAdjustment
    private constructor(
        private val chargeId: String?,
        private val adjustmentType: AdjustmentType?,
        private val value: Double?,
        private val quantity: Double?,
        private val tier: Double?,
        private val startPeriod: Double?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("charge_id") fun chargeId(): String? = chargeId

        @JsonProperty("adjustment_type") fun adjustmentType(): AdjustmentType? = adjustmentType

        /**
         * The amount of change to a price. Percentage and fixed adjustments can be positive or
         * negative. Percentage-based adjustments should be decimals, e.g. -0.05 for a 5% discount.
         */
        @JsonProperty("value") fun value(): Double? = value

        /** the overridden quantity for a fixed charge */
        @JsonProperty("quantity") fun quantity(): Double? = quantity

        /** Used in pricing tiers. Indicates at what metric value the price applies. */
        @JsonProperty("tier") fun tier(): Double? = tier

        /**
         * Used in price ramps. Indicates how many billing periods pass before the charge applies.
         */
        @JsonProperty("start_period") fun startPeriod(): Double? = startPeriod

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var chargeId: String? = null
            private var adjustmentType: AdjustmentType? = null
            private var value: Double? = null
            private var quantity: Double? = null
            private var tier: Double? = null
            private var startPeriod: Double? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(priceAdjustment: PriceAdjustment) = apply {
                this.chargeId = priceAdjustment.chargeId
                this.adjustmentType = priceAdjustment.adjustmentType
                this.value = priceAdjustment.value
                this.quantity = priceAdjustment.quantity
                this.tier = priceAdjustment.tier
                this.startPeriod = priceAdjustment.startPeriod
                additionalProperties(priceAdjustment.additionalProperties)
            }

            @JsonProperty("charge_id")
            fun chargeId(chargeId: String) = apply { this.chargeId = chargeId }

            @JsonProperty("adjustment_type")
            fun adjustmentType(adjustmentType: AdjustmentType) = apply {
                this.adjustmentType = adjustmentType
            }

            /**
             * The amount of change to a price. Percentage and fixed adjustments can be positive or
             * negative. Percentage-based adjustments should be decimals, e.g. -0.05 for a 5%
             * discount.
             */
            @JsonProperty("value") fun value(value: Double) = apply { this.value = value }

            /** the overridden quantity for a fixed charge */
            @JsonProperty("quantity")
            fun quantity(quantity: Double) = apply { this.quantity = quantity }

            /** Used in pricing tiers. Indicates at what metric value the price applies. */
            @JsonProperty("tier") fun tier(tier: Double) = apply { this.tier = tier }

            /**
             * Used in price ramps. Indicates how many billing periods pass before the charge
             * applies.
             */
            @JsonProperty("start_period")
            fun startPeriod(startPeriod: Double) = apply { this.startPeriod = startPeriod }

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

            fun build(): PriceAdjustment =
                PriceAdjustment(
                    checkNotNull(chargeId) { "`chargeId` is required but was not set" },
                    checkNotNull(adjustmentType) { "`adjustmentType` is required but was not set" },
                    value,
                    quantity,
                    tier,
                    checkNotNull(startPeriod) { "`startPeriod` is required but was not set" },
                    additionalProperties.toUnmodifiable(),
                )
        }

        class AdjustmentType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AdjustmentType && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val PERCENTAGE = AdjustmentType(JsonField.of("percentage"))

                @JvmField val FIXED = AdjustmentType(JsonField.of("fixed"))

                @JvmField val OVERRIDE = AdjustmentType(JsonField.of("override"))

                @JvmField val QUANTITY = AdjustmentType(JsonField.of("quantity"))

                @JvmStatic fun of(value: String) = AdjustmentType(JsonField.of(value))
            }

            enum class Known {
                PERCENTAGE,
                FIXED,
                OVERRIDE,
                QUANTITY,
            }

            enum class Value {
                PERCENTAGE,
                FIXED,
                OVERRIDE,
                QUANTITY,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    PERCENTAGE -> Value.PERCENTAGE
                    FIXED -> Value.FIXED
                    OVERRIDE -> Value.OVERRIDE
                    QUANTITY -> Value.QUANTITY
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    PERCENTAGE -> Known.PERCENTAGE
                    FIXED -> Known.FIXED
                    OVERRIDE -> Known.OVERRIDE
                    QUANTITY -> Known.QUANTITY
                    else -> throw MetronomeInvalidDataException("Unknown AdjustmentType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PriceAdjustment && this.chargeId == other.chargeId && this.adjustmentType == other.adjustmentType && this.value == other.value && this.quantity == other.quantity && this.tier == other.tier && this.startPeriod == other.startPeriod && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(chargeId, adjustmentType, value, quantity, tier, startPeriod, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "PriceAdjustment{chargeId=$chargeId, adjustmentType=$adjustmentType, value=$value, quantity=$quantity, tier=$tier, startPeriod=$startPeriod, additionalProperties=$additionalProperties}"
    }

    /**
     * A custom trial can be set for the customer's plan. See the
     * [trial configuration documentation](https://docs.metronome.com/provisioning/configure-trials/)
     * for details.
     */
    @JsonDeserialize(builder = TrialSpec.Builder::class)
    @NoAutoDetect
    class TrialSpec
    private constructor(
        private val lengthInDays: Double?,
        private val spendingCap: SpendingCap?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** Length of the trial period in days. */
        @JsonProperty("length_in_days") fun lengthInDays(): Double? = lengthInDays

        @JsonProperty("spending_cap") fun spendingCap(): SpendingCap? = spendingCap

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var lengthInDays: Double? = null
            private var spendingCap: SpendingCap? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(trialSpec: TrialSpec) = apply {
                this.lengthInDays = trialSpec.lengthInDays
                this.spendingCap = trialSpec.spendingCap
                additionalProperties(trialSpec.additionalProperties)
            }

            /** Length of the trial period in days. */
            @JsonProperty("length_in_days")
            fun lengthInDays(lengthInDays: Double) = apply { this.lengthInDays = lengthInDays }

            @JsonProperty("spending_cap")
            fun spendingCap(spendingCap: SpendingCap) = apply { this.spendingCap = spendingCap }

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

            fun build(): TrialSpec =
                TrialSpec(
                    checkNotNull(lengthInDays) { "`lengthInDays` is required but was not set" },
                    spendingCap,
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = SpendingCap.Builder::class)
        @NoAutoDetect
        class SpendingCap
        private constructor(
            private val creditTypeId: String?,
            private val amount: Double?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The credit type ID for the spending cap. */
            @JsonProperty("credit_type_id") fun creditTypeId(): String? = creditTypeId

            /**
             * The credit amount in the given denomination based on the credit type, e.g. US cents.
             */
            @JsonProperty("amount") fun amount(): Double? = amount

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var creditTypeId: String? = null
                private var amount: Double? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(spendingCap: SpendingCap) = apply {
                    this.creditTypeId = spendingCap.creditTypeId
                    this.amount = spendingCap.amount
                    additionalProperties(spendingCap.additionalProperties)
                }

                /** The credit type ID for the spending cap. */
                @JsonProperty("credit_type_id")
                fun creditTypeId(creditTypeId: String) = apply { this.creditTypeId = creditTypeId }

                /**
                 * The credit amount in the given denomination based on the credit type, e.g. US
                 * cents.
                 */
                @JsonProperty("amount") fun amount(amount: Double) = apply { this.amount = amount }

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

                fun build(): SpendingCap =
                    SpendingCap(
                        checkNotNull(creditTypeId) { "`creditTypeId` is required but was not set" },
                        checkNotNull(amount) { "`amount` is required but was not set" },
                        additionalProperties.toUnmodifiable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is SpendingCap && this.creditTypeId == other.creditTypeId && this.amount == other.amount && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(creditTypeId, amount, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "SpendingCap{creditTypeId=$creditTypeId, amount=$amount, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TrialSpec && this.lengthInDays == other.lengthInDays && this.spendingCap == other.spendingCap && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(lengthInDays, spendingCap, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "TrialSpec{lengthInDays=$lengthInDays, spendingCap=$spendingCap, additionalProperties=$additionalProperties}"
    }
}
