// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CreditListGrantsParamsTest {

    @Test
    fun createCreditListGrantsParams() {
        CreditListGrantsParams.builder()
            .creditGrantIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
            .creditTypeIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
            .customerIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
            .effectiveBefore(OffsetDateTime.parse("2022-02-01T00:00:00Z"))
            .notExpiringBefore(OffsetDateTime.parse("2022-02-01T00:00:00Z"))
            .limit(100L)
            .nextPage("string")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            CreditListGrantsParams.builder()
                .creditGrantIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .creditTypeIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .customerIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .effectiveBefore(OffsetDateTime.parse("2022-02-01T00:00:00Z"))
                .notExpiringBefore(OffsetDateTime.parse("2022-02-01T00:00:00Z"))
                .limit(100L)
                .nextPage("string")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("limit", listOf("100"))
        expected.put("next_page", listOf("string"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = CreditListGrantsParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getBody() {
        val params =
            CreditListGrantsParams.builder()
                .creditGrantIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .creditTypeIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .customerIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .effectiveBefore(OffsetDateTime.parse("2022-02-01T00:00:00Z"))
                .notExpiringBefore(OffsetDateTime.parse("2022-02-01T00:00:00Z"))
                .limit(100L)
                .nextPage("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.creditGrantIds()).isEqualTo(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        assertThat(body.creditTypeIds()).isEqualTo(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        assertThat(body.customerIds()).isEqualTo(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        assertThat(body.effectiveBefore()).isEqualTo(OffsetDateTime.parse("2022-02-01T00:00:00Z"))
        assertThat(body.notExpiringBefore()).isEqualTo(OffsetDateTime.parse("2022-02-01T00:00:00Z"))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = CreditListGrantsParams.builder().build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }
}
