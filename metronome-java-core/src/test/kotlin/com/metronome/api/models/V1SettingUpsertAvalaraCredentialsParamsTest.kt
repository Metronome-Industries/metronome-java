// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1SettingUpsertAvalaraCredentialsParamsTest {

    @Test
    fun create() {
        V1SettingUpsertAvalaraCredentialsParams.builder()
            .avalaraEnvironment(
                V1SettingUpsertAvalaraCredentialsParams.AvalaraEnvironment.PRODUCTION
            )
            .avalaraPassword("my_password_123")
            .avalaraUsername("test@metronome.com")
            .addDeliveryMethodId("9a906ebb-fbc7-42e8-8e29-53bfd2db3aca")
            .commitTransactions(true)
            .build()
    }

    @Test
    fun body() {
        val params =
            V1SettingUpsertAvalaraCredentialsParams.builder()
                .avalaraEnvironment(
                    V1SettingUpsertAvalaraCredentialsParams.AvalaraEnvironment.PRODUCTION
                )
                .avalaraPassword("my_password_123")
                .avalaraUsername("test@metronome.com")
                .addDeliveryMethodId("9a906ebb-fbc7-42e8-8e29-53bfd2db3aca")
                .commitTransactions(true)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.avalaraEnvironment())
            .isEqualTo(V1SettingUpsertAvalaraCredentialsParams.AvalaraEnvironment.PRODUCTION)
        assertThat(body.avalaraPassword()).isEqualTo("my_password_123")
        assertThat(body.avalaraUsername()).isEqualTo("test@metronome.com")
        assertThat(body.deliveryMethodIds())
            .isEqualTo(listOf("9a906ebb-fbc7-42e8-8e29-53bfd2db3aca"))
        assertThat(body.commitTransactions()).contains(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            V1SettingUpsertAvalaraCredentialsParams.builder()
                .avalaraEnvironment(
                    V1SettingUpsertAvalaraCredentialsParams.AvalaraEnvironment.PRODUCTION
                )
                .avalaraPassword("my_password_123")
                .avalaraUsername("test@metronome.com")
                .addDeliveryMethodId("9a906ebb-fbc7-42e8-8e29-53bfd2db3aca")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.avalaraEnvironment())
            .isEqualTo(V1SettingUpsertAvalaraCredentialsParams.AvalaraEnvironment.PRODUCTION)
        assertThat(body.avalaraPassword()).isEqualTo("my_password_123")
        assertThat(body.avalaraUsername()).isEqualTo("test@metronome.com")
        assertThat(body.deliveryMethodIds())
            .isEqualTo(listOf("9a906ebb-fbc7-42e8-8e29-53bfd2db3aca"))
    }
}
