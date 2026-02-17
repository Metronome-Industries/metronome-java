// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1ContractRateCardProductOrderUpdateParamsTest {

    @Test
    fun create() {
        V1ContractRateCardProductOrderUpdateParams.builder()
            .addProductMove(
                V1ContractRateCardProductOrderUpdateParams.ProductMove.builder()
                    .position(0.0)
                    .productId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                    .build()
            )
            .addProductMove(
                V1ContractRateCardProductOrderUpdateParams.ProductMove.builder()
                    .position(1.0)
                    .productId("b086f2f4-9851-4466-9ca0-30d53e6a42ac")
                    .build()
            )
            .rateCardId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
            .build()
    }

    @Test
    fun body() {
        val params =
            V1ContractRateCardProductOrderUpdateParams.builder()
                .addProductMove(
                    V1ContractRateCardProductOrderUpdateParams.ProductMove.builder()
                        .position(0.0)
                        .productId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                        .build()
                )
                .addProductMove(
                    V1ContractRateCardProductOrderUpdateParams.ProductMove.builder()
                        .position(1.0)
                        .productId("b086f2f4-9851-4466-9ca0-30d53e6a42ac")
                        .build()
                )
                .rateCardId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.productMoves())
            .isEqualTo(
                listOf(
                    V1ContractRateCardProductOrderUpdateParams.ProductMove.builder()
                        .position(0.0)
                        .productId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                        .build(),
                    V1ContractRateCardProductOrderUpdateParams.ProductMove.builder()
                        .position(1.0)
                        .productId("b086f2f4-9851-4466-9ca0-30d53e6a42ac")
                        .build(),
                )
            )
        assertThat(body.rateCardId()).isEqualTo("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            V1ContractRateCardProductOrderUpdateParams.builder()
                .addProductMove(
                    V1ContractRateCardProductOrderUpdateParams.ProductMove.builder()
                        .position(0.0)
                        .productId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                        .build()
                )
                .addProductMove(
                    V1ContractRateCardProductOrderUpdateParams.ProductMove.builder()
                        .position(1.0)
                        .productId("b086f2f4-9851-4466-9ca0-30d53e6a42ac")
                        .build()
                )
                .rateCardId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.productMoves())
            .isEqualTo(
                listOf(
                    V1ContractRateCardProductOrderUpdateParams.ProductMove.builder()
                        .position(0.0)
                        .productId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                        .build(),
                    V1ContractRateCardProductOrderUpdateParams.ProductMove.builder()
                        .position(1.0)
                        .productId("b086f2f4-9851-4466-9ca0-30d53e6a42ac")
                        .build(),
                )
            )
        assertThat(body.rateCardId()).isEqualTo("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
    }
}
