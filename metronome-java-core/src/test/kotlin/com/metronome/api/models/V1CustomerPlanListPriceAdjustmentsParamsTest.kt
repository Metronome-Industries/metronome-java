// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1CustomerPlanListPriceAdjustmentsParamsTest {

    @Test
    fun create() {
        V1CustomerPlanListPriceAdjustmentsParams.builder()
            .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
            .customerPlanId("7aa11640-0703-4600-8eb9-293f535a6b74")
            .limit(1L)
            .nextPage("next_page")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            V1CustomerPlanListPriceAdjustmentsParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .customerPlanId("7aa11640-0703-4600-8eb9-293f535a6b74")
                .limit(1L)
                .nextPage("next_page")
                .build()
        val expected = QueryParams.builder()
        expected.put("limit", "1")
        expected.put("next_page", "next_page")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            V1CustomerPlanListPriceAdjustmentsParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .customerPlanId("7aa11640-0703-4600-8eb9-293f535a6b74")
                .build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getPathParam() {
        val params =
            V1CustomerPlanListPriceAdjustmentsParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .customerPlanId("7aa11640-0703-4600-8eb9-293f535a6b74")
                .build()
        assertThat(params).isNotNull
        // path param "customerId"
        assertThat(params.getPathParam(0)).isEqualTo("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
        // path param "customerPlanId"
        assertThat(params.getPathParam(1)).isEqualTo("7aa11640-0703-4600-8eb9-293f535a6b74")
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
