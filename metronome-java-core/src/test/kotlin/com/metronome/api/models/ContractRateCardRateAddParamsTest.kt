// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ContractRateCardRateAddParamsTest {

    @Test
    fun createContractRateCardRateAddParams() {
        ContractRateCardRateAddParams.builder()
            .entitled(true)
            .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .rateCardId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .rateType(ContractRateCardRateAddParams.RateType.FLAT)
            .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .commitRate(
                ContractRateCardRateAddParams.CommitRate.builder()
                    .rateType(ContractRateCardRateAddParams.CommitRate.RateType.FLAT)
                    .price(0.0)
                    .tiers(listOf(Tier.builder().price(0.0).size(0.0).build()))
                    .build()
            )
            .creditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
            .customRate(ContractRateCardRateAddParams.CustomRate.builder().build())
            .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .isProrated(true)
            .price(0.0)
            .pricingGroupValues(ContractRateCardRateAddParams.PricingGroupValues.builder().build())
            .quantity(0.0)
            .tiers(listOf(Tier.builder().price(0.0).size(0.0).build()))
            .useListPrices(true)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            ContractRateCardRateAddParams.builder()
                .entitled(true)
                .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .rateCardId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .rateType(ContractRateCardRateAddParams.RateType.FLAT)
                .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .commitRate(
                    ContractRateCardRateAddParams.CommitRate.builder()
                        .rateType(ContractRateCardRateAddParams.CommitRate.RateType.FLAT)
                        .price(0.0)
                        .tiers(listOf(Tier.builder().price(0.0).size(0.0).build()))
                        .build()
                )
                .creditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                .customRate(ContractRateCardRateAddParams.CustomRate.builder().build())
                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .isProrated(true)
                .price(0.0)
                .pricingGroupValues(
                    ContractRateCardRateAddParams.PricingGroupValues.builder().build()
                )
                .quantity(0.0)
                .tiers(listOf(Tier.builder().price(0.0).size(0.0).build()))
                .useListPrices(true)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.entitled()).isEqualTo(true)
        assertThat(body.productId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.rateCardId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.rateType()).isEqualTo(ContractRateCardRateAddParams.RateType.FLAT)
        assertThat(body.startingAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.commitRate())
            .isEqualTo(
                ContractRateCardRateAddParams.CommitRate.builder()
                    .rateType(ContractRateCardRateAddParams.CommitRate.RateType.FLAT)
                    .price(0.0)
                    .tiers(listOf(Tier.builder().price(0.0).size(0.0).build()))
                    .build()
            )
        assertThat(body.creditTypeId()).isEqualTo("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
        assertThat(body.customRate())
            .isEqualTo(ContractRateCardRateAddParams.CustomRate.builder().build())
        assertThat(body.endingBefore()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.isProrated()).isEqualTo(true)
        assertThat(body.price()).isEqualTo(0.0)
        assertThat(body.pricingGroupValues())
            .isEqualTo(ContractRateCardRateAddParams.PricingGroupValues.builder().build())
        assertThat(body.quantity()).isEqualTo(0.0)
        assertThat(body.tiers()).isEqualTo(listOf(Tier.builder().price(0.0).size(0.0).build()))
        assertThat(body.useListPrices()).isEqualTo(true)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            ContractRateCardRateAddParams.builder()
                .entitled(true)
                .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .rateCardId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .rateType(ContractRateCardRateAddParams.RateType.FLAT)
                .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.entitled()).isEqualTo(true)
        assertThat(body.productId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.rateCardId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.rateType()).isEqualTo(ContractRateCardRateAddParams.RateType.FLAT)
        assertThat(body.startingAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
