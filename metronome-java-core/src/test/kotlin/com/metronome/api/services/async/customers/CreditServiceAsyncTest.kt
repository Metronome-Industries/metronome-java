// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.customers

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClientAsync
import com.metronome.api.core.JsonValue
import com.metronome.api.models.CustomerCreditCreateParams
import com.metronome.api.models.CustomerCreditListParams
import com.metronome.api.models.CustomerCreditUpdateEndDateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CreditServiceAsyncTest {

    @Test
    fun create() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val creditServiceAsync = client.customers().credits()

        val creditFuture =
            creditServiceAsync.create(
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
            )

        val credit = creditFuture.get()
        credit.validate()
    }

    @Test
    fun list() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val creditServiceAsync = client.customers().credits()

        val creditFuture =
            creditServiceAsync.list(
                CustomerCreditListParams.builder()
                    .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                    .coveringDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .creditId("6162d87b-e5db-4a33-b7f2-76ce6ead4e85")
                    .effectiveBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .includeArchived(true)
                    .includeBalance(true)
                    .includeContractCredits(true)
                    .includeLedgers(true)
                    .nextPage("next_page")
                    .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val credit = creditFuture.get()
        credit.validate()
    }

    @Test
    fun updateEndDate() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val creditServiceAsync = client.customers().credits()

        val responseFuture =
            creditServiceAsync.updateEndDate(
                CustomerCreditUpdateEndDateParams.builder()
                    .accessEndingBefore(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .creditId("6162d87b-e5db-4a33-b7f2-76ce6ead4e85")
                    .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
