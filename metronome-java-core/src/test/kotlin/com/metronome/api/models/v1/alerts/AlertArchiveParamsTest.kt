// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.alerts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AlertArchiveParamsTest {

    @Test
    fun create() {
        AlertArchiveParams.builder()
            .id("8deed800-1b7a-495d-a207-6c52bac54dc9")
            .releaseUniquenessKey(true)
            .build()
    }

    @Test
    fun body() {
        val params =
            AlertArchiveParams.builder()
                .id("8deed800-1b7a-495d-a207-6c52bac54dc9")
                .releaseUniquenessKey(true)
                .build()

        val body = params._body()

        assertThat(body.id()).isEqualTo("8deed800-1b7a-495d-a207-6c52bac54dc9")
        assertThat(body.releaseUniquenessKey()).contains(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = AlertArchiveParams.builder().id("8deed800-1b7a-495d-a207-6c52bac54dc9").build()

        val body = params._body()

        assertThat(body.id()).isEqualTo("8deed800-1b7a-495d-a207-6c52bac54dc9")
    }
}
