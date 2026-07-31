// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.contracts.ratecards

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.JsonValue
import com.metronome.api.core.jsonMapper
import com.metronome.api.models.CreditTypeData
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RateCardListResponseTest {

    @Test
    fun create() {
        val rateCardListResponse =
            RateCardListResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdBy("created_by")
                .name("name")
                .addAlias(
                    RateCardListResponse.Alias.builder()
                        .name("name")
                        .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .addCreditTypeConversion(
                    RateCardListResponse.CreditTypeConversion.builder()
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
                    RateCardListResponse.CustomFields.builder()
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

        assertThat(rateCardListResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(rateCardListResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(rateCardListResponse.createdBy()).isEqualTo("created_by")
        assertThat(rateCardListResponse.name()).isEqualTo("name")
        assertThat(rateCardListResponse.aliases().getOrNull())
            .containsExactly(
                RateCardListResponse.Alias.builder()
                    .name("name")
                    .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(rateCardListResponse.creditTypeConversions().getOrNull())
            .containsExactly(
                RateCardListResponse.CreditTypeConversion.builder()
                    .customCreditType(
                        CreditTypeData.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .name("name")
                            .build()
                    )
                    .fiatPerCustomCredit("fiat_per_custom_credit")
                    .build()
            )
        assertThat(rateCardListResponse.customFields())
            .contains(
                RateCardListResponse.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(rateCardListResponse.description()).contains("description")
        assertThat(rateCardListResponse.fiatCreditType())
            .contains(
                CreditTypeData.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val rateCardListResponse =
            RateCardListResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdBy("created_by")
                .name("name")
                .addAlias(
                    RateCardListResponse.Alias.builder()
                        .name("name")
                        .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .addCreditTypeConversion(
                    RateCardListResponse.CreditTypeConversion.builder()
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
                    RateCardListResponse.CustomFields.builder()
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

        val roundtrippedRateCardListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(rateCardListResponse),
                jacksonTypeRef<RateCardListResponse>(),
            )

        assertThat(roundtrippedRateCardListResponse).isEqualTo(rateCardListResponse)
    }
}
