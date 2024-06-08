// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerListResponseTest {

    @Test
    fun createCustomerListResponse() {
        val customerListResponse =
            CustomerListResponse.builder()
                .data(
                    listOf(
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
                )
                .nextPage("string")
                .build()
        assertThat(customerListResponse).isNotNull
        assertThat(customerListResponse.data())
            .containsExactly(
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
        assertThat(customerListResponse.nextPage()).contains("string")
    }
}
