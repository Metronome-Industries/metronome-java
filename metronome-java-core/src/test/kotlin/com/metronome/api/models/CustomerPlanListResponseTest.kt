// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerPlanListResponseTest {

    @Test
    fun createCustomerPlanListResponse() {
        val customerPlanListResponse =
            CustomerPlanListResponse.builder()
                .data(
                    listOf(
                        CustomerPlanListResponse.Data.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .customFields(
                                CustomerPlanListResponse.Data.CustomFields.builder().build()
                            )
                            .planDescription("string")
                            .planId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .planName("string")
                            .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .netPaymentTermsDays(42.23)
                            .trialInfo(
                                CustomerPlanListResponse.Data.TrialInfo.builder()
                                    .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .spendingCaps(
                                        listOf(
                                            CustomerPlanListResponse.Data.TrialInfo.SpendingCap
                                                .builder()
                                                .amount(42.23)
                                                .amountRemaining(42.23)
                                                .creditType(
                                                    CustomerPlanListResponse.Data.TrialInfo
                                                        .SpendingCap
                                                        .CreditType
                                                        .builder()
                                                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                                        .name("string")
                                                        .build()
                                                )
                                                .build()
                                        )
                                    )
                                    .build()
                            )
                            .build()
                    )
                )
                .nextPage("string")
                .build()
        assertThat(customerPlanListResponse).isNotNull
        assertThat(customerPlanListResponse.data())
            .containsExactly(
                CustomerPlanListResponse.Data.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .customFields(CustomerPlanListResponse.Data.CustomFields.builder().build())
                    .planDescription("string")
                    .planId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .planName("string")
                    .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .netPaymentTermsDays(42.23)
                    .trialInfo(
                        CustomerPlanListResponse.Data.TrialInfo.builder()
                            .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .spendingCaps(
                                listOf(
                                    CustomerPlanListResponse.Data.TrialInfo.SpendingCap.builder()
                                        .amount(42.23)
                                        .amountRemaining(42.23)
                                        .creditType(
                                            CustomerPlanListResponse.Data.TrialInfo.SpendingCap
                                                .CreditType
                                                .builder()
                                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                                .name("string")
                                                .build()
                                        )
                                        .build()
                                )
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(customerPlanListResponse.nextPage()).contains("string")
    }
}
