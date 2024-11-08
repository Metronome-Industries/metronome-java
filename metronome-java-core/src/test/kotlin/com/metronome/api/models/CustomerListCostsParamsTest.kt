// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.http.QueryParams
import com.metronome.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerListCostsParamsTest {

    @Test
    fun createCustomerListCostsParams() {
        CustomerListCostsParams.builder()
            .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .limit(100L)
            .nextPage("next_page")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            CustomerListCostsParams.builder()
                .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .limit(100L)
                .nextPage("next_page")
                .build()
        val expected = QueryParams.builder()
        expected.put("ending_before", "2019-12-27T18:11:19.117Z")
        expected.put("starting_on", "2019-12-27T18:11:19.117Z")
        expected.put("limit", "100")
        expected.put("next_page", "next_page")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            CustomerListCostsParams.builder()
                .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        val expected = QueryParams.builder()
        expected.put("ending_before", "2019-12-27T18:11:19.117Z")
        expected.put("starting_on", "2019-12-27T18:11:19.117Z")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getPathParam() {
        val params =
            CustomerListCostsParams.builder()
                .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(params).isNotNull
        // path param "customerId"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
