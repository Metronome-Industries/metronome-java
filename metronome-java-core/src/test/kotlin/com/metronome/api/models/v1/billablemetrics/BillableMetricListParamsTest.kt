// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.billablemetrics

import com.metronome.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BillableMetricListParamsTest {

    @Test
    fun create() {
        BillableMetricListParams.builder()
            .includeArchived(true)
            .limit(1L)
            .nextPage("next_page")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            BillableMetricListParams.builder()
                .includeArchived(true)
                .limit(1L)
                .nextPage("next_page")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("include_archived", "true")
                    .put("limit", "1")
                    .put("next_page", "next_page")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = BillableMetricListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
