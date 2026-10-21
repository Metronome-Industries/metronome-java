// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.contracts.ratecards.namedschedules

import com.metronome.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NamedScheduleListParamsTest {

    @Test
    fun create() {
        NamedScheduleListParams.builder()
            .customerId("9b85c1c1-5238-4f2a-a409-61412905e1e1")
            .contractId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .coveringDate(OffsetDateTime.parse("2026-01-15T00:00:00Z"))
            .limit(10L)
            .nextPage("next_page")
            .properties(
                NamedScheduleListParams.Properties.builder()
                    .putAdditionalProperty("sku", JsonValue.from("A100"))
                    .build()
            )
            .scheduleName("reserved-instance")
            .build()
    }

    @Test
    fun body() {
        val params =
            NamedScheduleListParams.builder()
                .customerId("9b85c1c1-5238-4f2a-a409-61412905e1e1")
                .contractId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .coveringDate(OffsetDateTime.parse("2026-01-15T00:00:00Z"))
                .limit(10L)
                .nextPage("next_page")
                .properties(
                    NamedScheduleListParams.Properties.builder()
                        .putAdditionalProperty("sku", JsonValue.from("A100"))
                        .build()
                )
                .scheduleName("reserved-instance")
                .build()

        val body = params._body()

        assertThat(body.customerId()).isEqualTo("9b85c1c1-5238-4f2a-a409-61412905e1e1")
        assertThat(body.contractId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.coveringDate()).contains(OffsetDateTime.parse("2026-01-15T00:00:00Z"))
        assertThat(body.limit()).contains(10L)
        assertThat(body.nextPage()).contains("next_page")
        assertThat(body.properties())
            .contains(
                NamedScheduleListParams.Properties.builder()
                    .putAdditionalProperty("sku", JsonValue.from("A100"))
                    .build()
            )
        assertThat(body.scheduleName()).contains("reserved-instance")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            NamedScheduleListParams.builder()
                .customerId("9b85c1c1-5238-4f2a-a409-61412905e1e1")
                .build()

        val body = params._body()

        assertThat(body.customerId()).isEqualTo("9b85c1c1-5238-4f2a-a409-61412905e1e1")
    }
}
