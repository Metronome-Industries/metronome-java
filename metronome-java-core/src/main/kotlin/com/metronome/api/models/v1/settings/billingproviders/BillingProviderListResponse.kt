// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.settings.billingproviders

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.metronome.api.core.Enum
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.checkKnown
import com.metronome.api.core.checkRequired
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class BillingProviderListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<List<Data>>,
    private val nextPage: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<List<Data>> = JsonMissing.of(),
        @JsonProperty("next_page") @ExcludeMissing nextPage: JsonField<String> = JsonMissing.of(),
    ) : this(data, nextPage, mutableMapOf())

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): List<Data> = data.getRequired("data")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun nextPage(): Optional<String> = nextPage.getOptional("next_page")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Data>> = data

    /**
     * Returns the raw JSON value of [nextPage].
     *
     * Unlike [nextPage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("next_page") @ExcludeMissing fun _nextPage(): JsonField<String> = nextPage

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
         * Returns a mutable builder for constructing an instance of [BillingProviderListResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BillingProviderListResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var nextPage: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(billingProviderListResponse: BillingProviderListResponse) = apply {
            data = billingProviderListResponse.data.map { it.toMutableList() }
            nextPage = billingProviderListResponse.nextPage
            additionalProperties = billingProviderListResponse.additionalProperties.toMutableMap()
        }

        fun data(data: List<Data>) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed `List<Data>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<List<Data>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        /**
         * Adds a single [Data] to [Builder.data].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addData(data: Data) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).also {
                    checkKnown("data", it).add(data)
                }
        }

        fun nextPage(nextPage: String?) = nextPage(JsonField.ofNullable(nextPage))

        /** Alias for calling [Builder.nextPage] with `nextPage.orElse(null)`. */
        fun nextPage(nextPage: Optional<String>) = nextPage(nextPage.getOrNull())

        /**
         * Sets [Builder.nextPage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nextPage] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun nextPage(nextPage: JsonField<String>) = apply { this.nextPage = nextPage }

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
         * Returns an immutable instance of [BillingProviderListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BillingProviderListResponse =
            BillingProviderListResponse(
                checkRequired("data", data).map { it.toImmutable() },
                nextPage,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BillingProviderListResponse = apply {
        if (validated) {
            return@apply
        }

        data().forEach { it.validate() }
        nextPage()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (data.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (nextPage.asKnown().isPresent) 1 else 0)

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val billingProvider: JsonField<BillingProvider>,
        private val deliveryMethod: JsonField<DeliveryMethod>,
        private val deliveryMethodConfiguration: JsonField<DeliveryMethodConfiguration>,
        private val deliveryMethodId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("billing_provider")
            @ExcludeMissing
            billingProvider: JsonField<BillingProvider> = JsonMissing.of(),
            @JsonProperty("delivery_method")
            @ExcludeMissing
            deliveryMethod: JsonField<DeliveryMethod> = JsonMissing.of(),
            @JsonProperty("delivery_method_configuration")
            @ExcludeMissing
            deliveryMethodConfiguration: JsonField<DeliveryMethodConfiguration> = JsonMissing.of(),
            @JsonProperty("delivery_method_id")
            @ExcludeMissing
            deliveryMethodId: JsonField<String> = JsonMissing.of(),
        ) : this(
            billingProvider,
            deliveryMethod,
            deliveryMethodConfiguration,
            deliveryMethodId,
            mutableMapOf(),
        )

        /**
         * The billing provider set for this configuration.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun billingProvider(): BillingProvider = billingProvider.getRequired("billing_provider")

        /**
         * The method to use for delivering invoices to this customer.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun deliveryMethod(): DeliveryMethod = deliveryMethod.getRequired("delivery_method")

        /**
         * Configuration for the delivery method. The structure of this object is specific to the
         * delivery method. Some configuration may be omitted for security reasons.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun deliveryMethodConfiguration(): DeliveryMethodConfiguration =
            deliveryMethodConfiguration.getRequired("delivery_method_configuration")

        /**
         * ID of the delivery method to use for this customer.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun deliveryMethodId(): String = deliveryMethodId.getRequired("delivery_method_id")

        /**
         * Returns the raw JSON value of [billingProvider].
         *
         * Unlike [billingProvider], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("billing_provider")
        @ExcludeMissing
        fun _billingProvider(): JsonField<BillingProvider> = billingProvider

        /**
         * Returns the raw JSON value of [deliveryMethod].
         *
         * Unlike [deliveryMethod], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("delivery_method")
        @ExcludeMissing
        fun _deliveryMethod(): JsonField<DeliveryMethod> = deliveryMethod

        /**
         * Returns the raw JSON value of [deliveryMethodConfiguration].
         *
         * Unlike [deliveryMethodConfiguration], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("delivery_method_configuration")
        @ExcludeMissing
        fun _deliveryMethodConfiguration(): JsonField<DeliveryMethodConfiguration> =
            deliveryMethodConfiguration

        /**
         * Returns the raw JSON value of [deliveryMethodId].
         *
         * Unlike [deliveryMethodId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("delivery_method_id")
        @ExcludeMissing
        fun _deliveryMethodId(): JsonField<String> = deliveryMethodId

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
             * Returns a mutable builder for constructing an instance of [Data].
             *
             * The following fields are required:
             * ```java
             * .billingProvider()
             * .deliveryMethod()
             * .deliveryMethodConfiguration()
             * .deliveryMethodId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var billingProvider: JsonField<BillingProvider>? = null
            private var deliveryMethod: JsonField<DeliveryMethod>? = null
            private var deliveryMethodConfiguration: JsonField<DeliveryMethodConfiguration>? = null
            private var deliveryMethodId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                billingProvider = data.billingProvider
                deliveryMethod = data.deliveryMethod
                deliveryMethodConfiguration = data.deliveryMethodConfiguration
                deliveryMethodId = data.deliveryMethodId
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** The billing provider set for this configuration. */
            fun billingProvider(billingProvider: BillingProvider) =
                billingProvider(JsonField.of(billingProvider))

            /**
             * Sets [Builder.billingProvider] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billingProvider] with a well-typed [BillingProvider]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun billingProvider(billingProvider: JsonField<BillingProvider>) = apply {
                this.billingProvider = billingProvider
            }

            /** The method to use for delivering invoices to this customer. */
            fun deliveryMethod(deliveryMethod: DeliveryMethod) =
                deliveryMethod(JsonField.of(deliveryMethod))

            /**
             * Sets [Builder.deliveryMethod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deliveryMethod] with a well-typed [DeliveryMethod]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun deliveryMethod(deliveryMethod: JsonField<DeliveryMethod>) = apply {
                this.deliveryMethod = deliveryMethod
            }

            /**
             * Configuration for the delivery method. The structure of this object is specific to
             * the delivery method. Some configuration may be omitted for security reasons.
             */
            fun deliveryMethodConfiguration(
                deliveryMethodConfiguration: DeliveryMethodConfiguration
            ) = deliveryMethodConfiguration(JsonField.of(deliveryMethodConfiguration))

            /**
             * Sets [Builder.deliveryMethodConfiguration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deliveryMethodConfiguration] with a well-typed
             * [DeliveryMethodConfiguration] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun deliveryMethodConfiguration(
                deliveryMethodConfiguration: JsonField<DeliveryMethodConfiguration>
            ) = apply { this.deliveryMethodConfiguration = deliveryMethodConfiguration }

            /** ID of the delivery method to use for this customer. */
            fun deliveryMethodId(deliveryMethodId: String) =
                deliveryMethodId(JsonField.of(deliveryMethodId))

            /**
             * Sets [Builder.deliveryMethodId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deliveryMethodId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun deliveryMethodId(deliveryMethodId: JsonField<String>) = apply {
                this.deliveryMethodId = deliveryMethodId
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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .billingProvider()
             * .deliveryMethod()
             * .deliveryMethodConfiguration()
             * .deliveryMethodId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("billingProvider", billingProvider),
                    checkRequired("deliveryMethod", deliveryMethod),
                    checkRequired("deliveryMethodConfiguration", deliveryMethodConfiguration),
                    checkRequired("deliveryMethodId", deliveryMethodId),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            billingProvider().validate()
            deliveryMethod().validate()
            deliveryMethodConfiguration().validate()
            deliveryMethodId()
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
            (billingProvider.asKnown().getOrNull()?.validity() ?: 0) +
                (deliveryMethod.asKnown().getOrNull()?.validity() ?: 0) +
                (deliveryMethodConfiguration.asKnown().getOrNull()?.validity() ?: 0) +
                (if (deliveryMethodId.asKnown().isPresent) 1 else 0)

        /** The billing provider set for this configuration. */
        class BillingProvider
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

                @JvmField val AWS_MARKETPLACE = of("aws_marketplace")

                @JvmField val STRIPE = of("stripe")

                @JvmField val NETSUITE = of("netsuite")

                @JvmField val CUSTOM = of("custom")

                @JvmField val AZURE_MARKETPLACE = of("azure_marketplace")

                @JvmField val QUICKBOOKS_ONLINE = of("quickbooks_online")

                @JvmField val WORKDAY = of("workday")

                @JvmField val GCP_MARKETPLACE = of("gcp_marketplace")

                @JvmField val METRONOME = of("metronome")

                @JvmStatic fun of(value: String) = BillingProvider(JsonField.of(value))
            }

            /** An enum containing [BillingProvider]'s known values. */
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
             * An enum containing [BillingProvider]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [BillingProvider] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
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
                 * An enum member indicating that [BillingProvider] was instantiated with an unknown
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
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
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
                    else -> throw MetronomeInvalidDataException("Unknown BillingProvider: $value")
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

            fun validate(): BillingProvider = apply {
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

                return other is BillingProvider && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The method to use for delivering invoices to this customer. */
        class DeliveryMethod
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

                @JvmField val DIRECT_TO_BILLING_PROVIDER = of("direct_to_billing_provider")

                @JvmField val AWS_SQS = of("aws_sqs")

                @JvmField val TACKLE = of("tackle")

                @JvmField val AWS_SNS = of("aws_sns")

                @JvmStatic fun of(value: String) = DeliveryMethod(JsonField.of(value))
            }

            /** An enum containing [DeliveryMethod]'s known values. */
            enum class Known {
                DIRECT_TO_BILLING_PROVIDER,
                AWS_SQS,
                TACKLE,
                AWS_SNS,
            }

            /**
             * An enum containing [DeliveryMethod]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [DeliveryMethod] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DIRECT_TO_BILLING_PROVIDER,
                AWS_SQS,
                TACKLE,
                AWS_SNS,
                /**
                 * An enum member indicating that [DeliveryMethod] was instantiated with an unknown
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
                    DIRECT_TO_BILLING_PROVIDER -> Value.DIRECT_TO_BILLING_PROVIDER
                    AWS_SQS -> Value.AWS_SQS
                    TACKLE -> Value.TACKLE
                    AWS_SNS -> Value.AWS_SNS
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
                    DIRECT_TO_BILLING_PROVIDER -> Known.DIRECT_TO_BILLING_PROVIDER
                    AWS_SQS -> Known.AWS_SQS
                    TACKLE -> Known.TACKLE
                    AWS_SNS -> Known.AWS_SNS
                    else -> throw MetronomeInvalidDataException("Unknown DeliveryMethod: $value")
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

            fun validate(): DeliveryMethod = apply {
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

                return other is DeliveryMethod && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * Configuration for the delivery method. The structure of this object is specific to the
         * delivery method. Some configuration may be omitted for security reasons.
         */
        class DeliveryMethodConfiguration
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [DeliveryMethodConfiguration].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [DeliveryMethodConfiguration]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(deliveryMethodConfiguration: DeliveryMethodConfiguration) =
                    apply {
                        additionalProperties =
                            deliveryMethodConfiguration.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [DeliveryMethodConfiguration].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): DeliveryMethodConfiguration =
                    DeliveryMethodConfiguration(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): DeliveryMethodConfiguration = apply {
                if (validated) {
                    return@apply
                }

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
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is DeliveryMethodConfiguration &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "DeliveryMethodConfiguration{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                billingProvider == other.billingProvider &&
                deliveryMethod == other.deliveryMethod &&
                deliveryMethodConfiguration == other.deliveryMethodConfiguration &&
                deliveryMethodId == other.deliveryMethodId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                billingProvider,
                deliveryMethod,
                deliveryMethodConfiguration,
                deliveryMethodId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{billingProvider=$billingProvider, deliveryMethod=$deliveryMethod, deliveryMethodConfiguration=$deliveryMethodConfiguration, deliveryMethodId=$deliveryMethodId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BillingProviderListResponse &&
            data == other.data &&
            nextPage == other.nextPage &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, nextPage, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BillingProviderListResponse{data=$data, nextPage=$nextPage, additionalProperties=$additionalProperties}"
}
