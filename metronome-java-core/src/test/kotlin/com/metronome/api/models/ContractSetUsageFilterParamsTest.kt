// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import java.time.OffsetDateTime
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ContractSetUsageFilterParamsTest {

    @Test
    fun create() {
        ContractSetUsageFilterParams.builder()
            .contractId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
            .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
            .groupKey("business_subscription_id")
            .addGroupValue("ID-1")
            .addGroupValue("ID-2")
            .startingAt(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
            .build()
    }

    @Test
    fun body() {
        val params =
            ContractSetUsageFilterParams.builder()
                .contractId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                .groupKey("business_subscription_id")
                .addGroupValue("ID-1")
                .addGroupValue("ID-2")
                .startingAt(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.contractId()).isEqualTo("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
        assertThat(body.customerId()).isEqualTo("13117714-3f05-48e5-a6e9-a66093f13b4d")
        assertThat(body.groupKey()).isEqualTo("business_subscription_id")
        assertThat(body.groupValues()).isEqualTo(listOf("ID-1", "ID-2"))
        assertThat(body.startingAt()).isEqualTo(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ContractSetUsageFilterParams.builder()
                .contractId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                .groupKey("business_subscription_id")
                .addGroupValue("ID-1")
                .addGroupValue("ID-2")
                .startingAt(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.contractId()).isEqualTo("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
        assertThat(body.customerId()).isEqualTo("13117714-3f05-48e5-a6e9-a66093f13b4d")
        assertThat(body.groupKey()).isEqualTo("business_subscription_id")
        assertThat(body.groupValues()).isEqualTo(listOf("ID-1", "ID-2"))
        assertThat(body.startingAt()).isEqualTo(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
    }
}
