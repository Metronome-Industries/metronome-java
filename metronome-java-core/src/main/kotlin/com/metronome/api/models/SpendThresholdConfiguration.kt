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
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.checkRequired
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import java.util.Objects

@NoAutoDetect
class SpendThresholdConfiguration
@JsonCreator
private constructor(
    @JsonProperty("commit")
    @ExcludeMissing
    private val commit: JsonField<BaseThresholdCommit> = JsonMissing.of(),
    @JsonProperty("is_enabled")
    @ExcludeMissing
    private val isEnabled: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("payment_gate_config")
    @ExcludeMissing
    private val paymentGateConfig: JsonField<PaymentGateConfig> = JsonMissing.of(),
    @JsonProperty("threshold_amount")
    @ExcludeMissing
    private val thresholdAmount: JsonField<Double> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun commit(): BaseThresholdCommit = commit.getRequired("commit")

    /**
     * When set to false, the contract will not be evaluated against the threshold_amount. Toggling
     * to true will result an immediate evaluation, regardless of prior state.
     */
    fun isEnabled(): Boolean = isEnabled.getRequired("is_enabled")

    fun paymentGateConfig(): PaymentGateConfig =
        paymentGateConfig.getRequired("payment_gate_config")

    /**
     * Specify the threshold amount for the contract. Each time the contract's usage hits this
     * amount, a threshold charge will be initiated.
     */
    fun thresholdAmount(): Double = thresholdAmount.getRequired("threshold_amount")

    @JsonProperty("commit") @ExcludeMissing fun _commit(): JsonField<BaseThresholdCommit> = commit

    /**
     * When set to false, the contract will not be evaluated against the threshold_amount. Toggling
     * to true will result an immediate evaluation, regardless of prior state.
     */
    @JsonProperty("is_enabled") @ExcludeMissing fun _isEnabled(): JsonField<Boolean> = isEnabled

    @JsonProperty("payment_gate_config")
    @ExcludeMissing
    fun _paymentGateConfig(): JsonField<PaymentGateConfig> = paymentGateConfig

    /**
     * Specify the threshold amount for the contract. Each time the contract's usage hits this
     * amount, a threshold charge will be initiated.
     */
    @JsonProperty("threshold_amount")
    @ExcludeMissing
    fun _thresholdAmount(): JsonField<Double> = thresholdAmount

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): SpendThresholdConfiguration = apply {
        if (validated) {
            return@apply
        }

        commit().validate()
        isEnabled()
        paymentGateConfig().validate()
        thresholdAmount()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SpendThresholdConfiguration]. */
    class Builder internal constructor() {

        private var commit: JsonField<BaseThresholdCommit>? = null
        private var isEnabled: JsonField<Boolean>? = null
        private var paymentGateConfig: JsonField<PaymentGateConfig>? = null
        private var thresholdAmount: JsonField<Double>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(spendThresholdConfiguration: SpendThresholdConfiguration) = apply {
            commit = spendThresholdConfiguration.commit
            isEnabled = spendThresholdConfiguration.isEnabled
            paymentGateConfig = spendThresholdConfiguration.paymentGateConfig
            thresholdAmount = spendThresholdConfiguration.thresholdAmount
            additionalProperties = spendThresholdConfiguration.additionalProperties.toMutableMap()
        }

        fun commit(commit: BaseThresholdCommit) = commit(JsonField.of(commit))

        fun commit(commit: JsonField<BaseThresholdCommit>) = apply { this.commit = commit }

        /**
         * When set to false, the contract will not be evaluated against the threshold_amount.
         * Toggling to true will result an immediate evaluation, regardless of prior state.
         */
        fun isEnabled(isEnabled: Boolean) = isEnabled(JsonField.of(isEnabled))

        /**
         * When set to false, the contract will not be evaluated against the threshold_amount.
         * Toggling to true will result an immediate evaluation, regardless of prior state.
         */
        fun isEnabled(isEnabled: JsonField<Boolean>) = apply { this.isEnabled = isEnabled }

        fun paymentGateConfig(paymentGateConfig: PaymentGateConfig) =
            paymentGateConfig(JsonField.of(paymentGateConfig))

        fun paymentGateConfig(paymentGateConfig: JsonField<PaymentGateConfig>) = apply {
            this.paymentGateConfig = paymentGateConfig
        }

        /**
         * Specify the threshold amount for the contract. Each time the contract's usage hits this
         * amount, a threshold charge will be initiated.
         */
        fun thresholdAmount(thresholdAmount: Double) =
            thresholdAmount(JsonField.of(thresholdAmount))

        /**
         * Specify the threshold amount for the contract. Each time the contract's usage hits this
         * amount, a threshold charge will be initiated.
         */
        fun thresholdAmount(thresholdAmount: JsonField<Double>) = apply {
            this.thresholdAmount = thresholdAmount
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

        fun build(): SpendThresholdConfiguration =
            SpendThresholdConfiguration(
                checkRequired("commit", commit),
                checkRequired("isEnabled", isEnabled),
                checkRequired("paymentGateConfig", paymentGateConfig),
                checkRequired("thresholdAmount", thresholdAmount),
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SpendThresholdConfiguration && commit == other.commit && isEnabled == other.isEnabled && paymentGateConfig == other.paymentGateConfig && thresholdAmount == other.thresholdAmount && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(commit, isEnabled, paymentGateConfig, thresholdAmount, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SpendThresholdConfiguration{commit=$commit, isEnabled=$isEnabled, paymentGateConfig=$paymentGateConfig, thresholdAmount=$thresholdAmount, additionalProperties=$additionalProperties}"
}
