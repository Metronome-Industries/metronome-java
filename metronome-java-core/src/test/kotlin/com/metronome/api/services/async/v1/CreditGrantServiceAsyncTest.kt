// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v1

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClientAsync
import com.metronome.api.core.JsonValue
import com.metronome.api.models.RolloverAmountMaxPercentage
import com.metronome.api.models.V1CreditGrantCreateParams
import com.metronome.api.models.V1CreditGrantEditParams
import com.metronome.api.models.V1CreditGrantVoidParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CreditGrantServiceAsyncTest {

    @Test
    fun create() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val creditGrantServiceAsync = client.v1().creditGrants()

        val creditGrantFuture =
            creditGrantServiceAsync.create(
                V1CreditGrantCreateParams.builder()
                    .customerId("9b85c1c1-5238-4f2a-a409-61412905e1e1")
                    .expiresAt(OffsetDateTime.parse("2022-04-01T00:00:00Z"))
                    .grantAmount(
                        V1CreditGrantCreateParams.GrantAmount.builder()
                            .amount(1000.0)
                            .creditTypeId("5ae401dc-a648-4b49-9ac3-391bb5bc4d7b")
                            .build()
                    )
                    .name("Acme Corp Promotional Credit Grant")
                    .paidAmount(
                        V1CreditGrantCreateParams.PaidAmount.builder()
                            .amount(5000.0)
                            .creditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                            .build()
                    )
                    .priority(0.5)
                    .creditGrantType("trial")
                    .customFields(
                        V1CreditGrantCreateParams.CustomFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .effectiveAt(OffsetDateTime.parse("2022-02-01T00:00:00Z"))
                    .invoiceDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addProductId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .reason("Incentivize new customer")
                    .rolloverSettings(
                        V1CreditGrantCreateParams.RolloverSettings.builder()
                            .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .priority(0.0)
                            .rolloverAmount(
                                RolloverAmountMaxPercentage.builder()
                                    .type(RolloverAmountMaxPercentage.Type.MAX_PERCENTAGE)
                                    .value(0.0)
                                    .build()
                            )
                            .build()
                    )
                    .uniquenessKey("x")
                    .build()
            )

        val creditGrant = creditGrantFuture.get()
        creditGrant.validate()
    }

    @Test
    fun list() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val creditGrantServiceAsync = client.v1().creditGrants()

        val pageFuture = creditGrantServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun edit() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val creditGrantServiceAsync = client.v1().creditGrants()

        val responseFuture =
            creditGrantServiceAsync.edit(
                V1CreditGrantEditParams.builder()
                    .id("9b85c1c1-5238-4f2a-a409-61412905e1e1")
                    .creditGrantType("credit_grant_type")
                    .expiresAt(OffsetDateTime.parse("2022-04-01T00:00:00Z"))
                    .name("Acme Corp Promotional Credit Grant")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun listEntries() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val creditGrantServiceAsync = client.v1().creditGrants()

        val pageFuture = creditGrantServiceAsync.listEntries()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun void_() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val creditGrantServiceAsync = client.v1().creditGrants()

        val responseFuture =
            creditGrantServiceAsync.void_(
                V1CreditGrantVoidParams.builder()
                    .id("9b85c1c1-5238-4f2a-a409-61412905e1e1")
                    .releaseUniquenessKey(true)
                    .voidCreditPurchaseInvoice(true)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
