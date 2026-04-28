// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.services

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
import kotlin.jvm.optionals.getOrNull

class ServiceListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val services: JsonField<List<Service>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("services")
        @ExcludeMissing
        services: JsonField<List<Service>> = JsonMissing.of()
    ) : this(services, mutableMapOf())

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun services(): List<Service> = services.getRequired("services")

    /**
     * Returns the raw JSON value of [services].
     *
     * Unlike [services], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("services") @ExcludeMissing fun _services(): JsonField<List<Service>> = services

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
         * Returns a mutable builder for constructing an instance of [ServiceListResponse].
         *
         * The following fields are required:
         * ```java
         * .services()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ServiceListResponse]. */
    class Builder internal constructor() {

        private var services: JsonField<MutableList<Service>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(serviceListResponse: ServiceListResponse) = apply {
            services = serviceListResponse.services.map { it.toMutableList() }
            additionalProperties = serviceListResponse.additionalProperties.toMutableMap()
        }

        fun services(services: List<Service>) = services(JsonField.of(services))

        /**
         * Sets [Builder.services] to an arbitrary JSON value.
         *
         * You should usually call [Builder.services] with a well-typed `List<Service>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun services(services: JsonField<List<Service>>) = apply {
            this.services = services.map { it.toMutableList() }
        }

        /**
         * Adds a single [Service] to [services].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addService(service: Service) = apply {
            services =
                (services ?: JsonField.of(mutableListOf())).also {
                    checkKnown("services", it).add(service)
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
         * Returns an immutable instance of [ServiceListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .services()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ServiceListResponse =
            ServiceListResponse(
                checkRequired("services", services).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ServiceListResponse = apply {
        if (validated) {
            return@apply
        }

        services().forEach { it.validate() }
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
        (services.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Service
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val ips: JsonField<List<String>>,
        private val name: JsonField<String>,
        private val usage: JsonField<Usage>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("ips") @ExcludeMissing ips: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("usage") @ExcludeMissing usage: JsonField<Usage> = JsonMissing.of(),
        ) : this(ips, name, usage, mutableMapOf())

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun ips(): List<String> = ips.getRequired("ips")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun usage(): Usage = usage.getRequired("usage")

        /**
         * Returns the raw JSON value of [ips].
         *
         * Unlike [ips], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ips") @ExcludeMissing fun _ips(): JsonField<List<String>> = ips

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [usage].
         *
         * Unlike [usage], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("usage") @ExcludeMissing fun _usage(): JsonField<Usage> = usage

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
             * Returns a mutable builder for constructing an instance of [Service].
             *
             * The following fields are required:
             * ```java
             * .ips()
             * .name()
             * .usage()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Service]. */
        class Builder internal constructor() {

            private var ips: JsonField<MutableList<String>>? = null
            private var name: JsonField<String>? = null
            private var usage: JsonField<Usage>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(service: Service) = apply {
                ips = service.ips.map { it.toMutableList() }
                name = service.name
                usage = service.usage
                additionalProperties = service.additionalProperties.toMutableMap()
            }

            fun ips(ips: List<String>) = ips(JsonField.of(ips))

            /**
             * Sets [Builder.ips] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ips] with a well-typed `List<String>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ips(ips: JsonField<List<String>>) = apply {
                this.ips = ips.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [ips].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addIp(ip: String) = apply {
                ips = (ips ?: JsonField.of(mutableListOf())).also { checkKnown("ips", it).add(ip) }
            }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun usage(usage: Usage) = usage(JsonField.of(usage))

            /**
             * Sets [Builder.usage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.usage] with a well-typed [Usage] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun usage(usage: JsonField<Usage>) = apply { this.usage = usage }

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
             * Returns an immutable instance of [Service].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .ips()
             * .name()
             * .usage()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Service =
                Service(
                    checkRequired("ips", ips).map { it.toImmutable() },
                    checkRequired("name", name),
                    checkRequired("usage", usage),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Service = apply {
            if (validated) {
                return@apply
            }

            ips()
            name()
            usage().validate()
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
            (ips.asKnown().getOrNull()?.size ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (usage.asKnown().getOrNull()?.validity() ?: 0)

        class Usage @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val MAKES_CONNECTIONS_FROM = of("makes_connections_from")

                @JvmField val ACCEPTS_CONNECTIONS_AT = of("accepts_connections_at")

                @JvmStatic fun of(value: String) = Usage(JsonField.of(value))
            }

            /** An enum containing [Usage]'s known values. */
            enum class Known {
                MAKES_CONNECTIONS_FROM,
                ACCEPTS_CONNECTIONS_AT,
            }

            /**
             * An enum containing [Usage]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Usage] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                MAKES_CONNECTIONS_FROM,
                ACCEPTS_CONNECTIONS_AT,
                /**
                 * An enum member indicating that [Usage] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    MAKES_CONNECTIONS_FROM -> Value.MAKES_CONNECTIONS_FROM
                    ACCEPTS_CONNECTIONS_AT -> Value.ACCEPTS_CONNECTIONS_AT
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws MetronomeInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    MAKES_CONNECTIONS_FROM -> Known.MAKES_CONNECTIONS_FROM
                    ACCEPTS_CONNECTIONS_AT -> Known.ACCEPTS_CONNECTIONS_AT
                    else -> throw MetronomeInvalidDataException("Unknown Usage: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws MetronomeInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    MetronomeInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Usage = apply {
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

                return other is Usage && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Service &&
                ips == other.ips &&
                name == other.name &&
                usage == other.usage &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(ips, name, usage, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Service{ips=$ips, name=$name, usage=$usage, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ServiceListResponse &&
            services == other.services &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(services, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ServiceListResponse{services=$services, additionalProperties=$additionalProperties}"
}
