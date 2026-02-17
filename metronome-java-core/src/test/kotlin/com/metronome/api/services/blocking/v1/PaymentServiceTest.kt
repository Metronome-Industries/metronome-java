// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClient
import com.metronome.api.models.V1PaymentAttemptParams
import com.metronome.api.models.V1PaymentCancelParams
import com.metronome.api.models.V1PaymentListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class PaymentServiceTest {

    @Test
    fun list() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val paymentService = client.v1().payments()

        val page =
            paymentService.list(
                V1PaymentListParams.builder()
                    .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                    .invoiceId("6162d87b-e5db-4a33-b7f2-76ce6ead4e85")
                    .build()
            )

        page.response().validate()
    }

    @Test
    fun attempt() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val paymentService = client.v1().payments()

        val response =
            paymentService.attempt(
                V1PaymentAttemptParams.builder()
                    .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                    .invoiceId("6162d87b-e5db-4a33-b7f2-76ce6ead4e85")
                    .build()
            )

        response.validate()
    }

    @Test
    fun cancel() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val paymentService = client.v1().payments()

        val response =
            paymentService.cancel(
                V1PaymentCancelParams.builder()
                    .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                    .invoiceId("6162d87b-e5db-4a33-b7f2-76ce6ead4e85")
                    .build()
            )

        response.validate()
    }
}
