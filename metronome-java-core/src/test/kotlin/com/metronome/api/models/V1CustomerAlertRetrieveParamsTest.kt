// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1CustomerAlertRetrieveParamsTest {

    @Test
    fun create() {
        V1CustomerAlertRetrieveParams.builder()
            .alertId("8deed800-1b7a-495d-a207-6c52bac54dc9")
            .customerId("9b85c1c1-5238-4f2a-a409-61412905e1e1")
            .addGroupValue(
                V1CustomerAlertRetrieveParams.GroupValue.builder().key("key").value("value").build()
            )
            .plansOrContracts(V1CustomerAlertRetrieveParams.PlansOrContracts.PLANS)
            .seatFilter(
                V1CustomerAlertRetrieveParams.SeatFilter.builder()
                    .seatGroupKey("seat_group_key")
                    .seatGroupValue("seat_group_value")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            V1CustomerAlertRetrieveParams.builder()
                .alertId("8deed800-1b7a-495d-a207-6c52bac54dc9")
                .customerId("9b85c1c1-5238-4f2a-a409-61412905e1e1")
                .addGroupValue(
                    V1CustomerAlertRetrieveParams.GroupValue.builder()
                        .key("key")
                        .value("value")
                        .build()
                )
                .plansOrContracts(V1CustomerAlertRetrieveParams.PlansOrContracts.PLANS)
                .seatFilter(
                    V1CustomerAlertRetrieveParams.SeatFilter.builder()
                        .seatGroupKey("seat_group_key")
                        .seatGroupValue("seat_group_value")
                        .build()
                )
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.alertId()).isEqualTo("8deed800-1b7a-495d-a207-6c52bac54dc9")
        assertThat(body.customerId()).isEqualTo("9b85c1c1-5238-4f2a-a409-61412905e1e1")
        assertThat(body.groupValues())
            .contains(
                listOf(
                    V1CustomerAlertRetrieveParams.GroupValue.builder()
                        .key("key")
                        .value("value")
                        .build()
                )
            )
        assertThat(body.plansOrContracts())
            .contains(V1CustomerAlertRetrieveParams.PlansOrContracts.PLANS)
        assertThat(body.seatFilter())
            .contains(
                V1CustomerAlertRetrieveParams.SeatFilter.builder()
                    .seatGroupKey("seat_group_key")
                    .seatGroupValue("seat_group_value")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            V1CustomerAlertRetrieveParams.builder()
                .alertId("8deed800-1b7a-495d-a207-6c52bac54dc9")
                .customerId("9b85c1c1-5238-4f2a-a409-61412905e1e1")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.alertId()).isEqualTo("8deed800-1b7a-495d-a207-6c52bac54dc9")
        assertThat(body.customerId()).isEqualTo("9b85c1c1-5238-4f2a-a409-61412905e1e1")
    }
}
