// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InvoiceRegenerateParamsTest {

    @Test
    fun createInvoiceRegenerateParams() {
        InvoiceRegenerateParams.builder().id("6a37bb88-8538-48c5-b37b-a41c836328bd").build()
    }

    @Test
    fun getBody() {
        val params =
            InvoiceRegenerateParams.builder().id("6a37bb88-8538-48c5-b37b-a41c836328bd").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.id()).isEqualTo("6a37bb88-8538-48c5-b37b-a41c836328bd")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            InvoiceRegenerateParams.builder().id("6a37bb88-8538-48c5-b37b-a41c836328bd").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.id()).isEqualTo("6a37bb88-8538-48c5-b37b-a41c836328bd")
    }
}
