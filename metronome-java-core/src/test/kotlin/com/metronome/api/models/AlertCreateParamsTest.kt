// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AlertCreateParamsTest {

    @Test
    fun createAlertCreateParams() {
        AlertCreateParams.builder()
            .alertType(AlertCreateParams.AlertType.LOW_CREDIT_BALANCE_REACHED)
            .name("\$100 spend threshold reached")
            .threshold(10000.0)
            .billableMetricId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .creditGrantTypeFilters(listOf("enterprise"))
            .creditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
            .customFieldFilters(
                listOf(
                    AlertCreateParams.CustomFieldFilter.builder()
                        .entity(AlertCreateParams.CustomFieldFilter.Entity.CONTRACT)
                        .key("key")
                        .value("value")
                        .build()
                )
            )
            .customerId("4db51251-61de-4bfe-b9ce-495e244f3491")
            .evaluateOnCreate(true)
            .groupKeyFilter(
                AlertCreateParams.GroupKeyFilter.builder().key("key").value("value").build()
            )
            .invoiceTypesFilter(
                listOf(
                    "PLAN_ARREARS, SCHEDULED, USAGE, CORRECTION, CREDIT_PURCHASE, or SEAT_PURCHASE"
                )
            )
            .planId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .uniquenessKey("x")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            AlertCreateParams.builder()
                .alertType(AlertCreateParams.AlertType.LOW_CREDIT_BALANCE_REACHED)
                .name("\$100 spend threshold reached")
                .threshold(10000.0)
                .billableMetricId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .creditGrantTypeFilters(listOf("enterprise"))
                .creditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                .customFieldFilters(
                    listOf(
                        AlertCreateParams.CustomFieldFilter.builder()
                            .entity(AlertCreateParams.CustomFieldFilter.Entity.CONTRACT)
                            .key("key")
                            .value("value")
                            .build()
                    )
                )
                .customerId("4db51251-61de-4bfe-b9ce-495e244f3491")
                .evaluateOnCreate(true)
                .groupKeyFilter(
                    AlertCreateParams.GroupKeyFilter.builder().key("key").value("value").build()
                )
                .invoiceTypesFilter(
                    listOf(
                        "PLAN_ARREARS, SCHEDULED, USAGE, CORRECTION, CREDIT_PURCHASE, or SEAT_PURCHASE"
                    )
                )
                .planId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .uniquenessKey("x")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.alertType())
            .isEqualTo(AlertCreateParams.AlertType.LOW_CREDIT_BALANCE_REACHED)
        assertThat(body.name()).isEqualTo("\$100 spend threshold reached")
        assertThat(body.threshold()).isEqualTo(10000.0)
        assertThat(body.billableMetricId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.creditGrantTypeFilters()).isEqualTo(listOf("enterprise"))
        assertThat(body.creditTypeId()).isEqualTo("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
        assertThat(body.customFieldFilters())
            .isEqualTo(
                listOf(
                    AlertCreateParams.CustomFieldFilter.builder()
                        .entity(AlertCreateParams.CustomFieldFilter.Entity.CONTRACT)
                        .key("key")
                        .value("value")
                        .build()
                )
            )
        assertThat(body.customerId()).isEqualTo("4db51251-61de-4bfe-b9ce-495e244f3491")
        assertThat(body.evaluateOnCreate()).isEqualTo(true)
        assertThat(body.groupKeyFilter())
            .isEqualTo(AlertCreateParams.GroupKeyFilter.builder().key("key").value("value").build())
        assertThat(body.invoiceTypesFilter())
            .isEqualTo(
                listOf(
                    "PLAN_ARREARS, SCHEDULED, USAGE, CORRECTION, CREDIT_PURCHASE, or SEAT_PURCHASE"
                )
            )
        assertThat(body.planId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.uniquenessKey()).isEqualTo("x")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            AlertCreateParams.builder()
                .alertType(AlertCreateParams.AlertType.LOW_CREDIT_BALANCE_REACHED)
                .name("\$100 spend threshold reached")
                .threshold(10000.0)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.alertType())
            .isEqualTo(AlertCreateParams.AlertType.LOW_CREDIT_BALANCE_REACHED)
        assertThat(body.name()).isEqualTo("\$100 spend threshold reached")
        assertThat(body.threshold()).isEqualTo(10000.0)
    }
}
