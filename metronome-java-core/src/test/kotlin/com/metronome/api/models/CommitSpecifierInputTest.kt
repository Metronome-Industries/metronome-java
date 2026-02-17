// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CommitSpecifierInputTest {

    @Test
    fun createCommitSpecifierInput() {
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
        assertThat(commitSpecifierInput).isNotNull
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
        assertThat(commitSpecifierInput.productTags().get()).containsExactly("string")
    }
}
