// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UpdateBaseThresholdCommitTest {

    @Test
    fun create() {
        val updateBaseThresholdCommit =
            UpdateBaseThresholdCommit.builder()
                .description("description")
                .name("name")
                .priority(0.0)
                .productId("product_id")
                .build()

        assertThat(updateBaseThresholdCommit.description()).contains("description")
        assertThat(updateBaseThresholdCommit.name()).contains("name")
        assertThat(updateBaseThresholdCommit.priority()).contains(0.0)
        assertThat(updateBaseThresholdCommit.productId()).contains("product_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val updateBaseThresholdCommit =
            UpdateBaseThresholdCommit.builder()
                .description("description")
                .name("name")
                .priority(0.0)
                .productId("product_id")
                .build()

        val roundtrippedUpdateBaseThresholdCommit =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(updateBaseThresholdCommit),
                jacksonTypeRef<UpdateBaseThresholdCommit>(),
            )

        assertThat(roundtrippedUpdateBaseThresholdCommit).isEqualTo(updateBaseThresholdCommit)
    }
}
