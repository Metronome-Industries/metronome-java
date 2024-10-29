// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomFieldListKeysParamsTest {

    @Test
    fun createCustomFieldListKeysParams() {
        CustomFieldListKeysParams.builder()
            .entities(listOf(CustomFieldListKeysParams.Entity.ALERT))
            .nextPage("next_page")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            CustomFieldListKeysParams.builder()
                .entities(listOf(CustomFieldListKeysParams.Entity.ALERT))
                .nextPage("next_page")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("next_page", listOf("next_page"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = CustomFieldListKeysParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getBody() {
        val params =
            CustomFieldListKeysParams.builder()
                .entities(listOf(CustomFieldListKeysParams.Entity.ALERT))
                .nextPage("next_page")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.entities()).isEqualTo(listOf(CustomFieldListKeysParams.Entity.ALERT))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = CustomFieldListKeysParams.builder().build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }
}
