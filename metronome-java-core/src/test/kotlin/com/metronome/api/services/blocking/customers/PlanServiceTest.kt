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
                    .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
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
                    .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .planId("d2c06dae-9549-4d7d-bc04-b78dd3d241b8")
                    .startingOn(OffsetDateTime.parse("2021-02-01T00:00:00Z"))
                    .endingBefore(OffsetDateTime.parse("2022-02-01T00:00:00Z"))
                    .netPaymentTermsDays(0.0)
                    .addOverageRateAdjustment(
                        CustomerPlanAddParams.OverageRateAdjustment.builder()
                            .customCreditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .fiatCurrencyCreditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .toFiatConversionFactor(0.0)
                            .build()
                    )
                    .addPriceAdjustment(
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
                    .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .customerPlanId("7aa11640-0703-4600-8eb9-293f535a6b74")
                    .endingBefore(OffsetDateTime.parse("2021-02-01T00:00:00Z"))
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
                    .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .customerPlanId("7aa11640-0703-4600-8eb9-293f535a6b74")
                    .build()
            )
        println(response)
        response.data().forEach { it.validate() }
    }
}
