// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.http.QueryParams
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
        val expected = QueryParams.builder()
        expected.put("next_page", "next_page")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = CustomFieldListKeysParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
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
