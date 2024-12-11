// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import com.metronome.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerCreditCreateParamsTest {

    @Test
    fun createCustomerCreditCreateParams() {
        CustomerCreditCreateParams.builder()
            .accessSchedule(
                CustomerCreditCreateParams.AccessSchedule.builder()
                    .scheduleItems(
                        listOf(
                            CustomerCreditCreateParams.AccessSchedule.ScheduleItem.builder()
                                .amount(0.0)
                                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                    )
                    .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
            .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .priority(0.0)
            .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .applicableContractIds(listOf("string"))
            .applicableProductIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
            .applicableProductTags(listOf("string"))
            .customFields(
                CustomerCreditCreateParams.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .description("description")
            .name("x")
            .netsuiteSalesOrderId("netsuite_sales_order_id")
            .rateType(CustomerCreditCreateParams.RateType.COMMIT_RATE)
            .salesforceOpportunityId("salesforce_opportunity_id")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            CustomerCreditCreateParams.builder()
                .accessSchedule(
                    CustomerCreditCreateParams.AccessSchedule.builder()
                        .scheduleItems(
                            listOf(
                                CustomerCreditCreateParams.AccessSchedule.ScheduleItem.builder()
                                    .amount(0.0)
                                    .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .build()
                            )
                        )
                        .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .priority(0.0)
                .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .applicableContractIds(listOf("string"))
                .applicableProductIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .applicableProductTags(listOf("string"))
                .customFields(
                    CustomerCreditCreateParams.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .description("description")
                .name("x")
                .netsuiteSalesOrderId("netsuite_sales_order_id")
                .rateType(CustomerCreditCreateParams.RateType.COMMIT_RATE)
                .salesforceOpportunityId("salesforce_opportunity_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accessSchedule())
            .isEqualTo(
                CustomerCreditCreateParams.AccessSchedule.builder()
                    .scheduleItems(
                        listOf(
                            CustomerCreditCreateParams.AccessSchedule.ScheduleItem.builder()
                                .amount(0.0)
                                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                    )
                    .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        assertThat(body.customerId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.priority()).isEqualTo(0.0)
        assertThat(body.productId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.applicableContractIds()).isEqualTo(listOf("string"))
        assertThat(body.applicableProductIds())
            .isEqualTo(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        assertThat(body.applicableProductTags()).isEqualTo(listOf("string"))
        assertThat(body.customFields())
            .isEqualTo(
                CustomerCreditCreateParams.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.description()).isEqualTo("description")
        assertThat(body.name()).isEqualTo("x")
        assertThat(body.netsuiteSalesOrderId()).isEqualTo("netsuite_sales_order_id")
        assertThat(body.rateType()).isEqualTo(CustomerCreditCreateParams.RateType.COMMIT_RATE)
        assertThat(body.salesforceOpportunityId()).isEqualTo("salesforce_opportunity_id")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            CustomerCreditCreateParams.builder()
                .accessSchedule(
                    CustomerCreditCreateParams.AccessSchedule.builder()
                        .scheduleItems(
                            listOf(
                                CustomerCreditCreateParams.AccessSchedule.ScheduleItem.builder()
                                    .amount(0.0)
                                    .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .build()
                            )
                        )
                        .build()
                )
                .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .priority(0.0)
                .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accessSchedule())
            .isEqualTo(
                CustomerCreditCreateParams.AccessSchedule.builder()
                    .scheduleItems(
                        listOf(
                            CustomerCreditCreateParams.AccessSchedule.ScheduleItem.builder()
                                .amount(0.0)
                                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                    )
                    .build()
            )
        assertThat(body.customerId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.priority()).isEqualTo(0.0)
        assertThat(body.productId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
