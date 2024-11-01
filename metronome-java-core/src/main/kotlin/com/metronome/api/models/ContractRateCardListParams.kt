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

class ContractRateCardListParams
constructor(
    private val body: JsonValue,
    private val limit: Long?,
    private val nextPage: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun body(): JsonValue = body

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun nextPage(): Optional<String> = Optional.ofNullable(nextPage)

    @JvmSynthetic
    internal fun getBody(): JsonValue {
        return body
    }

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.limit?.let { params.put("limit", listOf(it.toString())) }
        this.nextPage?.let { params.put("next_page", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toImmutable()
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = ContractRateCardListBody.Builder::class)
    @NoAutoDetect
    class ContractRateCardListBody
    internal constructor(
        private val body: JsonValue?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("body") fun body(): JsonValue? = body

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var body: JsonValue? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(contractRateCardListBody: ContractRateCardListBody) = apply {
                this.body = contractRateCardListBody.body
                additionalProperties(contractRateCardListBody.additionalProperties)
            }

            @JsonProperty("body") fun body(body: JsonValue) = apply { this.body = body }

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

            fun build(): ContractRateCardListBody =
                ContractRateCardListBody(
                    checkNotNull(body) { "`body` is required but was not set" },
                    additionalProperties.toImmutable()
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ContractRateCardListBody && this.body == other.body && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(body, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "ContractRateCardListBody{body=$body, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ContractRateCardListParams && this.body == other.body && this.limit == other.limit && this.nextPage == other.nextPage && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(body, limit, nextPage, additionalQueryParams, additionalHeaders) /* spotless:on */
    }

    override fun toString() =
        "ContractRateCardListParams{body=$body, limit=$limit, nextPage=$nextPage, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: JsonValue? = null
        private var limit: Long? = null
        private var nextPage: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        @JvmSynthetic
        internal fun from(contractRateCardListParams: ContractRateCardListParams) = apply {
            this.body = contractRateCardListParams.body
            this.limit = contractRateCardListParams.limit
            this.nextPage = contractRateCardListParams.nextPage
            additionalQueryParams(contractRateCardListParams.additionalQueryParams)
            additionalHeaders(contractRateCardListParams.additionalHeaders)
        }

        fun body(body: JsonValue) = apply { this.body = body }

        /** Max number of results that should be returned */
        fun limit(limit: Long) = apply { this.limit = limit }

        /** Cursor that indicates where the next page of results should start. */
        fun nextPage(nextPage: String) = apply { this.nextPage = nextPage }

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

        fun build(): ContractRateCardListParams =
            ContractRateCardListParams(
                checkNotNull(body) { "`body` is required but was not set" },
                limit,
                nextPage,
                additionalQueryParams.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalHeaders.mapValues { it.value.toImmutable() }.toImmutable(),
            )
    }
}
