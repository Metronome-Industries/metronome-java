// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ContractProductUpdateParamsTest {

    @Test
    fun createContractProductUpdateParams() {
        ContractProductUpdateParams.builder()
            .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .billableMetricId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .compositeProductIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
            .compositeTags(listOf("string"))
            .excludeFreeUsage(true)
            .isRefundable(true)
            .name("name")
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
            ContractProductUpdateParams.builder()
                .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .billableMetricId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .compositeProductIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .compositeTags(listOf("string"))
                .excludeFreeUsage(true)
                .isRefundable(true)
                .name("name")
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
        assertThat(body.productId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.startingAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.billableMetricId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.compositeProductIds())
            .isEqualTo(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        assertThat(body.compositeTags()).isEqualTo(listOf("string"))
        assertThat(body.excludeFreeUsage()).isEqualTo(true)
        assertThat(body.isRefundable()).isEqualTo(true)
        assertThat(body.name()).isEqualTo("name")
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
            ContractProductUpdateParams.builder()
                .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.productId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.startingAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
