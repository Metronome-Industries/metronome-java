// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PlanListChargesParamsTest {

    @Test
    fun createPlanListChargesParams() {
        PlanListChargesParams.builder()
            .planId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
            .limit(1L)
            .nextPage("next_page")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            PlanListChargesParams.builder()
                .planId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .limit(1L)
                .nextPage("next_page")
                .build()
        val expected = QueryParams.builder()
        expected.put("limit", "1")
        expected.put("next_page", "next_page")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            PlanListChargesParams.builder().planId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc").build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getPathParam() {
        val params =
            PlanListChargesParams.builder().planId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc").build()
        assertThat(params).isNotNull
        // path param "planId"
        assertThat(params.getPathParam(0)).isEqualTo("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
