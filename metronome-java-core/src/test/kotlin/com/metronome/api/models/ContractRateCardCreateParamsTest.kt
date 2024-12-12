// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ContractRateCardCreateParamsTest {

    @Test
    fun createContractRateCardCreateParams() {
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
    }

    @Test
    fun getBody() {
        val params =
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
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.aliases())
            .isEqualTo(
                listOf(
                    ContractRateCardCreateParams.Alias.builder()
                        .name("name")
                        .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
            )
        assertThat(body.creditTypeConversions())
            .isEqualTo(
                listOf(
                    ContractRateCardCreateParams.CreditTypeConversion.builder()
                        .customCreditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .fiatPerCustomCredit(0.0)
                        .build()
                )
            )
        assertThat(body.customFields())
            .isEqualTo(
                ContractRateCardCreateParams.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.description()).isEqualTo("description")
        assertThat(body.fiatCreditTypeId()).isEqualTo("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = ContractRateCardCreateParams.builder().name("name").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("name")
    }
}
