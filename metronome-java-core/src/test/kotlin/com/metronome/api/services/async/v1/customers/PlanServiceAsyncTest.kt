// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v1.customers

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClientAsync
import com.metronome.api.models.V1CustomerPlanAddParams
import com.metronome.api.models.V1CustomerPlanEndParams
import com.metronome.api.models.V1CustomerPlanListParams
import com.metronome.api.models.V1CustomerPlanListPriceAdjustmentsParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class PlanServiceAsyncTest {

    @Test
    fun list() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val planServiceAsync = client.v1().customers().plans()

        val pageFuture =
            planServiceAsync.list(
                V1CustomerPlanListParams.builder()
                    .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .build()
            )

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun add() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val planServiceAsync = client.v1().customers().plans()

        val responseFuture =
            planServiceAsync.add(
                V1CustomerPlanAddParams.builder()
                    .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .planId("d2c06dae-9549-4d7d-bc04-b78dd3d241b8")
                    .startingOn(OffsetDateTime.parse("2021-02-01T00:00:00Z"))
                    .endingBefore(OffsetDateTime.parse("2022-02-01T00:00:00Z"))
                    .netPaymentTermsDays(0.0)
                    .addOverageRateAdjustment(
                        V1CustomerPlanAddParams.OverageRateAdjustment.builder()
                            .customCreditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .fiatCurrencyCreditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .toFiatConversionFactor(0.0)
                            .build()
                    )
                    .addPriceAdjustment(
                        V1CustomerPlanAddParams.PriceAdjustment.builder()
                            .adjustmentType(
                                V1CustomerPlanAddParams.PriceAdjustment.AdjustmentType.PERCENTAGE
                            )
                            .chargeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .startPeriod(0.0)
                            .quantity(0.0)
                            .tier(0.0)
                            .value(0.0)
                            .build()
                    )
                    .trialSpec(
                        V1CustomerPlanAddParams.TrialSpec.builder()
                            .lengthInDays(0.0)
                            .spendingCap(
                                V1CustomerPlanAddParams.TrialSpec.SpendingCap.builder()
                                    .amount(0.0)
                                    .creditTypeId("credit_type_id")
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun end() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val planServiceAsync = client.v1().customers().plans()

        val responseFuture =
            planServiceAsync.end(
                V1CustomerPlanEndParams.builder()
                    .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .customerPlanId("7aa11640-0703-4600-8eb9-293f535a6b74")
                    .endingBefore(OffsetDateTime.parse("2021-02-01T00:00:00Z"))
                    .voidInvoices(true)
                    .voidStripeInvoices(true)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun listPriceAdjustments() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val planServiceAsync = client.v1().customers().plans()

        val pageFuture =
            planServiceAsync.listPriceAdjustments(
                V1CustomerPlanListPriceAdjustmentsParams.builder()
                    .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .customerPlanId("7aa11640-0703-4600-8eb9-293f535a6b74")
                    .build()
            )

        val page = pageFuture.get()
        page.response().validate()
    }
}
