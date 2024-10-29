// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.customers

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClient
import com.metronome.api.models.*
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CreditServiceTest {

    @Test
    fun callCreate() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val creditService = client.customers().credits()
        val customerCreditCreateResponse =
            creditService.create(
                CustomerCreditCreateParams.builder()
                    .accessSchedule(
                        CustomerCreditCreateParams.AccessSchedule.builder()
                            .scheduleItems(
                                listOf(
                                    CustomerCreditCreateParams.AccessSchedule.ScheduleItem.builder()
                                        .amount(42.23)
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
                    .priority(42.23)
                    .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .applicableContractIds(listOf("string"))
                    .applicableProductIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                    .applicableProductTags(listOf("string"))
                    .customFields(CustomerCreditCreateParams.CustomFields.builder().build())
                    .description("description")
                    .name("x")
                    .netsuiteSalesOrderId("netsuite_sales_order_id")
                    .salesforceOpportunityId("salesforce_opportunity_id")
                    .build()
            )
        println(customerCreditCreateResponse)
        customerCreditCreateResponse.validate()
    }

    @Test
    fun callList() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val creditService = client.customers().credits()
        val customerCreditListResponse =
            creditService.list(
                CustomerCreditListParams.builder()
                    .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .coveringDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .creditId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .effectiveBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .includeArchived(true)
                    .includeContractCredits(true)
                    .includeLedgers(true)
                    .nextPage("next_page")
                    .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        println(customerCreditListResponse)
        customerCreditListResponse.validate()
    }

    @Test
    fun callUpdateEndDate() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val creditService = client.customers().credits()
        val customerCreditUpdateEndDateResponse =
            creditService.updateEndDate(
                CustomerCreditUpdateEndDateParams.builder()
                    .accessEndingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .creditId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(customerCreditUpdateEndDateResponse)
        customerCreditUpdateEndDateResponse.validate()
    }
}
