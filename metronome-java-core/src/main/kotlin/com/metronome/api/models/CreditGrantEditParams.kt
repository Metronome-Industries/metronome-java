// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/** Edit an existing credit grant */
class CreditGrantEditParams
constructor(
    private val body: CreditGrantEditBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** the ID of the credit grant */
    fun id(): String = body.id()

    /** the updated credit grant type */
    fun creditGrantType(): Optional<String> = body.creditGrantType()

    /** the updated expiration date for the credit grant */
    fun expiresAt(): Optional<OffsetDateTime> = body.expiresAt()

    /** the updated name for the credit grant */
    fun name(): Optional<String> = body.name()

    /** the ID of the credit grant */
    fun _id(): JsonField<String> = body._id()

    /** the updated credit grant type */
    fun _creditGrantType(): JsonField<String> = body._creditGrantType()

    /** the updated expiration date for the credit grant */
    fun _expiresAt(): JsonField<OffsetDateTime> = body._expiresAt()

    /** the updated name for the credit grant */
    fun _name(): JsonField<String> = body._name()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getBody(): CreditGrantEditBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class CreditGrantEditBody
    @JsonCreator
    internal constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("credit_grant_type")
        @ExcludeMissing
        private val creditGrantType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("expires_at")
        @ExcludeMissing
        private val expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** the ID of the credit grant */
        fun id(): String = id.getRequired("id")

        /** the updated credit grant type */
        fun creditGrantType(): Optional<String> =
            Optional.ofNullable(creditGrantType.getNullable("credit_grant_type"))

        /** the updated expiration date for the credit grant */
        fun expiresAt(): Optional<OffsetDateTime> =
            Optional.ofNullable(expiresAt.getNullable("expires_at"))

        /** the updated name for the credit grant */
        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        /** the ID of the credit grant */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /** the updated credit grant type */
        @JsonProperty("credit_grant_type")
        @ExcludeMissing
        fun _creditGrantType(): JsonField<String> = creditGrantType

        /** the updated expiration date for the credit grant */
        @JsonProperty("expires_at")
        @ExcludeMissing
        fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

        /** the updated name for the credit grant */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CreditGrantEditBody = apply {
            if (!validated) {
                id()
                creditGrantType()
                expiresAt()
                name()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String>? = null
            private var creditGrantType: JsonField<String> = JsonMissing.of()
            private var expiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(creditGrantEditBody: CreditGrantEditBody) = apply {
                id = creditGrantEditBody.id
                creditGrantType = creditGrantEditBody.creditGrantType
                expiresAt = creditGrantEditBody.expiresAt
                name = creditGrantEditBody.name
                additionalProperties = creditGrantEditBody.additionalProperties.toMutableMap()
            }

            /** the ID of the credit grant */
            fun id(id: String) = id(JsonField.of(id))

            /** the ID of the credit grant */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** the updated credit grant type */
            fun creditGrantType(creditGrantType: String) =
                creditGrantType(JsonField.of(creditGrantType))

            /** the updated credit grant type */
            fun creditGrantType(creditGrantType: JsonField<String>) = apply {
                this.creditGrantType = creditGrantType
            }

            /** the updated expiration date for the credit grant */
            fun expiresAt(expiresAt: OffsetDateTime) = expiresAt(JsonField.of(expiresAt))

            /** the updated expiration date for the credit grant */
            fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply {
                this.expiresAt = expiresAt
            }

            /** the updated name for the credit grant */
            fun name(name: String) = name(JsonField.of(name))

            /** the updated name for the credit grant */
            fun name(name: JsonField<String>) = apply { this.name = name }

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

            return /* spotless:off */ other is CreditGrantEditBody && id == other.id && creditGrantType == other.creditGrantType && expiresAt == other.expiresAt && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, creditGrantType, expiresAt, name, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CreditGrantEditBody{id=$id, creditGrantType=$creditGrantType, expiresAt=$expiresAt, name=$name, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: CreditGrantEditBody.Builder = CreditGrantEditBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(creditGrantEditParams: CreditGrantEditParams) = apply {
            body = creditGrantEditParams.body.toBuilder()
            additionalHeaders = creditGrantEditParams.additionalHeaders.toBuilder()
            additionalQueryParams = creditGrantEditParams.additionalQueryParams.toBuilder()
        }

        /** the ID of the credit grant */
        fun id(id: String) = apply { body.id(id) }

        /** the ID of the credit grant */
        fun id(id: JsonField<String>) = apply { body.id(id) }

        /** the updated credit grant type */
        fun creditGrantType(creditGrantType: String) = apply {
            body.creditGrantType(creditGrantType)
        }

        /** the updated credit grant type */
        fun creditGrantType(creditGrantType: JsonField<String>) = apply {
            body.creditGrantType(creditGrantType)
        }

        /** the updated expiration date for the credit grant */
        fun expiresAt(expiresAt: OffsetDateTime) = apply { body.expiresAt(expiresAt) }

        /** the updated expiration date for the credit grant */
        fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply { body.expiresAt(expiresAt) }

        /** the updated name for the credit grant */
        fun name(name: String) = apply { body.name(name) }

        /** the updated name for the credit grant */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun build(): CreditGrantEditParams =
            CreditGrantEditParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CreditGrantEditParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CreditGrantEditParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
