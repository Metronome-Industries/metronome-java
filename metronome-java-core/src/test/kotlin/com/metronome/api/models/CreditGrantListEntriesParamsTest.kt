// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.http.QueryParams
import com.metronome.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CreditGrantListEntriesParamsTest {

    @Test
    fun createCreditGrantListEntriesParams() {
        CreditGrantListEntriesParams.builder()
            .creditTypeIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
            .customerIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
            .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .nextPage("next_page")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            CreditGrantListEntriesParams.builder()
                .creditTypeIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .customerIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .nextPage("next_page")
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
                .creditTypeIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .customerIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .nextPage("next_page")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.creditTypeIds()).isEqualTo(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        assertThat(body.customerIds()).isEqualTo(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        assertThat(body.endingBefore()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.startingOn()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = CreditGrantListEntriesParams.builder().build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }
}
