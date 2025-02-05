// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomFieldSetValuesParamsTest {

    @Test
    fun create() {
        CustomFieldSetValuesParams.builder()
            .customFields(
                CustomFieldSetValuesParams.CustomFields.builder()
                    .putAdditionalProperty("x_account_id", JsonValue.from("KyVnHhSBWl7eY2bl"))
                    .build()
            )
            .entity(CustomFieldSetValuesParams.Entity.ALERT)
            .entityId("99594816-e8a5-4bca-be21-8d1de0f45120")
            .build()
    }

    @Test
    fun body() {
        val params =
            CustomFieldSetValuesParams.builder()
                .customFields(
                    CustomFieldSetValuesParams.CustomFields.builder()
                        .putAdditionalProperty("x_account_id", JsonValue.from("KyVnHhSBWl7eY2bl"))
                        .build()
                )
                .entity(CustomFieldSetValuesParams.Entity.ALERT)
                .entityId("99594816-e8a5-4bca-be21-8d1de0f45120")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.customFields())
            .isEqualTo(
                CustomFieldSetValuesParams.CustomFields.builder()
                    .putAdditionalProperty("x_account_id", JsonValue.from("KyVnHhSBWl7eY2bl"))
                    .build()
            )
        assertThat(body.entity()).isEqualTo(CustomFieldSetValuesParams.Entity.ALERT)
        assertThat(body.entityId()).isEqualTo("99594816-e8a5-4bca-be21-8d1de0f45120")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CustomFieldSetValuesParams.builder()
                .customFields(
                    CustomFieldSetValuesParams.CustomFields.builder()
                        .putAdditionalProperty("x_account_id", JsonValue.from("KyVnHhSBWl7eY2bl"))
                        .build()
                )
                .entity(CustomFieldSetValuesParams.Entity.ALERT)
                .entityId("99594816-e8a5-4bca-be21-8d1de0f45120")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.customFields())
            .isEqualTo(
                CustomFieldSetValuesParams.CustomFields.builder()
                    .putAdditionalProperty("x_account_id", JsonValue.from("KyVnHhSBWl7eY2bl"))
                    .build()
            )
        assertThat(body.entity()).isEqualTo(CustomFieldSetValuesParams.Entity.ALERT)
        assertThat(body.entityId()).isEqualTo("99594816-e8a5-4bca-be21-8d1de0f45120")
    }
}
