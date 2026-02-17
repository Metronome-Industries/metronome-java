// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.payments

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.jsonMapper
import com.metronome.api.models.CreditTypeData
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentAttemptResponseTest {

    @Test
    fun create() {
        val paymentAttemptResponse =
            PaymentAttemptResponse.builder()
                .data(
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
                                .revenueSystemExternalPaymentId(
                                    "revenue_system_external_payment_id"
                                )
                                .build()
                        )
                        .status(PaymentStatus.PENDING)
                        .updatedAt(OffsetDateTime.parse("2022-02-01T00:00:00Z"))
                        .build()
                )
                .build()

        assertThat(paymentAttemptResponse.data())
            .isEqualTo(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val paymentAttemptResponse =
            PaymentAttemptResponse.builder()
                .data(
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
                                .revenueSystemExternalPaymentId(
                                    "revenue_system_external_payment_id"
                                )
                                .build()
                        )
                        .status(PaymentStatus.PENDING)
                        .updatedAt(OffsetDateTime.parse("2022-02-01T00:00:00Z"))
                        .build()
                )
                .build()

        val roundtrippedPaymentAttemptResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paymentAttemptResponse),
                jacksonTypeRef<PaymentAttemptResponse>(),
            )

        assertThat(roundtrippedPaymentAttemptResponse).isEqualTo(paymentAttemptResponse)
    }
}
