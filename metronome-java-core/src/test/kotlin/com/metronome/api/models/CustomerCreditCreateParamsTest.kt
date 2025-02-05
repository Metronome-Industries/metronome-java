// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerCreditCreateParamsTest {

    @Test
    fun create() {
        CustomerCreditCreateParams.builder()
            .accessSchedule(
                CustomerCreditCreateParams.AccessSchedule.builder()
                    .addScheduleItem(
                        CustomerCreditCreateParams.AccessSchedule.ScheduleItem.builder()
                            .amount(1000.0)
                            .endingBefore(OffsetDateTime.parse("2020-02-01T00:00:00.000Z"))
                            .startingAt(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                            .build()
                    )
                    .creditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                    .build()
            )
            .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
            .priority(100.0)
            .productId("f14d6729-6a44-4b13-9908-9387f1918790")
            .addApplicableContractId("string")
            .addApplicableProductId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addApplicableProductTag("string")
            .customFields(
                CustomerCreditCreateParams.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .description("description")
            .name("My Credit")
            .netsuiteSalesOrderId("netsuite_sales_order_id")
            .rateType(CustomerCreditCreateParams.RateType.COMMIT_RATE)
            .salesforceOpportunityId("salesforce_opportunity_id")
            .uniquenessKey("x")
            .build()
    }

    @Test
    fun body() {
        val params =
            CustomerCreditCreateParams.builder()
                .accessSchedule(
                    CustomerCreditCreateParams.AccessSchedule.builder()
                        .addScheduleItem(
                            CustomerCreditCreateParams.AccessSchedule.ScheduleItem.builder()
                                .amount(1000.0)
                                .endingBefore(OffsetDateTime.parse("2020-02-01T00:00:00.000Z"))
                                .startingAt(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                                .build()
                        )
                        .creditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                        .build()
                )
                .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                .priority(100.0)
                .productId("f14d6729-6a44-4b13-9908-9387f1918790")
                .addApplicableContractId("string")
                .addApplicableProductId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addApplicableProductTag("string")
                .customFields(
                    CustomerCreditCreateParams.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .description("description")
                .name("My Credit")
                .netsuiteSalesOrderId("netsuite_sales_order_id")
                .rateType(CustomerCreditCreateParams.RateType.COMMIT_RATE)
                .salesforceOpportunityId("salesforce_opportunity_id")
                .uniquenessKey("x")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.accessSchedule())
            .isEqualTo(
                CustomerCreditCreateParams.AccessSchedule.builder()
                    .addScheduleItem(
                        CustomerCreditCreateParams.AccessSchedule.ScheduleItem.builder()
                            .amount(1000.0)
                            .endingBefore(OffsetDateTime.parse("2020-02-01T00:00:00.000Z"))
                            .startingAt(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                            .build()
                    )
                    .creditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                    .build()
            )
        assertThat(body.customerId()).isEqualTo("13117714-3f05-48e5-a6e9-a66093f13b4d")
        assertThat(body.priority()).isEqualTo(100.0)
        assertThat(body.productId()).isEqualTo("f14d6729-6a44-4b13-9908-9387f1918790")
        assertThat(body.applicableContractIds()).contains(listOf("string"))
        assertThat(body.applicableProductIds())
            .contains(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        assertThat(body.applicableProductTags()).contains(listOf("string"))
        assertThat(body.customFields())
            .contains(
                CustomerCreditCreateParams.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.description()).contains("description")
        assertThat(body.name()).contains("My Credit")
        assertThat(body.netsuiteSalesOrderId()).contains("netsuite_sales_order_id")
        assertThat(body.rateType()).contains(CustomerCreditCreateParams.RateType.COMMIT_RATE)
        assertThat(body.salesforceOpportunityId()).contains("salesforce_opportunity_id")
        assertThat(body.uniquenessKey()).contains("x")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CustomerCreditCreateParams.builder()
                .accessSchedule(
                    CustomerCreditCreateParams.AccessSchedule.builder()
                        .addScheduleItem(
                            CustomerCreditCreateParams.AccessSchedule.ScheduleItem.builder()
                                .amount(1000.0)
                                .endingBefore(OffsetDateTime.parse("2020-02-01T00:00:00.000Z"))
                                .startingAt(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                                .build()
                        )
                        .build()
                )
                .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                .priority(100.0)
                .productId("f14d6729-6a44-4b13-9908-9387f1918790")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.accessSchedule())
            .isEqualTo(
                CustomerCreditCreateParams.AccessSchedule.builder()
                    .addScheduleItem(
                        CustomerCreditCreateParams.AccessSchedule.ScheduleItem.builder()
                            .amount(1000.0)
                            .endingBefore(OffsetDateTime.parse("2020-02-01T00:00:00.000Z"))
                            .startingAt(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                            .build()
                    )
                    .build()
            )
        assertThat(body.customerId()).isEqualTo("13117714-3f05-48e5-a6e9-a66093f13b4d")
        assertThat(body.priority()).isEqualTo(100.0)
        assertThat(body.productId()).isEqualTo("f14d6729-6a44-4b13-9908-9387f1918790")
    }
}
