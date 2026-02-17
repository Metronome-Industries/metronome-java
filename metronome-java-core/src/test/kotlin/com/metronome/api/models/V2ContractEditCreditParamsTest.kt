// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import java.time.OffsetDateTime
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V2ContractEditCreditParamsTest {

    @Test
    fun create() {
        V2ContractEditCreditParams.builder()
            .creditId("5e7e82cf-ccb7-428c-a96f-a8e4f67af822")
            .customerId("4c91c473-fc12-445a-9c38-40421d47023f")
            .accessSchedule(
                V2ContractEditCreditParams.AccessSchedule.builder()
                    .addAddScheduleItem(
                        V2ContractEditCreditParams.AccessSchedule.AddScheduleItem.builder()
                            .amount(0.0)
                            .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .addRemoveScheduleItem(
                        V2ContractEditCreditParams.AccessSchedule.RemoveScheduleItem.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                    .addUpdateScheduleItem(
                        V2ContractEditCreditParams.AccessSchedule.UpdateScheduleItem.builder()
                            .id("d5edbd32-c744-48cb-9475-a9bca0e6fa39")
                            .amount(0.0)
                            .endingBefore(OffsetDateTime.parse("2025-03-12T00:00:00Z"))
                            .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .build()
            )
            .addApplicableProductId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addApplicableProductTag("string")
            .description("description")
            .hierarchyConfiguration(
                CommitHierarchyConfiguration.builder()
                    .childAccess(
                        CommitHierarchyConfiguration.ChildAccess.CommitHierarchyChildAccessAll
                            .builder()
                            .type(
                                CommitHierarchyConfiguration.ChildAccess
                                    .CommitHierarchyChildAccessAll
                                    .Type
                                    .ALL
                            )
                            .build()
                    )
                    .build()
            )
            .name("name")
            .priority(0.0)
            .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .rateType(V2ContractEditCreditParams.RateType.LIST_RATE)
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
            .build()
    }

    @Test
    fun body() {
        val params =
            V2ContractEditCreditParams.builder()
                .creditId("5e7e82cf-ccb7-428c-a96f-a8e4f67af822")
                .customerId("4c91c473-fc12-445a-9c38-40421d47023f")
                .accessSchedule(
                    V2ContractEditCreditParams.AccessSchedule.builder()
                        .addAddScheduleItem(
                            V2ContractEditCreditParams.AccessSchedule.AddScheduleItem.builder()
                                .amount(0.0)
                                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .addRemoveScheduleItem(
                            V2ContractEditCreditParams.AccessSchedule.RemoveScheduleItem.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .build()
                        )
                        .addUpdateScheduleItem(
                            V2ContractEditCreditParams.AccessSchedule.UpdateScheduleItem.builder()
                                .id("d5edbd32-c744-48cb-9475-a9bca0e6fa39")
                                .amount(0.0)
                                .endingBefore(OffsetDateTime.parse("2025-03-12T00:00:00Z"))
                                .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .build()
                )
                .addApplicableProductId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addApplicableProductTag("string")
                .description("description")
                .hierarchyConfiguration(
                    CommitHierarchyConfiguration.builder()
                        .childAccess(
                            CommitHierarchyConfiguration.ChildAccess.CommitHierarchyChildAccessAll
                                .builder()
                                .type(
                                    CommitHierarchyConfiguration.ChildAccess
                                        .CommitHierarchyChildAccessAll
                                        .Type
                                        .ALL
                                )
                                .build()
                        )
                        .build()
                )
                .name("name")
                .priority(0.0)
                .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .rateType(V2ContractEditCreditParams.RateType.LIST_RATE)
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
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.creditId()).isEqualTo("5e7e82cf-ccb7-428c-a96f-a8e4f67af822")
        assertThat(body.customerId()).isEqualTo("4c91c473-fc12-445a-9c38-40421d47023f")
        assertThat(body.accessSchedule())
            .contains(
                V2ContractEditCreditParams.AccessSchedule.builder()
                    .addAddScheduleItem(
                        V2ContractEditCreditParams.AccessSchedule.AddScheduleItem.builder()
                            .amount(0.0)
                            .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .addRemoveScheduleItem(
                        V2ContractEditCreditParams.AccessSchedule.RemoveScheduleItem.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                    .addUpdateScheduleItem(
                        V2ContractEditCreditParams.AccessSchedule.UpdateScheduleItem.builder()
                            .id("d5edbd32-c744-48cb-9475-a9bca0e6fa39")
                            .amount(0.0)
                            .endingBefore(OffsetDateTime.parse("2025-03-12T00:00:00Z"))
                            .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .build()
            )
        assertThat(body.applicableProductIds())
            .contains(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        assertThat(body.applicableProductTags()).contains(listOf("string"))
        assertThat(body.description()).contains("description")
        assertThat(body.hierarchyConfiguration())
            .contains(
                CommitHierarchyConfiguration.builder()
                    .childAccess(
                        CommitHierarchyConfiguration.ChildAccess.CommitHierarchyChildAccessAll
                            .builder()
                            .type(
                                CommitHierarchyConfiguration.ChildAccess
                                    .CommitHierarchyChildAccessAll
                                    .Type
                                    .ALL
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(body.name()).contains("name")
        assertThat(body.priority()).contains(0.0)
        assertThat(body.productId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.rateType()).contains(V2ContractEditCreditParams.RateType.LIST_RATE)
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            V2ContractEditCreditParams.builder()
                .creditId("5e7e82cf-ccb7-428c-a96f-a8e4f67af822")
                .customerId("4c91c473-fc12-445a-9c38-40421d47023f")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.creditId()).isEqualTo("5e7e82cf-ccb7-428c-a96f-a8e4f67af822")
        assertThat(body.customerId()).isEqualTo("4c91c473-fc12-445a-9c38-40421d47023f")
    }
}
