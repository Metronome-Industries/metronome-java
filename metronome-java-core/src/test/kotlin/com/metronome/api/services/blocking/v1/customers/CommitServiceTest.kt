// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1.customers

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClient
import com.metronome.api.core.JsonValue
import com.metronome.api.models.CommitSpecifierInput
import com.metronome.api.models.V1CustomerCommitCreateParams
import com.metronome.api.models.V1CustomerCommitListParams
import com.metronome.api.models.V1CustomerCommitUpdateEndDateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CommitServiceTest {

    @Test
    fun create() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val commitService = client.v1().customers().commits()

        val commit =
            commitService.create(
                V1CustomerCommitCreateParams.builder()
                    .accessSchedule(
                        V1CustomerCommitCreateParams.AccessSchedule.builder()
                            .addScheduleItem(
                                V1CustomerCommitCreateParams.AccessSchedule.ScheduleItem.builder()
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
                    .type(V1CustomerCommitCreateParams.Type.PREPAID)
                    .addApplicableContractId("string")
                    .addApplicableProductId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addApplicableProductTag("string")
                    .customFields(
                        V1CustomerCommitCreateParams.CustomFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .description("description")
                    .invoiceContractId("e57d6929-c2f1-4796-a9a8-63cedefe848d")
                    .invoiceSchedule(
                        V1CustomerCommitCreateParams.InvoiceSchedule.builder()
                            .creditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                            .doNotInvoice(false)
                            .recurringSchedule(
                                V1CustomerCommitCreateParams.InvoiceSchedule.RecurringSchedule
                                    .builder()
                                    .amountDistribution(
                                        V1CustomerCommitCreateParams.InvoiceSchedule
                                            .RecurringSchedule
                                            .AmountDistribution
                                            .DIVIDED
                                    )
                                    .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .frequency(
                                        V1CustomerCommitCreateParams.InvoiceSchedule
                                            .RecurringSchedule
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
                                V1CustomerCommitCreateParams.InvoiceSchedule.ScheduleItem.builder()
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
                    .rateType(V1CustomerCommitCreateParams.RateType.COMMIT_RATE)
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

        commit.validate()
    }

    @Test
    fun list() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val commitService = client.v1().customers().commits()

        val page =
            commitService.list(
                V1CustomerCommitListParams.builder()
                    .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                    .build()
            )

        page.response().validate()
    }

    @Test
    fun updateEndDate() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val commitService = client.v1().customers().commits()

        val response =
            commitService.updateEndDate(
                V1CustomerCommitUpdateEndDateParams.builder()
                    .commitId("6162d87b-e5db-4a33-b7f2-76ce6ead4e85")
                    .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                    .accessEndingBefore(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .invoicesEndingBefore(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build()
            )

        response.validate()
    }
}
