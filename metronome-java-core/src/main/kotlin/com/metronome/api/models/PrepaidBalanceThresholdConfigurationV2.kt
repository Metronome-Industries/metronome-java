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
import com.metronome.api.core.checkKnown
import com.metronome.api.core.checkRequired
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PrepaidBalanceThresholdConfigurationV2
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val commit: JsonField<Commit>,
    private val isEnabled: JsonField<Boolean>,
    private val paymentGateConfig: JsonField<PaymentGateConfigV2>,
    private val rechargeToAmount: JsonField<Double>,
    private val thresholdAmount: JsonField<Double>,
    private val customCreditTypeId: JsonField<String>,
    private val discountConfiguration: JsonField<DiscountConfiguration>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("commit") @ExcludeMissing commit: JsonField<Commit> = JsonMissing.of(),
        @JsonProperty("is_enabled")
        @ExcludeMissing
        isEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("payment_gate_config")
        @ExcludeMissing
        paymentGateConfig: JsonField<PaymentGateConfigV2> = JsonMissing.of(),
        @JsonProperty("recharge_to_amount")
        @ExcludeMissing
        rechargeToAmount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("threshold_amount")
        @ExcludeMissing
        thresholdAmount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("custom_credit_type_id")
        @ExcludeMissing
        customCreditTypeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("discount_configuration")
        @ExcludeMissing
        discountConfiguration: JsonField<DiscountConfiguration> = JsonMissing.of(),
    ) : this(
        commit,
        isEnabled,
        paymentGateConfig,
        rechargeToAmount,
        thresholdAmount,
        customCreditTypeId,
        discountConfiguration,
        mutableMapOf(),
    )

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun commit(): Commit = commit.getRequired("commit")

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
     * Specify the amount the balance should be recharged to.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun rechargeToAmount(): Double = rechargeToAmount.getRequired("recharge_to_amount")

    /**
     * Specify the threshold amount for the contract. Each time the contract's balance lowers to
     * this amount, a threshold charge will be initiated.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun thresholdAmount(): Double = thresholdAmount.getRequired("threshold_amount")

    /**
     * If provided, the threshold, recharge-to amount, and the resulting threshold commit amount
     * will be in terms of this credit type instead of the fiat currency.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customCreditTypeId(): Optional<String> =
        customCreditTypeId.getOptional("custom_credit_type_id")

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
    @JsonProperty("commit") @ExcludeMissing fun _commit(): JsonField<Commit> = commit

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
     * Returns the raw JSON value of [rechargeToAmount].
     *
     * Unlike [rechargeToAmount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("recharge_to_amount")
    @ExcludeMissing
    fun _rechargeToAmount(): JsonField<Double> = rechargeToAmount

    /**
     * Returns the raw JSON value of [thresholdAmount].
     *
     * Unlike [thresholdAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("threshold_amount")
    @ExcludeMissing
    fun _thresholdAmount(): JsonField<Double> = thresholdAmount

    /**
     * Returns the raw JSON value of [customCreditTypeId].
     *
     * Unlike [customCreditTypeId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("custom_credit_type_id")
    @ExcludeMissing
    fun _customCreditTypeId(): JsonField<String> = customCreditTypeId

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
         * [PrepaidBalanceThresholdConfigurationV2].
         *
         * The following fields are required:
         * ```java
         * .commit()
         * .isEnabled()
         * .paymentGateConfig()
         * .rechargeToAmount()
         * .thresholdAmount()
         * ```
         */
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
        private var discountConfiguration: JsonField<DiscountConfiguration> = JsonMissing.of()
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
            discountConfiguration = prepaidBalanceThresholdConfigurationV2.discountConfiguration
            additionalProperties =
                prepaidBalanceThresholdConfigurationV2.additionalProperties.toMutableMap()
        }

        fun commit(commit: Commit) = commit(JsonField.of(commit))

        /**
         * Sets [Builder.commit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.commit] with a well-typed [Commit] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun commit(commit: JsonField<Commit>) = apply { this.commit = commit }

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

        /** Specify the amount the balance should be recharged to. */
        fun rechargeToAmount(rechargeToAmount: Double) =
            rechargeToAmount(JsonField.of(rechargeToAmount))

        /**
         * Sets [Builder.rechargeToAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rechargeToAmount] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
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
         * Sets [Builder.thresholdAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.thresholdAmount] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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
         * Sets [Builder.customCreditTypeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customCreditTypeId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun customCreditTypeId(customCreditTypeId: JsonField<String>) = apply {
            this.customCreditTypeId = customCreditTypeId
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
         * Returns an immutable instance of [PrepaidBalanceThresholdConfigurationV2].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .commit()
         * .isEnabled()
         * .paymentGateConfig()
         * .rechargeToAmount()
         * .thresholdAmount()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PrepaidBalanceThresholdConfigurationV2 =
            PrepaidBalanceThresholdConfigurationV2(
                checkRequired("commit", commit),
                checkRequired("isEnabled", isEnabled),
                checkRequired("paymentGateConfig", paymentGateConfig),
                checkRequired("rechargeToAmount", rechargeToAmount),
                checkRequired("thresholdAmount", thresholdAmount),
                customCreditTypeId,
                discountConfiguration,
                additionalProperties.toMutableMap(),
            )
    }

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
            (if (rechargeToAmount.asKnown().isPresent) 1 else 0) +
            (if (thresholdAmount.asKnown().isPresent) 1 else 0) +
            (if (customCreditTypeId.asKnown().isPresent) 1 else 0) +
            (discountConfiguration.asKnown().getOrNull()?.validity() ?: 0)

    class Commit
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val productId: JsonField<String>,
        private val description: JsonField<String>,
        private val name: JsonField<String>,
        private val priority: JsonField<Double>,
        private val applicableProductIds: JsonField<List<String>>,
        private val applicableProductTags: JsonField<List<String>>,
        private val specifiers: JsonField<List<CommitSpecifierInput>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("product_id")
            @ExcludeMissing
            productId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("priority")
            @ExcludeMissing
            priority: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("applicable_product_ids")
            @ExcludeMissing
            applicableProductIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("applicable_product_tags")
            @ExcludeMissing
            applicableProductTags: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("specifiers")
            @ExcludeMissing
            specifiers: JsonField<List<CommitSpecifierInput>> = JsonMissing.of(),
        ) : this(
            productId,
            description,
            name,
            priority,
            applicableProductIds,
            applicableProductTags,
            specifiers,
            mutableMapOf(),
        )

        fun toBaseThresholdCommit(): BaseThresholdCommit =
            BaseThresholdCommit.builder()
                .productId(productId)
                .description(description)
                .name(name)
                .priority(priority)
                .build()

        /**
         * The commit product that will be used to generate the line item for commit payment.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun productId(): String = productId.getRequired("product_id")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * Specify the name of the line item for the threshold charge. If left blank, it will
         * default to the commit product name.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * The priority of the commit, used to determine drawdown order. Lower priority commits are
         * consumed first. Defaults to 100 if not specified.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun priority(): Optional<Double> = priority.getOptional("priority")

        /**
         * Which products the threshold commit applies to. If applicable_product_ids,
         * applicable_product_tags or specifiers are not provided, the commit applies to all
         * products.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun applicableProductIds(): Optional<List<String>> =
            applicableProductIds.getOptional("applicable_product_ids")

        /**
         * Which tags the threshold commit applies to. If applicable_product_ids,
         * applicable_product_tags or specifiers are not provided, the commit applies to all
         * products.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun applicableProductTags(): Optional<List<String>> =
            applicableProductTags.getOptional("applicable_product_tags")

        /**
         * List of filters that determine what kind of customer usage draws down a commit or credit.
         * A customer's usage needs to meet the condition of at least one of the specifiers to
         * contribute to a commit's or credit's drawdown. This field cannot be used together with
         * `applicable_product_ids` or `applicable_product_tags`. Instead, to target usage by
         * product or product tag, pass those values in the body of `specifiers`.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun specifiers(): Optional<List<CommitSpecifierInput>> =
            specifiers.getOptional("specifiers")

        /**
         * Returns the raw JSON value of [productId].
         *
         * Unlike [productId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("product_id") @ExcludeMissing fun _productId(): JsonField<String> = productId

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [priority].
         *
         * Unlike [priority], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<Double> = priority

        /**
         * Returns the raw JSON value of [applicableProductIds].
         *
         * Unlike [applicableProductIds], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("applicable_product_ids")
        @ExcludeMissing
        fun _applicableProductIds(): JsonField<List<String>> = applicableProductIds

        /**
         * Returns the raw JSON value of [applicableProductTags].
         *
         * Unlike [applicableProductTags], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("applicable_product_tags")
        @ExcludeMissing
        fun _applicableProductTags(): JsonField<List<String>> = applicableProductTags

        /**
         * Returns the raw JSON value of [specifiers].
         *
         * Unlike [specifiers], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("specifiers")
        @ExcludeMissing
        fun _specifiers(): JsonField<List<CommitSpecifierInput>> = specifiers

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
             * Returns a mutable builder for constructing an instance of [Commit].
             *
             * The following fields are required:
             * ```java
             * .productId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Commit]. */
        class Builder internal constructor() {

            private var productId: JsonField<String>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var priority: JsonField<Double> = JsonMissing.of()
            private var applicableProductIds: JsonField<MutableList<String>>? = null
            private var applicableProductTags: JsonField<MutableList<String>>? = null
            private var specifiers: JsonField<MutableList<CommitSpecifierInput>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(commit: Commit) = apply {
                productId = commit.productId
                description = commit.description
                name = commit.name
                priority = commit.priority
                applicableProductIds = commit.applicableProductIds.map { it.toMutableList() }
                applicableProductTags = commit.applicableProductTags.map { it.toMutableList() }
                specifiers = commit.specifiers.map { it.toMutableList() }
                additionalProperties = commit.additionalProperties.toMutableMap()
            }

            /**
             * The commit product that will be used to generate the line item for commit payment.
             */
            fun productId(productId: String) = productId(JsonField.of(productId))

            /**
             * Sets [Builder.productId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.productId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun productId(productId: JsonField<String>) = apply { this.productId = productId }

            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /**
             * Specify the name of the line item for the threshold charge. If left blank, it will
             * default to the commit product name.
             */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * The priority of the commit, used to determine drawdown order. Lower priority commits
             * are consumed first. Defaults to 100 if not specified.
             */
            fun priority(priority: Double) = priority(JsonField.of(priority))

            /**
             * Sets [Builder.priority] to an arbitrary JSON value.
             *
             * You should usually call [Builder.priority] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun priority(priority: JsonField<Double>) = apply { this.priority = priority }

            /**
             * Which products the threshold commit applies to. If applicable_product_ids,
             * applicable_product_tags or specifiers are not provided, the commit applies to all
             * products.
             */
            fun applicableProductIds(applicableProductIds: List<String>) =
                applicableProductIds(JsonField.of(applicableProductIds))

            /**
             * Sets [Builder.applicableProductIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.applicableProductIds] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun applicableProductIds(applicableProductIds: JsonField<List<String>>) = apply {
                this.applicableProductIds = applicableProductIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [applicableProductIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addApplicableProductId(applicableProductId: String) = apply {
                applicableProductIds =
                    (applicableProductIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("applicableProductIds", it).add(applicableProductId)
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
             * Sets [Builder.applicableProductTags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.applicableProductTags] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun applicableProductTags(applicableProductTags: JsonField<List<String>>) = apply {
                this.applicableProductTags = applicableProductTags.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [applicableProductTags].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addApplicableProductTag(applicableProductTag: String) = apply {
                applicableProductTags =
                    (applicableProductTags ?: JsonField.of(mutableListOf())).also {
                        checkKnown("applicableProductTags", it).add(applicableProductTag)
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
             * Sets [Builder.specifiers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.specifiers] with a well-typed
             * `List<CommitSpecifierInput>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun specifiers(specifiers: JsonField<List<CommitSpecifierInput>>) = apply {
                this.specifiers = specifiers.map { it.toMutableList() }
            }

            /**
             * Adds a single [CommitSpecifierInput] to [specifiers].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSpecifier(specifier: CommitSpecifierInput) = apply {
                specifiers =
                    (specifiers ?: JsonField.of(mutableListOf())).also {
                        checkKnown("specifiers", it).add(specifier)
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

            /**
             * Returns an immutable instance of [Commit].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .productId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Commit =
                Commit(
                    checkRequired("productId", productId),
                    description,
                    name,
                    priority,
                    (applicableProductIds ?: JsonMissing.of()).map { it.toImmutable() },
                    (applicableProductTags ?: JsonMissing.of()).map { it.toImmutable() },
                    (specifiers ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Commit = apply {
            if (validated) {
                return@apply
            }

            productId()
            description()
            name()
            priority()
            applicableProductIds()
            applicableProductTags()
            specifiers().ifPresent { it.forEach { it.validate() } }
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
            (if (productId.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (priority.asKnown().isPresent) 1 else 0) +
                (applicableProductIds.asKnown().getOrNull()?.size ?: 0) +
                (applicableProductTags.asKnown().getOrNull()?.size ?: 0) +
                (specifiers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Commit &&
                productId == other.productId &&
                description == other.description &&
                name == other.name &&
                priority == other.priority &&
                applicableProductIds == other.applicableProductIds &&
                applicableProductTags == other.applicableProductTags &&
                specifiers == other.specifiers &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                productId,
                description,
                name,
                priority,
                applicableProductIds,
                applicableProductTags,
                specifiers,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Commit{productId=$productId, description=$description, name=$name, priority=$priority, applicableProductIds=$applicableProductIds, applicableProductTags=$applicableProductTags, specifiers=$specifiers, additionalProperties=$additionalProperties}"
    }

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

        return other is PrepaidBalanceThresholdConfigurationV2 &&
            commit == other.commit &&
            isEnabled == other.isEnabled &&
            paymentGateConfig == other.paymentGateConfig &&
            rechargeToAmount == other.rechargeToAmount &&
            thresholdAmount == other.thresholdAmount &&
            customCreditTypeId == other.customCreditTypeId &&
            discountConfiguration == other.discountConfiguration &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            commit,
            isEnabled,
            paymentGateConfig,
            rechargeToAmount,
            thresholdAmount,
            customCreditTypeId,
            discountConfiguration,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PrepaidBalanceThresholdConfigurationV2{commit=$commit, isEnabled=$isEnabled, paymentGateConfig=$paymentGateConfig, rechargeToAmount=$rechargeToAmount, thresholdAmount=$thresholdAmount, customCreditTypeId=$customCreditTypeId, discountConfiguration=$discountConfiguration, additionalProperties=$additionalProperties}"
}
