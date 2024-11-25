// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AlertCreateParamsTest {

    @Test
    fun createAlertCreateParams() {
        AlertCreateParams.builder()
            .alertType(AlertCreateParams.AlertType.LOW_CREDIT_BALANCE_REACHED)
            .name("name")
            .threshold(0.0)
            .billableMetricId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .creditGrantTypeFilters(listOf("string"))
            .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .customFieldFilters(
                listOf(
                    AlertCreateParams.CustomFieldFilter.builder()
                        .entity(AlertCreateParams.CustomFieldFilter.Entity.CONTRACT)
                        .key("key")
                        .value("value")
                        .build()
                )
            )
            .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
                .name("name")
                .threshold(0.0)
                .billableMetricId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .creditGrantTypeFilters(listOf("string"))
                .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .customFieldFilters(
                    listOf(
                        AlertCreateParams.CustomFieldFilter.builder()
                            .entity(AlertCreateParams.CustomFieldFilter.Entity.CONTRACT)
                            .key("key")
                            .value("value")
                            .build()
                    )
                )
                .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.threshold()).isEqualTo(0.0)
        assertThat(body.billableMetricId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.creditGrantTypeFilters()).isEqualTo(listOf("string"))
        assertThat(body.creditTypeId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
        assertThat(body.customerId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
                .name("name")
                .threshold(0.0)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.alertType())
            .isEqualTo(AlertCreateParams.AlertType.LOW_CREDIT_BALANCE_REACHED)
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.threshold()).isEqualTo(0.0)
    }
}
