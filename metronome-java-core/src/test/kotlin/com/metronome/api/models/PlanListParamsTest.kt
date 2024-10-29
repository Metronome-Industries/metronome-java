// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PlanListParamsTest {

    @Test
    fun createPlanListParams() {
        PlanListParams.builder().limit(100L).nextPage("next_page").build()
    }

    @Test
    fun getQueryParams() {
        val params = PlanListParams.builder().limit(100L).nextPage("next_page").build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("limit", listOf("100"))
        expected.put("next_page", listOf("next_page"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = PlanListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
