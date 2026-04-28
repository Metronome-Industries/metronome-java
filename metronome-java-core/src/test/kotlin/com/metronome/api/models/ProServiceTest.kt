// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.JsonValue
import com.metronome.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProServiceTest {

    @Test
    fun create() {
        val proService =
            ProService.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .maxAmount(0.0)
                .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .quantity(0.0)
                .unitPrice(0.0)
                .customFields(
                    ProService.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .description("description")
                .netsuiteSalesOrderId("netsuite_sales_order_id")
                .build()

        assertThat(proService.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(proService.maxAmount()).isEqualTo(0.0)
        assertThat(proService.productId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(proService.quantity()).isEqualTo(0.0)
        assertThat(proService.unitPrice()).isEqualTo(0.0)
        assertThat(proService.customFields())
            .contains(
                ProService.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(proService.description()).contains("description")
        assertThat(proService.netsuiteSalesOrderId()).contains("netsuite_sales_order_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val proService =
            ProService.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .maxAmount(0.0)
                .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .quantity(0.0)
                .unitPrice(0.0)
                .customFields(
                    ProService.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .description("description")
                .netsuiteSalesOrderId("netsuite_sales_order_id")
                .build()

        val roundtrippedProService =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(proService),
                jacksonTypeRef<ProService>(),
            )

        assertThat(roundtrippedProService).isEqualTo(proService)
    }
}
