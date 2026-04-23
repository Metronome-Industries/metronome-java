// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.packages

import com.metronome.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PackageListContractsOnPackageParamsTest {

    @Test
    fun create() {
        PackageListContractsOnPackageParams.builder()
            .limit(1L)
            .nextPage("next_page")
            .packageId("13117714-3f05-48e5-a6e9-a66093f13b4d")
            .coveringDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .includeArchived(true)
            .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            PackageListContractsOnPackageParams.builder()
                .limit(1L)
                .nextPage("next_page")
                .packageId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                .coveringDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .includeArchived(true)
                .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("limit", "1").put("next_page", "next_page").build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            PackageListContractsOnPackageParams.builder()
                .packageId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            PackageListContractsOnPackageParams.builder()
                .limit(1L)
                .nextPage("next_page")
                .packageId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                .coveringDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .includeArchived(true)
                .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val body = params._body()

        assertThat(body.packageId()).isEqualTo("13117714-3f05-48e5-a6e9-a66093f13b4d")
        assertThat(body.coveringDate()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.includeArchived()).contains(true)
        assertThat(body.startingAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PackageListContractsOnPackageParams.builder()
                .packageId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                .build()

        val body = params._body()

        assertThat(body.packageId()).isEqualTo("13117714-3f05-48e5-a6e9-a66093f13b4d")
    }
}
