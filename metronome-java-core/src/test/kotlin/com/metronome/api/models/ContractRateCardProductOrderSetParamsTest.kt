// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ContractRateCardProductOrderSetParamsTest {

    @Test
    fun create() {
        ContractRateCardProductOrderSetParams.builder()
            .addProductOrder("13117714-3f05-48e5-a6e9-a66093f13b4d")
            .addProductOrder("b086f2f4-9851-4466-9ca0-30d53e6a42ac")
            .rateCardId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
            .build()
    }

    @Test
    fun body() {
        val params =
            ContractRateCardProductOrderSetParams.builder()
                .addProductOrder("13117714-3f05-48e5-a6e9-a66093f13b4d")
                .addProductOrder("b086f2f4-9851-4466-9ca0-30d53e6a42ac")
                .rateCardId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body.productOrder())
            .isEqualTo(
                listOf(
                    "13117714-3f05-48e5-a6e9-a66093f13b4d",
                    "b086f2f4-9851-4466-9ca0-30d53e6a42ac",
                )
            )
        assertThat(body.rateCardId()).isEqualTo("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ContractRateCardProductOrderSetParams.builder()
                .addProductOrder("13117714-3f05-48e5-a6e9-a66093f13b4d")
                .addProductOrder("b086f2f4-9851-4466-9ca0-30d53e6a42ac")
                .rateCardId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body.productOrder())
            .isEqualTo(
                listOf(
                    "13117714-3f05-48e5-a6e9-a66093f13b4d",
                    "b086f2f4-9851-4466-9ca0-30d53e6a42ac",
                )
            )
        assertThat(body.rateCardId()).isEqualTo("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
    }
}
