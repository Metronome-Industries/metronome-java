// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1.contracts

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClient
import com.metronome.api.core.JsonValue
import com.metronome.api.models.Id
import com.metronome.api.models.QuantityConversion
import com.metronome.api.models.QuantityRounding
import com.metronome.api.models.V1ContractProductArchiveParams
import com.metronome.api.models.V1ContractProductCreateParams
import com.metronome.api.models.V1ContractProductRetrieveParams
import com.metronome.api.models.V1ContractProductUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ProductServiceTest {

    @Test
    fun create() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val productService = client.v1().contracts().products()

        val product =
            productService.create(
                V1ContractProductCreateParams.builder()
                    .name("My Product")
                    .type(V1ContractProductCreateParams.Type.FIXED)
                    .billableMetricId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                    .addCompositeProductId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addCompositeTag("string")
                    .customFields(
                        V1ContractProductCreateParams.CustomFields.builder()
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
            )

        product.validate()
    }

    @Test
    fun retrieve() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val productService = client.v1().contracts().products()

        val product =
            productService.retrieve(
                V1ContractProductRetrieveParams.builder()
                    .id(Id.builder().id("d84e7f4e-7a70-4fe4-be02-7a5027beffcc").build())
                    .build()
            )

        product.validate()
    }

    @Test
    fun update() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val productService = client.v1().contracts().products()

        val product =
            productService.update(
                V1ContractProductUpdateParams.builder()
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
            )

        product.validate()
    }

    @Test
    fun list() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val productService = client.v1().contracts().products()

        val page = productService.list()

        page.response().validate()
    }

    @Test
    fun archive() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val productService = client.v1().contracts().products()

        val response =
            productService.archive(
                V1ContractProductArchiveParams.builder()
                    .productId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .build()
            )

        response.validate()
    }
}
