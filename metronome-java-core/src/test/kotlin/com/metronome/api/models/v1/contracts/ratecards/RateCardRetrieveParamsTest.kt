// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.contracts.ratecards

import com.metronome.api.models.Id
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RateCardRetrieveParamsTest {

    @Test
    fun create() {
        RateCardRetrieveParams.builder()
            .id(Id.builder().id("f3d51ae8-f283-44e1-9933-a3cf9ad7a6fe").build())
            .build()
    }

    @Test
    fun body() {
        val params =
            RateCardRetrieveParams.builder()
                .id(Id.builder().id("f3d51ae8-f283-44e1-9933-a3cf9ad7a6fe").build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(Id.builder().id("f3d51ae8-f283-44e1-9933-a3cf9ad7a6fe").build())
    }
}
