// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers.plans

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanEndResponseTest {

    @Test
    fun create() {
        val planEndResponse = PlanEndResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val planEndResponse = PlanEndResponse.builder().build()

        val roundtrippedPlanEndResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(planEndResponse),
                jacksonTypeRef<PlanEndResponse>(),
            )

        assertThat(roundtrippedPlanEndResponse).isEqualTo(planEndResponse)
    }
}
