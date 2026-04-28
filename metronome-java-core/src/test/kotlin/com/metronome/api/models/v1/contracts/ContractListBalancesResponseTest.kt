// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.contracts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.JsonValue
import com.metronome.api.core.jsonMapper
import com.metronome.api.errors.MetronomeInvalidDataException
import com.metronome.api.models.Commit
import com.metronome.api.models.CommitHierarchyConfiguration
import com.metronome.api.models.CommitSpecifier
import com.metronome.api.models.Credit
import com.metronome.api.models.CreditTypeData
import com.metronome.api.models.ScheduleDuration
import com.metronome.api.models.SchedulePointInTime
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class ContractListBalancesResponseTest {

    @Test
    fun ofCommit() {
        val commit =
            Commit.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .product(
                    Commit.Product.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .build()
                )
                .type(Commit.Type.PREPAID)
                .accessSchedule(
                    ScheduleDuration.builder()
                        .addScheduleItem(
                            ScheduleDuration.ScheduleItem.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .amount(0.0)
                                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .creditType(
                            CreditTypeData.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .name("name")
                                .build()
                        )
                        .build()
                )
                .amount(0.0)
                .addApplicableContractId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addApplicableProductId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addApplicableProductTag("string")
                .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .balance(0.0)
                .contract(
                    Commit.Contract.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()
                )
                .customFields(
                    Commit.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
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
                .invoiceContract(
                    Commit.InvoiceContract.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .invoiceSchedule(
                    SchedulePointInTime.builder()
                        .creditType(
                            CreditTypeData.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .name("name")
                                .build()
                        )
                        .doNotInvoice(true)
                        .addScheduleItem(
                            SchedulePointInTime.ScheduleItem.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .amount(0.0)
                                .quantity(0.0)
                                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .unitPrice(0.0)
                                .invoiceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .build()
                        )
                        .build()
                )
                .addLedger(
                    Commit.Ledger.PrepaidCommitSegmentStartLedgerEntry.builder()
                        .amount(0.0)
                        .segmentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .type(
                            Commit.Ledger.PrepaidCommitSegmentStartLedgerEntry.Type
                                .PREPAID_COMMIT_SEGMENT_START
                        )
                        .build()
                )
                .name("name")
                .netsuiteSalesOrderId("netsuite_sales_order_id")
                .priority(0.0)
                .rateType(Commit.RateType.COMMIT_RATE)
                .recurringCommitId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .rolledOverFrom(
                    Commit.RolledOverFrom.builder()
                        .commitId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .contractId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .rolloverFraction(0.0)
                .salesforceOpportunityId("salesforce_opportunity_id")
                .addSpecifier(
                    CommitSpecifier.builder()
                        .presentationGroupValues(
                            CommitSpecifier.PresentationGroupValues.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .pricingGroupValues(
                            CommitSpecifier.PricingGroupValues.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addProductTag("string")
                        .build()
                )
                .subscriptionConfig(
                    Commit.SubscriptionConfig.builder()
                        .allocation(Commit.SubscriptionConfig.Allocation.INDIVIDUAL)
                        .applySeatIncreaseConfig(
                            Commit.SubscriptionConfig.ApplySeatIncreaseConfig.builder()
                                .isProrated(true)
                                .build()
                        )
                        .subscriptionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .uniquenessKey("x")
                .build()

        val contractListBalancesResponse = ContractListBalancesResponse.ofCommit(commit)

        assertThat(contractListBalancesResponse.commit()).contains(commit)
        assertThat(contractListBalancesResponse.credit()).isEmpty
    }

    @Test
    fun ofCommitRoundtrip() {
        val jsonMapper = jsonMapper()
        val contractListBalancesResponse =
            ContractListBalancesResponse.ofCommit(
                Commit.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .product(
                        Commit.Product.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .name("name")
                            .build()
                    )
                    .type(Commit.Type.PREPAID)
                    .accessSchedule(
                        ScheduleDuration.builder()
                            .addScheduleItem(
                                ScheduleDuration.ScheduleItem.builder()
                                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .amount(0.0)
                                    .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .build()
                            )
                            .creditType(
                                CreditTypeData.builder()
                                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .name("name")
                                    .build()
                            )
                            .build()
                    )
                    .amount(0.0)
                    .addApplicableContractId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addApplicableProductId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addApplicableProductTag("string")
                    .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .balance(0.0)
                    .contract(
                        Commit.Contract.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()
                    )
                    .customFields(
                        Commit.CustomFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .description("description")
                    .hierarchyConfiguration(
                        CommitHierarchyConfiguration.builder()
                            .childAccess(
                                CommitHierarchyConfiguration.ChildAccess
                                    .CommitHierarchyChildAccessAll
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
                    .invoiceContract(
                        Commit.InvoiceContract.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                    .invoiceSchedule(
                        SchedulePointInTime.builder()
                            .creditType(
                                CreditTypeData.builder()
                                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .name("name")
                                    .build()
                            )
                            .doNotInvoice(true)
                            .addScheduleItem(
                                SchedulePointInTime.ScheduleItem.builder()
                                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .amount(0.0)
                                    .quantity(0.0)
                                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .unitPrice(0.0)
                                    .invoiceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .build()
                            )
                            .build()
                    )
                    .addLedger(
                        Commit.Ledger.PrepaidCommitSegmentStartLedgerEntry.builder()
                            .amount(0.0)
                            .segmentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .type(
                                Commit.Ledger.PrepaidCommitSegmentStartLedgerEntry.Type
                                    .PREPAID_COMMIT_SEGMENT_START
                            )
                            .build()
                    )
                    .name("name")
                    .netsuiteSalesOrderId("netsuite_sales_order_id")
                    .priority(0.0)
                    .rateType(Commit.RateType.COMMIT_RATE)
                    .recurringCommitId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .rolledOverFrom(
                        Commit.RolledOverFrom.builder()
                            .commitId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .contractId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                    .rolloverFraction(0.0)
                    .salesforceOpportunityId("salesforce_opportunity_id")
                    .addSpecifier(
                        CommitSpecifier.builder()
                            .presentationGroupValues(
                                CommitSpecifier.PresentationGroupValues.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .pricingGroupValues(
                                CommitSpecifier.PricingGroupValues.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .addProductTag("string")
                            .build()
                    )
                    .subscriptionConfig(
                        Commit.SubscriptionConfig.builder()
                            .allocation(Commit.SubscriptionConfig.Allocation.INDIVIDUAL)
                            .applySeatIncreaseConfig(
                                Commit.SubscriptionConfig.ApplySeatIncreaseConfig.builder()
                                    .isProrated(true)
                                    .build()
                            )
                            .subscriptionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                    .uniquenessKey("x")
                    .build()
            )

        val roundtrippedContractListBalancesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contractListBalancesResponse),
                jacksonTypeRef<ContractListBalancesResponse>(),
            )

        assertThat(roundtrippedContractListBalancesResponse).isEqualTo(contractListBalancesResponse)
    }

    @Test
    fun ofCredit() {
        val credit =
            Credit.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .product(
                    Credit.Product.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .build()
                )
                .type(Credit.Type.CREDIT)
                .accessSchedule(
                    ScheduleDuration.builder()
                        .addScheduleItem(
                            ScheduleDuration.ScheduleItem.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .amount(0.0)
                                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .creditType(
                            CreditTypeData.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .name("name")
                                .build()
                        )
                        .build()
                )
                .addApplicableContractId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addApplicableProductId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addApplicableProductTag("string")
                .balance(0.0)
                .contract(
                    Credit.Contract.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()
                )
                .customFields(
                    Credit.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
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
                .addLedger(
                    Credit.Ledger.CreditSegmentStartLedgerEntry.builder()
                        .amount(0.0)
                        .segmentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .type(Credit.Ledger.CreditSegmentStartLedgerEntry.Type.CREDIT_SEGMENT_START)
                        .build()
                )
                .name("name")
                .netsuiteSalesOrderId("netsuite_sales_order_id")
                .priority(0.0)
                .rateType(Credit.RateType.COMMIT_RATE)
                .recurringCreditId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .rolledOverFrom(
                    Credit.RolledOverFrom.builder()
                        .contractId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .creditId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .salesforceOpportunityId("salesforce_opportunity_id")
                .addSpecifier(
                    CommitSpecifier.builder()
                        .presentationGroupValues(
                            CommitSpecifier.PresentationGroupValues.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .pricingGroupValues(
                            CommitSpecifier.PricingGroupValues.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addProductTag("string")
                        .build()
                )
                .subscriptionConfig(
                    Credit.SubscriptionConfig.builder()
                        .allocation(Credit.SubscriptionConfig.Allocation.INDIVIDUAL)
                        .applySeatIncreaseConfig(
                            Credit.SubscriptionConfig.ApplySeatIncreaseConfig.builder()
                                .isProrated(true)
                                .build()
                        )
                        .subscriptionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .uniquenessKey("x")
                .build()

        val contractListBalancesResponse = ContractListBalancesResponse.ofCredit(credit)

        assertThat(contractListBalancesResponse.commit()).isEmpty
        assertThat(contractListBalancesResponse.credit()).contains(credit)
    }

    @Test
    fun ofCreditRoundtrip() {
        val jsonMapper = jsonMapper()
        val contractListBalancesResponse =
            ContractListBalancesResponse.ofCredit(
                Credit.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .product(
                        Credit.Product.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .name("name")
                            .build()
                    )
                    .type(Credit.Type.CREDIT)
                    .accessSchedule(
                        ScheduleDuration.builder()
                            .addScheduleItem(
                                ScheduleDuration.ScheduleItem.builder()
                                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .amount(0.0)
                                    .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .build()
                            )
                            .creditType(
                                CreditTypeData.builder()
                                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .name("name")
                                    .build()
                            )
                            .build()
                    )
                    .addApplicableContractId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addApplicableProductId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addApplicableProductTag("string")
                    .balance(0.0)
                    .contract(
                        Credit.Contract.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()
                    )
                    .customFields(
                        Credit.CustomFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .description("description")
                    .hierarchyConfiguration(
                        CommitHierarchyConfiguration.builder()
                            .childAccess(
                                CommitHierarchyConfiguration.ChildAccess
                                    .CommitHierarchyChildAccessAll
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
                    .addLedger(
                        Credit.Ledger.CreditSegmentStartLedgerEntry.builder()
                            .amount(0.0)
                            .segmentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .type(
                                Credit.Ledger.CreditSegmentStartLedgerEntry.Type
                                    .CREDIT_SEGMENT_START
                            )
                            .build()
                    )
                    .name("name")
                    .netsuiteSalesOrderId("netsuite_sales_order_id")
                    .priority(0.0)
                    .rateType(Credit.RateType.COMMIT_RATE)
                    .recurringCreditId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .rolledOverFrom(
                        Credit.RolledOverFrom.builder()
                            .contractId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .creditId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                    .salesforceOpportunityId("salesforce_opportunity_id")
                    .addSpecifier(
                        CommitSpecifier.builder()
                            .presentationGroupValues(
                                CommitSpecifier.PresentationGroupValues.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .pricingGroupValues(
                                CommitSpecifier.PricingGroupValues.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .addProductTag("string")
                            .build()
                    )
                    .subscriptionConfig(
                        Credit.SubscriptionConfig.builder()
                            .allocation(Credit.SubscriptionConfig.Allocation.INDIVIDUAL)
                            .applySeatIncreaseConfig(
                                Credit.SubscriptionConfig.ApplySeatIncreaseConfig.builder()
                                    .isProrated(true)
                                    .build()
                            )
                            .subscriptionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                    .uniquenessKey("x")
                    .build()
            )

        val roundtrippedContractListBalancesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contractListBalancesResponse),
                jacksonTypeRef<ContractListBalancesResponse>(),
            )

        assertThat(roundtrippedContractListBalancesResponse).isEqualTo(contractListBalancesResponse)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val contractListBalancesResponse =
            jsonMapper()
                .convertValue(testCase.value, jacksonTypeRef<ContractListBalancesResponse>())

        val e =
            assertThrows<MetronomeInvalidDataException> { contractListBalancesResponse.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
