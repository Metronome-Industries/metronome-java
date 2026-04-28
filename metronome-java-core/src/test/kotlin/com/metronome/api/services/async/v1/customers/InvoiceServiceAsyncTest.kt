// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v1.customers

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClientAsync
import com.metronome.api.models.v1.customers.invoices.InvoiceAddChargeParams
import com.metronome.api.models.v1.customers.invoices.InvoiceListBreakdownsParams
import com.metronome.api.models.v1.customers.invoices.InvoiceListParams
import com.metronome.api.models.v1.customers.invoices.InvoiceRetrieveParams
import com.metronome.api.models.v1.customers.invoices.InvoiceRetrievePdfParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.parallel.ResourceLock

@ExtendWith(TestServerExtension::class)
@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class InvoiceServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val invoiceServiceAsync = client.v1().customers().invoices()

        val invoiceFuture =
            invoiceServiceAsync.retrieve(
                InvoiceRetrieveParams.builder()
                    .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .invoiceId("6a37bb88-8538-48c5-b37b-a41c836328bd")
                    .skipZeroQtyLineItems(true)
                    .build()
            )

        val invoice = invoiceFuture.get()
        invoice.validate()
    }

    @Test
    fun list() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val invoiceServiceAsync = client.v1().customers().invoices()

        val pageFuture =
            invoiceServiceAsync.list(
                InvoiceListParams.builder()
                    .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .build()
            )

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun addCharge() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val invoiceServiceAsync = client.v1().customers().invoices()

        val responseFuture =
            invoiceServiceAsync.addCharge(
                InvoiceAddChargeParams.builder()
                    .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .chargeId("5ae4b726-1ebe-439c-9190-9831760ba195")
                    .customerPlanId("a23b3cf4-47fb-4c3f-bb3d-9e64f7704015")
                    .description("One time charge")
                    .invoiceStartTimestamp(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                    .price(250.0)
                    .quantity(1.0)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun listBreakdowns() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val invoiceServiceAsync = client.v1().customers().invoices()

        val pageFuture =
            invoiceServiceAsync.listBreakdowns(
                InvoiceListBreakdownsParams.builder()
                    .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("prism mocking library in JS SDK doesnt support application/pdf")
    @Test
    fun retrievePdf(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .bearerToken("My Bearer Token")
                .build()
        val invoiceServiceAsync = client.v1().customers().invoices()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            invoiceServiceAsync.retrievePdf(
                InvoiceRetrievePdfParams.builder()
                    .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .invoiceId("6a37bb88-8538-48c5-b37b-a41c836328bd")
                    .build()
            )

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }
}
