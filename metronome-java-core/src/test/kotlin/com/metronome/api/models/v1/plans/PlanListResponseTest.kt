// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.plans

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.JsonValue
import com.metronome.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanListResponseTest {

    @Test
    fun create() {
        val planListResponse =
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

        assertThat(planListResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(planListResponse.description()).isEqualTo("description")
        assertThat(planListResponse.name()).isEqualTo("name")
        assertThat(planListResponse.customFields())
            .contains(
                PlanListResponse.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val planListResponse =
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

        val roundtrippedPlanListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(planListResponse),
                jacksonTypeRef<PlanListResponse>(),
            )

        assertThat(roundtrippedPlanListResponse).isEqualTo(planListResponse)
    }
}
