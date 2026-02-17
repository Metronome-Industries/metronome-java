// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1BillableMetricRetrieveParamsTest {

    @Test
    fun create() {
        V1BillableMetricRetrieveParams.builder()
            .billableMetricId("13117714-3f05-48e5-a6e9-a66093f13b4d")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            V1BillableMetricRetrieveParams.builder()
                .billableMetricId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                .build()
        assertThat(params).isNotNull
        // path param "billableMetricId"
        assertThat(params.getPathParam(0)).isEqualTo("13117714-3f05-48e5-a6e9-a66093f13b4d")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
