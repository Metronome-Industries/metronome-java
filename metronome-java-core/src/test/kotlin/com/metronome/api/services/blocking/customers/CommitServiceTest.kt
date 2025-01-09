// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.customers

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClient
import com.metronome.api.core.JsonValue
import com.metronome.api.models.CustomerCommitCreateParams
import com.metronome.api.models.CustomerCommitListParams
import com.metronome.api.models.CustomerCommitUpdateEndDateParams
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
                                        .amount(1000.0)
                                        .endingBefore(
                                            OffsetDateTime.parse("2020-02-01T00:00:00.000Z")
                                        )
                                        .startingAt(
                                            OffsetDateTime.parse("2020-01-01T00:00:00.000Z")
                                        )
                                        .build()
                                )
                            )
                            .creditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                            .build()
                    )
                    .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                    .priority(100.0)
                    .productId("f14d6729-6a44-4b13-9908-9387f1918790")
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
                            .creditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
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
                                        .timestamp(OffsetDateTime.parse("2020-03-01T00:00:00.000Z"))
                                        .amount(0.0)
                                        .quantity(1.0)
                                        .unitPrice(10000000.0)
                                        .build()
                                )
                            )
                            .build()
                    )
                    .name("My Commit")
                    .netsuiteSalesOrderId("netsuite_sales_order_id")
                    .rateType(CustomerCommitCreateParams.RateType.COMMIT_RATE)
                    .salesforceOpportunityId("salesforce_opportunity_id")
                    .uniquenessKey("x")
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
                    .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                    .commitId("6162d87b-e5db-4a33-b7f2-76ce6ead4e85")
                    .coveringDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .effectiveBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .includeArchived(true)
                    .includeBalance(true)
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
                    .commitId("6162d87b-e5db-4a33-b7f2-76ce6ead4e85")
                    .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                    .accessEndingBefore(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .invoicesEndingBefore(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build()
            )
        println(customerCommitUpdateEndDateResponse)
        customerCommitUpdateEndDateResponse.validate()
    }
}
