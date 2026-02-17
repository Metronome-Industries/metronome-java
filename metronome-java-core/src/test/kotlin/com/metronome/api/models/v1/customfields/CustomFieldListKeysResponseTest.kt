// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customfields

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomFieldListKeysResponseTest {

    @Test
    fun create() {
        val customFieldListKeysResponse =
            CustomFieldListKeysResponse.builder()
                .enforceUniqueness(true)
                .entity(CustomFieldListKeysResponse.Entity.ALERT)
                .key("key")
                .build()

        assertThat(customFieldListKeysResponse.enforceUniqueness()).isEqualTo(true)
        assertThat(customFieldListKeysResponse.entity())
            .isEqualTo(CustomFieldListKeysResponse.Entity.ALERT)
        assertThat(customFieldListKeysResponse.key()).isEqualTo("key")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customFieldListKeysResponse =
            CustomFieldListKeysResponse.builder()
                .enforceUniqueness(true)
                .entity(CustomFieldListKeysResponse.Entity.ALERT)
                .key("key")
                .build()

        val roundtrippedCustomFieldListKeysResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customFieldListKeysResponse),
                jacksonTypeRef<CustomFieldListKeysResponse>(),
            )

        assertThat(roundtrippedCustomFieldListKeysResponse).isEqualTo(customFieldListKeysResponse)
    }
}
