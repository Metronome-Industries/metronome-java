// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers.plans

import com.metronome.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanListPriceAdjustmentsParamsTest {

    @Test
    fun create() {
        PlanListPriceAdjustmentsParams.builder()
            .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
            .customerPlanId("7aa11640-0703-4600-8eb9-293f535a6b74")
            .limit(1L)
            .nextPage("next_page")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PlanListPriceAdjustmentsParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .customerPlanId("7aa11640-0703-4600-8eb9-293f535a6b74")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
        assertThat(params._pathParam(1)).isEqualTo("7aa11640-0703-4600-8eb9-293f535a6b74")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            PlanListPriceAdjustmentsParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .customerPlanId("7aa11640-0703-4600-8eb9-293f535a6b74")
                .limit(1L)
                .nextPage("next_page")
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
            PlanListPriceAdjustmentsParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .customerPlanId("7aa11640-0703-4600-8eb9-293f535a6b74")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
