// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CreditGrantEditParamsTest {

    @Test
    fun createCreditGrantEditParams() {
        CreditGrantEditParams.builder()
            .id("9b85c1c1-5238-4f2a-a409-61412905e1e1")
            .creditGrantType("credit_grant_type")
            .expiresAt(OffsetDateTime.parse("2022-04-01T00:00:00Z"))
            .name("Acme Corp Promotional Credit Grant")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            CreditGrantEditParams.builder()
                .id("9b85c1c1-5238-4f2a-a409-61412905e1e1")
                .creditGrantType("credit_grant_type")
                .expiresAt(OffsetDateTime.parse("2022-04-01T00:00:00Z"))
                .name("Acme Corp Promotional Credit Grant")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.id()).isEqualTo("9b85c1c1-5238-4f2a-a409-61412905e1e1")
        assertThat(body.creditGrantType()).isEqualTo("credit_grant_type")
        assertThat(body.expiresAt()).isEqualTo(OffsetDateTime.parse("2022-04-01T00:00:00Z"))
        assertThat(body.name()).isEqualTo("Acme Corp Promotional Credit Grant")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            CreditGrantEditParams.builder().id("9b85c1c1-5238-4f2a-a409-61412905e1e1").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.id()).isEqualTo("9b85c1c1-5238-4f2a-a409-61412905e1e1")
    }
}
