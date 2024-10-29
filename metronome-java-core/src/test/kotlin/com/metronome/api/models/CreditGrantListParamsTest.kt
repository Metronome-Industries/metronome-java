// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CreditGrantListParamsTest {

    @Test
    fun createCreditGrantListParams() {
        CreditGrantListParams.builder()
            .creditGrantIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
            .creditTypeIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
            .customerIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
            .effectiveBefore(OffsetDateTime.parse("2022-02-01T00:00:00Z"))
            .notExpiringBefore(OffsetDateTime.parse("2022-02-01T00:00:00Z"))
            .limit(100L)
            .nextPage("next_page")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            CreditGrantListParams.builder()
                .creditGrantIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .creditTypeIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .customerIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .effectiveBefore(OffsetDateTime.parse("2022-02-01T00:00:00Z"))
                .notExpiringBefore(OffsetDateTime.parse("2022-02-01T00:00:00Z"))
                .limit(100L)
                .nextPage("next_page")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("limit", listOf("100"))
        expected.put("next_page", listOf("next_page"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = CreditGrantListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getBody() {
        val params =
            CreditGrantListParams.builder()
                .creditGrantIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .creditTypeIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .customerIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .effectiveBefore(OffsetDateTime.parse("2022-02-01T00:00:00Z"))
                .notExpiringBefore(OffsetDateTime.parse("2022-02-01T00:00:00Z"))
                .limit(100L)
                .nextPage("next_page")
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
        val params = CreditGrantListParams.builder().build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }
}
