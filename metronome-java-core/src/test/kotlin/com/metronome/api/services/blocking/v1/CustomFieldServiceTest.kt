// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClient
import com.metronome.api.core.JsonValue
import com.metronome.api.models.v1.customfields.CustomFieldAddKeyParams
import com.metronome.api.models.v1.customfields.CustomFieldDeleteValuesParams
import com.metronome.api.models.v1.customfields.CustomFieldRemoveKeyParams
import com.metronome.api.models.v1.customfields.CustomFieldSetValuesParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CustomFieldServiceTest {

    @Test
    fun addKey() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customFieldService = client.v1().customFields()

        customFieldService.addKey(
            CustomFieldAddKeyParams.builder()
                .enforceUniqueness(true)
                .entity(CustomFieldAddKeyParams.Entity.CUSTOMER)
                .key("x_account_id")
                .build()
        )
    }

    @Test
    fun deleteValues() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customFieldService = client.v1().customFields()

        customFieldService.deleteValues(
            CustomFieldDeleteValuesParams.builder()
                .entity(CustomFieldDeleteValuesParams.Entity.CUSTOMER)
                .entityId("99594816-e8a5-4bca-be21-8d1de0f45120")
                .addKey("x_account_id")
                .build()
        )
    }

    @Test
    fun listKeys() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customFieldService = client.v1().customFields()

        val page = customFieldService.listKeys()

        page.response().validate()
    }

    @Test
    fun removeKey() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customFieldService = client.v1().customFields()

        customFieldService.removeKey(
            CustomFieldRemoveKeyParams.builder()
                .entity(CustomFieldRemoveKeyParams.Entity.CUSTOMER)
                .key("x_account_id")
                .build()
        )
    }

    @Test
    fun setValues() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customFieldService = client.v1().customFields()

        customFieldService.setValues(
            CustomFieldSetValuesParams.builder()
                .customFields(
                    CustomFieldSetValuesParams.CustomFields.builder()
                        .putAdditionalProperty("x_account_id", JsonValue.from("KyVnHhSBWl7eY2bl"))
                        .build()
                )
                .entity(CustomFieldSetValuesParams.Entity.CUSTOMER)
                .entityId("99594816-e8a5-4bca-be21-8d1de0f45120")
                .build()
        )
    }
}
