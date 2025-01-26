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
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/** Create a new rate card */
class ContractRateCardCreateParams
private constructor(
    private val body: ContractRateCardCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** Used only in UI/API. It is not exposed to end customers. */
    fun name(): String = body.name()

    /**
     * Reference this alias when creating a contract. If the same alias is assigned to multiple rate
     * cards, it will reference the rate card to which it was most recently assigned. It is not
     * exposed to end customers.
     */
    fun aliases(): Optional<List<Alias>> = body.aliases()

    /** Required when using custom pricing units in rates. */
    fun creditTypeConversions(): Optional<List<CreditTypeConversion>> = body.creditTypeConversions()

    fun customFields(): Optional<CustomFields> = body.customFields()

    fun description(): Optional<String> = body.description()

    /**
     * The Metronome ID of the credit type to associate with the rate card, defaults to USD (cents)
     * if not passed.
     */
    fun fiatCreditTypeId(): Optional<String> = body.fiatCreditTypeId()

    /** Used only in UI/API. It is not exposed to end customers. */
    fun _name(): JsonField<String> = body._name()

    /**
     * Reference this alias when creating a contract. If the same alias is assigned to multiple rate
     * cards, it will reference the rate card to which it was most recently assigned. It is not
     * exposed to end customers.
     */
    fun _aliases(): JsonField<List<Alias>> = body._aliases()

    /** Required when using custom pricing units in rates. */
    fun _creditTypeConversions(): JsonField<List<CreditTypeConversion>> =
        body._creditTypeConversions()

    fun _customFields(): JsonField<CustomFields> = body._customFields()

    fun _description(): JsonField<String> = body._description()

    /**
     * The Metronome ID of the credit type to associate with the rate card, defaults to USD (cents)
     * if not passed.
     */
    fun _fiatCreditTypeId(): JsonField<String> = body._fiatCreditTypeId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getBody(): ContractRateCardCreateBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class ContractRateCardCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("aliases")
        @ExcludeMissing
        private val aliases: JsonField<List<Alias>> = JsonMissing.of(),
        @JsonProperty("credit_type_conversions")
        @ExcludeMissing
        private val creditTypeConversions: JsonField<List<CreditTypeConversion>> = JsonMissing.of(),
        @JsonProperty("custom_fields")
        @ExcludeMissing
        private val customFields: JsonField<CustomFields> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fiat_credit_type_id")
        @ExcludeMissing
        private val fiatCreditTypeId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Used only in UI/API. It is not exposed to end customers. */
        fun name(): String = name.getRequired("name")

        /**
         * Reference this alias when creating a contract. If the same alias is assigned to multiple
         * rate cards, it will reference the rate card to which it was most recently assigned. It is
         * not exposed to end customers.
         */
        fun aliases(): Optional<List<Alias>> = Optional.ofNullable(aliases.getNullable("aliases"))

        /** Required when using custom pricing units in rates. */
        fun creditTypeConversions(): Optional<List<CreditTypeConversion>> =
            Optional.ofNullable(creditTypeConversions.getNullable("credit_type_conversions"))

        fun customFields(): Optional<CustomFields> =
            Optional.ofNullable(customFields.getNullable("custom_fields"))

        fun description(): Optional<String> =
            Optional.ofNullable(description.getNullable("description"))

        /**
         * The Metronome ID of the credit type to associate with the rate card, defaults to USD
         * (cents) if not passed.
         */
        fun fiatCreditTypeId(): Optional<String> =
            Optional.ofNullable(fiatCreditTypeId.getNullable("fiat_credit_type_id"))

        /** Used only in UI/API. It is not exposed to end customers. */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Reference this alias when creating a contract. If the same alias is assigned to multiple
         * rate cards, it will reference the rate card to which it was most recently assigned. It is
         * not exposed to end customers.
         */
        @JsonProperty("aliases") @ExcludeMissing fun _aliases(): JsonField<List<Alias>> = aliases

        /** Required when using custom pricing units in rates. */
        @JsonProperty("credit_type_conversions")
        @ExcludeMissing
        fun _creditTypeConversions(): JsonField<List<CreditTypeConversion>> = creditTypeConversions

        @JsonProperty("custom_fields")
        @ExcludeMissing
        fun _customFields(): JsonField<CustomFields> = customFields

        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * The Metronome ID of the credit type to associate with the rate card, defaults to USD
         * (cents) if not passed.
         */
        @JsonProperty("fiat_credit_type_id")
        @ExcludeMissing
        fun _fiatCreditTypeId(): JsonField<String> = fiatCreditTypeId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ContractRateCardCreateBody = apply {
            if (validated) {
                return@apply
            }

            name()
            aliases().ifPresent { it.forEach { it.validate() } }
            creditTypeConversions().ifPresent { it.forEach { it.validate() } }
            customFields().ifPresent { it.validate() }
            description()
            fiatCreditTypeId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var aliases: JsonField<MutableList<Alias>>? = null
            private var creditTypeConversions: JsonField<MutableList<CreditTypeConversion>>? = null
            private var customFields: JsonField<CustomFields> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var fiatCreditTypeId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(contractRateCardCreateBody: ContractRateCardCreateBody) = apply {
                name = contractRateCardCreateBody.name
                aliases = contractRateCardCreateBody.aliases.map { it.toMutableList() }
                creditTypeConversions =
                    contractRateCardCreateBody.creditTypeConversions.map { it.toMutableList() }
                customFields = contractRateCardCreateBody.customFields
                description = contractRateCardCreateBody.description
                fiatCreditTypeId = contractRateCardCreateBody.fiatCreditTypeId
                additionalProperties =
                    contractRateCardCreateBody.additionalProperties.toMutableMap()
            }

            /** Used only in UI/API. It is not exposed to end customers. */
            fun name(name: String) = name(JsonField.of(name))

            /** Used only in UI/API. It is not exposed to end customers. */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * Reference this alias when creating a contract. If the same alias is assigned to
             * multiple rate cards, it will reference the rate card to which it was most recently
             * assigned. It is not exposed to end customers.
             */
            fun aliases(aliases: List<Alias>) = aliases(JsonField.of(aliases))

            /**
             * Reference this alias when creating a contract. If the same alias is assigned to
             * multiple rate cards, it will reference the rate card to which it was most recently
             * assigned. It is not exposed to end customers.
             */
            fun aliases(aliases: JsonField<List<Alias>>) = apply {
                this.aliases = aliases.map { it.toMutableList() }
            }

            /**
             * Reference this alias when creating a contract. If the same alias is assigned to
             * multiple rate cards, it will reference the rate card to which it was most recently
             * assigned. It is not exposed to end customers.
             */
            fun addAlias(alias: Alias) = apply {
                aliases =
                    (aliases ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(alias)
                    }
            }

            /** Required when using custom pricing units in rates. */
            fun creditTypeConversions(creditTypeConversions: List<CreditTypeConversion>) =
                creditTypeConversions(JsonField.of(creditTypeConversions))

            /** Required when using custom pricing units in rates. */
            fun creditTypeConversions(
                creditTypeConversions: JsonField<List<CreditTypeConversion>>
            ) = apply {
                this.creditTypeConversions = creditTypeConversions.map { it.toMutableList() }
            }

            /** Required when using custom pricing units in rates. */
            fun addCreditTypeConversion(creditTypeConversion: CreditTypeConversion) = apply {
                creditTypeConversions =
                    (creditTypeConversions ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(creditTypeConversion)
                    }
            }

            fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

            fun customFields(customFields: JsonField<CustomFields>) = apply {
                this.customFields = customFields
            }

            fun description(description: String) = description(JsonField.of(description))

            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /**
             * The Metronome ID of the credit type to associate with the rate card, defaults to USD
             * (cents) if not passed.
             */
            fun fiatCreditTypeId(fiatCreditTypeId: String) =
                fiatCreditTypeId(JsonField.of(fiatCreditTypeId))

            /**
             * The Metronome ID of the credit type to associate with the rate card, defaults to USD
             * (cents) if not passed.
             */
            fun fiatCreditTypeId(fiatCreditTypeId: JsonField<String>) = apply {
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
                    checkRequired("name", name),
                    (aliases ?: JsonMissing.of()).map { it.toImmutable() },
                    (creditTypeConversions ?: JsonMissing.of()).map { it.toImmutable() },
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
    class Builder internal constructor() {

        private var body: ContractRateCardCreateBody.Builder = ContractRateCardCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(contractRateCardCreateParams: ContractRateCardCreateParams) = apply {
            body = contractRateCardCreateParams.body.toBuilder()
            additionalHeaders = contractRateCardCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = contractRateCardCreateParams.additionalQueryParams.toBuilder()
        }

        /** Used only in UI/API. It is not exposed to end customers. */
        fun name(name: String) = apply { body.name(name) }

        /** Used only in UI/API. It is not exposed to end customers. */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /**
         * Reference this alias when creating a contract. If the same alias is assigned to multiple
         * rate cards, it will reference the rate card to which it was most recently assigned. It is
         * not exposed to end customers.
         */
        fun aliases(aliases: List<Alias>) = apply { body.aliases(aliases) }

        /**
         * Reference this alias when creating a contract. If the same alias is assigned to multiple
         * rate cards, it will reference the rate card to which it was most recently assigned. It is
         * not exposed to end customers.
         */
        fun aliases(aliases: JsonField<List<Alias>>) = apply { body.aliases(aliases) }

        /**
         * Reference this alias when creating a contract. If the same alias is assigned to multiple
         * rate cards, it will reference the rate card to which it was most recently assigned. It is
         * not exposed to end customers.
         */
        fun addAlias(alias: Alias) = apply { body.addAlias(alias) }

        /** Required when using custom pricing units in rates. */
        fun creditTypeConversions(creditTypeConversions: List<CreditTypeConversion>) = apply {
            body.creditTypeConversions(creditTypeConversions)
        }

        /** Required when using custom pricing units in rates. */
        fun creditTypeConversions(creditTypeConversions: JsonField<List<CreditTypeConversion>>) =
            apply {
                body.creditTypeConversions(creditTypeConversions)
            }

        /** Required when using custom pricing units in rates. */
        fun addCreditTypeConversion(creditTypeConversion: CreditTypeConversion) = apply {
            body.addCreditTypeConversion(creditTypeConversion)
        }

        fun customFields(customFields: CustomFields) = apply { body.customFields(customFields) }

        fun customFields(customFields: JsonField<CustomFields>) = apply {
            body.customFields(customFields)
        }

        fun description(description: String) = apply { body.description(description) }

        fun description(description: JsonField<String>) = apply { body.description(description) }

        /**
         * The Metronome ID of the credit type to associate with the rate card, defaults to USD
         * (cents) if not passed.
         */
        fun fiatCreditTypeId(fiatCreditTypeId: String) = apply {
            body.fiatCreditTypeId(fiatCreditTypeId)
        }

        /**
         * The Metronome ID of the credit type to associate with the rate card, defaults to USD
         * (cents) if not passed.
         */
        fun fiatCreditTypeId(fiatCreditTypeId: JsonField<String>) = apply {
            body.fiatCreditTypeId(fiatCreditTypeId)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
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

        fun build(): ContractRateCardCreateParams =
            ContractRateCardCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @NoAutoDetect
    class Alias
    @JsonCreator
    private constructor(
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ending_before")
        @ExcludeMissing
        private val endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("starting_at")
        @ExcludeMissing
        private val startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun name(): String = name.getRequired("name")

        fun endingBefore(): Optional<OffsetDateTime> =
            Optional.ofNullable(endingBefore.getNullable("ending_before"))

        fun startingAt(): Optional<OffsetDateTime> =
            Optional.ofNullable(startingAt.getNullable("starting_at"))

        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        @JsonProperty("ending_before")
        @ExcludeMissing
        fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

        @JsonProperty("starting_at")
        @ExcludeMissing
        fun _startingAt(): JsonField<OffsetDateTime> = startingAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Alias = apply {
            if (validated) {
                return@apply
            }

            name()
            endingBefore()
            startingAt()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
            private var startingAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(alias: Alias) = apply {
                name = alias.name
                endingBefore = alias.endingBefore
                startingAt = alias.startingAt
                additionalProperties = alias.additionalProperties.toMutableMap()
            }

            fun name(name: String) = name(JsonField.of(name))

            fun name(name: JsonField<String>) = apply { this.name = name }

            fun endingBefore(endingBefore: OffsetDateTime) =
                endingBefore(JsonField.of(endingBefore))

            fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                this.endingBefore = endingBefore
            }

            fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

            fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                this.startingAt = startingAt
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
                    checkRequired("name", name),
                    endingBefore,
                    startingAt,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Alias && name == other.name && endingBefore == other.endingBefore && startingAt == other.startingAt && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(name, endingBefore, startingAt, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Alias{name=$name, endingBefore=$endingBefore, startingAt=$startingAt, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class CreditTypeConversion
    @JsonCreator
    private constructor(
        @JsonProperty("custom_credit_type_id")
        @ExcludeMissing
        private val customCreditTypeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fiat_per_custom_credit")
        @ExcludeMissing
        private val fiatPerCustomCredit: JsonField<Double> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun customCreditTypeId(): String = customCreditTypeId.getRequired("custom_credit_type_id")

        fun fiatPerCustomCredit(): Double =
            fiatPerCustomCredit.getRequired("fiat_per_custom_credit")

        @JsonProperty("custom_credit_type_id")
        @ExcludeMissing
        fun _customCreditTypeId(): JsonField<String> = customCreditTypeId

        @JsonProperty("fiat_per_custom_credit")
        @ExcludeMissing
        fun _fiatPerCustomCredit(): JsonField<Double> = fiatPerCustomCredit

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CreditTypeConversion = apply {
            if (validated) {
                return@apply
            }

            customCreditTypeId()
            fiatPerCustomCredit()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder internal constructor() {

            private var customCreditTypeId: JsonField<String>? = null
            private var fiatPerCustomCredit: JsonField<Double>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(creditTypeConversion: CreditTypeConversion) = apply {
                customCreditTypeId = creditTypeConversion.customCreditTypeId
                fiatPerCustomCredit = creditTypeConversion.fiatPerCustomCredit
                additionalProperties = creditTypeConversion.additionalProperties.toMutableMap()
            }

            fun customCreditTypeId(customCreditTypeId: String) =
                customCreditTypeId(JsonField.of(customCreditTypeId))

            fun customCreditTypeId(customCreditTypeId: JsonField<String>) = apply {
                this.customCreditTypeId = customCreditTypeId
            }

            fun fiatPerCustomCredit(fiatPerCustomCredit: Double) =
                fiatPerCustomCredit(JsonField.of(fiatPerCustomCredit))

            fun fiatPerCustomCredit(fiatPerCustomCredit: JsonField<Double>) = apply {
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
                    checkRequired("customCreditTypeId", customCreditTypeId),
                    checkRequired("fiatPerCustomCredit", fiatPerCustomCredit),
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

        class Builder internal constructor() {

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

        return /* spotless:off */ other is ContractRateCardCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ContractRateCardCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
