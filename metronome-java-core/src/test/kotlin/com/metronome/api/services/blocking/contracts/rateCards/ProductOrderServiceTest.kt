// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.contracts.rateCards

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClient
import com.metronome.api.models.ContractRateCardProductOrderSetParams
import com.metronome.api.models.ContractRateCardProductOrderUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ProductOrderServiceTest {

    @Test
    fun callUpdate() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val productOrderService = client.contracts().rateCards().productOrders()
        val contractRateCardProductOrderUpdateResponse =
            productOrderService.update(
                ContractRateCardProductOrderUpdateParams.builder()
                    .productMoves(
                        listOf(
                            ContractRateCardProductOrderUpdateParams.ProductMove.builder()
                                .position(0.0)
                                .productId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                                .build(),
                            ContractRateCardProductOrderUpdateParams.ProductMove.builder()
                                .position(1.0)
                                .productId("b086f2f4-9851-4466-9ca0-30d53e6a42ac")
                                .build()
                        )
                    )
                    .rateCardId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .build()
            )
        println(contractRateCardProductOrderUpdateResponse)
        contractRateCardProductOrderUpdateResponse.validate()
    }

    @Test
    fun callSet() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val productOrderService = client.contracts().rateCards().productOrders()
        val contractRateCardProductOrderSetResponse =
            productOrderService.set(
                ContractRateCardProductOrderSetParams.builder()
                    .productOrder(
                        listOf(
                            "13117714-3f05-48e5-a6e9-a66093f13b4d",
                            "b086f2f4-9851-4466-9ca0-30d53e6a42ac"
                        )
                    )
                    .rateCardId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .build()
            )
        println(contractRateCardProductOrderSetResponse)
        contractRateCardProductOrderSetResponse.validate()
    }
}
