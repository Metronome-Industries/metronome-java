// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v2.notifications.offset

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
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.allMaxBy
import com.metronome.api.core.checkRequired
import com.metronome.api.core.getOrThrow
import com.metronome.api.errors.MetronomeInvalidDataException
import com.metronome.api.models.v2.notifications.LifecycleEventOffsetNotificationConfig
import com.metronome.api.models.v2.notifications.LifecycleEventSystemNotificationConfig
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class OffsetEditResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<Data>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of()
    ) : this(data, mutableMapOf())

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): Data = data.getRequired("data")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

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
         * Returns a mutable builder for constructing an instance of [OffsetEditResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OffsetEditResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(offsetEditResponse: OffsetEditResponse) = apply {
            data = offsetEditResponse.data
            additionalProperties = offsetEditResponse.additionalProperties.toMutableMap()
        }

        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

        /**
         * Alias for calling [data] with
         * `Data.ofLifecycleEventSystemNotificationConfig(lifecycleEventSystemNotificationConfig)`.
         */
        fun data(lifecycleEventSystemNotificationConfig: LifecycleEventSystemNotificationConfig) =
            data(
                Data.ofLifecycleEventSystemNotificationConfig(
                    lifecycleEventSystemNotificationConfig
                )
            )

        /**
         * Alias for calling [data] with
         * `Data.ofLifecycleEventOffsetNotificationConfig(lifecycleEventOffsetNotificationConfig)`.
         */
        fun data(lifecycleEventOffsetNotificationConfig: LifecycleEventOffsetNotificationConfig) =
            data(
                Data.ofLifecycleEventOffsetNotificationConfig(
                    lifecycleEventOffsetNotificationConfig
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

        /**
         * Returns an immutable instance of [OffsetEditResponse].
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
        fun build(): OffsetEditResponse =
            OffsetEditResponse(checkRequired("data", data), additionalProperties.toMutableMap())
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
    fun validate(): OffsetEditResponse = apply {
        if (validated) {
            return@apply
        }

        data().validate()
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
    @JvmSynthetic internal fun validity(): Int = (data.asKnown().getOrNull()?.validity() ?: 0)

    @JsonDeserialize(using = Data.Deserializer::class)
    @JsonSerialize(using = Data.Serializer::class)
    class Data
    private constructor(
        private val lifecycleEventSystemNotificationConfig:
            LifecycleEventSystemNotificationConfig? =
            null,
        private val lifecycleEventOffsetNotificationConfig:
            LifecycleEventOffsetNotificationConfig? =
            null,
        private val _json: JsonValue? = null,
    ) {

        fun lifecycleEventSystemNotificationConfig():
            Optional<LifecycleEventSystemNotificationConfig> =
            Optional.ofNullable(lifecycleEventSystemNotificationConfig)

        fun lifecycleEventOffsetNotificationConfig():
            Optional<LifecycleEventOffsetNotificationConfig> =
            Optional.ofNullable(lifecycleEventOffsetNotificationConfig)

        fun isLifecycleEventSystemNotificationConfig(): Boolean =
            lifecycleEventSystemNotificationConfig != null

        fun isLifecycleEventOffsetNotificationConfig(): Boolean =
            lifecycleEventOffsetNotificationConfig != null

        fun asLifecycleEventSystemNotificationConfig(): LifecycleEventSystemNotificationConfig =
            lifecycleEventSystemNotificationConfig.getOrThrow(
                "lifecycleEventSystemNotificationConfig"
            )

        fun asLifecycleEventOffsetNotificationConfig(): LifecycleEventOffsetNotificationConfig =
            lifecycleEventOffsetNotificationConfig.getOrThrow(
                "lifecycleEventOffsetNotificationConfig"
            )

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         *
         * Note that this method is _not_ forwards compatible with new variants from the API, unless
         * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of
         * the SDK gracefully, consider overriding [Visitor.unknown]:
         * ```java
         * import com.metronome.api.core.JsonValue;
         * import java.util.Optional;
         *
         * Optional<String> result = data.accept(new Data.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitLifecycleEventSystemNotificationConfig(LifecycleEventSystemNotificationConfig lifecycleEventSystemNotificationConfig) {
         *         return Optional.of(lifecycleEventSystemNotificationConfig.toString());
         *     }
         *
         *     // ...
         *
         *     @Override
         *     public Optional<String> unknown(JsonValue json) {
         *         // Or inspect the `json`.
         *         return Optional.empty();
         *     }
         * });
         * ```
         *
         * @throws MetronomeInvalidDataException if [Visitor.unknown] is not overridden in [visitor]
         *   and the current variant is unknown.
         */
        fun <T> accept(visitor: Visitor<T>): T =
            when {
                lifecycleEventSystemNotificationConfig != null ->
                    visitor.visitLifecycleEventSystemNotificationConfig(
                        lifecycleEventSystemNotificationConfig
                    )
                lifecycleEventOffsetNotificationConfig != null ->
                    visitor.visitLifecycleEventOffsetNotificationConfig(
                        lifecycleEventOffsetNotificationConfig
                    )
                else -> visitor.unknown(_json)
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
        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitLifecycleEventSystemNotificationConfig(
                        lifecycleEventSystemNotificationConfig:
                            LifecycleEventSystemNotificationConfig
                    ) {
                        lifecycleEventSystemNotificationConfig.validate()
                    }

                    override fun visitLifecycleEventOffsetNotificationConfig(
                        lifecycleEventOffsetNotificationConfig:
                            LifecycleEventOffsetNotificationConfig
                    ) {
                        lifecycleEventOffsetNotificationConfig.validate()
                    }
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitLifecycleEventSystemNotificationConfig(
                        lifecycleEventSystemNotificationConfig:
                            LifecycleEventSystemNotificationConfig
                    ) = lifecycleEventSystemNotificationConfig.validity()

                    override fun visitLifecycleEventOffsetNotificationConfig(
                        lifecycleEventOffsetNotificationConfig:
                            LifecycleEventOffsetNotificationConfig
                    ) = lifecycleEventOffsetNotificationConfig.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                lifecycleEventSystemNotificationConfig ==
                    other.lifecycleEventSystemNotificationConfig &&
                lifecycleEventOffsetNotificationConfig ==
                    other.lifecycleEventOffsetNotificationConfig
        }

        override fun hashCode(): Int =
            Objects.hash(
                lifecycleEventSystemNotificationConfig,
                lifecycleEventOffsetNotificationConfig,
            )

        override fun toString(): String =
            when {
                lifecycleEventSystemNotificationConfig != null ->
                    "Data{lifecycleEventSystemNotificationConfig=$lifecycleEventSystemNotificationConfig}"
                lifecycleEventOffsetNotificationConfig != null ->
                    "Data{lifecycleEventOffsetNotificationConfig=$lifecycleEventOffsetNotificationConfig}"
                _json != null -> "Data{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Data")
            }

        companion object {

            @JvmStatic
            fun ofLifecycleEventSystemNotificationConfig(
                lifecycleEventSystemNotificationConfig: LifecycleEventSystemNotificationConfig
            ) =
                Data(
                    lifecycleEventSystemNotificationConfig = lifecycleEventSystemNotificationConfig
                )

            @JvmStatic
            fun ofLifecycleEventOffsetNotificationConfig(
                lifecycleEventOffsetNotificationConfig: LifecycleEventOffsetNotificationConfig
            ) =
                Data(
                    lifecycleEventOffsetNotificationConfig = lifecycleEventOffsetNotificationConfig
                )
        }

        /** An interface that defines how to map each variant of [Data] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitLifecycleEventSystemNotificationConfig(
                lifecycleEventSystemNotificationConfig: LifecycleEventSystemNotificationConfig
            ): T

            fun visitLifecycleEventOffsetNotificationConfig(
                lifecycleEventOffsetNotificationConfig: LifecycleEventOffsetNotificationConfig
            ): T

            /**
             * Maps an unknown variant of [Data] to a value of type [T].
             *
             * An instance of [Data] can contain an unknown variant if it was deserialized from data
             * that doesn't match any known variant. For example, if the SDK is on an older version
             * than the API, then the API may respond with new variants that the SDK is unaware of.
             *
             * @throws MetronomeInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw MetronomeInvalidDataException("Unknown Data: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Data>(Data::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Data {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<LifecycleEventSystemNotificationConfig>(),
                                )
                                ?.let {
                                    Data(lifecycleEventSystemNotificationConfig = it, _json = json)
                                },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<LifecycleEventOffsetNotificationConfig>(),
                                )
                                ?.let {
                                    Data(lifecycleEventOffsetNotificationConfig = it, _json = json)
                                },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Data(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Data>(Data::class) {

            override fun serialize(
                value: Data,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.lifecycleEventSystemNotificationConfig != null ->
                        generator.writeObject(value.lifecycleEventSystemNotificationConfig)
                    value.lifecycleEventOffsetNotificationConfig != null ->
                        generator.writeObject(value.lifecycleEventOffsetNotificationConfig)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Data")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OffsetEditResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OffsetEditResponse{data=$data, additionalProperties=$additionalProperties}"
}
