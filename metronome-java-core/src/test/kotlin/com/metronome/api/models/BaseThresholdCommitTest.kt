// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BaseThresholdCommitTest {

    @Test
    fun createBaseThresholdCommit() {
        val baseThresholdCommit =
            BaseThresholdCommit.builder()
                .productId("product_id")
                .description("description")
                .name("name")
                .build()
        assertThat(baseThresholdCommit).isNotNull
        assertThat(baseThresholdCommit.productId()).isEqualTo("product_id")
        assertThat(baseThresholdCommit.description()).contains("description")
        assertThat(baseThresholdCommit.name()).contains("name")
    }
}
