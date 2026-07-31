// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers.commits

import com.metronome.api.core.JsonValue
import com.metronome.api.models.CommitSpecifierInput
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommitCreateParamsTest {

    @Test
    fun create() {
        CommitCreateParams.builder()
            .accessSchedule(
                CommitCreateParams.AccessSchedule.builder()
                    .addScheduleItem(
                        CommitCreateParams.AccessSchedule.ScheduleItem.builder()
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
            .type(CommitCreateParams.Type.PREPAID)
            .addApplicableContractId("string")
            .addApplicableProductId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addApplicableProductTag("string")
            .customFields(
                CommitCreateParams.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .description("description")
            .invoiceContractId("e57d6929-c2f1-4796-a9a8-63cedefe848d")
            .invoiceSchedule(
                CommitCreateParams.InvoiceSchedule.builder()
                    .creditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                    .doNotInvoice(false)
                    .recurringSchedule(
                        CommitCreateParams.InvoiceSchedule.RecurringSchedule.builder()
                            .amountDistribution(
                                CommitCreateParams.InvoiceSchedule.RecurringSchedule
                                    .AmountDistribution
                                    .DIVIDED
                            )
                            .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .frequency(
                                CommitCreateParams.InvoiceSchedule.RecurringSchedule.Frequency
                                    .MONTHLY
                            )
                            .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .amount(0.0)
                            .quantity(0.0)
                            .unitPrice(0.0)
                            .build()
                    )
                    .addScheduleItem(
                        CommitCreateParams.InvoiceSchedule.ScheduleItem.builder()
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
            .rateType(CommitCreateParams.RateType.COMMIT_RATE)
            .salesforceOpportunityId("salesforce_opportunity_id")
            .addSpecifier(
                CommitSpecifierInput.builder()
                    .presentationGroupValues(
                        CommitSpecifierInput.PresentationGroupValues.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .pricingGroupValues(
                        CommitSpecifierInput.PricingGroupValues.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addProductTag("string")
                    .build()
            )
            .uniquenessKey("x")
            .build()
    }

    @Test
    fun body() {
        val params =
            CommitCreateParams.builder()
                .accessSchedule(
                    CommitCreateParams.AccessSchedule.builder()
                        .addScheduleItem(
                            CommitCreateParams.AccessSchedule.ScheduleItem.builder()
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
                .type(CommitCreateParams.Type.PREPAID)
                .addApplicableContractId("string")
                .addApplicableProductId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addApplicableProductTag("string")
                .customFields(
                    CommitCreateParams.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .description("description")
                .invoiceContractId("e57d6929-c2f1-4796-a9a8-63cedefe848d")
                .invoiceSchedule(
                    CommitCreateParams.InvoiceSchedule.builder()
                        .creditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                        .doNotInvoice(false)
                        .recurringSchedule(
                            CommitCreateParams.InvoiceSchedule.RecurringSchedule.builder()
                                .amountDistribution(
                                    CommitCreateParams.InvoiceSchedule.RecurringSchedule
                                        .AmountDistribution
                                        .DIVIDED
                                )
                                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .frequency(
                                    CommitCreateParams.InvoiceSchedule.RecurringSchedule.Frequency
                                        .MONTHLY
                                )
                                .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .amount(0.0)
                                .quantity(0.0)
                                .unitPrice(0.0)
                                .build()
                        )
                        .addScheduleItem(
                            CommitCreateParams.InvoiceSchedule.ScheduleItem.builder()
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
                .rateType(CommitCreateParams.RateType.COMMIT_RATE)
                .salesforceOpportunityId("salesforce_opportunity_id")
                .addSpecifier(
                    CommitSpecifierInput.builder()
                        .presentationGroupValues(
                            CommitSpecifierInput.PresentationGroupValues.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .pricingGroupValues(
                            CommitSpecifierInput.PricingGroupValues.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addProductTag("string")
                        .build()
                )
                .uniquenessKey("x")
                .build()

        val body = params._body()

        assertThat(body.accessSchedule())
            .isEqualTo(
                CommitCreateParams.AccessSchedule.builder()
                    .addScheduleItem(
                        CommitCreateParams.AccessSchedule.ScheduleItem.builder()
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
        assertThat(body.type()).isEqualTo(CommitCreateParams.Type.PREPAID)
        assertThat(body.applicableContractIds().getOrNull()).containsExactly("string")
        assertThat(body.applicableProductIds().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.applicableProductTags().getOrNull()).containsExactly("string")
        assertThat(body.customFields())
            .contains(
                CommitCreateParams.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.description()).contains("description")
        assertThat(body.invoiceContractId()).contains("e57d6929-c2f1-4796-a9a8-63cedefe848d")
        assertThat(body.invoiceSchedule())
            .contains(
                CommitCreateParams.InvoiceSchedule.builder()
                    .creditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                    .doNotInvoice(false)
                    .recurringSchedule(
                        CommitCreateParams.InvoiceSchedule.RecurringSchedule.builder()
                            .amountDistribution(
                                CommitCreateParams.InvoiceSchedule.RecurringSchedule
                                    .AmountDistribution
                                    .DIVIDED
                            )
                            .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .frequency(
                                CommitCreateParams.InvoiceSchedule.RecurringSchedule.Frequency
                                    .MONTHLY
                            )
                            .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .amount(0.0)
                            .quantity(0.0)
                            .unitPrice(0.0)
                            .build()
                    )
                    .addScheduleItem(
                        CommitCreateParams.InvoiceSchedule.ScheduleItem.builder()
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
        assertThat(body.rateType()).contains(CommitCreateParams.RateType.COMMIT_RATE)
        assertThat(body.salesforceOpportunityId()).contains("salesforce_opportunity_id")
        assertThat(body.specifiers().getOrNull())
            .containsExactly(
                CommitSpecifierInput.builder()
                    .presentationGroupValues(
                        CommitSpecifierInput.PresentationGroupValues.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .pricingGroupValues(
                        CommitSpecifierInput.PricingGroupValues.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addProductTag("string")
                    .build()
            )
        assertThat(body.uniquenessKey()).contains("x")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CommitCreateParams.builder()
                .accessSchedule(
                    CommitCreateParams.AccessSchedule.builder()
                        .addScheduleItem(
                            CommitCreateParams.AccessSchedule.ScheduleItem.builder()
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
                .type(CommitCreateParams.Type.PREPAID)
                .build()

        val body = params._body()

        assertThat(body.accessSchedule())
            .isEqualTo(
                CommitCreateParams.AccessSchedule.builder()
                    .addScheduleItem(
                        CommitCreateParams.AccessSchedule.ScheduleItem.builder()
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
        assertThat(body.type()).isEqualTo(CommitCreateParams.Type.PREPAID)
    }
}
