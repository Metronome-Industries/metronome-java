// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerListCostsResponseTest {

    @Test
    fun createCustomerListCostsResponse() {
        val customerListCostsResponse =
            CustomerListCostsResponse.builder()
                .data(
                    listOf(
                        CustomerListCostsResponse.Data.builder()
                            .creditTypes(
                                CustomerListCostsResponse.Data.CreditTypes.builder().build()
                            )
                            .endTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .startTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                )
                .nextPage("string")
                .build()
        assertThat(customerListCostsResponse).isNotNull
        assertThat(customerListCostsResponse.data())
            .containsExactly(
                CustomerListCostsResponse.Data.builder()
                    .creditTypes(CustomerListCostsResponse.Data.CreditTypes.builder().build())
                    .endTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .startTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(customerListCostsResponse.nextPage()).contains("string")
    }
}
