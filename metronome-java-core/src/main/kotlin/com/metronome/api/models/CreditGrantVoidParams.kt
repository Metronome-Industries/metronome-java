// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import java.util.Objects
import java.util.Optional

class CreditGrantVoidParams
constructor(
    private val body: CreditGrantVoidBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun id(): String = body.id()

    /** If true, resets the uniqueness key on this grant so it can be re-used */
    fun releaseUniquenessKey(): Optional<Boolean> = body.releaseUniquenessKey()

    /** If true, void the purchase invoice associated with the grant */
    fun voidCreditPurchaseInvoice(): Optional<Boolean> = body.voidCreditPurchaseInvoice()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    @JvmSynthetic internal fun getBody(): CreditGrantVoidBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class CreditGrantVoidBody
    @JsonCreator
    internal constructor(
        @JsonProperty("id") private val id: String,
        @JsonProperty("release_uniqueness_key") private val releaseUniquenessKey: Boolean?,
        @JsonProperty("void_credit_purchase_invoice")
        private val voidCreditPurchaseInvoice: Boolean?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonProperty("id") fun id(): String = id

        /** If true, resets the uniqueness key on this grant so it can be re-used */
        @JsonProperty("release_uniqueness_key")
        fun releaseUniquenessKey(): Optional<Boolean> = Optional.ofNullable(releaseUniquenessKey)

        /** If true, void the purchase invoice associated with the grant */
        @JsonProperty("void_credit_purchase_invoice")
        fun voidCreditPurchaseInvoice(): Optional<Boolean> =
            Optional.ofNullable(voidCreditPurchaseInvoice)

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
            private var voidCreditPurchaseInvoice: Boolean? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(creditGrantVoidBody: CreditGrantVoidBody) = apply {
                id = creditGrantVoidBody.id
                releaseUniquenessKey = creditGrantVoidBody.releaseUniquenessKey
                voidCreditPurchaseInvoice = creditGrantVoidBody.voidCreditPurchaseInvoice
                additionalProperties = creditGrantVoidBody.additionalProperties.toMutableMap()
            }

            fun id(id: String) = apply { this.id = id }

            /** If true, resets the uniqueness key on this grant so it can be re-used */
            fun releaseUniquenessKey(releaseUniquenessKey: Boolean?) = apply {
                this.releaseUniquenessKey = releaseUniquenessKey
            }

            /** If true, resets the uniqueness key on this grant so it can be re-used */
            fun releaseUniquenessKey(releaseUniquenessKey: Boolean) =
                releaseUniquenessKey(releaseUniquenessKey as Boolean?)

            /** If true, resets the uniqueness key on this grant so it can be re-used */
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun releaseUniquenessKey(releaseUniquenessKey: Optional<Boolean>) =
                releaseUniquenessKey(releaseUniquenessKey.orElse(null) as Boolean?)

            /** If true, void the purchase invoice associated with the grant */
            fun voidCreditPurchaseInvoice(voidCreditPurchaseInvoice: Boolean?) = apply {
                this.voidCreditPurchaseInvoice = voidCreditPurchaseInvoice
            }

            /** If true, void the purchase invoice associated with the grant */
            fun voidCreditPurchaseInvoice(voidCreditPurchaseInvoice: Boolean) =
                voidCreditPurchaseInvoice(voidCreditPurchaseInvoice as Boolean?)

            /** If true, void the purchase invoice associated with the grant */
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun voidCreditPurchaseInvoice(voidCreditPurchaseInvoice: Optional<Boolean>) =
                voidCreditPurchaseInvoice(voidCreditPurchaseInvoice.orElse(null) as Boolean?)

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

            fun build(): CreditGrantVoidBody =
                CreditGrantVoidBody(
                    checkNotNull(id) { "`id` is required but was not set" },
                    releaseUniquenessKey,
                    voidCreditPurchaseInvoice,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CreditGrantVoidBody && id == other.id && releaseUniquenessKey == other.releaseUniquenessKey && voidCreditPurchaseInvoice == other.voidCreditPurchaseInvoice && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, releaseUniquenessKey, voidCreditPurchaseInvoice, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CreditGrantVoidBody{id=$id, releaseUniquenessKey=$releaseUniquenessKey, voidCreditPurchaseInvoice=$voidCreditPurchaseInvoice, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: CreditGrantVoidBody.Builder = CreditGrantVoidBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(creditGrantVoidParams: CreditGrantVoidParams) = apply {
            body = creditGrantVoidParams.body.toBuilder()
            additionalHeaders = creditGrantVoidParams.additionalHeaders.toBuilder()
            additionalQueryParams = creditGrantVoidParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String) = apply { body.id(id) }

        /** If true, resets the uniqueness key on this grant so it can be re-used */
        fun releaseUniquenessKey(releaseUniquenessKey: Boolean?) = apply {
            body.releaseUniquenessKey(releaseUniquenessKey)
        }

        /** If true, resets the uniqueness key on this grant so it can be re-used */
        fun releaseUniquenessKey(releaseUniquenessKey: Boolean) =
            releaseUniquenessKey(releaseUniquenessKey as Boolean?)

        /** If true, resets the uniqueness key on this grant so it can be re-used */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun releaseUniquenessKey(releaseUniquenessKey: Optional<Boolean>) =
            releaseUniquenessKey(releaseUniquenessKey.orElse(null) as Boolean?)

        /** If true, void the purchase invoice associated with the grant */
        fun voidCreditPurchaseInvoice(voidCreditPurchaseInvoice: Boolean?) = apply {
            body.voidCreditPurchaseInvoice(voidCreditPurchaseInvoice)
        }

        /** If true, void the purchase invoice associated with the grant */
        fun voidCreditPurchaseInvoice(voidCreditPurchaseInvoice: Boolean) =
            voidCreditPurchaseInvoice(voidCreditPurchaseInvoice as Boolean?)

        /** If true, void the purchase invoice associated with the grant */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun voidCreditPurchaseInvoice(voidCreditPurchaseInvoice: Optional<Boolean>) =
            voidCreditPurchaseInvoice(voidCreditPurchaseInvoice.orElse(null) as Boolean?)

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

        fun build(): CreditGrantVoidParams =
            CreditGrantVoidParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CreditGrantVoidParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CreditGrantVoidParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
