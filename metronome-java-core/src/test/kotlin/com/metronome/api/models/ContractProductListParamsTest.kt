// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ContractProductListParamsTest {

    @Test
    fun createContractProductListParams() {
        ContractProductListParams.builder()
            .archiveFilter(ContractProductListParams.ArchiveFilter.ARCHIVED)
            .limit(1L)
            .nextPage("next_page")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            ContractProductListParams.builder()
                .archiveFilter(ContractProductListParams.ArchiveFilter.ARCHIVED)
                .limit(1L)
                .nextPage("next_page")
                .build()
        val expected = QueryParams.builder()
        expected.put("limit", "1")
        expected.put("next_page", "next_page")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = ContractProductListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getBody() {
        val params =
            ContractProductListParams.builder()
                .archiveFilter(ContractProductListParams.ArchiveFilter.ARCHIVED)
                .limit(1L)
                .nextPage("next_page")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.archiveFilter()).isEqualTo(ContractProductListParams.ArchiveFilter.ARCHIVED)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = ContractProductListParams.builder().build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }
}
