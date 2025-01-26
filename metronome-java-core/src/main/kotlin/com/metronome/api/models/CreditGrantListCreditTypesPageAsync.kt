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
import com.metronome.api.services.async.CreditGrantServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/** List all pricing units (known in the API by the legacy term "credit types"). */
class CreditGrantListCreditTypesPageAsync
private constructor(
    private val creditGrantsService: CreditGrantServiceAsync,
    private val params: CreditGrantListCreditTypesParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun nextPage(): Optional<String> = response().nextPage()

    fun data(): List<CreditGrantListCreditTypesResponse> = response().data()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CreditGrantListCreditTypesPageAsync && creditGrantsService == other.creditGrantsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(creditGrantsService, params, response) /* spotless:on */

    override fun toString() =
        "CreditGrantListCreditTypesPageAsync{creditGrantsService=$creditGrantsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        if (data().isEmpty()) {
            return false
        }

        return nextPage().isPresent
    }

    fun getNextPageParams(): Optional<CreditGrantListCreditTypesParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            CreditGrantListCreditTypesParams.builder()
                .from(params)
                .apply { nextPage().ifPresent { this.nextPage(it) } }
                .build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<CreditGrantListCreditTypesPageAsync>> {
        return getNextPageParams()
            .map { creditGrantsService.listCreditTypes(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            creditGrantsService: CreditGrantServiceAsync,
            params: CreditGrantListCreditTypesParams,
            response: Response
        ) =
            CreditGrantListCreditTypesPageAsync(
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
        private val data: JsonField<List<CreditGrantListCreditTypesResponse>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun nextPage(): Optional<String> = Optional.ofNullable(nextPage.getNullable("next_page"))

        fun data(): List<CreditGrantListCreditTypesResponse> = data.getNullable("data") ?: listOf()

        @JsonProperty("next_page")
        fun _nextPage(): Optional<JsonField<String>> = Optional.ofNullable(nextPage)

        @JsonProperty("data")
        fun _data(): Optional<JsonField<List<CreditGrantListCreditTypesResponse>>> =
            Optional.ofNullable(data)

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
            private var data: JsonField<List<CreditGrantListCreditTypesResponse>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) = apply {
                this.nextPage = page.nextPage
                this.data = page.data
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun nextPage(nextPage: String) = nextPage(JsonField.of(nextPage))

            fun nextPage(nextPage: JsonField<String>) = apply { this.nextPage = nextPage }

            fun data(data: List<CreditGrantListCreditTypesResponse>) = data(JsonField.of(data))

            fun data(data: JsonField<List<CreditGrantListCreditTypesResponse>>) = apply {
                this.data = data
            }

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
        private val firstPage: CreditGrantListCreditTypesPageAsync,
    ) {

        fun forEach(
            action: Predicate<CreditGrantListCreditTypesResponse>,
            executor: Executor
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<CreditGrantListCreditTypesPageAsync>>.forEach(
                action: (CreditGrantListCreditTypesResponse) -> Boolean,
                executor: Executor
            ): CompletableFuture<Void> =
                thenComposeAsync(
                    { page ->
                        page
                            .filter { it.data().all(action) }
                            .map { it.getNextPage().forEach(action, executor) }
                            .orElseGet { CompletableFuture.completedFuture(null) }
                    },
                    executor
                )
            return CompletableFuture.completedFuture(Optional.of(firstPage))
                .forEach(action::test, executor)
        }

        fun toList(
            executor: Executor
        ): CompletableFuture<List<CreditGrantListCreditTypesResponse>> {
            val values = mutableListOf<CreditGrantListCreditTypesResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
