// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v1.customers

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClientAsync
import com.metronome.api.core.JsonValue
import com.metronome.api.models.CommitSpecifierInput
import com.metronome.api.models.v1.customers.commits.CommitCreateParams
import com.metronome.api.models.v1.customers.commits.CommitListParams
import com.metronome.api.models.v1.customers.commits.CommitUpdateEndDateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CommitServiceAsyncTest {

    @Test
    fun create() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val commitServiceAsync = client.v1().customers().commits()

        val commitFuture =
            commitServiceAsync.create(
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
                                        CommitCreateParams.InvoiceSchedule.RecurringSchedule
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
            )

        val commit = commitFuture.get()
        commit.validate()
    }

    @Test
    fun list() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val commitServiceAsync = client.v1().customers().commits()

        val pageFuture =
            commitServiceAsync.list(
                CommitListParams.builder()
                    .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                    .build()
            )

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun updateEndDate() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val commitServiceAsync = client.v1().customers().commits()

        val responseFuture =
            commitServiceAsync.updateEndDate(
                CommitUpdateEndDateParams.builder()
                    .commitId("6162d87b-e5db-4a33-b7f2-76ce6ead4e85")
                    .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                    .accessEndingBefore(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .invoicesEndingBefore(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
