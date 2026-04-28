// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers.plans

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.Params
import com.metronome.api.core.checkRequired
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.errors.MetronomeInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional

/**
 * Change the end date of a customer's plan. This is a Plans (deprecated) endpoint. New clients
 * should implement using Contracts.
 */
class PlanEndParams
private constructor(
    private val customerId: String,
    private val customerPlanId: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun customerId(): String = customerId

    fun customerPlanId(): String = customerPlanId

    /**
     * RFC 3339 timestamp for when the plan ends (exclusive) for this customer. Must be at 0:00 UTC
     * (midnight). If not provided, the plan end date will be cleared.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endingBefore(): Optional<OffsetDateTime> = body.endingBefore()

    /**
     * If true, plan end date can be before the last finalized invoice date. Any invoices generated
     * after the plan end date will be voided.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun voidInvoices(): Optional<Boolean> = body.voidInvoices()

    /**
     * Only applicable when void_invoices is set to true. If true, for every invoice that is voided
     * we will also attempt to void/delete the stripe invoice (if any). Stripe invoices will be
     * voided if finalized or deleted if still in draft state.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun voidStripeInvoices(): Optional<Boolean> = body.voidStripeInvoices()

    /**
     * Returns the raw JSON value of [endingBefore].
     *
     * Unlike [endingBefore], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _endingBefore(): JsonField<OffsetDateTime> = body._endingBefore()

    /**
     * Returns the raw JSON value of [voidInvoices].
     *
     * Unlike [voidInvoices], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _voidInvoices(): JsonField<Boolean> = body._voidInvoices()

    /**
     * Returns the raw JSON value of [voidStripeInvoices].
     *
     * Unlike [voidStripeInvoices], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _voidStripeInvoices(): JsonField<Boolean> = body._voidStripeInvoices()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PlanEndParams].
         *
         * The following fields are required:
         * ```java
         * .customerId()
         * .customerPlanId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PlanEndParams]. */
    class Builder internal constructor() {

        private var customerId: String? = null
        private var customerPlanId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(planEndParams: PlanEndParams) = apply {
            customerId = planEndParams.customerId
            customerPlanId = planEndParams.customerPlanId
            body = planEndParams.body.toBuilder()
            additionalHeaders = planEndParams.additionalHeaders.toBuilder()
            additionalQueryParams = planEndParams.additionalQueryParams.toBuilder()
        }

        fun customerId(customerId: String) = apply { this.customerId = customerId }

        fun customerPlanId(customerPlanId: String) = apply { this.customerPlanId = customerPlanId }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [endingBefore]
         * - [voidInvoices]
         * - [voidStripeInvoices]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * RFC 3339 timestamp for when the plan ends (exclusive) for this customer. Must be at 0:00
         * UTC (midnight). If not provided, the plan end date will be cleared.
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
         * If true, plan end date can be before the last finalized invoice date. Any invoices
         * generated after the plan end date will be voided.
         */
        fun voidInvoices(voidInvoices: Boolean) = apply { body.voidInvoices(voidInvoices) }

        /**
         * Sets [Builder.voidInvoices] to an arbitrary JSON value.
         *
         * You should usually call [Builder.voidInvoices] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun voidInvoices(voidInvoices: JsonField<Boolean>) = apply {
            body.voidInvoices(voidInvoices)
        }

        /**
         * Only applicable when void_invoices is set to true. If true, for every invoice that is
         * voided we will also attempt to void/delete the stripe invoice (if any). Stripe invoices
         * will be voided if finalized or deleted if still in draft state.
         */
        fun voidStripeInvoices(voidStripeInvoices: Boolean) = apply {
            body.voidStripeInvoices(voidStripeInvoices)
        }

        /**
         * Sets [Builder.voidStripeInvoices] to an arbitrary JSON value.
         *
         * You should usually call [Builder.voidStripeInvoices] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun voidStripeInvoices(voidStripeInvoices: JsonField<Boolean>) = apply {
            body.voidStripeInvoices(voidStripeInvoices)
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

        /**
         * Returns an immutable instance of [PlanEndParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .customerId()
         * .customerPlanId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PlanEndParams =
            PlanEndParams(
                checkRequired("customerId", customerId),
                checkRequired("customerPlanId", customerPlanId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> customerId
            1 -> customerPlanId
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val endingBefore: JsonField<OffsetDateTime>,
        private val voidInvoices: JsonField<Boolean>,
        private val voidStripeInvoices: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("ending_before")
            @ExcludeMissing
            endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("void_invoices")
            @ExcludeMissing
            voidInvoices: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("void_stripe_invoices")
            @ExcludeMissing
            voidStripeInvoices: JsonField<Boolean> = JsonMissing.of(),
        ) : this(endingBefore, voidInvoices, voidStripeInvoices, mutableMapOf())

        /**
         * RFC 3339 timestamp for when the plan ends (exclusive) for this customer. Must be at 0:00
         * UTC (midnight). If not provided, the plan end date will be cleared.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun endingBefore(): Optional<OffsetDateTime> = endingBefore.getOptional("ending_before")

        /**
         * If true, plan end date can be before the last finalized invoice date. Any invoices
         * generated after the plan end date will be voided.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun voidInvoices(): Optional<Boolean> = voidInvoices.getOptional("void_invoices")

        /**
         * Only applicable when void_invoices is set to true. If true, for every invoice that is
         * voided we will also attempt to void/delete the stripe invoice (if any). Stripe invoices
         * will be voided if finalized or deleted if still in draft state.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun voidStripeInvoices(): Optional<Boolean> =
            voidStripeInvoices.getOptional("void_stripe_invoices")

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
         * Returns the raw JSON value of [voidInvoices].
         *
         * Unlike [voidInvoices], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("void_invoices")
        @ExcludeMissing
        fun _voidInvoices(): JsonField<Boolean> = voidInvoices

        /**
         * Returns the raw JSON value of [voidStripeInvoices].
         *
         * Unlike [voidStripeInvoices], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("void_stripe_invoices")
        @ExcludeMissing
        fun _voidStripeInvoices(): JsonField<Boolean> = voidStripeInvoices

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
            private var voidInvoices: JsonField<Boolean> = JsonMissing.of()
            private var voidStripeInvoices: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                endingBefore = body.endingBefore
                voidInvoices = body.voidInvoices
                voidStripeInvoices = body.voidStripeInvoices
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * RFC 3339 timestamp for when the plan ends (exclusive) for this customer. Must be at
             * 0:00 UTC (midnight). If not provided, the plan end date will be cleared.
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
             * If true, plan end date can be before the last finalized invoice date. Any invoices
             * generated after the plan end date will be voided.
             */
            fun voidInvoices(voidInvoices: Boolean) = voidInvoices(JsonField.of(voidInvoices))

            /**
             * Sets [Builder.voidInvoices] to an arbitrary JSON value.
             *
             * You should usually call [Builder.voidInvoices] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun voidInvoices(voidInvoices: JsonField<Boolean>) = apply {
                this.voidInvoices = voidInvoices
            }

            /**
             * Only applicable when void_invoices is set to true. If true, for every invoice that is
             * voided we will also attempt to void/delete the stripe invoice (if any). Stripe
             * invoices will be voided if finalized or deleted if still in draft state.
             */
            fun voidStripeInvoices(voidStripeInvoices: Boolean) =
                voidStripeInvoices(JsonField.of(voidStripeInvoices))

            /**
             * Sets [Builder.voidStripeInvoices] to an arbitrary JSON value.
             *
             * You should usually call [Builder.voidStripeInvoices] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun voidStripeInvoices(voidStripeInvoices: JsonField<Boolean>) = apply {
                this.voidStripeInvoices = voidStripeInvoices
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    endingBefore,
                    voidInvoices,
                    voidStripeInvoices,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            endingBefore()
            voidInvoices()
            voidStripeInvoices()
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
            (if (endingBefore.asKnown().isPresent) 1 else 0) +
                (if (voidInvoices.asKnown().isPresent) 1 else 0) +
                (if (voidStripeInvoices.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                endingBefore == other.endingBefore &&
                voidInvoices == other.voidInvoices &&
                voidStripeInvoices == other.voidStripeInvoices &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(endingBefore, voidInvoices, voidStripeInvoices, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{endingBefore=$endingBefore, voidInvoices=$voidInvoices, voidStripeInvoices=$voidStripeInvoices, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PlanEndParams &&
            customerId == other.customerId &&
            customerPlanId == other.customerPlanId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(customerId, customerPlanId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PlanEndParams{customerId=$customerId, customerPlanId=$customerPlanId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
