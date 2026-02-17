// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1.customers

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClient
import com.metronome.api.models.V1CustomerInvoiceAddChargeParams
import com.metronome.api.models.V1CustomerInvoiceListBreakdownsParams
import com.metronome.api.models.V1CustomerInvoiceListParams
import com.metronome.api.models.V1CustomerInvoiceRetrieveParams
import com.metronome.api.models.V1CustomerInvoiceRetrievePdfParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
@WireMockTest
class InvoiceServiceTest {

    @Test
    fun retrieve() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val invoiceService = client.v1().customers().invoices()

        val invoice =
            invoiceService.retrieve(
                V1CustomerInvoiceRetrieveParams.builder()
                    .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .invoiceId("6a37bb88-8538-48c5-b37b-a41c836328bd")
                    .skipZeroQtyLineItems(true)
                    .build()
            )

        invoice.validate()
    }

    @Test
    fun list() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val invoiceService = client.v1().customers().invoices()

        val page =
            invoiceService.list(
                V1CustomerInvoiceListParams.builder()
                    .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .build()
            )

        page.response().validate()
    }

    @Test
    fun addCharge() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val invoiceService = client.v1().customers().invoices()

        val response =
            invoiceService.addCharge(
                V1CustomerInvoiceAddChargeParams.builder()
                    .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .chargeId("5ae4b726-1ebe-439c-9190-9831760ba195")
                    .customerPlanId("a23b3cf4-47fb-4c3f-bb3d-9e64f7704015")
                    .description("One time charge")
                    .invoiceStartTimestamp(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                    .price(250.0)
                    .quantity(1.0)
                    .build()
            )

        response.validate()
    }

    @Test
    fun listBreakdowns() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val invoiceService = client.v1().customers().invoices()

        val page =
            invoiceService.listBreakdowns(
                V1CustomerInvoiceListBreakdownsParams.builder()
                    .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        page.response().validate()
    }

    @Disabled("prism mocking library in JS SDK doesnt support application/pdf")
    @Test
    fun retrievePdf(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .bearerToken("My Bearer Token")
                .build()
        val invoiceService = client.v1().customers().invoices()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            invoiceService.retrievePdf(
                V1CustomerInvoiceRetrievePdfParams.builder()
                    .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .invoiceId("6a37bb88-8538-48c5-b37b-a41c836328bd")
                    .build()
            )

        assertThat(response.body()).hasContent("abc")
    }
}
