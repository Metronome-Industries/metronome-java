// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PlanListChargesParamsTest {

    @Test
    fun createPlanListChargesParams() {
        PlanListChargesParams.builder()
            .planId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .limit(100L)
            .nextPage("string")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            PlanListChargesParams.builder()
                .planId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .limit(100L)
                .nextPage("string")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("limit", listOf("100"))
        expected.put("next_page", listOf("string"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            PlanListChargesParams.builder().planId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getPathParam() {
        val params =
            PlanListChargesParams.builder().planId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()
        assertThat(params).isNotNull
        // path param "planId"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
