// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1AlertCreateParamsTest {

    @Test
    fun create() {
        V1AlertCreateParams.builder()
            .alertType(V1AlertCreateParams.AlertType.LOW_CREDIT_BALANCE_REACHED)
            .name("\$100 spend threshold reached")
            .threshold(10000.0)
            .billableMetricId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addCreditGrantTypeFilter("enterprise")
            .creditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
            .addCustomFieldFilter(
                V1AlertCreateParams.CustomFieldFilter.builder()
                    .entity(V1AlertCreateParams.CustomFieldFilter.Entity.CONTRACT)
                    .key("key")
                    .value("value")
                    .build()
            )
            .customerId("4db51251-61de-4bfe-b9ce-495e244f3491")
            .evaluateOnCreate(true)
            .addGroupValue(
                V1AlertCreateParams.GroupValue.builder().key("key").value("value").build()
            )
            .addInvoiceTypesFilter("SCHEDULED or USAGE")
            .planId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .seatFilter(
                V1AlertCreateParams.SeatFilter.builder()
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
            V1AlertCreateParams.builder()
                .alertType(V1AlertCreateParams.AlertType.LOW_CREDIT_BALANCE_REACHED)
                .name("\$100 spend threshold reached")
                .threshold(10000.0)
                .billableMetricId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addCreditGrantTypeFilter("enterprise")
                .creditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                .addCustomFieldFilter(
                    V1AlertCreateParams.CustomFieldFilter.builder()
                        .entity(V1AlertCreateParams.CustomFieldFilter.Entity.CONTRACT)
                        .key("key")
                        .value("value")
                        .build()
                )
                .customerId("4db51251-61de-4bfe-b9ce-495e244f3491")
                .evaluateOnCreate(true)
                .addGroupValue(
                    V1AlertCreateParams.GroupValue.builder().key("key").value("value").build()
                )
                .addInvoiceTypesFilter("SCHEDULED or USAGE")
                .planId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .seatFilter(
                    V1AlertCreateParams.SeatFilter.builder()
                        .seatGroupKey("seat_group_key")
                        .seatGroupValue("seat_group_value")
                        .build()
                )
                .uniquenessKey("x")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.alertType())
            .isEqualTo(V1AlertCreateParams.AlertType.LOW_CREDIT_BALANCE_REACHED)
        assertThat(body.name()).isEqualTo("\$100 spend threshold reached")
        assertThat(body.threshold()).isEqualTo(10000.0)
        assertThat(body.billableMetricId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.creditGrantTypeFilters()).contains(listOf("enterprise"))
        assertThat(body.creditTypeId()).contains("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
        assertThat(body.customFieldFilters())
            .contains(
                listOf(
                    V1AlertCreateParams.CustomFieldFilter.builder()
                        .entity(V1AlertCreateParams.CustomFieldFilter.Entity.CONTRACT)
                        .key("key")
                        .value("value")
                        .build()
                )
            )
        assertThat(body.customerId()).contains("4db51251-61de-4bfe-b9ce-495e244f3491")
        assertThat(body.evaluateOnCreate()).contains(true)
        assertThat(body.groupValues())
            .contains(
                listOf(V1AlertCreateParams.GroupValue.builder().key("key").value("value").build())
            )
        assertThat(body.invoiceTypesFilter()).contains(listOf("SCHEDULED or USAGE"))
        assertThat(body.planId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.seatFilter())
            .contains(
                V1AlertCreateParams.SeatFilter.builder()
                    .seatGroupKey("seat_group_key")
                    .seatGroupValue("seat_group_value")
                    .build()
            )
        assertThat(body.uniquenessKey()).contains("x")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            V1AlertCreateParams.builder()
                .alertType(V1AlertCreateParams.AlertType.LOW_CREDIT_BALANCE_REACHED)
                .name("\$100 spend threshold reached")
                .threshold(10000.0)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.alertType())
            .isEqualTo(V1AlertCreateParams.AlertType.LOW_CREDIT_BALANCE_REACHED)
        assertThat(body.name()).isEqualTo("\$100 spend threshold reached")
        assertThat(body.threshold()).isEqualTo(10000.0)
    }
}
