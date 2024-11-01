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
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import com.metronome.api.models.*
import java.util.Objects
import java.util.Optional

class ContractProductListParams
constructor(
    private val limit: Long?,
    private val nextPage: String?,
    private val archiveFilter: ArchiveFilter?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun nextPage(): Optional<String> = Optional.ofNullable(nextPage)

    fun archiveFilter(): Optional<ArchiveFilter> = Optional.ofNullable(archiveFilter)

    @JvmSynthetic
    internal fun getBody(): ContractProductListBody {
        return ContractProductListBody(archiveFilter, additionalBodyProperties)
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

    @JsonDeserialize(builder = ContractProductListBody.Builder::class)
    @NoAutoDetect
    class ContractProductListBody
    internal constructor(
        private val archiveFilter: ArchiveFilter?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** Filter options for the product list */
        @JsonProperty("archive_filter") fun archiveFilter(): ArchiveFilter? = archiveFilter

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var archiveFilter: ArchiveFilter? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(contractProductListBody: ContractProductListBody) = apply {
                this.archiveFilter = contractProductListBody.archiveFilter
                additionalProperties(contractProductListBody.additionalProperties)
            }

            /** Filter options for the product list */
            @JsonProperty("archive_filter")
            fun archiveFilter(archiveFilter: ArchiveFilter) = apply {
                this.archiveFilter = archiveFilter
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

            fun build(): ContractProductListBody =
                ContractProductListBody(archiveFilter, additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ContractProductListBody && this.archiveFilter == other.archiveFilter && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(archiveFilter, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "ContractProductListBody{archiveFilter=$archiveFilter, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ContractProductListParams && this.archiveFilter == other.archiveFilter && this.limit == other.limit && this.nextPage == other.nextPage && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(archiveFilter, limit, nextPage, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "ContractProductListParams{archiveFilter=$archiveFilter, limit=$limit, nextPage=$nextPage, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var limit: Long? = null
        private var nextPage: String? = null
        private var archiveFilter: ArchiveFilter? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(contractProductListParams: ContractProductListParams) = apply {
            this.limit = contractProductListParams.limit
            this.nextPage = contractProductListParams.nextPage
            this.archiveFilter = contractProductListParams.archiveFilter
            additionalQueryParams(contractProductListParams.additionalQueryParams)
            additionalHeaders(contractProductListParams.additionalHeaders)
            additionalBodyProperties(contractProductListParams.additionalBodyProperties)
        }

        /** Max number of results that should be returned */
        fun limit(limit: Long) = apply { this.limit = limit }

        /** Cursor that indicates where the next page of results should start. */
        fun nextPage(nextPage: String) = apply { this.nextPage = nextPage }

        /** Filter options for the product list */
        fun archiveFilter(archiveFilter: ArchiveFilter) = apply {
            this.archiveFilter = archiveFilter
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

        fun build(): ContractProductListParams =
            ContractProductListParams(
                limit,
                nextPage,
                archiveFilter,
                additionalQueryParams.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalHeaders.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }

    class ArchiveFilter
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ArchiveFilter && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val ARCHIVED = ArchiveFilter(JsonField.of("ARCHIVED"))

            @JvmField val NOT_ARCHIVED = ArchiveFilter(JsonField.of("NOT_ARCHIVED"))

            @JvmField val ALL = ArchiveFilter(JsonField.of("ALL"))

            @JvmStatic fun of(value: String) = ArchiveFilter(JsonField.of(value))
        }

        enum class Known {
            ARCHIVED,
            NOT_ARCHIVED,
            ALL,
        }

        enum class Value {
            ARCHIVED,
            NOT_ARCHIVED,
            ALL,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ARCHIVED -> Value.ARCHIVED
                NOT_ARCHIVED -> Value.NOT_ARCHIVED
                ALL -> Value.ALL
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ARCHIVED -> Known.ARCHIVED
                NOT_ARCHIVED -> Known.NOT_ARCHIVED
                ALL -> Known.ALL
                else -> throw MetronomeInvalidDataException("Unknown ArchiveFilter: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
