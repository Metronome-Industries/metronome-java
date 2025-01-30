// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ContractProductListParamsTest {

    @Test
    fun createContractProductListParams() {
        ContractProductListParams.builder()
            .limit(1L)
            .nextPage("next_page")
            .archiveFilter(ContractProductListParams.ArchiveFilter.ARCHIVED)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ContractProductListParams.builder()
                .limit(1L)
                .nextPage("next_page")
                .archiveFilter(ContractProductListParams.ArchiveFilter.ARCHIVED)
                .build()
        val expected = QueryParams.builder()
        expected.put("limit", "1")
        expected.put("next_page", "next_page")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ContractProductListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun body() {
        val params =
            ContractProductListParams.builder()
                .limit(1L)
                .nextPage("next_page")
                .archiveFilter(ContractProductListParams.ArchiveFilter.ARCHIVED)
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.archiveFilter()).contains(ContractProductListParams.ArchiveFilter.ARCHIVED)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ContractProductListParams.builder().build()
        val body = params._body()
        assertThat(body).isNotNull
    }
}
