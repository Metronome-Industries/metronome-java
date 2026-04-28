// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.contracts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContractGetNetBalanceResponseTest {

    @Test
    fun create() {
        val contractGetNetBalanceResponse =
            ContractGetNetBalanceResponse.builder()
                .data(
                    ContractGetNetBalanceResponse.Data.builder()
                        .balance(123.45)
                        .creditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                        .build()
                )
                .build()

        assertThat(contractGetNetBalanceResponse.data())
            .isEqualTo(
                ContractGetNetBalanceResponse.Data.builder()
                    .balance(123.45)
                    .creditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contractGetNetBalanceResponse =
            ContractGetNetBalanceResponse.builder()
                .data(
                    ContractGetNetBalanceResponse.Data.builder()
                        .balance(123.45)
                        .creditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                        .build()
                )
                .build()

        val roundtrippedContractGetNetBalanceResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contractGetNetBalanceResponse),
                jacksonTypeRef<ContractGetNetBalanceResponse>(),
            )

        assertThat(roundtrippedContractGetNetBalanceResponse)
            .isEqualTo(contractGetNetBalanceResponse)
    }
}
