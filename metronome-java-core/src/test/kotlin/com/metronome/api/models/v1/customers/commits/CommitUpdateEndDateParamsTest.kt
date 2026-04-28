// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers.commits

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommitUpdateEndDateParamsTest {

    @Test
    fun create() {
        CommitUpdateEndDateParams.builder()
            .commitId("6162d87b-e5db-4a33-b7f2-76ce6ead4e85")
            .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
            .accessEndingBefore(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
            .invoicesEndingBefore(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
            .build()
    }

    @Test
    fun body() {
        val params =
            CommitUpdateEndDateParams.builder()
                .commitId("6162d87b-e5db-4a33-b7f2-76ce6ead4e85")
                .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                .accessEndingBefore(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                .invoicesEndingBefore(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                .build()

        val body = params._body()

        assertThat(body.commitId()).isEqualTo("6162d87b-e5db-4a33-b7f2-76ce6ead4e85")
        assertThat(body.customerId()).isEqualTo("13117714-3f05-48e5-a6e9-a66093f13b4d")
        assertThat(body.accessEndingBefore())
            .contains(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
        assertThat(body.invoicesEndingBefore())
            .contains(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CommitUpdateEndDateParams.builder()
                .commitId("6162d87b-e5db-4a33-b7f2-76ce6ead4e85")
                .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                .build()

        val body = params._body()

        assertThat(body.commitId()).isEqualTo("6162d87b-e5db-4a33-b7f2-76ce6ead4e85")
        assertThat(body.customerId()).isEqualTo("13117714-3f05-48e5-a6e9-a66093f13b4d")
    }
}
