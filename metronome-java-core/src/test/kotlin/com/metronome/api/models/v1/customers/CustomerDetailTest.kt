// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.JsonValue
import com.metronome.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerDetailTest {

    @Test
    fun create() {
        val customerDetail =
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
                        .value(CustomerDetail.CurrentBillableStatus.Value_.BILLABLE)
                        .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(customerDetail.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(customerDetail.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
        assertThat(customerDetail.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(customerDetail.archivedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(customerDetail.currentBillableStatus())
            .contains(
                CustomerDetail.CurrentBillableStatus.builder()
                    .value(CustomerDetail.CurrentBillableStatus.Value_.BILLABLE)
                    .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerDetail =
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
                        .value(CustomerDetail.CurrentBillableStatus.Value_.BILLABLE)
                        .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedCustomerDetail =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerDetail),
                jacksonTypeRef<CustomerDetail>(),
            )

        assertThat(roundtrippedCustomerDetail).isEqualTo(customerDetail)
    }
}
