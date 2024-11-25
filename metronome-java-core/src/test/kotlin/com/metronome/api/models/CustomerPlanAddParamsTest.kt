// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerPlanAddParamsTest {

    @Test
    fun createCustomerPlanAddParams() {
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
    }

    @Test
    fun getBody() {
        val params =
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
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.planId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.startingOn()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.endingBefore()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.netPaymentTermsDays()).isEqualTo(0.0)
        assertThat(body.overageRateAdjustments())
            .isEqualTo(
                listOf(
                    CustomerPlanAddParams.OverageRateAdjustment.builder()
                        .customCreditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .fiatCurrencyCreditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .toFiatConversionFactor(0.0)
                        .build()
                )
            )
        assertThat(body.priceAdjustments())
            .isEqualTo(
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
        assertThat(body.trialSpec())
            .isEqualTo(
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
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            CustomerPlanAddParams.builder()
                .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .planId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.planId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.startingOn()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun getPathParam() {
        val params =
            CustomerPlanAddParams.builder()
                .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .planId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(params).isNotNull
        // path param "customerId"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
