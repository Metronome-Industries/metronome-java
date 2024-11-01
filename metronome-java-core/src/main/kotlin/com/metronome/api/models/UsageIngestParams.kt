// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.toImmutable
import com.metronome.api.models.*
import java.util.Objects

class UsageIngestParams
constructor(
    private val usage: List<Usage>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun usage(): List<Usage> = usage

    @JvmSynthetic
    internal fun getBody(): List<Usage> {
        return usage
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = UsageIngestBody.Builder::class)
    @NoAutoDetect
    class UsageIngestBody
    internal constructor(
        private val usage: List<Usage>?,
    ) {

        @JsonProperty("usage") fun usage(): List<Usage>? = usage

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var usage: List<Usage>? = null

            @JvmSynthetic
            internal fun from(usageIngestBody: UsageIngestBody) = apply {
                this.usage = usageIngestBody.usage
            }

            @JsonProperty("usage") fun usage(usage: List<Usage>) = apply { this.usage = usage }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is UsageIngestBody && this.usage == other.usage /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(usage) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() = "UsageIngestBody{usage=$usage}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is UsageIngestParams && this.usage == other.usage && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(usage, additionalQueryParams, additionalHeaders) /* spotless:on */
    }

    override fun toString() =
        "UsageIngestParams{usage=$usage, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var usage: MutableList<Usage> = mutableListOf()
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        @JvmSynthetic
        internal fun from(usageIngestParams: UsageIngestParams) = apply {
            this.usage(usageIngestParams.usage)
            additionalQueryParams(usageIngestParams.additionalQueryParams)
            additionalHeaders(usageIngestParams.additionalHeaders)
        }

        fun usage(usage: List<Usage>) = apply {
            this.usage.clear()
            this.usage.addAll(usage)
        }

        fun addUsage(usage: Usage) = apply { this.usage.add(usage) }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun build(): UsageIngestParams =
            UsageIngestParams(
                checkNotNull(usage) { "`usage` is required but was not set" }.toImmutable(),
                additionalQueryParams.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalHeaders.mapValues { it.value.toImmutable() }.toImmutable(),
            )
    }

    @JsonDeserialize(builder = Usage.Builder::class)
    @NoAutoDetect
    class Usage
    private constructor(
        private val transactionId: String?,
        private val customerId: String?,
        private val eventType: String?,
        private val timestamp: String?,
        private val properties: Properties?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("transaction_id") fun transactionId(): String? = transactionId

        @JsonProperty("customer_id") fun customerId(): String? = customerId

        @JsonProperty("event_type") fun eventType(): String? = eventType

        /** RFC 3339 formatted */
        @JsonProperty("timestamp") fun timestamp(): String? = timestamp

        @JsonProperty("properties") fun properties(): Properties? = properties

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var transactionId: String? = null
            private var customerId: String? = null
            private var eventType: String? = null
            private var timestamp: String? = null
            private var properties: Properties? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(usage: Usage) = apply {
                this.transactionId = usage.transactionId
                this.customerId = usage.customerId
                this.eventType = usage.eventType
                this.timestamp = usage.timestamp
                this.properties = usage.properties
                additionalProperties(usage.additionalProperties)
            }

            @JsonProperty("transaction_id")
            fun transactionId(transactionId: String) = apply { this.transactionId = transactionId }

            @JsonProperty("customer_id")
            fun customerId(customerId: String) = apply { this.customerId = customerId }

            @JsonProperty("event_type")
            fun eventType(eventType: String) = apply { this.eventType = eventType }

            /** RFC 3339 formatted */
            @JsonProperty("timestamp")
            fun timestamp(timestamp: String) = apply { this.timestamp = timestamp }

            @JsonProperty("properties")
            fun properties(properties: Properties) = apply { this.properties = properties }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Usage =
                Usage(
                    checkNotNull(transactionId) { "`transactionId` is required but was not set" },
                    checkNotNull(customerId) { "`customerId` is required but was not set" },
                    checkNotNull(eventType) { "`eventType` is required but was not set" },
                    checkNotNull(timestamp) { "`timestamp` is required but was not set" },
                    properties,
                    additionalProperties.toImmutable(),
                )
        }

        @JsonDeserialize(builder = Properties.Builder::class)
        @NoAutoDetect
        class Properties
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(properties: Properties) = apply {
                    additionalProperties(properties.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Properties = Properties(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Properties && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() = "Properties{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Usage && this.transactionId == other.transactionId && this.customerId == other.customerId && this.eventType == other.eventType && this.timestamp == other.timestamp && this.properties == other.properties && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(transactionId, customerId, eventType, timestamp, properties, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "Usage{transactionId=$transactionId, customerId=$customerId, eventType=$eventType, timestamp=$timestamp, properties=$properties, additionalProperties=$additionalProperties}"
    }
}
