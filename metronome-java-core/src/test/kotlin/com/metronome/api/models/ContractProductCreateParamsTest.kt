// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ContractProductCreateParamsTest {

    @Test
    fun createContractProductCreateParams() {
        ContractProductCreateParams.builder()
            .name("name")
            .type(ContractProductCreateParams.Type.FIXED)
            .billableMetricId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .compositeProductIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
            .compositeTags(listOf("string"))
            .excludeFreeUsage(true)
            .isRefundable(true)
            .netsuiteInternalItemId("netsuite_internal_item_id")
            .netsuiteOverageItemId("netsuite_overage_item_id")
            .presentationGroupKey(listOf("string"))
            .pricingGroupKey(listOf("string"))
            .quantityConversion(
                QuantityConversion.builder()
                    .conversionFactor(0.0)
                    .operation(QuantityConversion.Operation.MULTIPLY)
                    .name("name")
                    .build()
            )
            .quantityRounding(
                QuantityRounding.builder()
                    .decimalPlaces(0.0)
                    .roundingMethod(QuantityRounding.RoundingMethod.ROUND_UP)
                    .build()
            )
            .tags(listOf("string"))
            .build()
    }

    @Test
    fun getBody() {
        val params =
            ContractProductCreateParams.builder()
                .name("name")
                .type(ContractProductCreateParams.Type.FIXED)
                .billableMetricId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .compositeProductIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .compositeTags(listOf("string"))
                .excludeFreeUsage(true)
                .isRefundable(true)
                .netsuiteInternalItemId("netsuite_internal_item_id")
                .netsuiteOverageItemId("netsuite_overage_item_id")
                .presentationGroupKey(listOf("string"))
                .pricingGroupKey(listOf("string"))
                .quantityConversion(
                    QuantityConversion.builder()
                        .conversionFactor(0.0)
                        .operation(QuantityConversion.Operation.MULTIPLY)
                        .name("name")
                        .build()
                )
                .quantityRounding(
                    QuantityRounding.builder()
                        .decimalPlaces(0.0)
                        .roundingMethod(QuantityRounding.RoundingMethod.ROUND_UP)
                        .build()
                )
                .tags(listOf("string"))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.type()).isEqualTo(ContractProductCreateParams.Type.FIXED)
        assertThat(body.billableMetricId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.compositeProductIds())
            .isEqualTo(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        assertThat(body.compositeTags()).isEqualTo(listOf("string"))
        assertThat(body.excludeFreeUsage()).isEqualTo(true)
        assertThat(body.isRefundable()).isEqualTo(true)
        assertThat(body.netsuiteInternalItemId()).isEqualTo("netsuite_internal_item_id")
        assertThat(body.netsuiteOverageItemId()).isEqualTo("netsuite_overage_item_id")
        assertThat(body.presentationGroupKey()).isEqualTo(listOf("string"))
        assertThat(body.pricingGroupKey()).isEqualTo(listOf("string"))
        assertThat(body.quantityConversion())
            .isEqualTo(
                QuantityConversion.builder()
                    .conversionFactor(0.0)
                    .operation(QuantityConversion.Operation.MULTIPLY)
                    .name("name")
                    .build()
            )
        assertThat(body.quantityRounding())
            .isEqualTo(
                QuantityRounding.builder()
                    .decimalPlaces(0.0)
                    .roundingMethod(QuantityRounding.RoundingMethod.ROUND_UP)
                    .build()
            )
        assertThat(body.tags()).isEqualTo(listOf("string"))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            ContractProductCreateParams.builder()
                .name("name")
                .type(ContractProductCreateParams.Type.FIXED)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.type()).isEqualTo(ContractProductCreateParams.Type.FIXED)
    }
}
