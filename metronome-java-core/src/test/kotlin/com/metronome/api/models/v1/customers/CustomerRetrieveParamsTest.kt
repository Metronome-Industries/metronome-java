// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerRetrieveParamsTest {

    @Test
    fun create() {
        CustomerRetrieveParams.builder().customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc").build()
    }

    @Test
    fun pathParams() {
        val params =
            CustomerRetrieveParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
