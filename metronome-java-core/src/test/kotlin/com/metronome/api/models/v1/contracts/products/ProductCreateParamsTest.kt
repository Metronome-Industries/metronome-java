// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.contracts.products

import com.metronome.api.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductCreateParamsTest {

    @Test
    fun create() {
        ProductCreateParams.builder()
            .name("My Product")
            .type(ProductCreateParams.Type.USAGE)
            .billableMetricId("13117714-3f05-48e5-a6e9-a66093f13b4d")
            .addCompositeProductId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addCompositeTag("string")
            .customFields(
                ProductCreateParams.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
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
            .addTag("string")
            .build()
    }

    @Test
    fun body() {
        val params =
            ProductCreateParams.builder()
                .name("My Product")
                .type(ProductCreateParams.Type.USAGE)
                .billableMetricId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                .addCompositeProductId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addCompositeTag("string")
                .customFields(
                    ProductCreateParams.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
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
                .addTag("string")
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("My Product")
        assertThat(body.type()).isEqualTo(ProductCreateParams.Type.USAGE)
        assertThat(body.billableMetricId()).contains("13117714-3f05-48e5-a6e9-a66093f13b4d")
        assertThat(body.compositeProductIds().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.compositeTags().getOrNull()).containsExactly("string")
        assertThat(body.customFields())
            .contains(
                ProductCreateParams.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.excludeFreeUsage()).contains(true)
        assertThat(body.isRefundable()).contains(true)
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
            ProductCreateParams.builder()
                .name("My Product")
                .type(ProductCreateParams.Type.USAGE)
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("My Product")
        assertThat(body.type()).isEqualTo(ProductCreateParams.Type.USAGE)
    }
}
