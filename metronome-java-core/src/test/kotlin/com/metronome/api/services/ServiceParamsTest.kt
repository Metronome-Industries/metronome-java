// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services

import com.fasterxml.jackson.databind.json.JsonMapper
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.equalTo
import com.github.tomakehurst.wiremock.client.WireMock.matchingJsonPath
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.postRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.client.WireMock.verify
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.metronome.api.client.MetronomeClient
import com.metronome.api.client.okhttp.MetronomeOkHttpClient
import com.metronome.api.core.JsonValue
import com.metronome.api.core.jsonMapper
import com.metronome.api.models.BaseUsageFilter
import com.metronome.api.models.ContractCreateParams
import com.metronome.api.models.ContractCreateResponse
import com.metronome.api.models.Id
import com.metronome.api.models.Tier
import com.metronome.api.models.UsageIngestParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

@WireMockTest
class ServiceParamsTest {

    private val JSON_MAPPER: JsonMapper = jsonMapper()

    private lateinit var client: MetronomeClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            MetronomeOkHttpClient.builder()
                .bearerToken("My Bearer Token")
                .webhookSecret("My Webhook Secret")
                .baseUrl(wmRuntimeInfo.getHttpBaseUrl())
                .build()
    }

    @Test
    fun contractsCreateWithAdditionalParams() {
        val additionalHeaders = mutableMapOf<String, List<String>>()

        additionalHeaders.put("x-test-header", listOf("abc1234"))

        val additionalQueryParams = mutableMapOf<String, List<String>>()

        additionalQueryParams.put("test_query_param", listOf("def567"))

        val additionalBodyProperties = mutableMapOf<String, JsonValue>()

        additionalBodyProperties.put("testBodyProperty", JsonValue.from("ghi890"))

        val params =
            ContractCreateParams.builder()
                .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                .startingAt(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                .billingProviderConfiguration(
                    ContractCreateParams.BillingProviderConfiguration.builder()
                        .billingProvider(
                            ContractCreateParams.BillingProviderConfiguration.BillingProvider
                                .AWS_MARKETPLACE
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
                        .invoiceSchedule(
                            ContractCreateParams.Commit.InvoiceSchedule.builder()
                                .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .recurringSchedule(
                                    ContractCreateParams.Commit.InvoiceSchedule.RecurringSchedule
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
                                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .amount(0.0)
                                        .quantity(0.0)
                                        .unitPrice(0.0)
                                        .build()
                                )
                                .build()
                        )
                        .name("x")
                        .netsuiteSalesOrderId("netsuite_sales_order_id")
                        .priority(0.0)
                        .rateType(ContractCreateParams.Commit.RateType.COMMIT_RATE)
                        .rolloverFraction(0.0)
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
                        .name("x")
                        .netsuiteSalesOrderId("netsuite_sales_order_id")
                        .priority(0.0)
                        .rateType(ContractCreateParams.Credit.RateType.COMMIT_RATE)
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
                                .recurringSchedule(
                                    ContractCreateParams.Discount.Schedule.RecurringSchedule
                                        .builder()
                                        .amountDistribution(
                                            ContractCreateParams.Discount.Schedule.RecurringSchedule
                                                .AmountDistribution
                                                .DIVIDED
                                        )
                                        .endingBefore(
                                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                        )
                                        .frequency(
                                            ContractCreateParams.Discount.Schedule.RecurringSchedule
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
                                    ContractCreateParams.Discount.Schedule.ScheduleItem.builder()
                                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                                .rateType(ContractCreateParams.Override.OverwriteRate.RateType.FLAT)
                                .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .customRate(
                                    ContractCreateParams.Override.OverwriteRate.CustomRate.builder()
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
                                .quantity(0.0)
                                .unitPrice(0.0)
                                .build()
                        )
                        .commitDuration(
                            ContractCreateParams.RecurringCommit.CommitDuration.builder()
                                .unit(
                                    ContractCreateParams.RecurringCommit.CommitDuration.Unit.PERIODS
                                )
                                .value(0.0)
                                .build()
                        )
                        .priority(0.0)
                        .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addApplicableProductId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addApplicableProductTag("string")
                        .description("description")
                        .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .invoiceAmount(
                            ContractCreateParams.RecurringCommit.InvoiceAmount.builder()
                                .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .quantity(0.0)
                                .unitPrice(0.0)
                                .build()
                        )
                        .name("x")
                        .netsuiteSalesOrderId("netsuite_sales_order_id")
                        .rateType(ContractCreateParams.RecurringCommit.RateType.COMMIT_RATE)
                        .rolloverFraction(0.0)
                        .temporaryId("temporary_id")
                        .build()
                )
                .addRecurringCredit(
                    ContractCreateParams.RecurringCredit.builder()
                        .accessAmount(
                            ContractCreateParams.RecurringCredit.AccessAmount.builder()
                                .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .quantity(0.0)
                                .unitPrice(0.0)
                                .build()
                        )
                        .commitDuration(
                            ContractCreateParams.RecurringCredit.CommitDuration.builder()
                                .unit(
                                    ContractCreateParams.RecurringCredit.CommitDuration.Unit.PERIODS
                                )
                                .value(0.0)
                                .build()
                        )
                        .priority(0.0)
                        .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addApplicableProductId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addApplicableProductTag("string")
                        .description("description")
                        .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .invoiceAmount(
                            ContractCreateParams.RecurringCredit.InvoiceAmount.builder()
                                .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .quantity(0.0)
                                .unitPrice(0.0)
                                .build()
                        )
                        .name("x")
                        .netsuiteSalesOrderId("netsuite_sales_order_id")
                        .rateType(ContractCreateParams.RecurringCredit.RateType.COMMIT_RATE)
                        .rolloverFraction(0.0)
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
                .salesforceOpportunityId("salesforce_opportunity_id")
                .addScheduledCharge(
                    ContractCreateParams.ScheduledCharge.builder()
                        .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .schedule(
                            ContractCreateParams.ScheduledCharge.Schedule.builder()
                                .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .recurringSchedule(
                                    ContractCreateParams.ScheduledCharge.Schedule.RecurringSchedule
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
                                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .amount(0.0)
                                        .quantity(0.0)
                                        .unitPrice(0.0)
                                        .build()
                                )
                                .build()
                        )
                        .name("x")
                        .netsuiteSalesOrderId("netsuite_sales_order_id")
                        .build()
                )
                .scheduledChargesOnUsageInvoices(
                    ContractCreateParams.ScheduledChargesOnUsageInvoices.ALL
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
                        .frequency(ContractCreateParams.UsageStatementSchedule.Frequency.MONTHLY)
                        .billingAnchorDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .day(ContractCreateParams.UsageStatementSchedule.Day.FIRST_OF_MONTH)
                        .invoiceGenerationStartingAt(
                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                        )
                        .build()
                )
                .additionalHeaders(additionalHeaders)
                .additionalBodyProperties(additionalBodyProperties)
                .additionalQueryParams(additionalQueryParams)
                .build()

        val apiResponse =
            ContractCreateResponse.builder()
                .data(Id.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build())
                .build()

        stubFor(
            post(anyUrl())
                .withHeader("x-test-header", equalTo("abc1234"))
                .withQueryParam("test_query_param", equalTo("def567"))
                .withRequestBody(matchingJsonPath("$.testBodyProperty", equalTo("ghi890")))
                .willReturn(ok(JSON_MAPPER.writeValueAsString(apiResponse)))
        )

        client.contracts().create(params)

        verify(postRequestedFor(anyUrl()))
    }

    @Test
    fun usagesIngestWithAdditionalParams() {
        val additionalHeaders = mutableMapOf<String, List<String>>()

        additionalHeaders.put("x-test-header", listOf("abc1234"))

        val additionalQueryParams = mutableMapOf<String, List<String>>()

        additionalQueryParams.put("test_query_param", listOf("def567"))

        val params =
            UsageIngestParams.builder()
                .addUsage(
                    UsageIngestParams.Usage.builder()
                        .customerId("team@example.com")
                        .eventType("heartbeat")
                        .timestamp("2021-01-01T00:00:00Z")
                        .transactionId("2021-01-01T00:00:00Z_cluster42")
                        .properties(
                            UsageIngestParams.Usage.Properties.builder()
                                .putAdditionalProperty("cluster_id", JsonValue.from("bar"))
                                .putAdditionalProperty("cpu_seconds", JsonValue.from("bar"))
                                .putAdditionalProperty("region", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .additionalHeaders(additionalHeaders)
                .additionalQueryParams(additionalQueryParams)
                .build()

        stubFor(
            post(anyUrl())
                .withHeader("x-test-header", equalTo("abc1234"))
                .withQueryParam("test_query_param", equalTo("def567"))
                .willReturn(ok())
        )

        client.usage().ingest(params)

        verify(postRequestedFor(anyUrl()))
    }
}
