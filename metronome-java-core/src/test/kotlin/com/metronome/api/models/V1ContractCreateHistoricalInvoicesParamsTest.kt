// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import java.time.OffsetDateTime
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1ContractCreateHistoricalInvoicesParamsTest {

    @Test
    fun create() {
        V1ContractCreateHistoricalInvoicesParams.builder()
            .addInvoice(
                V1ContractCreateHistoricalInvoicesParams.Invoice.builder()
                    .contractId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .creditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                    .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                    .exclusiveEndDate(OffsetDateTime.parse("2020-02-01T00:00:00.000Z"))
                    .inclusiveStartDate(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .issueDate(OffsetDateTime.parse("2020-02-01T00:00:00.000Z"))
                    .addUsageLineItem(
                        V1ContractCreateHistoricalInvoicesParams.Invoice.UsageLineItem.builder()
                            .exclusiveEndDate(OffsetDateTime.parse("2020-02-01T00:00:00.000Z"))
                            .inclusiveStartDate(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                            .productId("f14d6729-6a44-4b13-9908-9387f1918790")
                            .presentationGroupValues(
                                V1ContractCreateHistoricalInvoicesParams.Invoice.UsageLineItem
                                    .PresentationGroupValues
                                    .builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .pricingGroupValues(
                                V1ContractCreateHistoricalInvoicesParams.Invoice.UsageLineItem
                                    .PricingGroupValues
                                    .builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .quantity(100.0)
                            .addSubtotalsWithQuantity(
                                V1ContractCreateHistoricalInvoicesParams.Invoice.UsageLineItem
                                    .SubtotalsWithQuantity
                                    .builder()
                                    .exclusiveEndDate(
                                        OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                    )
                                    .inclusiveStartDate(
                                        OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                    )
                                    .quantity(0.0)
                                    .build()
                            )
                            .build()
                    )
                    .billableStatus(
                        V1ContractCreateHistoricalInvoicesParams.Invoice.BillableStatus.BILLABLE
                    )
                    .breakdownGranularity(
                        V1ContractCreateHistoricalInvoicesParams.Invoice.BreakdownGranularity.HOUR
                    )
                    .customFields(
                        V1ContractCreateHistoricalInvoicesParams.Invoice.CustomFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
            .preview(false)
            .build()
    }

    @Test
    fun body() {
        val params =
            V1ContractCreateHistoricalInvoicesParams.builder()
                .addInvoice(
                    V1ContractCreateHistoricalInvoicesParams.Invoice.builder()
                        .contractId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                        .creditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                        .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                        .exclusiveEndDate(OffsetDateTime.parse("2020-02-01T00:00:00.000Z"))
                        .inclusiveStartDate(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                        .issueDate(OffsetDateTime.parse("2020-02-01T00:00:00.000Z"))
                        .addUsageLineItem(
                            V1ContractCreateHistoricalInvoicesParams.Invoice.UsageLineItem.builder()
                                .exclusiveEndDate(OffsetDateTime.parse("2020-02-01T00:00:00.000Z"))
                                .inclusiveStartDate(
                                    OffsetDateTime.parse("2020-01-01T00:00:00.000Z")
                                )
                                .productId("f14d6729-6a44-4b13-9908-9387f1918790")
                                .presentationGroupValues(
                                    V1ContractCreateHistoricalInvoicesParams.Invoice.UsageLineItem
                                        .PresentationGroupValues
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .pricingGroupValues(
                                    V1ContractCreateHistoricalInvoicesParams.Invoice.UsageLineItem
                                        .PricingGroupValues
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .quantity(100.0)
                                .addSubtotalsWithQuantity(
                                    V1ContractCreateHistoricalInvoicesParams.Invoice.UsageLineItem
                                        .SubtotalsWithQuantity
                                        .builder()
                                        .exclusiveEndDate(
                                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                        )
                                        .inclusiveStartDate(
                                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                        )
                                        .quantity(0.0)
                                        .build()
                                )
                                .build()
                        )
                        .billableStatus(
                            V1ContractCreateHistoricalInvoicesParams.Invoice.BillableStatus.BILLABLE
                        )
                        .breakdownGranularity(
                            V1ContractCreateHistoricalInvoicesParams.Invoice.BreakdownGranularity
                                .HOUR
                        )
                        .customFields(
                            V1ContractCreateHistoricalInvoicesParams.Invoice.CustomFields.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .preview(false)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.invoices())
            .isEqualTo(
                listOf(
                    V1ContractCreateHistoricalInvoicesParams.Invoice.builder()
                        .contractId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                        .creditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                        .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                        .exclusiveEndDate(OffsetDateTime.parse("2020-02-01T00:00:00.000Z"))
                        .inclusiveStartDate(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                        .issueDate(OffsetDateTime.parse("2020-02-01T00:00:00.000Z"))
                        .addUsageLineItem(
                            V1ContractCreateHistoricalInvoicesParams.Invoice.UsageLineItem.builder()
                                .exclusiveEndDate(OffsetDateTime.parse("2020-02-01T00:00:00.000Z"))
                                .inclusiveStartDate(
                                    OffsetDateTime.parse("2020-01-01T00:00:00.000Z")
                                )
                                .productId("f14d6729-6a44-4b13-9908-9387f1918790")
                                .presentationGroupValues(
                                    V1ContractCreateHistoricalInvoicesParams.Invoice.UsageLineItem
                                        .PresentationGroupValues
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .pricingGroupValues(
                                    V1ContractCreateHistoricalInvoicesParams.Invoice.UsageLineItem
                                        .PricingGroupValues
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .quantity(100.0)
                                .addSubtotalsWithQuantity(
                                    V1ContractCreateHistoricalInvoicesParams.Invoice.UsageLineItem
                                        .SubtotalsWithQuantity
                                        .builder()
                                        .exclusiveEndDate(
                                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                        )
                                        .inclusiveStartDate(
                                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                        )
                                        .quantity(0.0)
                                        .build()
                                )
                                .build()
                        )
                        .billableStatus(
                            V1ContractCreateHistoricalInvoicesParams.Invoice.BillableStatus.BILLABLE
                        )
                        .breakdownGranularity(
                            V1ContractCreateHistoricalInvoicesParams.Invoice.BreakdownGranularity
                                .HOUR
                        )
                        .customFields(
                            V1ContractCreateHistoricalInvoicesParams.Invoice.CustomFields.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
            )
        assertThat(body.preview()).isEqualTo(false)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            V1ContractCreateHistoricalInvoicesParams.builder()
                .addInvoice(
                    V1ContractCreateHistoricalInvoicesParams.Invoice.builder()
                        .contractId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                        .creditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                        .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                        .exclusiveEndDate(OffsetDateTime.parse("2020-02-01T00:00:00.000Z"))
                        .inclusiveStartDate(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                        .issueDate(OffsetDateTime.parse("2020-02-01T00:00:00.000Z"))
                        .addUsageLineItem(
                            V1ContractCreateHistoricalInvoicesParams.Invoice.UsageLineItem.builder()
                                .exclusiveEndDate(OffsetDateTime.parse("2020-02-01T00:00:00.000Z"))
                                .inclusiveStartDate(
                                    OffsetDateTime.parse("2020-01-01T00:00:00.000Z")
                                )
                                .productId("f14d6729-6a44-4b13-9908-9387f1918790")
                                .build()
                        )
                        .build()
                )
                .preview(false)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.invoices())
            .isEqualTo(
                listOf(
                    V1ContractCreateHistoricalInvoicesParams.Invoice.builder()
                        .contractId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                        .creditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                        .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                        .exclusiveEndDate(OffsetDateTime.parse("2020-02-01T00:00:00.000Z"))
                        .inclusiveStartDate(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                        .issueDate(OffsetDateTime.parse("2020-02-01T00:00:00.000Z"))
                        .addUsageLineItem(
                            V1ContractCreateHistoricalInvoicesParams.Invoice.UsageLineItem.builder()
                                .exclusiveEndDate(OffsetDateTime.parse("2020-02-01T00:00:00.000Z"))
                                .inclusiveStartDate(
                                    OffsetDateTime.parse("2020-01-01T00:00:00.000Z")
                                )
                                .productId("f14d6729-6a44-4b13-9908-9387f1918790")
                                .build()
                        )
                        .build()
                )
            )
        assertThat(body.preview()).isEqualTo(false)
    }
}
