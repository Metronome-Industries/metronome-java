// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import com.metronome.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1ContractRateCardListParamsTest {

    @Test
    fun create() {
        V1ContractRateCardListParams.builder()
            .limit(1L)
            .nextPage("next_page")
            .body(JsonValue.from(mapOf<String, Any>()))
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            V1ContractRateCardListParams.builder()
                .limit(1L)
                .nextPage("next_page")
                .body(JsonValue.from(mapOf<String, Any>()))
                .build()
        val expected = QueryParams.builder()
        expected.put("limit", "1")
        expected.put("next_page", "next_page")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = V1ContractRateCardListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun body() {
        val params =
            V1ContractRateCardListParams.builder()
                .limit(1L)
                .nextPage("next_page")
                .body(JsonValue.from(mapOf<String, Any>()))
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = V1ContractRateCardListParams.builder().build()

        val body = params._body()
    }
}
