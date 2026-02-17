// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v1

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClientAsync
import com.metronome.api.models.V1PaymentAttemptParams
import com.metronome.api.models.V1PaymentCancelParams
import com.metronome.api.models.V1PaymentListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class PaymentServiceAsyncTest {

    @Test
    fun list() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val paymentServiceAsync = client.v1().payments()

        val pageFuture =
            paymentServiceAsync.list(
                V1PaymentListParams.builder()
                    .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                    .invoiceId("6162d87b-e5db-4a33-b7f2-76ce6ead4e85")
                    .build()
            )

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun attempt() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val paymentServiceAsync = client.v1().payments()

        val responseFuture =
            paymentServiceAsync.attempt(
                V1PaymentAttemptParams.builder()
                    .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                    .invoiceId("6162d87b-e5db-4a33-b7f2-76ce6ead4e85")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun cancel() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val paymentServiceAsync = client.v1().payments()

        val responseFuture =
            paymentServiceAsync.cancel(
                V1PaymentCancelParams.builder()
                    .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                    .invoiceId("6162d87b-e5db-4a33-b7f2-76ce6ead4e85")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
