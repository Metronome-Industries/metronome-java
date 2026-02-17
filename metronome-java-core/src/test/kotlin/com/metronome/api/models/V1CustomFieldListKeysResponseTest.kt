// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1CustomFieldListKeysResponseTest {

    @Test
    fun createV1CustomFieldListKeysResponse() {
        val v1CustomFieldListKeysResponse =
            V1CustomFieldListKeysResponse.builder()
                .enforceUniqueness(true)
                .entity(V1CustomFieldListKeysResponse.Entity.ALERT)
                .key("key")
                .build()
        assertThat(v1CustomFieldListKeysResponse).isNotNull
        assertThat(v1CustomFieldListKeysResponse.enforceUniqueness()).isEqualTo(true)
        assertThat(v1CustomFieldListKeysResponse.entity())
            .isEqualTo(V1CustomFieldListKeysResponse.Entity.ALERT)
        assertThat(v1CustomFieldListKeysResponse.key()).isEqualTo("key")
    }
}
