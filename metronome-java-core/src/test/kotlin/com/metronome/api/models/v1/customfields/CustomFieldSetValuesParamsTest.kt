// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customfields

import com.metronome.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomFieldSetValuesParamsTest {

    @Test
    fun create() {
        CustomFieldSetValuesParams.builder()
            .customFields(
                CustomFieldSetValuesParams.CustomFields.builder()
                    .putAdditionalProperty("x_account_id", JsonValue.from("KyVnHhSBWl7eY2bl"))
                    .build()
            )
            .entity(CustomFieldSetValuesParams.Entity.CUSTOMER)
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
                .entity(CustomFieldSetValuesParams.Entity.CUSTOMER)
                .entityId("99594816-e8a5-4bca-be21-8d1de0f45120")
                .build()

        val body = params._body()

        assertThat(body.customFields())
            .isEqualTo(
                CustomFieldSetValuesParams.CustomFields.builder()
                    .putAdditionalProperty("x_account_id", JsonValue.from("KyVnHhSBWl7eY2bl"))
                    .build()
            )
        assertThat(body.entity()).isEqualTo(CustomFieldSetValuesParams.Entity.CUSTOMER)
        assertThat(body.entityId()).isEqualTo("99594816-e8a5-4bca-be21-8d1de0f45120")
    }
}
