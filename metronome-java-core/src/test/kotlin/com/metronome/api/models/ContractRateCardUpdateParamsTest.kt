// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import com.metronome.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ContractRateCardUpdateParamsTest {

    @Test
    fun createContractRateCardUpdateParams() {
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
    }

    @Test
    fun getBody() {
        val params =
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
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.rateCardId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.aliases())
            .isEqualTo(
                listOf(
                    ContractRateCardUpdateParams.Alias.builder()
                        .name("name")
                        .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
            )
        assertThat(body.customFields())
            .isEqualTo(
                ContractRateCardUpdateParams.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.description()).isEqualTo("description")
        assertThat(body.name()).isEqualTo("name")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            ContractRateCardUpdateParams.builder()
                .rateCardId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.rateCardId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
