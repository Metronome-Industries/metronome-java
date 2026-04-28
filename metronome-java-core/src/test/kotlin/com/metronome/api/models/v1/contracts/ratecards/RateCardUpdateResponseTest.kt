// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.contracts.ratecards

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.jsonMapper
import com.metronome.api.models.Id
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RateCardUpdateResponseTest {

    @Test
    fun create() {
        val rateCardUpdateResponse =
            RateCardUpdateResponse.builder()
                .data(Id.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build())
                .build()

        assertThat(rateCardUpdateResponse.data())
            .isEqualTo(Id.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val rateCardUpdateResponse =
            RateCardUpdateResponse.builder()
                .data(Id.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build())
                .build()

        val roundtrippedRateCardUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(rateCardUpdateResponse),
                jacksonTypeRef<RateCardUpdateResponse>(),
            )

        assertThat(roundtrippedRateCardUpdateResponse).isEqualTo(rateCardUpdateResponse)
    }
}
