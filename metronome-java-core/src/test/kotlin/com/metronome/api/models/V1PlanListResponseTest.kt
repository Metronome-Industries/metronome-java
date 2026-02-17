// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1PlanListResponseTest {

    @Test
    fun createV1PlanListResponse() {
        val v1PlanListResponse =
            V1PlanListResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("description")
                .name("name")
                .customFields(
                    V1PlanListResponse.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()
        assertThat(v1PlanListResponse).isNotNull
        assertThat(v1PlanListResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(v1PlanListResponse.description()).isEqualTo("description")
        assertThat(v1PlanListResponse.name()).isEqualTo("name")
        assertThat(v1PlanListResponse.customFields())
            .contains(
                V1PlanListResponse.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }
}
