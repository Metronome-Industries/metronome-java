// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.packages

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PackageRetrieveParamsTest {

    @Test
    fun create() {
        PackageRetrieveParams.builder().packageId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc").build()
    }

    @Test
    fun body() {
        val params =
            PackageRetrieveParams.builder()
                .packageId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .build()

        val body = params._body()

        assertThat(body.packageId()).isEqualTo("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
    }
}
