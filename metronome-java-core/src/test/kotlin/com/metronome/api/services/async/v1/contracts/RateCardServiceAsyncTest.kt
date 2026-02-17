// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v1.contracts

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClientAsync
import com.metronome.api.core.JsonValue
import com.metronome.api.models.Id
import com.metronome.api.models.V1ContractRateCardArchiveParams
import com.metronome.api.models.V1ContractRateCardCreateParams
import com.metronome.api.models.V1ContractRateCardRetrieveParams
import com.metronome.api.models.V1ContractRateCardRetrieveRateScheduleParams
import com.metronome.api.models.V1ContractRateCardUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class RateCardServiceAsyncTest {

    @Test
    fun create() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val rateCardServiceAsync = client.v1().contracts().rateCards()

        val rateCardFuture =
            rateCardServiceAsync.create(
                V1ContractRateCardCreateParams.builder()
                    .name("My Rate Card")
                    .addAlias(
                        V1ContractRateCardCreateParams.Alias.builder()
                            .name("my-rate-card")
                            .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .addCreditTypeConversion(
                        V1ContractRateCardCreateParams.CreditTypeConversion.builder()
                            .customCreditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                            .fiatPerCustomCredit(2.0)
                            .build()
                    )
                    .customFields(
                        V1ContractRateCardCreateParams.CustomFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .description("My Rate Card Description")
                    .fiatCreditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                    .build()
            )

        val rateCard = rateCardFuture.get()
        rateCard.validate()
    }

    @Test
    fun retrieve() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val rateCardServiceAsync = client.v1().contracts().rateCards()

        val rateCardFuture =
            rateCardServiceAsync.retrieve(
                V1ContractRateCardRetrieveParams.builder()
                    .id(Id.builder().id("f3d51ae8-f283-44e1-9933-a3cf9ad7a6fe").build())
                    .build()
            )

        val rateCard = rateCardFuture.get()
        rateCard.validate()
    }

    @Test
    fun update() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val rateCardServiceAsync = client.v1().contracts().rateCards()

        val rateCardFuture =
            rateCardServiceAsync.update(
                V1ContractRateCardUpdateParams.builder()
                    .rateCardId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .addAlias(
                        V1ContractRateCardUpdateParams.Alias.builder()
                            .name("name")
                            .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .description("My Updated Rate Card Description")
                    .name("My Updated Rate Card")
                    .build()
            )

        val rateCard = rateCardFuture.get()
        rateCard.validate()
    }

    @Test
    fun list() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val rateCardServiceAsync = client.v1().contracts().rateCards()

        val pageFuture = rateCardServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun archive() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val rateCardServiceAsync = client.v1().contracts().rateCards()

        val responseFuture =
            rateCardServiceAsync.archive(
                V1ContractRateCardArchiveParams.builder()
                    .id(Id.builder().id("12b21470-4570-40df-8998-449d0b0bc52f").build())
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun retrieveRateSchedule() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val rateCardServiceAsync = client.v1().contracts().rateCards()

        val responseFuture =
            rateCardServiceAsync.retrieveRateSchedule(
                V1ContractRateCardRetrieveRateScheduleParams.builder()
                    .limit(1L)
                    .nextPage("next_page")
                    .rateCardId("f3d51ae8-f283-44e1-9933-a3cf9ad7a6fe")
                    .startingAt(OffsetDateTime.parse("2024-01-01T00:00:00.000Z"))
                    .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addSelector(
                        V1ContractRateCardRetrieveRateScheduleParams.Selector.builder()
                            .billingFrequency(
                                V1ContractRateCardRetrieveRateScheduleParams.Selector
                                    .BillingFrequency
                                    .MONTHLY
                            )
                            .partialPricingGroupValues(
                                V1ContractRateCardRetrieveRateScheduleParams.Selector
                                    .PartialPricingGroupValues
                                    .builder()
                                    .putAdditionalProperty("region", JsonValue.from("us-west-2"))
                                    .putAdditionalProperty("cloud", JsonValue.from("aws"))
                                    .build()
                            )
                            .pricingGroupValues(
                                V1ContractRateCardRetrieveRateScheduleParams.Selector
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

        val response = responseFuture.get()
        response.validate()
    }
}
