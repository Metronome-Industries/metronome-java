// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CreditGrantVoidParamsTest {

    @Test
    fun createCreditGrantVoidParams() {
        CreditGrantVoidParams.builder()
            .id("9b85c1c1-5238-4f2a-a409-61412905e1e1")
            .releaseUniquenessKey(true)
            .voidCreditPurchaseInvoice(true)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            CreditGrantVoidParams.builder()
                .id("9b85c1c1-5238-4f2a-a409-61412905e1e1")
                .releaseUniquenessKey(true)
                .voidCreditPurchaseInvoice(true)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.id()).isEqualTo("9b85c1c1-5238-4f2a-a409-61412905e1e1")
        assertThat(body.releaseUniquenessKey()).isEqualTo(true)
        assertThat(body.voidCreditPurchaseInvoice()).isEqualTo(true)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            CreditGrantVoidParams.builder().id("9b85c1c1-5238-4f2a-a409-61412905e1e1").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.id()).isEqualTo("9b85c1c1-5238-4f2a-a409-61412905e1e1")
    }
}
