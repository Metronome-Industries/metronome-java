// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerTest {

    @Test
    fun createCustomer() {
        val customer =
            Customer.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .externalId("string")
                .ingestAliases(listOf("string"))
                .name("string")
                .customFields(Customer.CustomFields.builder().build())
                .build()
        assertThat(customer).isNotNull
        assertThat(customer.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(customer.externalId()).isEqualTo("string")
        assertThat(customer.ingestAliases()).containsExactly("string")
        assertThat(customer.name()).isEqualTo("string")
        assertThat(customer.customFields()).contains(Customer.CustomFields.builder().build())
    }
}
