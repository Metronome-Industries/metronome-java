// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.creditgrants

import com.metronome.api.core.http.QueryParams
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreditGrantListParamsTest {

    @Test
    fun create() {
        CreditGrantListParams.builder()
            .limit(1L)
            .nextPage("next_page")
            .addCreditGrantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addCreditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
            .addCustomerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
            .addCustomerId("0e5b8609-d901-4992-b394-c3c2e3f37b1c")
            .effectiveBefore(OffsetDateTime.parse("2022-02-01T00:00:00Z"))
            .notExpiringBefore(OffsetDateTime.parse("2022-02-01T00:00:00Z"))
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            CreditGrantListParams.builder()
                .limit(1L)
                .nextPage("next_page")
                .addCreditGrantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addCreditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                .addCustomerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .addCustomerId("0e5b8609-d901-4992-b394-c3c2e3f37b1c")
                .effectiveBefore(OffsetDateTime.parse("2022-02-01T00:00:00Z"))
                .notExpiringBefore(OffsetDateTime.parse("2022-02-01T00:00:00Z"))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("limit", "1").put("next_page", "next_page").build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CreditGrantListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            CreditGrantListParams.builder()
                .limit(1L)
                .nextPage("next_page")
                .addCreditGrantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addCreditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                .addCustomerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .addCustomerId("0e5b8609-d901-4992-b394-c3c2e3f37b1c")
                .effectiveBefore(OffsetDateTime.parse("2022-02-01T00:00:00Z"))
                .notExpiringBefore(OffsetDateTime.parse("2022-02-01T00:00:00Z"))
                .build()

        val body = params._body()

        assertThat(body.creditGrantIds().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.creditTypeIds().getOrNull())
            .containsExactly("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
        assertThat(body.customerIds().getOrNull())
            .containsExactly(
                "d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc",
                "0e5b8609-d901-4992-b394-c3c2e3f37b1c",
            )
        assertThat(body.effectiveBefore()).contains(OffsetDateTime.parse("2022-02-01T00:00:00Z"))
        assertThat(body.notExpiringBefore()).contains(OffsetDateTime.parse("2022-02-01T00:00:00Z"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = CreditGrantListParams.builder().build()

        val body = params._body()
    }
}
