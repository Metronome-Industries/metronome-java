// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.contracts.ratecards

import com.metronome.api.core.JsonValue
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RateCardCreateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.name()).isEqualTo("My Rate Card")
        assertThat(body.aliases().getOrNull())
            .containsExactly(
                RateCardCreateParams.Alias.builder()
                    .name("my-rate-card")
                    .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(body.creditTypeConversions().getOrNull())
            .containsExactly(
                RateCardCreateParams.CreditTypeConversion.builder()
                    .customCreditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                    .fiatPerCustomCredit(2.0)
                    .build()
            )
        assertThat(body.customFields())
            .contains(
                RateCardCreateParams.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.description()).contains("My Rate Card Description")
        assertThat(body.fiatCreditTypeId()).contains("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = RateCardCreateParams.builder().name("My Rate Card").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("My Rate Card")
    }
}
