// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.contracts.ratecards

import com.metronome.api.core.JsonValue
import com.metronome.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RateCardListParamsTest {

    @Test
    fun create() {
        RateCardListParams.builder()
            .limit(1L)
            .nextPage("next_page")
            .body(JsonValue.from(mapOf<String, Any>()))
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            RateCardListParams.builder()
                .limit(1L)
                .nextPage("next_page")
                .body(JsonValue.from(mapOf<String, Any>()))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("limit", "1").put("next_page", "next_page").build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = RateCardListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            RateCardListParams.builder()
                .limit(1L)
                .nextPage("next_page")
                .body(JsonValue.from(mapOf<String, Any>()))
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = RateCardListParams.builder().build()

        val body = params._body()
    }
}
