// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.contracts

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClient
import com.metronome.api.core.JsonValue
import com.metronome.api.models.ContractRateCardCreateParams
import com.metronome.api.models.ContractRateCardListParams
import com.metronome.api.models.ContractRateCardRetrieveParams
import com.metronome.api.models.ContractRateCardRetrieveRateScheduleParams
import com.metronome.api.models.ContractRateCardUpdateParams
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
                    .name("My Rate Card")
                    .addAlias(
                        ContractRateCardCreateParams.Alias.builder()
                            .name("my-rate-card")
                            .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .addCreditTypeConversion(
                        ContractRateCardCreateParams.CreditTypeConversion.builder()
                            .customCreditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                            .fiatPerCustomCredit(2.0)
                            .build()
                    )
                    .customFields(
                        ContractRateCardCreateParams.CustomFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .description("My Rate Card Description")
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
                    .id("f3d51ae8-f283-44e1-9933-a3cf9ad7a6fe")
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
                    .rateCardId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .addAlias(
                        ContractRateCardUpdateParams.Alias.builder()
                            .name("name")
                            .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .description("My Updated Rate Card Description")
                    .name("My Updated Rate Card")
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
                    .rateCardId("f3d51ae8-f283-44e1-9933-a3cf9ad7a6fe")
                    .startingAt(OffsetDateTime.parse("2024-01-01T00:00:00.000Z"))
                    .limit(1L)
                    .nextPage("next_page")
                    .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addSelector(
                        ContractRateCardRetrieveRateScheduleParams.Selector.builder()
                            .partialPricingGroupValues(
                                ContractRateCardRetrieveRateScheduleParams.Selector
                                    .PartialPricingGroupValues
                                    .builder()
                                    .putAdditionalProperty("region", JsonValue.from("us-west-2"))
                                    .putAdditionalProperty("cloud", JsonValue.from("aws"))
                                    .build()
                            )
                            .pricingGroupValues(
                                ContractRateCardRetrieveRateScheduleParams.Selector
                                    .PricingGroupValues
                                    .builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .productId("d6300dbb-882e-4d2d-8dec-5125d16b65d0")
                            .build()
                    )
                    .build()
            )
        println(contractRateCardRetrieveRateScheduleResponse)
        contractRateCardRetrieveRateScheduleResponse.validate()
    }
}
