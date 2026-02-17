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
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.checkRequired
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.util.Objects

@NoAutoDetect
class RecurringCommitSubscriptionConfig
@JsonCreator
private constructor(
    @JsonProperty("allocation")
    @ExcludeMissing
    private val allocation: JsonField<Allocation> = JsonMissing.of(),
    @JsonProperty("apply_seat_increase_config")
    @ExcludeMissing
    private val applySeatIncreaseConfig: JsonField<ApplySeatIncreaseConfig> = JsonMissing.of(),
    @JsonProperty("subscription_id")
    @ExcludeMissing
    private val subscriptionId: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun allocation(): Allocation = allocation.getRequired("allocation")

    fun applySeatIncreaseConfig(): ApplySeatIncreaseConfig =
        applySeatIncreaseConfig.getRequired("apply_seat_increase_config")

    fun subscriptionId(): String = subscriptionId.getRequired("subscription_id")

    @JsonProperty("allocation")
    @ExcludeMissing
    fun _allocation(): JsonField<Allocation> = allocation

    @JsonProperty("apply_seat_increase_config")
    @ExcludeMissing
    fun _applySeatIncreaseConfig(): JsonField<ApplySeatIncreaseConfig> = applySeatIncreaseConfig

    @JsonProperty("subscription_id")
    @ExcludeMissing
    fun _subscriptionId(): JsonField<String> = subscriptionId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): RecurringCommitSubscriptionConfig = apply {
        if (validated) {
            return@apply
        }

        allocation()
        applySeatIncreaseConfig().validate()
        subscriptionId()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

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

        fun allocation(allocation: JsonField<Allocation>) = apply { this.allocation = allocation }

        fun applySeatIncreaseConfig(applySeatIncreaseConfig: ApplySeatIncreaseConfig) =
            applySeatIncreaseConfig(JsonField.of(applySeatIncreaseConfig))

        fun applySeatIncreaseConfig(applySeatIncreaseConfig: JsonField<ApplySeatIncreaseConfig>) =
            apply {
                this.applySeatIncreaseConfig = applySeatIncreaseConfig
            }

        fun subscriptionId(subscriptionId: String) = subscriptionId(JsonField.of(subscriptionId))

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

        fun build(): RecurringCommitSubscriptionConfig =
            RecurringCommitSubscriptionConfig(
                checkRequired("allocation", allocation),
                checkRequired("applySeatIncreaseConfig", applySeatIncreaseConfig),
                checkRequired("subscriptionId", subscriptionId),
                additionalProperties.toImmutable(),
            )
    }

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Allocation && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @NoAutoDetect
    class ApplySeatIncreaseConfig
    @JsonCreator
    private constructor(
        @JsonProperty("is_prorated")
        @ExcludeMissing
        private val isProrated: JsonField<Boolean> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Indicates whether a mid-period seat increase should be prorated. */
        fun isProrated(): Boolean = isProrated.getRequired("is_prorated")

        /** Indicates whether a mid-period seat increase should be prorated. */
        @JsonProperty("is_prorated")
        @ExcludeMissing
        fun _isProrated(): JsonField<Boolean> = isProrated

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ApplySeatIncreaseConfig = apply {
            if (validated) {
                return@apply
            }

            isProrated()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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

            /** Indicates whether a mid-period seat increase should be prorated. */
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

            fun build(): ApplySeatIncreaseConfig =
                ApplySeatIncreaseConfig(
                    checkRequired("isProrated", isProrated),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ApplySeatIncreaseConfig && isProrated == other.isProrated && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(isProrated, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ApplySeatIncreaseConfig{isProrated=$isProrated, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RecurringCommitSubscriptionConfig && allocation == other.allocation && applySeatIncreaseConfig == other.applySeatIncreaseConfig && subscriptionId == other.subscriptionId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(allocation, applySeatIncreaseConfig, subscriptionId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RecurringCommitSubscriptionConfig{allocation=$allocation, applySeatIncreaseConfig=$applySeatIncreaseConfig, subscriptionId=$subscriptionId, additionalProperties=$additionalProperties}"
}
