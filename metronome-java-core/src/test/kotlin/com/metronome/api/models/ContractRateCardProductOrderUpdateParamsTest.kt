// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ContractRateCardProductOrderUpdateParamsTest {

    @Test
    fun createContractRateCardProductOrderUpdateParams() {
        ContractRateCardProductOrderUpdateParams.builder()
            .productMoves(
                listOf(
                    ContractRateCardProductOrderUpdateParams.ProductMove.builder()
                        .position(0.0)
                        .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
            )
            .rateCardId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            ContractRateCardProductOrderUpdateParams.builder()
                .productMoves(
                    listOf(
                        ContractRateCardProductOrderUpdateParams.ProductMove.builder()
                            .position(0.0)
                            .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                )
                .rateCardId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.productMoves())
            .isEqualTo(
                listOf(
                    ContractRateCardProductOrderUpdateParams.ProductMove.builder()
                        .position(0.0)
                        .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
            )
        assertThat(body.rateCardId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            ContractRateCardProductOrderUpdateParams.builder()
                .productMoves(
                    listOf(
                        ContractRateCardProductOrderUpdateParams.ProductMove.builder()
                            .position(0.0)
                            .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                )
                .rateCardId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.productMoves())
            .isEqualTo(
                listOf(
                    ContractRateCardProductOrderUpdateParams.ProductMove.builder()
                        .position(0.0)
                        .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
            )
        assertThat(body.rateCardId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
