// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClient
import com.metronome.api.models.*
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
                .key("key")
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
                .entityId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .keys(listOf("string"))
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
                    .entities(listOf(CustomFieldListKeysParams.Entity.ALERT))
                    .nextPage("next_page")
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
                .key("key")
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
                .customFields(CustomFieldSetValuesParams.CustomFields.builder().build())
                .entity(CustomFieldSetValuesParams.Entity.ALERT)
                .entityId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        )
    }
}
