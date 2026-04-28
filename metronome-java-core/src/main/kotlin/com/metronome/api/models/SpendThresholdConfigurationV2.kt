// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.checkRequired
import com.metronome.api.errors.MetronomeInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class SpendThresholdConfigurationV2
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val commit: JsonField<BaseThresholdCommit>,
    private val isEnabled: JsonField<Boolean>,
    private val paymentGateConfig: JsonField<PaymentGateConfigV2>,
    private val thresholdAmount: JsonField<Double>,
    private val discountConfiguration: JsonField<DiscountConfiguration>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("commit")
        @ExcludeMissing
        commit: JsonField<BaseThresholdCommit> = JsonMissing.of(),
        @JsonProperty("is_enabled")
        @ExcludeMissing
        isEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("payment_gate_config")
        @ExcludeMissing
        paymentGateConfig: JsonField<PaymentGateConfigV2> = JsonMissing.of(),
        @JsonProperty("threshold_amount")
        @ExcludeMissing
        thresholdAmount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("discount_configuration")
        @ExcludeMissing
        discountConfiguration: JsonField<DiscountConfiguration> = JsonMissing.of(),
    ) : this(
        commit,
        isEnabled,
        paymentGateConfig,
        thresholdAmount,
        discountConfiguration,
        mutableMapOf(),
    )

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun commit(): BaseThresholdCommit = commit.getRequired("commit")

    /**
     * When set to false, the contract will not be evaluated against the threshold_amount. Toggling
     * to true will result an immediate evaluation, regardless of prior state.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isEnabled(): Boolean = isEnabled.getRequired("is_enabled")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun paymentGateConfig(): PaymentGateConfigV2 =
        paymentGateConfig.getRequired("payment_gate_config")

    /**
     * Specify the threshold amount for the contract. Each time the contract's usage hits this
     * amount, a threshold charge will be initiated.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun thresholdAmount(): Double = thresholdAmount.getRequired("threshold_amount")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun discountConfiguration(): Optional<DiscountConfiguration> =
        discountConfiguration.getOptional("discount_configuration")

    /**
     * Returns the raw JSON value of [commit].
     *
     * Unlike [commit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("commit") @ExcludeMissing fun _commit(): JsonField<BaseThresholdCommit> = commit

    /**
     * Returns the raw JSON value of [isEnabled].
     *
     * Unlike [isEnabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_enabled") @ExcludeMissing fun _isEnabled(): JsonField<Boolean> = isEnabled

    /**
     * Returns the raw JSON value of [paymentGateConfig].
     *
     * Unlike [paymentGateConfig], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("payment_gate_config")
    @ExcludeMissing
    fun _paymentGateConfig(): JsonField<PaymentGateConfigV2> = paymentGateConfig

    /**
     * Returns the raw JSON value of [thresholdAmount].
     *
     * Unlike [thresholdAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("threshold_amount")
    @ExcludeMissing
    fun _thresholdAmount(): JsonField<Double> = thresholdAmount

    /**
     * Returns the raw JSON value of [discountConfiguration].
     *
     * Unlike [discountConfiguration], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("discount_configuration")
    @ExcludeMissing
    fun _discountConfiguration(): JsonField<DiscountConfiguration> = discountConfiguration

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
         * Returns a mutable builder for constructing an instance of
         * [SpendThresholdConfigurationV2].
         *
         * The following fields are required:
         * ```java
         * .commit()
         * .isEnabled()
         * .paymentGateConfig()
         * .thresholdAmount()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SpendThresholdConfigurationV2]. */
    class Builder internal constructor() {

        private var commit: JsonField<BaseThresholdCommit>? = null
        private var isEnabled: JsonField<Boolean>? = null
        private var paymentGateConfig: JsonField<PaymentGateConfigV2>? = null
        private var thresholdAmount: JsonField<Double>? = null
        private var discountConfiguration: JsonField<DiscountConfiguration> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(spendThresholdConfigurationV2: SpendThresholdConfigurationV2) = apply {
            commit = spendThresholdConfigurationV2.commit
            isEnabled = spendThresholdConfigurationV2.isEnabled
            paymentGateConfig = spendThresholdConfigurationV2.paymentGateConfig
            thresholdAmount = spendThresholdConfigurationV2.thresholdAmount
            discountConfiguration = spendThresholdConfigurationV2.discountConfiguration
            additionalProperties = spendThresholdConfigurationV2.additionalProperties.toMutableMap()
        }

        fun commit(commit: BaseThresholdCommit) = commit(JsonField.of(commit))

        /**
         * Sets [Builder.commit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.commit] with a well-typed [BaseThresholdCommit] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun commit(commit: JsonField<BaseThresholdCommit>) = apply { this.commit = commit }

        /**
         * When set to false, the contract will not be evaluated against the threshold_amount.
         * Toggling to true will result an immediate evaluation, regardless of prior state.
         */
        fun isEnabled(isEnabled: Boolean) = isEnabled(JsonField.of(isEnabled))

        /**
         * Sets [Builder.isEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isEnabled] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isEnabled(isEnabled: JsonField<Boolean>) = apply { this.isEnabled = isEnabled }

        fun paymentGateConfig(paymentGateConfig: PaymentGateConfigV2) =
            paymentGateConfig(JsonField.of(paymentGateConfig))

        /**
         * Sets [Builder.paymentGateConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentGateConfig] with a well-typed
         * [PaymentGateConfigV2] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun paymentGateConfig(paymentGateConfig: JsonField<PaymentGateConfigV2>) = apply {
            this.paymentGateConfig = paymentGateConfig
        }

        /**
         * Specify the threshold amount for the contract. Each time the contract's usage hits this
         * amount, a threshold charge will be initiated.
         */
        fun thresholdAmount(thresholdAmount: Double) =
            thresholdAmount(JsonField.of(thresholdAmount))

        /**
         * Sets [Builder.thresholdAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.thresholdAmount] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun thresholdAmount(thresholdAmount: JsonField<Double>) = apply {
            this.thresholdAmount = thresholdAmount
        }

        fun discountConfiguration(discountConfiguration: DiscountConfiguration) =
            discountConfiguration(JsonField.of(discountConfiguration))

        /**
         * Sets [Builder.discountConfiguration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.discountConfiguration] with a well-typed
         * [DiscountConfiguration] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun discountConfiguration(discountConfiguration: JsonField<DiscountConfiguration>) = apply {
            this.discountConfiguration = discountConfiguration
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
         * Returns an immutable instance of [SpendThresholdConfigurationV2].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .commit()
         * .isEnabled()
         * .paymentGateConfig()
         * .thresholdAmount()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SpendThresholdConfigurationV2 =
            SpendThresholdConfigurationV2(
                checkRequired("commit", commit),
                checkRequired("isEnabled", isEnabled),
                checkRequired("paymentGateConfig", paymentGateConfig),
                checkRequired("thresholdAmount", thresholdAmount),
                discountConfiguration,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SpendThresholdConfigurationV2 = apply {
        if (validated) {
            return@apply
        }

        commit().validate()
        isEnabled()
        paymentGateConfig().validate()
        thresholdAmount()
        discountConfiguration().ifPresent { it.validate() }
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
        (commit.asKnown().getOrNull()?.validity() ?: 0) +
            (if (isEnabled.asKnown().isPresent) 1 else 0) +
            (paymentGateConfig.asKnown().getOrNull()?.validity() ?: 0) +
            (if (thresholdAmount.asKnown().isPresent) 1 else 0) +
            (discountConfiguration.asKnown().getOrNull()?.validity() ?: 0)

    class DiscountConfiguration
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val paymentFraction: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("payment_fraction")
            @ExcludeMissing
            paymentFraction: JsonField<Double> = JsonMissing.of()
        ) : this(paymentFraction, mutableMapOf())

        /**
         * The fraction of the original amount that the customer pays after applying the discount.
         * For example, 0.85 means the customer pays 85% of the original amount (a 15% discount).
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun paymentFraction(): Double = paymentFraction.getRequired("payment_fraction")

        /**
         * Returns the raw JSON value of [paymentFraction].
         *
         * Unlike [paymentFraction], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("payment_fraction")
        @ExcludeMissing
        fun _paymentFraction(): JsonField<Double> = paymentFraction

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
             * Returns a mutable builder for constructing an instance of [DiscountConfiguration].
             *
             * The following fields are required:
             * ```java
             * .paymentFraction()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DiscountConfiguration]. */
        class Builder internal constructor() {

            private var paymentFraction: JsonField<Double>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(discountConfiguration: DiscountConfiguration) = apply {
                paymentFraction = discountConfiguration.paymentFraction
                additionalProperties = discountConfiguration.additionalProperties.toMutableMap()
            }

            /**
             * The fraction of the original amount that the customer pays after applying the
             * discount. For example, 0.85 means the customer pays 85% of the original amount (a 15%
             * discount).
             */
            fun paymentFraction(paymentFraction: Double) =
                paymentFraction(JsonField.of(paymentFraction))

            /**
             * Sets [Builder.paymentFraction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentFraction] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun paymentFraction(paymentFraction: JsonField<Double>) = apply {
                this.paymentFraction = paymentFraction
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
             * Returns an immutable instance of [DiscountConfiguration].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .paymentFraction()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): DiscountConfiguration =
                DiscountConfiguration(
                    checkRequired("paymentFraction", paymentFraction),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): DiscountConfiguration = apply {
            if (validated) {
                return@apply
            }

            paymentFraction()
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
        internal fun validity(): Int = (if (paymentFraction.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DiscountConfiguration &&
                paymentFraction == other.paymentFraction &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(paymentFraction, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DiscountConfiguration{paymentFraction=$paymentFraction, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SpendThresholdConfigurationV2 &&
            commit == other.commit &&
            isEnabled == other.isEnabled &&
            paymentGateConfig == other.paymentGateConfig &&
            thresholdAmount == other.thresholdAmount &&
            discountConfiguration == other.discountConfiguration &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            commit,
            isEnabled,
            paymentGateConfig,
            thresholdAmount,
            discountConfiguration,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SpendThresholdConfigurationV2{commit=$commit, isEnabled=$isEnabled, paymentGateConfig=$paymentGateConfig, thresholdAmount=$thresholdAmount, discountConfiguration=$discountConfiguration, additionalProperties=$additionalProperties}"
}
