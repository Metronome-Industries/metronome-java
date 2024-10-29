// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ContractRateCardProductOrderSetParamsTest {

    @Test
    fun createContractRateCardProductOrderSetParams() {
        ContractRateCardProductOrderSetParams.builder()
            .productOrder(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
            .rateCardId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            ContractRateCardProductOrderSetParams.builder()
                .productOrder(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .rateCardId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.productOrder()).isEqualTo(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        assertThat(body.rateCardId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            ContractRateCardProductOrderSetParams.builder()
                .productOrder(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .rateCardId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.productOrder()).isEqualTo(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        assertThat(body.rateCardId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
