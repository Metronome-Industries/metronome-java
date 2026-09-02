// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.pricingunits

import com.metronome.api.models.Id
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PricingUnitArchiveParamsTest {

    @Test
    fun create() {
        PricingUnitArchiveParams.builder()
            .id(Id.builder().id("fa2f1b3d-9d52-4951-a099-25991fd394d6").build())
            .build()
    }

    @Test
    fun body() {
        val params =
            PricingUnitArchiveParams.builder()
                .id(Id.builder().id("fa2f1b3d-9d52-4951-a099-25991fd394d6").build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(Id.builder().id("fa2f1b3d-9d52-4951-a099-25991fd394d6").build())
    }
}
