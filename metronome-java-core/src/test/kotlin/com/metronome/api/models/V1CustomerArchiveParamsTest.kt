// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1CustomerArchiveParamsTest {

    @Test
    fun create() {
        V1CustomerArchiveParams.builder()
            .id(Id.builder().id("8deed800-1b7a-495d-a207-6c52bac54dc9").build())
            .build()
    }

    @Test
    fun body() {
        val params =
            V1CustomerArchiveParams.builder()
                .id(Id.builder().id("8deed800-1b7a-495d-a207-6c52bac54dc9").build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(Id.builder().id("8deed800-1b7a-495d-a207-6c52bac54dc9").build())
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            V1CustomerArchiveParams.builder()
                .id(Id.builder().id("8deed800-1b7a-495d-a207-6c52bac54dc9").build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(Id.builder().id("8deed800-1b7a-495d-a207-6c52bac54dc9").build())
    }
}
