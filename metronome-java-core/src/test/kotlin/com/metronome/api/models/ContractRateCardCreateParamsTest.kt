// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import java.time.OffsetDateTime
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ContractRateCardCreateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertNotNull(body)
        assertThat(body.name()).isEqualTo("My Rate Card")
        assertThat(body.aliases())
            .contains(
                listOf(
                    ContractRateCardCreateParams.Alias.builder()
                        .name("my-rate-card")
                        .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
            )
        assertThat(body.creditTypeConversions())
            .contains(
                listOf(
                    ContractRateCardCreateParams.CreditTypeConversion.builder()
                        .customCreditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                        .fiatPerCustomCredit(2.0)
                        .build()
                )
            )
        assertThat(body.customFields())
            .contains(
                ContractRateCardCreateParams.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.description()).contains("My Rate Card Description")
        assertThat(body.fiatCreditTypeId()).contains("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ContractRateCardCreateParams.builder().name("My Rate Card").build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.name()).isEqualTo("My Rate Card")
    }
}
