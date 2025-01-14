// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.checkRequired
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class Customer
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("external_id")
    @ExcludeMissing
    private val externalId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("ingest_aliases")
    @ExcludeMissing
    private val ingestAliases: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("custom_fields")
    @ExcludeMissing
    private val customFields: JsonField<CustomFields> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** the Metronome ID of the customer */
    fun id(): String = id.getRequired("id")

    /**
     * (deprecated, use ingest_aliases instead) the first ID (Metronome or ingest alias) that can be
     * used in usage events
     */
    fun externalId(): String = externalId.getRequired("external_id")

    /**
     * aliases for this customer that can be used instead of the Metronome customer ID in usage
     * events
     */
    fun ingestAliases(): List<String> = ingestAliases.getRequired("ingest_aliases")

    fun name(): String = name.getRequired("name")

    fun customFields(): Optional<CustomFields> =
        Optional.ofNullable(customFields.getNullable("custom_fields"))

    /** the Metronome ID of the customer */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * (deprecated, use ingest_aliases instead) the first ID (Metronome or ingest alias) that can be
     * used in usage events
     */
    @JsonProperty("external_id") @ExcludeMissing fun _externalId(): JsonField<String> = externalId

    /**
     * aliases for this customer that can be used instead of the Metronome customer ID in usage
     * events
     */
    @JsonProperty("ingest_aliases")
    @ExcludeMissing
    fun _ingestAliases(): JsonField<List<String>> = ingestAliases

    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    @JsonProperty("custom_fields")
    @ExcludeMissing
    fun _customFields(): JsonField<CustomFields> = customFields

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Customer = apply {
        if (validated) {
            return@apply
        }

        id()
        externalId()
        ingestAliases()
        name()
        customFields().ifPresent { it.validate() }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String>? = null
        private var externalId: JsonField<String>? = null
        private var ingestAliases: JsonField<MutableList<String>>? = null
        private var name: JsonField<String>? = null
        private var customFields: JsonField<CustomFields> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customer: Customer) = apply {
            id = customer.id
            externalId = customer.externalId
            ingestAliases = customer.ingestAliases.map { it.toMutableList() }
            name = customer.name
            customFields = customer.customFields
            additionalProperties = customer.additionalProperties.toMutableMap()
        }

        /** the Metronome ID of the customer */
        fun id(id: String) = id(JsonField.of(id))

        /** the Metronome ID of the customer */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * (deprecated, use ingest_aliases instead) the first ID (Metronome or ingest alias) that
         * can be used in usage events
         */
        fun externalId(externalId: String) = externalId(JsonField.of(externalId))

        /**
         * (deprecated, use ingest_aliases instead) the first ID (Metronome or ingest alias) that
         * can be used in usage events
         */
        fun externalId(externalId: JsonField<String>) = apply { this.externalId = externalId }

        /**
         * aliases for this customer that can be used instead of the Metronome customer ID in usage
         * events
         */
        fun ingestAliases(ingestAliases: List<String>) = ingestAliases(JsonField.of(ingestAliases))

        /**
         * aliases for this customer that can be used instead of the Metronome customer ID in usage
         * events
         */
        fun ingestAliases(ingestAliases: JsonField<List<String>>) = apply {
            this.ingestAliases = ingestAliases.map { it.toMutableList() }
        }

        /**
         * aliases for this customer that can be used instead of the Metronome customer ID in usage
         * events
         */
        fun addIngestAlias(ingestAlias: String) = apply {
            ingestAliases =
                (ingestAliases ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(ingestAlias)
                }
        }

        fun name(name: String) = name(JsonField.of(name))

        fun name(name: JsonField<String>) = apply { this.name = name }

        fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

        fun customFields(customFields: JsonField<CustomFields>) = apply {
            this.customFields = customFields
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

        fun build(): Customer =
            Customer(
                checkRequired("id", id),
                checkRequired("externalId", externalId),
                checkRequired("ingestAliases", ingestAliases).map { it.toImmutable() },
                checkRequired("name", name),
                customFields,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class CustomFields
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CustomFields = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customFields: CustomFields) = apply {
                additionalProperties = customFields.additionalProperties.toMutableMap()
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

            fun build(): CustomFields = CustomFields(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CustomFields && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Customer && id == other.id && externalId == other.externalId && ingestAliases == other.ingestAliases && name == other.name && customFields == other.customFields && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, externalId, ingestAliases, name, customFields, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Customer{id=$id, externalId=$externalId, ingestAliases=$ingestAliases, name=$name, customFields=$customFields, additionalProperties=$additionalProperties}"
}
