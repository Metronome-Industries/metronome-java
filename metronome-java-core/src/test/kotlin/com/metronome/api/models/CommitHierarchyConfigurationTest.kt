// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommitHierarchyConfigurationTest {

    @Test
    fun create() {
        val commitHierarchyConfiguration =
            CommitHierarchyConfiguration.builder()
                .childAccess(
                    CommitHierarchyConfiguration.ChildAccess.CommitHierarchyChildAccessAll.builder()
                        .type(
                            CommitHierarchyConfiguration.ChildAccess.CommitHierarchyChildAccessAll
                                .Type
                                .ALL
                        )
                        .build()
                )
                .build()

        assertThat(commitHierarchyConfiguration.childAccess())
            .isEqualTo(
                CommitHierarchyConfiguration.ChildAccess.ofCommitHierarchyChildAccessAll(
                    CommitHierarchyConfiguration.ChildAccess.CommitHierarchyChildAccessAll.builder()
                        .type(
                            CommitHierarchyConfiguration.ChildAccess.CommitHierarchyChildAccessAll
                                .Type
                                .ALL
                        )
                        .build()
                )
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val commitHierarchyConfiguration =
            CommitHierarchyConfiguration.builder()
                .childAccess(
                    CommitHierarchyConfiguration.ChildAccess.CommitHierarchyChildAccessAll.builder()
                        .type(
                            CommitHierarchyConfiguration.ChildAccess.CommitHierarchyChildAccessAll
                                .Type
                                .ALL
                        )
                        .build()
                )
                .build()

        val roundtrippedCommitHierarchyConfiguration =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(commitHierarchyConfiguration),
                jacksonTypeRef<CommitHierarchyConfiguration>(),
            )

        assertThat(roundtrippedCommitHierarchyConfiguration).isEqualTo(commitHierarchyConfiguration)
    }
}
