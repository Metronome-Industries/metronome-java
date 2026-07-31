// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers.plans

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.jsonMapper
import com.metronome.api.models.Id
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanAddResponseTest {

    @Test
    fun create() {
        val planAddResponse =
            PlanAddResponse.builder()
                .data(Id.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build())
                .build()

        assertThat(planAddResponse.data())
            .isEqualTo(Id.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val planAddResponse =
            PlanAddResponse.builder()
                .data(Id.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build())
                .build()

        val roundtrippedPlanAddResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(planAddResponse),
                jacksonTypeRef<PlanAddResponse>(),
            )

        assertThat(roundtrippedPlanAddResponse).isEqualTo(planAddResponse)
    }
}
