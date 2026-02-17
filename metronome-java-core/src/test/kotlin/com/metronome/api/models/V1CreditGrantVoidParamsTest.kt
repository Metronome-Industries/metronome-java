// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1CreditGrantVoidParamsTest {

    @Test
    fun create() {
        V1CreditGrantVoidParams.builder()
            .id("9b85c1c1-5238-4f2a-a409-61412905e1e1")
            .releaseUniquenessKey(true)
            .voidCreditPurchaseInvoice(true)
            .build()
    }

    @Test
    fun body() {
        val params =
            V1CreditGrantVoidParams.builder()
                .id("9b85c1c1-5238-4f2a-a409-61412905e1e1")
                .releaseUniquenessKey(true)
                .voidCreditPurchaseInvoice(true)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.id()).isEqualTo("9b85c1c1-5238-4f2a-a409-61412905e1e1")
        assertThat(body.releaseUniquenessKey()).contains(true)
        assertThat(body.voidCreditPurchaseInvoice()).contains(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            V1CreditGrantVoidParams.builder().id("9b85c1c1-5238-4f2a-a409-61412905e1e1").build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.id()).isEqualTo("9b85c1c1-5238-4f2a-a409-61412905e1e1")
    }
}
