// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RecurringCommitSubscriptionConfigTest {

    @Test
    fun create() {
        val recurringCommitSubscriptionConfig =
            RecurringCommitSubscriptionConfig.builder()
                .allocation(RecurringCommitSubscriptionConfig.Allocation.INDIVIDUAL)
                .applySeatIncreaseConfig(
                    RecurringCommitSubscriptionConfig.ApplySeatIncreaseConfig.builder()
                        .isProrated(true)
                        .build()
                )
                .subscriptionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(recurringCommitSubscriptionConfig.allocation())
            .isEqualTo(RecurringCommitSubscriptionConfig.Allocation.INDIVIDUAL)
        assertThat(recurringCommitSubscriptionConfig.applySeatIncreaseConfig())
            .isEqualTo(
                RecurringCommitSubscriptionConfig.ApplySeatIncreaseConfig.builder()
                    .isProrated(true)
                    .build()
            )
        assertThat(recurringCommitSubscriptionConfig.subscriptionId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val recurringCommitSubscriptionConfig =
            RecurringCommitSubscriptionConfig.builder()
                .allocation(RecurringCommitSubscriptionConfig.Allocation.INDIVIDUAL)
                .applySeatIncreaseConfig(
                    RecurringCommitSubscriptionConfig.ApplySeatIncreaseConfig.builder()
                        .isProrated(true)
                        .build()
                )
                .subscriptionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedRecurringCommitSubscriptionConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(recurringCommitSubscriptionConfig),
                jacksonTypeRef<RecurringCommitSubscriptionConfig>(),
            )

        assertThat(roundtrippedRecurringCommitSubscriptionConfig)
            .isEqualTo(recurringCommitSubscriptionConfig)
    }
}
