// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

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

class PrepaidBalanceThresholdConfiguration
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val commit: JsonField<Commit>,
    private val isEnabled: JsonField<Boolean>,
    private val paymentGateConfig: JsonField<PaymentGateConfig>,
    private val rechargeToAmount: JsonField<Double>,
    private val thresholdAmount: JsonField<Double>,
    private val customCreditTypeId: JsonField<String>,
    private val discountConfiguration: JsonField<DiscountConfiguration>,
    private val thresholdBalanceSpecifiers: JsonField<List<ThresholdBalanceSpecifier>>,
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
        paymentGateConfig: JsonField<PaymentGateConfig> = JsonMissing.of(),
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
        @JsonProperty("threshold_balance_specifiers")
        @ExcludeMissing
        thresholdBalanceSpecifiers: JsonField<List<ThresholdBalanceSpecifier>> = JsonMissing.of(),
    ) : this(
        commit,
        isEnabled,
        paymentGateConfig,
        rechargeToAmount,
        thresholdAmount,
        customCreditTypeId,
        discountConfiguration,
        thresholdBalanceSpecifiers,
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
    fun paymentGateConfig(): PaymentGateConfig =
        paymentGateConfig.getRequired("payment_gate_config")

    /**
     * Specify the amount the balance should be recharged to.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun rechargeToAmount(): Double = rechargeToAmount.getRequired("recharge_to_amount")

    /**
     * Specify the threshold amount for the contract. Each time the contract's prepaid balance
     * lowers to this amount, a threshold charge will be initiated.
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
     * Determines which balances are excluded from remaining balance calculation for threshold
     * billing.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun thresholdBalanceSpecifiers(): Optional<List<ThresholdBalanceSpecifier>> =
        thresholdBalanceSpecifiers.getOptional("threshold_balance_specifiers")

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
    fun _paymentGateConfig(): JsonField<PaymentGateConfig> = paymentGateConfig

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

    /**
     * Returns the raw JSON value of [thresholdBalanceSpecifiers].
     *
     * Unlike [thresholdBalanceSpecifiers], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("threshold_balance_specifiers")
    @ExcludeMissing
    fun _thresholdBalanceSpecifiers(): JsonField<List<ThresholdBalanceSpecifier>> =
        thresholdBalanceSpecifiers

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
         * [PrepaidBalanceThresholdConfiguration].
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

    /** A builder for [PrepaidBalanceThresholdConfiguration]. */
    class Builder internal constructor() {

        private var commit: JsonField<Commit>? = null
        private var isEnabled: JsonField<Boolean>? = null
        private var paymentGateConfig: JsonField<PaymentGateConfig>? = null
        private var rechargeToAmount: JsonField<Double>? = null
        private var thresholdAmount: JsonField<Double>? = null
        private var customCreditTypeId: JsonField<String> = JsonMissing.of()
        private var discountConfiguration: JsonField<DiscountConfiguration> = JsonMissing.of()
        private var thresholdBalanceSpecifiers: JsonField<MutableList<ThresholdBalanceSpecifier>>? =
            null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            prepaidBalanceThresholdConfiguration: PrepaidBalanceThresholdConfiguration
        ) = apply {
            commit = prepaidBalanceThresholdConfiguration.commit
            isEnabled = prepaidBalanceThresholdConfiguration.isEnabled
            paymentGateConfig = prepaidBalanceThresholdConfiguration.paymentGateConfig
            rechargeToAmount = prepaidBalanceThresholdConfiguration.rechargeToAmount
            thresholdAmount = prepaidBalanceThresholdConfiguration.thresholdAmount
            customCreditTypeId = prepaidBalanceThresholdConfiguration.customCreditTypeId
            discountConfiguration = prepaidBalanceThresholdConfiguration.discountConfiguration
            thresholdBalanceSpecifiers =
                prepaidBalanceThresholdConfiguration.thresholdBalanceSpecifiers.map {
                    it.toMutableList()
                }
            additionalProperties =
                prepaidBalanceThresholdConfiguration.additionalProperties.toMutableMap()
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

        fun paymentGateConfig(paymentGateConfig: PaymentGateConfig) =
            paymentGateConfig(JsonField.of(paymentGateConfig))

        /**
         * Sets [Builder.paymentGateConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentGateConfig] with a well-typed [PaymentGateConfig]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun paymentGateConfig(paymentGateConfig: JsonField<PaymentGateConfig>) = apply {
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
         * Specify the threshold amount for the contract. Each time the contract's prepaid balance
         * lowers to this amount, a threshold charge will be initiated.
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

        /**
         * Determines which balances are excluded from remaining balance calculation for threshold
         * billing.
         */
        fun thresholdBalanceSpecifiers(
            thresholdBalanceSpecifiers: List<ThresholdBalanceSpecifier>
        ) = thresholdBalanceSpecifiers(JsonField.of(thresholdBalanceSpecifiers))

        /**
         * Sets [Builder.thresholdBalanceSpecifiers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.thresholdBalanceSpecifiers] with a well-typed
         * `List<ThresholdBalanceSpecifier>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun thresholdBalanceSpecifiers(
            thresholdBalanceSpecifiers: JsonField<List<ThresholdBalanceSpecifier>>
        ) = apply {
            this.thresholdBalanceSpecifiers = thresholdBalanceSpecifiers.map { it.toMutableList() }
        }

        /**
         * Adds a single [ThresholdBalanceSpecifier] to [thresholdBalanceSpecifiers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addThresholdBalanceSpecifier(thresholdBalanceSpecifier: ThresholdBalanceSpecifier) =
            apply {
                thresholdBalanceSpecifiers =
                    (thresholdBalanceSpecifiers ?: JsonField.of(mutableListOf())).also {
                        checkKnown("thresholdBalanceSpecifiers", it).add(thresholdBalanceSpecifier)
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
         * Returns an immutable instance of [PrepaidBalanceThresholdConfiguration].
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
        fun build(): PrepaidBalanceThresholdConfiguration =
            PrepaidBalanceThresholdConfiguration(
                checkRequired("commit", commit),
                checkRequired("isEnabled", isEnabled),
                checkRequired("paymentGateConfig", paymentGateConfig),
                checkRequired("rechargeToAmount", rechargeToAmount),
                checkRequired("thresholdAmount", thresholdAmount),
                customCreditTypeId,
                discountConfiguration,
                (thresholdBalanceSpecifiers ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): PrepaidBalanceThresholdConfiguration = apply {
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
        thresholdBalanceSpecifiers().ifPresent { it.forEach { it.validate() } }
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
            (discountConfiguration.asKnown().getOrNull()?.validity() ?: 0) +
            (thresholdBalanceSpecifiers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

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
         * `applicable_product_ids` or `applicable_product_tags`.
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
             * used together with `applicable_product_ids` or `applicable_product_tags`.
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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
        private val cap: JsonField<Cap>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("payment_fraction")
            @ExcludeMissing
            paymentFraction: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("cap") @ExcludeMissing cap: JsonField<Cap> = JsonMissing.of(),
        ) : this(paymentFraction, cap, mutableMapOf())

        /**
         * The fraction of the original amount that the customer pays after applying the discount.
         * For example, 0.85 means the customer pays 85% of the original amount (a 15% discount).
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun paymentFraction(): Double = paymentFraction.getRequired("payment_fraction")

        /**
         * If provided, the discount stops applying once the spend tracker has accumulated this much
         * spend in the billing period.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun cap(): Optional<Cap> = cap.getOptional("cap")

        /**
         * Returns the raw JSON value of [paymentFraction].
         *
         * Unlike [paymentFraction], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("payment_fraction")
        @ExcludeMissing
        fun _paymentFraction(): JsonField<Double> = paymentFraction

        /**
         * Returns the raw JSON value of [cap].
         *
         * Unlike [cap], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cap") @ExcludeMissing fun _cap(): JsonField<Cap> = cap

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
            private var cap: JsonField<Cap> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(discountConfiguration: DiscountConfiguration) = apply {
                paymentFraction = discountConfiguration.paymentFraction
                cap = discountConfiguration.cap
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

            /**
             * If provided, the discount stops applying once the spend tracker has accumulated this
             * much spend in the billing period.
             */
            fun cap(cap: Cap) = cap(JsonField.of(cap))

            /**
             * Sets [Builder.cap] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cap] with a well-typed [Cap] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun cap(cap: JsonField<Cap>) = apply { this.cap = cap }

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
                    cap,
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
        fun validate(): DiscountConfiguration = apply {
            if (validated) {
                return@apply
            }

            paymentFraction()
            cap().ifPresent { it.validate() }
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
            (if (paymentFraction.asKnown().isPresent) 1 else 0) +
                (cap.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * If provided, the discount stops applying once the spend tracker has accumulated this much
         * spend in the billing period.
         */
        class Cap
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val amount: JsonField<Double>,
            private val spendTrackerAlias: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                amount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("spend_tracker_alias")
                @ExcludeMissing
                spendTrackerAlias: JsonField<String> = JsonMissing.of(),
            ) : this(amount, spendTrackerAlias, mutableMapOf())

            /**
             * Accumulated spend ceiling above which the discount stops applying.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): Double = amount.getRequired("amount")

            /**
             * Alias of the spend tracker this cap is measured against.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun spendTrackerAlias(): String = spendTrackerAlias.getRequired("spend_tracker_alias")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

            /**
             * Returns the raw JSON value of [spendTrackerAlias].
             *
             * Unlike [spendTrackerAlias], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("spend_tracker_alias")
            @ExcludeMissing
            fun _spendTrackerAlias(): JsonField<String> = spendTrackerAlias

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
                 * Returns a mutable builder for constructing an instance of [Cap].
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .spendTrackerAlias()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Cap]. */
            class Builder internal constructor() {

                private var amount: JsonField<Double>? = null
                private var spendTrackerAlias: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(cap: Cap) = apply {
                    amount = cap.amount
                    spendTrackerAlias = cap.spendTrackerAlias
                    additionalProperties = cap.additionalProperties.toMutableMap()
                }

                /** Accumulated spend ceiling above which the discount stops applying. */
                fun amount(amount: Double) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                /** Alias of the spend tracker this cap is measured against. */
                fun spendTrackerAlias(spendTrackerAlias: String) =
                    spendTrackerAlias(JsonField.of(spendTrackerAlias))

                /**
                 * Sets [Builder.spendTrackerAlias] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.spendTrackerAlias] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun spendTrackerAlias(spendTrackerAlias: JsonField<String>) = apply {
                    this.spendTrackerAlias = spendTrackerAlias
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
                 * Returns an immutable instance of [Cap].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .spendTrackerAlias()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Cap =
                    Cap(
                        checkRequired("amount", amount),
                        checkRequired("spendTrackerAlias", spendTrackerAlias),
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
            fun validate(): Cap = apply {
                if (validated) {
                    return@apply
                }

                amount()
                spendTrackerAlias()
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
                    (if (spendTrackerAlias.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Cap &&
                    amount == other.amount &&
                    spendTrackerAlias == other.spendTrackerAlias &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(amount, spendTrackerAlias, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Cap{amount=$amount, spendTrackerAlias=$spendTrackerAlias, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DiscountConfiguration &&
                paymentFraction == other.paymentFraction &&
                cap == other.cap &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(paymentFraction, cap, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DiscountConfiguration{paymentFraction=$paymentFraction, cap=$cap, additionalProperties=$additionalProperties}"
    }

    class ThresholdBalanceSpecifier
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val exclude: JsonField<List<Exclude>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("exclude")
            @ExcludeMissing
            exclude: JsonField<List<Exclude>> = JsonMissing.of()
        ) : this(exclude, mutableMapOf())

        /**
         * If any of the exclude specifier is met, the balance is not considered when evaluating
         * threshold billing
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun exclude(): List<Exclude> = exclude.getRequired("exclude")

        /**
         * Returns the raw JSON value of [exclude].
         *
         * Unlike [exclude], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("exclude") @ExcludeMissing fun _exclude(): JsonField<List<Exclude>> = exclude

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
             * [ThresholdBalanceSpecifier].
             *
             * The following fields are required:
             * ```java
             * .exclude()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ThresholdBalanceSpecifier]. */
        class Builder internal constructor() {

            private var exclude: JsonField<MutableList<Exclude>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(thresholdBalanceSpecifier: ThresholdBalanceSpecifier) = apply {
                exclude = thresholdBalanceSpecifier.exclude.map { it.toMutableList() }
                additionalProperties = thresholdBalanceSpecifier.additionalProperties.toMutableMap()
            }

            /**
             * If any of the exclude specifier is met, the balance is not considered when evaluating
             * threshold billing
             */
            fun exclude(exclude: List<Exclude>) = exclude(JsonField.of(exclude))

            /**
             * Sets [Builder.exclude] to an arbitrary JSON value.
             *
             * You should usually call [Builder.exclude] with a well-typed `List<Exclude>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun exclude(exclude: JsonField<List<Exclude>>) = apply {
                this.exclude = exclude.map { it.toMutableList() }
            }

            /**
             * Adds a single [Exclude] to [Builder.exclude].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addExclude(exclude: Exclude) = apply {
                this.exclude =
                    (this.exclude ?: JsonField.of(mutableListOf())).also {
                        checkKnown("exclude", it).add(exclude)
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
             * Returns an immutable instance of [ThresholdBalanceSpecifier].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .exclude()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ThresholdBalanceSpecifier =
                ThresholdBalanceSpecifier(
                    checkRequired("exclude", exclude).map { it.toImmutable() },
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
        fun validate(): ThresholdBalanceSpecifier = apply {
            if (validated) {
                return@apply
            }

            exclude().forEach { it.validate() }
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
            (exclude.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        class Exclude
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val customFieldFilters: JsonField<List<CustomFieldFilter>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("custom_field_filters")
                @ExcludeMissing
                customFieldFilters: JsonField<List<CustomFieldFilter>> = JsonMissing.of()
            ) : this(customFieldFilters, mutableMapOf())

            /**
             * If provided, balances with all the custom fields will not be considered when
             * evaluating threshold billing
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun customFieldFilters(): List<CustomFieldFilter> =
                customFieldFilters.getRequired("custom_field_filters")

            /**
             * Returns the raw JSON value of [customFieldFilters].
             *
             * Unlike [customFieldFilters], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("custom_field_filters")
            @ExcludeMissing
            fun _customFieldFilters(): JsonField<List<CustomFieldFilter>> = customFieldFilters

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
                 * Returns a mutable builder for constructing an instance of [Exclude].
                 *
                 * The following fields are required:
                 * ```java
                 * .customFieldFilters()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Exclude]. */
            class Builder internal constructor() {

                private var customFieldFilters: JsonField<MutableList<CustomFieldFilter>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(exclude: Exclude) = apply {
                    customFieldFilters = exclude.customFieldFilters.map { it.toMutableList() }
                    additionalProperties = exclude.additionalProperties.toMutableMap()
                }

                /**
                 * If provided, balances with all the custom fields will not be considered when
                 * evaluating threshold billing
                 */
                fun customFieldFilters(customFieldFilters: List<CustomFieldFilter>) =
                    customFieldFilters(JsonField.of(customFieldFilters))

                /**
                 * Sets [Builder.customFieldFilters] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.customFieldFilters] with a well-typed
                 * `List<CustomFieldFilter>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun customFieldFilters(customFieldFilters: JsonField<List<CustomFieldFilter>>) =
                    apply {
                        this.customFieldFilters = customFieldFilters.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [CustomFieldFilter] to [customFieldFilters].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addCustomFieldFilter(customFieldFilter: CustomFieldFilter) = apply {
                    customFieldFilters =
                        (customFieldFilters ?: JsonField.of(mutableListOf())).also {
                            checkKnown("customFieldFilters", it).add(customFieldFilter)
                        }
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
                 * Returns an immutable instance of [Exclude].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .customFieldFilters()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Exclude =
                    Exclude(
                        checkRequired("customFieldFilters", customFieldFilters).map {
                            it.toImmutable()
                        },
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
            fun validate(): Exclude = apply {
                if (validated) {
                    return@apply
                }

                customFieldFilters().forEach { it.validate() }
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
                (customFieldFilters.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

            class CustomFieldFilter
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val entity: JsonField<Entity>,
                private val key: JsonField<String>,
                private val value: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("entity")
                    @ExcludeMissing
                    entity: JsonField<Entity> = JsonMissing.of(),
                    @JsonProperty("key") @ExcludeMissing key: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("value")
                    @ExcludeMissing
                    value: JsonField<String> = JsonMissing.of(),
                ) : this(entity, key, value, mutableMapOf())

                /**
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun entity(): Entity = entity.getRequired("entity")

                /**
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun key(): String = key.getRequired("key")

                /**
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun value(): String = value.getRequired("value")

                /**
                 * Returns the raw JSON value of [entity].
                 *
                 * Unlike [entity], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("entity") @ExcludeMissing fun _entity(): JsonField<Entity> = entity

                /**
                 * Returns the raw JSON value of [key].
                 *
                 * Unlike [key], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

                /**
                 * Returns the raw JSON value of [value].
                 *
                 * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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
                     * [CustomFieldFilter].
                     *
                     * The following fields are required:
                     * ```java
                     * .entity()
                     * .key()
                     * .value()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [CustomFieldFilter]. */
                class Builder internal constructor() {

                    private var entity: JsonField<Entity>? = null
                    private var key: JsonField<String>? = null
                    private var value: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(customFieldFilter: CustomFieldFilter) = apply {
                        entity = customFieldFilter.entity
                        key = customFieldFilter.key
                        value = customFieldFilter.value
                        additionalProperties = customFieldFilter.additionalProperties.toMutableMap()
                    }

                    fun entity(entity: Entity) = entity(JsonField.of(entity))

                    /**
                     * Sets [Builder.entity] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.entity] with a well-typed [Entity] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun entity(entity: JsonField<Entity>) = apply { this.entity = entity }

                    fun key(key: String) = key(JsonField.of(key))

                    /**
                     * Sets [Builder.key] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.key] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun key(key: JsonField<String>) = apply { this.key = key }

                    fun value(value: String) = value(JsonField.of(value))

                    /**
                     * Sets [Builder.value] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.value] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun value(value: JsonField<String>) = apply { this.value = value }

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
                     * Returns an immutable instance of [CustomFieldFilter].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .entity()
                     * .key()
                     * .value()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): CustomFieldFilter =
                        CustomFieldFilter(
                            checkRequired("entity", entity),
                            checkRequired("key", key),
                            checkRequired("value", value),
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
                 * @throws MetronomeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): CustomFieldFilter = apply {
                    if (validated) {
                        return@apply
                    }

                    entity().validate()
                    key()
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
                    (entity.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (key.asKnown().isPresent) 1 else 0) +
                        (if (value.asKnown().isPresent) 1 else 0)

                class Entity
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val COMMIT = of("Commit")

                        @JvmField val CONTRACT_CREDIT = of("ContractCredit")

                        @JvmField val CONTRACT_CREDIT_OR_COMMIT = of("ContractCreditOrCommit")

                        @JvmStatic fun of(value: String) = Entity(JsonField.of(value))
                    }

                    /** An enum containing [Entity]'s known values. */
                    enum class Known {
                        COMMIT,
                        CONTRACT_CREDIT,
                        CONTRACT_CREDIT_OR_COMMIT,
                    }

                    /**
                     * An enum containing [Entity]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Entity] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        COMMIT,
                        CONTRACT_CREDIT,
                        CONTRACT_CREDIT_OR_COMMIT,
                        /**
                         * An enum member indicating that [Entity] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            COMMIT -> Value.COMMIT
                            CONTRACT_CREDIT -> Value.CONTRACT_CREDIT
                            CONTRACT_CREDIT_OR_COMMIT -> Value.CONTRACT_CREDIT_OR_COMMIT
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws MetronomeInvalidDataException if this class instance's value is a not
                     *   a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            COMMIT -> Known.COMMIT
                            CONTRACT_CREDIT -> Known.CONTRACT_CREDIT
                            CONTRACT_CREDIT_OR_COMMIT -> Known.CONTRACT_CREDIT_OR_COMMIT
                            else -> throw MetronomeInvalidDataException("Unknown Entity: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws MetronomeInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            MetronomeInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws MetronomeInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): Entity = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Entity && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CustomFieldFilter &&
                        entity == other.entity &&
                        key == other.key &&
                        value == other.value &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(entity, key, value, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "CustomFieldFilter{entity=$entity, key=$key, value=$value, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Exclude &&
                    customFieldFilters == other.customFieldFilters &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(customFieldFilters, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Exclude{customFieldFilters=$customFieldFilters, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ThresholdBalanceSpecifier &&
                exclude == other.exclude &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(exclude, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ThresholdBalanceSpecifier{exclude=$exclude, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PrepaidBalanceThresholdConfiguration &&
            commit == other.commit &&
            isEnabled == other.isEnabled &&
            paymentGateConfig == other.paymentGateConfig &&
            rechargeToAmount == other.rechargeToAmount &&
            thresholdAmount == other.thresholdAmount &&
            customCreditTypeId == other.customCreditTypeId &&
            discountConfiguration == other.discountConfiguration &&
            thresholdBalanceSpecifiers == other.thresholdBalanceSpecifiers &&
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
            thresholdBalanceSpecifiers,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PrepaidBalanceThresholdConfiguration{commit=$commit, isEnabled=$isEnabled, paymentGateConfig=$paymentGateConfig, rechargeToAmount=$rechargeToAmount, thresholdAmount=$thresholdAmount, customCreditTypeId=$customCreditTypeId, discountConfiguration=$discountConfiguration, thresholdBalanceSpecifiers=$thresholdBalanceSpecifiers, additionalProperties=$additionalProperties}"
}
