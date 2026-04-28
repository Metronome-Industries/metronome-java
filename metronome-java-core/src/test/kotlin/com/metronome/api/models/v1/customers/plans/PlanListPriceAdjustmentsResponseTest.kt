// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers.plans

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanListPriceAdjustmentsResponseTest {

    @Test
    fun create() {
        val planListPriceAdjustmentsResponse =
            PlanListPriceAdjustmentsResponse.builder()
                .chargeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .chargeType(PlanListPriceAdjustmentsResponse.ChargeType.USAGE)
                .addPrice(
                    PlanListPriceAdjustmentsResponse.Price.builder()
                        .adjustmentType(PlanListPriceAdjustmentsResponse.Price.AdjustmentType.FIXED)
                        .quantity(0.0)
                        .tier(0.0)
                        .value(0.0)
                        .build()
                )
                .startPeriod(0.0)
                .quantity(0.0)
                .build()

        assertThat(planListPriceAdjustmentsResponse.chargeId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(planListPriceAdjustmentsResponse.chargeType())
            .isEqualTo(PlanListPriceAdjustmentsResponse.ChargeType.USAGE)
        assertThat(planListPriceAdjustmentsResponse.prices())
            .containsExactly(
                PlanListPriceAdjustmentsResponse.Price.builder()
                    .adjustmentType(PlanListPriceAdjustmentsResponse.Price.AdjustmentType.FIXED)
                    .quantity(0.0)
                    .tier(0.0)
                    .value(0.0)
                    .build()
            )
        assertThat(planListPriceAdjustmentsResponse.startPeriod()).isEqualTo(0.0)
        assertThat(planListPriceAdjustmentsResponse.quantity()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val planListPriceAdjustmentsResponse =
            PlanListPriceAdjustmentsResponse.builder()
                .chargeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .chargeType(PlanListPriceAdjustmentsResponse.ChargeType.USAGE)
                .addPrice(
                    PlanListPriceAdjustmentsResponse.Price.builder()
                        .adjustmentType(PlanListPriceAdjustmentsResponse.Price.AdjustmentType.FIXED)
                        .quantity(0.0)
                        .tier(0.0)
                        .value(0.0)
                        .build()
                )
                .startPeriod(0.0)
                .quantity(0.0)
                .build()

        val roundtrippedPlanListPriceAdjustmentsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(planListPriceAdjustmentsResponse),
                jacksonTypeRef<PlanListPriceAdjustmentsResponse>(),
            )

        assertThat(roundtrippedPlanListPriceAdjustmentsResponse)
            .isEqualTo(planListPriceAdjustmentsResponse)
    }
}
