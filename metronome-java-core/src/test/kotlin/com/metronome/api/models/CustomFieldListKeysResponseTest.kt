// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomFieldListKeysResponseTest {

    @Test
    fun createCustomFieldListKeysResponse() {
        val customFieldListKeysResponse =
            CustomFieldListKeysResponse.builder()
                .data(
                    listOf(
                        CustomFieldListKeysResponse.Data.builder()
                            .enforceUniqueness(true)
                            .entity(CustomFieldListKeysResponse.Data.Entity.ALERT)
                            .key("key")
                            .build()
                    )
                )
                .nextPage("next_page")
                .build()
        assertThat(customFieldListKeysResponse).isNotNull
        assertThat(customFieldListKeysResponse.data())
            .containsExactly(
                CustomFieldListKeysResponse.Data.builder()
                    .enforceUniqueness(true)
                    .entity(CustomFieldListKeysResponse.Data.Entity.ALERT)
                    .key("key")
                    .build()
            )
        assertThat(customFieldListKeysResponse.nextPage()).contains("next_page")
    }
}
