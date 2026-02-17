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
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class BalanceFilter
@JsonCreator
private constructor(
    @JsonProperty("balance_types")
    @ExcludeMissing
    private val balanceTypes: JsonField<List<BalanceType>> = JsonMissing.of(),
    @JsonProperty("custom_fields")
    @ExcludeMissing
    private val customFields: JsonField<CustomFields> = JsonMissing.of(),
    @JsonProperty("ids")
    @ExcludeMissing
    private val ids: JsonField<List<String>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The balance type to filter by. */
    fun balanceTypes(): Optional<List<BalanceType>> =
        Optional.ofNullable(balanceTypes.getNullable("balance_types"))

    /** Custom fields to compute balance across. Must match all custom fields */
    fun customFields(): Optional<CustomFields> =
        Optional.ofNullable(customFields.getNullable("custom_fields"))

    /** Specific IDs to compute balance across. */
    fun ids(): Optional<List<String>> = Optional.ofNullable(ids.getNullable("ids"))

    /** The balance type to filter by. */
    @JsonProperty("balance_types")
    @ExcludeMissing
    fun _balanceTypes(): JsonField<List<BalanceType>> = balanceTypes

    /** Custom fields to compute balance across. Must match all custom fields */
    @JsonProperty("custom_fields")
    @ExcludeMissing
    fun _customFields(): JsonField<CustomFields> = customFields

    /** Specific IDs to compute balance across. */
    @JsonProperty("ids") @ExcludeMissing fun _ids(): JsonField<List<String>> = ids

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): BalanceFilter = apply {
        if (validated) {
            return@apply
        }

        balanceTypes()
        customFields().ifPresent { it.validate() }
        ids()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BalanceFilter]. */
    class Builder internal constructor() {

        private var balanceTypes: JsonField<MutableList<BalanceType>>? = null
        private var customFields: JsonField<CustomFields> = JsonMissing.of()
        private var ids: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(balanceFilter: BalanceFilter) = apply {
            balanceTypes = balanceFilter.balanceTypes.map { it.toMutableList() }
            customFields = balanceFilter.customFields
            ids = balanceFilter.ids.map { it.toMutableList() }
            additionalProperties = balanceFilter.additionalProperties.toMutableMap()
        }

        /** The balance type to filter by. */
        fun balanceTypes(balanceTypes: List<BalanceType>) = balanceTypes(JsonField.of(balanceTypes))

        /** The balance type to filter by. */
        fun balanceTypes(balanceTypes: JsonField<List<BalanceType>>) = apply {
            this.balanceTypes = balanceTypes.map { it.toMutableList() }
        }

        /** The balance type to filter by. */
        fun addBalanceType(balanceType: BalanceType) = apply {
            balanceTypes =
                (balanceTypes ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(balanceType)
                }
        }

        /** Custom fields to compute balance across. Must match all custom fields */
        fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

        /** Custom fields to compute balance across. Must match all custom fields */
        fun customFields(customFields: JsonField<CustomFields>) = apply {
            this.customFields = customFields
        }

        /** Specific IDs to compute balance across. */
        fun ids(ids: List<String>) = ids(JsonField.of(ids))

        /** Specific IDs to compute balance across. */
        fun ids(ids: JsonField<List<String>>) = apply { this.ids = ids.map { it.toMutableList() } }

        /** Specific IDs to compute balance across. */
        fun addId(id: String) = apply {
            ids =
                (ids ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(id)
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

        fun build(): BalanceFilter =
            BalanceFilter(
                (balanceTypes ?: JsonMissing.of()).map { it.toImmutable() },
                customFields,
                (ids ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    class BalanceType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val PREPAID_COMMIT = of("PREPAID_COMMIT")

            @JvmField val POSTPAID_COMMIT = of("POSTPAID_COMMIT")

            @JvmField val CREDIT = of("CREDIT")

            @JvmStatic fun of(value: String) = BalanceType(JsonField.of(value))
        }

        /** An enum containing [BalanceType]'s known values. */
        enum class Known {
            PREPAID_COMMIT,
            POSTPAID_COMMIT,
            CREDIT,
        }

        /**
         * An enum containing [BalanceType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [BalanceType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PREPAID_COMMIT,
            POSTPAID_COMMIT,
            CREDIT,
            /**
             * An enum member indicating that [BalanceType] was instantiated with an unknown value.
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
                PREPAID_COMMIT -> Value.PREPAID_COMMIT
                POSTPAID_COMMIT -> Value.POSTPAID_COMMIT
                CREDIT -> Value.CREDIT
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
                PREPAID_COMMIT -> Known.PREPAID_COMMIT
                POSTPAID_COMMIT -> Known.POSTPAID_COMMIT
                CREDIT -> Known.CREDIT
                else -> throw MetronomeInvalidDataException("Unknown BalanceType: $value")
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

            return /* spotless:off */ other is BalanceType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Custom fields to compute balance across. Must match all custom fields */
    @NoAutoDetect
    class CustomFields
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CustomFields = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CustomFields]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customFields: CustomFields) = apply {
                additionalProperties = customFields.additionalProperties.toMutableMap()
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

            fun build(): CustomFields = CustomFields(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CustomFields && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BalanceFilter && balanceTypes == other.balanceTypes && customFields == other.customFields && ids == other.ids && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(balanceTypes, customFields, ids, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BalanceFilter{balanceTypes=$balanceTypes, customFields=$customFields, ids=$ids, additionalProperties=$additionalProperties}"
}
