// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SpendThresholdConfigurationV2Test {

    @Test
    fun createSpendThresholdConfigurationV2() {
        val spendThresholdConfigurationV2 =
            SpendThresholdConfigurationV2.builder()
                .commit(
                    UpdateBaseThresholdCommit.builder()
                        .description("description")
                        .name("name")
                        .productId("product_id")
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
                .thresholdAmount(0.0)
                .build()
        assertThat(spendThresholdConfigurationV2).isNotNull
        assertThat(spendThresholdConfigurationV2.commit())
            .isEqualTo(
                UpdateBaseThresholdCommit.builder()
                    .description("description")
                    .name("name")
                    .productId("product_id")
                    .build()
            )
        assertThat(spendThresholdConfigurationV2.isEnabled()).isEqualTo(true)
        assertThat(spendThresholdConfigurationV2.paymentGateConfig())
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
        assertThat(spendThresholdConfigurationV2.thresholdAmount()).isEqualTo(0.0)
    }
}
