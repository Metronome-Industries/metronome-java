// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerSetNameParamsTest {

    @Test
    fun create() {
        CustomerSetNameParams.builder()
            .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
            .name("Example, Inc.")
            .build()
    }

    @Test
    fun body() {
        val params =
            CustomerSetNameParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .name("Example, Inc.")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.name()).isEqualTo("Example, Inc.")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CustomerSetNameParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .name("Example, Inc.")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.name()).isEqualTo("Example, Inc.")
    }

    @Test
    fun getPathParam() {
        val params =
            CustomerSetNameParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .name("Example, Inc.")
                .build()
        assertThat(params).isNotNull
        // path param "customerId"
        assertThat(params.getPathParam(0)).isEqualTo("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
