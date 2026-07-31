// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.plans

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.JsonValue
import com.metronome.api.core.jsonMapper
import com.metronome.api.models.CreditTypeData
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanListChargesResponseTest {

    @Test
    fun create() {
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
                .customFields(
                    PlanListChargesResponse.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .name("name")
                .addPrice(
                    PlanListChargesResponse.Price.builder()
                        .tier(0.0)
                        .value(0.0)
                        .collectionInterval(0.0)
                        .collectionSchedule("collection_schedule")
                        .quantity(0.0)
                        .build()
                )
                .productId("product_id")
                .productName("product_name")
                .quantity(0.0)
                .startPeriod(0.0)
                .tierResetFrequency(0.0)
                .unitConversion(
                    PlanListChargesResponse.UnitConversion.builder()
                        .divisionFactor(0.0)
                        .roundingBehavior(
                            PlanListChargesResponse.UnitConversion.RoundingBehavior.FLOOR
                        )
                        .build()
                )
                .build()

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
            .isEqualTo(
                PlanListChargesResponse.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(planListChargesResponse.name()).isEqualTo("name")
        assertThat(planListChargesResponse.prices())
            .containsExactly(
                PlanListChargesResponse.Price.builder()
                    .tier(0.0)
                    .value(0.0)
                    .collectionInterval(0.0)
                    .collectionSchedule("collection_schedule")
                    .quantity(0.0)
                    .build()
            )
        assertThat(planListChargesResponse.productId()).isEqualTo("product_id")
        assertThat(planListChargesResponse.productName()).isEqualTo("product_name")
        assertThat(planListChargesResponse.quantity()).contains(0.0)
        assertThat(planListChargesResponse.startPeriod()).contains(0.0)
        assertThat(planListChargesResponse.tierResetFrequency()).contains(0.0)
        assertThat(planListChargesResponse.unitConversion())
            .contains(
                PlanListChargesResponse.UnitConversion.builder()
                    .divisionFactor(0.0)
                    .roundingBehavior(PlanListChargesResponse.UnitConversion.RoundingBehavior.FLOOR)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
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
                .customFields(
                    PlanListChargesResponse.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .name("name")
                .addPrice(
                    PlanListChargesResponse.Price.builder()
                        .tier(0.0)
                        .value(0.0)
                        .collectionInterval(0.0)
                        .collectionSchedule("collection_schedule")
                        .quantity(0.0)
                        .build()
                )
                .productId("product_id")
                .productName("product_name")
                .quantity(0.0)
                .startPeriod(0.0)
                .tierResetFrequency(0.0)
                .unitConversion(
                    PlanListChargesResponse.UnitConversion.builder()
                        .divisionFactor(0.0)
                        .roundingBehavior(
                            PlanListChargesResponse.UnitConversion.RoundingBehavior.FLOOR
                        )
                        .build()
                )
                .build()

        val roundtrippedPlanListChargesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(planListChargesResponse),
                jacksonTypeRef<PlanListChargesResponse>(),
            )

        assertThat(roundtrippedPlanListChargesResponse).isEqualTo(planListChargesResponse)
    }
}
