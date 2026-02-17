// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.BaseDeserializer
import com.metronome.api.core.BaseSerializer
import com.metronome.api.core.Enum
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.checkRequired
import com.metronome.api.core.getOrThrow
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class CommitHierarchyConfiguration
@JsonCreator
private constructor(
    @JsonProperty("child_access")
    @ExcludeMissing
    private val childAccess: JsonField<ChildAccess> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun childAccess(): ChildAccess = childAccess.getRequired("child_access")

    @JsonProperty("child_access")
    @ExcludeMissing
    fun _childAccess(): JsonField<ChildAccess> = childAccess

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): CommitHierarchyConfiguration = apply {
        if (validated) {
            return@apply
        }

        childAccess().validate()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CommitHierarchyConfiguration]. */
    class Builder internal constructor() {

        private var childAccess: JsonField<ChildAccess>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(commitHierarchyConfiguration: CommitHierarchyConfiguration) = apply {
            childAccess = commitHierarchyConfiguration.childAccess
            additionalProperties = commitHierarchyConfiguration.additionalProperties.toMutableMap()
        }

        fun childAccess(childAccess: ChildAccess) = childAccess(JsonField.of(childAccess))

        fun childAccess(childAccess: JsonField<ChildAccess>) = apply {
            this.childAccess = childAccess
        }

        fun childAccess(commitHierarchyChildAccessAll: ChildAccess.CommitHierarchyChildAccessAll) =
            childAccess(ChildAccess.ofCommitHierarchyChildAccessAll(commitHierarchyChildAccessAll))

        fun childAccess(
            commitHierarchyChildAccessNone: ChildAccess.CommitHierarchyChildAccessNone
        ) =
            childAccess(
                ChildAccess.ofCommitHierarchyChildAccessNone(commitHierarchyChildAccessNone)
            )

        fun childAccess(
            commitHierarchyChildAccessContractIds: ChildAccess.CommitHierarchyChildAccessContractIds
        ) =
            childAccess(
                ChildAccess.ofCommitHierarchyChildAccessContractIds(
                    commitHierarchyChildAccessContractIds
                )
            )

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

        fun build(): CommitHierarchyConfiguration =
            CommitHierarchyConfiguration(
                checkRequired("childAccess", childAccess),
                additionalProperties.toImmutable(),
            )
    }

    @JsonDeserialize(using = ChildAccess.Deserializer::class)
    @JsonSerialize(using = ChildAccess.Serializer::class)
    class ChildAccess
    private constructor(
        private val commitHierarchyChildAccessAll: CommitHierarchyChildAccessAll? = null,
        private val commitHierarchyChildAccessNone: CommitHierarchyChildAccessNone? = null,
        private val commitHierarchyChildAccessContractIds: CommitHierarchyChildAccessContractIds? =
            null,
        private val _json: JsonValue? = null,
    ) {

        fun commitHierarchyChildAccessAll(): Optional<CommitHierarchyChildAccessAll> =
            Optional.ofNullable(commitHierarchyChildAccessAll)

        fun commitHierarchyChildAccessNone(): Optional<CommitHierarchyChildAccessNone> =
            Optional.ofNullable(commitHierarchyChildAccessNone)

        fun commitHierarchyChildAccessContractIds():
            Optional<CommitHierarchyChildAccessContractIds> =
            Optional.ofNullable(commitHierarchyChildAccessContractIds)

        fun isCommitHierarchyChildAccessAll(): Boolean = commitHierarchyChildAccessAll != null

        fun isCommitHierarchyChildAccessNone(): Boolean = commitHierarchyChildAccessNone != null

        fun isCommitHierarchyChildAccessContractIds(): Boolean =
            commitHierarchyChildAccessContractIds != null

        fun asCommitHierarchyChildAccessAll(): CommitHierarchyChildAccessAll =
            commitHierarchyChildAccessAll.getOrThrow("commitHierarchyChildAccessAll")

        fun asCommitHierarchyChildAccessNone(): CommitHierarchyChildAccessNone =
            commitHierarchyChildAccessNone.getOrThrow("commitHierarchyChildAccessNone")

        fun asCommitHierarchyChildAccessContractIds(): CommitHierarchyChildAccessContractIds =
            commitHierarchyChildAccessContractIds.getOrThrow(
                "commitHierarchyChildAccessContractIds"
            )

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                commitHierarchyChildAccessAll != null ->
                    visitor.visitCommitHierarchyChildAccessAll(commitHierarchyChildAccessAll)
                commitHierarchyChildAccessNone != null ->
                    visitor.visitCommitHierarchyChildAccessNone(commitHierarchyChildAccessNone)
                commitHierarchyChildAccessContractIds != null ->
                    visitor.visitCommitHierarchyChildAccessContractIds(
                        commitHierarchyChildAccessContractIds
                    )
                else -> visitor.unknown(_json)
            }
        }

        private var validated: Boolean = false

        fun validate(): ChildAccess = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitCommitHierarchyChildAccessAll(
                        commitHierarchyChildAccessAll: CommitHierarchyChildAccessAll
                    ) {
                        commitHierarchyChildAccessAll.validate()
                    }

                    override fun visitCommitHierarchyChildAccessNone(
                        commitHierarchyChildAccessNone: CommitHierarchyChildAccessNone
                    ) {
                        commitHierarchyChildAccessNone.validate()
                    }

                    override fun visitCommitHierarchyChildAccessContractIds(
                        commitHierarchyChildAccessContractIds: CommitHierarchyChildAccessContractIds
                    ) {
                        commitHierarchyChildAccessContractIds.validate()
                    }
                }
            )
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ChildAccess && commitHierarchyChildAccessAll == other.commitHierarchyChildAccessAll && commitHierarchyChildAccessNone == other.commitHierarchyChildAccessNone && commitHierarchyChildAccessContractIds == other.commitHierarchyChildAccessContractIds /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(commitHierarchyChildAccessAll, commitHierarchyChildAccessNone, commitHierarchyChildAccessContractIds) /* spotless:on */

        override fun toString(): String =
            when {
                commitHierarchyChildAccessAll != null ->
                    "ChildAccess{commitHierarchyChildAccessAll=$commitHierarchyChildAccessAll}"
                commitHierarchyChildAccessNone != null ->
                    "ChildAccess{commitHierarchyChildAccessNone=$commitHierarchyChildAccessNone}"
                commitHierarchyChildAccessContractIds != null ->
                    "ChildAccess{commitHierarchyChildAccessContractIds=$commitHierarchyChildAccessContractIds}"
                _json != null -> "ChildAccess{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid ChildAccess")
            }

        companion object {

            @JvmStatic
            fun ofCommitHierarchyChildAccessAll(
                commitHierarchyChildAccessAll: CommitHierarchyChildAccessAll
            ) = ChildAccess(commitHierarchyChildAccessAll = commitHierarchyChildAccessAll)

            @JvmStatic
            fun ofCommitHierarchyChildAccessNone(
                commitHierarchyChildAccessNone: CommitHierarchyChildAccessNone
            ) = ChildAccess(commitHierarchyChildAccessNone = commitHierarchyChildAccessNone)

            @JvmStatic
            fun ofCommitHierarchyChildAccessContractIds(
                commitHierarchyChildAccessContractIds: CommitHierarchyChildAccessContractIds
            ) =
                ChildAccess(
                    commitHierarchyChildAccessContractIds = commitHierarchyChildAccessContractIds
                )
        }

        /**
         * An interface that defines how to map each variant of [ChildAccess] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitCommitHierarchyChildAccessAll(
                commitHierarchyChildAccessAll: CommitHierarchyChildAccessAll
            ): T

            fun visitCommitHierarchyChildAccessNone(
                commitHierarchyChildAccessNone: CommitHierarchyChildAccessNone
            ): T

            fun visitCommitHierarchyChildAccessContractIds(
                commitHierarchyChildAccessContractIds: CommitHierarchyChildAccessContractIds
            ): T

            /**
             * Maps an unknown variant of [ChildAccess] to a value of type [T].
             *
             * An instance of [ChildAccess] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws MetronomeInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw MetronomeInvalidDataException("Unknown ChildAccess: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<ChildAccess>(ChildAccess::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): ChildAccess {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<CommitHierarchyChildAccessAll>()) {
                        it.validate()
                    }
                    ?.let {
                        return ChildAccess(commitHierarchyChildAccessAll = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<CommitHierarchyChildAccessNone>()) {
                        it.validate()
                    }
                    ?.let {
                        return ChildAccess(commitHierarchyChildAccessNone = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<CommitHierarchyChildAccessContractIds>()) {
                        it.validate()
                    }
                    ?.let {
                        return ChildAccess(commitHierarchyChildAccessContractIds = it, _json = json)
                    }

                return ChildAccess(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<ChildAccess>(ChildAccess::class) {

            override fun serialize(
                value: ChildAccess,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.commitHierarchyChildAccessAll != null ->
                        generator.writeObject(value.commitHierarchyChildAccessAll)
                    value.commitHierarchyChildAccessNone != null ->
                        generator.writeObject(value.commitHierarchyChildAccessNone)
                    value.commitHierarchyChildAccessContractIds != null ->
                        generator.writeObject(value.commitHierarchyChildAccessContractIds)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid ChildAccess")
                }
            }
        }

        @NoAutoDetect
        class CommitHierarchyChildAccessAll
        @JsonCreator
        private constructor(
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun type(): Type = type.getRequired("type")

            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): CommitHierarchyChildAccessAll = apply {
                if (validated) {
                    return@apply
                }

                type()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CommitHierarchyChildAccessAll]. */
            class Builder internal constructor() {

                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(commitHierarchyChildAccessAll: CommitHierarchyChildAccessAll) =
                    apply {
                        type = commitHierarchyChildAccessAll.type
                        additionalProperties =
                            commitHierarchyChildAccessAll.additionalProperties.toMutableMap()
                    }

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) = apply { this.type = type }

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

                fun build(): CommitHierarchyChildAccessAll =
                    CommitHierarchyChildAccessAll(
                        checkRequired("type", type),
                        additionalProperties.toImmutable(),
                    )
            }

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val ALL = of("ALL")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    ALL
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ALL,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        ALL -> Value.ALL
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws MetronomeInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        ALL -> Known.ALL
                        else -> throw MetronomeInvalidDataException("Unknown Type: $value")
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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CommitHierarchyChildAccessAll && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CommitHierarchyChildAccessAll{type=$type, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class CommitHierarchyChildAccessNone
        @JsonCreator
        private constructor(
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun type(): Type = type.getRequired("type")

            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): CommitHierarchyChildAccessNone = apply {
                if (validated) {
                    return@apply
                }

                type()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CommitHierarchyChildAccessNone]. */
            class Builder internal constructor() {

                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(commitHierarchyChildAccessNone: CommitHierarchyChildAccessNone) =
                    apply {
                        type = commitHierarchyChildAccessNone.type
                        additionalProperties =
                            commitHierarchyChildAccessNone.additionalProperties.toMutableMap()
                    }

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) = apply { this.type = type }

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

                fun build(): CommitHierarchyChildAccessNone =
                    CommitHierarchyChildAccessNone(
                        checkRequired("type", type),
                        additionalProperties.toImmutable(),
                    )
            }

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val NONE = of("NONE")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    NONE
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    NONE,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        NONE -> Value.NONE
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws MetronomeInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        NONE -> Known.NONE
                        else -> throw MetronomeInvalidDataException("Unknown Type: $value")
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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CommitHierarchyChildAccessNone && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CommitHierarchyChildAccessNone{type=$type, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class CommitHierarchyChildAccessContractIds
        @JsonCreator
        private constructor(
            @JsonProperty("contract_ids")
            @ExcludeMissing
            private val contractIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun contractIds(): List<String> = contractIds.getRequired("contract_ids")

            fun type(): Type = type.getRequired("type")

            @JsonProperty("contract_ids")
            @ExcludeMissing
            fun _contractIds(): JsonField<List<String>> = contractIds

            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): CommitHierarchyChildAccessContractIds = apply {
                if (validated) {
                    return@apply
                }

                contractIds()
                type()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CommitHierarchyChildAccessContractIds]. */
            class Builder internal constructor() {

                private var contractIds: JsonField<MutableList<String>>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    commitHierarchyChildAccessContractIds: CommitHierarchyChildAccessContractIds
                ) = apply {
                    contractIds =
                        commitHierarchyChildAccessContractIds.contractIds.map { it.toMutableList() }
                    type = commitHierarchyChildAccessContractIds.type
                    additionalProperties =
                        commitHierarchyChildAccessContractIds.additionalProperties.toMutableMap()
                }

                fun contractIds(contractIds: List<String>) = contractIds(JsonField.of(contractIds))

                fun contractIds(contractIds: JsonField<List<String>>) = apply {
                    this.contractIds = contractIds.map { it.toMutableList() }
                }

                fun addContractId(contractId: String) = apply {
                    contractIds =
                        (contractIds ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(contractId)
                        }
                }

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) = apply { this.type = type }

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

                fun build(): CommitHierarchyChildAccessContractIds =
                    CommitHierarchyChildAccessContractIds(
                        checkRequired("contractIds", contractIds).map { it.toImmutable() },
                        checkRequired("type", type),
                        additionalProperties.toImmutable(),
                    )
            }

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val CONTRACT_IDS = of("CONTRACT_IDS")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    CONTRACT_IDS
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    CONTRACT_IDS,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        CONTRACT_IDS -> Value.CONTRACT_IDS
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws MetronomeInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        CONTRACT_IDS -> Known.CONTRACT_IDS
                        else -> throw MetronomeInvalidDataException("Unknown Type: $value")
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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CommitHierarchyChildAccessContractIds && contractIds == other.contractIds && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(contractIds, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CommitHierarchyChildAccessContractIds{contractIds=$contractIds, type=$type, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CommitHierarchyConfiguration && childAccess == other.childAccess && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(childAccess, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CommitHierarchyConfiguration{childAccess=$childAccess, additionalProperties=$additionalProperties}"
}
