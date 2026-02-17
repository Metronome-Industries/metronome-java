// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.http.QueryParams
import java.time.OffsetDateTime
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1CreditGrantListEntriesParamsTest {

    @Test
    fun create() {
        V1CreditGrantListEntriesParams.builder()
            .nextPage("next_page")
            .sort(V1CreditGrantListEntriesParams.Sort.ASC)
            .addCreditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
            .addCustomerId("6a37bb88-8538-48c5-b37b-a41c836328bd")
            .endingBefore(OffsetDateTime.parse("2021-02-01T00:00:00Z"))
            .startingOn(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            V1CreditGrantListEntriesParams.builder()
                .nextPage("next_page")
                .sort(V1CreditGrantListEntriesParams.Sort.ASC)
                .addCreditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                .addCustomerId("6a37bb88-8538-48c5-b37b-a41c836328bd")
                .endingBefore(OffsetDateTime.parse("2021-02-01T00:00:00Z"))
                .startingOn(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
                .build()
        val expected = QueryParams.builder()
        expected.put("next_page", "next_page")
        expected.put("sort", V1CreditGrantListEntriesParams.Sort.ASC.toString())
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = V1CreditGrantListEntriesParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun body() {
        val params =
            V1CreditGrantListEntriesParams.builder()
                .nextPage("next_page")
                .sort(V1CreditGrantListEntriesParams.Sort.ASC)
                .addCreditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                .addCustomerId("6a37bb88-8538-48c5-b37b-a41c836328bd")
                .endingBefore(OffsetDateTime.parse("2021-02-01T00:00:00Z"))
                .startingOn(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.creditTypeIds()).contains(listOf("2714e483-4ff1-48e4-9e25-ac732e8f24f2"))
        assertThat(body.customerIds()).contains(listOf("6a37bb88-8538-48c5-b37b-a41c836328bd"))
        assertThat(body.endingBefore()).contains(OffsetDateTime.parse("2021-02-01T00:00:00Z"))
        assertThat(body.startingOn()).contains(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = V1CreditGrantListEntriesParams.builder().build()

        val body = params._body()

        assertNotNull(body)
    }
}
