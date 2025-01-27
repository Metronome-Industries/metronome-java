// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PricingUnitListParamsTest {

    @Test
    fun createPricingUnitListParams() {
        PricingUnitListParams.builder().limit(1L).nextPage("next_page").build()
    }

    @Test
    fun getQueryParams() {
        val params = PricingUnitListParams.builder().limit(1L).nextPage("next_page").build()
        val expected = QueryParams.builder()
        expected.put("limit", "1")
        expected.put("next_page", "next_page")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = PricingUnitListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
