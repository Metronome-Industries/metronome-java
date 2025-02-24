// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import java.time.OffsetDateTime
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerCreditListParamsTest {

    @Test
    fun create() {
        CustomerCreditListParams.builder()
            .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
            .coveringDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .creditId("6162d87b-e5db-4a33-b7f2-76ce6ead4e85")
            .effectiveBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .includeArchived(true)
            .includeBalance(true)
            .includeContractCredits(true)
            .includeLedgers(true)
            .nextPage("next_page")
            .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun body() {
        val params =
            CustomerCreditListParams.builder()
                .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                .coveringDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditId("6162d87b-e5db-4a33-b7f2-76ce6ead4e85")
                .effectiveBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .includeArchived(true)
                .includeBalance(true)
                .includeContractCredits(true)
                .includeLedgers(true)
                .nextPage("next_page")
                .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.customerId()).isEqualTo("13117714-3f05-48e5-a6e9-a66093f13b4d")
        assertThat(body.coveringDate()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.creditId()).contains("6162d87b-e5db-4a33-b7f2-76ce6ead4e85")
        assertThat(body.effectiveBefore())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.includeArchived()).contains(true)
        assertThat(body.includeBalance()).contains(true)
        assertThat(body.includeContractCredits()).contains(true)
        assertThat(body.includeLedgers()).contains(true)
        assertThat(body.nextPage()).contains("next_page")
        assertThat(body.startingAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CustomerCreditListParams.builder()
                .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.customerId()).isEqualTo("13117714-3f05-48e5-a6e9-a66093f13b4d")
    }
}
