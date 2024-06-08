// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerListParamsTest {

    @Test
    fun createCustomerListParams() {
        CustomerListParams.builder()
            .customerIds(listOf("string"))
            .ingestAlias("string")
            .limit(100L)
            .nextPage("string")
            .onlyArchived(true)
            .salesforceAccountIds(listOf("string"))
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            CustomerListParams.builder()
                .customerIds(listOf("string"))
                .ingestAlias("string")
                .limit(100L)
                .nextPage("string")
                .onlyArchived(true)
                .salesforceAccountIds(listOf("string"))
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("customer_ids", listOf("string"))
        expected.put("ingest_alias", listOf("string"))
        expected.put("limit", listOf("100"))
        expected.put("next_page", listOf("string"))
        expected.put("only_archived", listOf("true"))
        expected.put("salesforce_account_ids", listOf("string"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = CustomerListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
