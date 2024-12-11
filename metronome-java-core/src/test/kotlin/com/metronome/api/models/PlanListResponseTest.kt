// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PlanListResponseTest {

    @Test
    fun createPlanListResponse() {
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
        assertThat(planListResponse).isNotNull
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
}
