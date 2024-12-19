// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomFieldRemoveKeyParamsTest {

    @Test
    fun createCustomFieldRemoveKeyParams() {
        CustomFieldRemoveKeyParams.builder()
            .entity(CustomFieldRemoveKeyParams.Entity.ALERT)
            .key("x_account_id")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            CustomFieldRemoveKeyParams.builder()
                .entity(CustomFieldRemoveKeyParams.Entity.ALERT)
                .key("x_account_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.entity()).isEqualTo(CustomFieldRemoveKeyParams.Entity.ALERT)
        assertThat(body.key()).isEqualTo("x_account_id")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            CustomFieldRemoveKeyParams.builder()
                .entity(CustomFieldRemoveKeyParams.Entity.ALERT)
                .key("x_account_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.entity()).isEqualTo(CustomFieldRemoveKeyParams.Entity.ALERT)
        assertThat(body.key()).isEqualTo("x_account_id")
    }
}
