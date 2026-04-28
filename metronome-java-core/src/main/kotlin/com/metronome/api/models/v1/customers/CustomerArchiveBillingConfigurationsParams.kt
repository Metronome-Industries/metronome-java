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
import com.metronome.api.core.checkKnown
import com.metronome.api.core.checkRequired
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/**
 * Deprecate an existing billing configuration for a customer to handle churn or billing and
 * collection preference changes. Archiving a billing configuration takes effect immediately. If
 * there are active contracts using the configuration, Metronome will archive the configuration on
 * the contract and immediately stop metering to downstream systems.
 *
 * ### Use this endpoint to:
 * - Remove billing provider customer data and configurations when no longer needed
 * - Clean up test or deprecated billing provider configurations
 * - Free up uniqueness keys for reuse with new billing provider configurations
 * - Disable threshold recharge configurations associated with archived billing providers
 *
 * ### Key response fields:
 * A successful response returns:
 * - `success`: Boolean indicating the operation completed successfully
 * - `error`: Null on success, error message on failure
 *
 * ### Usage guidelines:
 * - Archiving a contract configuration during a grace period will result in the invoice not being
 *   sent to the customer
 * - Automatically disables both spend-based and credit-based threshold recharge configurations for
 *   contracts using the archived billing provider
 * - You can archive multiple configurations for a single customer in a single request, but any
 *   validation failures for an individual configuration will prevent the entire operation from
 *   succeeding
 */
class CustomerArchiveBillingConfigurationsParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Array of billing provider configuration IDs to archive
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customerBillingProviderConfigurationIds(): List<String> =
        body.customerBillingProviderConfigurationIds()

    /**
     * The customer ID the billing provider configurations belong to
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customerId(): String = body.customerId()

    /**
     * Returns the raw JSON value of [customerBillingProviderConfigurationIds].
     *
     * Unlike [customerBillingProviderConfigurationIds], this method doesn't throw if the JSON field
     * has an unexpected type.
     */
    fun _customerBillingProviderConfigurationIds(): JsonField<List<String>> =
        body._customerBillingProviderConfigurationIds()

    /**
     * Returns the raw JSON value of [customerId].
     *
     * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _customerId(): JsonField<String> = body._customerId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [CustomerArchiveBillingConfigurationsParams].
         *
         * The following fields are required:
         * ```java
         * .customerBillingProviderConfigurationIds()
         * .customerId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomerArchiveBillingConfigurationsParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            customerArchiveBillingConfigurationsParams: CustomerArchiveBillingConfigurationsParams
        ) = apply {
            body = customerArchiveBillingConfigurationsParams.body.toBuilder()
            additionalHeaders =
                customerArchiveBillingConfigurationsParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                customerArchiveBillingConfigurationsParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [customerBillingProviderConfigurationIds]
         * - [customerId]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Array of billing provider configuration IDs to archive */
        fun customerBillingProviderConfigurationIds(
            customerBillingProviderConfigurationIds: List<String>
        ) = apply {
            body.customerBillingProviderConfigurationIds(customerBillingProviderConfigurationIds)
        }

        /**
         * Sets [Builder.customerBillingProviderConfigurationIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerBillingProviderConfigurationIds] with a
         * well-typed `List<String>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun customerBillingProviderConfigurationIds(
            customerBillingProviderConfigurationIds: JsonField<List<String>>
        ) = apply {
            body.customerBillingProviderConfigurationIds(customerBillingProviderConfigurationIds)
        }

        /**
         * Adds a single [String] to [customerBillingProviderConfigurationIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCustomerBillingProviderConfigurationId(
            customerBillingProviderConfigurationId: String
        ) = apply {
            body.addCustomerBillingProviderConfigurationId(customerBillingProviderConfigurationId)
        }

        /** The customer ID the billing provider configurations belong to */
        fun customerId(customerId: String) = apply { body.customerId(customerId) }

        /**
         * Sets [Builder.customerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerId(customerId: JsonField<String>) = apply { body.customerId(customerId) }

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
         * Returns an immutable instance of [CustomerArchiveBillingConfigurationsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .customerBillingProviderConfigurationIds()
         * .customerId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CustomerArchiveBillingConfigurationsParams =
            CustomerArchiveBillingConfigurationsParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val customerBillingProviderConfigurationIds: JsonField<List<String>>,
        private val customerId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("customer_billing_provider_configuration_ids")
            @ExcludeMissing
            customerBillingProviderConfigurationIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("customer_id")
            @ExcludeMissing
            customerId: JsonField<String> = JsonMissing.of(),
        ) : this(customerBillingProviderConfigurationIds, customerId, mutableMapOf())

        /**
         * Array of billing provider configuration IDs to archive
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun customerBillingProviderConfigurationIds(): List<String> =
            customerBillingProviderConfigurationIds.getRequired(
                "customer_billing_provider_configuration_ids"
            )

        /**
         * The customer ID the billing provider configurations belong to
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun customerId(): String = customerId.getRequired("customer_id")

        /**
         * Returns the raw JSON value of [customerBillingProviderConfigurationIds].
         *
         * Unlike [customerBillingProviderConfigurationIds], this method doesn't throw if the JSON
         * field has an unexpected type.
         */
        @JsonProperty("customer_billing_provider_configuration_ids")
        @ExcludeMissing
        fun _customerBillingProviderConfigurationIds(): JsonField<List<String>> =
            customerBillingProviderConfigurationIds

        /**
         * Returns the raw JSON value of [customerId].
         *
         * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

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
             * .customerBillingProviderConfigurationIds()
             * .customerId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var customerBillingProviderConfigurationIds: JsonField<MutableList<String>>? =
                null
            private var customerId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                customerBillingProviderConfigurationIds =
                    body.customerBillingProviderConfigurationIds.map { it.toMutableList() }
                customerId = body.customerId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Array of billing provider configuration IDs to archive */
            fun customerBillingProviderConfigurationIds(
                customerBillingProviderConfigurationIds: List<String>
            ) =
                customerBillingProviderConfigurationIds(
                    JsonField.of(customerBillingProviderConfigurationIds)
                )

            /**
             * Sets [Builder.customerBillingProviderConfigurationIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerBillingProviderConfigurationIds] with a
             * well-typed `List<String>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun customerBillingProviderConfigurationIds(
                customerBillingProviderConfigurationIds: JsonField<List<String>>
            ) = apply {
                this.customerBillingProviderConfigurationIds =
                    customerBillingProviderConfigurationIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [customerBillingProviderConfigurationIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCustomerBillingProviderConfigurationId(
                customerBillingProviderConfigurationId: String
            ) = apply {
                customerBillingProviderConfigurationIds =
                    (customerBillingProviderConfigurationIds ?: JsonField.of(mutableListOf()))
                        .also {
                            checkKnown("customerBillingProviderConfigurationIds", it)
                                .add(customerBillingProviderConfigurationId)
                        }
            }

            /** The customer ID the billing provider configurations belong to */
            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            /**
             * Sets [Builder.customerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

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
             * .customerBillingProviderConfigurationIds()
             * .customerId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired(
                            "customerBillingProviderConfigurationIds",
                            customerBillingProviderConfigurationIds,
                        )
                        .map { it.toImmutable() },
                    checkRequired("customerId", customerId),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            customerBillingProviderConfigurationIds()
            customerId()
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
            (customerBillingProviderConfigurationIds.asKnown().getOrNull()?.size ?: 0) +
                (if (customerId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                customerBillingProviderConfigurationIds ==
                    other.customerBillingProviderConfigurationIds &&
                customerId == other.customerId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(customerBillingProviderConfigurationIds, customerId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{customerBillingProviderConfigurationIds=$customerBillingProviderConfigurationIds, customerId=$customerId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomerArchiveBillingConfigurationsParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CustomerArchiveBillingConfigurationsParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
