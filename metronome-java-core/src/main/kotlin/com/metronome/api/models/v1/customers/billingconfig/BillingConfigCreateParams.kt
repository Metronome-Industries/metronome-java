// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers.billingconfig

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
import com.metronome.api.core.checkRequired
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.errors.MetronomeInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Set the billing configuration for a given customer. This is a Plans (deprecated) endpoint. New
 * clients should implement using Contracts.
 */
class BillingConfigCreateParams
private constructor(
    private val customerId: String,
    private val billingProviderType: BillingProviderType,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun customerId(): String = customerId

    fun billingProviderType(): BillingProviderType = billingProviderType

    /**
     * The customer ID in the billing provider's system. For Azure, this is the subscription ID.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun billingProviderCustomerId(): String = body.billingProviderCustomerId()

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun awsCustomerAccountId(): Optional<String> = body.awsCustomerAccountId()

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun awsCustomerId(): Optional<String> = body.awsCustomerId()

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun awsProductCode(): Optional<String> = body.awsProductCode()

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun awsRegion(): Optional<AwsRegion> = body.awsRegion()

    /**
     * The collection method for the customer's invoices. NOTE: `auto_charge_payment_intent` and
     * `manually_charge_payment_intent` are in beta.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stripeCollectionMethod(): Optional<StripeCollectionMethod> = body.stripeCollectionMethod()

    /**
     * Returns the raw JSON value of [billingProviderCustomerId].
     *
     * Unlike [billingProviderCustomerId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _billingProviderCustomerId(): JsonField<String> = body._billingProviderCustomerId()

    /**
     * Returns the raw JSON value of [awsCustomerAccountId].
     *
     * Unlike [awsCustomerAccountId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _awsCustomerAccountId(): JsonField<String> = body._awsCustomerAccountId()

    /**
     * Returns the raw JSON value of [awsCustomerId].
     *
     * Unlike [awsCustomerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _awsCustomerId(): JsonField<String> = body._awsCustomerId()

    /**
     * Returns the raw JSON value of [awsProductCode].
     *
     * Unlike [awsProductCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _awsProductCode(): JsonField<String> = body._awsProductCode()

    /**
     * Returns the raw JSON value of [awsRegion].
     *
     * Unlike [awsRegion], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _awsRegion(): JsonField<AwsRegion> = body._awsRegion()

    /**
     * Returns the raw JSON value of [stripeCollectionMethod].
     *
     * Unlike [stripeCollectionMethod], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _stripeCollectionMethod(): JsonField<StripeCollectionMethod> =
        body._stripeCollectionMethod()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BillingConfigCreateParams].
         *
         * The following fields are required:
         * ```java
         * .customerId()
         * .billingProviderType()
         * .billingProviderCustomerId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BillingConfigCreateParams]. */
    class Builder internal constructor() {

        private var customerId: String? = null
        private var billingProviderType: BillingProviderType? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(billingConfigCreateParams: BillingConfigCreateParams) = apply {
            customerId = billingConfigCreateParams.customerId
            billingProviderType = billingConfigCreateParams.billingProviderType
            body = billingConfigCreateParams.body.toBuilder()
            additionalHeaders = billingConfigCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = billingConfigCreateParams.additionalQueryParams.toBuilder()
        }

        fun customerId(customerId: String) = apply { this.customerId = customerId }

        fun billingProviderType(billingProviderType: BillingProviderType) = apply {
            this.billingProviderType = billingProviderType
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [billingProviderCustomerId]
         * - [awsCustomerAccountId]
         * - [awsCustomerId]
         * - [awsProductCode]
         * - [awsRegion]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * The customer ID in the billing provider's system. For Azure, this is the subscription ID.
         */
        fun billingProviderCustomerId(billingProviderCustomerId: String) = apply {
            body.billingProviderCustomerId(billingProviderCustomerId)
        }

        /**
         * Sets [Builder.billingProviderCustomerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billingProviderCustomerId] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun billingProviderCustomerId(billingProviderCustomerId: JsonField<String>) = apply {
            body.billingProviderCustomerId(billingProviderCustomerId)
        }

        fun awsCustomerAccountId(awsCustomerAccountId: String) = apply {
            body.awsCustomerAccountId(awsCustomerAccountId)
        }

        /**
         * Sets [Builder.awsCustomerAccountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.awsCustomerAccountId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun awsCustomerAccountId(awsCustomerAccountId: JsonField<String>) = apply {
            body.awsCustomerAccountId(awsCustomerAccountId)
        }

        fun awsCustomerId(awsCustomerId: String) = apply { body.awsCustomerId(awsCustomerId) }

        /**
         * Sets [Builder.awsCustomerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.awsCustomerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun awsCustomerId(awsCustomerId: JsonField<String>) = apply {
            body.awsCustomerId(awsCustomerId)
        }

        fun awsProductCode(awsProductCode: String) = apply { body.awsProductCode(awsProductCode) }

        /**
         * Sets [Builder.awsProductCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.awsProductCode] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun awsProductCode(awsProductCode: JsonField<String>) = apply {
            body.awsProductCode(awsProductCode)
        }

        fun awsRegion(awsRegion: AwsRegion) = apply { body.awsRegion(awsRegion) }

        /**
         * Sets [Builder.awsRegion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.awsRegion] with a well-typed [AwsRegion] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun awsRegion(awsRegion: JsonField<AwsRegion>) = apply { body.awsRegion(awsRegion) }

        /**
         * The collection method for the customer's invoices. NOTE: `auto_charge_payment_intent` and
         * `manually_charge_payment_intent` are in beta.
         */
        fun stripeCollectionMethod(stripeCollectionMethod: StripeCollectionMethod) = apply {
            body.stripeCollectionMethod(stripeCollectionMethod)
        }

        /**
         * Sets [Builder.stripeCollectionMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stripeCollectionMethod] with a well-typed
         * [StripeCollectionMethod] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun stripeCollectionMethod(stripeCollectionMethod: JsonField<StripeCollectionMethod>) =
            apply {
                body.stripeCollectionMethod(stripeCollectionMethod)
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
         * Returns an immutable instance of [BillingConfigCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .customerId()
         * .billingProviderType()
         * .billingProviderCustomerId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BillingConfigCreateParams =
            BillingConfigCreateParams(
                checkRequired("customerId", customerId),
                checkRequired("billingProviderType", billingProviderType),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> customerId
            1 -> billingProviderType.toString()
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val billingProviderCustomerId: JsonField<String>,
        private val awsCustomerAccountId: JsonField<String>,
        private val awsCustomerId: JsonField<String>,
        private val awsProductCode: JsonField<String>,
        private val awsRegion: JsonField<AwsRegion>,
        private val stripeCollectionMethod: JsonField<StripeCollectionMethod>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("billing_provider_customer_id")
            @ExcludeMissing
            billingProviderCustomerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("aws_customer_account_id")
            @ExcludeMissing
            awsCustomerAccountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("aws_customer_id")
            @ExcludeMissing
            awsCustomerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("aws_product_code")
            @ExcludeMissing
            awsProductCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("aws_region")
            @ExcludeMissing
            awsRegion: JsonField<AwsRegion> = JsonMissing.of(),
            @JsonProperty("stripe_collection_method")
            @ExcludeMissing
            stripeCollectionMethod: JsonField<StripeCollectionMethod> = JsonMissing.of(),
        ) : this(
            billingProviderCustomerId,
            awsCustomerAccountId,
            awsCustomerId,
            awsProductCode,
            awsRegion,
            stripeCollectionMethod,
            mutableMapOf(),
        )

        /**
         * The customer ID in the billing provider's system. For Azure, this is the subscription ID.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun billingProviderCustomerId(): String =
            billingProviderCustomerId.getRequired("billing_provider_customer_id")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun awsCustomerAccountId(): Optional<String> =
            awsCustomerAccountId.getOptional("aws_customer_account_id")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun awsCustomerId(): Optional<String> = awsCustomerId.getOptional("aws_customer_id")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun awsProductCode(): Optional<String> = awsProductCode.getOptional("aws_product_code")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun awsRegion(): Optional<AwsRegion> = awsRegion.getOptional("aws_region")

        /**
         * The collection method for the customer's invoices. NOTE: `auto_charge_payment_intent` and
         * `manually_charge_payment_intent` are in beta.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun stripeCollectionMethod(): Optional<StripeCollectionMethod> =
            stripeCollectionMethod.getOptional("stripe_collection_method")

        /**
         * Returns the raw JSON value of [billingProviderCustomerId].
         *
         * Unlike [billingProviderCustomerId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("billing_provider_customer_id")
        @ExcludeMissing
        fun _billingProviderCustomerId(): JsonField<String> = billingProviderCustomerId

        /**
         * Returns the raw JSON value of [awsCustomerAccountId].
         *
         * Unlike [awsCustomerAccountId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("aws_customer_account_id")
        @ExcludeMissing
        fun _awsCustomerAccountId(): JsonField<String> = awsCustomerAccountId

        /**
         * Returns the raw JSON value of [awsCustomerId].
         *
         * Unlike [awsCustomerId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("aws_customer_id")
        @ExcludeMissing
        fun _awsCustomerId(): JsonField<String> = awsCustomerId

        /**
         * Returns the raw JSON value of [awsProductCode].
         *
         * Unlike [awsProductCode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("aws_product_code")
        @ExcludeMissing
        fun _awsProductCode(): JsonField<String> = awsProductCode

        /**
         * Returns the raw JSON value of [awsRegion].
         *
         * Unlike [awsRegion], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("aws_region")
        @ExcludeMissing
        fun _awsRegion(): JsonField<AwsRegion> = awsRegion

        /**
         * Returns the raw JSON value of [stripeCollectionMethod].
         *
         * Unlike [stripeCollectionMethod], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("stripe_collection_method")
        @ExcludeMissing
        fun _stripeCollectionMethod(): JsonField<StripeCollectionMethod> = stripeCollectionMethod

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
             * .billingProviderCustomerId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var billingProviderCustomerId: JsonField<String>? = null
            private var awsCustomerAccountId: JsonField<String> = JsonMissing.of()
            private var awsCustomerId: JsonField<String> = JsonMissing.of()
            private var awsProductCode: JsonField<String> = JsonMissing.of()
            private var awsRegion: JsonField<AwsRegion> = JsonMissing.of()
            private var stripeCollectionMethod: JsonField<StripeCollectionMethod> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                billingProviderCustomerId = body.billingProviderCustomerId
                awsCustomerAccountId = body.awsCustomerAccountId
                awsCustomerId = body.awsCustomerId
                awsProductCode = body.awsProductCode
                awsRegion = body.awsRegion
                stripeCollectionMethod = body.stripeCollectionMethod
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * The customer ID in the billing provider's system. For Azure, this is the subscription
             * ID.
             */
            fun billingProviderCustomerId(billingProviderCustomerId: String) =
                billingProviderCustomerId(JsonField.of(billingProviderCustomerId))

            /**
             * Sets [Builder.billingProviderCustomerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billingProviderCustomerId] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun billingProviderCustomerId(billingProviderCustomerId: JsonField<String>) = apply {
                this.billingProviderCustomerId = billingProviderCustomerId
            }

            fun awsCustomerAccountId(awsCustomerAccountId: String) =
                awsCustomerAccountId(JsonField.of(awsCustomerAccountId))

            /**
             * Sets [Builder.awsCustomerAccountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.awsCustomerAccountId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun awsCustomerAccountId(awsCustomerAccountId: JsonField<String>) = apply {
                this.awsCustomerAccountId = awsCustomerAccountId
            }

            fun awsCustomerId(awsCustomerId: String) = awsCustomerId(JsonField.of(awsCustomerId))

            /**
             * Sets [Builder.awsCustomerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.awsCustomerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun awsCustomerId(awsCustomerId: JsonField<String>) = apply {
                this.awsCustomerId = awsCustomerId
            }

            fun awsProductCode(awsProductCode: String) =
                awsProductCode(JsonField.of(awsProductCode))

            /**
             * Sets [Builder.awsProductCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.awsProductCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun awsProductCode(awsProductCode: JsonField<String>) = apply {
                this.awsProductCode = awsProductCode
            }

            fun awsRegion(awsRegion: AwsRegion) = awsRegion(JsonField.of(awsRegion))

            /**
             * Sets [Builder.awsRegion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.awsRegion] with a well-typed [AwsRegion] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun awsRegion(awsRegion: JsonField<AwsRegion>) = apply { this.awsRegion = awsRegion }

            /**
             * The collection method for the customer's invoices. NOTE: `auto_charge_payment_intent`
             * and `manually_charge_payment_intent` are in beta.
             */
            fun stripeCollectionMethod(stripeCollectionMethod: StripeCollectionMethod) =
                stripeCollectionMethod(JsonField.of(stripeCollectionMethod))

            /**
             * Sets [Builder.stripeCollectionMethod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.stripeCollectionMethod] with a well-typed
             * [StripeCollectionMethod] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun stripeCollectionMethod(stripeCollectionMethod: JsonField<StripeCollectionMethod>) =
                apply {
                    this.stripeCollectionMethod = stripeCollectionMethod
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
             *
             * The following fields are required:
             * ```java
             * .billingProviderCustomerId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("billingProviderCustomerId", billingProviderCustomerId),
                    awsCustomerAccountId,
                    awsCustomerId,
                    awsProductCode,
                    awsRegion,
                    stripeCollectionMethod,
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

            billingProviderCustomerId()
            awsCustomerAccountId()
            awsCustomerId()
            awsProductCode()
            awsRegion().ifPresent { it.validate() }
            stripeCollectionMethod().ifPresent { it.validate() }
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
            (if (billingProviderCustomerId.asKnown().isPresent) 1 else 0) +
                (if (awsCustomerAccountId.asKnown().isPresent) 1 else 0) +
                (if (awsCustomerId.asKnown().isPresent) 1 else 0) +
                (if (awsProductCode.asKnown().isPresent) 1 else 0) +
                (awsRegion.asKnown().getOrNull()?.validity() ?: 0) +
                (stripeCollectionMethod.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                billingProviderCustomerId == other.billingProviderCustomerId &&
                awsCustomerAccountId == other.awsCustomerAccountId &&
                awsCustomerId == other.awsCustomerId &&
                awsProductCode == other.awsProductCode &&
                awsRegion == other.awsRegion &&
                stripeCollectionMethod == other.stripeCollectionMethod &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                billingProviderCustomerId,
                awsCustomerAccountId,
                awsCustomerId,
                awsProductCode,
                awsRegion,
                stripeCollectionMethod,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{billingProviderCustomerId=$billingProviderCustomerId, awsCustomerAccountId=$awsCustomerAccountId, awsCustomerId=$awsCustomerId, awsProductCode=$awsProductCode, awsRegion=$awsRegion, stripeCollectionMethod=$stripeCollectionMethod, additionalProperties=$additionalProperties}"
    }

    class AwsRegion @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val AF_SOUTH_1 = of("af-south-1")

            @JvmField val AP_EAST_1 = of("ap-east-1")

            @JvmField val AP_NORTHEAST_1 = of("ap-northeast-1")

            @JvmField val AP_NORTHEAST_2 = of("ap-northeast-2")

            @JvmField val AP_NORTHEAST_3 = of("ap-northeast-3")

            @JvmField val AP_SOUTH_1 = of("ap-south-1")

            @JvmField val AP_SOUTHEAST_1 = of("ap-southeast-1")

            @JvmField val AP_SOUTHEAST_2 = of("ap-southeast-2")

            @JvmField val CA_CENTRAL_1 = of("ca-central-1")

            @JvmField val CN_NORTH_1 = of("cn-north-1")

            @JvmField val CN_NORTHWEST_1 = of("cn-northwest-1")

            @JvmField val EU_CENTRAL_1 = of("eu-central-1")

            @JvmField val EU_NORTH_1 = of("eu-north-1")

            @JvmField val EU_SOUTH_1 = of("eu-south-1")

            @JvmField val EU_WEST_1 = of("eu-west-1")

            @JvmField val EU_WEST_2 = of("eu-west-2")

            @JvmField val EU_WEST_3 = of("eu-west-3")

            @JvmField val ME_SOUTH_1 = of("me-south-1")

            @JvmField val SA_EAST_1 = of("sa-east-1")

            @JvmField val US_EAST_1 = of("us-east-1")

            @JvmField val US_EAST_2 = of("us-east-2")

            @JvmField val US_GOV_EAST_1 = of("us-gov-east-1")

            @JvmField val US_GOV_WEST_1 = of("us-gov-west-1")

            @JvmField val US_WEST_1 = of("us-west-1")

            @JvmField val US_WEST_2 = of("us-west-2")

            @JvmStatic fun of(value: String) = AwsRegion(JsonField.of(value))
        }

        /** An enum containing [AwsRegion]'s known values. */
        enum class Known {
            AF_SOUTH_1,
            AP_EAST_1,
            AP_NORTHEAST_1,
            AP_NORTHEAST_2,
            AP_NORTHEAST_3,
            AP_SOUTH_1,
            AP_SOUTHEAST_1,
            AP_SOUTHEAST_2,
            CA_CENTRAL_1,
            CN_NORTH_1,
            CN_NORTHWEST_1,
            EU_CENTRAL_1,
            EU_NORTH_1,
            EU_SOUTH_1,
            EU_WEST_1,
            EU_WEST_2,
            EU_WEST_3,
            ME_SOUTH_1,
            SA_EAST_1,
            US_EAST_1,
            US_EAST_2,
            US_GOV_EAST_1,
            US_GOV_WEST_1,
            US_WEST_1,
            US_WEST_2,
        }

        /**
         * An enum containing [AwsRegion]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AwsRegion] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AF_SOUTH_1,
            AP_EAST_1,
            AP_NORTHEAST_1,
            AP_NORTHEAST_2,
            AP_NORTHEAST_3,
            AP_SOUTH_1,
            AP_SOUTHEAST_1,
            AP_SOUTHEAST_2,
            CA_CENTRAL_1,
            CN_NORTH_1,
            CN_NORTHWEST_1,
            EU_CENTRAL_1,
            EU_NORTH_1,
            EU_SOUTH_1,
            EU_WEST_1,
            EU_WEST_2,
            EU_WEST_3,
            ME_SOUTH_1,
            SA_EAST_1,
            US_EAST_1,
            US_EAST_2,
            US_GOV_EAST_1,
            US_GOV_WEST_1,
            US_WEST_1,
            US_WEST_2,
            /**
             * An enum member indicating that [AwsRegion] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                AF_SOUTH_1 -> Value.AF_SOUTH_1
                AP_EAST_1 -> Value.AP_EAST_1
                AP_NORTHEAST_1 -> Value.AP_NORTHEAST_1
                AP_NORTHEAST_2 -> Value.AP_NORTHEAST_2
                AP_NORTHEAST_3 -> Value.AP_NORTHEAST_3
                AP_SOUTH_1 -> Value.AP_SOUTH_1
                AP_SOUTHEAST_1 -> Value.AP_SOUTHEAST_1
                AP_SOUTHEAST_2 -> Value.AP_SOUTHEAST_2
                CA_CENTRAL_1 -> Value.CA_CENTRAL_1
                CN_NORTH_1 -> Value.CN_NORTH_1
                CN_NORTHWEST_1 -> Value.CN_NORTHWEST_1
                EU_CENTRAL_1 -> Value.EU_CENTRAL_1
                EU_NORTH_1 -> Value.EU_NORTH_1
                EU_SOUTH_1 -> Value.EU_SOUTH_1
                EU_WEST_1 -> Value.EU_WEST_1
                EU_WEST_2 -> Value.EU_WEST_2
                EU_WEST_3 -> Value.EU_WEST_3
                ME_SOUTH_1 -> Value.ME_SOUTH_1
                SA_EAST_1 -> Value.SA_EAST_1
                US_EAST_1 -> Value.US_EAST_1
                US_EAST_2 -> Value.US_EAST_2
                US_GOV_EAST_1 -> Value.US_GOV_EAST_1
                US_GOV_WEST_1 -> Value.US_GOV_WEST_1
                US_WEST_1 -> Value.US_WEST_1
                US_WEST_2 -> Value.US_WEST_2
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws MetronomeInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                AF_SOUTH_1 -> Known.AF_SOUTH_1
                AP_EAST_1 -> Known.AP_EAST_1
                AP_NORTHEAST_1 -> Known.AP_NORTHEAST_1
                AP_NORTHEAST_2 -> Known.AP_NORTHEAST_2
                AP_NORTHEAST_3 -> Known.AP_NORTHEAST_3
                AP_SOUTH_1 -> Known.AP_SOUTH_1
                AP_SOUTHEAST_1 -> Known.AP_SOUTHEAST_1
                AP_SOUTHEAST_2 -> Known.AP_SOUTHEAST_2
                CA_CENTRAL_1 -> Known.CA_CENTRAL_1
                CN_NORTH_1 -> Known.CN_NORTH_1
                CN_NORTHWEST_1 -> Known.CN_NORTHWEST_1
                EU_CENTRAL_1 -> Known.EU_CENTRAL_1
                EU_NORTH_1 -> Known.EU_NORTH_1
                EU_SOUTH_1 -> Known.EU_SOUTH_1
                EU_WEST_1 -> Known.EU_WEST_1
                EU_WEST_2 -> Known.EU_WEST_2
                EU_WEST_3 -> Known.EU_WEST_3
                ME_SOUTH_1 -> Known.ME_SOUTH_1
                SA_EAST_1 -> Known.SA_EAST_1
                US_EAST_1 -> Known.US_EAST_1
                US_EAST_2 -> Known.US_EAST_2
                US_GOV_EAST_1 -> Known.US_GOV_EAST_1
                US_GOV_WEST_1 -> Known.US_GOV_WEST_1
                US_WEST_1 -> Known.US_WEST_1
                US_WEST_2 -> Known.US_WEST_2
                else -> throw MetronomeInvalidDataException("Unknown AwsRegion: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws MetronomeInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
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
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): AwsRegion = apply {
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

            return other is AwsRegion && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * The collection method for the customer's invoices. NOTE: `auto_charge_payment_intent` and
     * `manually_charge_payment_intent` are in beta.
     */
    class StripeCollectionMethod
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val CHARGE_AUTOMATICALLY = of("charge_automatically")

            @JvmField val SEND_INVOICE = of("send_invoice")

            @JvmField val AUTO_CHARGE_PAYMENT_INTENT = of("auto_charge_payment_intent")

            @JvmField val MANUALLY_CHARGE_PAYMENT_INTENT = of("manually_charge_payment_intent")

            @JvmStatic fun of(value: String) = StripeCollectionMethod(JsonField.of(value))
        }

        /** An enum containing [StripeCollectionMethod]'s known values. */
        enum class Known {
            CHARGE_AUTOMATICALLY,
            SEND_INVOICE,
            AUTO_CHARGE_PAYMENT_INTENT,
            MANUALLY_CHARGE_PAYMENT_INTENT,
        }

        /**
         * An enum containing [StripeCollectionMethod]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [StripeCollectionMethod] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CHARGE_AUTOMATICALLY,
            SEND_INVOICE,
            AUTO_CHARGE_PAYMENT_INTENT,
            MANUALLY_CHARGE_PAYMENT_INTENT,
            /**
             * An enum member indicating that [StripeCollectionMethod] was instantiated with an
             * unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                CHARGE_AUTOMATICALLY -> Value.CHARGE_AUTOMATICALLY
                SEND_INVOICE -> Value.SEND_INVOICE
                AUTO_CHARGE_PAYMENT_INTENT -> Value.AUTO_CHARGE_PAYMENT_INTENT
                MANUALLY_CHARGE_PAYMENT_INTENT -> Value.MANUALLY_CHARGE_PAYMENT_INTENT
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws MetronomeInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                CHARGE_AUTOMATICALLY -> Known.CHARGE_AUTOMATICALLY
                SEND_INVOICE -> Known.SEND_INVOICE
                AUTO_CHARGE_PAYMENT_INTENT -> Known.AUTO_CHARGE_PAYMENT_INTENT
                MANUALLY_CHARGE_PAYMENT_INTENT -> Known.MANUALLY_CHARGE_PAYMENT_INTENT
                else ->
                    throw MetronomeInvalidDataException("Unknown StripeCollectionMethod: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws MetronomeInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
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
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): StripeCollectionMethod = apply {
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

            return other is StripeCollectionMethod && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class BillingProviderType
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val AWS_MARKETPLACE = of("aws_marketplace")

            @JvmField val STRIPE = of("stripe")

            @JvmField val NETSUITE = of("netsuite")

            @JvmField val CUSTOM = of("custom")

            @JvmField val AZURE_MARKETPLACE = of("azure_marketplace")

            @JvmField val QUICKBOOKS_ONLINE = of("quickbooks_online")

            @JvmField val WORKDAY = of("workday")

            @JvmField val GCP_MARKETPLACE = of("gcp_marketplace")

            @JvmField val METRONOME = of("metronome")

            @JvmStatic fun of(value: String) = BillingProviderType(JsonField.of(value))
        }

        /** An enum containing [BillingProviderType]'s known values. */
        enum class Known {
            AWS_MARKETPLACE,
            STRIPE,
            NETSUITE,
            CUSTOM,
            AZURE_MARKETPLACE,
            QUICKBOOKS_ONLINE,
            WORKDAY,
            GCP_MARKETPLACE,
            METRONOME,
        }

        /**
         * An enum containing [BillingProviderType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [BillingProviderType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AWS_MARKETPLACE,
            STRIPE,
            NETSUITE,
            CUSTOM,
            AZURE_MARKETPLACE,
            QUICKBOOKS_ONLINE,
            WORKDAY,
            GCP_MARKETPLACE,
            METRONOME,
            /**
             * An enum member indicating that [BillingProviderType] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                AWS_MARKETPLACE -> Value.AWS_MARKETPLACE
                STRIPE -> Value.STRIPE
                NETSUITE -> Value.NETSUITE
                CUSTOM -> Value.CUSTOM
                AZURE_MARKETPLACE -> Value.AZURE_MARKETPLACE
                QUICKBOOKS_ONLINE -> Value.QUICKBOOKS_ONLINE
                WORKDAY -> Value.WORKDAY
                GCP_MARKETPLACE -> Value.GCP_MARKETPLACE
                METRONOME -> Value.METRONOME
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws MetronomeInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                AWS_MARKETPLACE -> Known.AWS_MARKETPLACE
                STRIPE -> Known.STRIPE
                NETSUITE -> Known.NETSUITE
                CUSTOM -> Known.CUSTOM
                AZURE_MARKETPLACE -> Known.AZURE_MARKETPLACE
                QUICKBOOKS_ONLINE -> Known.QUICKBOOKS_ONLINE
                WORKDAY -> Known.WORKDAY
                GCP_MARKETPLACE -> Known.GCP_MARKETPLACE
                METRONOME -> Known.METRONOME
                else -> throw MetronomeInvalidDataException("Unknown BillingProviderType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws MetronomeInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
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
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): BillingProviderType = apply {
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

            return other is BillingProviderType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BillingConfigCreateParams &&
            customerId == other.customerId &&
            billingProviderType == other.billingProviderType &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            customerId,
            billingProviderType,
            body,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "BillingConfigCreateParams{customerId=$customerId, billingProviderType=$billingProviderType, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
