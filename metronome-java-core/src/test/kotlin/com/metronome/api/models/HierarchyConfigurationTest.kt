// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.JsonValue
import com.metronome.api.core.jsonMapper
import com.metronome.api.errors.MetronomeInvalidDataException
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class HierarchyConfigurationTest {

    @Test
    fun ofParent() {
        val parent =
            HierarchyConfiguration.ParentHierarchyConfiguration.builder()
                .addChild(
                    HierarchyConfiguration.ParentHierarchyConfiguration.Child.builder()
                        .contractId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .parentBehavior(
                    HierarchyConfiguration.ParentHierarchyConfiguration.ParentBehavior.builder()
                        .invoiceConsolidationType(
                            HierarchyConfiguration.ParentHierarchyConfiguration.ParentBehavior
                                .InvoiceConsolidationType
                                .CONCATENATE
                        )
                        .build()
                )
                .build()

        val hierarchyConfiguration = HierarchyConfiguration.ofParent(parent)

        assertThat(hierarchyConfiguration.parent()).contains(parent)
        assertThat(hierarchyConfiguration.child()).isEmpty
    }

    @Test
    fun ofParentRoundtrip() {
        val jsonMapper = jsonMapper()
        val hierarchyConfiguration =
            HierarchyConfiguration.ofParent(
                HierarchyConfiguration.ParentHierarchyConfiguration.builder()
                    .addChild(
                        HierarchyConfiguration.ParentHierarchyConfiguration.Child.builder()
                            .contractId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                    .parentBehavior(
                        HierarchyConfiguration.ParentHierarchyConfiguration.ParentBehavior.builder()
                            .invoiceConsolidationType(
                                HierarchyConfiguration.ParentHierarchyConfiguration.ParentBehavior
                                    .InvoiceConsolidationType
                                    .CONCATENATE
                            )
                            .build()
                    )
                    .build()
            )

        val roundtrippedHierarchyConfiguration =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(hierarchyConfiguration),
                jacksonTypeRef<HierarchyConfiguration>(),
            )

        assertThat(roundtrippedHierarchyConfiguration).isEqualTo(hierarchyConfiguration)
    }

    @Test
    fun ofChild() {
        val child =
            HierarchyConfiguration.ChildHierarchyConfiguration.builder()
                .parent(
                    HierarchyConfiguration.ChildHierarchyConfiguration.Parent.builder()
                        .contractId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .payer(HierarchyConfiguration.ChildHierarchyConfiguration.Payer.SELF)
                .usageStatementBehavior(
                    HierarchyConfiguration.ChildHierarchyConfiguration.UsageStatementBehavior
                        .CONSOLIDATE
                )
                .build()

        val hierarchyConfiguration = HierarchyConfiguration.ofChild(child)

        assertThat(hierarchyConfiguration.parent()).isEmpty
        assertThat(hierarchyConfiguration.child()).contains(child)
    }

    @Test
    fun ofChildRoundtrip() {
        val jsonMapper = jsonMapper()
        val hierarchyConfiguration =
            HierarchyConfiguration.ofChild(
                HierarchyConfiguration.ChildHierarchyConfiguration.builder()
                    .parent(
                        HierarchyConfiguration.ChildHierarchyConfiguration.Parent.builder()
                            .contractId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                    .payer(HierarchyConfiguration.ChildHierarchyConfiguration.Payer.SELF)
                    .usageStatementBehavior(
                        HierarchyConfiguration.ChildHierarchyConfiguration.UsageStatementBehavior
                            .CONSOLIDATE
                    )
                    .build()
            )

        val roundtrippedHierarchyConfiguration =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(hierarchyConfiguration),
                jacksonTypeRef<HierarchyConfiguration>(),
            )

        assertThat(roundtrippedHierarchyConfiguration).isEqualTo(hierarchyConfiguration)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val hierarchyConfiguration =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<HierarchyConfiguration>())

        val e = assertThrows<MetronomeInvalidDataException> { hierarchyConfiguration.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
