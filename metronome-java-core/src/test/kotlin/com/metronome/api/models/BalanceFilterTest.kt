// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.JsonValue
import com.metronome.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BalanceFilterTest {

    @Test
    fun create() {
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

        assertThat(balanceFilter.balanceTypes().getOrNull())
            .containsExactly(BalanceFilter.BalanceType.PREPAID_COMMIT)
        assertThat(balanceFilter.customFields())
            .contains(
                BalanceFilter.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(balanceFilter.ids().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
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

        val roundtrippedBalanceFilter =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(balanceFilter),
                jacksonTypeRef<BalanceFilter>(),
            )

        assertThat(roundtrippedBalanceFilter).isEqualTo(balanceFilter)
    }
}
