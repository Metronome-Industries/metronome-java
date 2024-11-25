// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.customers

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClient
import com.metronome.api.models.*
import com.metronome.api.models.CustomerInvoiceListBreakdownsParams
import com.metronome.api.models.CustomerInvoiceListParams
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
                    .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .invoiceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
                    .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
                    .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .chargeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .customerPlanId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("description")
                    .invoiceStartTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .price(0.0)
                    .quantity(0.0)
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
                    .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        println(response)
        response.data().forEach { it.validate() }
    }
}
