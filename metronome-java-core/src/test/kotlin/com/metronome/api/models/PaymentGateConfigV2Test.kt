// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.JsonValue
import com.metronome.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentGateConfigV2Test {

    @Test
    fun create() {
        val paymentGateConfigV2 =
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

        assertThat(paymentGateConfigV2.paymentGateType())
            .isEqualTo(PaymentGateConfigV2.PaymentGateType.NONE)
        assertThat(paymentGateConfigV2.precalculatedTaxConfig())
            .contains(
                PaymentGateConfigV2.PrecalculatedTaxConfig.builder()
                    .taxAmount(0.0)
                    .taxName("tax_name")
                    .build()
            )
        assertThat(paymentGateConfigV2.stripeConfig())
            .contains(
                PaymentGateConfigV2.StripeConfig.builder()
                    .paymentType(PaymentGateConfigV2.StripeConfig.PaymentType.INVOICE)
                    .invoiceMetadata(
                        PaymentGateConfigV2.StripeConfig.InvoiceMetadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
        assertThat(paymentGateConfigV2.taxType()).contains(PaymentGateConfigV2.TaxType.NONE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val paymentGateConfigV2 =
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

        val roundtrippedPaymentGateConfigV2 =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paymentGateConfigV2),
                jacksonTypeRef<PaymentGateConfigV2>(),
            )

        assertThat(roundtrippedPaymentGateConfigV2).isEqualTo(paymentGateConfigV2)
    }
}
