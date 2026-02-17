// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1BillableMetricCreateResponseTest {

    @Test
    fun createV1BillableMetricCreateResponse() {
        val v1BillableMetricCreateResponse =
            V1BillableMetricCreateResponse.builder()
                .data(Id.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build())
                .build()
        assertThat(v1BillableMetricCreateResponse).isNotNull
        assertThat(v1BillableMetricCreateResponse.data())
            .isEqualTo(Id.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build())
    }
}
