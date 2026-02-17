// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v2.contracts

import com.metronome.api.core.JsonValue
import com.metronome.api.models.CommitHierarchyConfiguration
import com.metronome.api.models.CommitSpecifierInput
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContractEditCreditParamsTest {

    @Test
    fun create() {
        ContractEditCreditParams.builder()
            .creditId("5e7e82cf-ccb7-428c-a96f-a8e4f67af822")
            .customerId("4c91c473-fc12-445a-9c38-40421d47023f")
            .accessSchedule(
                ContractEditCreditParams.AccessSchedule.builder()
                    .addAddScheduleItem(
                        ContractEditCreditParams.AccessSchedule.AddScheduleItem.builder()
                            .amount(0.0)
                            .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .addRemoveScheduleItem(
                        ContractEditCreditParams.AccessSchedule.RemoveScheduleItem.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                    .addUpdateScheduleItem(
                        ContractEditCreditParams.AccessSchedule.UpdateScheduleItem.builder()
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
            .rateType(ContractEditCreditParams.RateType.LIST_RATE)
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
            ContractEditCreditParams.builder()
                .creditId("5e7e82cf-ccb7-428c-a96f-a8e4f67af822")
                .customerId("4c91c473-fc12-445a-9c38-40421d47023f")
                .accessSchedule(
                    ContractEditCreditParams.AccessSchedule.builder()
                        .addAddScheduleItem(
                            ContractEditCreditParams.AccessSchedule.AddScheduleItem.builder()
                                .amount(0.0)
                                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .addRemoveScheduleItem(
                            ContractEditCreditParams.AccessSchedule.RemoveScheduleItem.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .build()
                        )
                        .addUpdateScheduleItem(
                            ContractEditCreditParams.AccessSchedule.UpdateScheduleItem.builder()
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
                .rateType(ContractEditCreditParams.RateType.LIST_RATE)
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

        assertThat(body.creditId()).isEqualTo("5e7e82cf-ccb7-428c-a96f-a8e4f67af822")
        assertThat(body.customerId()).isEqualTo("4c91c473-fc12-445a-9c38-40421d47023f")
        assertThat(body.accessSchedule())
            .contains(
                ContractEditCreditParams.AccessSchedule.builder()
                    .addAddScheduleItem(
                        ContractEditCreditParams.AccessSchedule.AddScheduleItem.builder()
                            .amount(0.0)
                            .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .addRemoveScheduleItem(
                        ContractEditCreditParams.AccessSchedule.RemoveScheduleItem.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                    .addUpdateScheduleItem(
                        ContractEditCreditParams.AccessSchedule.UpdateScheduleItem.builder()
                            .id("d5edbd32-c744-48cb-9475-a9bca0e6fa39")
                            .amount(0.0)
                            .endingBefore(OffsetDateTime.parse("2025-03-12T00:00:00Z"))
                            .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .build()
            )
        assertThat(body.applicableProductIds().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.applicableProductTags().getOrNull()).containsExactly("string")
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
        assertThat(body.rateType()).contains(ContractEditCreditParams.RateType.LIST_RATE)
        assertThat(body.specifiers().getOrNull())
            .containsExactly(
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ContractEditCreditParams.builder()
                .creditId("5e7e82cf-ccb7-428c-a96f-a8e4f67af822")
                .customerId("4c91c473-fc12-445a-9c38-40421d47023f")
                .build()

        val body = params._body()

        assertThat(body.creditId()).isEqualTo("5e7e82cf-ccb7-428c-a96f-a8e4f67af822")
        assertThat(body.customerId()).isEqualTo("4c91c473-fc12-445a-9c38-40421d47023f")
    }
}
