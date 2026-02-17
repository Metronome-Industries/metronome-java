// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class OverrideTierTest {

    @Test
    fun createOverrideTier() {
        val overrideTier = OverrideTier.builder().multiplier(0.0).size(0.0).build()
        assertThat(overrideTier).isNotNull
        assertThat(overrideTier.multiplier()).isEqualTo(0.0)
        assertThat(overrideTier.size()).contains(0.0)
    }
}
