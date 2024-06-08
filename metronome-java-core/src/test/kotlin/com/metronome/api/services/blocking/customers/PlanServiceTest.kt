// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.customers

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClient
import com.metronome.api.models.*
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class PlanServiceTest {

    @Test
    fun callList() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val planService = client.customers().plans()
        val customerPlanListResponse =
            planService.list(
                CustomerPlanListParams.builder()
                    .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .limit(100L)
                    .nextPage("string")
                    .build()
            )
        println(customerPlanListResponse)
        customerPlanListResponse.validate()
    }

    @Test
    fun callAdd() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val planService = client.customers().plans()
        val customerPlanAddResponse =
            planService.add(
                CustomerPlanAddParams.builder()
                    .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .planId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .netPaymentTermsDays(42.23)
                    .overageRateAdjustments(
                        listOf(
                            CustomerPlanAddParams.OverageRateAdjustment.builder()
                                .customCreditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .fiatCurrencyCreditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .toFiatConversionFactor(42.23)
                                .build()
                        )
                    )
                    .priceAdjustments(
                        listOf(
                            CustomerPlanAddParams.PriceAdjustment.builder()
                                .adjustmentType(
                                    CustomerPlanAddParams.PriceAdjustment.AdjustmentType.PERCENTAGE
                                )
                                .chargeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .startPeriod(42.23)
                                .quantity(42.23)
                                .tier(42.23)
                                .value(42.23)
                                .build()
                        )
                    )
                    .trialSpec(
                        CustomerPlanAddParams.TrialSpec.builder()
                            .lengthInDays(42.23)
                            .spendingCap(
                                CustomerPlanAddParams.TrialSpec.SpendingCap.builder()
                                    .amount(42.23)
                                    .creditTypeId("string")
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
        println(customerPlanAddResponse)
        customerPlanAddResponse.validate()
    }

    @Test
    fun callEnd() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val planService = client.customers().plans()
        val customerPlanEndResponse =
            planService.end(
                CustomerPlanEndParams.builder()
                    .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .customerPlanId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .voidInvoices(true)
                    .voidStripeInvoices(true)
                    .build()
            )
        println(customerPlanEndResponse)
        customerPlanEndResponse.validate()
    }

    @Test
    fun callListPriceAdjustments() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val planService = client.customers().plans()
        val customerPlanListPriceAdjustmentsResponse =
            planService.listPriceAdjustments(
                CustomerPlanListPriceAdjustmentsParams.builder()
                    .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .customerPlanId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .limit(100L)
                    .nextPage("string")
                    .build()
            )
        println(customerPlanListPriceAdjustmentsResponse)
        customerPlanListPriceAdjustmentsResponse.validate()
    }
}
