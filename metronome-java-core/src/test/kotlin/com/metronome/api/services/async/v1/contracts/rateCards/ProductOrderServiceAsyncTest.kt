// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v1.contracts.rateCards

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClientAsync
import com.metronome.api.models.V1ContractRateCardProductOrderSetParams
import com.metronome.api.models.V1ContractRateCardProductOrderUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ProductOrderServiceAsyncTest {

    @Test
    fun update() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val productOrderServiceAsync = client.v1().contracts().rateCards().productOrders()

        val productOrderFuture =
            productOrderServiceAsync.update(
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
            )

        val productOrder = productOrderFuture.get()
        productOrder.validate()
    }

    @Test
    fun set() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val productOrderServiceAsync = client.v1().contracts().rateCards().productOrders()

        val responseFuture =
            productOrderServiceAsync.set(
                V1ContractRateCardProductOrderSetParams.builder()
                    .addProductOrder("13117714-3f05-48e5-a6e9-a66093f13b4d")
                    .addProductOrder("b086f2f4-9851-4466-9ca0-30d53e6a42ac")
                    .rateCardId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
