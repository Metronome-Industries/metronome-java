// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.plans

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.JsonValue
import com.metronome.api.core.jsonMapper
import com.metronome.api.models.CreditTypeData
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanGetDetailsResponseTest {

    @Test
    fun create() {
        val planGetDetailsResponse =
            PlanGetDetailsResponse.builder()
                .data(
                    PlanDetail.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .customFields(
                            PlanDetail.CustomFields.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .name("name")
                        .addCreditGrant(
                            PlanDetail.CreditGrant.builder()
                                .amountGranted(0.0)
                                .amountGrantedCreditType(
                                    CreditTypeData.builder()
                                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .name("name")
                                        .build()
                                )
                                .amountPaid(0.0)
                                .amountPaidCreditType(
                                    CreditTypeData.builder()
                                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .name("name")
                                        .build()
                                )
                                .effectiveDuration(0.0)
                                .name("name")
                                .priority("priority")
                                .sendInvoice(true)
                                .reason("reason")
                                .recurrenceDuration(0.0)
                                .recurrenceInterval(0.0)
                                .build()
                        )
                        .description("description")
                        .addMinimum(
                            PlanDetail.Minimum.builder()
                                .creditType(
                                    CreditTypeData.builder()
                                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .name("name")
                                        .build()
                                )
                                .name("name")
                                .startPeriod(0.0)
                                .value(0.0)
                                .build()
                        )
                        .addOverageRate(
                            PlanDetail.OverageRate.builder()
                                .creditType(
                                    CreditTypeData.builder()
                                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .name("name")
                                        .build()
                                )
                                .fiatCreditType(
                                    CreditTypeData.builder()
                                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .name("name")
                                        .build()
                                )
                                .startPeriod(0.0)
                                .toFiatConversionFactor(0.0)
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(planGetDetailsResponse.data())
            .isEqualTo(
                PlanDetail.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .customFields(
                        PlanDetail.CustomFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .name("name")
                    .addCreditGrant(
                        PlanDetail.CreditGrant.builder()
                            .amountGranted(0.0)
                            .amountGrantedCreditType(
                                CreditTypeData.builder()
                                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .name("name")
                                    .build()
                            )
                            .amountPaid(0.0)
                            .amountPaidCreditType(
                                CreditTypeData.builder()
                                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .name("name")
                                    .build()
                            )
                            .effectiveDuration(0.0)
                            .name("name")
                            .priority("priority")
                            .sendInvoice(true)
                            .reason("reason")
                            .recurrenceDuration(0.0)
                            .recurrenceInterval(0.0)
                            .build()
                    )
                    .description("description")
                    .addMinimum(
                        PlanDetail.Minimum.builder()
                            .creditType(
                                CreditTypeData.builder()
                                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .name("name")
                                    .build()
                            )
                            .name("name")
                            .startPeriod(0.0)
                            .value(0.0)
                            .build()
                    )
                    .addOverageRate(
                        PlanDetail.OverageRate.builder()
                            .creditType(
                                CreditTypeData.builder()
                                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .name("name")
                                    .build()
                            )
                            .fiatCreditType(
                                CreditTypeData.builder()
                                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .name("name")
                                    .build()
                            )
                            .startPeriod(0.0)
                            .toFiatConversionFactor(0.0)
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val planGetDetailsResponse =
            PlanGetDetailsResponse.builder()
                .data(
                    PlanDetail.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .customFields(
                            PlanDetail.CustomFields.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .name("name")
                        .addCreditGrant(
                            PlanDetail.CreditGrant.builder()
                                .amountGranted(0.0)
                                .amountGrantedCreditType(
                                    CreditTypeData.builder()
                                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .name("name")
                                        .build()
                                )
                                .amountPaid(0.0)
                                .amountPaidCreditType(
                                    CreditTypeData.builder()
                                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .name("name")
                                        .build()
                                )
                                .effectiveDuration(0.0)
                                .name("name")
                                .priority("priority")
                                .sendInvoice(true)
                                .reason("reason")
                                .recurrenceDuration(0.0)
                                .recurrenceInterval(0.0)
                                .build()
                        )
                        .description("description")
                        .addMinimum(
                            PlanDetail.Minimum.builder()
                                .creditType(
                                    CreditTypeData.builder()
                                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .name("name")
                                        .build()
                                )
                                .name("name")
                                .startPeriod(0.0)
                                .value(0.0)
                                .build()
                        )
                        .addOverageRate(
                            PlanDetail.OverageRate.builder()
                                .creditType(
                                    CreditTypeData.builder()
                                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .name("name")
                                        .build()
                                )
                                .fiatCreditType(
                                    CreditTypeData.builder()
                                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .name("name")
                                        .build()
                                )
                                .startPeriod(0.0)
                                .toFiatConversionFactor(0.0)
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedPlanGetDetailsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(planGetDetailsResponse),
                jacksonTypeRef<PlanGetDetailsResponse>(),
            )

        assertThat(roundtrippedPlanGetDetailsResponse).isEqualTo(planGetDetailsResponse)
    }
}
