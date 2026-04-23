// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.JsonValue
import com.metronome.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PrepaidBalanceThresholdConfigurationTest {

    @Test
    fun create() {
        val prepaidBalanceThresholdConfiguration =
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
                                .paymentType(PaymentGateConfig.StripeConfig.PaymentType.INVOICE)
                                .invoiceMetadata(
                                    PaymentGateConfig.StripeConfig.InvoiceMetadata.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
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

        assertThat(prepaidBalanceThresholdConfiguration.commit())
            .isEqualTo(
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
        assertThat(prepaidBalanceThresholdConfiguration.isEnabled()).isEqualTo(true)
        assertThat(prepaidBalanceThresholdConfiguration.paymentGateConfig())
            .isEqualTo(
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
                            .paymentType(PaymentGateConfig.StripeConfig.PaymentType.INVOICE)
                            .invoiceMetadata(
                                PaymentGateConfig.StripeConfig.InvoiceMetadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .build()
                    )
                    .taxType(PaymentGateConfig.TaxType.NONE)
                    .build()
            )
        assertThat(prepaidBalanceThresholdConfiguration.rechargeToAmount()).isEqualTo(0.0)
        assertThat(prepaidBalanceThresholdConfiguration.thresholdAmount()).isEqualTo(0.0)
        assertThat(prepaidBalanceThresholdConfiguration.customCreditTypeId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(prepaidBalanceThresholdConfiguration.discountConfiguration())
            .contains(
                PrepaidBalanceThresholdConfiguration.DiscountConfiguration.builder()
                    .paymentFraction(0.0)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val prepaidBalanceThresholdConfiguration =
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
                                .paymentType(PaymentGateConfig.StripeConfig.PaymentType.INVOICE)
                                .invoiceMetadata(
                                    PaymentGateConfig.StripeConfig.InvoiceMetadata.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
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

        val roundtrippedPrepaidBalanceThresholdConfiguration =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(prepaidBalanceThresholdConfiguration),
                jacksonTypeRef<PrepaidBalanceThresholdConfiguration>(),
            )

        assertThat(roundtrippedPrepaidBalanceThresholdConfiguration)
            .isEqualTo(prepaidBalanceThresholdConfiguration)
    }
}
