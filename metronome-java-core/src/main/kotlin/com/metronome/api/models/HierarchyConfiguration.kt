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
import com.metronome.api.core.allMaxBy
import com.metronome.api.core.checkKnown
import com.metronome.api.core.checkRequired
import com.metronome.api.core.getOrThrow
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

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

    /**
     * Maps this instance's current variant to a value of type [T] using the given [visitor].
     *
     * Note that this method is _not_ forwards compatible with new variants from the API, unless
     * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of the
     * SDK gracefully, consider overriding [Visitor.unknown]:
     * ```java
     * import com.metronome.api.core.JsonValue;
     * import java.util.Optional;
     *
     * Optional<String> result = hierarchyConfiguration.accept(new HierarchyConfiguration.Visitor<Optional<String>>() {
     *     @Override
     *     public Optional<String> visitParent(ParentHierarchyConfiguration parent) {
     *         return Optional.of(parent.toString());
     *     }
     *
     *     // ...
     *
     *     @Override
     *     public Optional<String> unknown(JsonValue json) {
     *         // Or inspect the `json`.
     *         return Optional.empty();
     *     }
     * });
     * ```
     *
     * @throws MetronomeInvalidDataException if [Visitor.unknown] is not overridden in [visitor] and
     *   the current variant is unknown.
     */
    fun <T> accept(visitor: Visitor<T>): T =
        when {
            parent != null -> visitor.visitParent(parent)
            child != null -> visitor.visitChild(child)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
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

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: MetronomeInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        accept(
            object : Visitor<Int> {
                override fun visitParent(parent: ParentHierarchyConfiguration) = parent.validity()

                override fun visitChild(child: ChildHierarchyConfiguration) = child.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is HierarchyConfiguration && parent == other.parent && child == other.child
    }

    override fun hashCode(): Int = Objects.hash(parent, child)

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

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<ParentHierarchyConfiguration>())?.let {
                            HierarchyConfiguration(parent = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<ChildHierarchyConfiguration>())?.let {
                            HierarchyConfiguration(child = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> HierarchyConfiguration(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
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

    class ParentHierarchyConfiguration
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val children: JsonField<List<Child>>,
        private val parentBehavior: JsonField<ParentBehavior>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("children")
            @ExcludeMissing
            children: JsonField<List<Child>> = JsonMissing.of(),
            @JsonProperty("parent_behavior")
            @ExcludeMissing
            parentBehavior: JsonField<ParentBehavior> = JsonMissing.of(),
        ) : this(children, parentBehavior, mutableMapOf())

        /**
         * List of contracts that belong to this parent.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun children(): List<Child> = children.getRequired("children")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun parentBehavior(): Optional<ParentBehavior> =
            parentBehavior.getOptional("parent_behavior")

        /**
         * Returns the raw JSON value of [children].
         *
         * Unlike [children], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("children") @ExcludeMissing fun _children(): JsonField<List<Child>> = children

        /**
         * Returns the raw JSON value of [parentBehavior].
         *
         * Unlike [parentBehavior], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("parent_behavior")
        @ExcludeMissing
        fun _parentBehavior(): JsonField<ParentBehavior> = parentBehavior

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [ParentHierarchyConfiguration].
             *
             * The following fields are required:
             * ```java
             * .children()
             * ```
             */
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

            /**
             * Sets [Builder.children] to an arbitrary JSON value.
             *
             * You should usually call [Builder.children] with a well-typed `List<Child>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun children(children: JsonField<List<Child>>) = apply {
                this.children = children.map { it.toMutableList() }
            }

            /**
             * Adds a single [Child] to [children].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addChild(child: Child) = apply {
                children =
                    (children ?: JsonField.of(mutableListOf())).also {
                        checkKnown("children", it).add(child)
                    }
            }

            fun parentBehavior(parentBehavior: ParentBehavior) =
                parentBehavior(JsonField.of(parentBehavior))

            /**
             * Sets [Builder.parentBehavior] to an arbitrary JSON value.
             *
             * You should usually call [Builder.parentBehavior] with a well-typed [ParentBehavior]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
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

            /**
             * Returns an immutable instance of [ParentHierarchyConfiguration].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .children()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ParentHierarchyConfiguration =
                ParentHierarchyConfiguration(
                    checkRequired("children", children).map { it.toImmutable() },
                    parentBehavior,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): ParentHierarchyConfiguration = apply {
            if (validated) {
                return@apply
            }

            children().forEach { it.validate() }
            parentBehavior().ifPresent { it.validate() }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (children.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (parentBehavior.asKnown().getOrNull()?.validity() ?: 0)

        class Child
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val contractId: JsonField<String>,
            private val customerId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("contract_id")
                @ExcludeMissing
                contractId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("customer_id")
                @ExcludeMissing
                customerId: JsonField<String> = JsonMissing.of(),
            ) : this(contractId, customerId, mutableMapOf())

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun contractId(): String = contractId.getRequired("contract_id")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun customerId(): String = customerId.getRequired("customer_id")

            /**
             * Returns the raw JSON value of [contractId].
             *
             * Unlike [contractId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("contract_id")
            @ExcludeMissing
            fun _contractId(): JsonField<String> = contractId

            /**
             * Returns the raw JSON value of [customerId].
             *
             * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("customer_id")
            @ExcludeMissing
            fun _customerId(): JsonField<String> = customerId

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [Child].
                 *
                 * The following fields are required:
                 * ```java
                 * .contractId()
                 * .customerId()
                 * ```
                 */
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

                /**
                 * Sets [Builder.contractId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.contractId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun contractId(contractId: JsonField<String>) = apply {
                    this.contractId = contractId
                }

                fun customerId(customerId: String) = customerId(JsonField.of(customerId))

                /**
                 * Sets [Builder.customerId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.customerId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
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

                /**
                 * Returns an immutable instance of [Child].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .contractId()
                 * .customerId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Child =
                    Child(
                        checkRequired("contractId", contractId),
                        checkRequired("customerId", customerId),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Child = apply {
                if (validated) {
                    return@apply
                }

                contractId()
                customerId()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (contractId.asKnown().isPresent) 1 else 0) +
                    (if (customerId.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Child &&
                    contractId == other.contractId &&
                    customerId == other.customerId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(contractId, customerId, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Child{contractId=$contractId, customerId=$customerId, additionalProperties=$additionalProperties}"
        }

        class ParentBehavior
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val invoiceConsolidationType: JsonField<InvoiceConsolidationType>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("invoice_consolidation_type")
                @ExcludeMissing
                invoiceConsolidationType: JsonField<InvoiceConsolidationType> = JsonMissing.of()
            ) : this(invoiceConsolidationType, mutableMapOf())

            /**
             * Indicates the desired behavior of consolidated invoices generated by the parent in a
             * customer hierarchy
             *
             * **CONCATENATE**: Statements on the invoices of child customers will be appended to
             * the consolidated invoice
             *
             * **NONE**: Do not generate consolidated invoices
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun invoiceConsolidationType(): Optional<InvoiceConsolidationType> =
                invoiceConsolidationType.getOptional("invoice_consolidation_type")

            /**
             * Returns the raw JSON value of [invoiceConsolidationType].
             *
             * Unlike [invoiceConsolidationType], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("invoice_consolidation_type")
            @ExcludeMissing
            fun _invoiceConsolidationType(): JsonField<InvoiceConsolidationType> =
                invoiceConsolidationType

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [ParentBehavior]. */
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
                 * Sets [Builder.invoiceConsolidationType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.invoiceConsolidationType] with a well-typed
                 * [InvoiceConsolidationType] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
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

                /**
                 * Returns an immutable instance of [ParentBehavior].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): ParentBehavior =
                    ParentBehavior(invoiceConsolidationType, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): ParentBehavior = apply {
                if (validated) {
                    return@apply
                }

                invoiceConsolidationType().ifPresent { it.validate() }
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (invoiceConsolidationType.asKnown().getOrNull()?.validity() ?: 0)

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

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws MetronomeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): InvoiceConsolidationType = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is InvoiceConsolidationType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ParentBehavior &&
                    invoiceConsolidationType == other.invoiceConsolidationType &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(invoiceConsolidationType, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ParentBehavior{invoiceConsolidationType=$invoiceConsolidationType, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ParentHierarchyConfiguration &&
                children == other.children &&
                parentBehavior == other.parentBehavior &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(children, parentBehavior, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ParentHierarchyConfiguration{children=$children, parentBehavior=$parentBehavior, additionalProperties=$additionalProperties}"
    }

    class ChildHierarchyConfiguration
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val parent: JsonField<Parent>,
        private val payer: JsonField<Payer>,
        private val usageStatementBehavior: JsonField<UsageStatementBehavior>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("parent") @ExcludeMissing parent: JsonField<Parent> = JsonMissing.of(),
            @JsonProperty("payer") @ExcludeMissing payer: JsonField<Payer> = JsonMissing.of(),
            @JsonProperty("usage_statement_behavior")
            @ExcludeMissing
            usageStatementBehavior: JsonField<UsageStatementBehavior> = JsonMissing.of(),
        ) : this(parent, payer, usageStatementBehavior, mutableMapOf())

        /**
         * The single parent contract/customer for this child.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun parent(): Parent = parent.getRequired("parent")

        /**
         * Indicates which customer should pay for the child's invoice charges
         *
         * **SELF**: The child pays for its own invoice charges
         *
         * **PARENT**: The parent pays for the child's invoice charges
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun payer(): Optional<Payer> = payer.getOptional("payer")

        /**
         * Indicates the behavior of the child's invoice statements on the parent's invoices.
         *
         * **CONSOLIDATE**: Child's invoice statements will be added to parent's consolidated
         * invoices
         *
         * **SEPARATE**: Child's invoice statements will appear not appear on parent's consolidated
         * invoices
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun usageStatementBehavior(): Optional<UsageStatementBehavior> =
            usageStatementBehavior.getOptional("usage_statement_behavior")

        /**
         * Returns the raw JSON value of [parent].
         *
         * Unlike [parent], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("parent") @ExcludeMissing fun _parent(): JsonField<Parent> = parent

        /**
         * Returns the raw JSON value of [payer].
         *
         * Unlike [payer], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("payer") @ExcludeMissing fun _payer(): JsonField<Payer> = payer

        /**
         * Returns the raw JSON value of [usageStatementBehavior].
         *
         * Unlike [usageStatementBehavior], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("usage_statement_behavior")
        @ExcludeMissing
        fun _usageStatementBehavior(): JsonField<UsageStatementBehavior> = usageStatementBehavior

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [ChildHierarchyConfiguration].
             *
             * The following fields are required:
             * ```java
             * .parent()
             * ```
             */
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

            /**
             * Sets [Builder.parent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.parent] with a well-typed [Parent] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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
             * Sets [Builder.payer] to an arbitrary JSON value.
             *
             * You should usually call [Builder.payer] with a well-typed [Payer] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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
             * Sets [Builder.usageStatementBehavior] to an arbitrary JSON value.
             *
             * You should usually call [Builder.usageStatementBehavior] with a well-typed
             * [UsageStatementBehavior] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
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

            /**
             * Returns an immutable instance of [ChildHierarchyConfiguration].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .parent()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ChildHierarchyConfiguration =
                ChildHierarchyConfiguration(
                    checkRequired("parent", parent),
                    payer,
                    usageStatementBehavior,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): ChildHierarchyConfiguration = apply {
            if (validated) {
                return@apply
            }

            parent().validate()
            payer().ifPresent { it.validate() }
            usageStatementBehavior().ifPresent { it.validate() }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (parent.asKnown().getOrNull()?.validity() ?: 0) +
                (payer.asKnown().getOrNull()?.validity() ?: 0) +
                (usageStatementBehavior.asKnown().getOrNull()?.validity() ?: 0)

        /** The single parent contract/customer for this child. */
        class Parent
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val contractId: JsonField<String>,
            private val customerId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("contract_id")
                @ExcludeMissing
                contractId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("customer_id")
                @ExcludeMissing
                customerId: JsonField<String> = JsonMissing.of(),
            ) : this(contractId, customerId, mutableMapOf())

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun contractId(): String = contractId.getRequired("contract_id")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun customerId(): String = customerId.getRequired("customer_id")

            /**
             * Returns the raw JSON value of [contractId].
             *
             * Unlike [contractId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("contract_id")
            @ExcludeMissing
            fun _contractId(): JsonField<String> = contractId

            /**
             * Returns the raw JSON value of [customerId].
             *
             * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("customer_id")
            @ExcludeMissing
            fun _customerId(): JsonField<String> = customerId

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [Parent].
                 *
                 * The following fields are required:
                 * ```java
                 * .contractId()
                 * .customerId()
                 * ```
                 */
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

                /**
                 * Sets [Builder.contractId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.contractId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun contractId(contractId: JsonField<String>) = apply {
                    this.contractId = contractId
                }

                fun customerId(customerId: String) = customerId(JsonField.of(customerId))

                /**
                 * Sets [Builder.customerId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.customerId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
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

                /**
                 * Returns an immutable instance of [Parent].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .contractId()
                 * .customerId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Parent =
                    Parent(
                        checkRequired("contractId", contractId),
                        checkRequired("customerId", customerId),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Parent = apply {
                if (validated) {
                    return@apply
                }

                contractId()
                customerId()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (contractId.asKnown().isPresent) 1 else 0) +
                    (if (customerId.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Parent &&
                    contractId == other.contractId &&
                    customerId == other.customerId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(contractId, customerId, additionalProperties)
            }

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

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Payer = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Payer && value == other.value
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

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): UsageStatementBehavior = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is UsageStatementBehavior && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ChildHierarchyConfiguration &&
                parent == other.parent &&
                payer == other.payer &&
                usageStatementBehavior == other.usageStatementBehavior &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(parent, payer, usageStatementBehavior, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ChildHierarchyConfiguration{parent=$parent, payer=$payer, usageStatementBehavior=$usageStatementBehavior, additionalProperties=$additionalProperties}"
    }
}
