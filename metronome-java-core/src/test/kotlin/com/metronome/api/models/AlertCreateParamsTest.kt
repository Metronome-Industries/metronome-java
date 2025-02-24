// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AlertCreateParamsTest {

    @Test
    fun create() {
        AlertCreateParams.builder()
            .alertType(AlertCreateParams.AlertType.LOW_CREDIT_BALANCE_REACHED)
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
            .groupKeyFilter(
                AlertCreateParams.GroupKeyFilter.builder().key("key").value("value").build()
            )
            .addInvoiceTypesFilter(
                "PLAN_ARREARS, SCHEDULED, USAGE, CORRECTION, CREDIT_PURCHASE, or SEAT_PURCHASE"
            )
            .planId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .uniquenessKey("x")
            .build()
    }

    @Test
    fun body() {
        val params =
            AlertCreateParams.builder()
                .alertType(AlertCreateParams.AlertType.LOW_CREDIT_BALANCE_REACHED)
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
                .groupKeyFilter(
                    AlertCreateParams.GroupKeyFilter.builder().key("key").value("value").build()
                )
                .addInvoiceTypesFilter(
                    "PLAN_ARREARS, SCHEDULED, USAGE, CORRECTION, CREDIT_PURCHASE, or SEAT_PURCHASE"
                )
                .planId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .uniquenessKey("x")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.alertType())
            .isEqualTo(AlertCreateParams.AlertType.LOW_CREDIT_BALANCE_REACHED)
        assertThat(body.name()).isEqualTo("\$100 spend threshold reached")
        assertThat(body.threshold()).isEqualTo(10000.0)
        assertThat(body.billableMetricId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.creditGrantTypeFilters()).contains(listOf("enterprise"))
        assertThat(body.creditTypeId()).contains("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
        assertThat(body.customFieldFilters())
            .contains(
                listOf(
                    AlertCreateParams.CustomFieldFilter.builder()
                        .entity(AlertCreateParams.CustomFieldFilter.Entity.CONTRACT)
                        .key("key")
                        .value("value")
                        .build()
                )
            )
        assertThat(body.customerId()).contains("4db51251-61de-4bfe-b9ce-495e244f3491")
        assertThat(body.evaluateOnCreate()).contains(true)
        assertThat(body.groupKeyFilter())
            .contains(AlertCreateParams.GroupKeyFilter.builder().key("key").value("value").build())
        assertThat(body.invoiceTypesFilter())
            .contains(
                listOf(
                    "PLAN_ARREARS, SCHEDULED, USAGE, CORRECTION, CREDIT_PURCHASE, or SEAT_PURCHASE"
                )
            )
        assertThat(body.planId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.uniquenessKey()).contains("x")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AlertCreateParams.builder()
                .alertType(AlertCreateParams.AlertType.LOW_CREDIT_BALANCE_REACHED)
                .name("\$100 spend threshold reached")
                .threshold(10000.0)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.alertType())
            .isEqualTo(AlertCreateParams.AlertType.LOW_CREDIT_BALANCE_REACHED)
        assertThat(body.name()).isEqualTo("\$100 spend threshold reached")
        assertThat(body.threshold()).isEqualTo(10000.0)
    }
}
