// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerDetailTest {

    @Test
    fun createCustomerDetail() {
        val customerDetail =
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
                .ingestAliases(listOf("string"))
                .name("name")
                .currentBillableStatus(
                    CustomerDetail.CurrentBillableStatus.builder()
                        .value(CustomerDetail.CurrentBillableStatus.Value.BILLABLE)
                        .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()
        assertThat(customerDetail).isNotNull
        assertThat(customerDetail.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(customerDetail.customFields())
            .isEqualTo(
                CustomerDetail.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(customerDetail.customerConfig())
            .isEqualTo(
                CustomerDetail.CustomerConfig.builder()
                    .salesforceAccountId("salesforce_account_id")
                    .build()
            )
        assertThat(customerDetail.externalId()).isEqualTo("external_id")
        assertThat(customerDetail.ingestAliases()).containsExactly("string")
        assertThat(customerDetail.name()).isEqualTo("name")
        assertThat(customerDetail.currentBillableStatus())
            .contains(
                CustomerDetail.CurrentBillableStatus.builder()
                    .value(CustomerDetail.CurrentBillableStatus.Value.BILLABLE)
                    .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }
}
