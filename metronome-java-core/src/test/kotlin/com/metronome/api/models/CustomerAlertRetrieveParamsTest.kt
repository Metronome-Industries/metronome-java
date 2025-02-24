// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerAlertRetrieveParamsTest {

    @Test
    fun create() {
        CustomerAlertRetrieveParams.builder()
            .alertId("8deed800-1b7a-495d-a207-6c52bac54dc9")
            .customerId("9b85c1c1-5238-4f2a-a409-61412905e1e1")
            .build()
    }

    @Test
    fun body() {
        val params =
            CustomerAlertRetrieveParams.builder()
                .alertId("8deed800-1b7a-495d-a207-6c52bac54dc9")
                .customerId("9b85c1c1-5238-4f2a-a409-61412905e1e1")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.alertId()).isEqualTo("8deed800-1b7a-495d-a207-6c52bac54dc9")
        assertThat(body.customerId()).isEqualTo("9b85c1c1-5238-4f2a-a409-61412905e1e1")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CustomerAlertRetrieveParams.builder()
                .alertId("8deed800-1b7a-495d-a207-6c52bac54dc9")
                .customerId("9b85c1c1-5238-4f2a-a409-61412905e1e1")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.alertId()).isEqualTo("8deed800-1b7a-495d-a207-6c52bac54dc9")
        assertThat(body.customerId()).isEqualTo("9b85c1c1-5238-4f2a-a409-61412905e1e1")
    }
}
