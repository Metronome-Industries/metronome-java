// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerPlanEndResponseTest {

    @Test
    fun createCustomerPlanEndResponse() {
        val customerPlanEndResponse = CustomerPlanEndResponse.builder().build()
        assertThat(customerPlanEndResponse).isNotNull
    }
}
