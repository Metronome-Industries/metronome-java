// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RecurringCommitSubscriptionConfigTest {

    @Test
    fun createRecurringCommitSubscriptionConfig() {
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
        assertThat(recurringCommitSubscriptionConfig).isNotNull
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
}
