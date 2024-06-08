// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerPlanListPriceAdjustmentsResponseTest {

    @Test
    fun createCustomerPlanListPriceAdjustmentsResponse() {
        val customerPlanListPriceAdjustmentsResponse =
            CustomerPlanListPriceAdjustmentsResponse.builder()
                .data(
                    listOf(
                        CustomerPlanListPriceAdjustmentsResponse.Data.builder()
                            .chargeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .chargeType(
                                CustomerPlanListPriceAdjustmentsResponse.Data.ChargeType.USAGE
                            )
                            .prices(
                                listOf(
                                    CustomerPlanListPriceAdjustmentsResponse.Data.Price.builder()
                                        .adjustmentType(
                                            CustomerPlanListPriceAdjustmentsResponse.Data.Price
                                                .AdjustmentType
                                                .FIXED
                                        )
                                        .tier(42.23)
                                        .value(42.23)
                                        .build()
                                )
                            )
                            .startPeriod(42.23)
                            .quantity(42.23)
                            .build()
                    )
                )
                .nextPage("string")
                .build()
        assertThat(customerPlanListPriceAdjustmentsResponse).isNotNull
        assertThat(customerPlanListPriceAdjustmentsResponse.data())
            .containsExactly(
                CustomerPlanListPriceAdjustmentsResponse.Data.builder()
                    .chargeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .chargeType(CustomerPlanListPriceAdjustmentsResponse.Data.ChargeType.USAGE)
                    .prices(
                        listOf(
                            CustomerPlanListPriceAdjustmentsResponse.Data.Price.builder()
                                .adjustmentType(
                                    CustomerPlanListPriceAdjustmentsResponse.Data.Price
                                        .AdjustmentType
                                        .FIXED
                                )
                                .tier(42.23)
                                .value(42.23)
                                .build()
                        )
                    )
                    .startPeriod(42.23)
                    .quantity(42.23)
                    .build()
            )
        assertThat(customerPlanListPriceAdjustmentsResponse.nextPage()).contains("string")
    }
}
