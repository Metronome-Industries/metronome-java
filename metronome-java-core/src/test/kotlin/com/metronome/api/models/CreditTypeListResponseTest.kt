// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CreditTypeListResponseTest {

    @Test
    fun createCreditTypeListResponse() {
        val creditTypeListResponse =
            CreditTypeListResponse.builder()
                .data(
                    listOf(
                        CreditTypeListResponse.Data.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .isCurrency(true)
                            .name("string")
                            .build()
                    )
                )
                .nextPage("string")
                .build()
        assertThat(creditTypeListResponse).isNotNull
        assertThat(creditTypeListResponse.data())
            .containsExactly(
                CreditTypeListResponse.Data.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .isCurrency(true)
                    .name("string")
                    .build()
            )
        assertThat(creditTypeListResponse.nextPage()).contains("string")
    }
}
