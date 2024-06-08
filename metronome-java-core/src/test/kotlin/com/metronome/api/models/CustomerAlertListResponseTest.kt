// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerAlertListResponseTest {

    @Test
    fun createCustomerAlertListResponse() {
        val customerAlertListResponse =
            CustomerAlertListResponse.builder()
                .data(
                    listOf(
                        CustomerAlert.builder()
                            .alert(
                                CustomerAlert.Alert.builder()
                                    .id("string")
                                    .name("string")
                                    .status(CustomerAlert.Alert.Status.ENABLED)
                                    .threshold(42.23)
                                    .type(CustomerAlert.Alert.Type.LOW_CREDIT_BALANCE_REACHED)
                                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .creditType(
                                        CustomerAlert.Alert.CreditType.builder()
                                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                            .name("string")
                                            .build()
                                    )
                                    .customFieldFilters(
                                        listOf(
                                            CustomerAlert.Alert.CustomFieldFilter.builder()
                                                .entity(
                                                    CustomerAlert.Alert.CustomFieldFilter.Entity
                                                        .CONTRACT
                                                )
                                                .key("string")
                                                .value("string")
                                                .build()
                                        )
                                    )
                                    .groupKeyFilter(
                                        CustomerAlert.Alert.GroupKeyFilter.builder()
                                            .key("string")
                                            .value("string")
                                            .build()
                                    )
                                    .uniquenessKey("x")
                                    .build()
                            )
                            .customerStatus(CustomerAlert.CustomerStatus.OK)
                            .triggeredBy("string")
                            .build()
                    )
                )
                .nextPage("string")
                .build()
        assertThat(customerAlertListResponse).isNotNull
        assertThat(customerAlertListResponse.data())
            .containsExactly(
                CustomerAlert.builder()
                    .alert(
                        CustomerAlert.Alert.builder()
                            .id("string")
                            .name("string")
                            .status(CustomerAlert.Alert.Status.ENABLED)
                            .threshold(42.23)
                            .type(CustomerAlert.Alert.Type.LOW_CREDIT_BALANCE_REACHED)
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .creditType(
                                CustomerAlert.Alert.CreditType.builder()
                                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .name("string")
                                    .build()
                            )
                            .customFieldFilters(
                                listOf(
                                    CustomerAlert.Alert.CustomFieldFilter.builder()
                                        .entity(
                                            CustomerAlert.Alert.CustomFieldFilter.Entity.CONTRACT
                                        )
                                        .key("string")
                                        .value("string")
                                        .build()
                                )
                            )
                            .groupKeyFilter(
                                CustomerAlert.Alert.GroupKeyFilter.builder()
                                    .key("string")
                                    .value("string")
                                    .build()
                            )
                            .uniquenessKey("x")
                            .build()
                    )
                    .customerStatus(CustomerAlert.CustomerStatus.OK)
                    .triggeredBy("string")
                    .build()
            )
        assertThat(customerAlertListResponse.nextPage()).contains("string")
    }
}
