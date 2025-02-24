// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ContractScheduleProServicesInvoiceParamsTest {

    @Test
    fun create() {
        ContractScheduleProServicesInvoiceParams.builder()
            .contractId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .issuedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .addLineItem(
                ContractScheduleProServicesInvoiceParams.LineItem.builder()
                    .professionalServiceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .amendmentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .amount(0.0)
                    .metadata("metadata")
                    .netsuiteInvoiceBillingEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .netsuiteInvoiceBillingStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .quantity(0.0)
                    .unitPrice(0.0)
                    .build()
            )
            .netsuiteInvoiceHeaderEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .netsuiteInvoiceHeaderStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun body() {
        val params =
            ContractScheduleProServicesInvoiceParams.builder()
                .contractId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .issuedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addLineItem(
                    ContractScheduleProServicesInvoiceParams.LineItem.builder()
                        .professionalServiceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .amendmentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .amount(0.0)
                        .metadata("metadata")
                        .netsuiteInvoiceBillingEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .netsuiteInvoiceBillingStart(
                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                        )
                        .quantity(0.0)
                        .unitPrice(0.0)
                        .build()
                )
                .netsuiteInvoiceHeaderEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .netsuiteInvoiceHeaderStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body.contractId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.customerId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.issuedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.lineItems())
            .isEqualTo(
                listOf(
                    ContractScheduleProServicesInvoiceParams.LineItem.builder()
                        .professionalServiceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .amendmentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .amount(0.0)
                        .metadata("metadata")
                        .netsuiteInvoiceBillingEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .netsuiteInvoiceBillingStart(
                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                        )
                        .quantity(0.0)
                        .unitPrice(0.0)
                        .build()
                )
            )
        assertThat(body.netsuiteInvoiceHeaderEnd())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.netsuiteInvoiceHeaderStart())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ContractScheduleProServicesInvoiceParams.builder()
                .contractId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .issuedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addLineItem(
                    ContractScheduleProServicesInvoiceParams.LineItem.builder()
                        .professionalServiceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body.contractId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.customerId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.issuedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.lineItems())
            .isEqualTo(
                listOf(
                    ContractScheduleProServicesInvoiceParams.LineItem.builder()
                        .professionalServiceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
            )
    }
}
