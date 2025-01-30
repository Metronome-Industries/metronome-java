// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerListParamsTest {

    @Test
    fun createCustomerListParams() {
        CustomerListParams.builder()
            .addCustomerId("string")
            .ingestAlias("ingest_alias")
            .limit(1L)
            .nextPage("next_page")
            .onlyArchived(true)
            .addSalesforceAccountId("string")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            CustomerListParams.builder()
                .addCustomerId("string")
                .ingestAlias("ingest_alias")
                .limit(1L)
                .nextPage("next_page")
                .onlyArchived(true)
                .addSalesforceAccountId("string")
                .build()
        val expected = QueryParams.builder()
        expected.put("customer_ids", "string")
        expected.put("ingest_alias", "ingest_alias")
        expected.put("limit", "1")
        expected.put("next_page", "next_page")
        expected.put("only_archived", "true")
        expected.put("salesforce_account_ids", "string")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CustomerListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
