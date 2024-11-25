// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.http.QueryParams
import com.metronome.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerListParamsTest {

    @Test
    fun createCustomerListParams() {
        CustomerListParams.builder()
            .customerIds(listOf("string"))
            .ingestAlias("ingest_alias")
            .limit(1L)
            .nextPage("next_page")
            .onlyArchived(true)
            .salesforceAccountIds(listOf("string"))
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            CustomerListParams.builder()
                .customerIds(listOf("string"))
                .ingestAlias("ingest_alias")
                .limit(1L)
                .nextPage("next_page")
                .onlyArchived(true)
                .salesforceAccountIds(listOf("string"))
                .build()
        val expected = QueryParams.builder()
        expected.put("customer_ids", "string")
        expected.put("ingest_alias", "ingest_alias")
        expected.put("limit", "1")
        expected.put("next_page", "next_page")
        expected.put("only_archived", "true")
        expected.put("salesforce_account_ids", "string")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = CustomerListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
