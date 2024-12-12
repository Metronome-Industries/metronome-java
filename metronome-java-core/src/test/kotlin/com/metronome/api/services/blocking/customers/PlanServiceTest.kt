// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.customers

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClient
import com.metronome.api.models.CustomerPlanAddParams
import com.metronome.api.models.CustomerPlanEndParams
import com.metronome.api.models.CustomerPlanListParams
import com.metronome.api.models.CustomerPlanListPriceAdjustmentsParams
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
        val response =
            planService.list(
                CustomerPlanListParams.builder()
                    .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(response)
        response.data().forEach { it.validate() }
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
                    .netPaymentTermsDays(0.0)
                    .overageRateAdjustments(
                        listOf(
                            CustomerPlanAddParams.OverageRateAdjustment.builder()
                                .customCreditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .fiatCurrencyCreditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .toFiatConversionFactor(0.0)
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
                                .startPeriod(0.0)
                                .quantity(0.0)
                                .tier(0.0)
                                .value(0.0)
                                .build()
                        )
                    )
                    .trialSpec(
                        CustomerPlanAddParams.TrialSpec.builder()
                            .lengthInDays(0.0)
                            .spendingCap(
                                CustomerPlanAddParams.TrialSpec.SpendingCap.builder()
                                    .amount(0.0)
                                    .creditTypeId("credit_type_id")
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
        val response =
            planService.listPriceAdjustments(
                CustomerPlanListPriceAdjustmentsParams.builder()
                    .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .customerPlanId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(response)
        response.data().forEach { it.validate() }
    }
}
