// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.JsonValue
import com.metronome.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SpendThresholdConfigurationTest {

    @Test
    fun create() {
        val spendThresholdConfiguration =
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
                .thresholdAmount(0.0)
                .build()

        assertThat(spendThresholdConfiguration.commit())
            .isEqualTo(
                BaseThresholdCommit.builder()
                    .productId("product_id")
                    .description("description")
                    .name("name")
                    .build()
            )
        assertThat(spendThresholdConfiguration.isEnabled()).isEqualTo(true)
        assertThat(spendThresholdConfiguration.paymentGateConfig())
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
        assertThat(spendThresholdConfiguration.thresholdAmount()).isEqualTo(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val spendThresholdConfiguration =
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
                .thresholdAmount(0.0)
                .build()

        val roundtrippedSpendThresholdConfiguration =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(spendThresholdConfiguration),
                jacksonTypeRef<SpendThresholdConfiguration>(),
            )

        assertThat(roundtrippedSpendThresholdConfiguration).isEqualTo(spendThresholdConfiguration)
    }
}
