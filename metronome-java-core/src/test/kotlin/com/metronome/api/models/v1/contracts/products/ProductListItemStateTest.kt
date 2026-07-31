// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.contracts.products

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductListItemStateTest {

    @Test
    fun create() {
        val productListItemState =
            ProductListItemState.builder()
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdBy("created_by")
                .name("name")
                .billableMetricId("billable_metric_id")
                .addCompositeProductId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addCompositeTag("string")
                .excludeFreeUsage(true)
                .isRefundable(true)
                .netsuiteInternalItemId("netsuite_internal_item_id")
                .netsuiteOverageItemId("netsuite_overage_item_id")
                .addPresentationGroupKey("string")
                .addPricingGroupKey("string")
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
                .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addTag("string")
                .build()

        assertThat(productListItemState.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(productListItemState.createdBy()).isEqualTo("created_by")
        assertThat(productListItemState.name()).isEqualTo("name")
        assertThat(productListItemState.billableMetricId()).contains("billable_metric_id")
        assertThat(productListItemState.compositeProductIds().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(productListItemState.compositeTags().getOrNull()).containsExactly("string")
        assertThat(productListItemState.excludeFreeUsage()).contains(true)
        assertThat(productListItemState.isRefundable()).contains(true)
        assertThat(productListItemState.netsuiteInternalItemId())
            .contains("netsuite_internal_item_id")
        assertThat(productListItemState.netsuiteOverageItemId())
            .contains("netsuite_overage_item_id")
        assertThat(productListItemState.presentationGroupKey().getOrNull())
            .containsExactly("string")
        assertThat(productListItemState.pricingGroupKey().getOrNull()).containsExactly("string")
        assertThat(productListItemState.quantityConversion())
            .contains(
                QuantityConversion.builder()
                    .conversionFactor(0.0)
                    .operation(QuantityConversion.Operation.MULTIPLY)
                    .name("name")
                    .build()
            )
        assertThat(productListItemState.quantityRounding())
            .contains(
                QuantityRounding.builder()
                    .decimalPlaces(0.0)
                    .roundingMethod(QuantityRounding.RoundingMethod.ROUND_UP)
                    .build()
            )
        assertThat(productListItemState.startingAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(productListItemState.tags().getOrNull()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val productListItemState =
            ProductListItemState.builder()
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdBy("created_by")
                .name("name")
                .billableMetricId("billable_metric_id")
                .addCompositeProductId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addCompositeTag("string")
                .excludeFreeUsage(true)
                .isRefundable(true)
                .netsuiteInternalItemId("netsuite_internal_item_id")
                .netsuiteOverageItemId("netsuite_overage_item_id")
                .addPresentationGroupKey("string")
                .addPricingGroupKey("string")
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
                .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addTag("string")
                .build()

        val roundtrippedProductListItemState =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(productListItemState),
                jacksonTypeRef<ProductListItemState>(),
            )

        assertThat(roundtrippedProductListItemState).isEqualTo(productListItemState)
    }
}
