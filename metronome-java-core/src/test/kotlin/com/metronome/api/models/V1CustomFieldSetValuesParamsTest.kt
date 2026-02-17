// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1CustomFieldSetValuesParamsTest {

    @Test
    fun create() {
        V1CustomFieldSetValuesParams.builder()
            .customFields(
                V1CustomFieldSetValuesParams.CustomFields.builder()
                    .putAdditionalProperty("x_account_id", JsonValue.from("KyVnHhSBWl7eY2bl"))
                    .build()
            )
            .entity(V1CustomFieldSetValuesParams.Entity.ALERT)
            .entityId("99594816-e8a5-4bca-be21-8d1de0f45120")
            .build()
    }

    @Test
    fun body() {
        val params =
            V1CustomFieldSetValuesParams.builder()
                .customFields(
                    V1CustomFieldSetValuesParams.CustomFields.builder()
                        .putAdditionalProperty("x_account_id", JsonValue.from("KyVnHhSBWl7eY2bl"))
                        .build()
                )
                .entity(V1CustomFieldSetValuesParams.Entity.ALERT)
                .entityId("99594816-e8a5-4bca-be21-8d1de0f45120")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.customFields())
            .isEqualTo(
                V1CustomFieldSetValuesParams.CustomFields.builder()
                    .putAdditionalProperty("x_account_id", JsonValue.from("KyVnHhSBWl7eY2bl"))
                    .build()
            )
        assertThat(body.entity()).isEqualTo(V1CustomFieldSetValuesParams.Entity.ALERT)
        assertThat(body.entityId()).isEqualTo("99594816-e8a5-4bca-be21-8d1de0f45120")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            V1CustomFieldSetValuesParams.builder()
                .customFields(
                    V1CustomFieldSetValuesParams.CustomFields.builder()
                        .putAdditionalProperty("x_account_id", JsonValue.from("KyVnHhSBWl7eY2bl"))
                        .build()
                )
                .entity(V1CustomFieldSetValuesParams.Entity.ALERT)
                .entityId("99594816-e8a5-4bca-be21-8d1de0f45120")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.customFields())
            .isEqualTo(
                V1CustomFieldSetValuesParams.CustomFields.builder()
                    .putAdditionalProperty("x_account_id", JsonValue.from("KyVnHhSBWl7eY2bl"))
                    .build()
            )
        assertThat(body.entity()).isEqualTo(V1CustomFieldSetValuesParams.Entity.ALERT)
        assertThat(body.entityId()).isEqualTo("99594816-e8a5-4bca-be21-8d1de0f45120")
    }
}
