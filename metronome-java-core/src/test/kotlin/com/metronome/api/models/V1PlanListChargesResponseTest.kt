// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1PlanListChargesResponseTest {

    @Test
    fun createV1PlanListChargesResponse() {
        val v1PlanListChargesResponse =
            V1PlanListChargesResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .chargeType(V1PlanListChargesResponse.ChargeType.USAGE)
                .creditType(
                    CreditTypeData.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .build()
                )
                .customFields(
                    V1PlanListChargesResponse.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .name("name")
                .addPrice(
                    V1PlanListChargesResponse.Price.builder()
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
                    V1PlanListChargesResponse.UnitConversion.builder()
                        .divisionFactor(0.0)
                        .roundingBehavior(
                            V1PlanListChargesResponse.UnitConversion.RoundingBehavior.FLOOR
                        )
                        .build()
                )
                .build()
        assertThat(v1PlanListChargesResponse).isNotNull
        assertThat(v1PlanListChargesResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(v1PlanListChargesResponse.chargeType())
            .isEqualTo(V1PlanListChargesResponse.ChargeType.USAGE)
        assertThat(v1PlanListChargesResponse.creditType())
            .isEqualTo(
                CreditTypeData.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .build()
            )
        assertThat(v1PlanListChargesResponse.customFields())
            .isEqualTo(
                V1PlanListChargesResponse.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(v1PlanListChargesResponse.name()).isEqualTo("name")
        assertThat(v1PlanListChargesResponse.prices())
            .containsExactly(
                V1PlanListChargesResponse.Price.builder()
                    .tier(0.0)
                    .value(0.0)
                    .collectionInterval(0.0)
                    .collectionSchedule("collection_schedule")
                    .quantity(0.0)
                    .build()
            )
        assertThat(v1PlanListChargesResponse.productId()).isEqualTo("product_id")
        assertThat(v1PlanListChargesResponse.productName()).isEqualTo("product_name")
        assertThat(v1PlanListChargesResponse.quantity()).contains(0.0)
        assertThat(v1PlanListChargesResponse.startPeriod()).contains(0.0)
        assertThat(v1PlanListChargesResponse.tierResetFrequency()).contains(0.0)
        assertThat(v1PlanListChargesResponse.unitConversion())
            .contains(
                V1PlanListChargesResponse.UnitConversion.builder()
                    .divisionFactor(0.0)
                    .roundingBehavior(
                        V1PlanListChargesResponse.UnitConversion.RoundingBehavior.FLOOR
                    )
                    .build()
            )
    }
}
