// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.toUnmodifiable
import com.metronome.api.models.*
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

class ContractRateCardCreateParams
constructor(
    private val name: String,
    private val aliases: List<Alias>?,
    private val creditTypeConversions: List<CreditTypeConversion>?,
    private val customFields: CustomFields?,
    private val description: String?,
    private val fiatCreditTypeId: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun name(): String = name

    fun aliases(): Optional<List<Alias>> = Optional.ofNullable(aliases)

    fun creditTypeConversions(): Optional<List<CreditTypeConversion>> =
        Optional.ofNullable(creditTypeConversions)

    fun customFields(): Optional<CustomFields> = Optional.ofNullable(customFields)

    fun description(): Optional<String> = Optional.ofNullable(description)

    fun fiatCreditTypeId(): Optional<String> = Optional.ofNullable(fiatCreditTypeId)

    @JvmSynthetic
    internal fun getBody(): ContractRateCardCreateBody {
        return ContractRateCardCreateBody(
            name,
            aliases,
            creditTypeConversions,
            customFields,
            description,
            fiatCreditTypeId,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = ContractRateCardCreateBody.Builder::class)
    @NoAutoDetect
    class ContractRateCardCreateBody
    internal constructor(
        private val name: String?,
        private val aliases: List<Alias>?,
        private val creditTypeConversions: List<CreditTypeConversion>?,
        private val customFields: CustomFields?,
        private val description: String?,
        private val fiatCreditTypeId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** Used only in UI/API. It is not exposed to end customers. */
        @JsonProperty("name") fun name(): String? = name

        /**
         * Reference this alias when creating a contract. If the same alias is assigned to multiple
         * rate cards, it will reference the rate card to which it was most recently assigned. It is
         * not exposed to end customers.
         */
        @JsonProperty("aliases") fun aliases(): List<Alias>? = aliases

        /** Required when using custom pricing units in rates. */
        @JsonProperty("credit_type_conversions")
        fun creditTypeConversions(): List<CreditTypeConversion>? = creditTypeConversions

        @JsonProperty("custom_fields") fun customFields(): CustomFields? = customFields

        @JsonProperty("description") fun description(): String? = description

        /**
         * The Metronome ID of the credit type to associate with the rate card, defaults to USD
         * (cents) if not passed.
         */
        @JsonProperty("fiat_credit_type_id") fun fiatCreditTypeId(): String? = fiatCreditTypeId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var name: String? = null
            private var aliases: List<Alias>? = null
            private var creditTypeConversions: List<CreditTypeConversion>? = null
            private var customFields: CustomFields? = null
            private var description: String? = null
            private var fiatCreditTypeId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(contractRateCardCreateBody: ContractRateCardCreateBody) = apply {
                this.name = contractRateCardCreateBody.name
                this.aliases = contractRateCardCreateBody.aliases
                this.creditTypeConversions = contractRateCardCreateBody.creditTypeConversions
                this.customFields = contractRateCardCreateBody.customFields
                this.description = contractRateCardCreateBody.description
                this.fiatCreditTypeId = contractRateCardCreateBody.fiatCreditTypeId
                additionalProperties(contractRateCardCreateBody.additionalProperties)
            }

            /** Used only in UI/API. It is not exposed to end customers. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /**
             * Reference this alias when creating a contract. If the same alias is assigned to
             * multiple rate cards, it will reference the rate card to which it was most recently
             * assigned. It is not exposed to end customers.
             */
            @JsonProperty("aliases")
            fun aliases(aliases: List<Alias>) = apply { this.aliases = aliases }

            /** Required when using custom pricing units in rates. */
            @JsonProperty("credit_type_conversions")
            fun creditTypeConversions(creditTypeConversions: List<CreditTypeConversion>) = apply {
                this.creditTypeConversions = creditTypeConversions
            }

            @JsonProperty("custom_fields")
            fun customFields(customFields: CustomFields) = apply {
                this.customFields = customFields
            }

            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            /**
             * The Metronome ID of the credit type to associate with the rate card, defaults to USD
             * (cents) if not passed.
             */
            @JsonProperty("fiat_credit_type_id")
            fun fiatCreditTypeId(fiatCreditTypeId: String) = apply {
                this.fiatCreditTypeId = fiatCreditTypeId
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

            fun build(): ContractRateCardCreateBody =
                ContractRateCardCreateBody(
                    checkNotNull(name) { "`name` is required but was not set" },
                    aliases?.toUnmodifiable(),
                    creditTypeConversions?.toUnmodifiable(),
                    customFields,
                    description,
                    fiatCreditTypeId,
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ContractRateCardCreateBody && this.name == other.name && this.aliases == other.aliases && this.creditTypeConversions == other.creditTypeConversions && this.customFields == other.customFields && this.description == other.description && this.fiatCreditTypeId == other.fiatCreditTypeId && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(name, aliases, creditTypeConversions, customFields, description, fiatCreditTypeId, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "ContractRateCardCreateBody{name=$name, aliases=$aliases, creditTypeConversions=$creditTypeConversions, customFields=$customFields, description=$description, fiatCreditTypeId=$fiatCreditTypeId, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ContractRateCardCreateParams && this.name == other.name && this.aliases == other.aliases && this.creditTypeConversions == other.creditTypeConversions && this.customFields == other.customFields && this.description == other.description && this.fiatCreditTypeId == other.fiatCreditTypeId && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(name, aliases, creditTypeConversions, customFields, description, fiatCreditTypeId, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "ContractRateCardCreateParams{name=$name, aliases=$aliases, creditTypeConversions=$creditTypeConversions, customFields=$customFields, description=$description, fiatCreditTypeId=$fiatCreditTypeId, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var name: String? = null
        private var aliases: MutableList<Alias> = mutableListOf()
        private var creditTypeConversions: MutableList<CreditTypeConversion> = mutableListOf()
        private var customFields: CustomFields? = null
        private var description: String? = null
        private var fiatCreditTypeId: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(contractRateCardCreateParams: ContractRateCardCreateParams) = apply {
            this.name = contractRateCardCreateParams.name
            this.aliases(contractRateCardCreateParams.aliases ?: listOf())
            this.creditTypeConversions(
                contractRateCardCreateParams.creditTypeConversions ?: listOf()
            )
            this.customFields = contractRateCardCreateParams.customFields
            this.description = contractRateCardCreateParams.description
            this.fiatCreditTypeId = contractRateCardCreateParams.fiatCreditTypeId
            additionalQueryParams(contractRateCardCreateParams.additionalQueryParams)
            additionalHeaders(contractRateCardCreateParams.additionalHeaders)
            additionalBodyProperties(contractRateCardCreateParams.additionalBodyProperties)
        }

        /** Used only in UI/API. It is not exposed to end customers. */
        fun name(name: String) = apply { this.name = name }

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

        /** Required when using custom pricing units in rates. */
        fun creditTypeConversions(creditTypeConversions: List<CreditTypeConversion>) = apply {
            this.creditTypeConversions.clear()
            this.creditTypeConversions.addAll(creditTypeConversions)
        }

        /** Required when using custom pricing units in rates. */
        fun addCreditTypeConversion(creditTypeConversion: CreditTypeConversion) = apply {
            this.creditTypeConversions.add(creditTypeConversion)
        }

        fun customFields(customFields: CustomFields) = apply { this.customFields = customFields }

        fun description(description: String) = apply { this.description = description }

        /**
         * The Metronome ID of the credit type to associate with the rate card, defaults to USD
         * (cents) if not passed.
         */
        fun fiatCreditTypeId(fiatCreditTypeId: String) = apply {
            this.fiatCreditTypeId = fiatCreditTypeId
        }

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

        fun build(): ContractRateCardCreateParams =
            ContractRateCardCreateParams(
                checkNotNull(name) { "`name` is required but was not set" },
                if (aliases.size == 0) null else aliases.toUnmodifiable(),
                if (creditTypeConversions.size == 0) null
                else creditTypeConversions.toUnmodifiable(),
                customFields,
                description,
                fiatCreditTypeId,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
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
                    additionalProperties.toUnmodifiable(),
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

    @JsonDeserialize(builder = CreditTypeConversion.Builder::class)
    @NoAutoDetect
    class CreditTypeConversion
    private constructor(
        private val customCreditTypeId: String?,
        private val fiatPerCustomCredit: Double?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("custom_credit_type_id")
        fun customCreditTypeId(): String? = customCreditTypeId

        @JsonProperty("fiat_per_custom_credit")
        fun fiatPerCustomCredit(): Double? = fiatPerCustomCredit

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var customCreditTypeId: String? = null
            private var fiatPerCustomCredit: Double? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(creditTypeConversion: CreditTypeConversion) = apply {
                this.customCreditTypeId = creditTypeConversion.customCreditTypeId
                this.fiatPerCustomCredit = creditTypeConversion.fiatPerCustomCredit
                additionalProperties(creditTypeConversion.additionalProperties)
            }

            @JsonProperty("custom_credit_type_id")
            fun customCreditTypeId(customCreditTypeId: String) = apply {
                this.customCreditTypeId = customCreditTypeId
            }

            @JsonProperty("fiat_per_custom_credit")
            fun fiatPerCustomCredit(fiatPerCustomCredit: Double) = apply {
                this.fiatPerCustomCredit = fiatPerCustomCredit
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

            fun build(): CreditTypeConversion =
                CreditTypeConversion(
                    checkNotNull(customCreditTypeId) {
                        "`customCreditTypeId` is required but was not set"
                    },
                    checkNotNull(fiatPerCustomCredit) {
                        "`fiatPerCustomCredit` is required but was not set"
                    },
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CreditTypeConversion && this.customCreditTypeId == other.customCreditTypeId && this.fiatPerCustomCredit == other.fiatPerCustomCredit && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(customCreditTypeId, fiatPerCustomCredit, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "CreditTypeConversion{customCreditTypeId=$customCreditTypeId, fiatPerCustomCredit=$fiatPerCustomCredit, additionalProperties=$additionalProperties}"
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

            fun build(): CustomFields = CustomFields(additionalProperties.toUnmodifiable())
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
