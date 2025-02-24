// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import java.time.OffsetDateTime
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ContractRateCardUpdateParamsTest {

    @Test
    fun create() {
        ContractRateCardUpdateParams.builder()
            .rateCardId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
            .addAlias(
                ContractRateCardUpdateParams.Alias.builder()
                    .name("name")
                    .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
            .description("My Updated Rate Card Description")
            .name("My Updated Rate Card")
            .build()
    }

    @Test
    fun body() {
        val params =
            ContractRateCardUpdateParams.builder()
                .rateCardId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .addAlias(
                    ContractRateCardUpdateParams.Alias.builder()
                        .name("name")
                        .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .description("My Updated Rate Card Description")
                .name("My Updated Rate Card")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.rateCardId()).isEqualTo("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
        assertThat(body.aliases())
            .contains(
                listOf(
                    ContractRateCardUpdateParams.Alias.builder()
                        .name("name")
                        .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
            )
        assertThat(body.description()).contains("My Updated Rate Card Description")
        assertThat(body.name()).contains("My Updated Rate Card")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ContractRateCardUpdateParams.builder()
                .rateCardId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.rateCardId()).isEqualTo("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
    }
}
