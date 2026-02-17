// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.settings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SettingUpsertAvalaraCredentialsResponseTest {

    @Test
    fun create() {
        val settingUpsertAvalaraCredentialsResponse =
            SettingUpsertAvalaraCredentialsResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val settingUpsertAvalaraCredentialsResponse =
            SettingUpsertAvalaraCredentialsResponse.builder().build()

        val roundtrippedSettingUpsertAvalaraCredentialsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(settingUpsertAvalaraCredentialsResponse),
                jacksonTypeRef<SettingUpsertAvalaraCredentialsResponse>(),
            )

        assertThat(roundtrippedSettingUpsertAvalaraCredentialsResponse)
            .isEqualTo(settingUpsertAvalaraCredentialsResponse)
    }
}
