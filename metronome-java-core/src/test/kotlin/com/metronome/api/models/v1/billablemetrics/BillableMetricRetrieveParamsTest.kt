// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.billablemetrics

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BillableMetricRetrieveParamsTest {

    @Test
    fun create() {
        BillableMetricRetrieveParams.builder()
            .billableMetricId("13117714-3f05-48e5-a6e9-a66093f13b4d")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            BillableMetricRetrieveParams.builder()
                .billableMetricId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("13117714-3f05-48e5-a6e9-a66093f13b4d")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
