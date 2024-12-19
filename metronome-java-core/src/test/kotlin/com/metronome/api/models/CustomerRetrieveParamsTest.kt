// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerRetrieveParamsTest {

    @Test
    fun createCustomerRetrieveParams() {
        CustomerRetrieveParams.builder().customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc").build()
    }

    @Test
    fun getPathParam() {
        val params =
            CustomerRetrieveParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .build()
        assertThat(params).isNotNull
        // path param "customerId"
        assertThat(params.getPathParam(0)).isEqualTo("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
