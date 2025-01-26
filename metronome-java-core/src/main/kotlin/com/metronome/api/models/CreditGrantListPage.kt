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
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import com.metronome.api.services.blocking.CreditGrantService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport

/** List credit grants. This list does not included voided grants. */
class CreditGrantListPage
private constructor(
    private val creditGrantsService: CreditGrantService,
    private val params: CreditGrantListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun nextPage(): Optional<String> = response().nextPage()

    fun data(): List<CreditGrantListResponse> = response().data()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CreditGrantListPage && creditGrantsService == other.creditGrantsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(creditGrantsService, params, response) /* spotless:on */

    override fun toString() =
        "CreditGrantListPage{creditGrantsService=$creditGrantsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        if (data().isEmpty()) {
            return false
        }

        return nextPage().isPresent
    }

    fun getNextPageParams(): Optional<CreditGrantListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            CreditGrantListParams.builder()
                .from(params)
                .apply { nextPage().ifPresent { this.nextPage(it) } }
                .build()
        )
    }

    fun getNextPage(): Optional<CreditGrantListPage> {
        return getNextPageParams().map { creditGrantsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            creditGrantsService: CreditGrantService,
            params: CreditGrantListParams,
            response: Response
        ) =
            CreditGrantListPage(
                creditGrantsService,
                params,
                response,
            )
    }

    @NoAutoDetect
    class Response
    @JsonCreator
    constructor(
        @JsonProperty("next_page") private val nextPage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("data")
        private val data: JsonField<List<CreditGrantListResponse>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun nextPage(): Optional<String> = Optional.ofNullable(nextPage.getNullable("next_page"))

        fun data(): List<CreditGrantListResponse> = data.getNullable("data") ?: listOf()

        @JsonProperty("next_page")
        fun _nextPage(): Optional<JsonField<String>> = Optional.ofNullable(nextPage)

        @JsonProperty("data")
        fun _data(): Optional<JsonField<List<CreditGrantListResponse>>> = Optional.ofNullable(data)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Response = apply {
            if (validated) {
                return@apply
            }

            nextPage()
            data().map { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Response && nextPage == other.nextPage && data == other.data && additionalProperties == other.additionalProperties /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(nextPage, data, additionalProperties) /* spotless:on */

        override fun toString() =
            "Response{nextPage=$nextPage, data=$data, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var nextPage: JsonField<String> = JsonMissing.of()
            private var data: JsonField<List<CreditGrantListResponse>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) = apply {
                this.nextPage = page.nextPage
                this.data = page.data
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun nextPage(nextPage: String) = nextPage(JsonField.of(nextPage))

            fun nextPage(nextPage: JsonField<String>) = apply { this.nextPage = nextPage }

            fun data(data: List<CreditGrantListResponse>) = data(JsonField.of(data))

            fun data(data: JsonField<List<CreditGrantListResponse>>) = apply { this.data = data }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() =
                Response(
                    nextPage,
                    data,
                    additionalProperties.toImmutable(),
                )
        }
    }

    class AutoPager(
        private val firstPage: CreditGrantListPage,
    ) : Iterable<CreditGrantListResponse> {

        override fun iterator(): Iterator<CreditGrantListResponse> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.data().size) {
                    yield(page.data()[index++])
                }
                page = page.getNextPage().orElse(null) ?: break
                index = 0
            }
        }

        fun stream(): Stream<CreditGrantListResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
