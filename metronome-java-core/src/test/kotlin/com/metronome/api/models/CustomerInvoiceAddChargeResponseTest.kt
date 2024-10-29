// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerInvoiceAddChargeResponseTest {

    @Test
    fun createCustomerInvoiceAddChargeResponse() {
        val customerInvoiceAddChargeResponse = CustomerInvoiceAddChargeResponse.builder().build()
        assertThat(customerInvoiceAddChargeResponse).isNotNull
    }
}
