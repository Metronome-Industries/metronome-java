// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.contracts.rateCards

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClient
import com.metronome.api.models.*
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
                                .position(42.23)
                                .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .build()
                        )
                    )
                    .rateCardId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
                    .productOrder(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                    .rateCardId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(contractRateCardProductOrderSetResponse)
        contractRateCardProductOrderSetResponse.validate()
    }
}
