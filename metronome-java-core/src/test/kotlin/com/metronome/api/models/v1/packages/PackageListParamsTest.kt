// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.packages

import com.metronome.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PackageListParamsTest {

    @Test
    fun create() {
        PackageListParams.builder()
            .limit(1L)
            .nextPage("next_page")
            .archiveFilter(PackageListParams.ArchiveFilter.ARCHIVED)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            PackageListParams.builder()
                .limit(1L)
                .nextPage("next_page")
                .archiveFilter(PackageListParams.ArchiveFilter.ARCHIVED)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("limit", "1").put("next_page", "next_page").build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PackageListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            PackageListParams.builder()
                .limit(1L)
                .nextPage("next_page")
                .archiveFilter(PackageListParams.ArchiveFilter.ARCHIVED)
                .build()

        val body = params._body()

        assertThat(body.archiveFilter()).contains(PackageListParams.ArchiveFilter.ARCHIVED)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = PackageListParams.builder().build()

        val body = params._body()
    }
}
