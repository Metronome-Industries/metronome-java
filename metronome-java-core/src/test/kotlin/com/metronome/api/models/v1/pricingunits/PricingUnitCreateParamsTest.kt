// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.pricingunits

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PricingUnitCreateParamsTest {

    @Test
    fun create() {
        PricingUnitCreateParams.builder().name("AI Credits").build()
    }

    @Test
    fun body() {
        val params = PricingUnitCreateParams.builder().name("AI Credits").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("AI Credits")
    }
}
