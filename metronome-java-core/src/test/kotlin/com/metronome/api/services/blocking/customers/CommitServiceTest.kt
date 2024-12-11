// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.customers

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClient
import com.metronome.api.core.JsonValue
import com.metronome.api.models.*
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CommitServiceTest {

    @Test
    fun callCreate() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val commitService = client.customers().commits()
        val customerCommitCreateResponse =
            commitService.create(
                CustomerCommitCreateParams.builder()
                    .accessSchedule(
                        CustomerCommitCreateParams.AccessSchedule.builder()
                            .scheduleItems(
                                listOf(
                                    CustomerCommitCreateParams.AccessSchedule.ScheduleItem.builder()
                                        .amount(0.0)
                                        .endingBefore(
                                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                        )
                                        .startingAt(
                                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                        )
                                        .build()
                                )
                            )
                            .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                    .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .priority(0.0)
                    .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .type(CustomerCommitCreateParams.Type.PREPAID)
                    .applicableContractIds(listOf("string"))
                    .applicableProductIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                    .applicableProductTags(listOf("string"))
                    .customFields(
                        CustomerCommitCreateParams.CustomFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .description("description")
                    .invoiceContractId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .invoiceSchedule(
                        CustomerCommitCreateParams.InvoiceSchedule.builder()
                            .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .recurringSchedule(
                                CustomerCommitCreateParams.InvoiceSchedule.RecurringSchedule
                                    .builder()
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
                            .scheduleItems(
                                listOf(
                                    CustomerCommitCreateParams.InvoiceSchedule.ScheduleItem
                                        .builder()
                                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .amount(0.0)
                                        .quantity(0.0)
                                        .unitPrice(0.0)
                                        .build()
                                )
                            )
                            .build()
                    )
                    .name("x")
                    .netsuiteSalesOrderId("netsuite_sales_order_id")
                    .rateType(CustomerCommitCreateParams.RateType.COMMIT_RATE)
                    .salesforceOpportunityId("salesforce_opportunity_id")
                    .build()
            )
        println(customerCommitCreateResponse)
        customerCommitCreateResponse.validate()
    }

    @Test
    fun callList() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val commitService = client.customers().commits()
        val customerCommitListResponse =
            commitService.list(
                CustomerCommitListParams.builder()
                    .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .commitId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .coveringDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .effectiveBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .includeArchived(true)
                    .includeContractCommits(true)
                    .includeLedgers(true)
                    .nextPage("next_page")
                    .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        println(customerCommitListResponse)
        customerCommitListResponse.validate()
    }

    @Test
    fun callUpdateEndDate() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val commitService = client.customers().commits()
        val customerCommitUpdateEndDateResponse =
            commitService.updateEndDate(
                CustomerCommitUpdateEndDateParams.builder()
                    .commitId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accessEndingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .invoicesEndingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        println(customerCommitUpdateEndDateResponse)
        customerCommitUpdateEndDateResponse.validate()
    }
}
