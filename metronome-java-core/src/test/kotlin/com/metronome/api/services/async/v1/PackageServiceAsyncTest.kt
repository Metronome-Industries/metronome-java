// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v1

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClientAsync
import com.metronome.api.core.JsonValue
import com.metronome.api.models.BaseThresholdCommit
import com.metronome.api.models.CommitSpecifierInput
import com.metronome.api.models.PaymentGateConfig
import com.metronome.api.models.PrepaidBalanceThresholdConfiguration
import com.metronome.api.models.SpendThresholdConfiguration
import com.metronome.api.models.Tier
import com.metronome.api.models.v1.packages.PackageArchiveParams
import com.metronome.api.models.v1.packages.PackageCreateParams
import com.metronome.api.models.v1.packages.PackageListContractsOnPackageParams
import com.metronome.api.models.v1.packages.PackageRetrieveParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PackageServiceAsyncTest {

    @Test
    fun create() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val packageServiceAsync = client.v1().packages()

        val packageFuture =
            packageServiceAsync.create(
                PackageCreateParams.builder()
                    .name("My package")
                    .addAlias(
                        PackageCreateParams.Alias.builder()
                            .name("name")
                            .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .billingProvider(PackageCreateParams.BillingProvider.STRIPE)
                    .addCommit(
                        PackageCreateParams.Commit.builder()
                            .accessSchedule(
                                PackageCreateParams.Commit.AccessSchedule.builder()
                                    .addScheduleItem(
                                        PackageCreateParams.Commit.AccessSchedule.ScheduleItem
                                            .builder()
                                            .amount(0.0)
                                            .duration(
                                                PackageCreateParams.Commit.AccessSchedule
                                                    .ScheduleItem
                                                    .Duration
                                                    .builder()
                                                    .unit(
                                                        PackageCreateParams.Commit.AccessSchedule
                                                            .ScheduleItem
                                                            .Duration
                                                            .Unit
                                                            .DAYS
                                                    )
                                                    .value(0L)
                                                    .build()
                                            )
                                            .startingAtOffset(
                                                PackageCreateParams.Commit.AccessSchedule
                                                    .ScheduleItem
                                                    .StartingAtOffset
                                                    .builder()
                                                    .unit(
                                                        PackageCreateParams.Commit.AccessSchedule
                                                            .ScheduleItem
                                                            .StartingAtOffset
                                                            .Unit
                                                            .DAYS
                                                    )
                                                    .value(0L)
                                                    .build()
                                            )
                                            .build()
                                    )
                                    .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .build()
                            )
                            .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .type(PackageCreateParams.Commit.Type.PREPAID)
                            .addApplicableProductId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .addApplicableProductTag("string")
                            .customFields(
                                PackageCreateParams.Commit.CustomFields.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .description("description")
                            .invoiceSchedule(
                                PackageCreateParams.Commit.InvoiceSchedule.builder()
                                    .addScheduleItem(
                                        PackageCreateParams.Commit.InvoiceSchedule.ScheduleItem
                                            .builder()
                                            .dateOffset(
                                                PackageCreateParams.Commit.InvoiceSchedule
                                                    .ScheduleItem
                                                    .DateOffset
                                                    .builder()
                                                    .unit(
                                                        PackageCreateParams.Commit.InvoiceSchedule
                                                            .ScheduleItem
                                                            .DateOffset
                                                            .Unit
                                                            .DAYS
                                                    )
                                                    .value(0L)
                                                    .build()
                                            )
                                            .quantity(0.0)
                                            .unitPrice(0.0)
                                            .build()
                                    )
                                    .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .doNotInvoice(true)
                                    .build()
                            )
                            .name("x")
                            .priority(0.0)
                            .rateType(PackageCreateParams.Commit.RateType.COMMIT_RATE)
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
                    .contractName("contract_name")
                    .addCredit(
                        PackageCreateParams.Credit.builder()
                            .accessSchedule(
                                PackageCreateParams.Credit.AccessSchedule.builder()
                                    .addScheduleItem(
                                        PackageCreateParams.Credit.AccessSchedule.ScheduleItem
                                            .builder()
                                            .amount(0.0)
                                            .duration(
                                                PackageCreateParams.Credit.AccessSchedule
                                                    .ScheduleItem
                                                    .Duration
                                                    .builder()
                                                    .unit(
                                                        PackageCreateParams.Credit.AccessSchedule
                                                            .ScheduleItem
                                                            .Duration
                                                            .Unit
                                                            .DAYS
                                                    )
                                                    .value(0L)
                                                    .build()
                                            )
                                            .startingAtOffset(
                                                PackageCreateParams.Credit.AccessSchedule
                                                    .ScheduleItem
                                                    .StartingAtOffset
                                                    .builder()
                                                    .unit(
                                                        PackageCreateParams.Credit.AccessSchedule
                                                            .ScheduleItem
                                                            .StartingAtOffset
                                                            .Unit
                                                            .DAYS
                                                    )
                                                    .value(0L)
                                                    .build()
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
                                PackageCreateParams.Credit.CustomFields.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .description("description")
                            .name("x")
                            .priority(0.0)
                            .rateType(PackageCreateParams.Credit.RateType.COMMIT_RATE)
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
                    .deliveryMethod(PackageCreateParams.DeliveryMethod.DIRECT_TO_BILLING_PROVIDER)
                    .duration(
                        PackageCreateParams.Duration.builder()
                            .unit(PackageCreateParams.Duration.Unit.DAYS)
                            .value(0L)
                            .build()
                    )
                    .multiplierOverridePrioritization(
                        PackageCreateParams.MultiplierOverridePrioritization.LOWEST_MULTIPLIER
                    )
                    .netPaymentTermsDays(0.0)
                    .addOverride(
                        PackageCreateParams.Override.builder()
                            .addOverrideSpecifier(
                                PackageCreateParams.Override.OverrideSpecifier.builder()
                                    .billingFrequency(
                                        PackageCreateParams.Override.OverrideSpecifier
                                            .BillingFrequency
                                            .MONTHLY
                                    )
                                    .addCommitId("string")
                                    .presentationGroupValues(
                                        PackageCreateParams.Override.OverrideSpecifier
                                            .PresentationGroupValues
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .pricingGroupValues(
                                        PackageCreateParams.Override.OverrideSpecifier
                                            .PricingGroupValues
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .addProductTag("string")
                                    .addRecurringCommitId("string")
                                    .build()
                            )
                            .startingAtOffset(
                                PackageCreateParams.Override.StartingAtOffset.builder()
                                    .unit(PackageCreateParams.Override.StartingAtOffset.Unit.DAYS)
                                    .value(0L)
                                    .build()
                            )
                            .duration(
                                PackageCreateParams.Override.Duration.builder()
                                    .unit(PackageCreateParams.Override.Duration.Unit.DAYS)
                                    .value(0L)
                                    .build()
                            )
                            .entitled(true)
                            .isCommitSpecific(true)
                            .multiplier(0.0)
                            .overwriteRate(
                                PackageCreateParams.Override.OverwriteRate.builder()
                                    .rateType(
                                        PackageCreateParams.Override.OverwriteRate.RateType.FLAT
                                    )
                                    .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .customRate(
                                        PackageCreateParams.Override.OverwriteRate.CustomRate
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
                            .target(PackageCreateParams.Override.Target.COMMIT_RATE)
                            .addTier(
                                PackageCreateParams.Override.Tier.builder()
                                    .multiplier(0.0)
                                    .size(0.0)
                                    .build()
                            )
                            .type(PackageCreateParams.Override.Type.OVERWRITE)
                            .build()
                    )
                    .prepaidBalanceThresholdConfiguration(
                        PrepaidBalanceThresholdConfiguration.builder()
                            .commit(
                                PrepaidBalanceThresholdConfiguration.Commit.builder()
                                    .productId("product_id")
                                    .description("description")
                                    .name("name")
                                    .priority(0.0)
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
                            .discountConfiguration(
                                PrepaidBalanceThresholdConfiguration.DiscountConfiguration.builder()
                                    .paymentFraction(0.0)
                                    .build()
                            )
                            .build()
                    )
                    .rateCardAlias("rate_card_alias")
                    .rateCardId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .addRecurringCommit(
                        PackageCreateParams.RecurringCommit.builder()
                            .accessAmount(
                                PackageCreateParams.RecurringCommit.AccessAmount.builder()
                                    .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .unitPrice(0.0)
                                    .quantity(0.0)
                                    .build()
                            )
                            .commitDuration(
                                PackageCreateParams.RecurringCommit.CommitDuration.builder()
                                    .value(0.0)
                                    .unit(
                                        PackageCreateParams.RecurringCommit.CommitDuration.Unit
                                            .PERIODS
                                    )
                                    .build()
                            )
                            .priority(0.0)
                            .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .startingAtOffset(
                                PackageCreateParams.RecurringCommit.StartingAtOffset.builder()
                                    .unit(
                                        PackageCreateParams.RecurringCommit.StartingAtOffset.Unit
                                            .DAYS
                                    )
                                    .value(0L)
                                    .build()
                            )
                            .addApplicableProductId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .addApplicableProductTag("string")
                            .description("description")
                            .duration(
                                PackageCreateParams.RecurringCommit.Duration.builder()
                                    .unit(PackageCreateParams.RecurringCommit.Duration.Unit.DAYS)
                                    .value(0L)
                                    .build()
                            )
                            .invoiceAmount(
                                PackageCreateParams.RecurringCommit.InvoiceAmount.builder()
                                    .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .quantity(0.0)
                                    .unitPrice(0.0)
                                    .build()
                            )
                            .name("x")
                            .proration(PackageCreateParams.RecurringCommit.Proration.NONE)
                            .rateType(PackageCreateParams.RecurringCommit.RateType.COMMIT_RATE)
                            .recurrenceFrequency(
                                PackageCreateParams.RecurringCommit.RecurrenceFrequency.MONTHLY
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
                                PackageCreateParams.RecurringCommit.SubscriptionConfig.builder()
                                    .applySeatIncreaseConfig(
                                        PackageCreateParams.RecurringCommit.SubscriptionConfig
                                            .ApplySeatIncreaseConfig
                                            .builder()
                                            .isProrated(true)
                                            .build()
                                    )
                                    .subscriptionId("subscription_id")
                                    .allocation(
                                        PackageCreateParams.RecurringCommit.SubscriptionConfig
                                            .Allocation
                                            .INDIVIDUAL
                                    )
                                    .build()
                            )
                            .temporaryId("temporary_id")
                            .build()
                    )
                    .addRecurringCredit(
                        PackageCreateParams.RecurringCredit.builder()
                            .accessAmount(
                                PackageCreateParams.RecurringCredit.AccessAmount.builder()
                                    .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .unitPrice(0.0)
                                    .quantity(0.0)
                                    .build()
                            )
                            .commitDuration(
                                PackageCreateParams.RecurringCredit.CommitDuration.builder()
                                    .value(0.0)
                                    .unit(
                                        PackageCreateParams.RecurringCredit.CommitDuration.Unit
                                            .PERIODS
                                    )
                                    .build()
                            )
                            .priority(0.0)
                            .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .startingAtOffset(
                                PackageCreateParams.RecurringCredit.StartingAtOffset.builder()
                                    .unit(
                                        PackageCreateParams.RecurringCredit.StartingAtOffset.Unit
                                            .DAYS
                                    )
                                    .value(0L)
                                    .build()
                            )
                            .addApplicableProductId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .addApplicableProductTag("string")
                            .description("description")
                            .duration(
                                PackageCreateParams.RecurringCredit.Duration.builder()
                                    .unit(PackageCreateParams.RecurringCredit.Duration.Unit.DAYS)
                                    .value(0L)
                                    .build()
                            )
                            .name("x")
                            .proration(PackageCreateParams.RecurringCredit.Proration.NONE)
                            .rateType(PackageCreateParams.RecurringCredit.RateType.COMMIT_RATE)
                            .recurrenceFrequency(
                                PackageCreateParams.RecurringCredit.RecurrenceFrequency.MONTHLY
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
                                PackageCreateParams.RecurringCredit.SubscriptionConfig.builder()
                                    .applySeatIncreaseConfig(
                                        PackageCreateParams.RecurringCredit.SubscriptionConfig
                                            .ApplySeatIncreaseConfig
                                            .builder()
                                            .isProrated(true)
                                            .build()
                                    )
                                    .subscriptionId("subscription_id")
                                    .allocation(
                                        PackageCreateParams.RecurringCredit.SubscriptionConfig
                                            .Allocation
                                            .INDIVIDUAL
                                    )
                                    .build()
                            )
                            .temporaryId("temporary_id")
                            .build()
                    )
                    .addScheduledCharge(
                        PackageCreateParams.ScheduledCharge.builder()
                            .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .schedule(
                                PackageCreateParams.ScheduledCharge.Schedule.builder()
                                    .addScheduleItem(
                                        PackageCreateParams.ScheduledCharge.Schedule.ScheduleItem
                                            .builder()
                                            .dateOffset(
                                                PackageCreateParams.ScheduledCharge.Schedule
                                                    .ScheduleItem
                                                    .DateOffset
                                                    .builder()
                                                    .unit(
                                                        PackageCreateParams.ScheduledCharge.Schedule
                                                            .ScheduleItem
                                                            .DateOffset
                                                            .Unit
                                                            .DAYS
                                                    )
                                                    .value(0L)
                                                    .build()
                                            )
                                            .quantity(0.0)
                                            .unitPrice(0.0)
                                            .build()
                                    )
                                    .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .build()
                            )
                            .customFields(
                                PackageCreateParams.ScheduledCharge.CustomFields.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .name("x")
                            .build()
                    )
                    .scheduledChargesOnUsageInvoices(
                        PackageCreateParams.ScheduledChargesOnUsageInvoices.ALL
                    )
                    .spendThresholdConfiguration(
                        SpendThresholdConfiguration.builder()
                            .commit(
                                BaseThresholdCommit.builder()
                                    .productId("product_id")
                                    .description("description")
                                    .name("name")
                                    .priority(0.0)
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
                            .discountConfiguration(
                                SpendThresholdConfiguration.DiscountConfiguration.builder()
                                    .paymentFraction(0.0)
                                    .build()
                            )
                            .build()
                    )
                    .addSubscription(
                        PackageCreateParams.Subscription.builder()
                            .collectionSchedule(
                                PackageCreateParams.Subscription.CollectionSchedule.ADVANCE
                            )
                            .proration(
                                PackageCreateParams.Subscription.Proration.builder()
                                    .invoiceBehavior(
                                        PackageCreateParams.Subscription.Proration.InvoiceBehavior
                                            .BILL_IMMEDIATELY
                                    )
                                    .isProrated(true)
                                    .build()
                            )
                            .subscriptionRate(
                                PackageCreateParams.Subscription.SubscriptionRate.builder()
                                    .billingFrequency(
                                        PackageCreateParams.Subscription.SubscriptionRate
                                            .BillingFrequency
                                            .MONTHLY
                                    )
                                    .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .build()
                            )
                            .customFields(
                                PackageCreateParams.Subscription.CustomFields.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .description("description")
                            .duration(
                                PackageCreateParams.Subscription.Duration.builder()
                                    .unit(PackageCreateParams.Subscription.Duration.Unit.DAYS)
                                    .value(0L)
                                    .build()
                            )
                            .initialQuantity(0.0)
                            .name("name")
                            .quantityManagementMode(
                                PackageCreateParams.Subscription.QuantityManagementMode.SEAT_BASED
                            )
                            .seatConfig(
                                PackageCreateParams.Subscription.SeatConfig.builder()
                                    .seatGroupKey("seat_group_key")
                                    .initialUnassignedSeats(0.0)
                                    .build()
                            )
                            .startingAtOffset(
                                PackageCreateParams.Subscription.StartingAtOffset.builder()
                                    .unit(
                                        PackageCreateParams.Subscription.StartingAtOffset.Unit.DAYS
                                    )
                                    .value(0L)
                                    .build()
                            )
                            .temporaryId("temporary_id")
                            .build()
                    )
                    .uniquenessKey("x")
                    .usageStatementSchedule(
                        PackageCreateParams.UsageStatementSchedule.builder()
                            .frequency(PackageCreateParams.UsageStatementSchedule.Frequency.MONTHLY)
                            .day(PackageCreateParams.UsageStatementSchedule.Day.FIRST_OF_MONTH)
                            .invoiceGenerationStartingAtOffset(
                                PackageCreateParams.UsageStatementSchedule
                                    .InvoiceGenerationStartingAtOffset
                                    .builder()
                                    .unit(
                                        PackageCreateParams.UsageStatementSchedule
                                            .InvoiceGenerationStartingAtOffset
                                            .Unit
                                            .DAYS
                                    )
                                    .value(0L)
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        val package_ = packageFuture.get()
        package_.validate()
    }

    @Test
    fun retrieve() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val packageServiceAsync = client.v1().packages()

        val packageFuture =
            packageServiceAsync.retrieve(
                PackageRetrieveParams.builder()
                    .packageId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .build()
            )

        val package_ = packageFuture.get()
        package_.validate()
    }

    @Test
    fun list() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val packageServiceAsync = client.v1().packages()

        val pageFuture = packageServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun archive() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val packageServiceAsync = client.v1().packages()

        val responseFuture =
            packageServiceAsync.archive(
                PackageArchiveParams.builder()
                    .packageId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun listContractsOnPackage() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val packageServiceAsync = client.v1().packages()

        val pageFuture =
            packageServiceAsync.listContractsOnPackage(
                PackageListContractsOnPackageParams.builder()
                    .packageId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                    .build()
            )

        val page = pageFuture.get()
        page.response().validate()
    }
}
