// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1ContractGetNetBalanceResponseTest {

    @Test
    fun createV1ContractGetNetBalanceResponse() {
        val v1ContractGetNetBalanceResponse =
            V1ContractGetNetBalanceResponse.builder()
                .data(
                    V1ContractGetNetBalanceResponse.Data.builder()
                        .balance(123.45)
                        .creditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                        .build()
                )
                .build()
        assertThat(v1ContractGetNetBalanceResponse).isNotNull
        assertThat(v1ContractGetNetBalanceResponse.data())
            .isEqualTo(
                V1ContractGetNetBalanceResponse.Data.builder()
                    .balance(123.45)
                    .creditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                    .build()
            )
    }
}
