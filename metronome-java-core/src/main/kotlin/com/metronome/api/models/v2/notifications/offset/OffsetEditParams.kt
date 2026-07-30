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
import com.metronome.api.core.Params
import com.metronome.api.core.allMaxBy
import com.metronome.api.core.checkRequired
import com.metronome.api.core.getOrThrow
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.errors.MetronomeInvalidDataException
import com.metronome.api.models.v2.notifications.offset.OffsetEditParams
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Edit an existing offset lifecycle event notification configuration. */
class OffsetEditParams private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,

) : Params {

    /**
     * Updated policy configuration. The policy.type must match the existing lifecycle event type.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun policy(): Policy = body.policy()

    /**
     * The ID of the notification configuration to edit. Not provided when updating the configuration for system events
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun id(): Optional<String> = body.id()

    /**
     * Set to true to enable webhook messages for the notification indicated in the policy, false to disable.
     * Only supported by system lifecycle events.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun isEnabled(): Optional<Boolean> = body.isEnabled()

    /**
     * Returns the raw JSON value of [policy].
     *
     * Unlike [policy], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _policy(): JsonField<Policy> = body._policy()

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _id(): JsonField<String> = body._id()

    /**
     * Returns the raw JSON value of [isEnabled].
     *
     * Unlike [isEnabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _isEnabled(): JsonField<Boolean> = body._isEnabled()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OffsetEditParams].
         *
         * The following fields are required:
         *
         * ```java
         * .policy()
         * ```
         */
        @JvmStatic
        fun builder() = Builder()
    }

    /** A builder for [OffsetEditParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(offsetEditParams: OffsetEditParams) =
            apply {
                body = offsetEditParams.body.toBuilder()
                additionalHeaders = offsetEditParams.additionalHeaders.toBuilder()
                additionalQueryParams = offsetEditParams.additionalQueryParams.toBuilder()
            }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately. Otherwise,
         * it's more convenient to use the top-level setters instead:
         * - [policy]
         * - [id]
         * - [isEnabled]
         */
        fun body(body: Body) =
            apply {
                this.body = body.toBuilder()
            }

        /** Updated policy configuration. The policy.type must match the existing lifecycle event type. */
        fun policy(policy: Policy) =
            apply {
                body.policy(policy)
            }

        /**
         * Sets [Builder.policy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.policy] with a well-typed [Policy] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun policy(policy: JsonField<Policy>) =
            apply {
                body.policy(policy)
            }

        /** Alias for calling [policy] with `Policy.ofLifecycleEventOffset(lifecycleEventOffset)`. */
        fun policy(lifecycleEventOffset: Policy.LifecycleEventOffsetPolicy) =
            apply {
                body.policy(lifecycleEventOffset)
            }

        /** Alias for calling [policy] with `Policy.ofLifecycleEventSystem(lifecycleEventSystem)`. */
        fun policy(lifecycleEventSystem: Policy.LifecycleEventSystemPolicy) =
            apply {
                body.policy(lifecycleEventSystem)
            }

        /**
         * The ID of the notification configuration to edit. Not provided when updating the configuration for system events
         *
         */
        fun id(id: String) =
            apply {
                body.id(id)
            }

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun id(id: JsonField<String>) =
            apply {
                body.id(id)
            }

        /**
         * Set to true to enable webhook messages for the notification indicated in the policy, false to disable.
         * Only supported by system lifecycle events.
         *
         */
        fun isEnabled(isEnabled: Boolean) =
            apply {
                body.isEnabled(isEnabled)
            }

        /**
         * Sets [Builder.isEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isEnabled] with a well-typed [Boolean] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isEnabled(isEnabled: JsonField<Boolean>) =
            apply {
                body.isEnabled(isEnabled)
            }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.additionalProperties(additionalBodyProperties)
            }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) =
            apply {
                body.putAdditionalProperty(
                  key, value
                )
            }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) =
            apply {
                body.removeAdditionalProperty(key)
            }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) =
            apply {
                body.removeAllAdditionalProperties(keys)
            }

        fun additionalHeaders(additionalHeaders: Headers) =
            apply {
                this.additionalHeaders.clear()
                putAllAdditionalHeaders(additionalHeaders)
            }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply {
                this.additionalHeaders.clear()
                putAllAdditionalHeaders(additionalHeaders)
            }

        fun putAdditionalHeader(name: String, value: String) =
            apply {
                additionalHeaders.put(name, value)
            }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) =
            apply {
                additionalHeaders.put(name, values)
            }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) =
            apply {
                this.additionalHeaders.putAll(additionalHeaders)
            }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply {
                this.additionalHeaders.putAll(additionalHeaders)
            }

        fun replaceAdditionalHeaders(name: String, value: String) =
            apply {
                additionalHeaders.replace(name, value)
            }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) =
            apply {
                additionalHeaders.replace(name, values)
            }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) =
            apply {
                this.additionalHeaders.replaceAll(additionalHeaders)
            }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply {
                this.additionalHeaders.replaceAll(additionalHeaders)
            }

        fun removeAdditionalHeaders(name: String) =
            apply {
                additionalHeaders.remove(name)
            }

        fun removeAllAdditionalHeaders(names: Set<String>) =
            apply {
                additionalHeaders.removeAll(names)
            }

        fun additionalQueryParams(additionalQueryParams: QueryParams) =
            apply {
                this.additionalQueryParams.clear()
                putAllAdditionalQueryParams(additionalQueryParams)
            }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.clear()
                putAllAdditionalQueryParams(additionalQueryParams)
            }

        fun putAdditionalQueryParam(key: String, value: String) =
            apply {
                additionalQueryParams.put(key, value)
            }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) =
            apply {
                additionalQueryParams.put(key, values)
            }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) =
            apply {
                additionalQueryParams.replace(key, value)
            }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) =
            apply {
                additionalQueryParams.replace(key, values)
            }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) =
            apply {
                additionalQueryParams.remove(key)
            }

        fun removeAllAdditionalQueryParams(keys: Set<String>) =
            apply {
                additionalQueryParams.removeAll(keys)
            }

        /**
         * Returns an immutable instance of [OffsetEditParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         *
         * ```java
         * .policy()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OffsetEditParams =
            OffsetEditParams(
              body.build(),
              additionalHeaders.build(),
              additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body @JsonCreator(mode = JsonCreator.Mode.DISABLED) private constructor(
        private val policy: JsonField<Policy>,
        private val id: JsonField<String>,
        private val isEnabled: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,

    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("policy") @ExcludeMissing policy: JsonField<Policy> = JsonMissing.of(),
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("is_enabled") @ExcludeMissing isEnabled: JsonField<Boolean> = JsonMissing.of()
        ) : this(
          policy,
          id,
          isEnabled,
          mutableMapOf(),
        )

        /**
         * Updated policy configuration. The policy.type must match the existing lifecycle event type.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun policy(): Policy = policy.getRequired("policy")

        /**
         * The ID of the notification configuration to edit. Not provided when updating the configuration for system events
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * Set to true to enable webhook messages for the notification indicated in the policy, false to disable.
         * Only supported by system lifecycle events.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun isEnabled(): Optional<Boolean> = isEnabled.getOptional("is_enabled")

        /**
         * Returns the raw JSON value of [policy].
         *
         * Unlike [policy], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("policy")
        @ExcludeMissing
        fun _policy(): JsonField<Policy> = policy

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id")
        @ExcludeMissing
        fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [isEnabled].
         *
         * Unlike [isEnabled], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("is_enabled")
        @ExcludeMissing
        fun _isEnabled(): JsonField<Boolean> = isEnabled

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
          additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             *
             * ```java
             * .policy()
             * ```
             */
            @JvmStatic
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var policy: JsonField<Policy>? = null
            private var id: JsonField<String> = JsonMissing.of()
            private var isEnabled: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) =
                apply {
                    policy = body.policy
                    id = body.id
                    isEnabled = body.isEnabled
                    additionalProperties = body.additionalProperties.toMutableMap()
                }

            /** Updated policy configuration. The policy.type must match the existing lifecycle event type. */
            fun policy(policy: Policy) = policy(JsonField.of(policy))

            /**
             * Sets [Builder.policy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.policy] with a well-typed [Policy] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun policy(policy: JsonField<Policy>) =
                apply {
                    this.policy = policy
                }

            /** Alias for calling [policy] with `Policy.ofLifecycleEventOffset(lifecycleEventOffset)`. */
            fun policy(lifecycleEventOffset: Policy.LifecycleEventOffsetPolicy) = policy(Policy.ofLifecycleEventOffset(lifecycleEventOffset))

            /** Alias for calling [policy] with `Policy.ofLifecycleEventSystem(lifecycleEventSystem)`. */
            fun policy(lifecycleEventSystem: Policy.LifecycleEventSystemPolicy) = policy(Policy.ofLifecycleEventSystem(lifecycleEventSystem))

            /**
             * The ID of the notification configuration to edit. Not provided when updating the configuration for system events
             *
             */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun id(id: JsonField<String>) =
                apply {
                    this.id = id
                }

            /**
             * Set to true to enable webhook messages for the notification indicated in the policy, false to disable.
             * Only supported by system lifecycle events.
             *
             */
            fun isEnabled(isEnabled: Boolean) = isEnabled(JsonField.of(isEnabled))

            /**
             * Sets [Builder.isEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isEnabled] with a well-typed [Boolean] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isEnabled(isEnabled: JsonField<Boolean>) =
                apply {
                    this.isEnabled = isEnabled
                }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

            fun putAdditionalProperty(key: String, value: JsonValue) =
                apply {
                    additionalProperties.put(key, value)
                }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun removeAdditionalProperty(key: String) =
                apply {
                    additionalProperties.remove(key)
                }

            fun removeAllAdditionalProperties(keys: Set<String>) =
                apply {
                    keys.forEach(::removeAdditionalProperty)
                }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             *
             * ```java
             * .policy()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                  checkRequired(
                    "policy", policy
                  ),
                  id,
                  isEnabled,
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
        fun validate(): Body =
            apply {
                if (validated) {
                  return@apply
                }

                policy().validate()
                id()
                isEnabled()
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
        internal fun validity(): Int = (policy.asKnown().getOrNull()?.validity() ?: 0) + (if (id.asKnown().isPresent) 1 else 0) + (if (isEnabled.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Body && policy == other.policy && id == other.id && isEnabled == other.isEnabled && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(policy, id, isEnabled, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Body{policy=$policy, id=$id, isEnabled=$isEnabled, additionalProperties=$additionalProperties}"
    }

    /** Updated policy configuration. The policy.type must match the existing lifecycle event type. */
    @JsonDeserialize(using = Policy.Deserializer::class)
    @JsonSerialize(using = Policy.Serializer::class)
    class Policy private constructor(
        private val lifecycleEventOffset: LifecycleEventOffsetPolicy? = null,
        private val lifecycleEventSystem: LifecycleEventSystemPolicy? = null,
        private val _json: JsonValue? = null,

    ) {

        fun lifecycleEventOffset(): Optional<LifecycleEventOffsetPolicy> = Optional.ofNullable(lifecycleEventOffset)

        fun lifecycleEventSystem(): Optional<LifecycleEventSystemPolicy> = Optional.ofNullable(lifecycleEventSystem)

        fun isLifecycleEventOffset(): Boolean = lifecycleEventOffset != null

        fun isLifecycleEventSystem(): Boolean = lifecycleEventSystem != null

        fun asLifecycleEventOffset(): LifecycleEventOffsetPolicy = lifecycleEventOffset.getOrThrow("lifecycleEventOffset")

        fun asLifecycleEventSystem(): LifecycleEventSystemPolicy = lifecycleEventSystem.getOrThrow("lifecycleEventSystem")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         *
         * Note that this method is _not_ forwards compatible with new variants from the API, unless
         * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of the SDK
         * gracefully, consider overriding [Visitor.unknown]:
         *
         * ```java
         * import com.metronome.api.core.JsonValue;
         * import java.util.Optional;
         *
         * Optional<String> result = policy.accept(new Policy.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitLifecycleEventOffset(LifecycleEventOffsetPolicy lifecycleEventOffset) {
         *         return Optional.of(lifecycleEventOffset.toString());
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
         * @throws MetronomeInvalidDataException if [Visitor.unknown] is not overridden in
         *   [visitor] and the current variant is unknown.
         */
        fun <T> accept(visitor: Visitor<T>): T =
            when {
                lifecycleEventOffset != null -> visitor.visitLifecycleEventOffset(lifecycleEventOffset)
                lifecycleEventSystem != null -> visitor.visitLifecycleEventSystem(lifecycleEventSystem)
                else -> visitor.unknown(_json)
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
        fun validate(): Policy =
            apply {
                if (validated) {
                  return@apply
                }

                accept(object : Visitor<Unit> {
                    override fun visitLifecycleEventOffset(lifecycleEventOffset: LifecycleEventOffsetPolicy) {
                      lifecycleEventOffset.validate()
                    }

                    override fun visitLifecycleEventSystem(lifecycleEventSystem: LifecycleEventSystemPolicy) {
                      lifecycleEventSystem.validate()
                    }
                })
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
            accept(object : Visitor<Int> {
                override fun visitLifecycleEventOffset(lifecycleEventOffset: LifecycleEventOffsetPolicy) = lifecycleEventOffset.validity()

                override fun visitLifecycleEventSystem(lifecycleEventSystem: LifecycleEventSystemPolicy) = lifecycleEventSystem.validity()

                override fun unknown(json: JsonValue?) = 0
            })

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Policy && lifecycleEventOffset == other.lifecycleEventOffset && lifecycleEventSystem == other.lifecycleEventSystem
        }

        override fun hashCode(): Int = Objects.hash(lifecycleEventOffset, lifecycleEventSystem)

        override fun toString(): String =
            when {
                lifecycleEventOffset != null -> "Policy{lifecycleEventOffset=$lifecycleEventOffset}"
                lifecycleEventSystem != null -> "Policy{lifecycleEventSystem=$lifecycleEventSystem}"
                _json != null -> "Policy{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Policy")
            }

        companion object {

            @JvmStatic
            fun ofLifecycleEventOffset(lifecycleEventOffset: LifecycleEventOffsetPolicy) = Policy(lifecycleEventOffset = lifecycleEventOffset)

            @JvmStatic
            fun ofLifecycleEventSystem(lifecycleEventSystem: LifecycleEventSystemPolicy) = Policy(lifecycleEventSystem = lifecycleEventSystem)
        }

        /** An interface that defines how to map each variant of [Policy] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitLifecycleEventOffset(lifecycleEventOffset: LifecycleEventOffsetPolicy): T

            fun visitLifecycleEventSystem(lifecycleEventSystem: LifecycleEventSystemPolicy): T

            /**
             * Maps an unknown variant of [Policy] to a value of type [T].
             *
             * An instance of [Policy] can contain an unknown variant if it was deserialized from data
             * that doesn't match any known variant. For example, if the SDK is on an older version than the
             * API, then the API may respond with new variants that the SDK is unaware of.
             *
             * @throws MetronomeInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
              throw MetronomeInvalidDataException("Unknown Policy: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Policy>(Policy::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Policy {
              val json = JsonValue.fromJsonNode(node)

              val bestMatches = sequenceOf(
                      tryDeserialize(node, jacksonTypeRef<LifecycleEventOffsetPolicy>())
                          ?.let {
                              Policy(lifecycleEventOffset = it, _json = json)
                          },
                      tryDeserialize(node, jacksonTypeRef<LifecycleEventSystemPolicy>())
                          ?.let {
                              Policy(lifecycleEventSystem = it, _json = json)
                          }
                  )
                  .filterNotNull()
                  .allMaxBy { it.validity() }
                  .toList()
              return when (bestMatches.size) {
                  // This can happen if what we're deserializing is completely incompatible with all the possible variants (e.g. deserializing from boolean).
                  0 -> Policy(_json = json)
                  1 -> bestMatches.single()
                  // If there's more than one match with the highest validity, then use the first completely valid match, or simply the first match if none are completely valid.
                  else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
              }
            }
        }

        internal class Serializer : BaseSerializer<Policy>(Policy::class) {

            override fun serialize(value: Policy, generator: JsonGenerator, provider: SerializerProvider) {
              when {
                  value.lifecycleEventOffset != null -> generator.writeObject(value.lifecycleEventOffset)
                  value.lifecycleEventSystem != null -> generator.writeObject(value.lifecycleEventSystem)
                  value._json != null -> generator.writeObject(value._json)
                  else -> throw IllegalStateException("Invalid Policy")
              }
            }
        }

        class LifecycleEventOffsetPolicy @JsonCreator(mode = JsonCreator.Mode.DISABLED) private constructor(
            private val offset: JsonField<String>,
            private val type: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,

        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("offset") @ExcludeMissing offset: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of()
            ) : this(
              offset,
              type,
              mutableMapOf(),
            )

            /**
             * ISO-8601 duration string indicating how much time before or after the base event this notification should be sent. Positive values indicate notifications after the event, negative values indicate notifications before the event. Examples: "P1D" (1 day after), "-PT2H" (2 hours before)
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
             */
            fun offset(): String = offset.getRequired("offset")

            /**
             * The type of lifecycle event that this offset is based on.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
             */
            fun type(): String = type.getRequired("type")

            /**
             * Returns the raw JSON value of [offset].
             *
             * Unlike [offset], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("offset")
            @ExcludeMissing
            fun _offset(): JsonField<String> = offset

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type")
            @ExcludeMissing
            fun _type(): JsonField<String> = type

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
              additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [LifecycleEventOffsetPolicy].
                 *
                 * The following fields are required:
                 *
                 * ```java
                 * .offset()
                 * .type()
                 * ```
                 */
                @JvmStatic
                fun builder() = Builder()
            }

            /** A builder for [LifecycleEventOffsetPolicy]. */
            class Builder internal constructor() {

                private var offset: JsonField<String>? = null
                private var type: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(lifecycleEventOffsetPolicy: LifecycleEventOffsetPolicy) =
                    apply {
                        offset = lifecycleEventOffsetPolicy.offset
                        type = lifecycleEventOffsetPolicy.type
                        additionalProperties = lifecycleEventOffsetPolicy.additionalProperties.toMutableMap()
                    }

                /**
                 * ISO-8601 duration string indicating how much time before or after the base event this notification should be sent. Positive values indicate notifications after the event, negative values indicate notifications before the event. Examples: "P1D" (1 day after), "-PT2H" (2 hours before)
                 *
                 */
                fun offset(offset: String) = offset(JsonField.of(offset))

                /**
                 * Sets [Builder.offset] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.offset] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun offset(offset: JsonField<String>) =
                    apply {
                        this.offset = offset
                    }

                /**
                 * The type of lifecycle event that this offset is based on.
                 *
                 */
                fun type(type: String) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<String>) =
                    apply {
                        this.type = type
                    }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                fun putAdditionalProperty(key: String, value: JsonValue) =
                    apply {
                        additionalProperties.put(key, value)
                    }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) =
                    apply {
                        additionalProperties.remove(key)
                    }

                fun removeAllAdditionalProperties(keys: Set<String>) =
                    apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                /**
                 * Returns an immutable instance of [LifecycleEventOffsetPolicy].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 *
                 * ```java
                 * .offset()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): LifecycleEventOffsetPolicy =
                    LifecycleEventOffsetPolicy(
                      checkRequired(
                        "offset", offset
                      ),
                      checkRequired(
                        "type", type
                      ),
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
            fun validate(): LifecycleEventOffsetPolicy =
                apply {
                    if (validated) {
                      return@apply
                    }

                    offset()
                    type()
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
            internal fun validity(): Int = (if (offset.asKnown().isPresent) 1 else 0) + (if (type.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return other is LifecycleEventOffsetPolicy && offset == other.offset && type == other.type && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(offset, type, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "LifecycleEventOffsetPolicy{offset=$offset, type=$type, additionalProperties=$additionalProperties}"
        }

        class LifecycleEventSystemPolicy @JsonCreator(mode = JsonCreator.Mode.DISABLED) private constructor(
            private val type: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,

        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of()
            ) : this(
              type, mutableMapOf()
            )

            /**
             * The type of lifecycle event (e.g., "contract.create", "contract.start")
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
             */
            fun type(): String = type.getRequired("type")

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type")
            @ExcludeMissing
            fun _type(): JsonField<String> = type

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
              additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [LifecycleEventSystemPolicy].
                 *
                 * The following fields are required:
                 *
                 * ```java
                 * .type()
                 * ```
                 */
                @JvmStatic
                fun builder() = Builder()
            }

            /** A builder for [LifecycleEventSystemPolicy]. */
            class Builder internal constructor() {

                private var type: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(lifecycleEventSystemPolicy: LifecycleEventSystemPolicy) =
                    apply {
                        type = lifecycleEventSystemPolicy.type
                        additionalProperties = lifecycleEventSystemPolicy.additionalProperties.toMutableMap()
                    }

                /** The type of lifecycle event (e.g., "contract.create", "contract.start") */
                fun type(type: String) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<String>) =
                    apply {
                        this.type = type
                    }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                fun putAdditionalProperty(key: String, value: JsonValue) =
                    apply {
                        additionalProperties.put(key, value)
                    }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) =
                    apply {
                        additionalProperties.remove(key)
                    }

                fun removeAllAdditionalProperties(keys: Set<String>) =
                    apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                /**
                 * Returns an immutable instance of [LifecycleEventSystemPolicy].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 *
                 * ```java
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): LifecycleEventSystemPolicy =
                    LifecycleEventSystemPolicy(
                      checkRequired(
                        "type", type
                      ), additionalProperties.toMutableMap()
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
            fun validate(): LifecycleEventSystemPolicy =
                apply {
                    if (validated) {
                      return@apply
                    }

                    type()
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
            internal fun validity(): Int = (if (type.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return other is LifecycleEventSystemPolicy && type == other.type && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(type, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "LifecycleEventSystemPolicy{type=$type, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is OffsetEditParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() = "OffsetEditParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
