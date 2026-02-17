// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1SettingBillingProviderListParamsTest {

    @Test
    fun create() {
        V1SettingBillingProviderListParams.builder()
            .nextPage("af26878a-de62-4a0d-9b77-3936f7c2b6d6")
            .build()
    }

    @Test
    fun body() {
        val params =
            V1SettingBillingProviderListParams.builder()
                .nextPage("af26878a-de62-4a0d-9b77-3936f7c2b6d6")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.nextPage()).contains("af26878a-de62-4a0d-9b77-3936f7c2b6d6")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = V1SettingBillingProviderListParams.builder().build()

        val body = params._body()

        assertNotNull(body)
    }
}
