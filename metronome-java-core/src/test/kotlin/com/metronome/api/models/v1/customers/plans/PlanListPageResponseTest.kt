// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers.plans

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.JsonValue
import com.metronome.api.core.jsonMapper
import com.metronome.api.models.CreditTypeData
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanListPageResponseTest {

    @Test
    fun create() {
        val planListPageResponse =
            PlanListPageResponse.builder()
                .addData(
                    PlanListResponse.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .customFields(
                            PlanListResponse.CustomFields.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .planDescription("plan_description")
                        .planId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .planName("plan_name")
                        .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .netPaymentTermsDays(0.0)
                        .trialInfo(
                            PlanListResponse.TrialInfo.builder()
                                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .addSpendingCap(
                                    PlanListResponse.TrialInfo.SpendingCap.builder()
                                        .amount(123.45)
                                        .amountRemaining(123.0)
                                        .creditType(
                                            CreditTypeData.builder()
                                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                                .name("name")
                                                .build()
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .nextPage("next_page")
                .build()

        assertThat(planListPageResponse.data())
            .containsExactly(
                PlanListResponse.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .customFields(
                        PlanListResponse.CustomFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .planDescription("plan_description")
                    .planId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .planName("plan_name")
                    .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .netPaymentTermsDays(0.0)
                    .trialInfo(
                        PlanListResponse.TrialInfo.builder()
                            .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .addSpendingCap(
                                PlanListResponse.TrialInfo.SpendingCap.builder()
                                    .amount(123.45)
                                    .amountRemaining(123.0)
                                    .creditType(
                                        CreditTypeData.builder()
                                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                            .name("name")
                                            .build()
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(planListPageResponse.nextPage()).contains("next_page")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val planListPageResponse =
            PlanListPageResponse.builder()
                .addData(
                    PlanListResponse.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .customFields(
                            PlanListResponse.CustomFields.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .planDescription("plan_description")
                        .planId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .planName("plan_name")
                        .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .netPaymentTermsDays(0.0)
                        .trialInfo(
                            PlanListResponse.TrialInfo.builder()
                                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .addSpendingCap(
                                    PlanListResponse.TrialInfo.SpendingCap.builder()
                                        .amount(123.45)
                                        .amountRemaining(123.0)
                                        .creditType(
                                            CreditTypeData.builder()
                                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                                .name("name")
                                                .build()
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .nextPage("next_page")
                .build()

        val roundtrippedPlanListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(planListPageResponse),
                jacksonTypeRef<PlanListPageResponse>(),
            )

        assertThat(roundtrippedPlanListPageResponse).isEqualTo(planListPageResponse)
    }
}
