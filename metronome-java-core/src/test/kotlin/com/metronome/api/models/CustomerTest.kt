// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerTest {

    @Test
    fun createCustomer() {
        val customer =
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
        assertThat(customer).isNotNull
        assertThat(customer.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(customer.externalId()).isEqualTo("external_id")
        assertThat(customer.ingestAliases()).containsExactly("string")
        assertThat(customer.name()).isEqualTo("name")
        assertThat(customer.customFields())
            .contains(
                Customer.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }
}
