// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1CustomFieldAddKeyParamsTest {

    @Test
    fun create() {
        V1CustomFieldAddKeyParams.builder()
            .enforceUniqueness(true)
            .entity(V1CustomFieldAddKeyParams.Entity.ALERT)
            .key("x_account_id")
            .build()
    }

    @Test
    fun body() {
        val params =
            V1CustomFieldAddKeyParams.builder()
                .enforceUniqueness(true)
                .entity(V1CustomFieldAddKeyParams.Entity.ALERT)
                .key("x_account_id")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.enforceUniqueness()).isEqualTo(true)
        assertThat(body.entity()).isEqualTo(V1CustomFieldAddKeyParams.Entity.ALERT)
        assertThat(body.key()).isEqualTo("x_account_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            V1CustomFieldAddKeyParams.builder()
                .enforceUniqueness(true)
                .entity(V1CustomFieldAddKeyParams.Entity.ALERT)
                .key("x_account_id")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.enforceUniqueness()).isEqualTo(true)
        assertThat(body.entity()).isEqualTo(V1CustomFieldAddKeyParams.Entity.ALERT)
        assertThat(body.key()).isEqualTo("x_account_id")
    }
}
