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
class ServiceListResponse
@JsonCreator
private constructor(
    @JsonProperty("services")
    @ExcludeMissing
    private val services: JsonField<List<Service>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun services(): List<Service> = services.getRequired("services")

    @JsonProperty("services") @ExcludeMissing fun _services(): JsonField<List<Service>> = services

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ServiceListResponse = apply {
        if (validated) {
            return@apply
        }

        services().forEach { it.validate() }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

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

        fun services(services: JsonField<List<Service>>) = apply {
            this.services = services.map { it.toMutableList() }
        }

        fun addService(service: Service) = apply {
            services =
                (services ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(service)
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

        fun build(): ServiceListResponse =
            ServiceListResponse(
                checkRequired("services", services).map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Service
    @JsonCreator
    private constructor(
        @JsonProperty("ips")
        @ExcludeMissing
        private val ips: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("usage")
        @ExcludeMissing
        private val usage: JsonField<Usage> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun ips(): List<String> = ips.getRequired("ips")

        fun name(): String = name.getRequired("name")

        fun usage(): Usage = usage.getRequired("usage")

        @JsonProperty("ips") @ExcludeMissing fun _ips(): JsonField<List<String>> = ips

        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        @JsonProperty("usage") @ExcludeMissing fun _usage(): JsonField<Usage> = usage

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Service = apply {
            if (validated) {
                return@apply
            }

            ips()
            name()
            usage()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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

            fun ips(ips: JsonField<List<String>>) = apply {
                this.ips = ips.map { it.toMutableList() }
            }

            fun addIp(ip: String) = apply {
                ips =
                    (ips ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(ip)
                    }
            }

            fun name(name: String) = name(JsonField.of(name))

            fun name(name: JsonField<String>) = apply { this.name = name }

            fun usage(usage: Usage) = usage(JsonField.of(usage))

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

            fun build(): Service =
                Service(
                    checkRequired("ips", ips).map { it.toImmutable() },
                    checkRequired("name", name),
                    checkRequired("usage", usage),
                    additionalProperties.toImmutable(),
                )
        }

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Usage && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Service && ips == other.ips && name == other.name && usage == other.usage && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(ips, name, usage, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Service{ips=$ips, name=$name, usage=$usage, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ServiceListResponse && services == other.services && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(services, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ServiceListResponse{services=$services, additionalProperties=$additionalProperties}"
}
