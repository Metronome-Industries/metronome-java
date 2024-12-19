// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClient
import com.metronome.api.models.InvoiceRegenerateParams
import com.metronome.api.models.InvoiceVoidParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class InvoiceServiceTest {

    @Test
    fun callRegenerate() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val invoiceService = client.invoices()
        val invoiceRegenerateResponse =
            invoiceService.regenerate(
                InvoiceRegenerateParams.builder().id("6a37bb88-8538-48c5-b37b-a41c836328bd").build()
            )
        println(invoiceRegenerateResponse)
        invoiceRegenerateResponse.validate()
    }

    @Test
    fun callVoid() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val invoiceService = client.invoices()
        val invoiceVoidResponse =
            invoiceService.void_(
                InvoiceVoidParams.builder().id("6a37bb88-8538-48c5-b37b-a41c836328bd").build()
            )
        println(invoiceVoidResponse)
        invoiceVoidResponse.validate()
    }
}
