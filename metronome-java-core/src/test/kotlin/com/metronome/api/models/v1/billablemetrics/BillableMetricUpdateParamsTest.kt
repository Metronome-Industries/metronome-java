// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.billablemetrics

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BillableMetricUpdateParamsTest {

    @Test
    fun create() {
        BillableMetricUpdateParams.builder()
            .billableMetricId("13117714-3f05-48e5-a6e9-a66093f13b4d")
            .name("CPU hours")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            BillableMetricUpdateParams.builder()
                .billableMetricId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                .name("CPU hours")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("13117714-3f05-48e5-a6e9-a66093f13b4d")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            BillableMetricUpdateParams.builder()
                .billableMetricId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                .name("CPU hours")
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("CPU hours")
    }
}
