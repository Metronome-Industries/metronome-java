// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BalanceFilterTest {

    @Test
    fun createBalanceFilter() {
        val balanceFilter =
            BalanceFilter.builder()
                .addBalanceType(BalanceFilter.BalanceType.PREPAID_COMMIT)
                .customFields(
                    BalanceFilter.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(balanceFilter).isNotNull
        assertThat(balanceFilter.balanceTypes().get())
            .containsExactly(BalanceFilter.BalanceType.PREPAID_COMMIT)
        assertThat(balanceFilter.customFields())
            .contains(
                BalanceFilter.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(balanceFilter.ids().get())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
