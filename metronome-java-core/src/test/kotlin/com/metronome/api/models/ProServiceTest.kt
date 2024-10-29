// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProServiceTest {

    @Test
    fun createProService() {
        val proService =
            ProService.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .maxAmount(42.23)
                .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .quantity(42.23)
                .unitPrice(42.23)
                .customFields(ProService.CustomFields.builder().build())
                .description("description")
                .netsuiteSalesOrderId("netsuite_sales_order_id")
                .build()
        assertThat(proService).isNotNull
        assertThat(proService.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(proService.maxAmount()).isEqualTo(42.23)
        assertThat(proService.productId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(proService.quantity()).isEqualTo(42.23)
        assertThat(proService.unitPrice()).isEqualTo(42.23)
        assertThat(proService.customFields()).contains(ProService.CustomFields.builder().build())
        assertThat(proService.description()).contains("description")
        assertThat(proService.netsuiteSalesOrderId()).contains("netsuite_sales_order_id")
    }
}
