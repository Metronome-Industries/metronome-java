// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CreditGrantListEntriesParamsTest {

    @Test
    fun createCreditGrantListEntriesParams() {
        CreditGrantListEntriesParams.builder()
            .nextPage("next_page")
            .creditTypeIds(listOf("2714e483-4ff1-48e4-9e25-ac732e8f24f2"))
            .customerIds(listOf("6a37bb88-8538-48c5-b37b-a41c836328bd"))
            .endingBefore(OffsetDateTime.parse("2021-02-01T00:00:00Z"))
            .startingOn(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            CreditGrantListEntriesParams.builder()
                .nextPage("next_page")
                .creditTypeIds(listOf("2714e483-4ff1-48e4-9e25-ac732e8f24f2"))
                .customerIds(listOf("6a37bb88-8538-48c5-b37b-a41c836328bd"))
                .endingBefore(OffsetDateTime.parse("2021-02-01T00:00:00Z"))
                .startingOn(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
                .build()
        val expected = QueryParams.builder()
        expected.put("next_page", "next_page")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = CreditGrantListEntriesParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getBody() {
        val params =
            CreditGrantListEntriesParams.builder()
                .nextPage("next_page")
                .creditTypeIds(listOf("2714e483-4ff1-48e4-9e25-ac732e8f24f2"))
                .customerIds(listOf("6a37bb88-8538-48c5-b37b-a41c836328bd"))
                .endingBefore(OffsetDateTime.parse("2021-02-01T00:00:00Z"))
                .startingOn(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.creditTypeIds()).contains(listOf("2714e483-4ff1-48e4-9e25-ac732e8f24f2"))
        assertThat(body.customerIds()).contains(listOf("6a37bb88-8538-48c5-b37b-a41c836328bd"))
        assertThat(body.endingBefore()).contains(OffsetDateTime.parse("2021-02-01T00:00:00Z"))
        assertThat(body.startingOn()).contains(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = CreditGrantListEntriesParams.builder().build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }
}
