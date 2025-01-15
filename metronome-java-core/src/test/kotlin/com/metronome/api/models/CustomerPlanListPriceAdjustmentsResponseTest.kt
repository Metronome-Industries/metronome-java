// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerPlanListPriceAdjustmentsResponseTest {

    @Test
    fun createCustomerPlanListPriceAdjustmentsResponse() {
        val customerPlanListPriceAdjustmentsResponse =
            CustomerPlanListPriceAdjustmentsResponse.builder()
                .chargeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .chargeType(CustomerPlanListPriceAdjustmentsResponse.ChargeType.USAGE)
                .addPrice(
                    CustomerPlanListPriceAdjustmentsResponse.Price.builder()
                        .adjustmentType(
                            CustomerPlanListPriceAdjustmentsResponse.Price.AdjustmentType.FIXED
                        )
                        .tier(0.0)
                        .value(0.0)
                        .build()
                )
                .startPeriod(0.0)
                .quantity(0.0)
                .build()
        assertThat(customerPlanListPriceAdjustmentsResponse).isNotNull
        assertThat(customerPlanListPriceAdjustmentsResponse.chargeId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(customerPlanListPriceAdjustmentsResponse.chargeType())
            .isEqualTo(CustomerPlanListPriceAdjustmentsResponse.ChargeType.USAGE)
        assertThat(customerPlanListPriceAdjustmentsResponse.prices())
            .containsExactly(
                CustomerPlanListPriceAdjustmentsResponse.Price.builder()
                    .adjustmentType(
                        CustomerPlanListPriceAdjustmentsResponse.Price.AdjustmentType.FIXED
                    )
                    .tier(0.0)
                    .value(0.0)
                    .build()
            )
        assertThat(customerPlanListPriceAdjustmentsResponse.startPeriod()).isEqualTo(0.0)
        assertThat(customerPlanListPriceAdjustmentsResponse.quantity()).contains(0.0)
    }
}
