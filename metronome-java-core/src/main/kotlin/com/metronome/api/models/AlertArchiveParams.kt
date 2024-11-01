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
import java.util.Optional

class AlertArchiveParams
constructor(
    private val id: String,
    private val releaseUniquenessKey: Boolean?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun id(): String = id

    fun releaseUniquenessKey(): Optional<Boolean> = Optional.ofNullable(releaseUniquenessKey)

    @JvmSynthetic
    internal fun getBody(): AlertArchiveBody {
        return AlertArchiveBody(
            id,
            releaseUniquenessKey,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = AlertArchiveBody.Builder::class)
    @NoAutoDetect
    class AlertArchiveBody
    internal constructor(
        private val id: String?,
        private val releaseUniquenessKey: Boolean?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The Metronome ID of the alert */
        @JsonProperty("id") fun id(): String? = id

        /** If true, resets the uniqueness key on this alert so it can be re-used */
        @JsonProperty("release_uniqueness_key")
        fun releaseUniquenessKey(): Boolean? = releaseUniquenessKey

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var id: String? = null
            private var releaseUniquenessKey: Boolean? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(alertArchiveBody: AlertArchiveBody) = apply {
                this.id = alertArchiveBody.id
                this.releaseUniquenessKey = alertArchiveBody.releaseUniquenessKey
                additionalProperties(alertArchiveBody.additionalProperties)
            }

            /** The Metronome ID of the alert */
            @JsonProperty("id") fun id(id: String) = apply { this.id = id }

            /** If true, resets the uniqueness key on this alert so it can be re-used */
            @JsonProperty("release_uniqueness_key")
            fun releaseUniquenessKey(releaseUniquenessKey: Boolean) = apply {
                this.releaseUniquenessKey = releaseUniquenessKey
            }

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

            fun build(): AlertArchiveBody =
                AlertArchiveBody(
                    checkNotNull(id) { "`id` is required but was not set" },
                    releaseUniquenessKey,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AlertArchiveBody && this.id == other.id && this.releaseUniquenessKey == other.releaseUniquenessKey && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(id, releaseUniquenessKey, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "AlertArchiveBody{id=$id, releaseUniquenessKey=$releaseUniquenessKey, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AlertArchiveParams && this.id == other.id && this.releaseUniquenessKey == other.releaseUniquenessKey && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(id, releaseUniquenessKey, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "AlertArchiveParams{id=$id, releaseUniquenessKey=$releaseUniquenessKey, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var id: String? = null
        private var releaseUniquenessKey: Boolean? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(alertArchiveParams: AlertArchiveParams) = apply {
            this.id = alertArchiveParams.id
            this.releaseUniquenessKey = alertArchiveParams.releaseUniquenessKey
            additionalQueryParams(alertArchiveParams.additionalQueryParams)
            additionalHeaders(alertArchiveParams.additionalHeaders)
            additionalBodyProperties(alertArchiveParams.additionalBodyProperties)
        }

        /** The Metronome ID of the alert */
        fun id(id: String) = apply { this.id = id }

        /** If true, resets the uniqueness key on this alert so it can be re-used */
        fun releaseUniquenessKey(releaseUniquenessKey: Boolean) = apply {
            this.releaseUniquenessKey = releaseUniquenessKey
        }

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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): AlertArchiveParams =
            AlertArchiveParams(
                checkNotNull(id) { "`id` is required but was not set" },
                releaseUniquenessKey,
                additionalQueryParams.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalHeaders.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }
}
