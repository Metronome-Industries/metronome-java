// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import com.metronome.api.core.http.QueryParams
import com.metronome.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ContractRateCardListParamsTest {

    @Test
    fun createContractRateCardListParams() {
        ContractRateCardListParams.builder()
            .body(JsonValue.from(mapOf<String, Any>()))
            .limit(100L)
            .nextPage("next_page")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            ContractRateCardListParams.builder()
                .body(JsonValue.from(mapOf<String, Any>()))
                .limit(100L)
                .nextPage("next_page")
                .build()
        val expected = QueryParams.builder()
        expected.put("limit", "100")
        expected.put("next_page", "next_page")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            ContractRateCardListParams.builder().body(JsonValue.from(mapOf<String, Any>())).build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getBody() {
        val params =
            ContractRateCardListParams.builder()
                .body(JsonValue.from(mapOf<String, Any>()))
                .limit(100L)
                .nextPage("next_page")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body).isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            ContractRateCardListParams.builder().body(JsonValue.from(mapOf<String, Any>())).build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body).isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }
}
