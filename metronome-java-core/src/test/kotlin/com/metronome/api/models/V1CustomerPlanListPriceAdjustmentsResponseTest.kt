// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1CustomerPlanListPriceAdjustmentsResponseTest {

    @Test
    fun createV1CustomerPlanListPriceAdjustmentsResponse() {
        val v1CustomerPlanListPriceAdjustmentsResponse =
            V1CustomerPlanListPriceAdjustmentsResponse.builder()
                .chargeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .chargeType(V1CustomerPlanListPriceAdjustmentsResponse.ChargeType.USAGE)
                .addPrice(
                    V1CustomerPlanListPriceAdjustmentsResponse.Price.builder()
                        .adjustmentType(
                            V1CustomerPlanListPriceAdjustmentsResponse.Price.AdjustmentType.FIXED
                        )
                        .quantity(0.0)
                        .tier(0.0)
                        .value(0.0)
                        .build()
                )
                .startPeriod(0.0)
                .quantity(0.0)
                .build()
        assertThat(v1CustomerPlanListPriceAdjustmentsResponse).isNotNull
        assertThat(v1CustomerPlanListPriceAdjustmentsResponse.chargeId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(v1CustomerPlanListPriceAdjustmentsResponse.chargeType())
            .isEqualTo(V1CustomerPlanListPriceAdjustmentsResponse.ChargeType.USAGE)
        assertThat(v1CustomerPlanListPriceAdjustmentsResponse.prices())
            .containsExactly(
                V1CustomerPlanListPriceAdjustmentsResponse.Price.builder()
                    .adjustmentType(
                        V1CustomerPlanListPriceAdjustmentsResponse.Price.AdjustmentType.FIXED
                    )
                    .quantity(0.0)
                    .tier(0.0)
                    .value(0.0)
                    .build()
            )
        assertThat(v1CustomerPlanListPriceAdjustmentsResponse.startPeriod()).isEqualTo(0.0)
        assertThat(v1CustomerPlanListPriceAdjustmentsResponse.quantity()).contains(0.0)
    }
}
