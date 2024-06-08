// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CreditCreateGrantParamsTest {

    @Test
    fun createCreditCreateGrantParams() {
        CreditCreateGrantParams.builder()
            .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .grantAmount(
                CreditCreateGrantParams.GrantAmount.builder()
                    .amount(42.23)
                    .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
            .name("string")
            .paidAmount(
                CreditCreateGrantParams.PaidAmount.builder()
                    .amount(42.23)
                    .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
            .priority(42.23)
            .creditGrantType("string")
            .customFields(CreditCreateGrantParams.CustomFields.builder().build())
            .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .invoiceDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .productIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
            .reason("string")
            .rolloverSettings(
                CreditCreateGrantParams.RolloverSettings.builder()
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .priority(42.23)
                    .rolloverAmount(
                        CreditCreateGrantParams.RolloverSettings.RolloverAmount
                            .ofRolloverAmountMaxPercentage(
                                CreditCreateGrantParams.RolloverSettings.RolloverAmount
                                    .RolloverAmountMaxPercentage
                                    .builder()
                                    .type(
                                        CreditCreateGrantParams.RolloverSettings.RolloverAmount
                                            .RolloverAmountMaxPercentage
                                            .Type
                                            .MAX_PERCENTAGE
                                    )
                                    .value(1.0)
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
            CreditCreateGrantParams.builder()
                .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .grantAmount(
                    CreditCreateGrantParams.GrantAmount.builder()
                        .amount(42.23)
                        .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .name("string")
                .paidAmount(
                    CreditCreateGrantParams.PaidAmount.builder()
                        .amount(42.23)
                        .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .priority(42.23)
                .creditGrantType("string")
                .customFields(CreditCreateGrantParams.CustomFields.builder().build())
                .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .invoiceDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .productIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .reason("string")
                .rolloverSettings(
                    CreditCreateGrantParams.RolloverSettings.builder()
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .priority(42.23)
                        .rolloverAmount(
                            CreditCreateGrantParams.RolloverSettings.RolloverAmount
                                .ofRolloverAmountMaxPercentage(
                                    CreditCreateGrantParams.RolloverSettings.RolloverAmount
                                        .RolloverAmountMaxPercentage
                                        .builder()
                                        .type(
                                            CreditCreateGrantParams.RolloverSettings.RolloverAmount
                                                .RolloverAmountMaxPercentage
                                                .Type
                                                .MAX_PERCENTAGE
                                        )
                                        .value(1.0)
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
                CreditCreateGrantParams.GrantAmount.builder()
                    .amount(42.23)
                    .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        assertThat(body.name()).isEqualTo("string")
        assertThat(body.paidAmount())
            .isEqualTo(
                CreditCreateGrantParams.PaidAmount.builder()
                    .amount(42.23)
                    .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        assertThat(body.priority()).isEqualTo(42.23)
        assertThat(body.creditGrantType()).isEqualTo("string")
        assertThat(body.customFields())
            .isEqualTo(CreditCreateGrantParams.CustomFields.builder().build())
        assertThat(body.effectiveAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.invoiceDate()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.productIds()).isEqualTo(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        assertThat(body.reason()).isEqualTo("string")
        assertThat(body.rolloverSettings())
            .isEqualTo(
                CreditCreateGrantParams.RolloverSettings.builder()
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .priority(42.23)
                    .rolloverAmount(
                        CreditCreateGrantParams.RolloverSettings.RolloverAmount
                            .ofRolloverAmountMaxPercentage(
                                CreditCreateGrantParams.RolloverSettings.RolloverAmount
                                    .RolloverAmountMaxPercentage
                                    .builder()
                                    .type(
                                        CreditCreateGrantParams.RolloverSettings.RolloverAmount
                                            .RolloverAmountMaxPercentage
                                            .Type
                                            .MAX_PERCENTAGE
                                    )
                                    .value(1.0)
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
            CreditCreateGrantParams.builder()
                .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .grantAmount(
                    CreditCreateGrantParams.GrantAmount.builder()
                        .amount(42.23)
                        .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .name("string")
                .paidAmount(
                    CreditCreateGrantParams.PaidAmount.builder()
                        .amount(42.23)
                        .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .priority(42.23)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.customerId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.expiresAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.grantAmount())
            .isEqualTo(
                CreditCreateGrantParams.GrantAmount.builder()
                    .amount(42.23)
                    .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        assertThat(body.name()).isEqualTo("string")
        assertThat(body.paidAmount())
            .isEqualTo(
                CreditCreateGrantParams.PaidAmount.builder()
                    .amount(42.23)
                    .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        assertThat(body.priority()).isEqualTo(42.23)
    }
}
