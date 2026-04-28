// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customfields

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomFieldListKeysPageResponseTest {

    @Test
    fun create() {
        val customFieldListKeysPageResponse =
            CustomFieldListKeysPageResponse.builder()
                .addData(
                    CustomFieldListKeysResponse.builder()
                        .enforceUniqueness(true)
                        .entity(CustomFieldListKeysResponse.Entity.ALERT)
                        .key("key")
                        .build()
                )
                .nextPage("next_page")
                .build()

        assertThat(customFieldListKeysPageResponse.data())
            .containsExactly(
                CustomFieldListKeysResponse.builder()
                    .enforceUniqueness(true)
                    .entity(CustomFieldListKeysResponse.Entity.ALERT)
                    .key("key")
                    .build()
            )
        assertThat(customFieldListKeysPageResponse.nextPage()).contains("next_page")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customFieldListKeysPageResponse =
            CustomFieldListKeysPageResponse.builder()
                .addData(
                    CustomFieldListKeysResponse.builder()
                        .enforceUniqueness(true)
                        .entity(CustomFieldListKeysResponse.Entity.ALERT)
                        .key("key")
                        .build()
                )
                .nextPage("next_page")
                .build()

        val roundtrippedCustomFieldListKeysPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customFieldListKeysPageResponse),
                jacksonTypeRef<CustomFieldListKeysPageResponse>(),
            )

        assertThat(roundtrippedCustomFieldListKeysPageResponse)
            .isEqualTo(customFieldListKeysPageResponse)
    }
}
