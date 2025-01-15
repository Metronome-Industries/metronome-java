// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PlanListCustomersResponseTest {

    @Test
    fun createPlanListCustomersResponse() {
        val planListCustomersResponse =
            PlanListCustomersResponse.builder()
                .customerDetails(
                    CustomerDetail.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .customFields(
                            CustomerDetail.CustomFields.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .customerConfig(
                            CustomerDetail.CustomerConfig.builder()
                                .salesforceAccountId("salesforce_account_id")
                                .build()
                        )
                        .externalId("external_id")
                        .addIngestAlias("string")
                        .name("name")
                        .currentBillableStatus(
                            CustomerDetail.CurrentBillableStatus.builder()
                                .value(CustomerDetail.CurrentBillableStatus.Value.BILLABLE)
                                .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .build()
                )
                .planDetails(
                    PlanListCustomersResponse.PlanDetails.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .customFields(
                            PlanListCustomersResponse.PlanDetails.CustomFields.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .customerPlanId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()
        assertThat(planListCustomersResponse).isNotNull
        assertThat(planListCustomersResponse.customerDetails())
            .isEqualTo(
                CustomerDetail.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .customFields(
                        CustomerDetail.CustomFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .customerConfig(
                        CustomerDetail.CustomerConfig.builder()
                            .salesforceAccountId("salesforce_account_id")
                            .build()
                    )
                    .externalId("external_id")
                    .addIngestAlias("string")
                    .name("name")
                    .currentBillableStatus(
                        CustomerDetail.CurrentBillableStatus.builder()
                            .value(CustomerDetail.CurrentBillableStatus.Value.BILLABLE)
                            .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .build()
            )
        assertThat(planListCustomersResponse.planDetails())
            .isEqualTo(
                PlanListCustomersResponse.PlanDetails.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .customFields(
                        PlanListCustomersResponse.PlanDetails.CustomFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .customerPlanId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }
}
