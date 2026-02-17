// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.JsonValue
import com.metronome.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PrepaidBalanceThresholdConfigurationV2Test {

    @Test
    fun create() {
        val prepaidBalanceThresholdConfigurationV2 =
            PrepaidBalanceThresholdConfigurationV2.builder()
                .commit(
                    PrepaidBalanceThresholdConfigurationV2.Commit.builder()
                        .description("description")
                        .name("name")
                        .productId("product_id")
                        .addApplicableProductId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addApplicableProductTag("string")
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
                .isEnabled(true)
                .paymentGateConfig(
                    PaymentGateConfigV2.builder()
                        .paymentGateType(PaymentGateConfigV2.PaymentGateType.NONE)
                        .precalculatedTaxConfig(
                            PaymentGateConfigV2.PrecalculatedTaxConfig.builder()
                                .taxAmount(0.0)
                                .taxName("tax_name")
                                .build()
                        )
                        .stripeConfig(
                            PaymentGateConfigV2.StripeConfig.builder()
                                .paymentType(PaymentGateConfigV2.StripeConfig.PaymentType.INVOICE)
                                .invoiceMetadata(
                                    PaymentGateConfigV2.StripeConfig.InvoiceMetadata.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .build()
                        )
                        .taxType(PaymentGateConfigV2.TaxType.NONE)
                        .build()
                )
                .rechargeToAmount(0.0)
                .thresholdAmount(0.0)
                .customCreditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(prepaidBalanceThresholdConfigurationV2.commit())
            .isEqualTo(
                PrepaidBalanceThresholdConfigurationV2.Commit.builder()
                    .description("description")
                    .name("name")
                    .productId("product_id")
                    .addApplicableProductId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addApplicableProductTag("string")
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
        assertThat(prepaidBalanceThresholdConfigurationV2.isEnabled()).isEqualTo(true)
        assertThat(prepaidBalanceThresholdConfigurationV2.paymentGateConfig())
            .isEqualTo(
                PaymentGateConfigV2.builder()
                    .paymentGateType(PaymentGateConfigV2.PaymentGateType.NONE)
                    .precalculatedTaxConfig(
                        PaymentGateConfigV2.PrecalculatedTaxConfig.builder()
                            .taxAmount(0.0)
                            .taxName("tax_name")
                            .build()
                    )
                    .stripeConfig(
                        PaymentGateConfigV2.StripeConfig.builder()
                            .paymentType(PaymentGateConfigV2.StripeConfig.PaymentType.INVOICE)
                            .invoiceMetadata(
                                PaymentGateConfigV2.StripeConfig.InvoiceMetadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .build()
                    )
                    .taxType(PaymentGateConfigV2.TaxType.NONE)
                    .build()
            )
        assertThat(prepaidBalanceThresholdConfigurationV2.rechargeToAmount()).isEqualTo(0.0)
        assertThat(prepaidBalanceThresholdConfigurationV2.thresholdAmount()).isEqualTo(0.0)
        assertThat(prepaidBalanceThresholdConfigurationV2.customCreditTypeId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val prepaidBalanceThresholdConfigurationV2 =
            PrepaidBalanceThresholdConfigurationV2.builder()
                .commit(
                    PrepaidBalanceThresholdConfigurationV2.Commit.builder()
                        .description("description")
                        .name("name")
                        .productId("product_id")
                        .addApplicableProductId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addApplicableProductTag("string")
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
                .isEnabled(true)
                .paymentGateConfig(
                    PaymentGateConfigV2.builder()
                        .paymentGateType(PaymentGateConfigV2.PaymentGateType.NONE)
                        .precalculatedTaxConfig(
                            PaymentGateConfigV2.PrecalculatedTaxConfig.builder()
                                .taxAmount(0.0)
                                .taxName("tax_name")
                                .build()
                        )
                        .stripeConfig(
                            PaymentGateConfigV2.StripeConfig.builder()
                                .paymentType(PaymentGateConfigV2.StripeConfig.PaymentType.INVOICE)
                                .invoiceMetadata(
                                    PaymentGateConfigV2.StripeConfig.InvoiceMetadata.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .build()
                        )
                        .taxType(PaymentGateConfigV2.TaxType.NONE)
                        .build()
                )
                .rechargeToAmount(0.0)
                .thresholdAmount(0.0)
                .customCreditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedPrepaidBalanceThresholdConfigurationV2 =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(prepaidBalanceThresholdConfigurationV2),
                jacksonTypeRef<PrepaidBalanceThresholdConfigurationV2>(),
            )

        assertThat(roundtrippedPrepaidBalanceThresholdConfigurationV2)
            .isEqualTo(prepaidBalanceThresholdConfigurationV2)
    }
}
