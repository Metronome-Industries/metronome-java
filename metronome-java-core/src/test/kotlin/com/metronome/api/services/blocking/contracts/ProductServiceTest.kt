// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.contracts

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClient
import com.metronome.api.models.*
import com.metronome.api.models.ContractProductListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ProductServiceTest {

    @Test
    fun callCreate() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val productService = client.contracts().products()
        val contractProductCreateResponse =
            productService.create(
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
                    .tags(listOf("string"))
                    .build()
            )
        println(contractProductCreateResponse)
        contractProductCreateResponse.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val productService = client.contracts().products()
        val contractProductRetrieveResponse =
            productService.retrieve(
                ContractProductRetrieveParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(contractProductRetrieveResponse)
        contractProductRetrieveResponse.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val productService = client.contracts().products()
        val contractProductUpdateResponse =
            productService.update(
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
                    .tags(listOf("string"))
                    .build()
            )
        println(contractProductUpdateResponse)
        contractProductUpdateResponse.validate()
    }

    @Test
    fun callList() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val productService = client.contracts().products()
        val response = productService.list(ContractProductListParams.builder().build())
        println(response)
        response.data().forEach { it.validate() }
    }

    @Test
    fun callArchive() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val productService = client.contracts().products()
        val contractProductArchiveResponse =
            productService.archive(
                ContractProductArchiveParams.builder()
                    .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(contractProductArchiveResponse)
        contractProductArchiveResponse.validate()
    }
}
