// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.contracts.products

import com.metronome.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductListParamsTest {

    @Test
    fun create() {
        ProductListParams.builder()
            .limit(1L)
            .nextPage("next_page")
            .archiveFilter(ProductListParams.ArchiveFilter.NOT_ARCHIVED)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ProductListParams.builder()
                .limit(1L)
                .nextPage("next_page")
                .archiveFilter(ProductListParams.ArchiveFilter.NOT_ARCHIVED)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("limit", "1").put("next_page", "next_page").build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ProductListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            ProductListParams.builder()
                .limit(1L)
                .nextPage("next_page")
                .archiveFilter(ProductListParams.ArchiveFilter.NOT_ARCHIVED)
                .build()

        val body = params._body()

        assertThat(body.archiveFilter()).contains(ProductListParams.ArchiveFilter.NOT_ARCHIVED)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ProductListParams.builder().build()

        val body = params._body()
    }
}
