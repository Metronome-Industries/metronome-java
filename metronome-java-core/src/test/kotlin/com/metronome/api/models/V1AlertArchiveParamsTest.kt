// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1AlertArchiveParamsTest {

    @Test
    fun create() {
        V1AlertArchiveParams.builder()
            .id("8deed800-1b7a-495d-a207-6c52bac54dc9")
            .releaseUniquenessKey(true)
            .build()
    }

    @Test
    fun body() {
        val params =
            V1AlertArchiveParams.builder()
                .id("8deed800-1b7a-495d-a207-6c52bac54dc9")
                .releaseUniquenessKey(true)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.id()).isEqualTo("8deed800-1b7a-495d-a207-6c52bac54dc9")
        assertThat(body.releaseUniquenessKey()).contains(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            V1AlertArchiveParams.builder().id("8deed800-1b7a-495d-a207-6c52bac54dc9").build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.id()).isEqualTo("8deed800-1b7a-495d-a207-6c52bac54dc9")
    }
}
