// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PlanListCustomersResponseTest {

    @Test
    fun createPlanListCustomersResponse() {
        val planListCustomersResponse =
            PlanListCustomersResponse.builder()
                .data(
                    listOf(
                        PlanListCustomersResponse.Data.builder()
                            .customerDetails(
                                CustomerDetail.builder()
                                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .currentBillableStatus(
                                        CustomerDetail.CurrentBillableStatus.builder()
                                            .value(
                                                CustomerDetail.CurrentBillableStatus.Value.BILLABLE
                                            )
                                            .effectiveAt(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .build()
                                    )
                                    .customFields(CustomerDetail.CustomFields.builder().build())
                                    .customerConfig(
                                        CustomerDetail.CustomerConfig.builder()
                                            .salesforceAccountId("string")
                                            .build()
                                    )
                                    .externalId("string")
                                    .ingestAliases(listOf("string"))
                                    .name("string")
                                    .build()
                            )
                            .planDetails(
                                PlanListCustomersResponse.Data.PlanDetails.builder()
                                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .customFields(
                                        PlanListCustomersResponse.Data.PlanDetails.CustomFields
                                            .builder()
                                            .build()
                                    )
                                    .customerPlanId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .name("string")
                                    .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .build()
                            )
                            .build()
                    )
                )
                .nextPage("string")
                .build()
        assertThat(planListCustomersResponse).isNotNull
        assertThat(planListCustomersResponse.data())
            .containsExactly(
                PlanListCustomersResponse.Data.builder()
                    .customerDetails(
                        CustomerDetail.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .currentBillableStatus(
                                CustomerDetail.CurrentBillableStatus.builder()
                                    .value(CustomerDetail.CurrentBillableStatus.Value.BILLABLE)
                                    .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .build()
                            )
                            .customFields(CustomerDetail.CustomFields.builder().build())
                            .customerConfig(
                                CustomerDetail.CustomerConfig.builder()
                                    .salesforceAccountId("string")
                                    .build()
                            )
                            .externalId("string")
                            .ingestAliases(listOf("string"))
                            .name("string")
                            .build()
                    )
                    .planDetails(
                        PlanListCustomersResponse.Data.PlanDetails.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .customFields(
                                PlanListCustomersResponse.Data.PlanDetails.CustomFields.builder()
                                    .build()
                            )
                            .customerPlanId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .name("string")
                            .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .build()
            )
        assertThat(planListCustomersResponse.nextPage()).contains("string")
    }
}
