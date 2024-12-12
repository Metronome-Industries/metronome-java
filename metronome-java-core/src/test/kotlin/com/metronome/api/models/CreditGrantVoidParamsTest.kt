// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CreditGrantVoidParamsTest {

    @Test
    fun createCreditGrantVoidParams() {
        CreditGrantVoidParams.builder()
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .releaseUniquenessKey(true)
            .voidCreditPurchaseInvoice(true)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            CreditGrantVoidParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .releaseUniquenessKey(true)
                .voidCreditPurchaseInvoice(true)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.releaseUniquenessKey()).isEqualTo(true)
        assertThat(body.voidCreditPurchaseInvoice()).isEqualTo(true)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            CreditGrantVoidParams.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
