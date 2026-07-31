// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.contracts.ratecards

import com.metronome.api.models.Id
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RateCardArchiveParamsTest {

    @Test
    fun create() {
        RateCardArchiveParams.builder()
            .id(Id.builder().id("12b21470-4570-40df-8998-449d0b0bc52f").build())
            .build()
    }

    @Test
    fun body() {
        val params =
            RateCardArchiveParams.builder()
                .id(Id.builder().id("12b21470-4570-40df-8998-449d0b0bc52f").build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(Id.builder().id("12b21470-4570-40df-8998-449d0b0bc52f").build())
    }
}
