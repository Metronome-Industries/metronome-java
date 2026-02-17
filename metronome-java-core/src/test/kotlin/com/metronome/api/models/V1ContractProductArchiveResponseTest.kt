// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1ContractProductArchiveResponseTest {

    @Test
    fun createV1ContractProductArchiveResponse() {
        val v1ContractProductArchiveResponse =
            V1ContractProductArchiveResponse.builder()
                .data(Id.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build())
                .build()
        assertThat(v1ContractProductArchiveResponse).isNotNull
        assertThat(v1ContractProductArchiveResponse.data())
            .isEqualTo(Id.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build())
    }
}
