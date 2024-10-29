// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProductListItemStateTest {

    @Test
    fun createProductListItemState() {
        val productListItemState =
            ProductListItemState.builder()
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdBy("created_by")
                .name("name")
                .billableMetricId("billable_metric_id")
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
                        .conversionFactor(42.23)
                        .operation(QuantityConversion.Operation.MULTIPLY)
                        .name("name")
                        .build()
                )
                .quantityRounding(
                    QuantityRounding.builder()
                        .decimalPlaces(42.23)
                        .roundingMethod(QuantityRounding.RoundingMethod.ROUND_UP)
                        .build()
                )
                .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .tags(listOf("string"))
                .build()
        assertThat(productListItemState).isNotNull
        assertThat(productListItemState.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(productListItemState.createdBy()).isEqualTo("created_by")
        assertThat(productListItemState.name()).isEqualTo("name")
        assertThat(productListItemState.billableMetricId()).contains("billable_metric_id")
        assertThat(productListItemState.compositeProductIds().get())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(productListItemState.compositeTags().get()).containsExactly("string")
        assertThat(productListItemState.excludeFreeUsage()).contains(true)
        assertThat(productListItemState.isRefundable()).contains(true)
        assertThat(productListItemState.netsuiteInternalItemId())
            .contains("netsuite_internal_item_id")
        assertThat(productListItemState.netsuiteOverageItemId())
            .contains("netsuite_overage_item_id")
        assertThat(productListItemState.presentationGroupKey().get()).containsExactly("string")
        assertThat(productListItemState.pricingGroupKey().get()).containsExactly("string")
        assertThat(productListItemState.quantityConversion())
            .contains(
                QuantityConversion.builder()
                    .conversionFactor(42.23)
                    .operation(QuantityConversion.Operation.MULTIPLY)
                    .name("name")
                    .build()
            )
        assertThat(productListItemState.quantityRounding())
            .contains(
                QuantityRounding.builder()
                    .decimalPlaces(42.23)
                    .roundingMethod(QuantityRounding.RoundingMethod.ROUND_UP)
                    .build()
            )
        assertThat(productListItemState.startingAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(productListItemState.tags().get()).containsExactly("string")
    }
}
