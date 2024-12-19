// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.customers

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClient
import com.metronome.api.models.CustomerInvoiceAddChargeParams
import com.metronome.api.models.CustomerInvoiceListBreakdownsParams
import com.metronome.api.models.CustomerInvoiceListParams
import com.metronome.api.models.CustomerInvoiceRetrieveParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class InvoiceServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val invoiceService = client.customers().invoices()
        val customerInvoiceRetrieveResponse =
            invoiceService.retrieve(
                CustomerInvoiceRetrieveParams.builder()
                    .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .invoiceId("6a37bb88-8538-48c5-b37b-a41c836328bd")
                    .skipZeroQtyLineItems(true)
                    .build()
            )
        println(customerInvoiceRetrieveResponse)
        customerInvoiceRetrieveResponse.validate()
    }

    @Test
    fun callList() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val invoiceService = client.customers().invoices()
        val response =
            invoiceService.list(
                CustomerInvoiceListParams.builder()
                    .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .build()
            )
        println(response)
        response.data().forEach { it.validate() }
    }

    @Test
    fun callAddCharge() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val invoiceService = client.customers().invoices()
        val customerInvoiceAddChargeResponse =
            invoiceService.addCharge(
                CustomerInvoiceAddChargeParams.builder()
                    .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .chargeId("5ae4b726-1ebe-439c-9190-9831760ba195")
                    .customerPlanId("a23b3cf4-47fb-4c3f-bb3d-9e64f7704015")
                    .description("One time charge")
                    .invoiceStartTimestamp(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                    .price(250.0)
                    .quantity(1.0)
                    .build()
            )
        println(customerInvoiceAddChargeResponse)
        customerInvoiceAddChargeResponse.validate()
    }

    @Test
    fun callListBreakdowns() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val invoiceService = client.customers().invoices()
        val response =
            invoiceService.listBreakdowns(
                CustomerInvoiceListBreakdownsParams.builder()
                    .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        println(response)
        response.data().forEach { it.validate() }
    }
}
