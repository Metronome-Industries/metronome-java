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
            .name("string")
            .threshold(42.23)
            .billableMetricId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .customFieldFilters(
                listOf(
                    AlertCreateParams.CustomFieldFilter.builder()
                        .entity(AlertCreateParams.CustomFieldFilter.Entity.CONTRACT)
                        .key("string")
                        .value("string")
                        .build()
                )
            )
            .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .evaluateOnCreate(true)
            .groupKeyFilter(
                AlertCreateParams.GroupKeyFilter.builder().key("string").value("string").build()
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
                .name("string")
                .threshold(42.23)
                .billableMetricId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .customFieldFilters(
                    listOf(
                        AlertCreateParams.CustomFieldFilter.builder()
                            .entity(AlertCreateParams.CustomFieldFilter.Entity.CONTRACT)
                            .key("string")
                            .value("string")
                            .build()
                    )
                )
                .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .evaluateOnCreate(true)
                .groupKeyFilter(
                    AlertCreateParams.GroupKeyFilter.builder().key("string").value("string").build()
                )
                .planId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .uniquenessKey("x")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.alertType())
            .isEqualTo(AlertCreateParams.AlertType.LOW_CREDIT_BALANCE_REACHED)
        assertThat(body.name()).isEqualTo("string")
        assertThat(body.threshold()).isEqualTo(42.23)
        assertThat(body.billableMetricId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.creditTypeId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.customFieldFilters())
            .isEqualTo(
                listOf(
                    AlertCreateParams.CustomFieldFilter.builder()
                        .entity(AlertCreateParams.CustomFieldFilter.Entity.CONTRACT)
                        .key("string")
                        .value("string")
                        .build()
                )
            )
        assertThat(body.customerId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.evaluateOnCreate()).isEqualTo(true)
        assertThat(body.groupKeyFilter())
            .isEqualTo(
                AlertCreateParams.GroupKeyFilter.builder().key("string").value("string").build()
            )
        assertThat(body.planId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.uniquenessKey()).isEqualTo("x")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            AlertCreateParams.builder()
                .alertType(AlertCreateParams.AlertType.LOW_CREDIT_BALANCE_REACHED)
                .name("string")
                .threshold(42.23)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.alertType())
            .isEqualTo(AlertCreateParams.AlertType.LOW_CREDIT_BALANCE_REACHED)
        assertThat(body.name()).isEqualTo("string")
        assertThat(body.threshold()).isEqualTo(42.23)
    }
}
