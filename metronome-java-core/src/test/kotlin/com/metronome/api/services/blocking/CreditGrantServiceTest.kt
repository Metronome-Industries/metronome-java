// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClient
import com.metronome.api.core.JsonValue
import com.metronome.api.models.CreditGrantCreateParams
import com.metronome.api.models.CreditGrantEditParams
import com.metronome.api.models.CreditGrantListCreditTypesParams
import com.metronome.api.models.CreditGrantListEntriesParams
import com.metronome.api.models.CreditGrantListParams
import com.metronome.api.models.CreditGrantVoidParams
import com.metronome.api.models.RolloverAmountMaxPercentage
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CreditGrantServiceTest {

    @Test
    fun callCreate() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val creditGrantService = client.creditGrants()
        val creditGrantCreateResponse =
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
        println(creditGrantCreateResponse)
        creditGrantCreateResponse.validate()
    }

    @Test
    fun callList() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val creditGrantService = client.creditGrants()
        val response = creditGrantService.list(CreditGrantListParams.builder().build())
        println(response)
        response.data().forEach { it.validate() }
    }

    @Test
    fun callEdit() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val creditGrantService = client.creditGrants()
        val creditGrantEditResponse =
            creditGrantService.edit(
                CreditGrantEditParams.builder()
                    .id("9b85c1c1-5238-4f2a-a409-61412905e1e1")
                    .creditGrantType("credit_grant_type")
                    .expiresAt(OffsetDateTime.parse("2022-04-01T00:00:00Z"))
                    .name("Acme Corp Promotional Credit Grant")
                    .build()
            )
        println(creditGrantEditResponse)
        creditGrantEditResponse.validate()
    }

    @Test
    fun callListCreditTypes() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val creditGrantService = client.creditGrants()
        val response =
            creditGrantService.listCreditTypes(CreditGrantListCreditTypesParams.builder().build())
        println(response)
        response.data().forEach { it.validate() }
    }

    @Test
    fun callListEntries() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val creditGrantService = client.creditGrants()
        val creditGrantListEntriesResponse =
            creditGrantService.listEntries(
                CreditGrantListEntriesParams.builder()
                    .nextPage("next_page")
                    .addCreditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                    .addCustomerId("6a37bb88-8538-48c5-b37b-a41c836328bd")
                    .endingBefore(OffsetDateTime.parse("2021-02-01T00:00:00Z"))
                    .startingOn(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
                    .build()
            )
        println(creditGrantListEntriesResponse)
        creditGrantListEntriesResponse.validate()
    }

    @Test
    fun callVoid() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val creditGrantService = client.creditGrants()
        val creditGrantVoidResponse =
            creditGrantService.void_(
                CreditGrantVoidParams.builder()
                    .id("9b85c1c1-5238-4f2a-a409-61412905e1e1")
                    .releaseUniquenessKey(true)
                    .voidCreditPurchaseInvoice(true)
                    .build()
            )
        println(creditGrantVoidResponse)
        creditGrantVoidResponse.validate()
    }
}
