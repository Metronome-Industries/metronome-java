// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.plans

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.JsonValue
import com.metronome.api.core.jsonMapper
import com.metronome.api.models.CreditTypeData
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanListChargesPageResponseTest {

    @Test
    fun create() {
        val planListChargesPageResponse =
            PlanListChargesPageResponse.builder()
                .addData(
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
                )
                .nextPage("next_page")
                .build()

        assertThat(planListChargesPageResponse.data())
            .containsExactly(
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
            )
        assertThat(planListChargesPageResponse.nextPage()).contains("next_page")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val planListChargesPageResponse =
            PlanListChargesPageResponse.builder()
                .addData(
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
                )
                .nextPage("next_page")
                .build()

        val roundtrippedPlanListChargesPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(planListChargesPageResponse),
                jacksonTypeRef<PlanListChargesPageResponse>(),
            )

        assertThat(roundtrippedPlanListChargesPageResponse).isEqualTo(planListChargesPageResponse)
    }
}
