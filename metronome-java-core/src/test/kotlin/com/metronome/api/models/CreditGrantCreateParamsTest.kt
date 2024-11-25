// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CreditGrantCreateParamsTest {

    @Test
    fun createCreditGrantCreateParams() {
        CreditGrantCreateParams.builder()
            .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .grantAmount(
                CreditGrantCreateParams.GrantAmount.builder()
                    .amount(0.0)
                    .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
            .name("name")
            .paidAmount(
                CreditGrantCreateParams.PaidAmount.builder()
                    .amount(0.0)
                    .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
            .priority(0.0)
            .creditGrantType("credit_grant_type")
            .customFields(CreditGrantCreateParams.CustomFields.builder().build())
            .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .invoiceDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .productIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
            .reason("reason")
            .rolloverSettings(
                CreditGrantCreateParams.RolloverSettings.builder()
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .priority(0.0)
                    .rolloverAmount(
                        CreditGrantCreateParams.RolloverSettings.RolloverAmount
                            .ofRolloverAmountMaxPercentage(
                                RolloverAmountMaxPercentage.builder()
                                    .type(RolloverAmountMaxPercentage.Type.MAX_PERCENTAGE)
                                    .value(0.0)
                                    .build()
                            )
                    )
                    .build()
            )
            .uniquenessKey("x")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            CreditGrantCreateParams.builder()
                .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .grantAmount(
                    CreditGrantCreateParams.GrantAmount.builder()
                        .amount(0.0)
                        .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .name("name")
                .paidAmount(
                    CreditGrantCreateParams.PaidAmount.builder()
                        .amount(0.0)
                        .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .priority(0.0)
                .creditGrantType("credit_grant_type")
                .customFields(CreditGrantCreateParams.CustomFields.builder().build())
                .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .invoiceDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .productIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .reason("reason")
                .rolloverSettings(
                    CreditGrantCreateParams.RolloverSettings.builder()
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .priority(0.0)
                        .rolloverAmount(
                            CreditGrantCreateParams.RolloverSettings.RolloverAmount
                                .ofRolloverAmountMaxPercentage(
                                    RolloverAmountMaxPercentage.builder()
                                        .type(RolloverAmountMaxPercentage.Type.MAX_PERCENTAGE)
                                        .value(0.0)
                                        .build()
                                )
                        )
                        .build()
                )
                .uniquenessKey("x")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.customerId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.expiresAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.grantAmount())
            .isEqualTo(
                CreditGrantCreateParams.GrantAmount.builder()
                    .amount(0.0)
                    .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.paidAmount())
            .isEqualTo(
                CreditGrantCreateParams.PaidAmount.builder()
                    .amount(0.0)
                    .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        assertThat(body.priority()).isEqualTo(0.0)
        assertThat(body.creditGrantType()).isEqualTo("credit_grant_type")
        assertThat(body.customFields())
            .isEqualTo(CreditGrantCreateParams.CustomFields.builder().build())
        assertThat(body.effectiveAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.invoiceDate()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.productIds()).isEqualTo(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        assertThat(body.reason()).isEqualTo("reason")
        assertThat(body.rolloverSettings())
            .isEqualTo(
                CreditGrantCreateParams.RolloverSettings.builder()
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .priority(0.0)
                    .rolloverAmount(
                        CreditGrantCreateParams.RolloverSettings.RolloverAmount
                            .ofRolloverAmountMaxPercentage(
                                RolloverAmountMaxPercentage.builder()
                                    .type(RolloverAmountMaxPercentage.Type.MAX_PERCENTAGE)
                                    .value(0.0)
                                    .build()
                            )
                    )
                    .build()
            )
        assertThat(body.uniquenessKey()).isEqualTo("x")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            CreditGrantCreateParams.builder()
                .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .grantAmount(
                    CreditGrantCreateParams.GrantAmount.builder()
                        .amount(0.0)
                        .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .name("name")
                .paidAmount(
                    CreditGrantCreateParams.PaidAmount.builder()
                        .amount(0.0)
                        .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .priority(0.0)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.customerId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.expiresAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.grantAmount())
            .isEqualTo(
                CreditGrantCreateParams.GrantAmount.builder()
                    .amount(0.0)
                    .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.paidAmount())
            .isEqualTo(
                CreditGrantCreateParams.PaidAmount.builder()
                    .amount(0.0)
                    .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        assertThat(body.priority()).isEqualTo(0.0)
    }
}
