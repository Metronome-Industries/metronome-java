// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v2.contracts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.jsonMapper
import com.metronome.api.models.Id
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContractEditCommitResponseTest {

    @Test
    fun create() {
        val contractEditCommitResponse =
            ContractEditCommitResponse.builder()
                .data(Id.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build())
                .build()

        assertThat(contractEditCommitResponse.data())
            .isEqualTo(Id.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contractEditCommitResponse =
            ContractEditCommitResponse.builder()
                .data(Id.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build())
                .build()

        val roundtrippedContractEditCommitResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contractEditCommitResponse),
                jacksonTypeRef<ContractEditCommitResponse>(),
            )

        assertThat(roundtrippedContractEditCommitResponse).isEqualTo(contractEditCommitResponse)
    }
}
