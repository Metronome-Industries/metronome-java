// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomFieldListKeysParamsTest {

    @Test
    fun create() {
        CustomFieldListKeysParams.builder()
            .nextPage("next_page")
            .addEntity(CustomFieldListKeysParams.Entity.ALERT)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            CustomFieldListKeysParams.builder()
                .nextPage("next_page")
                .addEntity(CustomFieldListKeysParams.Entity.ALERT)
                .build()
        val expected = QueryParams.builder()
        expected.put("next_page", "next_page")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CustomFieldListKeysParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun body() {
        val params =
            CustomFieldListKeysParams.builder()
                .nextPage("next_page")
                .addEntity(CustomFieldListKeysParams.Entity.ALERT)
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.entities()).contains(listOf(CustomFieldListKeysParams.Entity.ALERT))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = CustomFieldListKeysParams.builder().build()
        val body = params._body()
        assertThat(body).isNotNull
    }
}
