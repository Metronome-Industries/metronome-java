// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CreditListEntriesParamsTest {

    @Test
    fun createCreditListEntriesParams() {
        CreditListEntriesParams.builder()
            .creditTypeIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
            .customerIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
            .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .nextPage("string")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            CreditListEntriesParams.builder()
                .creditTypeIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .customerIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .nextPage("string")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("next_page", listOf("string"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = CreditListEntriesParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getBody() {
        val params =
            CreditListEntriesParams.builder()
                .creditTypeIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .customerIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .nextPage("string")
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
        val params = CreditListEntriesParams.builder().build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }
}
