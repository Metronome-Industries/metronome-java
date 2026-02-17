// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.JsonValue
import com.metronome.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommitSpecifierTest {

    @Test
    fun create() {
        val commitSpecifier =
            CommitSpecifier.builder()
                .presentationGroupValues(
                    CommitSpecifier.PresentationGroupValues.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .pricingGroupValues(
                    CommitSpecifier.PricingGroupValues.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addProductTag("string")
                .build()

        assertThat(commitSpecifier.presentationGroupValues())
            .contains(
                CommitSpecifier.PresentationGroupValues.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(commitSpecifier.pricingGroupValues())
            .contains(
                CommitSpecifier.PricingGroupValues.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(commitSpecifier.productId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(commitSpecifier.productTags().getOrNull()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val commitSpecifier =
            CommitSpecifier.builder()
                .presentationGroupValues(
                    CommitSpecifier.PresentationGroupValues.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .pricingGroupValues(
                    CommitSpecifier.PricingGroupValues.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addProductTag("string")
                .build()

        val roundtrippedCommitSpecifier =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(commitSpecifier),
                jacksonTypeRef<CommitSpecifier>(),
            )

        assertThat(roundtrippedCommitSpecifier).isEqualTo(commitSpecifier)
    }
}
