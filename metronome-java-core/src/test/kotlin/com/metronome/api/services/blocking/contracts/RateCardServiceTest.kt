// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.contracts

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClient
import com.metronome.api.core.JsonValue
import com.metronome.api.models.*
import com.metronome.api.models.ContractRateCardListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class RateCardServiceTest {

    @Test
    fun callCreate() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val rateCardService = client.contracts().rateCards()
        val contractRateCardCreateResponse =
            rateCardService.create(
                ContractRateCardCreateParams.builder()
                    .name("name")
                    .aliases(
                        listOf(
                            ContractRateCardCreateParams.Alias.builder()
                                .name("name")
                                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                    )
                    .creditTypeConversions(
                        listOf(
                            ContractRateCardCreateParams.CreditTypeConversion.builder()
                                .customCreditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .fiatPerCustomCredit(0.0)
                                .build()
                        )
                    )
                    .customFields(
                        ContractRateCardCreateParams.CustomFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .description("description")
                    .fiatCreditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                    .build()
            )
        println(contractRateCardCreateResponse)
        contractRateCardCreateResponse.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val rateCardService = client.contracts().rateCards()
        val contractRateCardRetrieveResponse =
            rateCardService.retrieve(
                ContractRateCardRetrieveParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(contractRateCardRetrieveResponse)
        contractRateCardRetrieveResponse.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val rateCardService = client.contracts().rateCards()
        val contractRateCardUpdateResponse =
            rateCardService.update(
                ContractRateCardUpdateParams.builder()
                    .rateCardId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .aliases(
                        listOf(
                            ContractRateCardUpdateParams.Alias.builder()
                                .name("name")
                                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                    )
                    .customFields(
                        ContractRateCardUpdateParams.CustomFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .description("description")
                    .name("name")
                    .build()
            )
        println(contractRateCardUpdateResponse)
        contractRateCardUpdateResponse.validate()
    }

    @Test
    fun callList() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val rateCardService = client.contracts().rateCards()
        val response =
            rateCardService.list(
                ContractRateCardListParams.builder()
                    .body(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        println(response)
        response.data().forEach { it.validate() }
    }

    @Test
    fun callRetrieveRateSchedule() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val rateCardService = client.contracts().rateCards()
        val contractRateCardRetrieveRateScheduleResponse =
            rateCardService.retrieveRateSchedule(
                ContractRateCardRetrieveRateScheduleParams.builder()
                    .rateCardId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .selectors(
                        listOf(
                            ContractRateCardRetrieveRateScheduleParams.Selector.builder()
                                .partialPricingGroupValues(
                                    ContractRateCardRetrieveRateScheduleParams.Selector
                                        .PartialPricingGroupValues
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .pricingGroupValues(
                                    ContractRateCardRetrieveRateScheduleParams.Selector
                                        .PricingGroupValues
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .build()
                        )
                    )
                    .limit(1L)
                    .nextPage("next_page")
                    .build()
            )
        println(contractRateCardRetrieveRateScheduleResponse)
        contractRateCardRetrieveRateScheduleResponse.validate()
    }
}
