// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers

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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Update configuration settings for a specific customer, such as external system integrations
 * (e.g., Salesforce account ID) and other customer-specific billing parameters. Use this endpoint
 * to modify customer configurations without affecting core customer data like name or ingest
 * aliases.
 */
class CustomerUpdateConfigParams
private constructor(
    private val customerId: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun customerId(): String = customerId

    /**
     * Leave in draft or set to auto-advance on invoices sent to Stripe. Falls back to the
     * client-level config if unset, which defaults to true if unset.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun leaveStripeInvoicesInDraft(): Optional<Boolean> = body.leaveStripeInvoicesInDraft()

    /**
     * The Salesforce account ID for the customer
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun salesforceAccountId(): Optional<String> = body.salesforceAccountId()

    /**
     * Returns the raw JSON value of [leaveStripeInvoicesInDraft].
     *
     * Unlike [leaveStripeInvoicesInDraft], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _leaveStripeInvoicesInDraft(): JsonField<Boolean> = body._leaveStripeInvoicesInDraft()

    /**
     * Returns the raw JSON value of [salesforceAccountId].
     *
     * Unlike [salesforceAccountId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _salesforceAccountId(): JsonField<String> = body._salesforceAccountId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CustomerUpdateConfigParams].
         *
         * The following fields are required:
         * ```java
         * .customerId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomerUpdateConfigParams]. */
    class Builder internal constructor() {

        private var customerId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(customerUpdateConfigParams: CustomerUpdateConfigParams) = apply {
            customerId = customerUpdateConfigParams.customerId
            body = customerUpdateConfigParams.body.toBuilder()
            additionalHeaders = customerUpdateConfigParams.additionalHeaders.toBuilder()
            additionalQueryParams = customerUpdateConfigParams.additionalQueryParams.toBuilder()
        }

        fun customerId(customerId: String) = apply { this.customerId = customerId }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [leaveStripeInvoicesInDraft]
         * - [salesforceAccountId]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * Leave in draft or set to auto-advance on invoices sent to Stripe. Falls back to the
         * client-level config if unset, which defaults to true if unset.
         */
        fun leaveStripeInvoicesInDraft(leaveStripeInvoicesInDraft: Boolean?) = apply {
            body.leaveStripeInvoicesInDraft(leaveStripeInvoicesInDraft)
        }

        /**
         * Alias for [Builder.leaveStripeInvoicesInDraft].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun leaveStripeInvoicesInDraft(leaveStripeInvoicesInDraft: Boolean) =
            leaveStripeInvoicesInDraft(leaveStripeInvoicesInDraft as Boolean?)

        /**
         * Alias for calling [Builder.leaveStripeInvoicesInDraft] with
         * `leaveStripeInvoicesInDraft.orElse(null)`.
         */
        fun leaveStripeInvoicesInDraft(leaveStripeInvoicesInDraft: Optional<Boolean>) =
            leaveStripeInvoicesInDraft(leaveStripeInvoicesInDraft.getOrNull())

        /**
         * Sets [Builder.leaveStripeInvoicesInDraft] to an arbitrary JSON value.
         *
         * You should usually call [Builder.leaveStripeInvoicesInDraft] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun leaveStripeInvoicesInDraft(leaveStripeInvoicesInDraft: JsonField<Boolean>) = apply {
            body.leaveStripeInvoicesInDraft(leaveStripeInvoicesInDraft)
        }

        /** The Salesforce account ID for the customer */
        fun salesforceAccountId(salesforceAccountId: String?) = apply {
            body.salesforceAccountId(salesforceAccountId)
        }

        /**
         * Alias for calling [Builder.salesforceAccountId] with `salesforceAccountId.orElse(null)`.
         */
        fun salesforceAccountId(salesforceAccountId: Optional<String>) =
            salesforceAccountId(salesforceAccountId.getOrNull())

        /**
         * Sets [Builder.salesforceAccountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.salesforceAccountId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun salesforceAccountId(salesforceAccountId: JsonField<String>) = apply {
            body.salesforceAccountId(salesforceAccountId)
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
         * Returns an immutable instance of [CustomerUpdateConfigParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .customerId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CustomerUpdateConfigParams =
            CustomerUpdateConfigParams(
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
        private val leaveStripeInvoicesInDraft: JsonField<Boolean>,
        private val salesforceAccountId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("leave_stripe_invoices_in_draft")
            @ExcludeMissing
            leaveStripeInvoicesInDraft: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("salesforce_account_id")
            @ExcludeMissing
            salesforceAccountId: JsonField<String> = JsonMissing.of(),
        ) : this(leaveStripeInvoicesInDraft, salesforceAccountId, mutableMapOf())

        /**
         * Leave in draft or set to auto-advance on invoices sent to Stripe. Falls back to the
         * client-level config if unset, which defaults to true if unset.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun leaveStripeInvoicesInDraft(): Optional<Boolean> =
            leaveStripeInvoicesInDraft.getOptional("leave_stripe_invoices_in_draft")

        /**
         * The Salesforce account ID for the customer
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun salesforceAccountId(): Optional<String> =
            salesforceAccountId.getOptional("salesforce_account_id")

        /**
         * Returns the raw JSON value of [leaveStripeInvoicesInDraft].
         *
         * Unlike [leaveStripeInvoicesInDraft], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("leave_stripe_invoices_in_draft")
        @ExcludeMissing
        fun _leaveStripeInvoicesInDraft(): JsonField<Boolean> = leaveStripeInvoicesInDraft

        /**
         * Returns the raw JSON value of [salesforceAccountId].
         *
         * Unlike [salesforceAccountId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("salesforce_account_id")
        @ExcludeMissing
        fun _salesforceAccountId(): JsonField<String> = salesforceAccountId

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

            private var leaveStripeInvoicesInDraft: JsonField<Boolean> = JsonMissing.of()
            private var salesforceAccountId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                leaveStripeInvoicesInDraft = body.leaveStripeInvoicesInDraft
                salesforceAccountId = body.salesforceAccountId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Leave in draft or set to auto-advance on invoices sent to Stripe. Falls back to the
             * client-level config if unset, which defaults to true if unset.
             */
            fun leaveStripeInvoicesInDraft(leaveStripeInvoicesInDraft: Boolean?) =
                leaveStripeInvoicesInDraft(JsonField.ofNullable(leaveStripeInvoicesInDraft))

            /**
             * Alias for [Builder.leaveStripeInvoicesInDraft].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun leaveStripeInvoicesInDraft(leaveStripeInvoicesInDraft: Boolean) =
                leaveStripeInvoicesInDraft(leaveStripeInvoicesInDraft as Boolean?)

            /**
             * Alias for calling [Builder.leaveStripeInvoicesInDraft] with
             * `leaveStripeInvoicesInDraft.orElse(null)`.
             */
            fun leaveStripeInvoicesInDraft(leaveStripeInvoicesInDraft: Optional<Boolean>) =
                leaveStripeInvoicesInDraft(leaveStripeInvoicesInDraft.getOrNull())

            /**
             * Sets [Builder.leaveStripeInvoicesInDraft] to an arbitrary JSON value.
             *
             * You should usually call [Builder.leaveStripeInvoicesInDraft] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun leaveStripeInvoicesInDraft(leaveStripeInvoicesInDraft: JsonField<Boolean>) = apply {
                this.leaveStripeInvoicesInDraft = leaveStripeInvoicesInDraft
            }

            /** The Salesforce account ID for the customer */
            fun salesforceAccountId(salesforceAccountId: String?) =
                salesforceAccountId(JsonField.ofNullable(salesforceAccountId))

            /**
             * Alias for calling [Builder.salesforceAccountId] with
             * `salesforceAccountId.orElse(null)`.
             */
            fun salesforceAccountId(salesforceAccountId: Optional<String>) =
                salesforceAccountId(salesforceAccountId.getOrNull())

            /**
             * Sets [Builder.salesforceAccountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.salesforceAccountId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun salesforceAccountId(salesforceAccountId: JsonField<String>) = apply {
                this.salesforceAccountId = salesforceAccountId
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
                    leaveStripeInvoicesInDraft,
                    salesforceAccountId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            leaveStripeInvoicesInDraft()
            salesforceAccountId()
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
            (if (leaveStripeInvoicesInDraft.asKnown().isPresent) 1 else 0) +
                (if (salesforceAccountId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                leaveStripeInvoicesInDraft == other.leaveStripeInvoicesInDraft &&
                salesforceAccountId == other.salesforceAccountId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(leaveStripeInvoicesInDraft, salesforceAccountId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{leaveStripeInvoicesInDraft=$leaveStripeInvoicesInDraft, salesforceAccountId=$salesforceAccountId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomerUpdateConfigParams &&
            customerId == other.customerId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(customerId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CustomerUpdateConfigParams{customerId=$customerId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
