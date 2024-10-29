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
                .prices(
                    listOf(
                        CustomerPlanListPriceAdjustmentsResponse.Price.builder()
                            .adjustmentType(
                                CustomerPlanListPriceAdjustmentsResponse.Price.AdjustmentType.FIXED
                            )
                            .tier(42.23)
                            .value(42.23)
                            .build()
                    )
                )
                .startPeriod(42.23)
                .quantity(42.23)
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
                    .tier(42.23)
                    .value(42.23)
                    .build()
            )
        assertThat(customerPlanListPriceAdjustmentsResponse.startPeriod()).isEqualTo(42.23)
        assertThat(customerPlanListPriceAdjustmentsResponse.quantity()).contains(42.23)
    }
}
