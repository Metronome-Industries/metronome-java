// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerAlertResetParamsTest {

    @Test
    fun createCustomerAlertResetParams() {
        CustomerAlertResetParams.builder()
            .alertId("5e8691bf-b22a-4672-922d-f80eee940f01")
            .customerId("4c83caf3-8af4-44e2-9aeb-e290531726d9")
            .build()
    }

    @Test
    fun body() {
        val params =
            CustomerAlertResetParams.builder()
                .alertId("5e8691bf-b22a-4672-922d-f80eee940f01")
                .customerId("4c83caf3-8af4-44e2-9aeb-e290531726d9")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.alertId()).isEqualTo("5e8691bf-b22a-4672-922d-f80eee940f01")
        assertThat(body.customerId()).isEqualTo("4c83caf3-8af4-44e2-9aeb-e290531726d9")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CustomerAlertResetParams.builder()
                .alertId("5e8691bf-b22a-4672-922d-f80eee940f01")
                .customerId("4c83caf3-8af4-44e2-9aeb-e290531726d9")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.alertId()).isEqualTo("5e8691bf-b22a-4672-922d-f80eee940f01")
        assertThat(body.customerId()).isEqualTo("4c83caf3-8af4-44e2-9aeb-e290531726d9")
    }
}
