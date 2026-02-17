// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.http.QueryParams
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1ContractProductListParamsTest {

    @Test
    fun create() {
        V1ContractProductListParams.builder()
            .limit(1L)
            .nextPage("next_page")
            .archiveFilter(V1ContractProductListParams.ArchiveFilter.ARCHIVED)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            V1ContractProductListParams.builder()
                .limit(1L)
                .nextPage("next_page")
                .archiveFilter(V1ContractProductListParams.ArchiveFilter.ARCHIVED)
                .build()
        val expected = QueryParams.builder()
        expected.put("limit", "1")
        expected.put("next_page", "next_page")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = V1ContractProductListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun body() {
        val params =
            V1ContractProductListParams.builder()
                .limit(1L)
                .nextPage("next_page")
                .archiveFilter(V1ContractProductListParams.ArchiveFilter.ARCHIVED)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.archiveFilter())
            .contains(V1ContractProductListParams.ArchiveFilter.ARCHIVED)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = V1ContractProductListParams.builder().build()

        val body = params._body()

        assertNotNull(body)
    }
}
