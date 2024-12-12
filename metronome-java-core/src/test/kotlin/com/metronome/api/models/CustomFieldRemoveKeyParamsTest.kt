// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomFieldRemoveKeyParamsTest {

    @Test
    fun createCustomFieldRemoveKeyParams() {
        CustomFieldRemoveKeyParams.builder()
            .entity(CustomFieldRemoveKeyParams.Entity.ALERT)
            .key("key")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            CustomFieldRemoveKeyParams.builder()
                .entity(CustomFieldRemoveKeyParams.Entity.ALERT)
                .key("key")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.entity()).isEqualTo(CustomFieldRemoveKeyParams.Entity.ALERT)
        assertThat(body.key()).isEqualTo("key")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            CustomFieldRemoveKeyParams.builder()
                .entity(CustomFieldRemoveKeyParams.Entity.ALERT)
                .key("key")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.entity()).isEqualTo(CustomFieldRemoveKeyParams.Entity.ALERT)
        assertThat(body.key()).isEqualTo("key")
    }
}
