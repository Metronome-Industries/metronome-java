// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.contracts.products

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductArchiveParamsTest {

    @Test
    fun create() {
        ProductArchiveParams.builder().productId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc").build()
    }

    @Test
    fun body() {
        val params =
            ProductArchiveParams.builder().productId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc").build()

        val body = params._body()

        assertThat(body.productId()).isEqualTo("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
    }
}
