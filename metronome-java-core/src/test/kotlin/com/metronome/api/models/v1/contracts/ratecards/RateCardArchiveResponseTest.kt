// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.contracts.ratecards

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.jsonMapper
import com.metronome.api.models.Id
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RateCardArchiveResponseTest {

    @Test
    fun create() {
        val rateCardArchiveResponse =
            RateCardArchiveResponse.builder()
                .data(Id.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build())
                .build()

        assertThat(rateCardArchiveResponse.data())
            .isEqualTo(Id.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val rateCardArchiveResponse =
            RateCardArchiveResponse.builder()
                .data(Id.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build())
                .build()

        val roundtrippedRateCardArchiveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(rateCardArchiveResponse),
                jacksonTypeRef<RateCardArchiveResponse>(),
            )

        assertThat(roundtrippedRateCardArchiveResponse).isEqualTo(rateCardArchiveResponse)
    }
}
