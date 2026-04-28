// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.invoices

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvoiceVoidParamsTest {

    @Test
    fun create() {
        InvoiceVoidParams.builder().id("6a37bb88-8538-48c5-b37b-a41c836328bd").build()
    }

    @Test
    fun body() {
        val params = InvoiceVoidParams.builder().id("6a37bb88-8538-48c5-b37b-a41c836328bd").build()

        val body = params._body()

        assertThat(body.id()).isEqualTo("6a37bb88-8538-48c5-b37b-a41c836328bd")
    }
}
