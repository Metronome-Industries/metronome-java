// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.plans

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.JsonValue
import com.metronome.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanListPageResponseTest {

    @Test
    fun create() {
        val planListPageResponse =
            PlanListPageResponse.builder()
                .addData(
                    PlanListResponse.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .description("description")
                        .name("name")
                        .customFields(
                            PlanListResponse.CustomFields.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .nextPage("next_page")
                .build()

        assertThat(planListPageResponse.data())
            .containsExactly(
                PlanListResponse.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("description")
                    .name("name")
                    .customFields(
                        PlanListResponse.CustomFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
        assertThat(planListPageResponse.nextPage()).contains("next_page")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val planListPageResponse =
            PlanListPageResponse.builder()
                .addData(
                    PlanListResponse.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .description("description")
                        .name("name")
                        .customFields(
                            PlanListResponse.CustomFields.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .nextPage("next_page")
                .build()

        val roundtrippedPlanListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(planListPageResponse),
                jacksonTypeRef<PlanListPageResponse>(),
            )

        assertThat(roundtrippedPlanListPageResponse).isEqualTo(planListPageResponse)
    }
}
