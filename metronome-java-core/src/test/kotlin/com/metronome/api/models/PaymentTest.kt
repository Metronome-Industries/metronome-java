// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PaymentTest {

    @Test
    fun createPayment() {
        val payment =
            Payment.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amount(0.0)
                .amountPaid(0.0)
                .contractId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2022-02-01T00:00:00Z"))
                .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .errorMessage("error_message")
                .fiatCreditType(
                    CreditTypeData.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .build()
                )
                .invoiceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .paymentGateway(
                    Payment.PaymentGateway.builder()
                        .stripe(
                            Payment.PaymentGateway.Stripe.builder()
                                .paymentIntentId("payment_intent_id")
                                .error(
                                    Payment.PaymentGateway.Stripe.Error.builder()
                                        .code("code")
                                        .declineCode("decline_code")
                                        .type("type")
                                        .build()
                                )
                                .paymentMethodId("payment_method_id")
                                .build()
                        )
                        .type(Payment.PaymentGateway.Type.STRIPE)
                        .build()
                )
                .addRevenueSystemPayment(
                    Payment.RevenueSystemPayment.builder()
                        .revenueSystemProvider("revenue_system_provider")
                        .syncStatus("sync_status")
                        .errorMessage("error_message")
                        .revenueSystemExternalPaymentId("revenue_system_external_payment_id")
                        .build()
                )
                .status(PaymentStatus.PENDING)
                .updatedAt(OffsetDateTime.parse("2022-02-01T00:00:00Z"))
                .build()
        assertThat(payment).isNotNull
        assertThat(payment.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(payment.amount()).contains(0.0)
        assertThat(payment.amountPaid()).contains(0.0)
        assertThat(payment.contractId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(payment.createdAt()).contains(OffsetDateTime.parse("2022-02-01T00:00:00Z"))
        assertThat(payment.customerId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(payment.errorMessage()).contains("error_message")
        assertThat(payment.fiatCreditType())
            .contains(
                CreditTypeData.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .build()
            )
        assertThat(payment.invoiceId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(payment.paymentGateway())
            .contains(
                Payment.PaymentGateway.builder()
                    .stripe(
                        Payment.PaymentGateway.Stripe.builder()
                            .paymentIntentId("payment_intent_id")
                            .error(
                                Payment.PaymentGateway.Stripe.Error.builder()
                                    .code("code")
                                    .declineCode("decline_code")
                                    .type("type")
                                    .build()
                            )
                            .paymentMethodId("payment_method_id")
                            .build()
                    )
                    .type(Payment.PaymentGateway.Type.STRIPE)
                    .build()
            )
        assertThat(payment.revenueSystemPayments().get())
            .containsExactly(
                Payment.RevenueSystemPayment.builder()
                    .revenueSystemProvider("revenue_system_provider")
                    .syncStatus("sync_status")
                    .errorMessage("error_message")
                    .revenueSystemExternalPaymentId("revenue_system_external_payment_id")
                    .build()
            )
        assertThat(payment.status()).contains(PaymentStatus.PENDING)
        assertThat(payment.updatedAt()).contains(OffsetDateTime.parse("2022-02-01T00:00:00Z"))
    }
}
