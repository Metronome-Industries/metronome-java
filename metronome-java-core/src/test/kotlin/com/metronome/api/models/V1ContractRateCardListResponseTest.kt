// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1ContractRateCardListResponseTest {

    @Test
    fun createV1ContractRateCardListResponse() {
        val v1ContractRateCardListResponse =
            V1ContractRateCardListResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdBy("created_by")
                .name("name")
                .addAlias(
                    V1ContractRateCardListResponse.Alias.builder()
                        .name("name")
                        .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .addCreditTypeConversion(
                    V1ContractRateCardListResponse.CreditTypeConversion.builder()
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
                    V1ContractRateCardListResponse.CustomFields.builder()
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
        assertThat(v1ContractRateCardListResponse).isNotNull
        assertThat(v1ContractRateCardListResponse.id())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(v1ContractRateCardListResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(v1ContractRateCardListResponse.createdBy()).isEqualTo("created_by")
        assertThat(v1ContractRateCardListResponse.name()).isEqualTo("name")
        assertThat(v1ContractRateCardListResponse.aliases().get())
            .containsExactly(
                V1ContractRateCardListResponse.Alias.builder()
                    .name("name")
                    .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(v1ContractRateCardListResponse.creditTypeConversions().get())
            .containsExactly(
                V1ContractRateCardListResponse.CreditTypeConversion.builder()
                    .customCreditType(
                        CreditTypeData.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .name("name")
                            .build()
                    )
                    .fiatPerCustomCredit("fiat_per_custom_credit")
                    .build()
            )
        assertThat(v1ContractRateCardListResponse.customFields())
            .contains(
                V1ContractRateCardListResponse.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(v1ContractRateCardListResponse.description()).contains("description")
        assertThat(v1ContractRateCardListResponse.fiatCreditType())
            .contains(
                CreditTypeData.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .build()
            )
    }
}
