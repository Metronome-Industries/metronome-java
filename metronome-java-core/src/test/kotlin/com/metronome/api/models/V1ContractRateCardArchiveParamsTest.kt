// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1ContractRateCardArchiveParamsTest {

    @Test
    fun create() {
        V1ContractRateCardArchiveParams.builder()
            .id(Id.builder().id("12b21470-4570-40df-8998-449d0b0bc52f").build())
            .build()
    }

    @Test
    fun body() {
        val params =
            V1ContractRateCardArchiveParams.builder()
                .id(Id.builder().id("12b21470-4570-40df-8998-449d0b0bc52f").build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(Id.builder().id("12b21470-4570-40df-8998-449d0b0bc52f").build())
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            V1ContractRateCardArchiveParams.builder()
                .id(Id.builder().id("12b21470-4570-40df-8998-449d0b0bc52f").build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(Id.builder().id("12b21470-4570-40df-8998-449d0b0bc52f").build())
    }
}
