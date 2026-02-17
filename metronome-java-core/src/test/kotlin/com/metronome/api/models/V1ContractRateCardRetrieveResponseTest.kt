// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1ContractRateCardRetrieveResponseTest {

    @Test
    fun createV1ContractRateCardRetrieveResponse() {
        val v1ContractRateCardRetrieveResponse =
            V1ContractRateCardRetrieveResponse.builder()
                .data(
                    V1ContractRateCardRetrieveResponse.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdBy("created_by")
                        .name("name")
                        .addAlias(
                            V1ContractRateCardRetrieveResponse.Data.Alias.builder()
                                .name("name")
                                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .addCreditTypeConversion(
                            V1ContractRateCardRetrieveResponse.Data.CreditTypeConversion.builder()
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
                            V1ContractRateCardRetrieveResponse.Data.CustomFields.builder()
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
        assertThat(v1ContractRateCardRetrieveResponse).isNotNull
        assertThat(v1ContractRateCardRetrieveResponse.data())
            .isEqualTo(
                V1ContractRateCardRetrieveResponse.Data.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .createdBy("created_by")
                    .name("name")
                    .addAlias(
                        V1ContractRateCardRetrieveResponse.Data.Alias.builder()
                            .name("name")
                            .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .addCreditTypeConversion(
                        V1ContractRateCardRetrieveResponse.Data.CreditTypeConversion.builder()
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
                        V1ContractRateCardRetrieveResponse.Data.CustomFields.builder()
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
}
