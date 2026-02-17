// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1CustomerPlanListResponseTest {

    @Test
    fun createV1CustomerPlanListResponse() {
        val v1CustomerPlanListResponse =
            V1CustomerPlanListResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .customFields(
                    V1CustomerPlanListResponse.CustomFields.builder()
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
                    V1CustomerPlanListResponse.TrialInfo.builder()
                        .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addSpendingCap(
                            V1CustomerPlanListResponse.TrialInfo.SpendingCap.builder()
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
        assertThat(v1CustomerPlanListResponse).isNotNull
        assertThat(v1CustomerPlanListResponse.id())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(v1CustomerPlanListResponse.customFields())
            .isEqualTo(
                V1CustomerPlanListResponse.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(v1CustomerPlanListResponse.planDescription()).isEqualTo("plan_description")
        assertThat(v1CustomerPlanListResponse.planId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(v1CustomerPlanListResponse.planName()).isEqualTo("plan_name")
        assertThat(v1CustomerPlanListResponse.startingOn())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(v1CustomerPlanListResponse.endingBefore())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(v1CustomerPlanListResponse.netPaymentTermsDays()).contains(0.0)
        assertThat(v1CustomerPlanListResponse.trialInfo())
            .contains(
                V1CustomerPlanListResponse.TrialInfo.builder()
                    .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addSpendingCap(
                        V1CustomerPlanListResponse.TrialInfo.SpendingCap.builder()
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
    }
}
