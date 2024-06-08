// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PlanListChargesResponseTest {

    @Test
    fun createPlanListChargesResponse() {
        val planListChargesResponse =
            PlanListChargesResponse.builder()
                .data(
                    listOf(
                        PlanListChargesResponse.Data.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .chargeType(PlanListChargesResponse.Data.ChargeType.USAGE)
                            .creditType(
                                PlanListChargesResponse.Data.CreditType.builder()
                                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .name("string")
                                    .build()
                            )
                            .customFields(
                                PlanListChargesResponse.Data.CustomFields.builder().build()
                            )
                            .name("string")
                            .prices(
                                listOf(
                                    PlanListChargesResponse.Data.Price.builder()
                                        .tier(42.23)
                                        .value(42.23)
                                        .collectionInterval(42.23)
                                        .collectionSchedule("string")
                                        .quantity(42.23)
                                        .build()
                                )
                            )
                            .productId("string")
                            .productName("string")
                            .quantity(42.23)
                            .startPeriod(42.23)
                            .unitConversion(
                                PlanListChargesResponse.Data.UnitConversion.builder()
                                    .divisionFactor(42.23)
                                    .roundingBehavior(
                                        PlanListChargesResponse.Data.UnitConversion.RoundingBehavior
                                            .FLOOR
                                    )
                                    .build()
                            )
                            .build()
                    )
                )
                .nextPage("string")
                .build()
        assertThat(planListChargesResponse).isNotNull
        assertThat(planListChargesResponse.data())
            .containsExactly(
                PlanListChargesResponse.Data.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .chargeType(PlanListChargesResponse.Data.ChargeType.USAGE)
                    .creditType(
                        PlanListChargesResponse.Data.CreditType.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .name("string")
                            .build()
                    )
                    .customFields(PlanListChargesResponse.Data.CustomFields.builder().build())
                    .name("string")
                    .prices(
                        listOf(
                            PlanListChargesResponse.Data.Price.builder()
                                .tier(42.23)
                                .value(42.23)
                                .collectionInterval(42.23)
                                .collectionSchedule("string")
                                .quantity(42.23)
                                .build()
                        )
                    )
                    .productId("string")
                    .productName("string")
                    .quantity(42.23)
                    .startPeriod(42.23)
                    .unitConversion(
                        PlanListChargesResponse.Data.UnitConversion.builder()
                            .divisionFactor(42.23)
                            .roundingBehavior(
                                PlanListChargesResponse.Data.UnitConversion.RoundingBehavior.FLOOR
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(planListChargesResponse.nextPage()).contains("string")
    }
}
