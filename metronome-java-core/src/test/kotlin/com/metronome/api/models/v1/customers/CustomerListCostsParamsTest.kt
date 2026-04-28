// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers

import com.metronome.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerListCostsParamsTest {

    @Test
    fun create() {
        CustomerListCostsParams.builder()
            .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
            .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .limit(1L)
            .nextPage("next_page")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CustomerListCostsParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(params._pathParam(0)).isEqualTo("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            CustomerListCostsParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .limit(1L)
                .nextPage("next_page")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("ending_before", "2019-12-27T18:11:19.117Z")
                    .put("starting_on", "2019-12-27T18:11:19.117Z")
                    .put("limit", "1")
                    .put("next_page", "next_page")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            CustomerListCostsParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("ending_before", "2019-12-27T18:11:19.117Z")
                    .put("starting_on", "2019-12-27T18:11:19.117Z")
                    .build()
            )
    }
}
