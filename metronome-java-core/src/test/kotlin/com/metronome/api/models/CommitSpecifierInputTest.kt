// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.JsonValue
import com.metronome.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommitSpecifierInputTest {

    @Test
    fun create() {
        val commitSpecifierInput =
            CommitSpecifierInput.builder()
                .presentationGroupValues(
                    CommitSpecifierInput.PresentationGroupValues.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .pricingGroupValues(
                    CommitSpecifierInput.PricingGroupValues.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addProductTag("string")
                .build()

        assertThat(commitSpecifierInput.presentationGroupValues())
            .contains(
                CommitSpecifierInput.PresentationGroupValues.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(commitSpecifierInput.pricingGroupValues())
            .contains(
                CommitSpecifierInput.PricingGroupValues.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(commitSpecifierInput.productId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(commitSpecifierInput.productTags().getOrNull()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val commitSpecifierInput =
            CommitSpecifierInput.builder()
                .presentationGroupValues(
                    CommitSpecifierInput.PresentationGroupValues.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .pricingGroupValues(
                    CommitSpecifierInput.PricingGroupValues.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addProductTag("string")
                .build()

        val roundtrippedCommitSpecifierInput =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(commitSpecifierInput),
                jacksonTypeRef<CommitSpecifierInput>(),
            )

        assertThat(roundtrippedCommitSpecifierInput).isEqualTo(commitSpecifierInput)
    }
}
