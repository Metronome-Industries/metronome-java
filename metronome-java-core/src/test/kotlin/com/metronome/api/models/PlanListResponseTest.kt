// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PlanListResponseTest {

    @Test
    fun createPlanListResponse() {
        val planListResponse =
            PlanListResponse.builder()
                .data(
                    listOf(
                        PlanListResponse.Data.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .description("string")
                            .name("string")
                            .customFields(PlanListResponse.Data.CustomFields.builder().build())
                            .build()
                    )
                )
                .nextPage("string")
                .build()
        assertThat(planListResponse).isNotNull
        assertThat(planListResponse.data())
            .containsExactly(
                PlanListResponse.Data.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("string")
                    .name("string")
                    .customFields(PlanListResponse.Data.CustomFields.builder().build())
                    .build()
            )
        assertThat(planListResponse.nextPage()).contains("string")
    }
}
