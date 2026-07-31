// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers

import com.metronome.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerListParamsTest {

    @Test
    fun create() {
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

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("customer_ids", listOf("string").joinToString(","))
                    .put("ingest_alias", "ingest_alias")
                    .put("limit", "1")
                    .put("next_page", "next_page")
                    .put("only_archived", "true")
                    .put("salesforce_account_ids", listOf("string").joinToString(","))
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CustomerListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
