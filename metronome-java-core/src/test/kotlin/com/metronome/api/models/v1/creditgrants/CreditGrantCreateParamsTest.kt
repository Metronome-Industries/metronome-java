// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.creditgrants

import com.metronome.api.core.JsonValue
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreditGrantCreateParamsTest {

    @Test
    fun create() {
        CreditGrantCreateParams.builder()
            .customerId("9b85c1c1-5238-4f2a-a409-61412905e1e1")
            .expiresAt(OffsetDateTime.parse("2022-04-01T00:00:00Z"))
            .grantAmount(
                CreditGrantCreateParams.GrantAmount.builder()
                    .amount(1000.0)
                    .creditTypeId("5ae401dc-a648-4b49-9ac3-391bb5bc4d7b")
                    .build()
            )
            .name("Acme Corp Promotional Credit Grant")
            .paidAmount(
                CreditGrantCreateParams.PaidAmount.builder()
                    .amount(5000.0)
                    .creditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                    .build()
            )
            .priority(0.5)
            .creditGrantType("trial")
            .customFields(
                CreditGrantCreateParams.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .effectiveAt(OffsetDateTime.parse("2022-02-01T00:00:00Z"))
            .invoiceDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .addProductId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .reason("Incentivize new customer")
            .rolloverSettings(
                CreditGrantCreateParams.RolloverSettings.builder()
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .priority(0.0)
                    .rolloverAmount(
                        RolloverAmountMaxPercentage.builder()
                            .type(RolloverAmountMaxPercentage.Type.MAX_PERCENTAGE)
                            .value(0.0)
                            .build()
                    )
                    .build()
            )
            .uniquenessKey("x")
            .build()
    }

    @Test
    fun body() {
        val params =
            CreditGrantCreateParams.builder()
                .customerId("9b85c1c1-5238-4f2a-a409-61412905e1e1")
                .expiresAt(OffsetDateTime.parse("2022-04-01T00:00:00Z"))
                .grantAmount(
                    CreditGrantCreateParams.GrantAmount.builder()
                        .amount(1000.0)
                        .creditTypeId("5ae401dc-a648-4b49-9ac3-391bb5bc4d7b")
                        .build()
                )
                .name("Acme Corp Promotional Credit Grant")
                .paidAmount(
                    CreditGrantCreateParams.PaidAmount.builder()
                        .amount(5000.0)
                        .creditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                        .build()
                )
                .priority(0.5)
                .creditGrantType("trial")
                .customFields(
                    CreditGrantCreateParams.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .effectiveAt(OffsetDateTime.parse("2022-02-01T00:00:00Z"))
                .invoiceDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addProductId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .reason("Incentivize new customer")
                .rolloverSettings(
                    CreditGrantCreateParams.RolloverSettings.builder()
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .priority(0.0)
                        .rolloverAmount(
                            RolloverAmountMaxPercentage.builder()
                                .type(RolloverAmountMaxPercentage.Type.MAX_PERCENTAGE)
                                .value(0.0)
                                .build()
                        )
                        .build()
                )
                .uniquenessKey("x")
                .build()

        val body = params._body()

        assertThat(body.customerId()).isEqualTo("9b85c1c1-5238-4f2a-a409-61412905e1e1")
        assertThat(body.expiresAt()).isEqualTo(OffsetDateTime.parse("2022-04-01T00:00:00Z"))
        assertThat(body.grantAmount())
            .isEqualTo(
                CreditGrantCreateParams.GrantAmount.builder()
                    .amount(1000.0)
                    .creditTypeId("5ae401dc-a648-4b49-9ac3-391bb5bc4d7b")
                    .build()
            )
        assertThat(body.name()).isEqualTo("Acme Corp Promotional Credit Grant")
        assertThat(body.paidAmount())
            .isEqualTo(
                CreditGrantCreateParams.PaidAmount.builder()
                    .amount(5000.0)
                    .creditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                    .build()
            )
        assertThat(body.priority()).isEqualTo(0.5)
        assertThat(body.creditGrantType()).contains("trial")
        assertThat(body.customFields())
            .contains(
                CreditGrantCreateParams.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.effectiveAt()).contains(OffsetDateTime.parse("2022-02-01T00:00:00Z"))
        assertThat(body.invoiceDate()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.productIds().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.reason()).contains("Incentivize new customer")
        assertThat(body.rolloverSettings())
            .contains(
                CreditGrantCreateParams.RolloverSettings.builder()
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .priority(0.0)
                    .rolloverAmount(
                        RolloverAmountMaxPercentage.builder()
                            .type(RolloverAmountMaxPercentage.Type.MAX_PERCENTAGE)
                            .value(0.0)
                            .build()
                    )
                    .build()
            )
        assertThat(body.uniquenessKey()).contains("x")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CreditGrantCreateParams.builder()
                .customerId("9b85c1c1-5238-4f2a-a409-61412905e1e1")
                .expiresAt(OffsetDateTime.parse("2022-04-01T00:00:00Z"))
                .grantAmount(
                    CreditGrantCreateParams.GrantAmount.builder()
                        .amount(1000.0)
                        .creditTypeId("5ae401dc-a648-4b49-9ac3-391bb5bc4d7b")
                        .build()
                )
                .name("Acme Corp Promotional Credit Grant")
                .paidAmount(
                    CreditGrantCreateParams.PaidAmount.builder()
                        .amount(5000.0)
                        .creditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                        .build()
                )
                .priority(0.5)
                .build()

        val body = params._body()

        assertThat(body.customerId()).isEqualTo("9b85c1c1-5238-4f2a-a409-61412905e1e1")
        assertThat(body.expiresAt()).isEqualTo(OffsetDateTime.parse("2022-04-01T00:00:00Z"))
        assertThat(body.grantAmount())
            .isEqualTo(
                CreditGrantCreateParams.GrantAmount.builder()
                    .amount(1000.0)
                    .creditTypeId("5ae401dc-a648-4b49-9ac3-391bb5bc4d7b")
                    .build()
            )
        assertThat(body.name()).isEqualTo("Acme Corp Promotional Credit Grant")
        assertThat(body.paidAmount())
            .isEqualTo(
                CreditGrantCreateParams.PaidAmount.builder()
                    .amount(5000.0)
                    .creditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                    .build()
            )
        assertThat(body.priority()).isEqualTo(0.5)
    }
}
