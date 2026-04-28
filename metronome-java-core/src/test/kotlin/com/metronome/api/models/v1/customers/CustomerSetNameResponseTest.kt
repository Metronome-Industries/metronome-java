// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.JsonValue
import com.metronome.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerSetNameResponseTest {

    @Test
    fun create() {
        val customerSetNameResponse =
            CustomerSetNameResponse.builder()
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

        assertThat(customerSetNameResponse.data())
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

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerSetNameResponse =
            CustomerSetNameResponse.builder()
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

        val roundtrippedCustomerSetNameResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerSetNameResponse),
                jacksonTypeRef<CustomerSetNameResponse>(),
            )

        assertThat(roundtrippedCustomerSetNameResponse).isEqualTo(customerSetNameResponse)
    }
}
