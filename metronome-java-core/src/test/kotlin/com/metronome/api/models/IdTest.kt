// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IdTest {

    @Test
    fun create() {
        val id = Id.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        assertThat(id.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val id = Id.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val roundtrippedId =
            jsonMapper.readValue(jsonMapper.writeValueAsString(id), jacksonTypeRef<Id>())

        assertThat(roundtrippedId).isEqualTo(id)
    }
}
