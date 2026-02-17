// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CommitSpecifierTest {

    @Test
    fun createCommitSpecifier() {
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
        assertThat(commitSpecifier).isNotNull
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
        assertThat(commitSpecifier.productTags().get()).containsExactly("string")
    }
}
