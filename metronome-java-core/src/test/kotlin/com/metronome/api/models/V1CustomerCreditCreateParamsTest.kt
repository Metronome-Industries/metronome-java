// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import java.time.OffsetDateTime
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1CustomerCreditCreateParamsTest {

    @Test
    fun create() {
        V1CustomerCreditCreateParams.builder()
            .accessSchedule(
                V1CustomerCreditCreateParams.AccessSchedule.builder()
                    .addScheduleItem(
                        V1CustomerCreditCreateParams.AccessSchedule.ScheduleItem.builder()
                            .amount(1000.0)
                            .endingBefore(OffsetDateTime.parse("2020-02-01T00:00:00.000Z"))
                            .startingAt(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                            .build()
                    )
                    .creditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                    .build()
            )
            .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
            .priority(100.0)
            .productId("f14d6729-6a44-4b13-9908-9387f1918790")
            .addApplicableContractId("string")
            .addApplicableProductId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addApplicableProductTag("string")
            .customFields(
                V1CustomerCreditCreateParams.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .description("description")
            .name("My Credit")
            .netsuiteSalesOrderId("netsuite_sales_order_id")
            .rateType(V1CustomerCreditCreateParams.RateType.COMMIT_RATE)
            .salesforceOpportunityId("salesforce_opportunity_id")
            .addSpecifier(
                CommitSpecifierInput.builder()
                    .presentationGroupValues(
                        CommitSpecifierInput.PresentationGroupValues.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .pricingGroupValues(
                        CommitSpecifierInput.PricingGroupValues.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addProductTag("string")
                    .build()
            )
            .uniquenessKey("x")
            .build()
    }

    @Test
    fun body() {
        val params =
            V1CustomerCreditCreateParams.builder()
                .accessSchedule(
                    V1CustomerCreditCreateParams.AccessSchedule.builder()
                        .addScheduleItem(
                            V1CustomerCreditCreateParams.AccessSchedule.ScheduleItem.builder()
                                .amount(1000.0)
                                .endingBefore(OffsetDateTime.parse("2020-02-01T00:00:00.000Z"))
                                .startingAt(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                                .build()
                        )
                        .creditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                        .build()
                )
                .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                .priority(100.0)
                .productId("f14d6729-6a44-4b13-9908-9387f1918790")
                .addApplicableContractId("string")
                .addApplicableProductId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addApplicableProductTag("string")
                .customFields(
                    V1CustomerCreditCreateParams.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .description("description")
                .name("My Credit")
                .netsuiteSalesOrderId("netsuite_sales_order_id")
                .rateType(V1CustomerCreditCreateParams.RateType.COMMIT_RATE)
                .salesforceOpportunityId("salesforce_opportunity_id")
                .addSpecifier(
                    CommitSpecifierInput.builder()
                        .presentationGroupValues(
                            CommitSpecifierInput.PresentationGroupValues.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .pricingGroupValues(
                            CommitSpecifierInput.PricingGroupValues.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addProductTag("string")
                        .build()
                )
                .uniquenessKey("x")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.accessSchedule())
            .isEqualTo(
                V1CustomerCreditCreateParams.AccessSchedule.builder()
                    .addScheduleItem(
                        V1CustomerCreditCreateParams.AccessSchedule.ScheduleItem.builder()
                            .amount(1000.0)
                            .endingBefore(OffsetDateTime.parse("2020-02-01T00:00:00.000Z"))
                            .startingAt(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                            .build()
                    )
                    .creditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                    .build()
            )
        assertThat(body.customerId()).isEqualTo("13117714-3f05-48e5-a6e9-a66093f13b4d")
        assertThat(body.priority()).isEqualTo(100.0)
        assertThat(body.productId()).isEqualTo("f14d6729-6a44-4b13-9908-9387f1918790")
        assertThat(body.applicableContractIds()).contains(listOf("string"))
        assertThat(body.applicableProductIds())
            .contains(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        assertThat(body.applicableProductTags()).contains(listOf("string"))
        assertThat(body.customFields())
            .contains(
                V1CustomerCreditCreateParams.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.description()).contains("description")
        assertThat(body.name()).contains("My Credit")
        assertThat(body.netsuiteSalesOrderId()).contains("netsuite_sales_order_id")
        assertThat(body.rateType()).contains(V1CustomerCreditCreateParams.RateType.COMMIT_RATE)
        assertThat(body.salesforceOpportunityId()).contains("salesforce_opportunity_id")
        assertThat(body.specifiers())
            .contains(
                listOf(
                    CommitSpecifierInput.builder()
                        .presentationGroupValues(
                            CommitSpecifierInput.PresentationGroupValues.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .pricingGroupValues(
                            CommitSpecifierInput.PricingGroupValues.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addProductTag("string")
                        .build()
                )
            )
        assertThat(body.uniquenessKey()).contains("x")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            V1CustomerCreditCreateParams.builder()
                .accessSchedule(
                    V1CustomerCreditCreateParams.AccessSchedule.builder()
                        .addScheduleItem(
                            V1CustomerCreditCreateParams.AccessSchedule.ScheduleItem.builder()
                                .amount(1000.0)
                                .endingBefore(OffsetDateTime.parse("2020-02-01T00:00:00.000Z"))
                                .startingAt(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                                .build()
                        )
                        .build()
                )
                .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                .priority(100.0)
                .productId("f14d6729-6a44-4b13-9908-9387f1918790")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.accessSchedule())
            .isEqualTo(
                V1CustomerCreditCreateParams.AccessSchedule.builder()
                    .addScheduleItem(
                        V1CustomerCreditCreateParams.AccessSchedule.ScheduleItem.builder()
                            .amount(1000.0)
                            .endingBefore(OffsetDateTime.parse("2020-02-01T00:00:00.000Z"))
                            .startingAt(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                            .build()
                    )
                    .build()
            )
        assertThat(body.customerId()).isEqualTo("13117714-3f05-48e5-a6e9-a66093f13b4d")
        assertThat(body.priority()).isEqualTo(100.0)
        assertThat(body.productId()).isEqualTo("f14d6729-6a44-4b13-9908-9387f1918790")
    }
}
