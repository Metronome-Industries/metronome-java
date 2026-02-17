// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1CustomFieldDeleteValuesParamsTest {

    @Test
    fun create() {
        V1CustomFieldDeleteValuesParams.builder()
            .entity(V1CustomFieldDeleteValuesParams.Entity.ALERT)
            .entityId("99594816-e8a5-4bca-be21-8d1de0f45120")
            .addKey("x_account_id")
            .build()
    }

    @Test
    fun body() {
        val params =
            V1CustomFieldDeleteValuesParams.builder()
                .entity(V1CustomFieldDeleteValuesParams.Entity.ALERT)
                .entityId("99594816-e8a5-4bca-be21-8d1de0f45120")
                .addKey("x_account_id")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.entity()).isEqualTo(V1CustomFieldDeleteValuesParams.Entity.ALERT)
        assertThat(body.entityId()).isEqualTo("99594816-e8a5-4bca-be21-8d1de0f45120")
        assertThat(body.keys()).isEqualTo(listOf("x_account_id"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            V1CustomFieldDeleteValuesParams.builder()
                .entity(V1CustomFieldDeleteValuesParams.Entity.ALERT)
                .entityId("99594816-e8a5-4bca-be21-8d1de0f45120")
                .addKey("x_account_id")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.entity()).isEqualTo(V1CustomFieldDeleteValuesParams.Entity.ALERT)
        assertThat(body.entityId()).isEqualTo("99594816-e8a5-4bca-be21-8d1de0f45120")
        assertThat(body.keys()).isEqualTo(listOf("x_account_id"))
    }
}
