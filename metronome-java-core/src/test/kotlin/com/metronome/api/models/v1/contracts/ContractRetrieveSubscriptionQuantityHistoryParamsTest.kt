// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.contracts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContractRetrieveSubscriptionQuantityHistoryParamsTest {

    @Test
    fun create() {
        ContractRetrieveSubscriptionQuantityHistoryParams.builder()
            .contractId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
            .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
            .subscriptionId("1a824d53-bde6-4d82-96d7-6347ff227d5c")
            .build()
    }

    @Test
    fun body() {
        val params =
            ContractRetrieveSubscriptionQuantityHistoryParams.builder()
                .contractId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                .subscriptionId("1a824d53-bde6-4d82-96d7-6347ff227d5c")
                .build()

        val body = params._body()

        assertThat(body.contractId()).isEqualTo("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
        assertThat(body.customerId()).isEqualTo("13117714-3f05-48e5-a6e9-a66093f13b4d")
        assertThat(body.subscriptionId()).isEqualTo("1a824d53-bde6-4d82-96d7-6347ff227d5c")
    }
}
