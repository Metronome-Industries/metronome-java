// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ContractListBalancesParamsTest {

    @Test
    fun createContractListBalancesParams() {
        ContractListBalancesParams.builder()
            .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
            .id("6162d87b-e5db-4a33-b7f2-76ce6ead4e85")
            .coveringDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .effectiveBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .includeArchived(true)
            .includeContractBalances(true)
            .includeLedgers(true)
            .nextPage("next_page")
            .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun getBody() {
        val params =
            ContractListBalancesParams.builder()
                .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                .id("6162d87b-e5db-4a33-b7f2-76ce6ead4e85")
                .coveringDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .effectiveBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .includeArchived(true)
                .includeContractBalances(true)
                .includeLedgers(true)
                .nextPage("next_page")
                .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.customerId()).isEqualTo("13117714-3f05-48e5-a6e9-a66093f13b4d")
        assertThat(body.id()).isEqualTo("6162d87b-e5db-4a33-b7f2-76ce6ead4e85")
        assertThat(body.coveringDate()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.effectiveBefore())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.includeArchived()).isEqualTo(true)
        assertThat(body.includeContractBalances()).isEqualTo(true)
        assertThat(body.includeLedgers()).isEqualTo(true)
        assertThat(body.nextPage()).isEqualTo("next_page")
        assertThat(body.startingAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            ContractListBalancesParams.builder()
                .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.customerId()).isEqualTo("13117714-3f05-48e5-a6e9-a66093f13b4d")
    }
}
