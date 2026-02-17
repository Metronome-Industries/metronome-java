// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v1

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClientAsync
import com.metronome.api.models.V1SettingUpsertAvalaraCredentialsParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class SettingServiceAsyncTest {

    @Test
    fun upsertAvalaraCredentials() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val settingServiceAsync = client.v1().settings()

        val responseFuture =
            settingServiceAsync.upsertAvalaraCredentials(
                V1SettingUpsertAvalaraCredentialsParams.builder()
                    .avalaraEnvironment(
                        V1SettingUpsertAvalaraCredentialsParams.AvalaraEnvironment.PRODUCTION
                    )
                    .avalaraPassword("my_password_123")
                    .avalaraUsername("test@metronome.com")
                    .addDeliveryMethodId("9a906ebb-fbc7-42e8-8e29-53bfd2db3aca")
                    .commitTransactions(true)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
