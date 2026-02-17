// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.BaseDeserializer
import com.metronome.api.core.BaseSerializer
import com.metronome.api.core.Enum
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.checkRequired
import com.metronome.api.core.getOrThrow
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.util.Objects
import java.util.Optional

/**
 * Either a **parent** configuration with a list of children or a **child** configuration with a
 * single parent.
 */
@JsonDeserialize(using = HierarchyConfiguration.Deserializer::class)
@JsonSerialize(using = HierarchyConfiguration.Serializer::class)
class HierarchyConfiguration
private constructor(
    private val parent: ParentHierarchyConfiguration? = null,
    private val child: ChildHierarchyConfiguration? = null,
    private val _json: JsonValue? = null,
) {

    fun parent(): Optional<ParentHierarchyConfiguration> = Optional.ofNullable(parent)

    fun child(): Optional<ChildHierarchyConfiguration> = Optional.ofNullable(child)

    fun isParent(): Boolean = parent != null

    fun isChild(): Boolean = child != null

    fun asParent(): ParentHierarchyConfiguration = parent.getOrThrow("parent")

    fun asChild(): ChildHierarchyConfiguration = child.getOrThrow("child")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T {
        return when {
            parent != null -> visitor.visitParent(parent)
            child != null -> visitor.visitChild(child)
            else -> visitor.unknown(_json)
        }
    }

    private var validated: Boolean = false

    fun validate(): HierarchyConfiguration = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitParent(parent: ParentHierarchyConfiguration) {
                    parent.validate()
                }

                override fun visitChild(child: ChildHierarchyConfiguration) {
                    child.validate()
                }
            }
        )
        validated = true
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HierarchyConfiguration && parent == other.parent && child == other.child /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(parent, child) /* spotless:on */

    override fun toString(): String =
        when {
            parent != null -> "HierarchyConfiguration{parent=$parent}"
            child != null -> "HierarchyConfiguration{child=$child}"
            _json != null -> "HierarchyConfiguration{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid HierarchyConfiguration")
        }

    companion object {

        @JvmStatic
        fun ofParent(parent: ParentHierarchyConfiguration) = HierarchyConfiguration(parent = parent)

        @JvmStatic
        fun ofChild(child: ChildHierarchyConfiguration) = HierarchyConfiguration(child = child)
    }

    /**
     * An interface that defines how to map each variant of [HierarchyConfiguration] to a value of
     * type [T].
     */
    interface Visitor<out T> {

        fun visitParent(parent: ParentHierarchyConfiguration): T

        fun visitChild(child: ChildHierarchyConfiguration): T

        /**
         * Maps an unknown variant of [HierarchyConfiguration] to a value of type [T].
         *
         * An instance of [HierarchyConfiguration] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws MetronomeInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw MetronomeInvalidDataException("Unknown HierarchyConfiguration: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<HierarchyConfiguration>(HierarchyConfiguration::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): HierarchyConfiguration {
            val json = JsonValue.fromJsonNode(node)

            tryDeserialize(node, jacksonTypeRef<ParentHierarchyConfiguration>()) { it.validate() }
                ?.let {
                    return HierarchyConfiguration(parent = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<ChildHierarchyConfiguration>()) { it.validate() }
                ?.let {
                    return HierarchyConfiguration(child = it, _json = json)
                }

            return HierarchyConfiguration(_json = json)
        }
    }

    internal class Serializer :
        BaseSerializer<HierarchyConfiguration>(HierarchyConfiguration::class) {

        override fun serialize(
            value: HierarchyConfiguration,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.parent != null -> generator.writeObject(value.parent)
                value.child != null -> generator.writeObject(value.child)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid HierarchyConfiguration")
            }
        }
    }

    @NoAutoDetect
    class ParentHierarchyConfiguration
    @JsonCreator
    private constructor(
        @JsonProperty("children")
        @ExcludeMissing
        private val children: JsonField<List<Child>> = JsonMissing.of(),
        @JsonProperty("parent_behavior")
        @ExcludeMissing
        private val parentBehavior: JsonField<ParentBehavior> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** List of contracts that belong to this parent. */
        fun children(): List<Child> = children.getRequired("children")

        fun parentBehavior(): Optional<ParentBehavior> =
            Optional.ofNullable(parentBehavior.getNullable("parent_behavior"))

        /** List of contracts that belong to this parent. */
        @JsonProperty("children") @ExcludeMissing fun _children(): JsonField<List<Child>> = children

        @JsonProperty("parent_behavior")
        @ExcludeMissing
        fun _parentBehavior(): JsonField<ParentBehavior> = parentBehavior

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ParentHierarchyConfiguration = apply {
            if (validated) {
                return@apply
            }

            children().forEach { it.validate() }
            parentBehavior().ifPresent { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ParentHierarchyConfiguration]. */
        class Builder internal constructor() {

            private var children: JsonField<MutableList<Child>>? = null
            private var parentBehavior: JsonField<ParentBehavior> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(parentHierarchyConfiguration: ParentHierarchyConfiguration) = apply {
                children = parentHierarchyConfiguration.children.map { it.toMutableList() }
                parentBehavior = parentHierarchyConfiguration.parentBehavior
                additionalProperties =
                    parentHierarchyConfiguration.additionalProperties.toMutableMap()
            }

            /** List of contracts that belong to this parent. */
            fun children(children: List<Child>) = children(JsonField.of(children))

            /** List of contracts that belong to this parent. */
            fun children(children: JsonField<List<Child>>) = apply {
                this.children = children.map { it.toMutableList() }
            }

            /** List of contracts that belong to this parent. */
            fun addChild(child: Child) = apply {
                children =
                    (children ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(child)
                    }
            }

            fun parentBehavior(parentBehavior: ParentBehavior) =
                parentBehavior(JsonField.of(parentBehavior))

            fun parentBehavior(parentBehavior: JsonField<ParentBehavior>) = apply {
                this.parentBehavior = parentBehavior
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): ParentHierarchyConfiguration =
                ParentHierarchyConfiguration(
                    checkRequired("children", children).map { it.toImmutable() },
                    parentBehavior,
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class Child
        @JsonCreator
        private constructor(
            @JsonProperty("contract_id")
            @ExcludeMissing
            private val contractId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("customer_id")
            @ExcludeMissing
            private val customerId: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun contractId(): String = contractId.getRequired("contract_id")

            fun customerId(): String = customerId.getRequired("customer_id")

            @JsonProperty("contract_id")
            @ExcludeMissing
            fun _contractId(): JsonField<String> = contractId

            @JsonProperty("customer_id")
            @ExcludeMissing
            fun _customerId(): JsonField<String> = customerId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Child = apply {
                if (validated) {
                    return@apply
                }

                contractId()
                customerId()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Child]. */
            class Builder internal constructor() {

                private var contractId: JsonField<String>? = null
                private var customerId: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(child: Child) = apply {
                    contractId = child.contractId
                    customerId = child.customerId
                    additionalProperties = child.additionalProperties.toMutableMap()
                }

                fun contractId(contractId: String) = contractId(JsonField.of(contractId))

                fun contractId(contractId: JsonField<String>) = apply {
                    this.contractId = contractId
                }

                fun customerId(customerId: String) = customerId(JsonField.of(customerId))

                fun customerId(customerId: JsonField<String>) = apply {
                    this.customerId = customerId
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): Child =
                    Child(
                        checkRequired("contractId", contractId),
                        checkRequired("customerId", customerId),
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Child && contractId == other.contractId && customerId == other.customerId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(contractId, customerId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Child{contractId=$contractId, customerId=$customerId, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class ParentBehavior
        @JsonCreator
        private constructor(
            @JsonProperty("invoice_consolidation_type")
            @ExcludeMissing
            private val invoiceConsolidationType: JsonField<InvoiceConsolidationType> =
                JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * Indicates the desired behavior of consolidated invoices generated by the parent in a
             * customer hierarchy
             *
             * **CONCATENATE**: Statements on the invoices of child customers will be appended to
             * the consolidated invoice
             *
             * **NONE**: Do not generate consolidated invoices
             */
            fun invoiceConsolidationType(): Optional<InvoiceConsolidationType> =
                Optional.ofNullable(
                    invoiceConsolidationType.getNullable("invoice_consolidation_type")
                )

            /**
             * Indicates the desired behavior of consolidated invoices generated by the parent in a
             * customer hierarchy
             *
             * **CONCATENATE**: Statements on the invoices of child customers will be appended to
             * the consolidated invoice
             *
             * **NONE**: Do not generate consolidated invoices
             */
            @JsonProperty("invoice_consolidation_type")
            @ExcludeMissing
            fun _invoiceConsolidationType(): JsonField<InvoiceConsolidationType> =
                invoiceConsolidationType

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): ParentBehavior = apply {
                if (validated) {
                    return@apply
                }

                invoiceConsolidationType()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ParentBehavior]. */
            class Builder internal constructor() {

                private var invoiceConsolidationType: JsonField<InvoiceConsolidationType> =
                    JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(parentBehavior: ParentBehavior) = apply {
                    invoiceConsolidationType = parentBehavior.invoiceConsolidationType
                    additionalProperties = parentBehavior.additionalProperties.toMutableMap()
                }

                /**
                 * Indicates the desired behavior of consolidated invoices generated by the parent
                 * in a customer hierarchy
                 *
                 * **CONCATENATE**: Statements on the invoices of child customers will be appended
                 * to the consolidated invoice
                 *
                 * **NONE**: Do not generate consolidated invoices
                 */
                fun invoiceConsolidationType(invoiceConsolidationType: InvoiceConsolidationType) =
                    invoiceConsolidationType(JsonField.of(invoiceConsolidationType))

                /**
                 * Indicates the desired behavior of consolidated invoices generated by the parent
                 * in a customer hierarchy
                 *
                 * **CONCATENATE**: Statements on the invoices of child customers will be appended
                 * to the consolidated invoice
                 *
                 * **NONE**: Do not generate consolidated invoices
                 */
                fun invoiceConsolidationType(
                    invoiceConsolidationType: JsonField<InvoiceConsolidationType>
                ) = apply { this.invoiceConsolidationType = invoiceConsolidationType }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): ParentBehavior =
                    ParentBehavior(invoiceConsolidationType, additionalProperties.toImmutable())
            }

            /**
             * Indicates the desired behavior of consolidated invoices generated by the parent in a
             * customer hierarchy
             *
             * **CONCATENATE**: Statements on the invoices of child customers will be appended to
             * the consolidated invoice
             *
             * **NONE**: Do not generate consolidated invoices
             */
            class InvoiceConsolidationType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val CONCATENATE = of("CONCATENATE")

                    @JvmField val NONE = of("NONE")

                    @JvmStatic fun of(value: String) = InvoiceConsolidationType(JsonField.of(value))
                }

                /** An enum containing [InvoiceConsolidationType]'s known values. */
                enum class Known {
                    CONCATENATE,
                    NONE,
                }

                /**
                 * An enum containing [InvoiceConsolidationType]'s known values, as well as an
                 * [_UNKNOWN] member.
                 *
                 * An instance of [InvoiceConsolidationType] can contain an unknown value in a
                 * couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    CONCATENATE,
                    NONE,
                    /**
                     * An enum member indicating that [InvoiceConsolidationType] was instantiated
                     * with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        CONCATENATE -> Value.CONCATENATE
                        NONE -> Value.NONE
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws MetronomeInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        CONCATENATE -> Known.CONCATENATE
                        NONE -> Known.NONE
                        else ->
                            throw MetronomeInvalidDataException(
                                "Unknown InvoiceConsolidationType: $value"
                            )
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws MetronomeInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        MetronomeInvalidDataException("Value is not a String")
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is InvoiceConsolidationType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ParentBehavior && invoiceConsolidationType == other.invoiceConsolidationType && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(invoiceConsolidationType, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ParentBehavior{invoiceConsolidationType=$invoiceConsolidationType, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ParentHierarchyConfiguration && children == other.children && parentBehavior == other.parentBehavior && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(children, parentBehavior, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ParentHierarchyConfiguration{children=$children, parentBehavior=$parentBehavior, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class ChildHierarchyConfiguration
    @JsonCreator
    private constructor(
        @JsonProperty("parent")
        @ExcludeMissing
        private val parent: JsonField<Parent> = JsonMissing.of(),
        @JsonProperty("payer")
        @ExcludeMissing
        private val payer: JsonField<Payer> = JsonMissing.of(),
        @JsonProperty("usage_statement_behavior")
        @ExcludeMissing
        private val usageStatementBehavior: JsonField<UsageStatementBehavior> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The single parent contract/customer for this child. */
        fun parent(): Parent = parent.getRequired("parent")

        /**
         * Indicates which customer should pay for the child's invoice charges
         *
         * **SELF**: The child pays for its own invoice charges
         *
         * **PARENT**: The parent pays for the child's invoice charges
         */
        fun payer(): Optional<Payer> = Optional.ofNullable(payer.getNullable("payer"))

        /**
         * Indicates the behavior of the child's invoice statements on the parent's invoices.
         *
         * **CONSOLIDATE**: Child's invoice statements will be added to parent's consolidated
         * invoices
         *
         * **SEPARATE**: Child's invoice statements will appear not appear on parent's consolidated
         * invoices
         */
        fun usageStatementBehavior(): Optional<UsageStatementBehavior> =
            Optional.ofNullable(usageStatementBehavior.getNullable("usage_statement_behavior"))

        /** The single parent contract/customer for this child. */
        @JsonProperty("parent") @ExcludeMissing fun _parent(): JsonField<Parent> = parent

        /**
         * Indicates which customer should pay for the child's invoice charges
         *
         * **SELF**: The child pays for its own invoice charges
         *
         * **PARENT**: The parent pays for the child's invoice charges
         */
        @JsonProperty("payer") @ExcludeMissing fun _payer(): JsonField<Payer> = payer

        /**
         * Indicates the behavior of the child's invoice statements on the parent's invoices.
         *
         * **CONSOLIDATE**: Child's invoice statements will be added to parent's consolidated
         * invoices
         *
         * **SEPARATE**: Child's invoice statements will appear not appear on parent's consolidated
         * invoices
         */
        @JsonProperty("usage_statement_behavior")
        @ExcludeMissing
        fun _usageStatementBehavior(): JsonField<UsageStatementBehavior> = usageStatementBehavior

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ChildHierarchyConfiguration = apply {
            if (validated) {
                return@apply
            }

            parent().validate()
            payer()
            usageStatementBehavior()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ChildHierarchyConfiguration]. */
        class Builder internal constructor() {

            private var parent: JsonField<Parent>? = null
            private var payer: JsonField<Payer> = JsonMissing.of()
            private var usageStatementBehavior: JsonField<UsageStatementBehavior> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(childHierarchyConfiguration: ChildHierarchyConfiguration) = apply {
                parent = childHierarchyConfiguration.parent
                payer = childHierarchyConfiguration.payer
                usageStatementBehavior = childHierarchyConfiguration.usageStatementBehavior
                additionalProperties =
                    childHierarchyConfiguration.additionalProperties.toMutableMap()
            }

            /** The single parent contract/customer for this child. */
            fun parent(parent: Parent) = parent(JsonField.of(parent))

            /** The single parent contract/customer for this child. */
            fun parent(parent: JsonField<Parent>) = apply { this.parent = parent }

            /**
             * Indicates which customer should pay for the child's invoice charges
             *
             * **SELF**: The child pays for its own invoice charges
             *
             * **PARENT**: The parent pays for the child's invoice charges
             */
            fun payer(payer: Payer) = payer(JsonField.of(payer))

            /**
             * Indicates which customer should pay for the child's invoice charges
             *
             * **SELF**: The child pays for its own invoice charges
             *
             * **PARENT**: The parent pays for the child's invoice charges
             */
            fun payer(payer: JsonField<Payer>) = apply { this.payer = payer }

            /**
             * Indicates the behavior of the child's invoice statements on the parent's invoices.
             *
             * **CONSOLIDATE**: Child's invoice statements will be added to parent's consolidated
             * invoices
             *
             * **SEPARATE**: Child's invoice statements will appear not appear on parent's
             * consolidated invoices
             */
            fun usageStatementBehavior(usageStatementBehavior: UsageStatementBehavior) =
                usageStatementBehavior(JsonField.of(usageStatementBehavior))

            /**
             * Indicates the behavior of the child's invoice statements on the parent's invoices.
             *
             * **CONSOLIDATE**: Child's invoice statements will be added to parent's consolidated
             * invoices
             *
             * **SEPARATE**: Child's invoice statements will appear not appear on parent's
             * consolidated invoices
             */
            fun usageStatementBehavior(usageStatementBehavior: JsonField<UsageStatementBehavior>) =
                apply {
                    this.usageStatementBehavior = usageStatementBehavior
                }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): ChildHierarchyConfiguration =
                ChildHierarchyConfiguration(
                    checkRequired("parent", parent),
                    payer,
                    usageStatementBehavior,
                    additionalProperties.toImmutable(),
                )
        }

        /** The single parent contract/customer for this child. */
        @NoAutoDetect
        class Parent
        @JsonCreator
        private constructor(
            @JsonProperty("contract_id")
            @ExcludeMissing
            private val contractId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("customer_id")
            @ExcludeMissing
            private val customerId: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun contractId(): String = contractId.getRequired("contract_id")

            fun customerId(): String = customerId.getRequired("customer_id")

            @JsonProperty("contract_id")
            @ExcludeMissing
            fun _contractId(): JsonField<String> = contractId

            @JsonProperty("customer_id")
            @ExcludeMissing
            fun _customerId(): JsonField<String> = customerId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Parent = apply {
                if (validated) {
                    return@apply
                }

                contractId()
                customerId()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Parent]. */
            class Builder internal constructor() {

                private var contractId: JsonField<String>? = null
                private var customerId: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(parent: Parent) = apply {
                    contractId = parent.contractId
                    customerId = parent.customerId
                    additionalProperties = parent.additionalProperties.toMutableMap()
                }

                fun contractId(contractId: String) = contractId(JsonField.of(contractId))

                fun contractId(contractId: JsonField<String>) = apply {
                    this.contractId = contractId
                }

                fun customerId(customerId: String) = customerId(JsonField.of(customerId))

                fun customerId(customerId: JsonField<String>) = apply {
                    this.customerId = customerId
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): Parent =
                    Parent(
                        checkRequired("contractId", contractId),
                        checkRequired("customerId", customerId),
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Parent && contractId == other.contractId && customerId == other.customerId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(contractId, customerId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Parent{contractId=$contractId, customerId=$customerId, additionalProperties=$additionalProperties}"
        }

        /**
         * Indicates which customer should pay for the child's invoice charges
         *
         * **SELF**: The child pays for its own invoice charges
         *
         * **PARENT**: The parent pays for the child's invoice charges
         */
        class Payer @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val SELF = of("SELF")

                @JvmField val PARENT = of("PARENT")

                @JvmStatic fun of(value: String) = Payer(JsonField.of(value))
            }

            /** An enum containing [Payer]'s known values. */
            enum class Known {
                SELF,
                PARENT,
            }

            /**
             * An enum containing [Payer]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Payer] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                SELF,
                PARENT,
                /**
                 * An enum member indicating that [Payer] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    SELF -> Value.SELF
                    PARENT -> Value.PARENT
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws MetronomeInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    SELF -> Known.SELF
                    PARENT -> Known.PARENT
                    else -> throw MetronomeInvalidDataException("Unknown Payer: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws MetronomeInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    MetronomeInvalidDataException("Value is not a String")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Payer && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * Indicates the behavior of the child's invoice statements on the parent's invoices.
         *
         * **CONSOLIDATE**: Child's invoice statements will be added to parent's consolidated
         * invoices
         *
         * **SEPARATE**: Child's invoice statements will appear not appear on parent's consolidated
         * invoices
         */
        class UsageStatementBehavior
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val CONSOLIDATE = of("CONSOLIDATE")

                @JvmField val SEPARATE = of("SEPARATE")

                @JvmStatic fun of(value: String) = UsageStatementBehavior(JsonField.of(value))
            }

            /** An enum containing [UsageStatementBehavior]'s known values. */
            enum class Known {
                CONSOLIDATE,
                SEPARATE,
            }

            /**
             * An enum containing [UsageStatementBehavior]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [UsageStatementBehavior] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CONSOLIDATE,
                SEPARATE,
                /**
                 * An enum member indicating that [UsageStatementBehavior] was instantiated with an
                 * unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    CONSOLIDATE -> Value.CONSOLIDATE
                    SEPARATE -> Value.SEPARATE
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws MetronomeInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    CONSOLIDATE -> Known.CONSOLIDATE
                    SEPARATE -> Known.SEPARATE
                    else ->
                        throw MetronomeInvalidDataException(
                            "Unknown UsageStatementBehavior: $value"
                        )
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws MetronomeInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    MetronomeInvalidDataException("Value is not a String")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is UsageStatementBehavior && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ChildHierarchyConfiguration && parent == other.parent && payer == other.payer && usageStatementBehavior == other.usageStatementBehavior && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(parent, payer, usageStatementBehavior, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ChildHierarchyConfiguration{parent=$parent, payer=$payer, usageStatementBehavior=$usageStatementBehavior, additionalProperties=$additionalProperties}"
    }
}
