// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v1

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClientAsync
import com.metronome.api.models.v1.alerts.AlertArchiveParams
import com.metronome.api.models.v1.alerts.AlertCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AlertServiceAsyncTest {

    @Test
    fun create() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val alertServiceAsync = client.v1().alerts()

        val alertFuture =
            alertServiceAsync.create(
                AlertCreateParams.builder()
                    .alertType(AlertCreateParams.AlertType.SPEND_THRESHOLD_REACHED)
                    .name("\$100 spend threshold reached")
                    .threshold(10000.0)
                    .billableMetricId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addCreditGrantTypeFilter("enterprise")
                    .creditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                    .addCustomFieldFilter(
                        AlertCreateParams.CustomFieldFilter.builder()
                            .entity(AlertCreateParams.CustomFieldFilter.Entity.CONTRACT)
                            .key("key")
                            .value("value")
                            .build()
                    )
                    .customerId("4db51251-61de-4bfe-b9ce-495e244f3491")
                    .evaluateOnCreate(true)
                    .addGroupValue(
                        AlertCreateParams.GroupValue.builder().key("key").value("value").build()
                    )
                    .addInvoiceTypesFilter("SCHEDULED or USAGE")
                    .planId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .seatFilter(
                        AlertCreateParams.SeatFilter.builder()
                            .seatGroupKey("seat_group_key")
                            .seatGroupValue("seat_group_value")
                            .build()
                    )
                    .uniquenessKey("x")
                    .build()
            )

        val alert = alertFuture.get()
        alert.validate()
    }

    @Test
    fun archive() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val alertServiceAsync = client.v1().alerts()

        val responseFuture =
            alertServiceAsync.archive(
                AlertArchiveParams.builder()
                    .id("8deed800-1b7a-495d-a207-6c52bac54dc9")
                    .releaseUniquenessKey(true)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
