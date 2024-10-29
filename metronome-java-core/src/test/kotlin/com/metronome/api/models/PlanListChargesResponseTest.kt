// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PlanListChargesResponseTest {

    @Test
    fun createPlanListChargesResponse() {
        val planListChargesResponse =
            PlanListChargesResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .chargeType(PlanListChargesResponse.ChargeType.USAGE)
                .creditType(
                    CreditTypeData.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .build()
                )
                .customFields(PlanListChargesResponse.CustomFields.builder().build())
                .name("name")
                .prices(
                    listOf(
                        PlanListChargesResponse.Price.builder()
                            .tier(42.23)
                            .value(42.23)
                            .collectionInterval(42.23)
                            .collectionSchedule("collection_schedule")
                            .quantity(42.23)
                            .build()
                    )
                )
                .productId("product_id")
                .productName("product_name")
                .quantity(42.23)
                .startPeriod(42.23)
                .tierResetFrequency(42.23)
                .unitConversion(
                    PlanListChargesResponse.UnitConversion.builder()
                        .divisionFactor(42.23)
                        .roundingBehavior(
                            PlanListChargesResponse.UnitConversion.RoundingBehavior.FLOOR
                        )
                        .build()
                )
                .build()
        assertThat(planListChargesResponse).isNotNull
        assertThat(planListChargesResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(planListChargesResponse.chargeType())
            .isEqualTo(PlanListChargesResponse.ChargeType.USAGE)
        assertThat(planListChargesResponse.creditType())
            .isEqualTo(
                CreditTypeData.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .build()
            )
        assertThat(planListChargesResponse.customFields())
            .isEqualTo(PlanListChargesResponse.CustomFields.builder().build())
        assertThat(planListChargesResponse.name()).isEqualTo("name")
        assertThat(planListChargesResponse.prices())
            .containsExactly(
                PlanListChargesResponse.Price.builder()
                    .tier(42.23)
                    .value(42.23)
                    .collectionInterval(42.23)
                    .collectionSchedule("collection_schedule")
                    .quantity(42.23)
                    .build()
            )
        assertThat(planListChargesResponse.productId()).isEqualTo("product_id")
        assertThat(planListChargesResponse.productName()).isEqualTo("product_name")
        assertThat(planListChargesResponse.quantity()).contains(42.23)
        assertThat(planListChargesResponse.startPeriod()).contains(42.23)
        assertThat(planListChargesResponse.tierResetFrequency()).contains(42.23)
        assertThat(planListChargesResponse.unitConversion())
            .contains(
                PlanListChargesResponse.UnitConversion.builder()
                    .divisionFactor(42.23)
                    .roundingBehavior(PlanListChargesResponse.UnitConversion.RoundingBehavior.FLOOR)
                    .build()
            )
    }
}
