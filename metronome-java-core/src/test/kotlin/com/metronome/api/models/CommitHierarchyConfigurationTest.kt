// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CommitHierarchyConfigurationTest {

    @Test
    fun createCommitHierarchyConfiguration() {
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
        assertThat(commitHierarchyConfiguration).isNotNull
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
}
