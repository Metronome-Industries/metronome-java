// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1CustomerCreateResponseTest {

    @Test
    fun createV1CustomerCreateResponse() {
        val v1CustomerCreateResponse =
            V1CustomerCreateResponse.builder()
                .data(
                    Customer.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .externalId("external_id")
                        .addIngestAlias("string")
                        .name("name")
                        .customFields(
                            Customer.CustomFields.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .build()
        assertThat(v1CustomerCreateResponse).isNotNull
        assertThat(v1CustomerCreateResponse.data())
            .isEqualTo(
                Customer.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .externalId("external_id")
                    .addIngestAlias("string")
                    .name("name")
                    .customFields(
                        Customer.CustomFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
    }
}
