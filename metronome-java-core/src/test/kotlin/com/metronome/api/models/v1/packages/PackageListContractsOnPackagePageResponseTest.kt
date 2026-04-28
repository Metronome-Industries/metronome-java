// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.packages

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PackageListContractsOnPackagePageResponseTest {

    @Test
    fun create() {
        val packageListContractsOnPackagePageResponse =
            PackageListContractsOnPackagePageResponse.builder()
                .addData(
                    PackageListContractsOnPackageResponse.builder()
                        .contractId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .nextPage("next_page")
                .build()

        assertThat(packageListContractsOnPackagePageResponse.data())
            .containsExactly(
                PackageListContractsOnPackageResponse.builder()
                    .contractId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(packageListContractsOnPackagePageResponse.nextPage()).contains("next_page")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val packageListContractsOnPackagePageResponse =
            PackageListContractsOnPackagePageResponse.builder()
                .addData(
                    PackageListContractsOnPackageResponse.builder()
                        .contractId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .nextPage("next_page")
                .build()

        val roundtrippedPackageListContractsOnPackagePageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(packageListContractsOnPackagePageResponse),
                jacksonTypeRef<PackageListContractsOnPackagePageResponse>(),
            )

        assertThat(roundtrippedPackageListContractsOnPackagePageResponse)
            .isEqualTo(packageListContractsOnPackagePageResponse)
    }
}
