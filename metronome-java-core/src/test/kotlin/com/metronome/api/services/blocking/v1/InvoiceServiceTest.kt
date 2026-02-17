// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClient
import com.metronome.api.models.V1InvoiceRegenerateParams
import com.metronome.api.models.V1InvoiceVoidParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class InvoiceServiceTest {

    @Test
    fun regenerate() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val invoiceService = client.v1().invoices()

        val response =
            invoiceService.regenerate(
                V1InvoiceRegenerateParams.builder()
                    .id("6a37bb88-8538-48c5-b37b-a41c836328bd")
                    .build()
            )

        response.validate()
    }

    @Test
    fun void_() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val invoiceService = client.v1().invoices()

        val response =
            invoiceService.void_(
                V1InvoiceVoidParams.builder().id("6a37bb88-8538-48c5-b37b-a41c836328bd").build()
            )

        response.validate()
    }
}
