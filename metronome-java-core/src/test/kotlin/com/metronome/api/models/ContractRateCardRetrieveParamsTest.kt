// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ContractRateCardRetrieveParamsTest {

    @Test
    fun createContractRateCardRetrieveParams() {
        ContractRateCardRetrieveParams.builder().id("f3d51ae8-f283-44e1-9933-a3cf9ad7a6fe").build()
    }

    @Test
    fun body() {
        val params =
            ContractRateCardRetrieveParams.builder()
                .id("f3d51ae8-f283-44e1-9933-a3cf9ad7a6fe")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.id()).isEqualTo("f3d51ae8-f283-44e1-9933-a3cf9ad7a6fe")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ContractRateCardRetrieveParams.builder()
                .id("f3d51ae8-f283-44e1-9933-a3cf9ad7a6fe")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.id()).isEqualTo("f3d51ae8-f283-44e1-9933-a3cf9ad7a6fe")
    }
}
