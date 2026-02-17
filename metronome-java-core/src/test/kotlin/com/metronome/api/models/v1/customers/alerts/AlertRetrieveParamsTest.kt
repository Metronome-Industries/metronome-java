// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers.alerts

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AlertRetrieveParamsTest {

    @Test
    fun create() {
        AlertRetrieveParams.builder()
            .alertId("8deed800-1b7a-495d-a207-6c52bac54dc9")
            .customerId("9b85c1c1-5238-4f2a-a409-61412905e1e1")
            .addGroupValue(
                AlertRetrieveParams.GroupValue.builder().key("key").value("value").build()
            )
            .plansOrContracts(AlertRetrieveParams.PlansOrContracts.PLANS)
            .seatFilter(
                AlertRetrieveParams.SeatFilter.builder()
                    .seatGroupKey("seat_group_key")
                    .seatGroupValue("seat_group_value")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            AlertRetrieveParams.builder()
                .alertId("8deed800-1b7a-495d-a207-6c52bac54dc9")
                .customerId("9b85c1c1-5238-4f2a-a409-61412905e1e1")
                .addGroupValue(
                    AlertRetrieveParams.GroupValue.builder().key("key").value("value").build()
                )
                .plansOrContracts(AlertRetrieveParams.PlansOrContracts.PLANS)
                .seatFilter(
                    AlertRetrieveParams.SeatFilter.builder()
                        .seatGroupKey("seat_group_key")
                        .seatGroupValue("seat_group_value")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.alertId()).isEqualTo("8deed800-1b7a-495d-a207-6c52bac54dc9")
        assertThat(body.customerId()).isEqualTo("9b85c1c1-5238-4f2a-a409-61412905e1e1")
        assertThat(body.groupValues().getOrNull())
            .containsExactly(
                AlertRetrieveParams.GroupValue.builder().key("key").value("value").build()
            )
        assertThat(body.plansOrContracts()).contains(AlertRetrieveParams.PlansOrContracts.PLANS)
        assertThat(body.seatFilter())
            .contains(
                AlertRetrieveParams.SeatFilter.builder()
                    .seatGroupKey("seat_group_key")
                    .seatGroupValue("seat_group_value")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AlertRetrieveParams.builder()
                .alertId("8deed800-1b7a-495d-a207-6c52bac54dc9")
                .customerId("9b85c1c1-5238-4f2a-a409-61412905e1e1")
                .build()

        val body = params._body()

        assertThat(body.alertId()).isEqualTo("8deed800-1b7a-495d-a207-6c52bac54dc9")
        assertThat(body.customerId()).isEqualTo("9b85c1c1-5238-4f2a-a409-61412905e1e1")
    }
}
