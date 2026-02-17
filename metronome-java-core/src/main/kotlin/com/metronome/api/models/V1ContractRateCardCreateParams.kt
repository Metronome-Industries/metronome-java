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
import com.metronome.api.core.Params
import com.metronome.api.core.checkRequired
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/**
 * In Metronome, the rate card is the central location for your pricing. Rate cards were built with
 * new product launches and pricing changes in mind - you can update your products and pricing in
 * one place, and that change will be automatically propagated across your customer cohorts. Most
 * clients need only maintain one or a few rate cards within Metronome.
 *
 * ### Use this endpoint to:
 * - Create a rate card with a name and description
 * - Define the rate card's single underlying fiat currency, and any number of conversion rates
 *   between that fiat currency and custom pricing units. You can then add products and associated
 *   rates in the fiat currency or custom pricing unit for which you have defined a conversion rate.
 * - Set aliases for the rate card. Aliases are human-readable names that you can use in the place
 *   of the id of the rate card when provisioning a customer's contract. By using an alias, you can
 *   easily create a contract and provision a customer by choosing the paygo rate card, without
 *   storing the rate card id in your internal systems. This is helpful when launching a new rate
 *   card for paygo customers, you can update the alias for paygo to be scheduled to be assigned to
 *   the new rate card without updating your code.
 *
 * ### Key response fields:
 * - The ID of the rate card you just created
 *
 * ### Usage guidelines:
 * - After creating a rate card, you can now use the addRate or addRates endpoints to add products
 *   and their prices to it
 * - A rate card alias can only be used by one rate card at a time. If you create a contract with a
 *   rate card alias that is already in use by another rate card, the original rate card's alias
 *   schedule will be updated. The alias will reference the rate card to which it was most recently
 *   assigned.
 */
class V1ContractRateCardCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

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

    /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
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

    /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
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

    @JvmSynthetic internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
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

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
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

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
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

        fun validate(): Body = apply {
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

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var aliases: JsonField<MutableList<Alias>>? = null
            private var creditTypeConversions: JsonField<MutableList<CreditTypeConversion>>? = null
            private var customFields: JsonField<CustomFields> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var fiatCreditTypeId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                name = body.name
                aliases = body.aliases.map { it.toMutableList() }
                creditTypeConversions = body.creditTypeConversions.map { it.toMutableList() }
                customFields = body.customFields
                description = body.description
                fiatCreditTypeId = body.fiatCreditTypeId
                additionalProperties = body.additionalProperties.toMutableMap()
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

            /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
            fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

            /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
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

            fun build(): Body =
                Body(
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

            return /* spotless:off */ other is Body && name == other.name && aliases == other.aliases && creditTypeConversions == other.creditTypeConversions && customFields == other.customFields && description == other.description && fiatCreditTypeId == other.fiatCreditTypeId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(name, aliases, creditTypeConversions, customFields, description, fiatCreditTypeId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{name=$name, aliases=$aliases, creditTypeConversions=$creditTypeConversions, customFields=$customFields, description=$description, fiatCreditTypeId=$fiatCreditTypeId, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1ContractRateCardCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(v1ContractRateCardCreateParams: V1ContractRateCardCreateParams) = apply {
            body = v1ContractRateCardCreateParams.body.toBuilder()
            additionalHeaders = v1ContractRateCardCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = v1ContractRateCardCreateParams.additionalQueryParams.toBuilder()
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

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        fun customFields(customFields: CustomFields) = apply { body.customFields(customFields) }

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
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

        fun build(): V1ContractRateCardCreateParams =
            V1ContractRateCardCreateParams(
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

        /** A builder for [Alias]. */
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

        /** A builder for [CreditTypeConversion]. */
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

    /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
    @NoAutoDetect
    class CustomFields
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
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

        /** A builder for [CustomFields]. */
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

        return /* spotless:off */ other is V1ContractRateCardCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "V1ContractRateCardCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
