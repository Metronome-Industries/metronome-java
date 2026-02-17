// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1CustomerCreditUpdateEndDateResponseTest {

    @Test
    fun createV1CustomerCreditUpdateEndDateResponse() {
        val v1CustomerCreditUpdateEndDateResponse =
            V1CustomerCreditUpdateEndDateResponse.builder()
                .data(Id.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build())
                .build()
        assertThat(v1CustomerCreditUpdateEndDateResponse).isNotNull
        assertThat(v1CustomerCreditUpdateEndDateResponse.data())
            .isEqualTo(Id.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build())
    }
}
