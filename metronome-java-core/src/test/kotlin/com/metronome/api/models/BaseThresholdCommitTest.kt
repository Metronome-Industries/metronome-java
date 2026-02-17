// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BaseThresholdCommitTest {

    @Test
    fun create() {
        val baseThresholdCommit =
            BaseThresholdCommit.builder()
                .productId("product_id")
                .description("description")
                .name("name")
                .build()

        assertThat(baseThresholdCommit.productId()).isEqualTo("product_id")
        assertThat(baseThresholdCommit.description()).contains("description")
        assertThat(baseThresholdCommit.name()).contains("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val baseThresholdCommit =
            BaseThresholdCommit.builder()
                .productId("product_id")
                .description("description")
                .name("name")
                .build()

        val roundtrippedBaseThresholdCommit =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(baseThresholdCommit),
                jacksonTypeRef<BaseThresholdCommit>(),
            )

        assertThat(roundtrippedBaseThresholdCommit).isEqualTo(baseThresholdCommit)
    }
}
