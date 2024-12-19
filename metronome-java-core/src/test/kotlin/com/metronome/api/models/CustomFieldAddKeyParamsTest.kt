// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomFieldAddKeyParamsTest {

    @Test
    fun createCustomFieldAddKeyParams() {
        CustomFieldAddKeyParams.builder()
            .enforceUniqueness(true)
            .entity(CustomFieldAddKeyParams.Entity.ALERT)
            .key("x_account_id")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            CustomFieldAddKeyParams.builder()
                .enforceUniqueness(true)
                .entity(CustomFieldAddKeyParams.Entity.ALERT)
                .key("x_account_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.enforceUniqueness()).isEqualTo(true)
        assertThat(body.entity()).isEqualTo(CustomFieldAddKeyParams.Entity.ALERT)
        assertThat(body.key()).isEqualTo("x_account_id")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            CustomFieldAddKeyParams.builder()
                .enforceUniqueness(true)
                .entity(CustomFieldAddKeyParams.Entity.ALERT)
                .key("x_account_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.enforceUniqueness()).isEqualTo(true)
        assertThat(body.entity()).isEqualTo(CustomFieldAddKeyParams.Entity.ALERT)
        assertThat(body.key()).isEqualTo("x_account_id")
    }
}
