// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.toImmutable
import com.metronome.api.models.*
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

class CreditGrantEditParams
constructor(
    private val id: String,
    private val creditGrantType: String?,
    private val expiresAt: OffsetDateTime?,
    private val name: String?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun id(): String = id

    fun creditGrantType(): Optional<String> = Optional.ofNullable(creditGrantType)

    fun expiresAt(): Optional<OffsetDateTime> = Optional.ofNullable(expiresAt)

    fun name(): Optional<String> = Optional.ofNullable(name)

    @JvmSynthetic
    internal fun getBody(): CreditGrantEditBody {
        return CreditGrantEditBody(
            id,
            creditGrantType,
            expiresAt,
            name,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JsonDeserialize(builder = CreditGrantEditBody.Builder::class)
    @NoAutoDetect
    class CreditGrantEditBody
    internal constructor(
        private val id: String?,
        private val creditGrantType: String?,
        private val expiresAt: OffsetDateTime?,
        private val name: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** the ID of the credit grant */
        @JsonProperty("id") fun id(): String? = id

        /** the updated credit grant type */
        @JsonProperty("credit_grant_type") fun creditGrantType(): String? = creditGrantType

        /** the updated expiration date for the credit grant */
        @JsonProperty("expires_at") fun expiresAt(): OffsetDateTime? = expiresAt

        /** the updated name for the credit grant */
        @JsonProperty("name") fun name(): String? = name

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var id: String? = null
            private var creditGrantType: String? = null
            private var expiresAt: OffsetDateTime? = null
            private var name: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(creditGrantEditBody: CreditGrantEditBody) = apply {
                this.id = creditGrantEditBody.id
                this.creditGrantType = creditGrantEditBody.creditGrantType
                this.expiresAt = creditGrantEditBody.expiresAt
                this.name = creditGrantEditBody.name
                additionalProperties(creditGrantEditBody.additionalProperties)
            }

            /** the ID of the credit grant */
            @JsonProperty("id") fun id(id: String) = apply { this.id = id }

            /** the updated credit grant type */
            @JsonProperty("credit_grant_type")
            fun creditGrantType(creditGrantType: String) = apply {
                this.creditGrantType = creditGrantType
            }

            /** the updated expiration date for the credit grant */
            @JsonProperty("expires_at")
            fun expiresAt(expiresAt: OffsetDateTime) = apply { this.expiresAt = expiresAt }

            /** the updated name for the credit grant */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

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

            fun build(): CreditGrantEditBody =
                CreditGrantEditBody(
                    checkNotNull(id) { "`id` is required but was not set" },
                    creditGrantType,
                    expiresAt,
                    name,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CreditGrantEditBody && this.id == other.id && this.creditGrantType == other.creditGrantType && this.expiresAt == other.expiresAt && this.name == other.name && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(id, creditGrantType, expiresAt, name, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "CreditGrantEditBody{id=$id, creditGrantType=$creditGrantType, expiresAt=$expiresAt, name=$name, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CreditGrantEditParams && this.id == other.id && this.creditGrantType == other.creditGrantType && this.expiresAt == other.expiresAt && this.name == other.name && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(id, creditGrantType, expiresAt, name, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "CreditGrantEditParams{id=$id, creditGrantType=$creditGrantType, expiresAt=$expiresAt, name=$name, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var id: String? = null
        private var creditGrantType: String? = null
        private var expiresAt: OffsetDateTime? = null
        private var name: String? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(creditGrantEditParams: CreditGrantEditParams) = apply {
            this.id = creditGrantEditParams.id
            this.creditGrantType = creditGrantEditParams.creditGrantType
            this.expiresAt = creditGrantEditParams.expiresAt
            this.name = creditGrantEditParams.name
            additionalHeaders(creditGrantEditParams.additionalHeaders)
            additionalQueryParams(creditGrantEditParams.additionalQueryParams)
            additionalBodyProperties(creditGrantEditParams.additionalBodyProperties)
        }

        /** the ID of the credit grant */
        fun id(id: String) = apply { this.id = id }

        /** the updated credit grant type */
        fun creditGrantType(creditGrantType: String) = apply {
            this.creditGrantType = creditGrantType
        }

        /** the updated expiration date for the credit grant */
        fun expiresAt(expiresAt: OffsetDateTime) = apply { this.expiresAt = expiresAt }

        /** the updated name for the credit grant */
        fun name(name: String) = apply { this.name = name }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.putAll(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::putAdditionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replaceValues(name, listOf(value))
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replaceValues(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::replaceAdditionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.removeAll(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            names.forEach(::removeAdditionalHeaders)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.putAll(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::putAdditionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replaceValues(key, listOf(value))
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replaceValues(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::replaceAdditionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply {
            additionalQueryParams.removeAll(key)
        }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalQueryParams)
        }

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

        fun build(): CreditGrantEditParams =
            CreditGrantEditParams(
                checkNotNull(id) { "`id` is required but was not set" },
                creditGrantType,
                expiresAt,
                name,
                additionalHeaders
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalQueryParams
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }
}
