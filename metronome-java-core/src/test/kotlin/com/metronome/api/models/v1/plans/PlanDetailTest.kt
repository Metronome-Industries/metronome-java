// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.plans

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.JsonValue
import com.metronome.api.core.jsonMapper
import com.metronome.api.models.CreditTypeData
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanDetailTest {

    @Test
    fun create() {
        val planDetail =
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

        assertThat(planDetail.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(planDetail.customFields())
            .isEqualTo(
                PlanDetail.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(planDetail.name()).isEqualTo("name")
        assertThat(planDetail.creditGrants().getOrNull())
            .containsExactly(
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
        assertThat(planDetail.description()).contains("description")
        assertThat(planDetail.minimums().getOrNull())
            .containsExactly(
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
        assertThat(planDetail.overageRates().getOrNull())
            .containsExactly(
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val planDetail =
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

        val roundtrippedPlanDetail =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(planDetail),
                jacksonTypeRef<PlanDetail>(),
            )

        assertThat(roundtrippedPlanDetail).isEqualTo(planDetail)
    }
}
