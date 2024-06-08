// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomFieldDeleteValuesParamsTest {

    @Test
    fun createCustomFieldDeleteValuesParams() {
        CustomFieldDeleteValuesParams.builder()
            .entity(CustomFieldDeleteValuesParams.Entity.ALERT)
            .entityId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .keys(listOf("string"))
            .build()
    }

    @Test
    fun getBody() {
        val params =
            CustomFieldDeleteValuesParams.builder()
                .entity(CustomFieldDeleteValuesParams.Entity.ALERT)
                .entityId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .keys(listOf("string"))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.entity()).isEqualTo(CustomFieldDeleteValuesParams.Entity.ALERT)
        assertThat(body.entityId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.keys()).isEqualTo(listOf("string"))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            CustomFieldDeleteValuesParams.builder()
                .entity(CustomFieldDeleteValuesParams.Entity.ALERT)
                .entityId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .keys(listOf("string"))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.entity()).isEqualTo(CustomFieldDeleteValuesParams.Entity.ALERT)
        assertThat(body.entityId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.keys()).isEqualTo(listOf("string"))
    }
}
