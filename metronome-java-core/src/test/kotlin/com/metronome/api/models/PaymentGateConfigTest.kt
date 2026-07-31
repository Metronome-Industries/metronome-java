// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.JsonValue
import com.metronome.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentGateConfigTest {

    @Test
    fun create() {
        val paymentGateConfig =
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

        assertThat(paymentGateConfig.paymentGateType())
            .isEqualTo(PaymentGateConfig.PaymentGateType.NONE)
        assertThat(paymentGateConfig.precalculatedTaxConfig())
            .contains(
                PaymentGateConfig.PrecalculatedTaxConfig.builder()
                    .taxAmount(0.0)
                    .taxName("tax_name")
                    .build()
            )
        assertThat(paymentGateConfig.stripeConfig())
            .contains(
                PaymentGateConfig.StripeConfig.builder()
                    .paymentType(PaymentGateConfig.StripeConfig.PaymentType.INVOICE)
                    .invoiceMetadata(
                        PaymentGateConfig.StripeConfig.InvoiceMetadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
        assertThat(paymentGateConfig.taxType()).contains(PaymentGateConfig.TaxType.NONE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val paymentGateConfig =
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

        val roundtrippedPaymentGateConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paymentGateConfig),
                jacksonTypeRef<PaymentGateConfig>(),
            )

        assertThat(roundtrippedPaymentGateConfig).isEqualTo(paymentGateConfig)
    }
}
