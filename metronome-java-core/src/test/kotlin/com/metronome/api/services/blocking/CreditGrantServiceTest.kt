// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClient
import com.metronome.api.models.*
import com.metronome.api.models.CreditGrantListCreditTypesParams
import com.metronome.api.models.CreditGrantListParams
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
                    .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .grantAmount(
                        CreditGrantCreateParams.GrantAmount.builder()
                            .amount(0.0)
                            .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                    .name("name")
                    .paidAmount(
                        CreditGrantCreateParams.PaidAmount.builder()
                            .amount(0.0)
                            .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                    .priority(0.0)
                    .creditGrantType("credit_grant_type")
                    .customFields(CreditGrantCreateParams.CustomFields.builder().build())
                    .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .invoiceDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .productIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                    .reason("reason")
                    .rolloverSettings(
                        CreditGrantCreateParams.RolloverSettings.builder()
                            .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .priority(0.0)
                            .rolloverAmount(
                                CreditGrantCreateParams.RolloverSettings.RolloverAmount
                                    .ofRolloverAmountMaxPercentage(
                                        RolloverAmountMaxPercentage.builder()
                                            .type(RolloverAmountMaxPercentage.Type.MAX_PERCENTAGE)
                                            .value(0.0)
                                            .build()
                                    )
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
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .creditGrantType("credit_grant_type")
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .name("name")
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
                    .creditTypeIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                    .customerIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                    .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .nextPage("next_page")
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
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .releaseUniquenessKey(true)
                    .voidCreditPurchaseInvoice(true)
                    .build()
            )
        println(creditGrantVoidResponse)
        creditGrantVoidResponse.validate()
    }
}
