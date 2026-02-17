// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClient
import com.metronome.api.core.JsonValue
import com.metronome.api.models.BalanceFilter
import com.metronome.api.models.BaseThresholdCommit
import com.metronome.api.models.BaseUsageFilter
import com.metronome.api.models.CommitHierarchyConfiguration
import com.metronome.api.models.CommitSpecifierInput
import com.metronome.api.models.PaymentGateConfig
import com.metronome.api.models.PrepaidBalanceThresholdConfiguration
import com.metronome.api.models.SpendThresholdConfiguration
import com.metronome.api.models.Tier
import com.metronome.api.models.V1ContractAddManualBalanceEntryParams
import com.metronome.api.models.V1ContractAmendParams
import com.metronome.api.models.V1ContractArchiveParams
import com.metronome.api.models.V1ContractCreateHistoricalInvoicesParams
import com.metronome.api.models.V1ContractCreateParams
import com.metronome.api.models.V1ContractGetNetBalanceParams
import com.metronome.api.models.V1ContractListBalancesParams
import com.metronome.api.models.V1ContractListParams
import com.metronome.api.models.V1ContractRetrieveParams
import com.metronome.api.models.V1ContractRetrieveRateScheduleParams
import com.metronome.api.models.V1ContractRetrieveSubscriptionQuantityHistoryParams
import com.metronome.api.models.V1ContractScheduleProServicesInvoiceParams
import com.metronome.api.models.V1ContractSetUsageFilterParams
import com.metronome.api.models.V1ContractUpdateEndDateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ContractServiceTest {

    @Test
    fun create() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val contractService = client.v1().contracts()

        val contract =
            contractService.create(
                V1ContractCreateParams.builder()
                    .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                    .startingAt(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .billingProviderConfiguration(
                        V1ContractCreateParams.BillingProviderConfiguration.builder()
                            .billingProvider(
                                V1ContractCreateParams.BillingProviderConfiguration.BillingProvider
                                    .AWS_MARKETPLACE
                            )
                            .billingProviderConfigurationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .deliveryMethod(
                                V1ContractCreateParams.BillingProviderConfiguration.DeliveryMethod
                                    .DIRECT_TO_BILLING_PROVIDER
                            )
                            .build()
                    )
                    .addCommit(
                        V1ContractCreateParams.Commit.builder()
                            .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .type(V1ContractCreateParams.Commit.Type.PREPAID)
                            .accessSchedule(
                                V1ContractCreateParams.Commit.AccessSchedule.builder()
                                    .addScheduleItem(
                                        V1ContractCreateParams.Commit.AccessSchedule.ScheduleItem
                                            .builder()
                                            .amount(0.0)
                                            .endingBefore(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .startingAt(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .build()
                                    )
                                    .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .build()
                            )
                            .amount(0.0)
                            .addApplicableProductId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .addApplicableProductTag("string")
                            .customFields(
                                V1ContractCreateParams.Commit.CustomFields.builder()
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
                            .invoiceSchedule(
                                V1ContractCreateParams.Commit.InvoiceSchedule.builder()
                                    .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .doNotInvoice(true)
                                    .recurringSchedule(
                                        V1ContractCreateParams.Commit.InvoiceSchedule
                                            .RecurringSchedule
                                            .builder()
                                            .amountDistribution(
                                                V1ContractCreateParams.Commit.InvoiceSchedule
                                                    .RecurringSchedule
                                                    .AmountDistribution
                                                    .DIVIDED
                                            )
                                            .endingBefore(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .frequency(
                                                V1ContractCreateParams.Commit.InvoiceSchedule
                                                    .RecurringSchedule
                                                    .Frequency
                                                    .MONTHLY
                                            )
                                            .startingAt(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .amount(0.0)
                                            .quantity(0.0)
                                            .unitPrice(0.0)
                                            .build()
                                    )
                                    .addScheduleItem(
                                        V1ContractCreateParams.Commit.InvoiceSchedule.ScheduleItem
                                            .builder()
                                            .timestamp(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .amount(0.0)
                                            .quantity(0.0)
                                            .unitPrice(0.0)
                                            .build()
                                    )
                                    .build()
                            )
                            .name("x")
                            .netsuiteSalesOrderId("netsuite_sales_order_id")
                            .paymentGateConfig(
                                V1ContractCreateParams.Commit.PaymentGateConfig.builder()
                                    .paymentGateType(
                                        V1ContractCreateParams.Commit.PaymentGateConfig
                                            .PaymentGateType
                                            .NONE
                                    )
                                    .precalculatedTaxConfig(
                                        V1ContractCreateParams.Commit.PaymentGateConfig
                                            .PrecalculatedTaxConfig
                                            .builder()
                                            .taxAmount(0.0)
                                            .taxName("tax_name")
                                            .build()
                                    )
                                    .stripeConfig(
                                        V1ContractCreateParams.Commit.PaymentGateConfig.StripeConfig
                                            .builder()
                                            .paymentType(
                                                V1ContractCreateParams.Commit.PaymentGateConfig
                                                    .StripeConfig
                                                    .PaymentType
                                                    .INVOICE
                                            )
                                            .invoiceMetadata(
                                                V1ContractCreateParams.Commit.PaymentGateConfig
                                                    .StripeConfig
                                                    .InvoiceMetadata
                                                    .builder()
                                                    .putAdditionalProperty(
                                                        "foo",
                                                        JsonValue.from("string"),
                                                    )
                                                    .build()
                                            )
                                            .onSessionPayment(true)
                                            .build()
                                    )
                                    .taxType(
                                        V1ContractCreateParams.Commit.PaymentGateConfig.TaxType.NONE
                                    )
                                    .build()
                            )
                            .priority(0.0)
                            .rateType(V1ContractCreateParams.Commit.RateType.COMMIT_RATE)
                            .rolloverFraction(0.0)
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
                            .temporaryId("temporary_id")
                            .build()
                    )
                    .addCredit(
                        V1ContractCreateParams.Credit.builder()
                            .accessSchedule(
                                V1ContractCreateParams.Credit.AccessSchedule.builder()
                                    .addScheduleItem(
                                        V1ContractCreateParams.Credit.AccessSchedule.ScheduleItem
                                            .builder()
                                            .amount(0.0)
                                            .endingBefore(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .startingAt(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .build()
                                    )
                                    .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .build()
                            )
                            .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .addApplicableProductId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .addApplicableProductTag("string")
                            .customFields(
                                V1ContractCreateParams.Credit.CustomFields.builder()
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
                            .name("x")
                            .netsuiteSalesOrderId("netsuite_sales_order_id")
                            .priority(0.0)
                            .rateType(V1ContractCreateParams.Credit.RateType.COMMIT_RATE)
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
                    )
                    .customFields(
                        V1ContractCreateParams.CustomFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .addDiscount(
                        V1ContractCreateParams.Discount.builder()
                            .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .schedule(
                                V1ContractCreateParams.Discount.Schedule.builder()
                                    .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .doNotInvoice(true)
                                    .recurringSchedule(
                                        V1ContractCreateParams.Discount.Schedule.RecurringSchedule
                                            .builder()
                                            .amountDistribution(
                                                V1ContractCreateParams.Discount.Schedule
                                                    .RecurringSchedule
                                                    .AmountDistribution
                                                    .DIVIDED
                                            )
                                            .endingBefore(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .frequency(
                                                V1ContractCreateParams.Discount.Schedule
                                                    .RecurringSchedule
                                                    .Frequency
                                                    .MONTHLY
                                            )
                                            .startingAt(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .amount(0.0)
                                            .quantity(0.0)
                                            .unitPrice(0.0)
                                            .build()
                                    )
                                    .addScheduleItem(
                                        V1ContractCreateParams.Discount.Schedule.ScheduleItem
                                            .builder()
                                            .timestamp(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .amount(0.0)
                                            .quantity(0.0)
                                            .unitPrice(0.0)
                                            .build()
                                    )
                                    .build()
                            )
                            .customFields(
                                V1ContractCreateParams.Discount.CustomFields.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .name("x")
                            .netsuiteSalesOrderId("netsuite_sales_order_id")
                            .build()
                    )
                    .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .hierarchyConfiguration(
                        V1ContractCreateParams.HierarchyConfiguration.builder()
                            .parent(
                                V1ContractCreateParams.HierarchyConfiguration.Parent.builder()
                                    .contractId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .build()
                            )
                            .parentBehavior(
                                V1ContractCreateParams.HierarchyConfiguration.ParentBehavior
                                    .builder()
                                    .invoiceConsolidationType(
                                        V1ContractCreateParams.HierarchyConfiguration.ParentBehavior
                                            .InvoiceConsolidationType
                                            .CONCATENATE
                                    )
                                    .build()
                            )
                            .payer(V1ContractCreateParams.HierarchyConfiguration.Payer.SELF)
                            .usageStatementBehavior(
                                V1ContractCreateParams.HierarchyConfiguration.UsageStatementBehavior
                                    .CONSOLIDATE
                            )
                            .build()
                    )
                    .multiplierOverridePrioritization(
                        V1ContractCreateParams.MultiplierOverridePrioritization.LOWEST_MULTIPLIER
                    )
                    .name("name")
                    .netPaymentTermsDays(0.0)
                    .netsuiteSalesOrderId("netsuite_sales_order_id")
                    .addOverride(
                        V1ContractCreateParams.Override.builder()
                            .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .addApplicableProductTag("string")
                            .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .entitled(true)
                            .isCommitSpecific(true)
                            .multiplier(0.0)
                            .addOverrideSpecifier(
                                V1ContractCreateParams.Override.OverrideSpecifier.builder()
                                    .billingFrequency(
                                        V1ContractCreateParams.Override.OverrideSpecifier
                                            .BillingFrequency
                                            .MONTHLY
                                    )
                                    .addCommitId("string")
                                    .presentationGroupValues(
                                        V1ContractCreateParams.Override.OverrideSpecifier
                                            .PresentationGroupValues
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .pricingGroupValues(
                                        V1ContractCreateParams.Override.OverrideSpecifier
                                            .PricingGroupValues
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .addProductTag("string")
                                    .addRecurringCommitId("string")
                                    .addRecurringCreditId("string")
                                    .build()
                            )
                            .overwriteRate(
                                V1ContractCreateParams.Override.OverwriteRate.builder()
                                    .rateType(
                                        V1ContractCreateParams.Override.OverwriteRate.RateType.FLAT
                                    )
                                    .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .customRate(
                                        V1ContractCreateParams.Override.OverwriteRate.CustomRate
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .isProrated(true)
                                    .price(0.0)
                                    .quantity(0.0)
                                    .addTier(Tier.builder().price(0.0).size(0.0).build())
                                    .build()
                            )
                            .priority(0.0)
                            .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .target(V1ContractCreateParams.Override.Target.COMMIT_RATE)
                            .addTier(
                                V1ContractCreateParams.Override.Tier.builder()
                                    .multiplier(0.0)
                                    .size(0.0)
                                    .build()
                            )
                            .type(V1ContractCreateParams.Override.Type.OVERWRITE)
                            .build()
                    )
                    .packageAlias("package_alias")
                    .packageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .prepaidBalanceThresholdConfiguration(
                        PrepaidBalanceThresholdConfiguration.builder()
                            .commit(
                                PrepaidBalanceThresholdConfiguration.Commit.builder()
                                    .productId("product_id")
                                    .description("description")
                                    .name("name")
                                    .addApplicableProductId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .addApplicableProductTag("string")
                                    .addSpecifier(
                                        CommitSpecifierInput.builder()
                                            .presentationGroupValues(
                                                CommitSpecifierInput.PresentationGroupValues
                                                    .builder()
                                                    .putAdditionalProperty(
                                                        "foo",
                                                        JsonValue.from("string"),
                                                    )
                                                    .build()
                                            )
                                            .pricingGroupValues(
                                                CommitSpecifierInput.PricingGroupValues.builder()
                                                    .putAdditionalProperty(
                                                        "foo",
                                                        JsonValue.from("string"),
                                                    )
                                                    .build()
                                            )
                                            .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                            .addProductTag("string")
                                            .build()
                                    )
                                    .build()
                            )
                            .isEnabled(true)
                            .paymentGateConfig(
                                PaymentGateConfig.builder()
                                    .paymentGateType(PaymentGateConfig.PaymentGateType.NONE)
                                    .precalculatedTaxConfig(
                                        PaymentGateConfig.PrecalculatedTaxConfig.builder()
                                            .taxAmount(0.0)
                                            .taxName("tax_name")
                                            .build()
                                    )
                                    .stripeConfig(
                                        PaymentGateConfig.StripeConfig.builder()
                                            .paymentType(
                                                PaymentGateConfig.StripeConfig.PaymentType.INVOICE
                                            )
                                            .invoiceMetadata(
                                                PaymentGateConfig.StripeConfig.InvoiceMetadata
                                                    .builder()
                                                    .putAdditionalProperty(
                                                        "foo",
                                                        JsonValue.from("string"),
                                                    )
                                                    .build()
                                            )
                                            .build()
                                    )
                                    .taxType(PaymentGateConfig.TaxType.NONE)
                                    .build()
                            )
                            .rechargeToAmount(0.0)
                            .thresholdAmount(0.0)
                            .customCreditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                    .addProfessionalService(
                        V1ContractCreateParams.ProfessionalService.builder()
                            .maxAmount(0.0)
                            .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .quantity(0.0)
                            .unitPrice(0.0)
                            .customFields(
                                V1ContractCreateParams.ProfessionalService.CustomFields.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .description("description")
                            .netsuiteSalesOrderId("netsuite_sales_order_id")
                            .build()
                    )
                    .rateCardAlias("rate_card_alias")
                    .rateCardId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .addRecurringCommit(
                        V1ContractCreateParams.RecurringCommit.builder()
                            .accessAmount(
                                V1ContractCreateParams.RecurringCommit.AccessAmount.builder()
                                    .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .unitPrice(0.0)
                                    .quantity(0.0)
                                    .build()
                            )
                            .commitDuration(
                                V1ContractCreateParams.RecurringCommit.CommitDuration.builder()
                                    .value(0.0)
                                    .unit(
                                        V1ContractCreateParams.RecurringCommit.CommitDuration.Unit
                                            .PERIODS
                                    )
                                    .build()
                            )
                            .priority(0.0)
                            .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .addApplicableProductId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .addApplicableProductTag("string")
                            .description("description")
                            .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                            .invoiceAmount(
                                V1ContractCreateParams.RecurringCommit.InvoiceAmount.builder()
                                    .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .quantity(0.0)
                                    .unitPrice(0.0)
                                    .build()
                            )
                            .name("x")
                            .netsuiteSalesOrderId("netsuite_sales_order_id")
                            .proration(V1ContractCreateParams.RecurringCommit.Proration.NONE)
                            .rateType(V1ContractCreateParams.RecurringCommit.RateType.COMMIT_RATE)
                            .recurrenceFrequency(
                                V1ContractCreateParams.RecurringCommit.RecurrenceFrequency.MONTHLY
                            )
                            .rolloverFraction(0.0)
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
                            .subscriptionConfig(
                                V1ContractCreateParams.RecurringCommit.SubscriptionConfig.builder()
                                    .applySeatIncreaseConfig(
                                        V1ContractCreateParams.RecurringCommit.SubscriptionConfig
                                            .ApplySeatIncreaseConfig
                                            .builder()
                                            .isProrated(true)
                                            .build()
                                    )
                                    .subscriptionId("subscription_id")
                                    .allocation(
                                        V1ContractCreateParams.RecurringCommit.SubscriptionConfig
                                            .Allocation
                                            .INDIVIDUAL
                                    )
                                    .build()
                            )
                            .temporaryId("temporary_id")
                            .build()
                    )
                    .addRecurringCredit(
                        V1ContractCreateParams.RecurringCredit.builder()
                            .accessAmount(
                                V1ContractCreateParams.RecurringCredit.AccessAmount.builder()
                                    .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .unitPrice(0.0)
                                    .quantity(0.0)
                                    .build()
                            )
                            .commitDuration(
                                V1ContractCreateParams.RecurringCredit.CommitDuration.builder()
                                    .value(0.0)
                                    .unit(
                                        V1ContractCreateParams.RecurringCredit.CommitDuration.Unit
                                            .PERIODS
                                    )
                                    .build()
                            )
                            .priority(0.0)
                            .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .addApplicableProductId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .addApplicableProductTag("string")
                            .description("description")
                            .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                            .name("x")
                            .netsuiteSalesOrderId("netsuite_sales_order_id")
                            .proration(V1ContractCreateParams.RecurringCredit.Proration.NONE)
                            .rateType(V1ContractCreateParams.RecurringCredit.RateType.COMMIT_RATE)
                            .recurrenceFrequency(
                                V1ContractCreateParams.RecurringCredit.RecurrenceFrequency.MONTHLY
                            )
                            .rolloverFraction(0.0)
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
                            .subscriptionConfig(
                                V1ContractCreateParams.RecurringCredit.SubscriptionConfig.builder()
                                    .applySeatIncreaseConfig(
                                        V1ContractCreateParams.RecurringCredit.SubscriptionConfig
                                            .ApplySeatIncreaseConfig
                                            .builder()
                                            .isProrated(true)
                                            .build()
                                    )
                                    .subscriptionId("subscription_id")
                                    .allocation(
                                        V1ContractCreateParams.RecurringCredit.SubscriptionConfig
                                            .Allocation
                                            .INDIVIDUAL
                                    )
                                    .build()
                            )
                            .temporaryId("temporary_id")
                            .build()
                    )
                    .addResellerRoyalty(
                        V1ContractCreateParams.ResellerRoyalty.builder()
                            .fraction(0.0)
                            .netsuiteResellerId("netsuite_reseller_id")
                            .resellerType(V1ContractCreateParams.ResellerRoyalty.ResellerType.AWS)
                            .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .addApplicableProductId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .addApplicableProductTag("string")
                            .awsOptions(
                                V1ContractCreateParams.ResellerRoyalty.AwsOptions.builder()
                                    .awsAccountNumber("aws_account_number")
                                    .awsOfferId("aws_offer_id")
                                    .awsPayerReferenceId("aws_payer_reference_id")
                                    .build()
                            )
                            .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .gcpOptions(
                                V1ContractCreateParams.ResellerRoyalty.GcpOptions.builder()
                                    .gcpAccountId("gcp_account_id")
                                    .gcpOfferId("gcp_offer_id")
                                    .build()
                            )
                            .resellerContractValue(0.0)
                            .build()
                    )
                    .revenueSystemConfiguration(
                        V1ContractCreateParams.RevenueSystemConfiguration.builder()
                            .deliveryMethod(
                                V1ContractCreateParams.RevenueSystemConfiguration.DeliveryMethod
                                    .DIRECT_TO_BILLING_PROVIDER
                            )
                            .provider(
                                V1ContractCreateParams.RevenueSystemConfiguration.Provider.NETSUITE
                            )
                            .revenueSystemConfigurationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                    .salesforceOpportunityId("salesforce_opportunity_id")
                    .addScheduledCharge(
                        V1ContractCreateParams.ScheduledCharge.builder()
                            .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .schedule(
                                V1ContractCreateParams.ScheduledCharge.Schedule.builder()
                                    .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .doNotInvoice(true)
                                    .recurringSchedule(
                                        V1ContractCreateParams.ScheduledCharge.Schedule
                                            .RecurringSchedule
                                            .builder()
                                            .amountDistribution(
                                                V1ContractCreateParams.ScheduledCharge.Schedule
                                                    .RecurringSchedule
                                                    .AmountDistribution
                                                    .DIVIDED
                                            )
                                            .endingBefore(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .frequency(
                                                V1ContractCreateParams.ScheduledCharge.Schedule
                                                    .RecurringSchedule
                                                    .Frequency
                                                    .MONTHLY
                                            )
                                            .startingAt(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .amount(0.0)
                                            .quantity(0.0)
                                            .unitPrice(0.0)
                                            .build()
                                    )
                                    .addScheduleItem(
                                        V1ContractCreateParams.ScheduledCharge.Schedule.ScheduleItem
                                            .builder()
                                            .timestamp(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .amount(0.0)
                                            .quantity(0.0)
                                            .unitPrice(0.0)
                                            .build()
                                    )
                                    .build()
                            )
                            .customFields(
                                V1ContractCreateParams.ScheduledCharge.CustomFields.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .name("x")
                            .netsuiteSalesOrderId("netsuite_sales_order_id")
                            .build()
                    )
                    .scheduledChargesOnUsageInvoices(
                        V1ContractCreateParams.ScheduledChargesOnUsageInvoices.ALL
                    )
                    .spendThresholdConfiguration(
                        SpendThresholdConfiguration.builder()
                            .commit(
                                BaseThresholdCommit.builder()
                                    .productId("product_id")
                                    .description("description")
                                    .name("name")
                                    .build()
                            )
                            .isEnabled(true)
                            .paymentGateConfig(
                                PaymentGateConfig.builder()
                                    .paymentGateType(PaymentGateConfig.PaymentGateType.NONE)
                                    .precalculatedTaxConfig(
                                        PaymentGateConfig.PrecalculatedTaxConfig.builder()
                                            .taxAmount(0.0)
                                            .taxName("tax_name")
                                            .build()
                                    )
                                    .stripeConfig(
                                        PaymentGateConfig.StripeConfig.builder()
                                            .paymentType(
                                                PaymentGateConfig.StripeConfig.PaymentType.INVOICE
                                            )
                                            .invoiceMetadata(
                                                PaymentGateConfig.StripeConfig.InvoiceMetadata
                                                    .builder()
                                                    .putAdditionalProperty(
                                                        "foo",
                                                        JsonValue.from("string"),
                                                    )
                                                    .build()
                                            )
                                            .build()
                                    )
                                    .taxType(PaymentGateConfig.TaxType.NONE)
                                    .build()
                            )
                            .thresholdAmount(0.0)
                            .build()
                    )
                    .addSubscription(
                        V1ContractCreateParams.Subscription.builder()
                            .collectionSchedule(
                                V1ContractCreateParams.Subscription.CollectionSchedule.ADVANCE
                            )
                            .proration(
                                V1ContractCreateParams.Subscription.Proration.builder()
                                    .invoiceBehavior(
                                        V1ContractCreateParams.Subscription.Proration
                                            .InvoiceBehavior
                                            .BILL_IMMEDIATELY
                                    )
                                    .isProrated(true)
                                    .build()
                            )
                            .subscriptionRate(
                                V1ContractCreateParams.Subscription.SubscriptionRate.builder()
                                    .billingFrequency(
                                        V1ContractCreateParams.Subscription.SubscriptionRate
                                            .BillingFrequency
                                            .MONTHLY
                                    )
                                    .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .build()
                            )
                            .customFields(
                                V1ContractCreateParams.Subscription.CustomFields.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .description("description")
                            .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .initialQuantity(0.0)
                            .name("name")
                            .quantityManagementMode(
                                V1ContractCreateParams.Subscription.QuantityManagementMode
                                    .SEAT_BASED
                            )
                            .seatConfig(
                                V1ContractCreateParams.Subscription.SeatConfig.builder()
                                    .addInitialSeatId("string")
                                    .seatGroupKey("seat_group_key")
                                    .initialUnassignedSeats(0.0)
                                    .build()
                            )
                            .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .temporaryId("temporary_id")
                            .build()
                    )
                    .totalContractValue(0.0)
                    .transition(
                        V1ContractCreateParams.Transition.builder()
                            .fromContractId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .type(V1ContractCreateParams.Transition.Type.SUPERSEDE)
                            .futureInvoiceBehavior(
                                V1ContractCreateParams.Transition.FutureInvoiceBehavior.builder()
                                    .trueup(
                                        V1ContractCreateParams.Transition.FutureInvoiceBehavior
                                            .Trueup
                                            .REMOVE
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .uniquenessKey("x")
                    .usageFilter(
                        BaseUsageFilter.builder()
                            .groupKey("group_key")
                            .addGroupValue("string")
                            .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .usageStatementSchedule(
                        V1ContractCreateParams.UsageStatementSchedule.builder()
                            .frequency(
                                V1ContractCreateParams.UsageStatementSchedule.Frequency.MONTHLY
                            )
                            .billingAnchorDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .day(V1ContractCreateParams.UsageStatementSchedule.Day.FIRST_OF_MONTH)
                            .invoiceGenerationStartingAt(
                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                            )
                            .build()
                    )
                    .build()
            )

        contract.validate()
    }

    @Test
    fun retrieve() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val contractService = client.v1().contracts()

        val contract =
            contractService.retrieve(
                V1ContractRetrieveParams.builder()
                    .contractId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                    .includeBalance(true)
                    .includeLedgers(true)
                    .build()
            )

        contract.validate()
    }

    @Test
    fun list() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val contractService = client.v1().contracts()

        val contract =
            contractService.list(
                V1ContractListParams.builder()
                    .customerId("9b85c1c1-5238-4f2a-a409-61412905e1e1")
                    .coveringDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .includeArchived(true)
                    .includeBalance(true)
                    .includeLedgers(true)
                    .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        contract.validate()
    }

    @Test
    fun addManualBalanceEntry() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val contractService = client.v1().contracts()

        contractService.addManualBalanceEntry(
            V1ContractAddManualBalanceEntryParams.builder()
                .id("6162d87b-e5db-4a33-b7f2-76ce6ead4e85")
                .amount(-1000.0)
                .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                .reason("Reason for entry")
                .segmentId("66368e29-3f97-4d15-a6e9-120897f0070a")
                .contractId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .perGroupAmounts(
                    V1ContractAddManualBalanceEntryParams.PerGroupAmounts.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        )
    }

    @Test
    fun amend() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val contractService = client.v1().contracts()

        val response =
            contractService.amend(
                V1ContractAmendParams.builder()
                    .contractId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                    .startingAt(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .addCommit(
                        V1ContractAmendParams.Commit.builder()
                            .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .type(V1ContractAmendParams.Commit.Type.PREPAID)
                            .accessSchedule(
                                V1ContractAmendParams.Commit.AccessSchedule.builder()
                                    .addScheduleItem(
                                        V1ContractAmendParams.Commit.AccessSchedule.ScheduleItem
                                            .builder()
                                            .amount(0.0)
                                            .endingBefore(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .startingAt(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .build()
                                    )
                                    .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .build()
                            )
                            .amount(0.0)
                            .addApplicableProductId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .addApplicableProductTag("string")
                            .customFields(
                                V1ContractAmendParams.Commit.CustomFields.builder()
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
                            .invoiceSchedule(
                                V1ContractAmendParams.Commit.InvoiceSchedule.builder()
                                    .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .doNotInvoice(true)
                                    .recurringSchedule(
                                        V1ContractAmendParams.Commit.InvoiceSchedule
                                            .RecurringSchedule
                                            .builder()
                                            .amountDistribution(
                                                V1ContractAmendParams.Commit.InvoiceSchedule
                                                    .RecurringSchedule
                                                    .AmountDistribution
                                                    .DIVIDED
                                            )
                                            .endingBefore(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .frequency(
                                                V1ContractAmendParams.Commit.InvoiceSchedule
                                                    .RecurringSchedule
                                                    .Frequency
                                                    .MONTHLY
                                            )
                                            .startingAt(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .amount(0.0)
                                            .quantity(0.0)
                                            .unitPrice(0.0)
                                            .build()
                                    )
                                    .addScheduleItem(
                                        V1ContractAmendParams.Commit.InvoiceSchedule.ScheduleItem
                                            .builder()
                                            .timestamp(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .amount(0.0)
                                            .quantity(0.0)
                                            .unitPrice(0.0)
                                            .build()
                                    )
                                    .build()
                            )
                            .name("x")
                            .netsuiteSalesOrderId("netsuite_sales_order_id")
                            .paymentGateConfig(
                                V1ContractAmendParams.Commit.PaymentGateConfig.builder()
                                    .paymentGateType(
                                        V1ContractAmendParams.Commit.PaymentGateConfig
                                            .PaymentGateType
                                            .NONE
                                    )
                                    .precalculatedTaxConfig(
                                        V1ContractAmendParams.Commit.PaymentGateConfig
                                            .PrecalculatedTaxConfig
                                            .builder()
                                            .taxAmount(0.0)
                                            .taxName("tax_name")
                                            .build()
                                    )
                                    .stripeConfig(
                                        V1ContractAmendParams.Commit.PaymentGateConfig.StripeConfig
                                            .builder()
                                            .paymentType(
                                                V1ContractAmendParams.Commit.PaymentGateConfig
                                                    .StripeConfig
                                                    .PaymentType
                                                    .INVOICE
                                            )
                                            .invoiceMetadata(
                                                V1ContractAmendParams.Commit.PaymentGateConfig
                                                    .StripeConfig
                                                    .InvoiceMetadata
                                                    .builder()
                                                    .putAdditionalProperty(
                                                        "foo",
                                                        JsonValue.from("string"),
                                                    )
                                                    .build()
                                            )
                                            .onSessionPayment(true)
                                            .build()
                                    )
                                    .taxType(
                                        V1ContractAmendParams.Commit.PaymentGateConfig.TaxType.NONE
                                    )
                                    .build()
                            )
                            .priority(0.0)
                            .rateType(V1ContractAmendParams.Commit.RateType.COMMIT_RATE)
                            .rolloverFraction(0.0)
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
                            .temporaryId("temporary_id")
                            .build()
                    )
                    .addCredit(
                        V1ContractAmendParams.Credit.builder()
                            .accessSchedule(
                                V1ContractAmendParams.Credit.AccessSchedule.builder()
                                    .addScheduleItem(
                                        V1ContractAmendParams.Credit.AccessSchedule.ScheduleItem
                                            .builder()
                                            .amount(0.0)
                                            .endingBefore(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .startingAt(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .build()
                                    )
                                    .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .build()
                            )
                            .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .addApplicableProductId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .addApplicableProductTag("string")
                            .customFields(
                                V1ContractAmendParams.Credit.CustomFields.builder()
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
                            .name("x")
                            .netsuiteSalesOrderId("netsuite_sales_order_id")
                            .priority(0.0)
                            .rateType(V1ContractAmendParams.Credit.RateType.COMMIT_RATE)
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
                    )
                    .customFields(
                        V1ContractAmendParams.CustomFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .addDiscount(
                        V1ContractAmendParams.Discount.builder()
                            .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .schedule(
                                V1ContractAmendParams.Discount.Schedule.builder()
                                    .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .doNotInvoice(true)
                                    .recurringSchedule(
                                        V1ContractAmendParams.Discount.Schedule.RecurringSchedule
                                            .builder()
                                            .amountDistribution(
                                                V1ContractAmendParams.Discount.Schedule
                                                    .RecurringSchedule
                                                    .AmountDistribution
                                                    .DIVIDED
                                            )
                                            .endingBefore(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .frequency(
                                                V1ContractAmendParams.Discount.Schedule
                                                    .RecurringSchedule
                                                    .Frequency
                                                    .MONTHLY
                                            )
                                            .startingAt(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .amount(0.0)
                                            .quantity(0.0)
                                            .unitPrice(0.0)
                                            .build()
                                    )
                                    .addScheduleItem(
                                        V1ContractAmendParams.Discount.Schedule.ScheduleItem
                                            .builder()
                                            .timestamp(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .amount(0.0)
                                            .quantity(0.0)
                                            .unitPrice(0.0)
                                            .build()
                                    )
                                    .build()
                            )
                            .customFields(
                                V1ContractAmendParams.Discount.CustomFields.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .name("x")
                            .netsuiteSalesOrderId("netsuite_sales_order_id")
                            .build()
                    )
                    .netsuiteSalesOrderId("netsuite_sales_order_id")
                    .addOverride(
                        V1ContractAmendParams.Override.builder()
                            .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .addApplicableProductTag("string")
                            .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .entitled(true)
                            .isCommitSpecific(true)
                            .multiplier(0.0)
                            .addOverrideSpecifier(
                                V1ContractAmendParams.Override.OverrideSpecifier.builder()
                                    .billingFrequency(
                                        V1ContractAmendParams.Override.OverrideSpecifier
                                            .BillingFrequency
                                            .MONTHLY
                                    )
                                    .addCommitId("string")
                                    .presentationGroupValues(
                                        V1ContractAmendParams.Override.OverrideSpecifier
                                            .PresentationGroupValues
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .pricingGroupValues(
                                        V1ContractAmendParams.Override.OverrideSpecifier
                                            .PricingGroupValues
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .addProductTag("string")
                                    .addRecurringCommitId("string")
                                    .addRecurringCreditId("string")
                                    .build()
                            )
                            .overwriteRate(
                                V1ContractAmendParams.Override.OverwriteRate.builder()
                                    .rateType(
                                        V1ContractAmendParams.Override.OverwriteRate.RateType.FLAT
                                    )
                                    .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .customRate(
                                        V1ContractAmendParams.Override.OverwriteRate.CustomRate
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .isProrated(true)
                                    .price(0.0)
                                    .quantity(0.0)
                                    .addTier(Tier.builder().price(0.0).size(0.0).build())
                                    .build()
                            )
                            .priority(0.0)
                            .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .target(V1ContractAmendParams.Override.Target.COMMIT_RATE)
                            .addTier(
                                V1ContractAmendParams.Override.Tier.builder()
                                    .multiplier(0.0)
                                    .size(0.0)
                                    .build()
                            )
                            .type(V1ContractAmendParams.Override.Type.OVERWRITE)
                            .build()
                    )
                    .addProfessionalService(
                        V1ContractAmendParams.ProfessionalService.builder()
                            .maxAmount(0.0)
                            .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .quantity(0.0)
                            .unitPrice(0.0)
                            .customFields(
                                V1ContractAmendParams.ProfessionalService.CustomFields.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .description("description")
                            .netsuiteSalesOrderId("netsuite_sales_order_id")
                            .build()
                    )
                    .addResellerRoyalty(
                        V1ContractAmendParams.ResellerRoyalty.builder()
                            .resellerType(V1ContractAmendParams.ResellerRoyalty.ResellerType.AWS)
                            .addApplicableProductId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .addApplicableProductTag("string")
                            .awsOptions(
                                V1ContractAmendParams.ResellerRoyalty.AwsOptions.builder()
                                    .awsAccountNumber("aws_account_number")
                                    .awsOfferId("aws_offer_id")
                                    .awsPayerReferenceId("aws_payer_reference_id")
                                    .build()
                            )
                            .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .fraction(0.0)
                            .gcpOptions(
                                V1ContractAmendParams.ResellerRoyalty.GcpOptions.builder()
                                    .gcpAccountId("gcp_account_id")
                                    .gcpOfferId("gcp_offer_id")
                                    .build()
                            )
                            .netsuiteResellerId("netsuite_reseller_id")
                            .resellerContractValue(0.0)
                            .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .salesforceOpportunityId("salesforce_opportunity_id")
                    .addScheduledCharge(
                        V1ContractAmendParams.ScheduledCharge.builder()
                            .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .schedule(
                                V1ContractAmendParams.ScheduledCharge.Schedule.builder()
                                    .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .doNotInvoice(true)
                                    .recurringSchedule(
                                        V1ContractAmendParams.ScheduledCharge.Schedule
                                            .RecurringSchedule
                                            .builder()
                                            .amountDistribution(
                                                V1ContractAmendParams.ScheduledCharge.Schedule
                                                    .RecurringSchedule
                                                    .AmountDistribution
                                                    .DIVIDED
                                            )
                                            .endingBefore(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .frequency(
                                                V1ContractAmendParams.ScheduledCharge.Schedule
                                                    .RecurringSchedule
                                                    .Frequency
                                                    .MONTHLY
                                            )
                                            .startingAt(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .amount(0.0)
                                            .quantity(0.0)
                                            .unitPrice(0.0)
                                            .build()
                                    )
                                    .addScheduleItem(
                                        V1ContractAmendParams.ScheduledCharge.Schedule.ScheduleItem
                                            .builder()
                                            .timestamp(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .amount(0.0)
                                            .quantity(0.0)
                                            .unitPrice(0.0)
                                            .build()
                                    )
                                    .build()
                            )
                            .customFields(
                                V1ContractAmendParams.ScheduledCharge.CustomFields.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .name("x")
                            .netsuiteSalesOrderId("netsuite_sales_order_id")
                            .build()
                    )
                    .totalContractValue(0.0)
                    .build()
            )

        response.validate()
    }

    @Test
    fun archive() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val contractService = client.v1().contracts()

        val response =
            contractService.archive(
                V1ContractArchiveParams.builder()
                    .contractId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                    .voidInvoices(true)
                    .build()
            )

        response.validate()
    }

    @Test
    fun createHistoricalInvoices() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val contractService = client.v1().contracts()

        val response =
            contractService.createHistoricalInvoices(
                V1ContractCreateHistoricalInvoicesParams.builder()
                    .addInvoice(
                        V1ContractCreateHistoricalInvoicesParams.Invoice.builder()
                            .contractId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                            .creditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                            .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                            .exclusiveEndDate(OffsetDateTime.parse("2020-02-01T00:00:00.000Z"))
                            .inclusiveStartDate(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                            .issueDate(OffsetDateTime.parse("2020-02-01T00:00:00.000Z"))
                            .addUsageLineItem(
                                V1ContractCreateHistoricalInvoicesParams.Invoice.UsageLineItem
                                    .builder()
                                    .exclusiveEndDate(
                                        OffsetDateTime.parse("2020-02-01T00:00:00.000Z")
                                    )
                                    .inclusiveStartDate(
                                        OffsetDateTime.parse("2020-01-01T00:00:00.000Z")
                                    )
                                    .productId("f14d6729-6a44-4b13-9908-9387f1918790")
                                    .presentationGroupValues(
                                        V1ContractCreateHistoricalInvoicesParams.Invoice
                                            .UsageLineItem
                                            .PresentationGroupValues
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .pricingGroupValues(
                                        V1ContractCreateHistoricalInvoicesParams.Invoice
                                            .UsageLineItem
                                            .PricingGroupValues
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .quantity(100.0)
                                    .addSubtotalsWithQuantity(
                                        V1ContractCreateHistoricalInvoicesParams.Invoice
                                            .UsageLineItem
                                            .SubtotalsWithQuantity
                                            .builder()
                                            .exclusiveEndDate(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .inclusiveStartDate(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .quantity(0.0)
                                            .build()
                                    )
                                    .build()
                            )
                            .billableStatus(
                                V1ContractCreateHistoricalInvoicesParams.Invoice.BillableStatus
                                    .BILLABLE
                            )
                            .breakdownGranularity(
                                V1ContractCreateHistoricalInvoicesParams.Invoice
                                    .BreakdownGranularity
                                    .HOUR
                            )
                            .customFields(
                                V1ContractCreateHistoricalInvoicesParams.Invoice.CustomFields
                                    .builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .build()
                    )
                    .preview(false)
                    .build()
            )

        response.validate()
    }

    @Test
    fun getNetBalance() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val contractService = client.v1().contracts()

        val response =
            contractService.getNetBalance(
                V1ContractGetNetBalanceParams.builder()
                    .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                    .creditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                    .addFilter(
                        BalanceFilter.builder()
                            .addBalanceType(BalanceFilter.BalanceType.PREPAID_COMMIT)
                            .customFields(
                                BalanceFilter.CustomFields.builder()
                                    .putAdditionalProperty("campaign", JsonValue.from("free-trial"))
                                    .build()
                            )
                            .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                    .addFilter(
                        BalanceFilter.builder()
                            .addBalanceType(BalanceFilter.BalanceType.PREPAID_COMMIT)
                            .addBalanceType(BalanceFilter.BalanceType.POSTPAID_COMMIT)
                            .customFields(
                                BalanceFilter.CustomFields.builder()
                                    .putAdditionalProperty(
                                        "campaign",
                                        JsonValue.from("signup-promotion"),
                                    )
                                    .build()
                            )
                            .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                    .invoiceInclusionMode(
                        V1ContractGetNetBalanceParams.InvoiceInclusionMode.FINALIZED
                    )
                    .build()
            )

        response.validate()
    }

    @Test
    fun listBalances() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val contractService = client.v1().contracts()

        val page =
            contractService.listBalances(
                V1ContractListBalancesParams.builder()
                    .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                    .build()
            )

        page.response().validate()
    }

    @Test
    fun retrieveRateSchedule() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val contractService = client.v1().contracts()

        val response =
            contractService.retrieveRateSchedule(
                V1ContractRetrieveRateScheduleParams.builder()
                    .limit(1L)
                    .nextPage("next_page")
                    .contractId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                    .at(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .addSelector(
                        V1ContractRetrieveRateScheduleParams.Selector.builder()
                            .billingFrequency(
                                V1ContractRetrieveRateScheduleParams.Selector.BillingFrequency
                                    .MONTHLY
                            )
                            .partialPricingGroupValues(
                                V1ContractRetrieveRateScheduleParams.Selector
                                    .PartialPricingGroupValues
                                    .builder()
                                    .putAdditionalProperty("region", JsonValue.from("us-west-2"))
                                    .putAdditionalProperty("cloud", JsonValue.from("aws"))
                                    .build()
                            )
                            .pricingGroupValues(
                                V1ContractRetrieveRateScheduleParams.Selector.PricingGroupValues
                                    .builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .productId("d6300dbb-882e-4d2d-8dec-5125d16b65d0")
                            .addProductTag("string")
                            .build()
                    )
                    .build()
            )

        response.validate()
    }

    @Test
    fun retrieveSubscriptionQuantityHistory() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val contractService = client.v1().contracts()

        val response =
            contractService.retrieveSubscriptionQuantityHistory(
                V1ContractRetrieveSubscriptionQuantityHistoryParams.builder()
                    .contractId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                    .subscriptionId("1a824d53-bde6-4d82-96d7-6347ff227d5c")
                    .build()
            )

        response.validate()
    }

    @Test
    fun scheduleProServicesInvoice() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val contractService = client.v1().contracts()

        val response =
            contractService.scheduleProServicesInvoice(
                V1ContractScheduleProServicesInvoiceParams.builder()
                    .contractId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .issuedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addLineItem(
                        V1ContractScheduleProServicesInvoiceParams.LineItem.builder()
                            .professionalServiceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .amendmentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .amount(0.0)
                            .metadata("metadata")
                            .netsuiteInvoiceBillingEnd(
                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                            )
                            .netsuiteInvoiceBillingStart(
                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                            )
                            .quantity(0.0)
                            .unitPrice(0.0)
                            .build()
                    )
                    .netsuiteInvoiceHeaderEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .netsuiteInvoiceHeaderStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        response.validate()
    }

    @Test
    fun setUsageFilter() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val contractService = client.v1().contracts()

        contractService.setUsageFilter(
            V1ContractSetUsageFilterParams.builder()
                .contractId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                .groupKey("business_subscription_id")
                .addGroupValue("ID-1")
                .addGroupValue("ID-2")
                .startingAt(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                .build()
        )
    }

    @Test
    fun updateEndDate() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val contractService = client.v1().contracts()

        val response =
            contractService.updateEndDate(
                V1ContractUpdateEndDateParams.builder()
                    .contractId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                    .allowEndingBeforeFinalizedInvoice(true)
                    .endingBefore(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build()
            )

        response.validate()
    }
}
