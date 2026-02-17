// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customfields

import com.metronome.api.core.http.QueryParams
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomFieldListKeysParamsTest {

    @Test
    fun create() {
        CustomFieldListKeysParams.builder()
            .nextPage("next_page")
            .addEntity(CustomFieldListKeysParams.Entity.CUSTOMER)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            CustomFieldListKeysParams.builder()
                .nextPage("next_page")
                .addEntity(CustomFieldListKeysParams.Entity.CUSTOMER)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("next_page", "next_page").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CustomFieldListKeysParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            CustomFieldListKeysParams.builder()
                .nextPage("next_page")
                .addEntity(CustomFieldListKeysParams.Entity.CUSTOMER)
                .build()

        val body = params._body()

        assertThat(body.entities().getOrNull())
            .containsExactly(CustomFieldListKeysParams.Entity.CUSTOMER)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = CustomFieldListKeysParams.builder().build()

        val body = params._body()
    }
}
