// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.toImmutable
import com.metronome.api.models.*
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

class ContractRateCardUpdateParams
constructor(
    private val rateCardId: String,
    private val aliases: List<Alias>?,
    private val customFields: CustomFields?,
    private val description: String?,
    private val name: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun rateCardId(): String = rateCardId

    fun aliases(): Optional<List<Alias>> = Optional.ofNullable(aliases)

    fun customFields(): Optional<CustomFields> = Optional.ofNullable(customFields)

    fun description(): Optional<String> = Optional.ofNullable(description)

    fun name(): Optional<String> = Optional.ofNullable(name)

    @JvmSynthetic
    internal fun getBody(): ContractRateCardUpdateBody {
        return ContractRateCardUpdateBody(
            rateCardId,
            aliases,
            customFields,
            description,
            name,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = ContractRateCardUpdateBody.Builder::class)
    @NoAutoDetect
    class ContractRateCardUpdateBody
    internal constructor(
        private val rateCardId: String?,
        private val aliases: List<Alias>?,
        private val customFields: CustomFields?,
        private val description: String?,
        private val name: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** ID of the rate card to update */
        @JsonProperty("rate_card_id") fun rateCardId(): String? = rateCardId

        /**
         * Reference this alias when creating a contract. If the same alias is assigned to multiple
         * rate cards, it will reference the rate card to which it was most recently assigned. It is
         * not exposed to end customers.
         */
        @JsonProperty("aliases") fun aliases(): List<Alias>? = aliases

        @JsonProperty("custom_fields") fun customFields(): CustomFields? = customFields

        @JsonProperty("description") fun description(): String? = description

        /** Used only in UI/API. It is not exposed to end customers. */
        @JsonProperty("name") fun name(): String? = name

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var rateCardId: String? = null
            private var aliases: List<Alias>? = null
            private var customFields: CustomFields? = null
            private var description: String? = null
            private var name: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(contractRateCardUpdateBody: ContractRateCardUpdateBody) = apply {
                this.rateCardId = contractRateCardUpdateBody.rateCardId
                this.aliases = contractRateCardUpdateBody.aliases
                this.customFields = contractRateCardUpdateBody.customFields
                this.description = contractRateCardUpdateBody.description
                this.name = contractRateCardUpdateBody.name
                additionalProperties(contractRateCardUpdateBody.additionalProperties)
            }

            /** ID of the rate card to update */
            @JsonProperty("rate_card_id")
            fun rateCardId(rateCardId: String) = apply { this.rateCardId = rateCardId }

            /**
             * Reference this alias when creating a contract. If the same alias is assigned to
             * multiple rate cards, it will reference the rate card to which it was most recently
             * assigned. It is not exposed to end customers.
             */
            @JsonProperty("aliases")
            fun aliases(aliases: List<Alias>) = apply { this.aliases = aliases }

            @JsonProperty("custom_fields")
            fun customFields(customFields: CustomFields) = apply {
                this.customFields = customFields
            }

            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            /** Used only in UI/API. It is not exposed to end customers. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): ContractRateCardUpdateBody =
                ContractRateCardUpdateBody(
                    checkNotNull(rateCardId) { "`rateCardId` is required but was not set" },
                    aliases?.toImmutable(),
                    customFields,
                    description,
                    name,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ContractRateCardUpdateBody && this.rateCardId == other.rateCardId && this.aliases == other.aliases && this.customFields == other.customFields && this.description == other.description && this.name == other.name && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(rateCardId, aliases, customFields, description, name, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "ContractRateCardUpdateBody{rateCardId=$rateCardId, aliases=$aliases, customFields=$customFields, description=$description, name=$name, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ContractRateCardUpdateParams && this.rateCardId == other.rateCardId && this.aliases == other.aliases && this.customFields == other.customFields && this.description == other.description && this.name == other.name && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(rateCardId, aliases, customFields, description, name, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "ContractRateCardUpdateParams{rateCardId=$rateCardId, aliases=$aliases, customFields=$customFields, description=$description, name=$name, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var rateCardId: String? = null
        private var aliases: MutableList<Alias> = mutableListOf()
        private var customFields: CustomFields? = null
        private var description: String? = null
        private var name: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(contractRateCardUpdateParams: ContractRateCardUpdateParams) = apply {
            this.rateCardId = contractRateCardUpdateParams.rateCardId
            this.aliases(contractRateCardUpdateParams.aliases ?: listOf())
            this.customFields = contractRateCardUpdateParams.customFields
            this.description = contractRateCardUpdateParams.description
            this.name = contractRateCardUpdateParams.name
            additionalQueryParams(contractRateCardUpdateParams.additionalQueryParams)
            additionalHeaders(contractRateCardUpdateParams.additionalHeaders)
            additionalBodyProperties(contractRateCardUpdateParams.additionalBodyProperties)
        }

        /** ID of the rate card to update */
        fun rateCardId(rateCardId: String) = apply { this.rateCardId = rateCardId }

        /**
         * Reference this alias when creating a contract. If the same alias is assigned to multiple
         * rate cards, it will reference the rate card to which it was most recently assigned. It is
         * not exposed to end customers.
         */
        fun aliases(aliases: List<Alias>) = apply {
            this.aliases.clear()
            this.aliases.addAll(aliases)
        }

        /**
         * Reference this alias when creating a contract. If the same alias is assigned to multiple
         * rate cards, it will reference the rate card to which it was most recently assigned. It is
         * not exposed to end customers.
         */
        fun addAlias(alias: Alias) = apply { this.aliases.add(alias) }

        fun customFields(customFields: CustomFields) = apply { this.customFields = customFields }

        fun description(description: String) = apply { this.description = description }

        /** Used only in UI/API. It is not exposed to end customers. */
        fun name(name: String) = apply { this.name = name }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): ContractRateCardUpdateParams =
            ContractRateCardUpdateParams(
                checkNotNull(rateCardId) { "`rateCardId` is required but was not set" },
                if (aliases.size == 0) null else aliases.toImmutable(),
                customFields,
                description,
                name,
                additionalQueryParams.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalHeaders.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = Alias.Builder::class)
    @NoAutoDetect
    class Alias
    private constructor(
        private val name: String?,
        private val startingAt: OffsetDateTime?,
        private val endingBefore: OffsetDateTime?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("name") fun name(): String? = name

        @JsonProperty("starting_at") fun startingAt(): OffsetDateTime? = startingAt

        @JsonProperty("ending_before") fun endingBefore(): OffsetDateTime? = endingBefore

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var name: String? = null
            private var startingAt: OffsetDateTime? = null
            private var endingBefore: OffsetDateTime? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(alias: Alias) = apply {
                this.name = alias.name
                this.startingAt = alias.startingAt
                this.endingBefore = alias.endingBefore
                additionalProperties(alias.additionalProperties)
            }

            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            @JsonProperty("starting_at")
            fun startingAt(startingAt: OffsetDateTime) = apply { this.startingAt = startingAt }

            @JsonProperty("ending_before")
            fun endingBefore(endingBefore: OffsetDateTime) = apply {
                this.endingBefore = endingBefore
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Alias =
                Alias(
                    checkNotNull(name) { "`name` is required but was not set" },
                    startingAt,
                    endingBefore,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Alias && this.name == other.name && this.startingAt == other.startingAt && this.endingBefore == other.endingBefore && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(name, startingAt, endingBefore, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "Alias{name=$name, startingAt=$startingAt, endingBefore=$endingBefore, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = CustomFields.Builder::class)
    @NoAutoDetect
    class CustomFields
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customFields: CustomFields) = apply {
                additionalProperties(customFields.additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): CustomFields = CustomFields(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CustomFields && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"
    }
}
