// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ContractRetrieveParamsTest {

    @Test
    fun createContractRetrieveParams() {
        ContractRetrieveParams.builder()
            .contractId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
            .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
            .includeBalance(true)
            .includeLedgers(true)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            ContractRetrieveParams.builder()
                .contractId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                .includeBalance(true)
                .includeLedgers(true)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.contractId()).isEqualTo("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
        assertThat(body.customerId()).isEqualTo("13117714-3f05-48e5-a6e9-a66093f13b4d")
        assertThat(body.includeBalance()).contains(true)
        assertThat(body.includeLedgers()).contains(true)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            ContractRetrieveParams.builder()
                .contractId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.contractId()).isEqualTo("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
        assertThat(body.customerId()).isEqualTo("13117714-3f05-48e5-a6e9-a66093f13b4d")
    }
}
