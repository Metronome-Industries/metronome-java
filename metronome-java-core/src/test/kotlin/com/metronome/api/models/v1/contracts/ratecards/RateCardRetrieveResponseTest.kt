// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.contracts.ratecards

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.JsonValue
import com.metronome.api.core.jsonMapper
import com.metronome.api.models.CreditTypeData
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RateCardRetrieveResponseTest {

    @Test
    fun create() {
        val rateCardRetrieveResponse =
            RateCardRetrieveResponse.builder()
                .data(
                    RateCardRetrieveResponse.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdBy("created_by")
                        .name("name")
                        .addAlias(
                            RateCardRetrieveResponse.Data.Alias.builder()
                                .name("name")
                                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .addCreditTypeConversion(
                            RateCardRetrieveResponse.Data.CreditTypeConversion.builder()
                                .customCreditType(
                                    CreditTypeData.builder()
                                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .name("name")
                                        .build()
                                )
                                .fiatPerCustomCredit("fiat_per_custom_credit")
                                .build()
                        )
                        .customFields(
                            RateCardRetrieveResponse.Data.CustomFields.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .description("description")
                        .fiatCreditType(
                            CreditTypeData.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .name("name")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(rateCardRetrieveResponse.data())
            .isEqualTo(
                RateCardRetrieveResponse.Data.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .createdBy("created_by")
                    .name("name")
                    .addAlias(
                        RateCardRetrieveResponse.Data.Alias.builder()
                            .name("name")
                            .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .addCreditTypeConversion(
                        RateCardRetrieveResponse.Data.CreditTypeConversion.builder()
                            .customCreditType(
                                CreditTypeData.builder()
                                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .name("name")
                                    .build()
                            )
                            .fiatPerCustomCredit("fiat_per_custom_credit")
                            .build()
                    )
                    .customFields(
                        RateCardRetrieveResponse.Data.CustomFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .description("description")
                    .fiatCreditType(
                        CreditTypeData.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .name("name")
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val rateCardRetrieveResponse =
            RateCardRetrieveResponse.builder()
                .data(
                    RateCardRetrieveResponse.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdBy("created_by")
                        .name("name")
                        .addAlias(
                            RateCardRetrieveResponse.Data.Alias.builder()
                                .name("name")
                                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .addCreditTypeConversion(
                            RateCardRetrieveResponse.Data.CreditTypeConversion.builder()
                                .customCreditType(
                                    CreditTypeData.builder()
                                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .name("name")
                                        .build()
                                )
                                .fiatPerCustomCredit("fiat_per_custom_credit")
                                .build()
                        )
                        .customFields(
                            RateCardRetrieveResponse.Data.CustomFields.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .description("description")
                        .fiatCreditType(
                            CreditTypeData.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .name("name")
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedRateCardRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(rateCardRetrieveResponse),
                jacksonTypeRef<RateCardRetrieveResponse>(),
            )

        assertThat(roundtrippedRateCardRetrieveResponse).isEqualTo(rateCardRetrieveResponse)
    }
}
