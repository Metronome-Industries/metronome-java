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
import java.util.Optional

@NoAutoDetect
class PrepaidBalanceThresholdConfigurationV2
@JsonCreator
private constructor(
    @JsonProperty("commit")
    @ExcludeMissing
    private val commit: JsonField<Commit> = JsonMissing.of(),
    @JsonProperty("is_enabled")
    @ExcludeMissing
    private val isEnabled: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("payment_gate_config")
    @ExcludeMissing
    private val paymentGateConfig: JsonField<PaymentGateConfigV2> = JsonMissing.of(),
    @JsonProperty("recharge_to_amount")
    @ExcludeMissing
    private val rechargeToAmount: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("threshold_amount")
    @ExcludeMissing
    private val thresholdAmount: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("custom_credit_type_id")
    @ExcludeMissing
    private val customCreditTypeId: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun commit(): Commit = commit.getRequired("commit")

    /**
     * When set to false, the contract will not be evaluated against the threshold_amount. Toggling
     * to true will result an immediate evaluation, regardless of prior state.
     */
    fun isEnabled(): Boolean = isEnabled.getRequired("is_enabled")

    fun paymentGateConfig(): PaymentGateConfigV2 =
        paymentGateConfig.getRequired("payment_gate_config")

    /** Specify the amount the balance should be recharged to. */
    fun rechargeToAmount(): Double = rechargeToAmount.getRequired("recharge_to_amount")

    /**
     * Specify the threshold amount for the contract. Each time the contract's balance lowers to
     * this amount, a threshold charge will be initiated.
     */
    fun thresholdAmount(): Double = thresholdAmount.getRequired("threshold_amount")

    /**
     * If provided, the threshold, recharge-to amount, and the resulting threshold commit amount
     * will be in terms of this credit type instead of the fiat currency.
     */
    fun customCreditTypeId(): Optional<String> =
        Optional.ofNullable(customCreditTypeId.getNullable("custom_credit_type_id"))

    @JsonProperty("commit") @ExcludeMissing fun _commit(): JsonField<Commit> = commit

    /**
     * When set to false, the contract will not be evaluated against the threshold_amount. Toggling
     * to true will result an immediate evaluation, regardless of prior state.
     */
    @JsonProperty("is_enabled") @ExcludeMissing fun _isEnabled(): JsonField<Boolean> = isEnabled

    @JsonProperty("payment_gate_config")
    @ExcludeMissing
    fun _paymentGateConfig(): JsonField<PaymentGateConfigV2> = paymentGateConfig

    /** Specify the amount the balance should be recharged to. */
    @JsonProperty("recharge_to_amount")
    @ExcludeMissing
    fun _rechargeToAmount(): JsonField<Double> = rechargeToAmount

    /**
     * Specify the threshold amount for the contract. Each time the contract's balance lowers to
     * this amount, a threshold charge will be initiated.
     */
    @JsonProperty("threshold_amount")
    @ExcludeMissing
    fun _thresholdAmount(): JsonField<Double> = thresholdAmount

    /**
     * If provided, the threshold, recharge-to amount, and the resulting threshold commit amount
     * will be in terms of this credit type instead of the fiat currency.
     */
    @JsonProperty("custom_credit_type_id")
    @ExcludeMissing
    fun _customCreditTypeId(): JsonField<String> = customCreditTypeId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): PrepaidBalanceThresholdConfigurationV2 = apply {
        if (validated) {
            return@apply
        }

        commit().validate()
        isEnabled()
        paymentGateConfig().validate()
        rechargeToAmount()
        thresholdAmount()
        customCreditTypeId()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PrepaidBalanceThresholdConfigurationV2]. */
    class Builder internal constructor() {

        private var commit: JsonField<Commit>? = null
        private var isEnabled: JsonField<Boolean>? = null
        private var paymentGateConfig: JsonField<PaymentGateConfigV2>? = null
        private var rechargeToAmount: JsonField<Double>? = null
        private var thresholdAmount: JsonField<Double>? = null
        private var customCreditTypeId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            prepaidBalanceThresholdConfigurationV2: PrepaidBalanceThresholdConfigurationV2
        ) = apply {
            commit = prepaidBalanceThresholdConfigurationV2.commit
            isEnabled = prepaidBalanceThresholdConfigurationV2.isEnabled
            paymentGateConfig = prepaidBalanceThresholdConfigurationV2.paymentGateConfig
            rechargeToAmount = prepaidBalanceThresholdConfigurationV2.rechargeToAmount
            thresholdAmount = prepaidBalanceThresholdConfigurationV2.thresholdAmount
            customCreditTypeId = prepaidBalanceThresholdConfigurationV2.customCreditTypeId
            additionalProperties =
                prepaidBalanceThresholdConfigurationV2.additionalProperties.toMutableMap()
        }

        fun commit(commit: Commit) = commit(JsonField.of(commit))

        fun commit(commit: JsonField<Commit>) = apply { this.commit = commit }

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

        fun paymentGateConfig(paymentGateConfig: PaymentGateConfigV2) =
            paymentGateConfig(JsonField.of(paymentGateConfig))

        fun paymentGateConfig(paymentGateConfig: JsonField<PaymentGateConfigV2>) = apply {
            this.paymentGateConfig = paymentGateConfig
        }

        /** Specify the amount the balance should be recharged to. */
        fun rechargeToAmount(rechargeToAmount: Double) =
            rechargeToAmount(JsonField.of(rechargeToAmount))

        /** Specify the amount the balance should be recharged to. */
        fun rechargeToAmount(rechargeToAmount: JsonField<Double>) = apply {
            this.rechargeToAmount = rechargeToAmount
        }

        /**
         * Specify the threshold amount for the contract. Each time the contract's balance lowers to
         * this amount, a threshold charge will be initiated.
         */
        fun thresholdAmount(thresholdAmount: Double) =
            thresholdAmount(JsonField.of(thresholdAmount))

        /**
         * Specify the threshold amount for the contract. Each time the contract's balance lowers to
         * this amount, a threshold charge will be initiated.
         */
        fun thresholdAmount(thresholdAmount: JsonField<Double>) = apply {
            this.thresholdAmount = thresholdAmount
        }

        /**
         * If provided, the threshold, recharge-to amount, and the resulting threshold commit amount
         * will be in terms of this credit type instead of the fiat currency.
         */
        fun customCreditTypeId(customCreditTypeId: String) =
            customCreditTypeId(JsonField.of(customCreditTypeId))

        /**
         * If provided, the threshold, recharge-to amount, and the resulting threshold commit amount
         * will be in terms of this credit type instead of the fiat currency.
         */
        fun customCreditTypeId(customCreditTypeId: JsonField<String>) = apply {
            this.customCreditTypeId = customCreditTypeId
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

        fun build(): PrepaidBalanceThresholdConfigurationV2 =
            PrepaidBalanceThresholdConfigurationV2(
                checkRequired("commit", commit),
                checkRequired("isEnabled", isEnabled),
                checkRequired("paymentGateConfig", paymentGateConfig),
                checkRequired("rechargeToAmount", rechargeToAmount),
                checkRequired("thresholdAmount", thresholdAmount),
                customCreditTypeId,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Commit
    @JsonCreator
    private constructor(
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("product_id")
        @ExcludeMissing
        private val productId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("applicable_product_ids")
        @ExcludeMissing
        private val applicableProductIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("applicable_product_tags")
        @ExcludeMissing
        private val applicableProductTags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("specifiers")
        @ExcludeMissing
        private val specifiers: JsonField<List<CommitSpecifierInput>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun description(): Optional<String> =
            Optional.ofNullable(description.getNullable("description"))

        /**
         * Specify the name of the line item for the threshold charge. If left blank, it will
         * default to the commit product name.
         */
        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        /** The commit product that will be used to generate the line item for commit payment. */
        fun productId(): Optional<String> = Optional.ofNullable(productId.getNullable("product_id"))

        /**
         * Which products the threshold commit applies to. If applicable_product_ids,
         * applicable_product_tags or specifiers are not provided, the commit applies to all
         * products.
         */
        fun applicableProductIds(): Optional<List<String>> =
            Optional.ofNullable(applicableProductIds.getNullable("applicable_product_ids"))

        /**
         * Which tags the threshold commit applies to. If applicable_product_ids,
         * applicable_product_tags or specifiers are not provided, the commit applies to all
         * products.
         */
        fun applicableProductTags(): Optional<List<String>> =
            Optional.ofNullable(applicableProductTags.getNullable("applicable_product_tags"))

        /**
         * List of filters that determine what kind of customer usage draws down a commit or credit.
         * A customer's usage needs to meet the condition of at least one of the specifiers to
         * contribute to a commit's or credit's drawdown. This field cannot be used together with
         * `applicable_product_ids` or `applicable_product_tags`. Instead, to target usage by
         * product or product tag, pass those values in the body of `specifiers`.
         */
        fun specifiers(): Optional<List<CommitSpecifierInput>> =
            Optional.ofNullable(specifiers.getNullable("specifiers"))

        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Specify the name of the line item for the threshold charge. If left blank, it will
         * default to the commit product name.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /** The commit product that will be used to generate the line item for commit payment. */
        @JsonProperty("product_id") @ExcludeMissing fun _productId(): JsonField<String> = productId

        /**
         * Which products the threshold commit applies to. If applicable_product_ids,
         * applicable_product_tags or specifiers are not provided, the commit applies to all
         * products.
         */
        @JsonProperty("applicable_product_ids")
        @ExcludeMissing
        fun _applicableProductIds(): JsonField<List<String>> = applicableProductIds

        /**
         * Which tags the threshold commit applies to. If applicable_product_ids,
         * applicable_product_tags or specifiers are not provided, the commit applies to all
         * products.
         */
        @JsonProperty("applicable_product_tags")
        @ExcludeMissing
        fun _applicableProductTags(): JsonField<List<String>> = applicableProductTags

        /**
         * List of filters that determine what kind of customer usage draws down a commit or credit.
         * A customer's usage needs to meet the condition of at least one of the specifiers to
         * contribute to a commit's or credit's drawdown. This field cannot be used together with
         * `applicable_product_ids` or `applicable_product_tags`. Instead, to target usage by
         * product or product tag, pass those values in the body of `specifiers`.
         */
        @JsonProperty("specifiers")
        @ExcludeMissing
        fun _specifiers(): JsonField<List<CommitSpecifierInput>> = specifiers

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toUpdateBaseThresholdCommit(): UpdateBaseThresholdCommit =
            UpdateBaseThresholdCommit.builder()
                .description(description)
                .name(name)
                .productId(productId)
                .build()

        private var validated: Boolean = false

        fun validate(): Commit = apply {
            if (validated) {
                return@apply
            }

            description()
            name()
            productId()
            applicableProductIds()
            applicableProductTags()
            specifiers().ifPresent { it.forEach { it.validate() } }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Commit]. */
        class Builder internal constructor() {

            private var description: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var productId: JsonField<String> = JsonMissing.of()
            private var applicableProductIds: JsonField<MutableList<String>>? = null
            private var applicableProductTags: JsonField<MutableList<String>>? = null
            private var specifiers: JsonField<MutableList<CommitSpecifierInput>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(commit: Commit) = apply {
                description = commit.description
                name = commit.name
                productId = commit.productId
                applicableProductIds = commit.applicableProductIds.map { it.toMutableList() }
                applicableProductTags = commit.applicableProductTags.map { it.toMutableList() }
                specifiers = commit.specifiers.map { it.toMutableList() }
                additionalProperties = commit.additionalProperties.toMutableMap()
            }

            fun description(description: String) = description(JsonField.of(description))

            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /**
             * Specify the name of the line item for the threshold charge. If left blank, it will
             * default to the commit product name.
             */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Specify the name of the line item for the threshold charge. If left blank, it will
             * default to the commit product name.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * The commit product that will be used to generate the line item for commit payment.
             */
            fun productId(productId: String) = productId(JsonField.of(productId))

            /**
             * The commit product that will be used to generate the line item for commit payment.
             */
            fun productId(productId: JsonField<String>) = apply { this.productId = productId }

            /**
             * Which products the threshold commit applies to. If applicable_product_ids,
             * applicable_product_tags or specifiers are not provided, the commit applies to all
             * products.
             */
            fun applicableProductIds(applicableProductIds: List<String>) =
                applicableProductIds(JsonField.of(applicableProductIds))

            /**
             * Which products the threshold commit applies to. If applicable_product_ids,
             * applicable_product_tags or specifiers are not provided, the commit applies to all
             * products.
             */
            fun applicableProductIds(applicableProductIds: JsonField<List<String>>) = apply {
                this.applicableProductIds = applicableProductIds.map { it.toMutableList() }
            }

            /**
             * Which products the threshold commit applies to. If applicable_product_ids,
             * applicable_product_tags or specifiers are not provided, the commit applies to all
             * products.
             */
            fun addApplicableProductId(applicableProductId: String) = apply {
                applicableProductIds =
                    (applicableProductIds ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(applicableProductId)
                    }
            }

            /**
             * Which tags the threshold commit applies to. If applicable_product_ids,
             * applicable_product_tags or specifiers are not provided, the commit applies to all
             * products.
             */
            fun applicableProductTags(applicableProductTags: List<String>) =
                applicableProductTags(JsonField.of(applicableProductTags))

            /**
             * Which tags the threshold commit applies to. If applicable_product_ids,
             * applicable_product_tags or specifiers are not provided, the commit applies to all
             * products.
             */
            fun applicableProductTags(applicableProductTags: JsonField<List<String>>) = apply {
                this.applicableProductTags = applicableProductTags.map { it.toMutableList() }
            }

            /**
             * Which tags the threshold commit applies to. If applicable_product_ids,
             * applicable_product_tags or specifiers are not provided, the commit applies to all
             * products.
             */
            fun addApplicableProductTag(applicableProductTag: String) = apply {
                applicableProductTags =
                    (applicableProductTags ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(applicableProductTag)
                    }
            }

            /**
             * List of filters that determine what kind of customer usage draws down a commit or
             * credit. A customer's usage needs to meet the condition of at least one of the
             * specifiers to contribute to a commit's or credit's drawdown. This field cannot be
             * used together with `applicable_product_ids` or `applicable_product_tags`. Instead, to
             * target usage by product or product tag, pass those values in the body of
             * `specifiers`.
             */
            fun specifiers(specifiers: List<CommitSpecifierInput>) =
                specifiers(JsonField.of(specifiers))

            /**
             * List of filters that determine what kind of customer usage draws down a commit or
             * credit. A customer's usage needs to meet the condition of at least one of the
             * specifiers to contribute to a commit's or credit's drawdown. This field cannot be
             * used together with `applicable_product_ids` or `applicable_product_tags`. Instead, to
             * target usage by product or product tag, pass those values in the body of
             * `specifiers`.
             */
            fun specifiers(specifiers: JsonField<List<CommitSpecifierInput>>) = apply {
                this.specifiers = specifiers.map { it.toMutableList() }
            }

            /**
             * List of filters that determine what kind of customer usage draws down a commit or
             * credit. A customer's usage needs to meet the condition of at least one of the
             * specifiers to contribute to a commit's or credit's drawdown. This field cannot be
             * used together with `applicable_product_ids` or `applicable_product_tags`. Instead, to
             * target usage by product or product tag, pass those values in the body of
             * `specifiers`.
             */
            fun addSpecifier(specifier: CommitSpecifierInput) = apply {
                specifiers =
                    (specifiers ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(specifier)
                    }
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

            fun build(): Commit =
                Commit(
                    description,
                    name,
                    productId,
                    (applicableProductIds ?: JsonMissing.of()).map { it.toImmutable() },
                    (applicableProductTags ?: JsonMissing.of()).map { it.toImmutable() },
                    (specifiers ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Commit && description == other.description && name == other.name && productId == other.productId && applicableProductIds == other.applicableProductIds && applicableProductTags == other.applicableProductTags && specifiers == other.specifiers && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(description, name, productId, applicableProductIds, applicableProductTags, specifiers, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Commit{description=$description, name=$name, productId=$productId, applicableProductIds=$applicableProductIds, applicableProductTags=$applicableProductTags, specifiers=$specifiers, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PrepaidBalanceThresholdConfigurationV2 && commit == other.commit && isEnabled == other.isEnabled && paymentGateConfig == other.paymentGateConfig && rechargeToAmount == other.rechargeToAmount && thresholdAmount == other.thresholdAmount && customCreditTypeId == other.customCreditTypeId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(commit, isEnabled, paymentGateConfig, rechargeToAmount, thresholdAmount, customCreditTypeId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PrepaidBalanceThresholdConfigurationV2{commit=$commit, isEnabled=$isEnabled, paymentGateConfig=$paymentGateConfig, rechargeToAmount=$rechargeToAmount, thresholdAmount=$thresholdAmount, customCreditTypeId=$customCreditTypeId, additionalProperties=$additionalProperties}"
}
