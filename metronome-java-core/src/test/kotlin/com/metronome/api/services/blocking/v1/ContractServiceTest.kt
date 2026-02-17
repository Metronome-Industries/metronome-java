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
import com.metronome.api.models.v1.contracts.ContractAddManualBalanceEntryParams
import com.metronome.api.models.v1.contracts.ContractAmendParams
import com.metronome.api.models.v1.contracts.ContractArchiveParams
import com.metronome.api.models.v1.contracts.ContractCreateHistoricalInvoicesParams
import com.metronome.api.models.v1.contracts.ContractCreateParams
import com.metronome.api.models.v1.contracts.ContractGetNetBalanceParams
import com.metronome.api.models.v1.contracts.ContractListBalancesParams
import com.metronome.api.models.v1.contracts.ContractListParams
import com.metronome.api.models.v1.contracts.ContractRetrieveParams
import com.metronome.api.models.v1.contracts.ContractRetrieveRateScheduleParams
import com.metronome.api.models.v1.contracts.ContractRetrieveSubscriptionQuantityHistoryParams
import com.metronome.api.models.v1.contracts.ContractScheduleProServicesInvoiceParams
import com.metronome.api.models.v1.contracts.ContractSetUsageFilterParams
import com.metronome.api.models.v1.contracts.ContractUpdateEndDateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ContractServiceTest {

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
                ContractCreateParams.builder()
                    .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                    .startingAt(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .billingProviderConfiguration(
                        ContractCreateParams.BillingProviderConfiguration.builder()
                            .billingProvider(
                                ContractCreateParams.BillingProviderConfiguration.BillingProvider
                                    .STRIPE
                            )
                            .billingProviderConfigurationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .deliveryMethod(
                                ContractCreateParams.BillingProviderConfiguration.DeliveryMethod
                                    .DIRECT_TO_BILLING_PROVIDER
                            )
                            .build()
                    )
                    .addCommit(
                        ContractCreateParams.Commit.builder()
                            .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .type(ContractCreateParams.Commit.Type.PREPAID)
                            .accessSchedule(
                                ContractCreateParams.Commit.AccessSchedule.builder()
                                    .addScheduleItem(
                                        ContractCreateParams.Commit.AccessSchedule.ScheduleItem
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
                                ContractCreateParams.Commit.CustomFields.builder()
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
                                ContractCreateParams.Commit.InvoiceSchedule.builder()
                                    .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .doNotInvoice(true)
                                    .recurringSchedule(
                                        ContractCreateParams.Commit.InvoiceSchedule
                                            .RecurringSchedule
                                            .builder()
                                            .amountDistribution(
                                                ContractCreateParams.Commit.InvoiceSchedule
                                                    .RecurringSchedule
                                                    .AmountDistribution
                                                    .DIVIDED
                                            )
                                            .endingBefore(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .frequency(
                                                ContractCreateParams.Commit.InvoiceSchedule
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
                                        ContractCreateParams.Commit.InvoiceSchedule.ScheduleItem
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
                                ContractCreateParams.Commit.PaymentGateConfig.builder()
                                    .paymentGateType(
                                        ContractCreateParams.Commit.PaymentGateConfig
                                            .PaymentGateType
                                            .NONE
                                    )
                                    .precalculatedTaxConfig(
                                        ContractCreateParams.Commit.PaymentGateConfig
                                            .PrecalculatedTaxConfig
                                            .builder()
                                            .taxAmount(0.0)
                                            .taxName("tax_name")
                                            .build()
                                    )
                                    .stripeConfig(
                                        ContractCreateParams.Commit.PaymentGateConfig.StripeConfig
                                            .builder()
                                            .paymentType(
                                                ContractCreateParams.Commit.PaymentGateConfig
                                                    .StripeConfig
                                                    .PaymentType
                                                    .INVOICE
                                            )
                                            .invoiceMetadata(
                                                ContractCreateParams.Commit.PaymentGateConfig
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
                                        ContractCreateParams.Commit.PaymentGateConfig.TaxType.NONE
                                    )
                                    .build()
                            )
                            .priority(0.0)
                            .rateType(ContractCreateParams.Commit.RateType.COMMIT_RATE)
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
                        ContractCreateParams.Credit.builder()
                            .accessSchedule(
                                ContractCreateParams.Credit.AccessSchedule.builder()
                                    .addScheduleItem(
                                        ContractCreateParams.Credit.AccessSchedule.ScheduleItem
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
                                ContractCreateParams.Credit.CustomFields.builder()
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
                            .rateType(ContractCreateParams.Credit.RateType.COMMIT_RATE)
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
                        ContractCreateParams.CustomFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .addDiscount(
                        ContractCreateParams.Discount.builder()
                            .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .schedule(
                                ContractCreateParams.Discount.Schedule.builder()
                                    .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .doNotInvoice(true)
                                    .recurringSchedule(
                                        ContractCreateParams.Discount.Schedule.RecurringSchedule
                                            .builder()
                                            .amountDistribution(
                                                ContractCreateParams.Discount.Schedule
                                                    .RecurringSchedule
                                                    .AmountDistribution
                                                    .DIVIDED
                                            )
                                            .endingBefore(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .frequency(
                                                ContractCreateParams.Discount.Schedule
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
                                        ContractCreateParams.Discount.Schedule.ScheduleItem
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
                                ContractCreateParams.Discount.CustomFields.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .name("x")
                            .netsuiteSalesOrderId("netsuite_sales_order_id")
                            .build()
                    )
                    .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .hierarchyConfiguration(
                        ContractCreateParams.HierarchyConfiguration.builder()
                            .parent(
                                ContractCreateParams.HierarchyConfiguration.Parent.builder()
                                    .contractId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .build()
                            )
                            .parentBehavior(
                                ContractCreateParams.HierarchyConfiguration.ParentBehavior.builder()
                                    .invoiceConsolidationType(
                                        ContractCreateParams.HierarchyConfiguration.ParentBehavior
                                            .InvoiceConsolidationType
                                            .CONCATENATE
                                    )
                                    .build()
                            )
                            .payer(ContractCreateParams.HierarchyConfiguration.Payer.SELF)
                            .usageStatementBehavior(
                                ContractCreateParams.HierarchyConfiguration.UsageStatementBehavior
                                    .CONSOLIDATE
                            )
                            .build()
                    )
                    .multiplierOverridePrioritization(
                        ContractCreateParams.MultiplierOverridePrioritization.LOWEST_MULTIPLIER
                    )
                    .name("name")
                    .netPaymentTermsDays(0.0)
                    .netsuiteSalesOrderId("netsuite_sales_order_id")
                    .addOverride(
                        ContractCreateParams.Override.builder()
                            .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .addApplicableProductTag("string")
                            .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .entitled(true)
                            .isCommitSpecific(true)
                            .multiplier(0.0)
                            .addOverrideSpecifier(
                                ContractCreateParams.Override.OverrideSpecifier.builder()
                                    .billingFrequency(
                                        ContractCreateParams.Override.OverrideSpecifier
                                            .BillingFrequency
                                            .MONTHLY
                                    )
                                    .addCommitId("string")
                                    .presentationGroupValues(
                                        ContractCreateParams.Override.OverrideSpecifier
                                            .PresentationGroupValues
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .pricingGroupValues(
                                        ContractCreateParams.Override.OverrideSpecifier
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
                                ContractCreateParams.Override.OverwriteRate.builder()
                                    .rateType(
                                        ContractCreateParams.Override.OverwriteRate.RateType.FLAT
                                    )
                                    .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .customRate(
                                        ContractCreateParams.Override.OverwriteRate.CustomRate
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
                            .target(ContractCreateParams.Override.Target.COMMIT_RATE)
                            .addTier(
                                ContractCreateParams.Override.Tier.builder()
                                    .multiplier(0.0)
                                    .size(0.0)
                                    .build()
                            )
                            .type(ContractCreateParams.Override.Type.OVERWRITE)
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
                        ContractCreateParams.ProfessionalService.builder()
                            .maxAmount(0.0)
                            .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .quantity(0.0)
                            .unitPrice(0.0)
                            .customFields(
                                ContractCreateParams.ProfessionalService.CustomFields.builder()
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
                        ContractCreateParams.RecurringCommit.builder()
                            .accessAmount(
                                ContractCreateParams.RecurringCommit.AccessAmount.builder()
                                    .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .unitPrice(0.0)
                                    .quantity(0.0)
                                    .build()
                            )
                            .commitDuration(
                                ContractCreateParams.RecurringCommit.CommitDuration.builder()
                                    .value(0.0)
                                    .unit(
                                        ContractCreateParams.RecurringCommit.CommitDuration.Unit
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
                                ContractCreateParams.RecurringCommit.InvoiceAmount.builder()
                                    .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .quantity(0.0)
                                    .unitPrice(0.0)
                                    .build()
                            )
                            .name("x")
                            .netsuiteSalesOrderId("netsuite_sales_order_id")
                            .proration(ContractCreateParams.RecurringCommit.Proration.NONE)
                            .rateType(ContractCreateParams.RecurringCommit.RateType.COMMIT_RATE)
                            .recurrenceFrequency(
                                ContractCreateParams.RecurringCommit.RecurrenceFrequency.MONTHLY
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
                                ContractCreateParams.RecurringCommit.SubscriptionConfig.builder()
                                    .applySeatIncreaseConfig(
                                        ContractCreateParams.RecurringCommit.SubscriptionConfig
                                            .ApplySeatIncreaseConfig
                                            .builder()
                                            .isProrated(true)
                                            .build()
                                    )
                                    .subscriptionId("subscription_id")
                                    .allocation(
                                        ContractCreateParams.RecurringCommit.SubscriptionConfig
                                            .Allocation
                                            .INDIVIDUAL
                                    )
                                    .build()
                            )
                            .temporaryId("temporary_id")
                            .build()
                    )
                    .addRecurringCredit(
                        ContractCreateParams.RecurringCredit.builder()
                            .accessAmount(
                                ContractCreateParams.RecurringCredit.AccessAmount.builder()
                                    .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .unitPrice(0.0)
                                    .quantity(0.0)
                                    .build()
                            )
                            .commitDuration(
                                ContractCreateParams.RecurringCredit.CommitDuration.builder()
                                    .value(0.0)
                                    .unit(
                                        ContractCreateParams.RecurringCredit.CommitDuration.Unit
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
                            .proration(ContractCreateParams.RecurringCredit.Proration.NONE)
                            .rateType(ContractCreateParams.RecurringCredit.RateType.COMMIT_RATE)
                            .recurrenceFrequency(
                                ContractCreateParams.RecurringCredit.RecurrenceFrequency.MONTHLY
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
                                ContractCreateParams.RecurringCredit.SubscriptionConfig.builder()
                                    .applySeatIncreaseConfig(
                                        ContractCreateParams.RecurringCredit.SubscriptionConfig
                                            .ApplySeatIncreaseConfig
                                            .builder()
                                            .isProrated(true)
                                            .build()
                                    )
                                    .subscriptionId("subscription_id")
                                    .allocation(
                                        ContractCreateParams.RecurringCredit.SubscriptionConfig
                                            .Allocation
                                            .INDIVIDUAL
                                    )
                                    .build()
                            )
                            .temporaryId("temporary_id")
                            .build()
                    )
                    .addResellerRoyalty(
                        ContractCreateParams.ResellerRoyalty.builder()
                            .fraction(0.0)
                            .netsuiteResellerId("netsuite_reseller_id")
                            .resellerType(ContractCreateParams.ResellerRoyalty.ResellerType.AWS)
                            .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .addApplicableProductId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .addApplicableProductTag("string")
                            .awsOptions(
                                ContractCreateParams.ResellerRoyalty.AwsOptions.builder()
                                    .awsAccountNumber("aws_account_number")
                                    .awsOfferId("aws_offer_id")
                                    .awsPayerReferenceId("aws_payer_reference_id")
                                    .build()
                            )
                            .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .gcpOptions(
                                ContractCreateParams.ResellerRoyalty.GcpOptions.builder()
                                    .gcpAccountId("gcp_account_id")
                                    .gcpOfferId("gcp_offer_id")
                                    .build()
                            )
                            .resellerContractValue(0.0)
                            .build()
                    )
                    .revenueSystemConfiguration(
                        ContractCreateParams.RevenueSystemConfiguration.builder()
                            .deliveryMethod(
                                ContractCreateParams.RevenueSystemConfiguration.DeliveryMethod
                                    .DIRECT_TO_BILLING_PROVIDER
                            )
                            .provider(
                                ContractCreateParams.RevenueSystemConfiguration.Provider.NETSUITE
                            )
                            .revenueSystemConfigurationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                    .salesforceOpportunityId("salesforce_opportunity_id")
                    .addScheduledCharge(
                        ContractCreateParams.ScheduledCharge.builder()
                            .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .schedule(
                                ContractCreateParams.ScheduledCharge.Schedule.builder()
                                    .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .doNotInvoice(true)
                                    .recurringSchedule(
                                        ContractCreateParams.ScheduledCharge.Schedule
                                            .RecurringSchedule
                                            .builder()
                                            .amountDistribution(
                                                ContractCreateParams.ScheduledCharge.Schedule
                                                    .RecurringSchedule
                                                    .AmountDistribution
                                                    .DIVIDED
                                            )
                                            .endingBefore(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .frequency(
                                                ContractCreateParams.ScheduledCharge.Schedule
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
                                        ContractCreateParams.ScheduledCharge.Schedule.ScheduleItem
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
                                ContractCreateParams.ScheduledCharge.CustomFields.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .name("x")
                            .netsuiteSalesOrderId("netsuite_sales_order_id")
                            .build()
                    )
                    .scheduledChargesOnUsageInvoices(
                        ContractCreateParams.ScheduledChargesOnUsageInvoices.ALL
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
                        ContractCreateParams.Subscription.builder()
                            .collectionSchedule(
                                ContractCreateParams.Subscription.CollectionSchedule.ADVANCE
                            )
                            .proration(
                                ContractCreateParams.Subscription.Proration.builder()
                                    .invoiceBehavior(
                                        ContractCreateParams.Subscription.Proration.InvoiceBehavior
                                            .BILL_IMMEDIATELY
                                    )
                                    .isProrated(true)
                                    .build()
                            )
                            .subscriptionRate(
                                ContractCreateParams.Subscription.SubscriptionRate.builder()
                                    .billingFrequency(
                                        ContractCreateParams.Subscription.SubscriptionRate
                                            .BillingFrequency
                                            .MONTHLY
                                    )
                                    .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .build()
                            )
                            .customFields(
                                ContractCreateParams.Subscription.CustomFields.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .description("description")
                            .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .initialQuantity(0.0)
                            .name("name")
                            .quantityManagementMode(
                                ContractCreateParams.Subscription.QuantityManagementMode.SEAT_BASED
                            )
                            .seatConfig(
                                ContractCreateParams.Subscription.SeatConfig.builder()
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
                        ContractCreateParams.Transition.builder()
                            .fromContractId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .type(ContractCreateParams.Transition.Type.SUPERSEDE)
                            .futureInvoiceBehavior(
                                ContractCreateParams.Transition.FutureInvoiceBehavior.builder()
                                    .trueup(
                                        ContractCreateParams.Transition.FutureInvoiceBehavior.Trueup
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
                        ContractCreateParams.UsageStatementSchedule.builder()
                            .frequency(
                                ContractCreateParams.UsageStatementSchedule.Frequency.MONTHLY
                            )
                            .billingAnchorDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .day(ContractCreateParams.UsageStatementSchedule.Day.FIRST_OF_MONTH)
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
                ContractRetrieveParams.builder()
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

        val contracts =
            contractService.list(
                ContractListParams.builder()
                    .customerId("9b85c1c1-5238-4f2a-a409-61412905e1e1")
                    .coveringDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .includeArchived(true)
                    .includeBalance(true)
                    .includeLedgers(true)
                    .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        contracts.validate()
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
            ContractAddManualBalanceEntryParams.builder()
                .id("6162d87b-e5db-4a33-b7f2-76ce6ead4e85")
                .amount(-1000.0)
                .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                .reason("Reason for entry")
                .segmentId("66368e29-3f97-4d15-a6e9-120897f0070a")
                .contractId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .perGroupAmounts(
                    ContractAddManualBalanceEntryParams.PerGroupAmounts.builder()
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
                ContractAmendParams.builder()
                    .contractId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                    .startingAt(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .addCommit(
                        ContractAmendParams.Commit.builder()
                            .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .type(ContractAmendParams.Commit.Type.PREPAID)
                            .accessSchedule(
                                ContractAmendParams.Commit.AccessSchedule.builder()
                                    .addScheduleItem(
                                        ContractAmendParams.Commit.AccessSchedule.ScheduleItem
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
                                ContractAmendParams.Commit.CustomFields.builder()
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
                                ContractAmendParams.Commit.InvoiceSchedule.builder()
                                    .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .doNotInvoice(true)
                                    .recurringSchedule(
                                        ContractAmendParams.Commit.InvoiceSchedule.RecurringSchedule
                                            .builder()
                                            .amountDistribution(
                                                ContractAmendParams.Commit.InvoiceSchedule
                                                    .RecurringSchedule
                                                    .AmountDistribution
                                                    .DIVIDED
                                            )
                                            .endingBefore(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .frequency(
                                                ContractAmendParams.Commit.InvoiceSchedule
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
                                        ContractAmendParams.Commit.InvoiceSchedule.ScheduleItem
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
                                ContractAmendParams.Commit.PaymentGateConfig.builder()
                                    .paymentGateType(
                                        ContractAmendParams.Commit.PaymentGateConfig.PaymentGateType
                                            .NONE
                                    )
                                    .precalculatedTaxConfig(
                                        ContractAmendParams.Commit.PaymentGateConfig
                                            .PrecalculatedTaxConfig
                                            .builder()
                                            .taxAmount(0.0)
                                            .taxName("tax_name")
                                            .build()
                                    )
                                    .stripeConfig(
                                        ContractAmendParams.Commit.PaymentGateConfig.StripeConfig
                                            .builder()
                                            .paymentType(
                                                ContractAmendParams.Commit.PaymentGateConfig
                                                    .StripeConfig
                                                    .PaymentType
                                                    .INVOICE
                                            )
                                            .invoiceMetadata(
                                                ContractAmendParams.Commit.PaymentGateConfig
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
                                        ContractAmendParams.Commit.PaymentGateConfig.TaxType.NONE
                                    )
                                    .build()
                            )
                            .priority(0.0)
                            .rateType(ContractAmendParams.Commit.RateType.COMMIT_RATE)
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
                        ContractAmendParams.Credit.builder()
                            .accessSchedule(
                                ContractAmendParams.Credit.AccessSchedule.builder()
                                    .addScheduleItem(
                                        ContractAmendParams.Credit.AccessSchedule.ScheduleItem
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
                                ContractAmendParams.Credit.CustomFields.builder()
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
                            .rateType(ContractAmendParams.Credit.RateType.COMMIT_RATE)
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
                        ContractAmendParams.CustomFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .addDiscount(
                        ContractAmendParams.Discount.builder()
                            .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .schedule(
                                ContractAmendParams.Discount.Schedule.builder()
                                    .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .doNotInvoice(true)
                                    .recurringSchedule(
                                        ContractAmendParams.Discount.Schedule.RecurringSchedule
                                            .builder()
                                            .amountDistribution(
                                                ContractAmendParams.Discount.Schedule
                                                    .RecurringSchedule
                                                    .AmountDistribution
                                                    .DIVIDED
                                            )
                                            .endingBefore(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .frequency(
                                                ContractAmendParams.Discount.Schedule
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
                                        ContractAmendParams.Discount.Schedule.ScheduleItem.builder()
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
                                ContractAmendParams.Discount.CustomFields.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .name("x")
                            .netsuiteSalesOrderId("netsuite_sales_order_id")
                            .build()
                    )
                    .netsuiteSalesOrderId("netsuite_sales_order_id")
                    .addOverride(
                        ContractAmendParams.Override.builder()
                            .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .addApplicableProductTag("string")
                            .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .entitled(true)
                            .isCommitSpecific(true)
                            .multiplier(0.0)
                            .addOverrideSpecifier(
                                ContractAmendParams.Override.OverrideSpecifier.builder()
                                    .billingFrequency(
                                        ContractAmendParams.Override.OverrideSpecifier
                                            .BillingFrequency
                                            .MONTHLY
                                    )
                                    .addCommitId("string")
                                    .presentationGroupValues(
                                        ContractAmendParams.Override.OverrideSpecifier
                                            .PresentationGroupValues
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .pricingGroupValues(
                                        ContractAmendParams.Override.OverrideSpecifier
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
                                ContractAmendParams.Override.OverwriteRate.builder()
                                    .rateType(
                                        ContractAmendParams.Override.OverwriteRate.RateType.FLAT
                                    )
                                    .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .customRate(
                                        ContractAmendParams.Override.OverwriteRate.CustomRate
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
                            .target(ContractAmendParams.Override.Target.COMMIT_RATE)
                            .addTier(
                                ContractAmendParams.Override.Tier.builder()
                                    .multiplier(0.0)
                                    .size(0.0)
                                    .build()
                            )
                            .type(ContractAmendParams.Override.Type.OVERWRITE)
                            .build()
                    )
                    .addProfessionalService(
                        ContractAmendParams.ProfessionalService.builder()
                            .maxAmount(0.0)
                            .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .quantity(0.0)
                            .unitPrice(0.0)
                            .customFields(
                                ContractAmendParams.ProfessionalService.CustomFields.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .description("description")
                            .netsuiteSalesOrderId("netsuite_sales_order_id")
                            .build()
                    )
                    .addResellerRoyalty(
                        ContractAmendParams.ResellerRoyalty.builder()
                            .resellerType(ContractAmendParams.ResellerRoyalty.ResellerType.AWS)
                            .addApplicableProductId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .addApplicableProductTag("string")
                            .awsOptions(
                                ContractAmendParams.ResellerRoyalty.AwsOptions.builder()
                                    .awsAccountNumber("aws_account_number")
                                    .awsOfferId("aws_offer_id")
                                    .awsPayerReferenceId("aws_payer_reference_id")
                                    .build()
                            )
                            .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .fraction(0.0)
                            .gcpOptions(
                                ContractAmendParams.ResellerRoyalty.GcpOptions.builder()
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
                        ContractAmendParams.ScheduledCharge.builder()
                            .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .schedule(
                                ContractAmendParams.ScheduledCharge.Schedule.builder()
                                    .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .doNotInvoice(true)
                                    .recurringSchedule(
                                        ContractAmendParams.ScheduledCharge.Schedule
                                            .RecurringSchedule
                                            .builder()
                                            .amountDistribution(
                                                ContractAmendParams.ScheduledCharge.Schedule
                                                    .RecurringSchedule
                                                    .AmountDistribution
                                                    .DIVIDED
                                            )
                                            .endingBefore(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .frequency(
                                                ContractAmendParams.ScheduledCharge.Schedule
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
                                        ContractAmendParams.ScheduledCharge.Schedule.ScheduleItem
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
                                ContractAmendParams.ScheduledCharge.CustomFields.builder()
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
                ContractArchiveParams.builder()
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
                ContractCreateHistoricalInvoicesParams.builder()
                    .addInvoice(
                        ContractCreateHistoricalInvoicesParams.Invoice.builder()
                            .contractId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                            .creditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                            .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                            .exclusiveEndDate(OffsetDateTime.parse("2020-02-01T00:00:00.000Z"))
                            .inclusiveStartDate(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                            .issueDate(OffsetDateTime.parse("2020-02-01T00:00:00.000Z"))
                            .addUsageLineItem(
                                ContractCreateHistoricalInvoicesParams.Invoice.UsageLineItem
                                    .builder()
                                    .exclusiveEndDate(
                                        OffsetDateTime.parse("2020-02-01T00:00:00.000Z")
                                    )
                                    .inclusiveStartDate(
                                        OffsetDateTime.parse("2020-01-01T00:00:00.000Z")
                                    )
                                    .productId("f14d6729-6a44-4b13-9908-9387f1918790")
                                    .presentationGroupValues(
                                        ContractCreateHistoricalInvoicesParams.Invoice.UsageLineItem
                                            .PresentationGroupValues
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .pricingGroupValues(
                                        ContractCreateHistoricalInvoicesParams.Invoice.UsageLineItem
                                            .PricingGroupValues
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .quantity(100.0)
                                    .addSubtotalsWithQuantity(
                                        ContractCreateHistoricalInvoicesParams.Invoice.UsageLineItem
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
                                ContractCreateHistoricalInvoicesParams.Invoice.BillableStatus
                                    .BILLABLE
                            )
                            .breakdownGranularity(
                                ContractCreateHistoricalInvoicesParams.Invoice.BreakdownGranularity
                                    .HOUR
                            )
                            .customFields(
                                ContractCreateHistoricalInvoicesParams.Invoice.CustomFields
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
                ContractGetNetBalanceParams.builder()
                    .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                    .creditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                    .addFilter(
                        BalanceFilter.builder()
                            .addBalanceType(BalanceFilter.BalanceType.CREDIT)
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
                        ContractGetNetBalanceParams.InvoiceInclusionMode.FINALIZED
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
                ContractListBalancesParams.builder()
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
                ContractRetrieveRateScheduleParams.builder()
                    .limit(1L)
                    .nextPage("next_page")
                    .contractId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                    .at(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .addSelector(
                        ContractRetrieveRateScheduleParams.Selector.builder()
                            .billingFrequency(
                                ContractRetrieveRateScheduleParams.Selector.BillingFrequency.MONTHLY
                            )
                            .partialPricingGroupValues(
                                ContractRetrieveRateScheduleParams.Selector
                                    .PartialPricingGroupValues
                                    .builder()
                                    .putAdditionalProperty("region", JsonValue.from("us-west-2"))
                                    .putAdditionalProperty("cloud", JsonValue.from("aws"))
                                    .build()
                            )
                            .pricingGroupValues(
                                ContractRetrieveRateScheduleParams.Selector.PricingGroupValues
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
                ContractRetrieveSubscriptionQuantityHistoryParams.builder()
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
                ContractScheduleProServicesInvoiceParams.builder()
                    .contractId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .issuedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addLineItem(
                        ContractScheduleProServicesInvoiceParams.LineItem.builder()
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
            ContractSetUsageFilterParams.builder()
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
                ContractUpdateEndDateParams.builder()
                    .contractId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                    .allowEndingBeforeFinalizedInvoice(true)
                    .endingBefore(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build()
            )

        response.validate()
    }
}
