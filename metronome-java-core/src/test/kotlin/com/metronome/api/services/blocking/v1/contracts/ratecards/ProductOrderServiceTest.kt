// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1.contracts.ratecards

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClient
import com.metronome.api.models.v1.contracts.ratecards.productorders.ProductOrderSetParams
import com.metronome.api.models.v1.contracts.ratecards.productorders.ProductOrderUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ProductOrderServiceTest {

    @Test
    fun update() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val productOrderService = client.v1().contracts().rateCards().productOrders()

        val productOrder =
            productOrderService.update(
                ProductOrderUpdateParams.builder()
                    .addProductMove(
                        ProductOrderUpdateParams.ProductMove.builder()
                            .position(0.0)
                            .productId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                            .build()
                    )
                    .addProductMove(
                        ProductOrderUpdateParams.ProductMove.builder()
                            .position(1.0)
                            .productId("b086f2f4-9851-4466-9ca0-30d53e6a42ac")
                            .build()
                    )
                    .rateCardId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .build()
            )

        productOrder.validate()
    }

    @Test
    fun set() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val productOrderService = client.v1().contracts().rateCards().productOrders()

        val response =
            productOrderService.set(
                ProductOrderSetParams.builder()
                    .addProductOrder("13117714-3f05-48e5-a6e9-a66093f13b4d")
                    .addProductOrder("b086f2f4-9851-4466-9ca0-30d53e6a42ac")
                    .rateCardId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .build()
            )

        response.validate()
    }
}
