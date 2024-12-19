// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ContractProductRetrieveParamsTest {

    @Test
    fun createContractProductRetrieveParams() {
        ContractProductRetrieveParams.builder().id("d84e7f4e-7a70-4fe4-be02-7a5027beffcc").build()
    }

    @Test
    fun getBody() {
        val params =
            ContractProductRetrieveParams.builder()
                .id("d84e7f4e-7a70-4fe4-be02-7a5027beffcc")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.id()).isEqualTo("d84e7f4e-7a70-4fe4-be02-7a5027beffcc")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            ContractProductRetrieveParams.builder()
                .id("d84e7f4e-7a70-4fe4-be02-7a5027beffcc")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.id()).isEqualTo("d84e7f4e-7a70-4fe4-be02-7a5027beffcc")
    }
}
