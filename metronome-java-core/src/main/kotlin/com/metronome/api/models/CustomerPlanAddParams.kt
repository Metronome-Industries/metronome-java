// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.metronome.api.core.Enum
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.checkRequired
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/**
 * Associate an existing customer with a plan for a specified date range. See the
 * [price adjustments documentation](https://plans-docs.metronome.com/pricing/managing-plans/#price-adjustments)
 * for details on the price adjustments.
 */
class CustomerPlanAddParams
private constructor(
    private val customerId: String,
    private val body: CustomerPlanAddBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun customerId(): String = customerId

    fun planId(): String = body.planId()

    /**
     * RFC 3339 timestamp for when the plan becomes active for this customer. Must be at 0:00 UTC
     * (midnight).
     */
    fun startingOn(): OffsetDateTime = body.startingOn()

    /**
     * RFC 3339 timestamp for when the plan ends (exclusive) for this customer. Must be at 0:00 UTC
     * (midnight).
     */
    fun endingBefore(): Optional<OffsetDateTime> = body.endingBefore()

    /** Number of days after issuance of invoice after which the invoice is due (e.g. Net 30). */
    fun netPaymentTermsDays(): Optional<Double> = body.netPaymentTermsDays()

    /**
     * An optional list of overage rates that override the rates of the original plan configuration.
     * These new rates will apply to all pricing ramps.
     */
    fun overageRateAdjustments(): Optional<List<OverageRateAdjustment>> =
        body.overageRateAdjustments()

    /**
     * A list of price adjustments can be applied on top of the pricing in the plans. See the
     * [price adjustments documentation](https://plans-docs.metronome.com/pricing/managing-plans/#price-adjustments)
     * for details.
     */
    fun priceAdjustments(): Optional<List<PriceAdjustment>> = body.priceAdjustments()

    /**
     * A custom trial can be set for the customer's plan. See the
     * [trial configuration documentation](https://docs.metronome.com/provisioning/configure-trials/)
     * for details.
     */
    fun trialSpec(): Optional<TrialSpec> = body.trialSpec()

    fun _planId(): JsonField<String> = body._planId()

    /**
     * RFC 3339 timestamp for when the plan becomes active for this customer. Must be at 0:00 UTC
     * (midnight).
     */
    fun _startingOn(): JsonField<OffsetDateTime> = body._startingOn()

    /**
     * RFC 3339 timestamp for when the plan ends (exclusive) for this customer. Must be at 0:00 UTC
     * (midnight).
     */
    fun _endingBefore(): JsonField<OffsetDateTime> = body._endingBefore()

    /** Number of days after issuance of invoice after which the invoice is due (e.g. Net 30). */
    fun _netPaymentTermsDays(): JsonField<Double> = body._netPaymentTermsDays()

    /**
     * An optional list of overage rates that override the rates of the original plan configuration.
     * These new rates will apply to all pricing ramps.
     */
    fun _overageRateAdjustments(): JsonField<List<OverageRateAdjustment>> =
        body._overageRateAdjustments()

    /**
     * A list of price adjustments can be applied on top of the pricing in the plans. See the
     * [price adjustments documentation](https://plans-docs.metronome.com/pricing/managing-plans/#price-adjustments)
     * for details.
     */
    fun _priceAdjustments(): JsonField<List<PriceAdjustment>> = body._priceAdjustments()

    /**
     * A custom trial can be set for the customer's plan. See the
     * [trial configuration documentation](https://docs.metronome.com/provisioning/configure-trials/)
     * for details.
     */
    fun _trialSpec(): JsonField<TrialSpec> = body._trialSpec()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getBody(): CustomerPlanAddBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> customerId
            else -> ""
        }
    }

    @NoAutoDetect
    class CustomerPlanAddBody
    @JsonCreator
    internal constructor(
        @JsonProperty("plan_id")
        @ExcludeMissing
        private val planId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("starting_on")
        @ExcludeMissing
        private val startingOn: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("ending_before")
        @ExcludeMissing
        private val endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("net_payment_terms_days")
        @ExcludeMissing
        private val netPaymentTermsDays: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("overage_rate_adjustments")
        @ExcludeMissing
        private val overageRateAdjustments: JsonField<List<OverageRateAdjustment>> =
            JsonMissing.of(),
        @JsonProperty("price_adjustments")
        @ExcludeMissing
        private val priceAdjustments: JsonField<List<PriceAdjustment>> = JsonMissing.of(),
        @JsonProperty("trial_spec")
        @ExcludeMissing
        private val trialSpec: JsonField<TrialSpec> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun planId(): String = planId.getRequired("plan_id")

        /**
         * RFC 3339 timestamp for when the plan becomes active for this customer. Must be at 0:00
         * UTC (midnight).
         */
        fun startingOn(): OffsetDateTime = startingOn.getRequired("starting_on")

        /**
         * RFC 3339 timestamp for when the plan ends (exclusive) for this customer. Must be at 0:00
         * UTC (midnight).
         */
        fun endingBefore(): Optional<OffsetDateTime> =
            Optional.ofNullable(endingBefore.getNullable("ending_before"))

        /**
         * Number of days after issuance of invoice after which the invoice is due (e.g. Net 30).
         */
        fun netPaymentTermsDays(): Optional<Double> =
            Optional.ofNullable(netPaymentTermsDays.getNullable("net_payment_terms_days"))

        /**
         * An optional list of overage rates that override the rates of the original plan
         * configuration. These new rates will apply to all pricing ramps.
         */
        fun overageRateAdjustments(): Optional<List<OverageRateAdjustment>> =
            Optional.ofNullable(overageRateAdjustments.getNullable("overage_rate_adjustments"))

        /**
         * A list of price adjustments can be applied on top of the pricing in the plans. See the
         * [price adjustments documentation](https://plans-docs.metronome.com/pricing/managing-plans/#price-adjustments)
         * for details.
         */
        fun priceAdjustments(): Optional<List<PriceAdjustment>> =
            Optional.ofNullable(priceAdjustments.getNullable("price_adjustments"))

        /**
         * A custom trial can be set for the customer's plan. See the
         * [trial configuration documentation](https://docs.metronome.com/provisioning/configure-trials/)
         * for details.
         */
        fun trialSpec(): Optional<TrialSpec> =
            Optional.ofNullable(trialSpec.getNullable("trial_spec"))

        @JsonProperty("plan_id") @ExcludeMissing fun _planId(): JsonField<String> = planId

        /**
         * RFC 3339 timestamp for when the plan becomes active for this customer. Must be at 0:00
         * UTC (midnight).
         */
        @JsonProperty("starting_on")
        @ExcludeMissing
        fun _startingOn(): JsonField<OffsetDateTime> = startingOn

        /**
         * RFC 3339 timestamp for when the plan ends (exclusive) for this customer. Must be at 0:00
         * UTC (midnight).
         */
        @JsonProperty("ending_before")
        @ExcludeMissing
        fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

        /**
         * Number of days after issuance of invoice after which the invoice is due (e.g. Net 30).
         */
        @JsonProperty("net_payment_terms_days")
        @ExcludeMissing
        fun _netPaymentTermsDays(): JsonField<Double> = netPaymentTermsDays

        /**
         * An optional list of overage rates that override the rates of the original plan
         * configuration. These new rates will apply to all pricing ramps.
         */
        @JsonProperty("overage_rate_adjustments")
        @ExcludeMissing
        fun _overageRateAdjustments(): JsonField<List<OverageRateAdjustment>> =
            overageRateAdjustments

        /**
         * A list of price adjustments can be applied on top of the pricing in the plans. See the
         * [price adjustments documentation](https://plans-docs.metronome.com/pricing/managing-plans/#price-adjustments)
         * for details.
         */
        @JsonProperty("price_adjustments")
        @ExcludeMissing
        fun _priceAdjustments(): JsonField<List<PriceAdjustment>> = priceAdjustments

        /**
         * A custom trial can be set for the customer's plan. See the
         * [trial configuration documentation](https://docs.metronome.com/provisioning/configure-trials/)
         * for details.
         */
        @JsonProperty("trial_spec")
        @ExcludeMissing
        fun _trialSpec(): JsonField<TrialSpec> = trialSpec

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CustomerPlanAddBody = apply {
            if (validated) {
                return@apply
            }

            planId()
            startingOn()
            endingBefore()
            netPaymentTermsDays()
            overageRateAdjustments().ifPresent { it.forEach { it.validate() } }
            priceAdjustments().ifPresent { it.forEach { it.validate() } }
            trialSpec().ifPresent { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder internal constructor() {

            private var planId: JsonField<String>? = null
            private var startingOn: JsonField<OffsetDateTime>? = null
            private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
            private var netPaymentTermsDays: JsonField<Double> = JsonMissing.of()
            private var overageRateAdjustments: JsonField<MutableList<OverageRateAdjustment>>? =
                null
            private var priceAdjustments: JsonField<MutableList<PriceAdjustment>>? = null
            private var trialSpec: JsonField<TrialSpec> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customerPlanAddBody: CustomerPlanAddBody) = apply {
                planId = customerPlanAddBody.planId
                startingOn = customerPlanAddBody.startingOn
                endingBefore = customerPlanAddBody.endingBefore
                netPaymentTermsDays = customerPlanAddBody.netPaymentTermsDays
                overageRateAdjustments =
                    customerPlanAddBody.overageRateAdjustments.map { it.toMutableList() }
                priceAdjustments = customerPlanAddBody.priceAdjustments.map { it.toMutableList() }
                trialSpec = customerPlanAddBody.trialSpec
                additionalProperties = customerPlanAddBody.additionalProperties.toMutableMap()
            }

            fun planId(planId: String) = planId(JsonField.of(planId))

            fun planId(planId: JsonField<String>) = apply { this.planId = planId }

            /**
             * RFC 3339 timestamp for when the plan becomes active for this customer. Must be at
             * 0:00 UTC (midnight).
             */
            fun startingOn(startingOn: OffsetDateTime) = startingOn(JsonField.of(startingOn))

            /**
             * RFC 3339 timestamp for when the plan becomes active for this customer. Must be at
             * 0:00 UTC (midnight).
             */
            fun startingOn(startingOn: JsonField<OffsetDateTime>) = apply {
                this.startingOn = startingOn
            }

            /**
             * RFC 3339 timestamp for when the plan ends (exclusive) for this customer. Must be at
             * 0:00 UTC (midnight).
             */
            fun endingBefore(endingBefore: OffsetDateTime) =
                endingBefore(JsonField.of(endingBefore))

            /**
             * RFC 3339 timestamp for when the plan ends (exclusive) for this customer. Must be at
             * 0:00 UTC (midnight).
             */
            fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                this.endingBefore = endingBefore
            }

            /**
             * Number of days after issuance of invoice after which the invoice is due (e.g. Net
             * 30).
             */
            fun netPaymentTermsDays(netPaymentTermsDays: Double) =
                netPaymentTermsDays(JsonField.of(netPaymentTermsDays))

            /**
             * Number of days after issuance of invoice after which the invoice is due (e.g. Net
             * 30).
             */
            fun netPaymentTermsDays(netPaymentTermsDays: JsonField<Double>) = apply {
                this.netPaymentTermsDays = netPaymentTermsDays
            }

            /**
             * An optional list of overage rates that override the rates of the original plan
             * configuration. These new rates will apply to all pricing ramps.
             */
            fun overageRateAdjustments(overageRateAdjustments: List<OverageRateAdjustment>) =
                overageRateAdjustments(JsonField.of(overageRateAdjustments))

            /**
             * An optional list of overage rates that override the rates of the original plan
             * configuration. These new rates will apply to all pricing ramps.
             */
            fun overageRateAdjustments(
                overageRateAdjustments: JsonField<List<OverageRateAdjustment>>
            ) = apply {
                this.overageRateAdjustments = overageRateAdjustments.map { it.toMutableList() }
            }

            /**
             * An optional list of overage rates that override the rates of the original plan
             * configuration. These new rates will apply to all pricing ramps.
             */
            fun addOverageRateAdjustment(overageRateAdjustment: OverageRateAdjustment) = apply {
                overageRateAdjustments =
                    (overageRateAdjustments ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(overageRateAdjustment)
                    }
            }

            /**
             * A list of price adjustments can be applied on top of the pricing in the plans. See
             * the
             * [price adjustments documentation](https://plans-docs.metronome.com/pricing/managing-plans/#price-adjustments)
             * for details.
             */
            fun priceAdjustments(priceAdjustments: List<PriceAdjustment>) =
                priceAdjustments(JsonField.of(priceAdjustments))

            /**
             * A list of price adjustments can be applied on top of the pricing in the plans. See
             * the
             * [price adjustments documentation](https://plans-docs.metronome.com/pricing/managing-plans/#price-adjustments)
             * for details.
             */
            fun priceAdjustments(priceAdjustments: JsonField<List<PriceAdjustment>>) = apply {
                this.priceAdjustments = priceAdjustments.map { it.toMutableList() }
            }

            /**
             * A list of price adjustments can be applied on top of the pricing in the plans. See
             * the
             * [price adjustments documentation](https://plans-docs.metronome.com/pricing/managing-plans/#price-adjustments)
             * for details.
             */
            fun addPriceAdjustment(priceAdjustment: PriceAdjustment) = apply {
                priceAdjustments =
                    (priceAdjustments ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(priceAdjustment)
                    }
            }

            /**
             * A custom trial can be set for the customer's plan. See the
             * [trial configuration documentation](https://docs.metronome.com/provisioning/configure-trials/)
             * for details.
             */
            fun trialSpec(trialSpec: TrialSpec) = trialSpec(JsonField.of(trialSpec))

            /**
             * A custom trial can be set for the customer's plan. See the
             * [trial configuration documentation](https://docs.metronome.com/provisioning/configure-trials/)
             * for details.
             */
            fun trialSpec(trialSpec: JsonField<TrialSpec>) = apply { this.trialSpec = trialSpec }

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

            fun build(): CustomerPlanAddBody =
                CustomerPlanAddBody(
                    checkRequired("planId", planId),
                    checkRequired("startingOn", startingOn),
                    endingBefore,
                    netPaymentTermsDays,
                    (overageRateAdjustments ?: JsonMissing.of()).map { it.toImmutable() },
                    (priceAdjustments ?: JsonMissing.of()).map { it.toImmutable() },
                    trialSpec,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CustomerPlanAddBody && planId == other.planId && startingOn == other.startingOn && endingBefore == other.endingBefore && netPaymentTermsDays == other.netPaymentTermsDays && overageRateAdjustments == other.overageRateAdjustments && priceAdjustments == other.priceAdjustments && trialSpec == other.trialSpec && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(planId, startingOn, endingBefore, netPaymentTermsDays, overageRateAdjustments, priceAdjustments, trialSpec, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CustomerPlanAddBody{planId=$planId, startingOn=$startingOn, endingBefore=$endingBefore, netPaymentTermsDays=$netPaymentTermsDays, overageRateAdjustments=$overageRateAdjustments, priceAdjustments=$priceAdjustments, trialSpec=$trialSpec, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder internal constructor() {

        private var customerId: String? = null
        private var body: CustomerPlanAddBody.Builder = CustomerPlanAddBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(customerPlanAddParams: CustomerPlanAddParams) = apply {
            customerId = customerPlanAddParams.customerId
            body = customerPlanAddParams.body.toBuilder()
            additionalHeaders = customerPlanAddParams.additionalHeaders.toBuilder()
            additionalQueryParams = customerPlanAddParams.additionalQueryParams.toBuilder()
        }

        fun customerId(customerId: String) = apply { this.customerId = customerId }

        fun planId(planId: String) = apply { body.planId(planId) }

        fun planId(planId: JsonField<String>) = apply { body.planId(planId) }

        /**
         * RFC 3339 timestamp for when the plan becomes active for this customer. Must be at 0:00
         * UTC (midnight).
         */
        fun startingOn(startingOn: OffsetDateTime) = apply { body.startingOn(startingOn) }

        /**
         * RFC 3339 timestamp for when the plan becomes active for this customer. Must be at 0:00
         * UTC (midnight).
         */
        fun startingOn(startingOn: JsonField<OffsetDateTime>) = apply {
            body.startingOn(startingOn)
        }

        /**
         * RFC 3339 timestamp for when the plan ends (exclusive) for this customer. Must be at 0:00
         * UTC (midnight).
         */
        fun endingBefore(endingBefore: OffsetDateTime) = apply { body.endingBefore(endingBefore) }

        /**
         * RFC 3339 timestamp for when the plan ends (exclusive) for this customer. Must be at 0:00
         * UTC (midnight).
         */
        fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
            body.endingBefore(endingBefore)
        }

        /**
         * Number of days after issuance of invoice after which the invoice is due (e.g. Net 30).
         */
        fun netPaymentTermsDays(netPaymentTermsDays: Double) = apply {
            body.netPaymentTermsDays(netPaymentTermsDays)
        }

        /**
         * Number of days after issuance of invoice after which the invoice is due (e.g. Net 30).
         */
        fun netPaymentTermsDays(netPaymentTermsDays: JsonField<Double>) = apply {
            body.netPaymentTermsDays(netPaymentTermsDays)
        }

        /**
         * An optional list of overage rates that override the rates of the original plan
         * configuration. These new rates will apply to all pricing ramps.
         */
        fun overageRateAdjustments(overageRateAdjustments: List<OverageRateAdjustment>) = apply {
            body.overageRateAdjustments(overageRateAdjustments)
        }

        /**
         * An optional list of overage rates that override the rates of the original plan
         * configuration. These new rates will apply to all pricing ramps.
         */
        fun overageRateAdjustments(overageRateAdjustments: JsonField<List<OverageRateAdjustment>>) =
            apply {
                body.overageRateAdjustments(overageRateAdjustments)
            }

        /**
         * An optional list of overage rates that override the rates of the original plan
         * configuration. These new rates will apply to all pricing ramps.
         */
        fun addOverageRateAdjustment(overageRateAdjustment: OverageRateAdjustment) = apply {
            body.addOverageRateAdjustment(overageRateAdjustment)
        }

        /**
         * A list of price adjustments can be applied on top of the pricing in the plans. See the
         * [price adjustments documentation](https://plans-docs.metronome.com/pricing/managing-plans/#price-adjustments)
         * for details.
         */
        fun priceAdjustments(priceAdjustments: List<PriceAdjustment>) = apply {
            body.priceAdjustments(priceAdjustments)
        }

        /**
         * A list of price adjustments can be applied on top of the pricing in the plans. See the
         * [price adjustments documentation](https://plans-docs.metronome.com/pricing/managing-plans/#price-adjustments)
         * for details.
         */
        fun priceAdjustments(priceAdjustments: JsonField<List<PriceAdjustment>>) = apply {
            body.priceAdjustments(priceAdjustments)
        }

        /**
         * A list of price adjustments can be applied on top of the pricing in the plans. See the
         * [price adjustments documentation](https://plans-docs.metronome.com/pricing/managing-plans/#price-adjustments)
         * for details.
         */
        fun addPriceAdjustment(priceAdjustment: PriceAdjustment) = apply {
            body.addPriceAdjustment(priceAdjustment)
        }

        /**
         * A custom trial can be set for the customer's plan. See the
         * [trial configuration documentation](https://docs.metronome.com/provisioning/configure-trials/)
         * for details.
         */
        fun trialSpec(trialSpec: TrialSpec) = apply { body.trialSpec(trialSpec) }

        /**
         * A custom trial can be set for the customer's plan. See the
         * [trial configuration documentation](https://docs.metronome.com/provisioning/configure-trials/)
         * for details.
         */
        fun trialSpec(trialSpec: JsonField<TrialSpec>) = apply { body.trialSpec(trialSpec) }

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

        fun build(): CustomerPlanAddParams =
            CustomerPlanAddParams(
                checkRequired("customerId", customerId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @NoAutoDetect
    class OverageRateAdjustment
    @JsonCreator
    private constructor(
        @JsonProperty("custom_credit_type_id")
        @ExcludeMissing
        private val customCreditTypeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fiat_currency_credit_type_id")
        @ExcludeMissing
        private val fiatCurrencyCreditTypeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("to_fiat_conversion_factor")
        @ExcludeMissing
        private val toFiatConversionFactor: JsonField<Double> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun customCreditTypeId(): String = customCreditTypeId.getRequired("custom_credit_type_id")

        fun fiatCurrencyCreditTypeId(): String =
            fiatCurrencyCreditTypeId.getRequired("fiat_currency_credit_type_id")

        /** The overage cost in fiat currency for each credit of the custom credit type. */
        fun toFiatConversionFactor(): Double =
            toFiatConversionFactor.getRequired("to_fiat_conversion_factor")

        @JsonProperty("custom_credit_type_id")
        @ExcludeMissing
        fun _customCreditTypeId(): JsonField<String> = customCreditTypeId

        @JsonProperty("fiat_currency_credit_type_id")
        @ExcludeMissing
        fun _fiatCurrencyCreditTypeId(): JsonField<String> = fiatCurrencyCreditTypeId

        /** The overage cost in fiat currency for each credit of the custom credit type. */
        @JsonProperty("to_fiat_conversion_factor")
        @ExcludeMissing
        fun _toFiatConversionFactor(): JsonField<Double> = toFiatConversionFactor

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): OverageRateAdjustment = apply {
            if (validated) {
                return@apply
            }

            customCreditTypeId()
            fiatCurrencyCreditTypeId()
            toFiatConversionFactor()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder internal constructor() {

            private var customCreditTypeId: JsonField<String>? = null
            private var fiatCurrencyCreditTypeId: JsonField<String>? = null
            private var toFiatConversionFactor: JsonField<Double>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(overageRateAdjustment: OverageRateAdjustment) = apply {
                customCreditTypeId = overageRateAdjustment.customCreditTypeId
                fiatCurrencyCreditTypeId = overageRateAdjustment.fiatCurrencyCreditTypeId
                toFiatConversionFactor = overageRateAdjustment.toFiatConversionFactor
                additionalProperties = overageRateAdjustment.additionalProperties.toMutableMap()
            }

            fun customCreditTypeId(customCreditTypeId: String) =
                customCreditTypeId(JsonField.of(customCreditTypeId))

            fun customCreditTypeId(customCreditTypeId: JsonField<String>) = apply {
                this.customCreditTypeId = customCreditTypeId
            }

            fun fiatCurrencyCreditTypeId(fiatCurrencyCreditTypeId: String) =
                fiatCurrencyCreditTypeId(JsonField.of(fiatCurrencyCreditTypeId))

            fun fiatCurrencyCreditTypeId(fiatCurrencyCreditTypeId: JsonField<String>) = apply {
                this.fiatCurrencyCreditTypeId = fiatCurrencyCreditTypeId
            }

            /** The overage cost in fiat currency for each credit of the custom credit type. */
            fun toFiatConversionFactor(toFiatConversionFactor: Double) =
                toFiatConversionFactor(JsonField.of(toFiatConversionFactor))

            /** The overage cost in fiat currency for each credit of the custom credit type. */
            fun toFiatConversionFactor(toFiatConversionFactor: JsonField<Double>) = apply {
                this.toFiatConversionFactor = toFiatConversionFactor
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

            fun build(): OverageRateAdjustment =
                OverageRateAdjustment(
                    checkRequired("customCreditTypeId", customCreditTypeId),
                    checkRequired("fiatCurrencyCreditTypeId", fiatCurrencyCreditTypeId),
                    checkRequired("toFiatConversionFactor", toFiatConversionFactor),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is OverageRateAdjustment && customCreditTypeId == other.customCreditTypeId && fiatCurrencyCreditTypeId == other.fiatCurrencyCreditTypeId && toFiatConversionFactor == other.toFiatConversionFactor && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(customCreditTypeId, fiatCurrencyCreditTypeId, toFiatConversionFactor, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "OverageRateAdjustment{customCreditTypeId=$customCreditTypeId, fiatCurrencyCreditTypeId=$fiatCurrencyCreditTypeId, toFiatConversionFactor=$toFiatConversionFactor, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class PriceAdjustment
    @JsonCreator
    private constructor(
        @JsonProperty("adjustment_type")
        @ExcludeMissing
        private val adjustmentType: JsonField<AdjustmentType> = JsonMissing.of(),
        @JsonProperty("charge_id")
        @ExcludeMissing
        private val chargeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("start_period")
        @ExcludeMissing
        private val startPeriod: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("quantity")
        @ExcludeMissing
        private val quantity: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("tier")
        @ExcludeMissing
        private val tier: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("value")
        @ExcludeMissing
        private val value: JsonField<Double> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun adjustmentType(): AdjustmentType = adjustmentType.getRequired("adjustment_type")

        fun chargeId(): String = chargeId.getRequired("charge_id")

        /**
         * Used in price ramps. Indicates how many billing periods pass before the charge applies.
         */
        fun startPeriod(): Double = startPeriod.getRequired("start_period")

        /** the overridden quantity for a fixed charge */
        fun quantity(): Optional<Double> = Optional.ofNullable(quantity.getNullable("quantity"))

        /** Used in pricing tiers. Indicates at what metric value the price applies. */
        fun tier(): Optional<Double> = Optional.ofNullable(tier.getNullable("tier"))

        /**
         * The amount of change to a price. Percentage and fixed adjustments can be positive or
         * negative. Percentage-based adjustments should be decimals, e.g. -0.05 for a 5% discount.
         */
        fun value(): Optional<Double> = Optional.ofNullable(value.getNullable("value"))

        @JsonProperty("adjustment_type")
        @ExcludeMissing
        fun _adjustmentType(): JsonField<AdjustmentType> = adjustmentType

        @JsonProperty("charge_id") @ExcludeMissing fun _chargeId(): JsonField<String> = chargeId

        /**
         * Used in price ramps. Indicates how many billing periods pass before the charge applies.
         */
        @JsonProperty("start_period")
        @ExcludeMissing
        fun _startPeriod(): JsonField<Double> = startPeriod

        /** the overridden quantity for a fixed charge */
        @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

        /** Used in pricing tiers. Indicates at what metric value the price applies. */
        @JsonProperty("tier") @ExcludeMissing fun _tier(): JsonField<Double> = tier

        /**
         * The amount of change to a price. Percentage and fixed adjustments can be positive or
         * negative. Percentage-based adjustments should be decimals, e.g. -0.05 for a 5% discount.
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Double> = value

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): PriceAdjustment = apply {
            if (validated) {
                return@apply
            }

            adjustmentType()
            chargeId()
            startPeriod()
            quantity()
            tier()
            value()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder internal constructor() {

            private var adjustmentType: JsonField<AdjustmentType>? = null
            private var chargeId: JsonField<String>? = null
            private var startPeriod: JsonField<Double>? = null
            private var quantity: JsonField<Double> = JsonMissing.of()
            private var tier: JsonField<Double> = JsonMissing.of()
            private var value: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(priceAdjustment: PriceAdjustment) = apply {
                adjustmentType = priceAdjustment.adjustmentType
                chargeId = priceAdjustment.chargeId
                startPeriod = priceAdjustment.startPeriod
                quantity = priceAdjustment.quantity
                tier = priceAdjustment.tier
                value = priceAdjustment.value
                additionalProperties = priceAdjustment.additionalProperties.toMutableMap()
            }

            fun adjustmentType(adjustmentType: AdjustmentType) =
                adjustmentType(JsonField.of(adjustmentType))

            fun adjustmentType(adjustmentType: JsonField<AdjustmentType>) = apply {
                this.adjustmentType = adjustmentType
            }

            fun chargeId(chargeId: String) = chargeId(JsonField.of(chargeId))

            fun chargeId(chargeId: JsonField<String>) = apply { this.chargeId = chargeId }

            /**
             * Used in price ramps. Indicates how many billing periods pass before the charge
             * applies.
             */
            fun startPeriod(startPeriod: Double) = startPeriod(JsonField.of(startPeriod))

            /**
             * Used in price ramps. Indicates how many billing periods pass before the charge
             * applies.
             */
            fun startPeriod(startPeriod: JsonField<Double>) = apply {
                this.startPeriod = startPeriod
            }

            /** the overridden quantity for a fixed charge */
            fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

            /** the overridden quantity for a fixed charge */
            fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

            /** Used in pricing tiers. Indicates at what metric value the price applies. */
            fun tier(tier: Double) = tier(JsonField.of(tier))

            /** Used in pricing tiers. Indicates at what metric value the price applies. */
            fun tier(tier: JsonField<Double>) = apply { this.tier = tier }

            /**
             * The amount of change to a price. Percentage and fixed adjustments can be positive or
             * negative. Percentage-based adjustments should be decimals, e.g. -0.05 for a 5%
             * discount.
             */
            fun value(value: Double) = value(JsonField.of(value))

            /**
             * The amount of change to a price. Percentage and fixed adjustments can be positive or
             * negative. Percentage-based adjustments should be decimals, e.g. -0.05 for a 5%
             * discount.
             */
            fun value(value: JsonField<Double>) = apply { this.value = value }

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

            fun build(): PriceAdjustment =
                PriceAdjustment(
                    checkRequired("adjustmentType", adjustmentType),
                    checkRequired("chargeId", chargeId),
                    checkRequired("startPeriod", startPeriod),
                    quantity,
                    tier,
                    value,
                    additionalProperties.toImmutable(),
                )
        }

        class AdjustmentType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val PERCENTAGE = of("percentage")

                @JvmField val FIXED = of("fixed")

                @JvmField val OVERRIDE = of("override")

                @JvmField val QUANTITY = of("quantity")

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AdjustmentType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PriceAdjustment && adjustmentType == other.adjustmentType && chargeId == other.chargeId && startPeriod == other.startPeriod && quantity == other.quantity && tier == other.tier && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(adjustmentType, chargeId, startPeriod, quantity, tier, value, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PriceAdjustment{adjustmentType=$adjustmentType, chargeId=$chargeId, startPeriod=$startPeriod, quantity=$quantity, tier=$tier, value=$value, additionalProperties=$additionalProperties}"
    }

    /**
     * A custom trial can be set for the customer's plan. See the
     * [trial configuration documentation](https://docs.metronome.com/provisioning/configure-trials/)
     * for details.
     */
    @NoAutoDetect
    class TrialSpec
    @JsonCreator
    private constructor(
        @JsonProperty("length_in_days")
        @ExcludeMissing
        private val lengthInDays: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("spending_cap")
        @ExcludeMissing
        private val spendingCap: JsonField<SpendingCap> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Length of the trial period in days. */
        fun lengthInDays(): Double = lengthInDays.getRequired("length_in_days")

        fun spendingCap(): Optional<SpendingCap> =
            Optional.ofNullable(spendingCap.getNullable("spending_cap"))

        /** Length of the trial period in days. */
        @JsonProperty("length_in_days")
        @ExcludeMissing
        fun _lengthInDays(): JsonField<Double> = lengthInDays

        @JsonProperty("spending_cap")
        @ExcludeMissing
        fun _spendingCap(): JsonField<SpendingCap> = spendingCap

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): TrialSpec = apply {
            if (validated) {
                return@apply
            }

            lengthInDays()
            spendingCap().ifPresent { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder internal constructor() {

            private var lengthInDays: JsonField<Double>? = null
            private var spendingCap: JsonField<SpendingCap> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(trialSpec: TrialSpec) = apply {
                lengthInDays = trialSpec.lengthInDays
                spendingCap = trialSpec.spendingCap
                additionalProperties = trialSpec.additionalProperties.toMutableMap()
            }

            /** Length of the trial period in days. */
            fun lengthInDays(lengthInDays: Double) = lengthInDays(JsonField.of(lengthInDays))

            /** Length of the trial period in days. */
            fun lengthInDays(lengthInDays: JsonField<Double>) = apply {
                this.lengthInDays = lengthInDays
            }

            fun spendingCap(spendingCap: SpendingCap) = spendingCap(JsonField.of(spendingCap))

            fun spendingCap(spendingCap: JsonField<SpendingCap>) = apply {
                this.spendingCap = spendingCap
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

            fun build(): TrialSpec =
                TrialSpec(
                    checkRequired("lengthInDays", lengthInDays),
                    spendingCap,
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class SpendingCap
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

            /**
             * The credit amount in the given denomination based on the credit type, e.g. US cents.
             */
            fun amount(): Double = amount.getRequired("amount")

            /** The credit type ID for the spending cap. */
            fun creditTypeId(): String = creditTypeId.getRequired("credit_type_id")

            /**
             * The credit amount in the given denomination based on the credit type, e.g. US cents.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

            /** The credit type ID for the spending cap. */
            @JsonProperty("credit_type_id")
            @ExcludeMissing
            fun _creditTypeId(): JsonField<String> = creditTypeId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): SpendingCap = apply {
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

            class Builder internal constructor() {

                private var amount: JsonField<Double>? = null
                private var creditTypeId: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(spendingCap: SpendingCap) = apply {
                    amount = spendingCap.amount
                    creditTypeId = spendingCap.creditTypeId
                    additionalProperties = spendingCap.additionalProperties.toMutableMap()
                }

                /**
                 * The credit amount in the given denomination based on the credit type, e.g. US
                 * cents.
                 */
                fun amount(amount: Double) = amount(JsonField.of(amount))

                /**
                 * The credit amount in the given denomination based on the credit type, e.g. US
                 * cents.
                 */
                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                /** The credit type ID for the spending cap. */
                fun creditTypeId(creditTypeId: String) = creditTypeId(JsonField.of(creditTypeId))

                /** The credit type ID for the spending cap. */
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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): SpendingCap =
                    SpendingCap(
                        checkRequired("amount", amount),
                        checkRequired("creditTypeId", creditTypeId),
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is SpendingCap && amount == other.amount && creditTypeId == other.creditTypeId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, creditTypeId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "SpendingCap{amount=$amount, creditTypeId=$creditTypeId, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TrialSpec && lengthInDays == other.lengthInDays && spendingCap == other.spendingCap && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(lengthInDays, spendingCap, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TrialSpec{lengthInDays=$lengthInDays, spendingCap=$spendingCap, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerPlanAddParams && customerId == other.customerId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(customerId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CustomerPlanAddParams{customerId=$customerId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
