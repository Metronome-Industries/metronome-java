// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1ContractGetNetBalanceParamsTest {

    @Test
    fun create() {
        V1ContractGetNetBalanceParams.builder()
            .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
            .creditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
            .addFilter(
                BalanceFilter.builder()
                    .addBalanceType(BalanceFilter.BalanceType.PREPAID_COMMIT)
                    .customFields(
                        BalanceFilter.CustomFields.builder()
                            .putAdditionalProperty("campaign", JsonValue.from("free-trial"))
                            .build()
                    )
                    .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
            .addFilter(
                BalanceFilter.builder()
                    .addBalanceType(BalanceFilter.BalanceType.PREPAID_COMMIT)
                    .addBalanceType(BalanceFilter.BalanceType.POSTPAID_COMMIT)
                    .customFields(
                        BalanceFilter.CustomFields.builder()
                            .putAdditionalProperty("campaign", JsonValue.from("signup-promotion"))
                            .build()
                    )
                    .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
            .invoiceInclusionMode(V1ContractGetNetBalanceParams.InvoiceInclusionMode.FINALIZED)
            .build()
    }

    @Test
    fun body() {
        val params =
            V1ContractGetNetBalanceParams.builder()
                .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                .creditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                .addFilter(
                    BalanceFilter.builder()
                        .addBalanceType(BalanceFilter.BalanceType.PREPAID_COMMIT)
                        .customFields(
                            BalanceFilter.CustomFields.builder()
                                .putAdditionalProperty("campaign", JsonValue.from("free-trial"))
                                .build()
                        )
                        .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .addFilter(
                    BalanceFilter.builder()
                        .addBalanceType(BalanceFilter.BalanceType.PREPAID_COMMIT)
                        .addBalanceType(BalanceFilter.BalanceType.POSTPAID_COMMIT)
                        .customFields(
                            BalanceFilter.CustomFields.builder()
                                .putAdditionalProperty(
                                    "campaign",
                                    JsonValue.from("signup-promotion"),
                                )
                                .build()
                        )
                        .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .invoiceInclusionMode(V1ContractGetNetBalanceParams.InvoiceInclusionMode.FINALIZED)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.customerId()).isEqualTo("13117714-3f05-48e5-a6e9-a66093f13b4d")
        assertThat(body.creditTypeId()).contains("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
        assertThat(body.filters())
            .contains(
                listOf(
                    BalanceFilter.builder()
                        .addBalanceType(BalanceFilter.BalanceType.PREPAID_COMMIT)
                        .customFields(
                            BalanceFilter.CustomFields.builder()
                                .putAdditionalProperty("campaign", JsonValue.from("free-trial"))
                                .build()
                        )
                        .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build(),
                    BalanceFilter.builder()
                        .addBalanceType(BalanceFilter.BalanceType.PREPAID_COMMIT)
                        .addBalanceType(BalanceFilter.BalanceType.POSTPAID_COMMIT)
                        .customFields(
                            BalanceFilter.CustomFields.builder()
                                .putAdditionalProperty(
                                    "campaign",
                                    JsonValue.from("signup-promotion"),
                                )
                                .build()
                        )
                        .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build(),
                )
            )
        assertThat(body.invoiceInclusionMode())
            .contains(V1ContractGetNetBalanceParams.InvoiceInclusionMode.FINALIZED)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            V1ContractGetNetBalanceParams.builder()
                .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.customerId()).isEqualTo("13117714-3f05-48e5-a6e9-a66093f13b4d")
    }
}
