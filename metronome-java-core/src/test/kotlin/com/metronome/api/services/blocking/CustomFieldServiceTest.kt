// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClient
import com.metronome.api.core.JsonValue
import com.metronome.api.models.CustomFieldAddKeyParams
import com.metronome.api.models.CustomFieldDeleteValuesParams
import com.metronome.api.models.CustomFieldListKeysParams
import com.metronome.api.models.CustomFieldRemoveKeyParams
import com.metronome.api.models.CustomFieldSetValuesParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CustomFieldServiceTest {

    @Test
    fun callAddKey() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customFieldService = client.customFields()
        customFieldService.addKey(
            CustomFieldAddKeyParams.builder()
                .enforceUniqueness(true)
                .entity(CustomFieldAddKeyParams.Entity.ALERT)
                .key("x_account_id")
                .build()
        )
    }

    @Test
    fun callDeleteValues() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customFieldService = client.customFields()
        customFieldService.deleteValues(
            CustomFieldDeleteValuesParams.builder()
                .entity(CustomFieldDeleteValuesParams.Entity.ALERT)
                .entityId("99594816-e8a5-4bca-be21-8d1de0f45120")
                .keys(listOf("x_account_id"))
                .build()
        )
    }

    @Test
    fun callListKeys() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customFieldService = client.customFields()
        val customFieldListKeysResponse =
            customFieldService.listKeys(
                CustomFieldListKeysParams.builder()
                    .nextPage("next_page")
                    .entities(listOf(CustomFieldListKeysParams.Entity.ALERT))
                    .build()
            )
        println(customFieldListKeysResponse)
        customFieldListKeysResponse.validate()
    }

    @Test
    fun callRemoveKey() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customFieldService = client.customFields()
        customFieldService.removeKey(
            CustomFieldRemoveKeyParams.builder()
                .entity(CustomFieldRemoveKeyParams.Entity.ALERT)
                .key("x_account_id")
                .build()
        )
    }

    @Test
    fun callSetValues() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customFieldService = client.customFields()
        customFieldService.setValues(
            CustomFieldSetValuesParams.builder()
                .customFields(
                    CustomFieldSetValuesParams.CustomFields.builder()
                        .putAdditionalProperty("x_account_id", JsonValue.from("KyVnHhSBWl7eY2bl"))
                        .build()
                )
                .entity(CustomFieldSetValuesParams.Entity.ALERT)
                .entityId("99594816-e8a5-4bca-be21-8d1de0f45120")
                .build()
        )
    }
}
