// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers.alerts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.jsonMapper
import com.metronome.api.models.CreditTypeData
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerAlertTest {

    @Test
    fun create() {
        val customerAlert =
            CustomerAlert.builder()
                .alert(
                    CustomerAlert.Alert.builder()
                        .id("id")
                        .name("name")
                        .status(CustomerAlert.Alert.Status.ENABLED)
                        .threshold(0.0)
                        .type(CustomerAlert.Alert.Type.LOW_CREDIT_BALANCE_REACHED)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addCreditGrantTypeFilter("string")
                        .creditType(
                            CreditTypeData.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .name("name")
                                .build()
                        )
                        .addCustomFieldFilter(
                            CustomerAlert.Alert.CustomFieldFilter.builder()
                                .entity(CustomerAlert.Alert.CustomFieldFilter.Entity.CONTRACT)
                                .key("key")
                                .value("value")
                                .build()
                        )
                        .groupKeyFilter(
                            CustomerAlert.Alert.GroupKeyFilter.builder()
                                .key("key")
                                .value("value")
                                .build()
                        )
                        .addGroupValue(
                            CustomerAlert.Alert.GroupValue.builder()
                                .key("key")
                                .value("value")
                                .build()
                        )
                        .addInvoiceTypesFilter("SCHEDULED or USAGE")
                        .seatFilter(
                            CustomerAlert.Alert.SeatFilter.builder()
                                .seatGroupKey("seat_group_key")
                                .seatGroupValue("seat_group_value")
                                .build()
                        )
                        .uniquenessKey("x")
                        .build()
                )
                .customerStatus(CustomerAlert.CustomerStatus.OK)
                .triggeredBy("triggered_by")
                .build()

        assertThat(customerAlert.alert())
            .isEqualTo(
                CustomerAlert.Alert.builder()
                    .id("id")
                    .name("name")
                    .status(CustomerAlert.Alert.Status.ENABLED)
                    .threshold(0.0)
                    .type(CustomerAlert.Alert.Type.LOW_CREDIT_BALANCE_REACHED)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addCreditGrantTypeFilter("string")
                    .creditType(
                        CreditTypeData.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .name("name")
                            .build()
                    )
                    .addCustomFieldFilter(
                        CustomerAlert.Alert.CustomFieldFilter.builder()
                            .entity(CustomerAlert.Alert.CustomFieldFilter.Entity.CONTRACT)
                            .key("key")
                            .value("value")
                            .build()
                    )
                    .groupKeyFilter(
                        CustomerAlert.Alert.GroupKeyFilter.builder()
                            .key("key")
                            .value("value")
                            .build()
                    )
                    .addGroupValue(
                        CustomerAlert.Alert.GroupValue.builder().key("key").value("value").build()
                    )
                    .addInvoiceTypesFilter("SCHEDULED or USAGE")
                    .seatFilter(
                        CustomerAlert.Alert.SeatFilter.builder()
                            .seatGroupKey("seat_group_key")
                            .seatGroupValue("seat_group_value")
                            .build()
                    )
                    .uniquenessKey("x")
                    .build()
            )
        assertThat(customerAlert.customerStatus()).contains(CustomerAlert.CustomerStatus.OK)
        assertThat(customerAlert.triggeredBy()).contains("triggered_by")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerAlert =
            CustomerAlert.builder()
                .alert(
                    CustomerAlert.Alert.builder()
                        .id("id")
                        .name("name")
                        .status(CustomerAlert.Alert.Status.ENABLED)
                        .threshold(0.0)
                        .type(CustomerAlert.Alert.Type.LOW_CREDIT_BALANCE_REACHED)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addCreditGrantTypeFilter("string")
                        .creditType(
                            CreditTypeData.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .name("name")
                                .build()
                        )
                        .addCustomFieldFilter(
                            CustomerAlert.Alert.CustomFieldFilter.builder()
                                .entity(CustomerAlert.Alert.CustomFieldFilter.Entity.CONTRACT)
                                .key("key")
                                .value("value")
                                .build()
                        )
                        .groupKeyFilter(
                            CustomerAlert.Alert.GroupKeyFilter.builder()
                                .key("key")
                                .value("value")
                                .build()
                        )
                        .addGroupValue(
                            CustomerAlert.Alert.GroupValue.builder()
                                .key("key")
                                .value("value")
                                .build()
                        )
                        .addInvoiceTypesFilter("SCHEDULED or USAGE")
                        .seatFilter(
                            CustomerAlert.Alert.SeatFilter.builder()
                                .seatGroupKey("seat_group_key")
                                .seatGroupValue("seat_group_value")
                                .build()
                        )
                        .uniquenessKey("x")
                        .build()
                )
                .customerStatus(CustomerAlert.CustomerStatus.OK)
                .triggeredBy("triggered_by")
                .build()

        val roundtrippedCustomerAlert =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerAlert),
                jacksonTypeRef<CustomerAlert>(),
            )

        assertThat(roundtrippedCustomerAlert).isEqualTo(customerAlert)
    }
}
