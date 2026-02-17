// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.contracts.products

import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductUpdateParamsTest {

    @Test
    fun create() {
        ProductUpdateParams.builder()
            .productId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
            .startingAt(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
            .billableMetricId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addCompositeProductId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addCompositeTag("string")
            .excludeFreeUsage(true)
            .isRefundable(true)
            .name("My Updated Product")
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
            .addTag("string")
            .build()
    }

    @Test
    fun body() {
        val params =
            ProductUpdateParams.builder()
                .productId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .startingAt(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                .billableMetricId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addCompositeProductId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addCompositeTag("string")
                .excludeFreeUsage(true)
                .isRefundable(true)
                .name("My Updated Product")
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
                .addTag("string")
                .build()

        val body = params._body()

        assertThat(body.productId()).isEqualTo("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
        assertThat(body.startingAt()).isEqualTo(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
        assertThat(body.billableMetricId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.compositeProductIds().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.compositeTags().getOrNull()).containsExactly("string")
        assertThat(body.excludeFreeUsage()).contains(true)
        assertThat(body.isRefundable()).contains(true)
        assertThat(body.name()).contains("My Updated Product")
        assertThat(body.netsuiteInternalItemId()).contains("netsuite_internal_item_id")
        assertThat(body.netsuiteOverageItemId()).contains("netsuite_overage_item_id")
        assertThat(body.presentationGroupKey().getOrNull()).containsExactly("string")
        assertThat(body.pricingGroupKey().getOrNull()).containsExactly("string")
        assertThat(body.quantityConversion())
            .contains(
                QuantityConversion.builder()
                    .conversionFactor(0.0)
                    .operation(QuantityConversion.Operation.MULTIPLY)
                    .name("name")
                    .build()
            )
        assertThat(body.quantityRounding())
            .contains(
                QuantityRounding.builder()
                    .decimalPlaces(0.0)
                    .roundingMethod(QuantityRounding.RoundingMethod.ROUND_UP)
                    .build()
            )
        assertThat(body.tags().getOrNull()).containsExactly("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ProductUpdateParams.builder()
                .productId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .startingAt(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                .build()

        val body = params._body()

        assertThat(body.productId()).isEqualTo("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
        assertThat(body.startingAt()).isEqualTo(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
    }
}
