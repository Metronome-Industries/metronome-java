// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.creditgrants

import com.metronome.api.core.http.QueryParams
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreditGrantListEntriesParamsTest {

    @Test
    fun create() {
        CreditGrantListEntriesParams.builder()
            .nextPage("next_page")
            .sort(CreditGrantListEntriesParams.Sort.ASC)
            .addCreditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
            .addCustomerId("6a37bb88-8538-48c5-b37b-a41c836328bd")
            .endingBefore(OffsetDateTime.parse("2021-02-01T00:00:00Z"))
            .startingOn(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            CreditGrantListEntriesParams.builder()
                .nextPage("next_page")
                .sort(CreditGrantListEntriesParams.Sort.ASC)
                .addCreditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                .addCustomerId("6a37bb88-8538-48c5-b37b-a41c836328bd")
                .endingBefore(OffsetDateTime.parse("2021-02-01T00:00:00Z"))
                .startingOn(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("next_page", "next_page").put("sort", "asc").build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CreditGrantListEntriesParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            CreditGrantListEntriesParams.builder()
                .nextPage("next_page")
                .sort(CreditGrantListEntriesParams.Sort.ASC)
                .addCreditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                .addCustomerId("6a37bb88-8538-48c5-b37b-a41c836328bd")
                .endingBefore(OffsetDateTime.parse("2021-02-01T00:00:00Z"))
                .startingOn(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
                .build()

        val body = params._body()

        assertThat(body.creditTypeIds().getOrNull())
            .containsExactly("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
        assertThat(body.customerIds().getOrNull())
            .containsExactly("6a37bb88-8538-48c5-b37b-a41c836328bd")
        assertThat(body.endingBefore()).contains(OffsetDateTime.parse("2021-02-01T00:00:00Z"))
        assertThat(body.startingOn()).contains(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = CreditGrantListEntriesParams.builder().build()

        val body = params._body()
    }
}
