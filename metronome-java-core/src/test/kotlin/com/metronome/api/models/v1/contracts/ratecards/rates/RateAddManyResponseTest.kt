// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.contracts.ratecards.rates

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.jsonMapper
import com.metronome.api.models.Id
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RateAddManyResponseTest {

    @Test
    fun create() {
        val rateAddManyResponse =
            RateAddManyResponse.builder()
                .data(Id.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build())
                .build()

        assertThat(rateAddManyResponse.data())
            .isEqualTo(Id.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val rateAddManyResponse =
            RateAddManyResponse.builder()
                .data(Id.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build())
                .build()

        val roundtrippedRateAddManyResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(rateAddManyResponse),
                jacksonTypeRef<RateAddManyResponse>(),
            )

        assertThat(roundtrippedRateAddManyResponse).isEqualTo(rateAddManyResponse)
    }
}
