// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1CustomerRetrieveBillingConfigurationsParamsTest {

    @Test
    fun create() {
        V1CustomerRetrieveBillingConfigurationsParams.builder()
            .customerId("6a37bb88-8538-48c5-b37b-a41c836328bd")
            .includeArchived(true)
            .build()
    }

    @Test
    fun body() {
        val params =
            V1CustomerRetrieveBillingConfigurationsParams.builder()
                .customerId("6a37bb88-8538-48c5-b37b-a41c836328bd")
                .includeArchived(true)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.customerId()).isEqualTo("6a37bb88-8538-48c5-b37b-a41c836328bd")
        assertThat(body.includeArchived()).contains(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            V1CustomerRetrieveBillingConfigurationsParams.builder()
                .customerId("6a37bb88-8538-48c5-b37b-a41c836328bd")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.customerId()).isEqualTo("6a37bb88-8538-48c5-b37b-a41c836328bd")
    }
}
