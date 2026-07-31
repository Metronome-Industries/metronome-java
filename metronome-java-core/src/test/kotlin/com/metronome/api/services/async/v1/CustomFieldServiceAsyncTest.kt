// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v1

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClientAsync
import com.metronome.api.core.JsonValue
import com.metronome.api.models.v1.customfields.CustomFieldAddKeyParams
import com.metronome.api.models.v1.customfields.CustomFieldDeleteValuesParams
import com.metronome.api.models.v1.customfields.CustomFieldRemoveKeyParams
import com.metronome.api.models.v1.customfields.CustomFieldSetValuesParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CustomFieldServiceAsyncTest {

    @Test
    fun addKey() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customFieldServiceAsync = client.v1().customFields()

        val future =
            customFieldServiceAsync.addKey(
                CustomFieldAddKeyParams.builder()
                    .enforceUniqueness(true)
                    .entity(CustomFieldAddKeyParams.Entity.CUSTOMER)
                    .key("x_account_id")
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun deleteValues() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customFieldServiceAsync = client.v1().customFields()

        val future =
            customFieldServiceAsync.deleteValues(
                CustomFieldDeleteValuesParams.builder()
                    .entity(CustomFieldDeleteValuesParams.Entity.CUSTOMER)
                    .entityId("99594816-e8a5-4bca-be21-8d1de0f45120")
                    .addKey("x_account_id")
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun listKeys() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customFieldServiceAsync = client.v1().customFields()

        val pageFuture = customFieldServiceAsync.listKeys()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun removeKey() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customFieldServiceAsync = client.v1().customFields()

        val future =
            customFieldServiceAsync.removeKey(
                CustomFieldRemoveKeyParams.builder()
                    .entity(CustomFieldRemoveKeyParams.Entity.CUSTOMER)
                    .key("x_account_id")
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun setValues() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customFieldServiceAsync = client.v1().customFields()

        val future =
            customFieldServiceAsync.setValues(
                CustomFieldSetValuesParams.builder()
                    .customFields(
                        CustomFieldSetValuesParams.CustomFields.builder()
                            .putAdditionalProperty(
                                "x_account_id",
                                JsonValue.from("KyVnHhSBWl7eY2bl"),
                            )
                            .build()
                    )
                    .entity(CustomFieldSetValuesParams.Entity.CUSTOMER)
                    .entityId("99594816-e8a5-4bca-be21-8d1de0f45120")
                    .build()
            )

        val response = future.get()
    }
}
