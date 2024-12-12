// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomFieldSetValuesParamsTest {

    @Test
    fun createCustomFieldSetValuesParams() {
        CustomFieldSetValuesParams.builder()
            .customFields(
                CustomFieldSetValuesParams.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .entity(CustomFieldSetValuesParams.Entity.ALERT)
            .entityId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            CustomFieldSetValuesParams.builder()
                .customFields(
                    CustomFieldSetValuesParams.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .entity(CustomFieldSetValuesParams.Entity.ALERT)
                .entityId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.customFields())
            .isEqualTo(
                CustomFieldSetValuesParams.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.entity()).isEqualTo(CustomFieldSetValuesParams.Entity.ALERT)
        assertThat(body.entityId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            CustomFieldSetValuesParams.builder()
                .customFields(
                    CustomFieldSetValuesParams.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .entity(CustomFieldSetValuesParams.Entity.ALERT)
                .entityId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.customFields())
            .isEqualTo(
                CustomFieldSetValuesParams.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.entity()).isEqualTo(CustomFieldSetValuesParams.Entity.ALERT)
        assertThat(body.entityId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
