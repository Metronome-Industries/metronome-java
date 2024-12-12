// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ContractSetUsageFilterParamsTest {

    @Test
    fun createContractSetUsageFilterParams() {
        ContractSetUsageFilterParams.builder()
            .contractId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .groupKey("group_key")
            .groupValues(listOf("string"))
            .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun getBody() {
        val params =
            ContractSetUsageFilterParams.builder()
                .contractId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .groupKey("group_key")
                .groupValues(listOf("string"))
                .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.contractId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.customerId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.groupKey()).isEqualTo("group_key")
        assertThat(body.groupValues()).isEqualTo(listOf("string"))
        assertThat(body.startingAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            ContractSetUsageFilterParams.builder()
                .contractId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .groupKey("group_key")
                .groupValues(listOf("string"))
                .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.contractId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.customerId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.groupKey()).isEqualTo("group_key")
        assertThat(body.groupValues()).isEqualTo(listOf("string"))
        assertThat(body.startingAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
