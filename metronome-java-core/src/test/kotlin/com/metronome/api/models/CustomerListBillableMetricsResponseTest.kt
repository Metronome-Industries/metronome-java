// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerListBillableMetricsResponseTest {

    @Test
    fun createCustomerListBillableMetricsResponse() {
        val customerListBillableMetricsResponse =
            CustomerListBillableMetricsResponse.builder()
                .data(
                    listOf(
                        CustomerListBillableMetricsResponse.Data.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .name("string")
                            .groupBy(listOf("string"))
                            .build()
                    )
                )
                .nextPage("string")
                .build()
        assertThat(customerListBillableMetricsResponse).isNotNull
        assertThat(customerListBillableMetricsResponse.data())
            .containsExactly(
                CustomerListBillableMetricsResponse.Data.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("string")
                    .groupBy(listOf("string"))
                    .build()
            )
        assertThat(customerListBillableMetricsResponse.nextPage()).contains("string")
    }
}
