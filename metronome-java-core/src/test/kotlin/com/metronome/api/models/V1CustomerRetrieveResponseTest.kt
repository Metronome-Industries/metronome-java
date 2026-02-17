// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1CustomerRetrieveResponseTest {

    @Test
    fun createV1CustomerRetrieveResponse() {
        val v1CustomerRetrieveResponse =
            V1CustomerRetrieveResponse.builder()
                .data(
                    CustomerDetail.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currentBillableStatus(
                            CustomerDetail.CurrentBillableStatus.builder()
                                .value(CustomerDetail.CurrentBillableStatus.Value.BILLABLE)
                                .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .build()
                )
                .build()
        assertThat(v1CustomerRetrieveResponse).isNotNull
        assertThat(v1CustomerRetrieveResponse.data())
            .isEqualTo(
                CustomerDetail.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .currentBillableStatus(
                        CustomerDetail.CurrentBillableStatus.builder()
                            .value(CustomerDetail.CurrentBillableStatus.Value.BILLABLE)
                            .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .build()
            )
    }
}
