// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class UpdateBaseThresholdCommitTest {

    @Test
    fun createUpdateBaseThresholdCommit() {
        val updateBaseThresholdCommit =
            UpdateBaseThresholdCommit.builder()
                .description("description")
                .name("name")
                .productId("product_id")
                .build()
        assertThat(updateBaseThresholdCommit).isNotNull
        assertThat(updateBaseThresholdCommit.description()).contains("description")
        assertThat(updateBaseThresholdCommit.name()).contains("name")
        assertThat(updateBaseThresholdCommit.productId()).contains("product_id")
    }
}
