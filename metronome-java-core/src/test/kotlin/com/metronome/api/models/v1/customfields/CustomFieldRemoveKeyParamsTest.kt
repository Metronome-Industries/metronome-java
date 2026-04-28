// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customfields

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomFieldRemoveKeyParamsTest {

    @Test
    fun create() {
        CustomFieldRemoveKeyParams.builder()
            .entity(CustomFieldRemoveKeyParams.Entity.CUSTOMER)
            .key("x_account_id")
            .build()
    }

    @Test
    fun body() {
        val params =
            CustomFieldRemoveKeyParams.builder()
                .entity(CustomFieldRemoveKeyParams.Entity.CUSTOMER)
                .key("x_account_id")
                .build()

        val body = params._body()

        assertThat(body.entity()).isEqualTo(CustomFieldRemoveKeyParams.Entity.CUSTOMER)
        assertThat(body.key()).isEqualTo("x_account_id")
    }
}
