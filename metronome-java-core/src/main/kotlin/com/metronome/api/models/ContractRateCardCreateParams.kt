// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
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
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun name(): String = name

    fun aliases(): Optional<List<Alias>> = Optional.ofNullable(aliases)

    fun creditTypeConversions(): Optional<List<CreditTypeConversion>> =
        Optional.ofNullable(creditTypeConversions)

    fun customFields(): Optional<CustomFields> = Optional.ofNullable(customFields)

    fun description(): Optional<String> = Optional.ofNullable(description)

    fun fiatCreditTypeId(): Optional<String> = Optional.ofNullable(fiatCreditTypeId)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

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

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class ContractRateCardCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("name") private val name: String,
        @JsonProperty("aliases") private val aliases: List<Alias>?,
        @JsonProperty("credit_type_conversions")
        private val creditTypeConversions: List<CreditTypeConversion>?,
        @JsonProperty("custom_fields") private val customFields: CustomFields?,
        @JsonProperty("description") private val description: String?,
        @JsonProperty("fiat_credit_type_id") private val fiatCreditTypeId: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Used only in UI/API. It is not exposed to end customers. */
        @JsonProperty("name") fun name(): String = name

        /**
         * Reference this alias when creating a contract. If the same alias is assigned to multiple
         * rate cards, it will reference the rate card to which it was most recently assigned. It is
         * not exposed to end customers.
         */
        @JsonProperty("aliases") fun aliases(): Optional<List<Alias>> = Optional.ofNullable(aliases)

        /** Required when using custom pricing units in rates. */
        @JsonProperty("credit_type_conversions")
        fun creditTypeConversions(): Optional<List<CreditTypeConversion>> =
            Optional.ofNullable(creditTypeConversions)

        @JsonProperty("custom_fields")
        fun customFields(): Optional<CustomFields> = Optional.ofNullable(customFields)

        @JsonProperty("description")
        fun description(): Optional<String> = Optional.ofNullable(description)

        /**
         * The Metronome ID of the credit type to associate with the rate card, defaults to USD
         * (cents) if not passed.
         */
        @JsonProperty("fiat_credit_type_id")
        fun fiatCreditTypeId(): Optional<String> = Optional.ofNullable(fiatCreditTypeId)

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
                name = contractRateCardCreateBody.name
                aliases = contractRateCardCreateBody.aliases?.toMutableList()
                creditTypeConversions =
                    contractRateCardCreateBody.creditTypeConversions?.toMutableList()
                customFields = contractRateCardCreateBody.customFields
                description = contractRateCardCreateBody.description
                fiatCreditTypeId = contractRateCardCreateBody.fiatCreditTypeId
                additionalProperties =
                    contractRateCardCreateBody.additionalProperties.toMutableMap()
            }

            /** Used only in UI/API. It is not exposed to end customers. */
            fun name(name: String) = apply { this.name = name }

            /**
             * Reference this alias when creating a contract. If the same alias is assigned to
             * multiple rate cards, it will reference the rate card to which it was most recently
             * assigned. It is not exposed to end customers.
             */
            fun aliases(aliases: List<Alias>) = apply { this.aliases = aliases }

            /** Required when using custom pricing units in rates. */
            fun creditTypeConversions(creditTypeConversions: List<CreditTypeConversion>) = apply {
                this.creditTypeConversions = creditTypeConversions
            }

            fun customFields(customFields: CustomFields) = apply {
                this.customFields = customFields
            }

            fun description(description: String) = apply { this.description = description }

            /**
             * The Metronome ID of the credit type to associate with the rate card, defaults to USD
             * (cents) if not passed.
             */
            fun fiatCreditTypeId(fiatCreditTypeId: String) = apply {
                this.fiatCreditTypeId = fiatCreditTypeId
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

            fun build(): ContractRateCardCreateBody =
                ContractRateCardCreateBody(
                    checkNotNull(name) { "`name` is required but was not set" },
                    aliases?.toImmutable(),
                    creditTypeConversions?.toImmutable(),
                    customFields,
                    description,
                    fiatCreditTypeId,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ContractRateCardCreateBody && name == other.name && aliases == other.aliases && creditTypeConversions == other.creditTypeConversions && customFields == other.customFields && description == other.description && fiatCreditTypeId == other.fiatCreditTypeId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(name, aliases, creditTypeConversions, customFields, description, fiatCreditTypeId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ContractRateCardCreateBody{name=$name, aliases=$aliases, creditTypeConversions=$creditTypeConversions, customFields=$customFields, description=$description, fiatCreditTypeId=$fiatCreditTypeId, additionalProperties=$additionalProperties}"
    }

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
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(contractRateCardCreateParams: ContractRateCardCreateParams) = apply {
            name = contractRateCardCreateParams.name
            aliases = contractRateCardCreateParams.aliases?.toMutableList() ?: mutableListOf()
            creditTypeConversions =
                contractRateCardCreateParams.creditTypeConversions?.toMutableList()
                    ?: mutableListOf()
            customFields = contractRateCardCreateParams.customFields
            description = contractRateCardCreateParams.description
            fiatCreditTypeId = contractRateCardCreateParams.fiatCreditTypeId
            additionalHeaders = contractRateCardCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = contractRateCardCreateParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                contractRateCardCreateParams.additionalBodyProperties.toMutableMap()
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

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): ContractRateCardCreateParams =
            ContractRateCardCreateParams(
                checkNotNull(name) { "`name` is required but was not set" },
                aliases.toImmutable().ifEmpty { null },
                creditTypeConversions.toImmutable().ifEmpty { null },
                customFields,
                description,
                fiatCreditTypeId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Alias
    @JsonCreator
    private constructor(
        @JsonProperty("name") private val name: String,
        @JsonProperty("starting_at") private val startingAt: OffsetDateTime?,
        @JsonProperty("ending_before") private val endingBefore: OffsetDateTime?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonProperty("name") fun name(): String = name

        @JsonProperty("starting_at")
        fun startingAt(): Optional<OffsetDateTime> = Optional.ofNullable(startingAt)

        @JsonProperty("ending_before")
        fun endingBefore(): Optional<OffsetDateTime> = Optional.ofNullable(endingBefore)

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
                name = alias.name
                startingAt = alias.startingAt
                endingBefore = alias.endingBefore
                additionalProperties = alias.additionalProperties.toMutableMap()
            }

            fun name(name: String) = apply { this.name = name }

            fun startingAt(startingAt: OffsetDateTime) = apply { this.startingAt = startingAt }

            fun endingBefore(endingBefore: OffsetDateTime) = apply {
                this.endingBefore = endingBefore
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

            return /* spotless:off */ other is Alias && name == other.name && startingAt == other.startingAt && endingBefore == other.endingBefore && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(name, startingAt, endingBefore, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Alias{name=$name, startingAt=$startingAt, endingBefore=$endingBefore, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class CreditTypeConversion
    @JsonCreator
    private constructor(
        @JsonProperty("custom_credit_type_id") private val customCreditTypeId: String,
        @JsonProperty("fiat_per_custom_credit") private val fiatPerCustomCredit: Double,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonProperty("custom_credit_type_id") fun customCreditTypeId(): String = customCreditTypeId

        @JsonProperty("fiat_per_custom_credit")
        fun fiatPerCustomCredit(): Double = fiatPerCustomCredit

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
                customCreditTypeId = creditTypeConversion.customCreditTypeId
                fiatPerCustomCredit = creditTypeConversion.fiatPerCustomCredit
                additionalProperties = creditTypeConversion.additionalProperties.toMutableMap()
            }

            fun customCreditTypeId(customCreditTypeId: String) = apply {
                this.customCreditTypeId = customCreditTypeId
            }

            fun fiatPerCustomCredit(fiatPerCustomCredit: Double) = apply {
                this.fiatPerCustomCredit = fiatPerCustomCredit
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

            fun build(): CreditTypeConversion =
                CreditTypeConversion(
                    checkNotNull(customCreditTypeId) {
                        "`customCreditTypeId` is required but was not set"
                    },
                    checkNotNull(fiatPerCustomCredit) {
                        "`fiatPerCustomCredit` is required but was not set"
                    },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CreditTypeConversion && customCreditTypeId == other.customCreditTypeId && fiatPerCustomCredit == other.fiatPerCustomCredit && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(customCreditTypeId, fiatPerCustomCredit, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CreditTypeConversion{customCreditTypeId=$customCreditTypeId, fiatPerCustomCredit=$fiatPerCustomCredit, additionalProperties=$additionalProperties}"
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

        return /* spotless:off */ other is ContractRateCardCreateParams && name == other.name && aliases == other.aliases && creditTypeConversions == other.creditTypeConversions && customFields == other.customFields && description == other.description && fiatCreditTypeId == other.fiatCreditTypeId && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(name, aliases, creditTypeConversions, customFields, description, fiatCreditTypeId, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "ContractRateCardCreateParams{name=$name, aliases=$aliases, creditTypeConversions=$creditTypeConversions, customFields=$customFields, description=$description, fiatCreditTypeId=$fiatCreditTypeId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
