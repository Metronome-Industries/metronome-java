// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AlertArchiveParamsTest {

    @Test
    fun createAlertArchiveParams() {
        AlertArchiveParams.builder()
            .id("8deed800-1b7a-495d-a207-6c52bac54dc9")
            .releaseUniquenessKey(true)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            AlertArchiveParams.builder()
                .id("8deed800-1b7a-495d-a207-6c52bac54dc9")
                .releaseUniquenessKey(true)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.id()).isEqualTo("8deed800-1b7a-495d-a207-6c52bac54dc9")
        assertThat(body.releaseUniquenessKey()).isEqualTo(true)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = AlertArchiveParams.builder().id("8deed800-1b7a-495d-a207-6c52bac54dc9").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.id()).isEqualTo("8deed800-1b7a-495d-a207-6c52bac54dc9")
    }
}
