// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers.plans

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.metronome.api.core.Enum
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.Params
import com.metronome.api.core.checkKnown
import com.metronome.api.core.checkRequired
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Associate an existing customer with a plan for a specified date range. See the
 * [price adjustments documentation](https://plans-docs.metronome.com/pricing/managing-plans/#price-adjustments)
 * for details on the price adjustments. This is a Plans (deprecated) endpoint. New clients should
 * implement using Contracts.
 */
class PlanAddParams
private constructor(
    private val customerId: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun customerId(): String = customerId

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun planId(): String = body.planId()

    /**
     * RFC 3339 timestamp for when the plan becomes active for this customer. Must be at 0:00 UTC
     * (midnight).
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startingOn(): OffsetDateTime = body.startingOn()

    /**
     * RFC 3339 timestamp for when the plan ends (exclusive) for this customer. Must be at 0:00 UTC
     * (midnight).
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endingBefore(): Optional<OffsetDateTime> = body.endingBefore()

    /**
     * Number of days after issuance of invoice after which the invoice is due (e.g. Net 30).
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun netPaymentTermsDays(): Optional<Double> = body.netPaymentTermsDays()

    /**
     * An optional list of overage rates that override the rates of the original plan configuration.
     * These new rates will apply to all pricing ramps.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun overageRateAdjustments(): Optional<List<OverageRateAdjustment>> =
        body.overageRateAdjustments()

    /**
     * A list of price adjustments can be applied on top of the pricing in the plans. See the
     * [price adjustments documentation](https://plans-docs.metronome.com/pricing/managing-plans/#price-adjustments)
     * for details.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun priceAdjustments(): Optional<List<PriceAdjustment>> = body.priceAdjustments()

    /**
     * A custom trial can be set for the customer's plan. See the
     * [trial configuration documentation](https://docs.metronome.com/provisioning/configure-trials/)
     * for details.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun trialSpec(): Optional<TrialSpec> = body.trialSpec()

    /**
     * Returns the raw JSON value of [planId].
     *
     * Unlike [planId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _planId(): JsonField<String> = body._planId()

    /**
     * Returns the raw JSON value of [startingOn].
     *
     * Unlike [startingOn], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _startingOn(): JsonField<OffsetDateTime> = body._startingOn()

    /**
     * Returns the raw JSON value of [endingBefore].
     *
     * Unlike [endingBefore], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _endingBefore(): JsonField<OffsetDateTime> = body._endingBefore()

    /**
     * Returns the raw JSON value of [netPaymentTermsDays].
     *
     * Unlike [netPaymentTermsDays], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _netPaymentTermsDays(): JsonField<Double> = body._netPaymentTermsDays()

    /**
     * Returns the raw JSON value of [overageRateAdjustments].
     *
     * Unlike [overageRateAdjustments], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _overageRateAdjustments(): JsonField<List<OverageRateAdjustment>> =
        body._overageRateAdjustments()

    /**
     * Returns the raw JSON value of [priceAdjustments].
     *
     * Unlike [priceAdjustments], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _priceAdjustments(): JsonField<List<PriceAdjustment>> = body._priceAdjustments()

    /**
     * Returns the raw JSON value of [trialSpec].
     *
     * Unlike [trialSpec], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _trialSpec(): JsonField<TrialSpec> = body._trialSpec()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PlanAddParams].
         *
         * The following fields are required:
         * ```java
         * .customerId()
         * .planId()
         * .startingOn()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PlanAddParams]. */
    class Builder internal constructor() {

        private var customerId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(planAddParams: PlanAddParams) = apply {
            customerId = planAddParams.customerId
            body = planAddParams.body.toBuilder()
            additionalHeaders = planAddParams.additionalHeaders.toBuilder()
            additionalQueryParams = planAddParams.additionalQueryParams.toBuilder()
        }

        fun customerId(customerId: String) = apply { this.customerId = customerId }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [planId]
         * - [startingOn]
         * - [endingBefore]
         * - [netPaymentTermsDays]
         * - [overageRateAdjustments]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun planId(planId: String) = apply { body.planId(planId) }

        /**
         * Sets [Builder.planId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.planId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun planId(planId: JsonField<String>) = apply { body.planId(planId) }

        /**
         * RFC 3339 timestamp for when the plan becomes active for this customer. Must be at 0:00
         * UTC (midnight).
         */
        fun startingOn(startingOn: OffsetDateTime) = apply { body.startingOn(startingOn) }

        /**
         * Sets [Builder.startingOn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startingOn] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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
         * Sets [Builder.endingBefore] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endingBefore] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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
         * Sets [Builder.netPaymentTermsDays] to an arbitrary JSON value.
         *
         * You should usually call [Builder.netPaymentTermsDays] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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
         * Sets [Builder.overageRateAdjustments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.overageRateAdjustments] with a well-typed
         * `List<OverageRateAdjustment>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun overageRateAdjustments(overageRateAdjustments: JsonField<List<OverageRateAdjustment>>) =
            apply {
                body.overageRateAdjustments(overageRateAdjustments)
            }

        /**
         * Adds a single [OverageRateAdjustment] to [overageRateAdjustments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
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
         * Sets [Builder.priceAdjustments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.priceAdjustments] with a well-typed
         * `List<PriceAdjustment>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun priceAdjustments(priceAdjustments: JsonField<List<PriceAdjustment>>) = apply {
            body.priceAdjustments(priceAdjustments)
        }

        /**
         * Adds a single [PriceAdjustment] to [priceAdjustments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
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
         * Sets [Builder.trialSpec] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trialSpec] with a well-typed [TrialSpec] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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

        /**
         * Returns an immutable instance of [PlanAddParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .customerId()
         * .planId()
         * .startingOn()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PlanAddParams =
            PlanAddParams(
                checkRequired("customerId", customerId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> customerId
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val planId: JsonField<String>,
        private val startingOn: JsonField<OffsetDateTime>,
        private val endingBefore: JsonField<OffsetDateTime>,
        private val netPaymentTermsDays: JsonField<Double>,
        private val overageRateAdjustments: JsonField<List<OverageRateAdjustment>>,
        private val priceAdjustments: JsonField<List<PriceAdjustment>>,
        private val trialSpec: JsonField<TrialSpec>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("plan_id") @ExcludeMissing planId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("starting_on")
            @ExcludeMissing
            startingOn: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("ending_before")
            @ExcludeMissing
            endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("net_payment_terms_days")
            @ExcludeMissing
            netPaymentTermsDays: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("overage_rate_adjustments")
            @ExcludeMissing
            overageRateAdjustments: JsonField<List<OverageRateAdjustment>> = JsonMissing.of(),
            @JsonProperty("price_adjustments")
            @ExcludeMissing
            priceAdjustments: JsonField<List<PriceAdjustment>> = JsonMissing.of(),
            @JsonProperty("trial_spec")
            @ExcludeMissing
            trialSpec: JsonField<TrialSpec> = JsonMissing.of(),
        ) : this(
            planId,
            startingOn,
            endingBefore,
            netPaymentTermsDays,
            overageRateAdjustments,
            priceAdjustments,
            trialSpec,
            mutableMapOf(),
        )

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun planId(): String = planId.getRequired("plan_id")

        /**
         * RFC 3339 timestamp for when the plan becomes active for this customer. Must be at 0:00
         * UTC (midnight).
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun startingOn(): OffsetDateTime = startingOn.getRequired("starting_on")

        /**
         * RFC 3339 timestamp for when the plan ends (exclusive) for this customer. Must be at 0:00
         * UTC (midnight).
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun endingBefore(): Optional<OffsetDateTime> = endingBefore.getOptional("ending_before")

        /**
         * Number of days after issuance of invoice after which the invoice is due (e.g. Net 30).
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun netPaymentTermsDays(): Optional<Double> =
            netPaymentTermsDays.getOptional("net_payment_terms_days")

        /**
         * An optional list of overage rates that override the rates of the original plan
         * configuration. These new rates will apply to all pricing ramps.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun overageRateAdjustments(): Optional<List<OverageRateAdjustment>> =
            overageRateAdjustments.getOptional("overage_rate_adjustments")

        /**
         * A list of price adjustments can be applied on top of the pricing in the plans. See the
         * [price adjustments documentation](https://plans-docs.metronome.com/pricing/managing-plans/#price-adjustments)
         * for details.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun priceAdjustments(): Optional<List<PriceAdjustment>> =
            priceAdjustments.getOptional("price_adjustments")

        /**
         * A custom trial can be set for the customer's plan. See the
         * [trial configuration documentation](https://docs.metronome.com/provisioning/configure-trials/)
         * for details.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun trialSpec(): Optional<TrialSpec> = trialSpec.getOptional("trial_spec")

        /**
         * Returns the raw JSON value of [planId].
         *
         * Unlike [planId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("plan_id") @ExcludeMissing fun _planId(): JsonField<String> = planId

        /**
         * Returns the raw JSON value of [startingOn].
         *
         * Unlike [startingOn], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("starting_on")
        @ExcludeMissing
        fun _startingOn(): JsonField<OffsetDateTime> = startingOn

        /**
         * Returns the raw JSON value of [endingBefore].
         *
         * Unlike [endingBefore], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("ending_before")
        @ExcludeMissing
        fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

        /**
         * Returns the raw JSON value of [netPaymentTermsDays].
         *
         * Unlike [netPaymentTermsDays], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("net_payment_terms_days")
        @ExcludeMissing
        fun _netPaymentTermsDays(): JsonField<Double> = netPaymentTermsDays

        /**
         * Returns the raw JSON value of [overageRateAdjustments].
         *
         * Unlike [overageRateAdjustments], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("overage_rate_adjustments")
        @ExcludeMissing
        fun _overageRateAdjustments(): JsonField<List<OverageRateAdjustment>> =
            overageRateAdjustments

        /**
         * Returns the raw JSON value of [priceAdjustments].
         *
         * Unlike [priceAdjustments], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("price_adjustments")
        @ExcludeMissing
        fun _priceAdjustments(): JsonField<List<PriceAdjustment>> = priceAdjustments

        /**
         * Returns the raw JSON value of [trialSpec].
         *
         * Unlike [trialSpec], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("trial_spec")
        @ExcludeMissing
        fun _trialSpec(): JsonField<TrialSpec> = trialSpec

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .planId()
             * .startingOn()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
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
            internal fun from(body: Body) = apply {
                planId = body.planId
                startingOn = body.startingOn
                endingBefore = body.endingBefore
                netPaymentTermsDays = body.netPaymentTermsDays
                overageRateAdjustments = body.overageRateAdjustments.map { it.toMutableList() }
                priceAdjustments = body.priceAdjustments.map { it.toMutableList() }
                trialSpec = body.trialSpec
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun planId(planId: String) = planId(JsonField.of(planId))

            /**
             * Sets [Builder.planId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.planId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun planId(planId: JsonField<String>) = apply { this.planId = planId }

            /**
             * RFC 3339 timestamp for when the plan becomes active for this customer. Must be at
             * 0:00 UTC (midnight).
             */
            fun startingOn(startingOn: OffsetDateTime) = startingOn(JsonField.of(startingOn))

            /**
             * Sets [Builder.startingOn] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startingOn] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Sets [Builder.endingBefore] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endingBefore] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
             * Sets [Builder.netPaymentTermsDays] to an arbitrary JSON value.
             *
             * You should usually call [Builder.netPaymentTermsDays] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
             * Sets [Builder.overageRateAdjustments] to an arbitrary JSON value.
             *
             * You should usually call [Builder.overageRateAdjustments] with a well-typed
             * `List<OverageRateAdjustment>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun overageRateAdjustments(
                overageRateAdjustments: JsonField<List<OverageRateAdjustment>>
            ) = apply {
                this.overageRateAdjustments = overageRateAdjustments.map { it.toMutableList() }
            }

            /**
             * Adds a single [OverageRateAdjustment] to [overageRateAdjustments].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addOverageRateAdjustment(overageRateAdjustment: OverageRateAdjustment) = apply {
                overageRateAdjustments =
                    (overageRateAdjustments ?: JsonField.of(mutableListOf())).also {
                        checkKnown("overageRateAdjustments", it).add(overageRateAdjustment)
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
             * Sets [Builder.priceAdjustments] to an arbitrary JSON value.
             *
             * You should usually call [Builder.priceAdjustments] with a well-typed
             * `List<PriceAdjustment>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun priceAdjustments(priceAdjustments: JsonField<List<PriceAdjustment>>) = apply {
                this.priceAdjustments = priceAdjustments.map { it.toMutableList() }
            }

            /**
             * Adds a single [PriceAdjustment] to [priceAdjustments].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPriceAdjustment(priceAdjustment: PriceAdjustment) = apply {
                priceAdjustments =
                    (priceAdjustments ?: JsonField.of(mutableListOf())).also {
                        checkKnown("priceAdjustments", it).add(priceAdjustment)
                    }
            }

            /**
             * A custom trial can be set for the customer's plan. See the
             * [trial configuration documentation](https://docs.metronome.com/provisioning/configure-trials/)
             * for details.
             */
            fun trialSpec(trialSpec: TrialSpec) = trialSpec(JsonField.of(trialSpec))

            /**
             * Sets [Builder.trialSpec] to an arbitrary JSON value.
             *
             * You should usually call [Builder.trialSpec] with a well-typed [TrialSpec] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .planId()
             * .startingOn()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("planId", planId),
                    checkRequired("startingOn", startingOn),
                    endingBefore,
                    netPaymentTermsDays,
                    (overageRateAdjustments ?: JsonMissing.of()).map { it.toImmutable() },
                    (priceAdjustments ?: JsonMissing.of()).map { it.toImmutable() },
                    trialSpec,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Body = apply {
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
            (if (planId.asKnown().isPresent) 1 else 0) +
                (if (startingOn.asKnown().isPresent) 1 else 0) +
                (if (endingBefore.asKnown().isPresent) 1 else 0) +
                (if (netPaymentTermsDays.asKnown().isPresent) 1 else 0) +
                (overageRateAdjustments.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                    ?: 0) +
                (priceAdjustments.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (trialSpec.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                planId == other.planId &&
                startingOn == other.startingOn &&
                endingBefore == other.endingBefore &&
                netPaymentTermsDays == other.netPaymentTermsDays &&
                overageRateAdjustments == other.overageRateAdjustments &&
                priceAdjustments == other.priceAdjustments &&
                trialSpec == other.trialSpec &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                planId,
                startingOn,
                endingBefore,
                netPaymentTermsDays,
                overageRateAdjustments,
                priceAdjustments,
                trialSpec,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{planId=$planId, startingOn=$startingOn, endingBefore=$endingBefore, netPaymentTermsDays=$netPaymentTermsDays, overageRateAdjustments=$overageRateAdjustments, priceAdjustments=$priceAdjustments, trialSpec=$trialSpec, additionalProperties=$additionalProperties}"
    }

    class OverageRateAdjustment
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val customCreditTypeId: JsonField<String>,
        private val fiatCurrencyCreditTypeId: JsonField<String>,
        private val toFiatConversionFactor: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("custom_credit_type_id")
            @ExcludeMissing
            customCreditTypeId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("fiat_currency_credit_type_id")
            @ExcludeMissing
            fiatCurrencyCreditTypeId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("to_fiat_conversion_factor")
            @ExcludeMissing
            toFiatConversionFactor: JsonField<Double> = JsonMissing.of(),
        ) : this(
            customCreditTypeId,
            fiatCurrencyCreditTypeId,
            toFiatConversionFactor,
            mutableMapOf(),
        )

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun customCreditTypeId(): String = customCreditTypeId.getRequired("custom_credit_type_id")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun fiatCurrencyCreditTypeId(): String =
            fiatCurrencyCreditTypeId.getRequired("fiat_currency_credit_type_id")

        /**
         * The overage cost in fiat currency for each credit of the custom credit type.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun toFiatConversionFactor(): Double =
            toFiatConversionFactor.getRequired("to_fiat_conversion_factor")

        /**
         * Returns the raw JSON value of [customCreditTypeId].
         *
         * Unlike [customCreditTypeId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("custom_credit_type_id")
        @ExcludeMissing
        fun _customCreditTypeId(): JsonField<String> = customCreditTypeId

        /**
         * Returns the raw JSON value of [fiatCurrencyCreditTypeId].
         *
         * Unlike [fiatCurrencyCreditTypeId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("fiat_currency_credit_type_id")
        @ExcludeMissing
        fun _fiatCurrencyCreditTypeId(): JsonField<String> = fiatCurrencyCreditTypeId

        /**
         * Returns the raw JSON value of [toFiatConversionFactor].
         *
         * Unlike [toFiatConversionFactor], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("to_fiat_conversion_factor")
        @ExcludeMissing
        fun _toFiatConversionFactor(): JsonField<Double> = toFiatConversionFactor

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
             * Returns a mutable builder for constructing an instance of [OverageRateAdjustment].
             *
             * The following fields are required:
             * ```java
             * .customCreditTypeId()
             * .fiatCurrencyCreditTypeId()
             * .toFiatConversionFactor()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [OverageRateAdjustment]. */
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

            /**
             * Sets [Builder.customCreditTypeId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customCreditTypeId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customCreditTypeId(customCreditTypeId: JsonField<String>) = apply {
                this.customCreditTypeId = customCreditTypeId
            }

            fun fiatCurrencyCreditTypeId(fiatCurrencyCreditTypeId: String) =
                fiatCurrencyCreditTypeId(JsonField.of(fiatCurrencyCreditTypeId))

            /**
             * Sets [Builder.fiatCurrencyCreditTypeId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fiatCurrencyCreditTypeId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun fiatCurrencyCreditTypeId(fiatCurrencyCreditTypeId: JsonField<String>) = apply {
                this.fiatCurrencyCreditTypeId = fiatCurrencyCreditTypeId
            }

            /** The overage cost in fiat currency for each credit of the custom credit type. */
            fun toFiatConversionFactor(toFiatConversionFactor: Double) =
                toFiatConversionFactor(JsonField.of(toFiatConversionFactor))

            /**
             * Sets [Builder.toFiatConversionFactor] to an arbitrary JSON value.
             *
             * You should usually call [Builder.toFiatConversionFactor] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
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

            /**
             * Returns an immutable instance of [OverageRateAdjustment].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .customCreditTypeId()
             * .fiatCurrencyCreditTypeId()
             * .toFiatConversionFactor()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): OverageRateAdjustment =
                OverageRateAdjustment(
                    checkRequired("customCreditTypeId", customCreditTypeId),
                    checkRequired("fiatCurrencyCreditTypeId", fiatCurrencyCreditTypeId),
                    checkRequired("toFiatConversionFactor", toFiatConversionFactor),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): OverageRateAdjustment = apply {
            if (validated) {
                return@apply
            }

            customCreditTypeId()
            fiatCurrencyCreditTypeId()
            toFiatConversionFactor()
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
            (if (customCreditTypeId.asKnown().isPresent) 1 else 0) +
                (if (fiatCurrencyCreditTypeId.asKnown().isPresent) 1 else 0) +
                (if (toFiatConversionFactor.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is OverageRateAdjustment &&
                customCreditTypeId == other.customCreditTypeId &&
                fiatCurrencyCreditTypeId == other.fiatCurrencyCreditTypeId &&
                toFiatConversionFactor == other.toFiatConversionFactor &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                customCreditTypeId,
                fiatCurrencyCreditTypeId,
                toFiatConversionFactor,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "OverageRateAdjustment{customCreditTypeId=$customCreditTypeId, fiatCurrencyCreditTypeId=$fiatCurrencyCreditTypeId, toFiatConversionFactor=$toFiatConversionFactor, additionalProperties=$additionalProperties}"
    }

    class PriceAdjustment
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val adjustmentType: JsonField<AdjustmentType>,
        private val chargeId: JsonField<String>,
        private val startPeriod: JsonField<Double>,
        private val quantity: JsonField<Double>,
        private val tier: JsonField<Double>,
        private val value: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("adjustment_type")
            @ExcludeMissing
            adjustmentType: JsonField<AdjustmentType> = JsonMissing.of(),
            @JsonProperty("charge_id")
            @ExcludeMissing
            chargeId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("start_period")
            @ExcludeMissing
            startPeriod: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("quantity")
            @ExcludeMissing
            quantity: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("tier") @ExcludeMissing tier: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonField<Double> = JsonMissing.of(),
        ) : this(adjustmentType, chargeId, startPeriod, quantity, tier, value, mutableMapOf())

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun adjustmentType(): AdjustmentType = adjustmentType.getRequired("adjustment_type")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun chargeId(): String = chargeId.getRequired("charge_id")

        /**
         * Used in price ramps. Indicates how many billing periods pass before the charge applies.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun startPeriod(): Double = startPeriod.getRequired("start_period")

        /**
         * the overridden quantity for a fixed charge
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun quantity(): Optional<Double> = quantity.getOptional("quantity")

        /**
         * Used in pricing tiers. Indicates at what metric value the price applies.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun tier(): Optional<Double> = tier.getOptional("tier")

        /**
         * The amount of change to a price. Percentage and fixed adjustments can be positive or
         * negative. Percentage-based adjustments should be decimals, e.g. -0.05 for a 5% discount.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun value(): Optional<Double> = value.getOptional("value")

        /**
         * Returns the raw JSON value of [adjustmentType].
         *
         * Unlike [adjustmentType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("adjustment_type")
        @ExcludeMissing
        fun _adjustmentType(): JsonField<AdjustmentType> = adjustmentType

        /**
         * Returns the raw JSON value of [chargeId].
         *
         * Unlike [chargeId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("charge_id") @ExcludeMissing fun _chargeId(): JsonField<String> = chargeId

        /**
         * Returns the raw JSON value of [startPeriod].
         *
         * Unlike [startPeriod], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start_period")
        @ExcludeMissing
        fun _startPeriod(): JsonField<Double> = startPeriod

        /**
         * Returns the raw JSON value of [quantity].
         *
         * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

        /**
         * Returns the raw JSON value of [tier].
         *
         * Unlike [tier], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tier") @ExcludeMissing fun _tier(): JsonField<Double> = tier

        /**
         * Returns the raw JSON value of [value].
         *
         * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Double> = value

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
             * Returns a mutable builder for constructing an instance of [PriceAdjustment].
             *
             * The following fields are required:
             * ```java
             * .adjustmentType()
             * .chargeId()
             * .startPeriod()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PriceAdjustment]. */
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

            /**
             * Sets [Builder.adjustmentType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.adjustmentType] with a well-typed [AdjustmentType]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun adjustmentType(adjustmentType: JsonField<AdjustmentType>) = apply {
                this.adjustmentType = adjustmentType
            }

            fun chargeId(chargeId: String) = chargeId(JsonField.of(chargeId))

            /**
             * Sets [Builder.chargeId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.chargeId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun chargeId(chargeId: JsonField<String>) = apply { this.chargeId = chargeId }

            /**
             * Used in price ramps. Indicates how many billing periods pass before the charge
             * applies.
             */
            fun startPeriod(startPeriod: Double) = startPeriod(JsonField.of(startPeriod))

            /**
             * Sets [Builder.startPeriod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startPeriod] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startPeriod(startPeriod: JsonField<Double>) = apply {
                this.startPeriod = startPeriod
            }

            /** the overridden quantity for a fixed charge */
            fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

            /**
             * Sets [Builder.quantity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.quantity] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

            /** Used in pricing tiers. Indicates at what metric value the price applies. */
            fun tier(tier: Double) = tier(JsonField.of(tier))

            /**
             * Sets [Builder.tier] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tier] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun tier(tier: JsonField<Double>) = apply { this.tier = tier }

            /**
             * The amount of change to a price. Percentage and fixed adjustments can be positive or
             * negative. Percentage-based adjustments should be decimals, e.g. -0.05 for a 5%
             * discount.
             */
            fun value(value: Double) = value(JsonField.of(value))

            /**
             * Sets [Builder.value] to an arbitrary JSON value.
             *
             * You should usually call [Builder.value] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            /**
             * Returns an immutable instance of [PriceAdjustment].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .adjustmentType()
             * .chargeId()
             * .startPeriod()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PriceAdjustment =
                PriceAdjustment(
                    checkRequired("adjustmentType", adjustmentType),
                    checkRequired("chargeId", chargeId),
                    checkRequired("startPeriod", startPeriod),
                    quantity,
                    tier,
                    value,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): PriceAdjustment = apply {
            if (validated) {
                return@apply
            }

            adjustmentType().validate()
            chargeId()
            startPeriod()
            quantity()
            tier()
            value()
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
            (adjustmentType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (chargeId.asKnown().isPresent) 1 else 0) +
                (if (startPeriod.asKnown().isPresent) 1 else 0) +
                (if (quantity.asKnown().isPresent) 1 else 0) +
                (if (tier.asKnown().isPresent) 1 else 0) +
                (if (value.asKnown().isPresent) 1 else 0)

        class AdjustmentType
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val PERCENTAGE = of("percentage")

                @JvmField val FIXED = of("fixed")

                @JvmField val OVERRIDE = of("override")

                @JvmField val QUANTITY = of("quantity")

                @JvmStatic fun of(value: String) = AdjustmentType(JsonField.of(value))
            }

            /** An enum containing [AdjustmentType]'s known values. */
            enum class Known {
                PERCENTAGE,
                FIXED,
                OVERRIDE,
                QUANTITY,
            }

            /**
             * An enum containing [AdjustmentType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [AdjustmentType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PERCENTAGE,
                FIXED,
                OVERRIDE,
                QUANTITY,
                /**
                 * An enum member indicating that [AdjustmentType] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    PERCENTAGE -> Value.PERCENTAGE
                    FIXED -> Value.FIXED
                    OVERRIDE -> Value.OVERRIDE
                    QUANTITY -> Value.QUANTITY
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws MetronomeInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    PERCENTAGE -> Known.PERCENTAGE
                    FIXED -> Known.FIXED
                    OVERRIDE -> Known.OVERRIDE
                    QUANTITY -> Known.QUANTITY
                    else -> throw MetronomeInvalidDataException("Unknown AdjustmentType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws MetronomeInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    MetronomeInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): AdjustmentType = apply {
                if (validated) {
                    return@apply
                }

                known()
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
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AdjustmentType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PriceAdjustment &&
                adjustmentType == other.adjustmentType &&
                chargeId == other.chargeId &&
                startPeriod == other.startPeriod &&
                quantity == other.quantity &&
                tier == other.tier &&
                value == other.value &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                adjustmentType,
                chargeId,
                startPeriod,
                quantity,
                tier,
                value,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PriceAdjustment{adjustmentType=$adjustmentType, chargeId=$chargeId, startPeriod=$startPeriod, quantity=$quantity, tier=$tier, value=$value, additionalProperties=$additionalProperties}"
    }

    /**
     * A custom trial can be set for the customer's plan. See the
     * [trial configuration documentation](https://docs.metronome.com/provisioning/configure-trials/)
     * for details.
     */
    class TrialSpec
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val lengthInDays: JsonField<Double>,
        private val spendingCap: JsonField<SpendingCap>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("length_in_days")
            @ExcludeMissing
            lengthInDays: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("spending_cap")
            @ExcludeMissing
            spendingCap: JsonField<SpendingCap> = JsonMissing.of(),
        ) : this(lengthInDays, spendingCap, mutableMapOf())

        /**
         * Length of the trial period in days.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun lengthInDays(): Double = lengthInDays.getRequired("length_in_days")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun spendingCap(): Optional<SpendingCap> = spendingCap.getOptional("spending_cap")

        /**
         * Returns the raw JSON value of [lengthInDays].
         *
         * Unlike [lengthInDays], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("length_in_days")
        @ExcludeMissing
        fun _lengthInDays(): JsonField<Double> = lengthInDays

        /**
         * Returns the raw JSON value of [spendingCap].
         *
         * Unlike [spendingCap], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("spending_cap")
        @ExcludeMissing
        fun _spendingCap(): JsonField<SpendingCap> = spendingCap

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
             * Returns a mutable builder for constructing an instance of [TrialSpec].
             *
             * The following fields are required:
             * ```java
             * .lengthInDays()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [TrialSpec]. */
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

            /**
             * Sets [Builder.lengthInDays] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lengthInDays] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lengthInDays(lengthInDays: JsonField<Double>) = apply {
                this.lengthInDays = lengthInDays
            }

            fun spendingCap(spendingCap: SpendingCap) = spendingCap(JsonField.of(spendingCap))

            /**
             * Sets [Builder.spendingCap] to an arbitrary JSON value.
             *
             * You should usually call [Builder.spendingCap] with a well-typed [SpendingCap] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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

            /**
             * Returns an immutable instance of [TrialSpec].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .lengthInDays()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): TrialSpec =
                TrialSpec(
                    checkRequired("lengthInDays", lengthInDays),
                    spendingCap,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): TrialSpec = apply {
            if (validated) {
                return@apply
            }

            lengthInDays()
            spendingCap().ifPresent { it.validate() }
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
            (if (lengthInDays.asKnown().isPresent) 1 else 0) +
                (spendingCap.asKnown().getOrNull()?.validity() ?: 0)

        class SpendingCap
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val amount: JsonField<Double>,
            private val creditTypeId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                amount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("credit_type_id")
                @ExcludeMissing
                creditTypeId: JsonField<String> = JsonMissing.of(),
            ) : this(amount, creditTypeId, mutableMapOf())

            /**
             * The credit amount in the given denomination based on the credit type, e.g. US cents.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): Double = amount.getRequired("amount")

            /**
             * The credit type ID for the spending cap.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun creditTypeId(): String = creditTypeId.getRequired("credit_type_id")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

            /**
             * Returns the raw JSON value of [creditTypeId].
             *
             * Unlike [creditTypeId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("credit_type_id")
            @ExcludeMissing
            fun _creditTypeId(): JsonField<String> = creditTypeId

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
                 * Returns a mutable builder for constructing an instance of [SpendingCap].
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .creditTypeId()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [SpendingCap]. */
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
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                /** The credit type ID for the spending cap. */
                fun creditTypeId(creditTypeId: String) = creditTypeId(JsonField.of(creditTypeId))

                /**
                 * Sets [Builder.creditTypeId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.creditTypeId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
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

                /**
                 * Returns an immutable instance of [SpendingCap].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .creditTypeId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): SpendingCap =
                    SpendingCap(
                        checkRequired("amount", amount),
                        checkRequired("creditTypeId", creditTypeId),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): SpendingCap = apply {
                if (validated) {
                    return@apply
                }

                amount()
                creditTypeId()
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
                    (if (creditTypeId.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is SpendingCap &&
                    amount == other.amount &&
                    creditTypeId == other.creditTypeId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(amount, creditTypeId, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "SpendingCap{amount=$amount, creditTypeId=$creditTypeId, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TrialSpec &&
                lengthInDays == other.lengthInDays &&
                spendingCap == other.spendingCap &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(lengthInDays, spendingCap, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TrialSpec{lengthInDays=$lengthInDays, spendingCap=$spendingCap, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PlanAddParams &&
            customerId == other.customerId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(customerId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PlanAddParams{customerId=$customerId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
