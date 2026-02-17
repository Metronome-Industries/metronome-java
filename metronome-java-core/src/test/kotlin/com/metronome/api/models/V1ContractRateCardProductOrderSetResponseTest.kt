// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1ContractRateCardProductOrderSetResponseTest {

    @Test
    fun createV1ContractRateCardProductOrderSetResponse() {
        val v1ContractRateCardProductOrderSetResponse =
            V1ContractRateCardProductOrderSetResponse.builder()
                .data(Id.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build())
                .build()
        assertThat(v1ContractRateCardProductOrderSetResponse).isNotNull
        assertThat(v1ContractRateCardProductOrderSetResponse.data())
            .isEqualTo(Id.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build())
    }
}
