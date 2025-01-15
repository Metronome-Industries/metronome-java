// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerCommitCreateParamsTest {

    @Test
    fun createCustomerCommitCreateParams() {
        CustomerCommitCreateParams.builder()
            .accessSchedule(
                CustomerCommitCreateParams.AccessSchedule.builder()
                    .addScheduleItem(
                        CustomerCommitCreateParams.AccessSchedule.ScheduleItem.builder()
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
            .type(CustomerCommitCreateParams.Type.PREPAID)
            .addApplicableContractId("string")
            .addApplicableProductId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addApplicableProductTag("string")
            .customFields(
                CustomerCommitCreateParams.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .description("description")
            .invoiceContractId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .invoiceSchedule(
                CustomerCommitCreateParams.InvoiceSchedule.builder()
                    .creditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                    .recurringSchedule(
                        CustomerCommitCreateParams.InvoiceSchedule.RecurringSchedule.builder()
                            .amountDistribution(
                                CustomerCommitCreateParams.InvoiceSchedule.RecurringSchedule
                                    .AmountDistribution
                                    .DIVIDED
                            )
                            .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .frequency(
                                CustomerCommitCreateParams.InvoiceSchedule.RecurringSchedule
                                    .Frequency
                                    .MONTHLY
                            )
                            .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .amount(0.0)
                            .quantity(0.0)
                            .unitPrice(0.0)
                            .build()
                    )
                    .addScheduleItem(
                        CustomerCommitCreateParams.InvoiceSchedule.ScheduleItem.builder()
                            .timestamp(OffsetDateTime.parse("2020-03-01T00:00:00.000Z"))
                            .amount(0.0)
                            .quantity(1.0)
                            .unitPrice(10000000.0)
                            .build()
                    )
                    .build()
            )
            .name("My Commit")
            .netsuiteSalesOrderId("netsuite_sales_order_id")
            .rateType(CustomerCommitCreateParams.RateType.COMMIT_RATE)
            .salesforceOpportunityId("salesforce_opportunity_id")
            .uniquenessKey("x")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            CustomerCommitCreateParams.builder()
                .accessSchedule(
                    CustomerCommitCreateParams.AccessSchedule.builder()
                        .addScheduleItem(
                            CustomerCommitCreateParams.AccessSchedule.ScheduleItem.builder()
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
                .type(CustomerCommitCreateParams.Type.PREPAID)
                .addApplicableContractId("string")
                .addApplicableProductId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addApplicableProductTag("string")
                .customFields(
                    CustomerCommitCreateParams.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .description("description")
                .invoiceContractId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .invoiceSchedule(
                    CustomerCommitCreateParams.InvoiceSchedule.builder()
                        .creditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                        .recurringSchedule(
                            CustomerCommitCreateParams.InvoiceSchedule.RecurringSchedule.builder()
                                .amountDistribution(
                                    CustomerCommitCreateParams.InvoiceSchedule.RecurringSchedule
                                        .AmountDistribution
                                        .DIVIDED
                                )
                                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .frequency(
                                    CustomerCommitCreateParams.InvoiceSchedule.RecurringSchedule
                                        .Frequency
                                        .MONTHLY
                                )
                                .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .amount(0.0)
                                .quantity(0.0)
                                .unitPrice(0.0)
                                .build()
                        )
                        .addScheduleItem(
                            CustomerCommitCreateParams.InvoiceSchedule.ScheduleItem.builder()
                                .timestamp(OffsetDateTime.parse("2020-03-01T00:00:00.000Z"))
                                .amount(0.0)
                                .quantity(1.0)
                                .unitPrice(10000000.0)
                                .build()
                        )
                        .build()
                )
                .name("My Commit")
                .netsuiteSalesOrderId("netsuite_sales_order_id")
                .rateType(CustomerCommitCreateParams.RateType.COMMIT_RATE)
                .salesforceOpportunityId("salesforce_opportunity_id")
                .uniquenessKey("x")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accessSchedule())
            .isEqualTo(
                CustomerCommitCreateParams.AccessSchedule.builder()
                    .addScheduleItem(
                        CustomerCommitCreateParams.AccessSchedule.ScheduleItem.builder()
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
        assertThat(body.type()).isEqualTo(CustomerCommitCreateParams.Type.PREPAID)
        assertThat(body.applicableContractIds()).contains(listOf("string"))
        assertThat(body.applicableProductIds())
            .contains(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        assertThat(body.applicableProductTags()).contains(listOf("string"))
        assertThat(body.customFields())
            .contains(
                CustomerCommitCreateParams.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.description()).contains("description")
        assertThat(body.invoiceContractId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.invoiceSchedule())
            .contains(
                CustomerCommitCreateParams.InvoiceSchedule.builder()
                    .creditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                    .recurringSchedule(
                        CustomerCommitCreateParams.InvoiceSchedule.RecurringSchedule.builder()
                            .amountDistribution(
                                CustomerCommitCreateParams.InvoiceSchedule.RecurringSchedule
                                    .AmountDistribution
                                    .DIVIDED
                            )
                            .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .frequency(
                                CustomerCommitCreateParams.InvoiceSchedule.RecurringSchedule
                                    .Frequency
                                    .MONTHLY
                            )
                            .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .amount(0.0)
                            .quantity(0.0)
                            .unitPrice(0.0)
                            .build()
                    )
                    .addScheduleItem(
                        CustomerCommitCreateParams.InvoiceSchedule.ScheduleItem.builder()
                            .timestamp(OffsetDateTime.parse("2020-03-01T00:00:00.000Z"))
                            .amount(0.0)
                            .quantity(1.0)
                            .unitPrice(10000000.0)
                            .build()
                    )
                    .build()
            )
        assertThat(body.name()).contains("My Commit")
        assertThat(body.netsuiteSalesOrderId()).contains("netsuite_sales_order_id")
        assertThat(body.rateType()).contains(CustomerCommitCreateParams.RateType.COMMIT_RATE)
        assertThat(body.salesforceOpportunityId()).contains("salesforce_opportunity_id")
        assertThat(body.uniquenessKey()).contains("x")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            CustomerCommitCreateParams.builder()
                .accessSchedule(
                    CustomerCommitCreateParams.AccessSchedule.builder()
                        .addScheduleItem(
                            CustomerCommitCreateParams.AccessSchedule.ScheduleItem.builder()
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
                .type(CustomerCommitCreateParams.Type.PREPAID)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accessSchedule())
            .isEqualTo(
                CustomerCommitCreateParams.AccessSchedule.builder()
                    .addScheduleItem(
                        CustomerCommitCreateParams.AccessSchedule.ScheduleItem.builder()
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
        assertThat(body.type()).isEqualTo(CustomerCommitCreateParams.Type.PREPAID)
    }
}
