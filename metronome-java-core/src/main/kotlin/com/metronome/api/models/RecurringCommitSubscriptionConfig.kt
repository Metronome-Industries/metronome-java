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
import com.metronome.api.core.checkRequired
import com.metronome.api.errors.MetronomeInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class RecurringCommitSubscriptionConfig
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val allocation: JsonField<Allocation>,
    private val applySeatIncreaseConfig: JsonField<ApplySeatIncreaseConfig>,
    private val subscriptionId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("allocation")
        @ExcludeMissing
        allocation: JsonField<Allocation> = JsonMissing.of(),
        @JsonProperty("apply_seat_increase_config")
        @ExcludeMissing
        applySeatIncreaseConfig: JsonField<ApplySeatIncreaseConfig> = JsonMissing.of(),
        @JsonProperty("subscription_id")
        @ExcludeMissing
        subscriptionId: JsonField<String> = JsonMissing.of(),
    ) : this(allocation, applySeatIncreaseConfig, subscriptionId, mutableMapOf())

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun allocation(): Allocation = allocation.getRequired("allocation")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun applySeatIncreaseConfig(): ApplySeatIncreaseConfig =
        applySeatIncreaseConfig.getRequired("apply_seat_increase_config")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun subscriptionId(): String = subscriptionId.getRequired("subscription_id")

    /**
     * Returns the raw JSON value of [allocation].
     *
     * Unlike [allocation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("allocation")
    @ExcludeMissing
    fun _allocation(): JsonField<Allocation> = allocation

    /**
     * Returns the raw JSON value of [applySeatIncreaseConfig].
     *
     * Unlike [applySeatIncreaseConfig], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("apply_seat_increase_config")
    @ExcludeMissing
    fun _applySeatIncreaseConfig(): JsonField<ApplySeatIncreaseConfig> = applySeatIncreaseConfig

    /**
     * Returns the raw JSON value of [subscriptionId].
     *
     * Unlike [subscriptionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subscription_id")
    @ExcludeMissing
    fun _subscriptionId(): JsonField<String> = subscriptionId

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
         * [RecurringCommitSubscriptionConfig].
         *
         * The following fields are required:
         * ```java
         * .allocation()
         * .applySeatIncreaseConfig()
         * .subscriptionId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RecurringCommitSubscriptionConfig]. */
    class Builder internal constructor() {

        private var allocation: JsonField<Allocation>? = null
        private var applySeatIncreaseConfig: JsonField<ApplySeatIncreaseConfig>? = null
        private var subscriptionId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(recurringCommitSubscriptionConfig: RecurringCommitSubscriptionConfig) =
            apply {
                allocation = recurringCommitSubscriptionConfig.allocation
                applySeatIncreaseConfig = recurringCommitSubscriptionConfig.applySeatIncreaseConfig
                subscriptionId = recurringCommitSubscriptionConfig.subscriptionId
                additionalProperties =
                    recurringCommitSubscriptionConfig.additionalProperties.toMutableMap()
            }

        fun allocation(allocation: Allocation) = allocation(JsonField.of(allocation))

        /**
         * Sets [Builder.allocation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allocation] with a well-typed [Allocation] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun allocation(allocation: JsonField<Allocation>) = apply { this.allocation = allocation }

        fun applySeatIncreaseConfig(applySeatIncreaseConfig: ApplySeatIncreaseConfig) =
            applySeatIncreaseConfig(JsonField.of(applySeatIncreaseConfig))

        /**
         * Sets [Builder.applySeatIncreaseConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.applySeatIncreaseConfig] with a well-typed
         * [ApplySeatIncreaseConfig] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun applySeatIncreaseConfig(applySeatIncreaseConfig: JsonField<ApplySeatIncreaseConfig>) =
            apply {
                this.applySeatIncreaseConfig = applySeatIncreaseConfig
            }

        fun subscriptionId(subscriptionId: String) = subscriptionId(JsonField.of(subscriptionId))

        /**
         * Sets [Builder.subscriptionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscriptionId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun subscriptionId(subscriptionId: JsonField<String>) = apply {
            this.subscriptionId = subscriptionId
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
         * Returns an immutable instance of [RecurringCommitSubscriptionConfig].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .allocation()
         * .applySeatIncreaseConfig()
         * .subscriptionId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RecurringCommitSubscriptionConfig =
            RecurringCommitSubscriptionConfig(
                checkRequired("allocation", allocation),
                checkRequired("applySeatIncreaseConfig", applySeatIncreaseConfig),
                checkRequired("subscriptionId", subscriptionId),
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
    fun validate(): RecurringCommitSubscriptionConfig = apply {
        if (validated) {
            return@apply
        }

        allocation().validate()
        applySeatIncreaseConfig().validate()
        subscriptionId()
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
        (allocation.asKnown().getOrNull()?.validity() ?: 0) +
            (applySeatIncreaseConfig.asKnown().getOrNull()?.validity() ?: 0) +
            (if (subscriptionId.asKnown().isPresent) 1 else 0)

    class Allocation @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val INDIVIDUAL = of("INDIVIDUAL")

            @JvmField val POOLED = of("POOLED")

            @JvmStatic fun of(value: String) = Allocation(JsonField.of(value))
        }

        /** An enum containing [Allocation]'s known values. */
        enum class Known {
            INDIVIDUAL,
            POOLED,
        }

        /**
         * An enum containing [Allocation]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Allocation] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            INDIVIDUAL,
            POOLED,
            /**
             * An enum member indicating that [Allocation] was instantiated with an unknown value.
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
                INDIVIDUAL -> Value.INDIVIDUAL
                POOLED -> Value.POOLED
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
                INDIVIDUAL -> Known.INDIVIDUAL
                POOLED -> Known.POOLED
                else -> throw MetronomeInvalidDataException("Unknown Allocation: $value")
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
        fun validate(): Allocation = apply {
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

            return other is Allocation && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class ApplySeatIncreaseConfig
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val isProrated: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("is_prorated")
            @ExcludeMissing
            isProrated: JsonField<Boolean> = JsonMissing.of()
        ) : this(isProrated, mutableMapOf())

        /**
         * Indicates whether a mid-period seat increase should be prorated.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun isProrated(): Boolean = isProrated.getRequired("is_prorated")

        /**
         * Returns the raw JSON value of [isProrated].
         *
         * Unlike [isProrated], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("is_prorated")
        @ExcludeMissing
        fun _isProrated(): JsonField<Boolean> = isProrated

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
             * Returns a mutable builder for constructing an instance of [ApplySeatIncreaseConfig].
             *
             * The following fields are required:
             * ```java
             * .isProrated()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ApplySeatIncreaseConfig]. */
        class Builder internal constructor() {

            private var isProrated: JsonField<Boolean>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(applySeatIncreaseConfig: ApplySeatIncreaseConfig) = apply {
                isProrated = applySeatIncreaseConfig.isProrated
                additionalProperties = applySeatIncreaseConfig.additionalProperties.toMutableMap()
            }

            /** Indicates whether a mid-period seat increase should be prorated. */
            fun isProrated(isProrated: Boolean) = isProrated(JsonField.of(isProrated))

            /**
             * Sets [Builder.isProrated] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isProrated] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isProrated(isProrated: JsonField<Boolean>) = apply { this.isProrated = isProrated }

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
             * Returns an immutable instance of [ApplySeatIncreaseConfig].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .isProrated()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ApplySeatIncreaseConfig =
                ApplySeatIncreaseConfig(
                    checkRequired("isProrated", isProrated),
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
        fun validate(): ApplySeatIncreaseConfig = apply {
            if (validated) {
                return@apply
            }

            isProrated()
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
        @JvmSynthetic internal fun validity(): Int = (if (isProrated.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ApplySeatIncreaseConfig &&
                isProrated == other.isProrated &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(isProrated, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ApplySeatIncreaseConfig{isProrated=$isProrated, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RecurringCommitSubscriptionConfig &&
            allocation == other.allocation &&
            applySeatIncreaseConfig == other.applySeatIncreaseConfig &&
            subscriptionId == other.subscriptionId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(allocation, applySeatIncreaseConfig, subscriptionId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RecurringCommitSubscriptionConfig{allocation=$allocation, applySeatIncreaseConfig=$applySeatIncreaseConfig, subscriptionId=$subscriptionId, additionalProperties=$additionalProperties}"
}
