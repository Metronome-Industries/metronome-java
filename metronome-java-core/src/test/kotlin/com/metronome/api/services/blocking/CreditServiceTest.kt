// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClient
import com.metronome.api.models.*
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CreditServiceTest {

    @Test
    fun callCreateGrant() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val creditService = client.credits()
        val creditCreateGrantResponse =
            creditService.createGrant(
                CreditCreateGrantParams.builder()
                    .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .grantAmount(
                        CreditCreateGrantParams.GrantAmount.builder()
                            .amount(42.23)
                            .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                    .name("string")
                    .paidAmount(
                        CreditCreateGrantParams.PaidAmount.builder()
                            .amount(42.23)
                            .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                    .priority(42.23)
                    .creditGrantType("string")
                    .customFields(CreditCreateGrantParams.CustomFields.builder().build())
                    .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .invoiceDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .productIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                    .reason("string")
                    .rolloverSettings(
                        CreditCreateGrantParams.RolloverSettings.builder()
                            .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .priority(42.23)
                            .rolloverAmount(
                                CreditCreateGrantParams.RolloverSettings.RolloverAmount
                                    .ofRolloverAmountMaxPercentage(
                                        CreditCreateGrantParams.RolloverSettings.RolloverAmount
                                            .RolloverAmountMaxPercentage
                                            .builder()
                                            .type(
                                                CreditCreateGrantParams.RolloverSettings
                                                    .RolloverAmount
                                                    .RolloverAmountMaxPercentage
                                                    .Type
                                                    .MAX_PERCENTAGE
                                            )
                                            .value(1.0)
                                            .build()
                                    )
                            )
                            .build()
                    )
                    .uniquenessKey("x")
                    .build()
            )
        println(creditCreateGrantResponse)
        creditCreateGrantResponse.validate()
    }

    @Test
    fun callEditGrant() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val creditService = client.credits()
        val creditEditGrantResponse =
            creditService.editGrant(
                CreditEditGrantParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .name("string")
                    .build()
            )
        println(creditEditGrantResponse)
        creditEditGrantResponse.validate()
    }

    @Test
    fun callListEntries() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val creditService = client.credits()
        val creditListEntriesResponse =
            creditService.listEntries(
                CreditListEntriesParams.builder()
                    .creditTypeIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                    .customerIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                    .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .nextPage("string")
                    .build()
            )
        println(creditListEntriesResponse)
        creditListEntriesResponse.validate()
    }

    @Test
    fun callListGrants() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val creditService = client.credits()
        val creditListGrantsResponse =
            creditService.listGrants(
                CreditListGrantsParams.builder()
                    .creditGrantIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                    .creditTypeIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                    .customerIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                    .effectiveBefore(OffsetDateTime.parse("2022-02-01T00:00:00Z"))
                    .notExpiringBefore(OffsetDateTime.parse("2022-02-01T00:00:00Z"))
                    .limit(100L)
                    .nextPage("string")
                    .build()
            )
        println(creditListGrantsResponse)
        creditListGrantsResponse.validate()
    }

    @Test
    fun callVoidGrant() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val creditService = client.credits()
        val creditVoidGrantResponse =
            creditService.voidGrant(
                CreditVoidGrantParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .voidCreditPurchaseInvoice(true)
                    .build()
            )
        println(creditVoidGrantResponse)
        creditVoidGrantResponse.validate()
    }
}
