// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.contracts.products

import com.metronome.api.models.Id
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductRetrieveParamsTest {

    @Test
    fun create() {
        ProductRetrieveParams.builder()
            .id(Id.builder().id("d84e7f4e-7a70-4fe4-be02-7a5027beffcc").build())
            .build()
    }

    @Test
    fun body() {
        val params =
            ProductRetrieveParams.builder()
                .id(Id.builder().id("d84e7f4e-7a70-4fe4-be02-7a5027beffcc").build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(Id.builder().id("d84e7f4e-7a70-4fe4-be02-7a5027beffcc").build())
    }
}
