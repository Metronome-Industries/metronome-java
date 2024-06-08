// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerSetNameResponseTest {

    @Test
    fun createCustomerSetNameResponse() {
        val customerSetNameResponse =
            CustomerSetNameResponse.builder()
                .data(
                    Customer.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .externalId("string")
                        .ingestAliases(listOf("string"))
                        .name("string")
                        .customFields(Customer.CustomFields.builder().build())
                        .build()
                )
                .build()
        assertThat(customerSetNameResponse).isNotNull
        assertThat(customerSetNameResponse.data())
            .isEqualTo(
                Customer.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .externalId("string")
                    .ingestAliases(listOf("string"))
                    .name("string")
                    .customFields(Customer.CustomFields.builder().build())
                    .build()
            )
    }
}
