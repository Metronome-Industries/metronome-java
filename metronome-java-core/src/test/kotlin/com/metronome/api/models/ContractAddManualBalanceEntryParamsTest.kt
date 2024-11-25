// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ContractAddManualBalanceEntryParamsTest {

    @Test
    fun createContractAddManualBalanceEntryParams() {
        ContractAddManualBalanceEntryParams.builder()
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .amount(0.0)
            .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .reason("reason")
            .segmentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .contractId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun getBody() {
        val params =
            ContractAddManualBalanceEntryParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amount(0.0)
                .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .reason("reason")
                .segmentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .contractId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.amount()).isEqualTo(0.0)
        assertThat(body.customerId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.reason()).isEqualTo("reason")
        assertThat(body.segmentId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.contractId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.timestamp()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            ContractAddManualBalanceEntryParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amount(0.0)
                .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .reason("reason")
                .segmentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.amount()).isEqualTo(0.0)
        assertThat(body.customerId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.reason()).isEqualTo("reason")
        assertThat(body.segmentId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
