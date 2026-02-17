// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.proguard

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.client.okhttp.MetronomeOkHttpClient
import com.metronome.api.core.JsonValue
import com.metronome.api.core.jsonMapper
import com.metronome.api.models.Commit
import com.metronome.api.models.CommitHierarchyConfiguration
import com.metronome.api.models.CommitSpecifier
import com.metronome.api.models.CreditTypeData
import com.metronome.api.models.Id
import com.metronome.api.models.ScheduleDuration
import com.metronome.api.models.SchedulePointInTime
import com.metronome.api.models.v1.contracts.ContractCreateResponse
import com.metronome.api.models.v1.contracts.ContractListBalancesResponse
import com.metronome.api.models.v1.payments.PaymentStatus
import java.time.OffsetDateTime
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.jvm.javaMethod
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProGuardCompatibilityTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")

            // We have to manually run the test methods instead of using the JUnit runner because it
            // seems impossible to get working with R8.
            val test = ProGuardCompatibilityTest()
            test::class
                .memberFunctions
                .asSequence()
                .filter { function ->
                    function.javaMethod?.isAnnotationPresent(Test::class.java) == true
                }
                .forEach { it.call(test) }
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile =
            javaClass.classLoader.getResourceAsStream("META-INF/proguard/metronome-java-core.pro")

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client = MetronomeOkHttpClient.builder().bearerToken("My Bearer Token").build()

        assertThat(client).isNotNull()
        assertThat(client.v2()).isNotNull()
        assertThat(client.v1()).isNotNull()
    }

    @Test
    fun contractCreateResponseRoundtrip() {
        val jsonMapper = jsonMapper()
        val contractCreateResponse =
            ContractCreateResponse.builder()
                .data(Id.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build())
                .build()

        val roundtrippedContractCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contractCreateResponse),
                jacksonTypeRef<ContractCreateResponse>(),
            )

        assertThat(roundtrippedContractCreateResponse).isEqualTo(contractCreateResponse)
    }

    @Test
    fun contractListBalancesResponseRoundtrip() {
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
    fun paymentStatusRoundtrip() {
        val jsonMapper = jsonMapper()
        val paymentStatus = PaymentStatus.PENDING

        val roundtrippedPaymentStatus =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paymentStatus),
                jacksonTypeRef<PaymentStatus>(),
            )

        assertThat(roundtrippedPaymentStatus).isEqualTo(paymentStatus)
    }
}
