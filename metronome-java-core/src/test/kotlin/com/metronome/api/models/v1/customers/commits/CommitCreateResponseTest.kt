// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers.commits

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.jsonMapper
import com.metronome.api.models.Id
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommitCreateResponseTest {

    @Test
    fun create() {
        val commitCreateResponse =
            CommitCreateResponse.builder()
                .data(Id.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build())
                .build()

        assertThat(commitCreateResponse.data())
            .isEqualTo(Id.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val commitCreateResponse =
            CommitCreateResponse.builder()
                .data(Id.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build())
                .build()

        val roundtrippedCommitCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(commitCreateResponse),
                jacksonTypeRef<CommitCreateResponse>(),
            )

        assertThat(roundtrippedCommitCreateResponse).isEqualTo(commitCreateResponse)
    }
}
