// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.http.QueryParams
import com.metronome.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CreditGrantListCreditTypesParamsTest {

    @Test
    fun createCreditGrantListCreditTypesParams() {
        CreditGrantListCreditTypesParams.builder().limit(100L).nextPage("next_page").build()
    }

    @Test
    fun getQueryParams() {
        val params =
            CreditGrantListCreditTypesParams.builder().limit(100L).nextPage("next_page").build()
        val expected = QueryParams.builder()
        expected.put("limit", "100")
        expected.put("next_page", "next_page")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = CreditGrantListCreditTypesParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
