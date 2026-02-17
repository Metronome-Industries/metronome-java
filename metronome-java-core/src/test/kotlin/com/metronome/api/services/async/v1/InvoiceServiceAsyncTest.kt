// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v1

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClientAsync
import com.metronome.api.models.V1InvoiceRegenerateParams
import com.metronome.api.models.V1InvoiceVoidParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class InvoiceServiceAsyncTest {

    @Test
    fun regenerate() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val invoiceServiceAsync = client.v1().invoices()

        val responseFuture =
            invoiceServiceAsync.regenerate(
                V1InvoiceRegenerateParams.builder()
                    .id("6a37bb88-8538-48c5-b37b-a41c836328bd")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun void_() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val invoiceServiceAsync = client.v1().invoices()

        val responseFuture =
            invoiceServiceAsync.void_(
                V1InvoiceVoidParams.builder().id("6a37bb88-8538-48c5-b37b-a41c836328bd").build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
