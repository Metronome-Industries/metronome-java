// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerPlanListResponseTest {

    @Test
    fun createCustomerPlanListResponse() {
        val customerPlanListResponse =
            CustomerPlanListResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .customFields(
                    CustomerPlanListResponse.CustomFields.builder()
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
                    CustomerPlanListResponse.TrialInfo.builder()
                        .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addSpendingCap(
                            CustomerPlanListResponse.TrialInfo.SpendingCap.builder()
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
        assertThat(customerPlanListResponse).isNotNull
        assertThat(customerPlanListResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(customerPlanListResponse.customFields())
            .isEqualTo(
                CustomerPlanListResponse.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(customerPlanListResponse.planDescription()).isEqualTo("plan_description")
        assertThat(customerPlanListResponse.planId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(customerPlanListResponse.planName()).isEqualTo("plan_name")
        assertThat(customerPlanListResponse.startingOn())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(customerPlanListResponse.endingBefore())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(customerPlanListResponse.netPaymentTermsDays()).contains(0.0)
        assertThat(customerPlanListResponse.trialInfo())
            .contains(
                CustomerPlanListResponse.TrialInfo.builder()
                    .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addSpendingCap(
                        CustomerPlanListResponse.TrialInfo.SpendingCap.builder()
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
