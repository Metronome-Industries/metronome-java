// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers.plans

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanListPriceAdjustmentsPageResponseTest {

    @Test
    fun create() {
        val planListPriceAdjustmentsPageResponse =
            PlanListPriceAdjustmentsPageResponse.builder()
                .addData(
                    PlanListPriceAdjustmentsResponse.builder()
                        .chargeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .chargeType(PlanListPriceAdjustmentsResponse.ChargeType.USAGE)
                        .addPrice(
                            PlanListPriceAdjustmentsResponse.Price.builder()
                                .adjustmentType(
                                    PlanListPriceAdjustmentsResponse.Price.AdjustmentType.FIXED
                                )
                                .quantity(0.0)
                                .tier(0.0)
                                .value(0.0)
                                .build()
                        )
                        .startPeriod(0.0)
                        .quantity(0.0)
                        .build()
                )
                .nextPage("next_page")
                .build()

        assertThat(planListPriceAdjustmentsPageResponse.data())
            .containsExactly(
                PlanListPriceAdjustmentsResponse.builder()
                    .chargeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .chargeType(PlanListPriceAdjustmentsResponse.ChargeType.USAGE)
                    .addPrice(
                        PlanListPriceAdjustmentsResponse.Price.builder()
                            .adjustmentType(
                                PlanListPriceAdjustmentsResponse.Price.AdjustmentType.FIXED
                            )
                            .quantity(0.0)
                            .tier(0.0)
                            .value(0.0)
                            .build()
                    )
                    .startPeriod(0.0)
                    .quantity(0.0)
                    .build()
            )
        assertThat(planListPriceAdjustmentsPageResponse.nextPage()).contains("next_page")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val planListPriceAdjustmentsPageResponse =
            PlanListPriceAdjustmentsPageResponse.builder()
                .addData(
                    PlanListPriceAdjustmentsResponse.builder()
                        .chargeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .chargeType(PlanListPriceAdjustmentsResponse.ChargeType.USAGE)
                        .addPrice(
                            PlanListPriceAdjustmentsResponse.Price.builder()
                                .adjustmentType(
                                    PlanListPriceAdjustmentsResponse.Price.AdjustmentType.FIXED
                                )
                                .quantity(0.0)
                                .tier(0.0)
                                .value(0.0)
                                .build()
                        )
                        .startPeriod(0.0)
                        .quantity(0.0)
                        .build()
                )
                .nextPage("next_page")
                .build()

        val roundtrippedPlanListPriceAdjustmentsPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(planListPriceAdjustmentsPageResponse),
                jacksonTypeRef<PlanListPriceAdjustmentsPageResponse>(),
            )

        assertThat(roundtrippedPlanListPriceAdjustmentsPageResponse)
            .isEqualTo(planListPriceAdjustmentsPageResponse)
    }
}
