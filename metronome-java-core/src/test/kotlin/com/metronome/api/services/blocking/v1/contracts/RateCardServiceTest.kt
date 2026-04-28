// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1.contracts

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClient
import com.metronome.api.core.JsonValue
import com.metronome.api.models.Id
import com.metronome.api.models.v1.contracts.ratecards.RateCardCreateParams
import com.metronome.api.models.v1.contracts.ratecards.RateCardRetrieveRateScheduleParams
import com.metronome.api.models.v1.contracts.ratecards.RateCardUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RateCardServiceTest {

    @Test
    fun create() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val rateCardService = client.v1().contracts().rateCards()

        val rateCard =
            rateCardService.create(
                RateCardCreateParams.builder()
                    .name("My Rate Card")
                    .addAlias(
                        RateCardCreateParams.Alias.builder()
                            .name("my-rate-card")
                            .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .addCreditTypeConversion(
                        RateCardCreateParams.CreditTypeConversion.builder()
                            .customCreditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                            .fiatPerCustomCredit(2.0)
                            .build()
                    )
                    .customFields(
                        RateCardCreateParams.CustomFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .description("My Rate Card Description")
                    .fiatCreditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                    .build()
            )

        rateCard.validate()
    }

    @Test
    fun retrieve() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val rateCardService = client.v1().contracts().rateCards()

        val rateCard =
            rateCardService.retrieve(
                Id.builder().id("f3d51ae8-f283-44e1-9933-a3cf9ad7a6fe").build()
            )

        rateCard.validate()
    }

    @Test
    fun update() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val rateCardService = client.v1().contracts().rateCards()

        val rateCard =
            rateCardService.update(
                RateCardUpdateParams.builder()
                    .rateCardId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .addAlias(
                        RateCardUpdateParams.Alias.builder()
                            .name("name")
                            .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .description("My Updated Rate Card Description")
                    .name("My Updated Rate Card")
                    .build()
            )

        rateCard.validate()
    }

    @Disabled(
        "Skipping Java generated test due to empty-body serialization/hang edge case on this endpoint."
    )
    @Test
    fun list() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val rateCardService = client.v1().contracts().rateCards()

        val page = rateCardService.list()

        page.response().validate()
    }

    @Test
    fun archive() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val rateCardService = client.v1().contracts().rateCards()

        val response =
            rateCardService.archive(Id.builder().id("12b21470-4570-40df-8998-449d0b0bc52f").build())

        response.validate()
    }

    @Test
    fun retrieveRateSchedule() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val rateCardService = client.v1().contracts().rateCards()

        val response =
            rateCardService.retrieveRateSchedule(
                RateCardRetrieveRateScheduleParams.builder()
                    .limit(1L)
                    .nextPage("next_page")
                    .rateCardId("f3d51ae8-f283-44e1-9933-a3cf9ad7a6fe")
                    .startingAt(OffsetDateTime.parse("2024-01-01T00:00:00.000Z"))
                    .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addSelector(
                        RateCardRetrieveRateScheduleParams.Selector.builder()
                            .billingFrequency(
                                RateCardRetrieveRateScheduleParams.Selector.BillingFrequency.MONTHLY
                            )
                            .partialPricingGroupValues(
                                RateCardRetrieveRateScheduleParams.Selector
                                    .PartialPricingGroupValues
                                    .builder()
                                    .putAdditionalProperty("region", JsonValue.from("us-west-2"))
                                    .putAdditionalProperty("cloud", JsonValue.from("aws"))
                                    .build()
                            )
                            .pricingGroupValues(
                                RateCardRetrieveRateScheduleParams.Selector.PricingGroupValues
                                    .builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .productId("d6300dbb-882e-4d2d-8dec-5125d16b65d0")
                            .build()
                    )
                    .build()
            )

        response.validate()
    }
}
