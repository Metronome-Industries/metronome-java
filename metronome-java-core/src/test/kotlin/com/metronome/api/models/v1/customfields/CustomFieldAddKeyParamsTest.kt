// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customfields

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomFieldAddKeyParamsTest {

    @Test
    fun create() {
        CustomFieldAddKeyParams.builder()
            .enforceUniqueness(true)
            .entity(CustomFieldAddKeyParams.Entity.CUSTOMER)
            .key("x_account_id")
            .build()
    }

    @Test
    fun body() {
        val params =
            CustomFieldAddKeyParams.builder()
                .enforceUniqueness(true)
                .entity(CustomFieldAddKeyParams.Entity.CUSTOMER)
                .key("x_account_id")
                .build()

        val body = params._body()

        assertThat(body.enforceUniqueness()).isEqualTo(true)
        assertThat(body.entity()).isEqualTo(CustomFieldAddKeyParams.Entity.CUSTOMER)
        assertThat(body.key()).isEqualTo("x_account_id")
    }
}
