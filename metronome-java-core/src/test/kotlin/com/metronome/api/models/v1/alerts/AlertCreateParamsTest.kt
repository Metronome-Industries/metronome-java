// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.alerts

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AlertCreateParamsTest {

    @Test
    fun create() {
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
            .addGroupValue(AlertCreateParams.GroupValue.builder().key("key").value("value").build())
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
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.alertType()).isEqualTo(AlertCreateParams.AlertType.SPEND_THRESHOLD_REACHED)
        assertThat(body.name()).isEqualTo("\$100 spend threshold reached")
        assertThat(body.threshold()).isEqualTo(10000.0)
        assertThat(body.billableMetricId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.creditGrantTypeFilters().getOrNull()).containsExactly("enterprise")
        assertThat(body.creditTypeId()).contains("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
        assertThat(body.customFieldFilters().getOrNull())
            .containsExactly(
                AlertCreateParams.CustomFieldFilter.builder()
                    .entity(AlertCreateParams.CustomFieldFilter.Entity.CONTRACT)
                    .key("key")
                    .value("value")
                    .build()
            )
        assertThat(body.customerId()).contains("4db51251-61de-4bfe-b9ce-495e244f3491")
        assertThat(body.evaluateOnCreate()).contains(true)
        assertThat(body.groupValues().getOrNull())
            .containsExactly(
                AlertCreateParams.GroupValue.builder().key("key").value("value").build()
            )
        assertThat(body.invoiceTypesFilter().getOrNull()).containsExactly("SCHEDULED or USAGE")
        assertThat(body.planId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.seatFilter())
            .contains(
                AlertCreateParams.SeatFilter.builder()
                    .seatGroupKey("seat_group_key")
                    .seatGroupValue("seat_group_value")
                    .build()
            )
        assertThat(body.uniquenessKey()).contains("x")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AlertCreateParams.builder()
                .alertType(AlertCreateParams.AlertType.SPEND_THRESHOLD_REACHED)
                .name("\$100 spend threshold reached")
                .threshold(10000.0)
                .build()

        val body = params._body()

        assertThat(body.alertType()).isEqualTo(AlertCreateParams.AlertType.SPEND_THRESHOLD_REACHED)
        assertThat(body.name()).isEqualTo("\$100 spend threshold reached")
        assertThat(body.threshold()).isEqualTo(10000.0)
    }
}
