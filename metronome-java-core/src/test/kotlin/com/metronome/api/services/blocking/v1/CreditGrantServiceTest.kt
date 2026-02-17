// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClient
import com.metronome.api.core.JsonValue
import com.metronome.api.models.v1.creditgrants.CreditGrantCreateParams
import com.metronome.api.models.v1.creditgrants.CreditGrantEditParams
import com.metronome.api.models.v1.creditgrants.CreditGrantVoidParams
import com.metronome.api.models.v1.creditgrants.RolloverAmountMaxPercentage
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CreditGrantServiceTest {

    @Test
    fun create() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val creditGrantService = client.v1().creditGrants()

        val creditGrant =
            creditGrantService.create(
                CreditGrantCreateParams.builder()
                    .customerId("9b85c1c1-5238-4f2a-a409-61412905e1e1")
                    .expiresAt(OffsetDateTime.parse("2022-04-01T00:00:00Z"))
                    .grantAmount(
                        CreditGrantCreateParams.GrantAmount.builder()
                            .amount(1000.0)
                            .creditTypeId("5ae401dc-a648-4b49-9ac3-391bb5bc4d7b")
                            .build()
                    )
                    .name("Acme Corp Promotional Credit Grant")
                    .paidAmount(
                        CreditGrantCreateParams.PaidAmount.builder()
                            .amount(5000.0)
                            .creditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                            .build()
                    )
                    .priority(0.5)
                    .creditGrantType("trial")
                    .customFields(
                        CreditGrantCreateParams.CustomFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .effectiveAt(OffsetDateTime.parse("2022-02-01T00:00:00Z"))
                    .invoiceDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addProductId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .reason("Incentivize new customer")
                    .rolloverSettings(
                        CreditGrantCreateParams.RolloverSettings.builder()
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

        creditGrant.validate()
    }

    @Test
    fun list() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val creditGrantService = client.v1().creditGrants()

        val page = creditGrantService.list()

        page.response().validate()
    }

    @Test
    fun edit() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val creditGrantService = client.v1().creditGrants()

        val response =
            creditGrantService.edit(
                CreditGrantEditParams.builder()
                    .id("9b85c1c1-5238-4f2a-a409-61412905e1e1")
                    .creditGrantType("credit_grant_type")
                    .expiresAt(OffsetDateTime.parse("2022-04-01T00:00:00Z"))
                    .name("Acme Corp Promotional Credit Grant")
                    .build()
            )

        response.validate()
    }

    @Test
    fun listEntries() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val creditGrantService = client.v1().creditGrants()

        val page = creditGrantService.listEntries()

        page.response().validate()
    }

    @Test
    fun void_() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val creditGrantService = client.v1().creditGrants()

        val response =
            creditGrantService.void_(
                CreditGrantVoidParams.builder()
                    .id("9b85c1c1-5238-4f2a-a409-61412905e1e1")
                    .releaseUniquenessKey(true)
                    .voidCreditPurchaseInvoice(true)
                    .build()
            )

        response.validate()
    }
}
