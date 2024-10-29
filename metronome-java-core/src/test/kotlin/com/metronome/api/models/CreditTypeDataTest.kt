// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CreditTypeDataTest {

    @Test
    fun createCreditTypeData() {
        val creditTypeData =
            CreditTypeData.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").name("name").build()
        assertThat(creditTypeData).isNotNull
        assertThat(creditTypeData.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(creditTypeData.name()).isEqualTo("name")
    }
}
