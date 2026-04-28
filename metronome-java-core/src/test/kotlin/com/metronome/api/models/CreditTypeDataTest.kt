// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreditTypeDataTest {

    @Test
    fun create() {
        val creditTypeData =
            CreditTypeData.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").name("name").build()

        assertThat(creditTypeData.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(creditTypeData.name()).isEqualTo("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val creditTypeData =
            CreditTypeData.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").name("name").build()

        val roundtrippedCreditTypeData =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(creditTypeData),
                jacksonTypeRef<CreditTypeData>(),
            )

        assertThat(roundtrippedCreditTypeData).isEqualTo(creditTypeData)
    }
}
