// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.contracts.ratecards.productorders

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductOrderSetParamsTest {

    @Test
    fun create() {
        ProductOrderSetParams.builder()
            .addProductOrder("13117714-3f05-48e5-a6e9-a66093f13b4d")
            .addProductOrder("b086f2f4-9851-4466-9ca0-30d53e6a42ac")
            .rateCardId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
            .build()
    }

    @Test
    fun body() {
        val params =
            ProductOrderSetParams.builder()
                .addProductOrder("13117714-3f05-48e5-a6e9-a66093f13b4d")
                .addProductOrder("b086f2f4-9851-4466-9ca0-30d53e6a42ac")
                .rateCardId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .build()

        val body = params._body()

        assertThat(body.productOrder())
            .containsExactly(
                "13117714-3f05-48e5-a6e9-a66093f13b4d",
                "b086f2f4-9851-4466-9ca0-30d53e6a42ac",
            )
        assertThat(body.rateCardId()).isEqualTo("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
    }
}
