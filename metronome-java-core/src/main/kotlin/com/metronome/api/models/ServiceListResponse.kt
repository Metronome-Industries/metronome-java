// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.metronome.api.core.Enum
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.util.Objects

@JsonDeserialize(builder = ServiceListResponse.Builder::class)
@NoAutoDetect
class ServiceListResponse
private constructor(
    private val services: JsonField<List<Service>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    fun services(): List<Service> = services.getRequired("services")

    @JsonProperty("services") @ExcludeMissing fun _services() = services

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ServiceListResponse = apply {
        if (!validated) {
            services().forEach { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var services: JsonField<List<Service>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(serviceListResponse: ServiceListResponse) = apply {
            services = serviceListResponse.services
            additionalProperties = serviceListResponse.additionalProperties.toMutableMap()
        }

        fun services(services: List<Service>) = services(JsonField.of(services))

        @JsonProperty("services")
        @ExcludeMissing
        fun services(services: JsonField<List<Service>>) = apply { this.services = services }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        @JsonAnySetter
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
                services.map { it.toImmutable() },
                additionalProperties.toImmutable()
            )
    }

    @JsonDeserialize(builder = Service.Builder::class)
    @NoAutoDetect
    class Service
    private constructor(
        private val name: JsonField<String>,
        private val usage: JsonField<Usage>,
        private val ips: JsonField<List<String>>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        fun name(): String = name.getRequired("name")

        fun usage(): Usage = usage.getRequired("usage")

        fun ips(): List<String> = ips.getRequired("ips")

        @JsonProperty("name") @ExcludeMissing fun _name() = name

        @JsonProperty("usage") @ExcludeMissing fun _usage() = usage

        @JsonProperty("ips") @ExcludeMissing fun _ips() = ips

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Service = apply {
            if (!validated) {
                name()
                usage()
                ips()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var name: JsonField<String> = JsonMissing.of()
            private var usage: JsonField<Usage> = JsonMissing.of()
            private var ips: JsonField<List<String>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(service: Service) = apply {
                name = service.name
                usage = service.usage
                ips = service.ips
                additionalProperties = service.additionalProperties.toMutableMap()
            }

            fun name(name: String) = name(JsonField.of(name))

            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun usage(usage: Usage) = usage(JsonField.of(usage))

            @JsonProperty("usage")
            @ExcludeMissing
            fun usage(usage: JsonField<Usage>) = apply { this.usage = usage }

            fun ips(ips: List<String>) = ips(JsonField.of(ips))

            @JsonProperty("ips")
            @ExcludeMissing
            fun ips(ips: JsonField<List<String>>) = apply { this.ips = ips }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            @JsonAnySetter
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
                    name,
                    usage,
                    ips.map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        class Usage
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val MAKES_CONNECTIONS_FROM = of("makes_connections_from")

                @JvmField val ACCEPTS_CONNECTIONS_AT = of("accepts_connections_at")

                @JvmStatic fun of(value: String) = Usage(JsonField.of(value))
            }

            enum class Known {
                MAKES_CONNECTIONS_FROM,
                ACCEPTS_CONNECTIONS_AT,
            }

            enum class Value {
                MAKES_CONNECTIONS_FROM,
                ACCEPTS_CONNECTIONS_AT,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    MAKES_CONNECTIONS_FROM -> Value.MAKES_CONNECTIONS_FROM
                    ACCEPTS_CONNECTIONS_AT -> Value.ACCEPTS_CONNECTIONS_AT
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    MAKES_CONNECTIONS_FROM -> Known.MAKES_CONNECTIONS_FROM
                    ACCEPTS_CONNECTIONS_AT -> Known.ACCEPTS_CONNECTIONS_AT
                    else -> throw MetronomeInvalidDataException("Unknown Usage: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

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

            return /* spotless:off */ other is Service && name == other.name && usage == other.usage && ips == other.ips && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(name, usage, ips, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Service{name=$name, usage=$usage, ips=$ips, additionalProperties=$additionalProperties}"
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
