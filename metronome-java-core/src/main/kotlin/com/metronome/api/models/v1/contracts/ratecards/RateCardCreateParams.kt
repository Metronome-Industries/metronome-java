// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.contracts.ratecards

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.Params
import com.metronome.api.core.checkKnown
import com.metronome.api.core.checkRequired
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

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
class RateCardCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Used only in UI/API. It is not exposed to end customers.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * Reference this alias when creating a contract. If the same alias is assigned to multiple rate
     * cards, it will reference the rate card to which it was most recently assigned. It is not
     * exposed to end customers.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun aliases(): Optional<List<Alias>> = body.aliases()

    /**
     * Required when using custom pricing units in rates.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun creditTypeConversions(): Optional<List<CreditTypeConversion>> = body.creditTypeConversions()

    /**
     * Custom fields to be added eg. { "key1": "value1", "key2": "value2" }
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customFields(): Optional<CustomFields> = body.customFields()

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

    /**
     * The Metronome ID of the credit type to associate with the rate card, defaults to USD (cents)
     * if not passed.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fiatCreditTypeId(): Optional<String> = body.fiatCreditTypeId()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [aliases].
     *
     * Unlike [aliases], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _aliases(): JsonField<List<Alias>> = body._aliases()

    /**
     * Returns the raw JSON value of [creditTypeConversions].
     *
     * Unlike [creditTypeConversions], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _creditTypeConversions(): JsonField<List<CreditTypeConversion>> =
        body._creditTypeConversions()

    /**
     * Returns the raw JSON value of [customFields].
     *
     * Unlike [customFields], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _customFields(): JsonField<CustomFields> = body._customFields()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [fiatCreditTypeId].
     *
     * Unlike [fiatCreditTypeId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _fiatCreditTypeId(): JsonField<String> = body._fiatCreditTypeId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RateCardCreateParams].
         *
         * The following fields are required:
         * ```java
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RateCardCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(rateCardCreateParams: RateCardCreateParams) = apply {
            body = rateCardCreateParams.body.toBuilder()
            additionalHeaders = rateCardCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = rateCardCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [name]
         * - [aliases]
         * - [creditTypeConversions]
         * - [customFields]
         * - [description]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Used only in UI/API. It is not exposed to end customers. */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /**
         * Reference this alias when creating a contract. If the same alias is assigned to multiple
         * rate cards, it will reference the rate card to which it was most recently assigned. It is
         * not exposed to end customers.
         */
        fun aliases(aliases: List<Alias>) = apply { body.aliases(aliases) }

        /**
         * Sets [Builder.aliases] to an arbitrary JSON value.
         *
         * You should usually call [Builder.aliases] with a well-typed `List<Alias>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun aliases(aliases: JsonField<List<Alias>>) = apply { body.aliases(aliases) }

        /**
         * Adds a single [Alias] to [aliases].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAlias(alias: Alias) = apply { body.addAlias(alias) }

        /** Required when using custom pricing units in rates. */
        fun creditTypeConversions(creditTypeConversions: List<CreditTypeConversion>) = apply {
            body.creditTypeConversions(creditTypeConversions)
        }

        /**
         * Sets [Builder.creditTypeConversions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditTypeConversions] with a well-typed
         * `List<CreditTypeConversion>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun creditTypeConversions(creditTypeConversions: JsonField<List<CreditTypeConversion>>) =
            apply {
                body.creditTypeConversions(creditTypeConversions)
            }

        /**
         * Adds a single [CreditTypeConversion] to [creditTypeConversions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCreditTypeConversion(creditTypeConversion: CreditTypeConversion) = apply {
            body.addCreditTypeConversion(creditTypeConversion)
        }

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        fun customFields(customFields: CustomFields) = apply { body.customFields(customFields) }

        /**
         * Sets [Builder.customFields] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customFields] with a well-typed [CustomFields] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun customFields(customFields: JsonField<CustomFields>) = apply {
            body.customFields(customFields)
        }

        fun description(description: String) = apply { body.description(description) }

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /**
         * The Metronome ID of the credit type to associate with the rate card, defaults to USD
         * (cents) if not passed.
         */
        fun fiatCreditTypeId(fiatCreditTypeId: String) = apply {
            body.fiatCreditTypeId(fiatCreditTypeId)
        }

        /**
         * Sets [Builder.fiatCreditTypeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fiatCreditTypeId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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

        /**
         * Returns an immutable instance of [RateCardCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RateCardCreateParams =
            RateCardCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val name: JsonField<String>,
        private val aliases: JsonField<List<Alias>>,
        private val creditTypeConversions: JsonField<List<CreditTypeConversion>>,
        private val customFields: JsonField<CustomFields>,
        private val description: JsonField<String>,
        private val fiatCreditTypeId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("aliases")
            @ExcludeMissing
            aliases: JsonField<List<Alias>> = JsonMissing.of(),
            @JsonProperty("credit_type_conversions")
            @ExcludeMissing
            creditTypeConversions: JsonField<List<CreditTypeConversion>> = JsonMissing.of(),
            @JsonProperty("custom_fields")
            @ExcludeMissing
            customFields: JsonField<CustomFields> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("fiat_credit_type_id")
            @ExcludeMissing
            fiatCreditTypeId: JsonField<String> = JsonMissing.of(),
        ) : this(
            name,
            aliases,
            creditTypeConversions,
            customFields,
            description,
            fiatCreditTypeId,
            mutableMapOf(),
        )

        /**
         * Used only in UI/API. It is not exposed to end customers.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * Reference this alias when creating a contract. If the same alias is assigned to multiple
         * rate cards, it will reference the rate card to which it was most recently assigned. It is
         * not exposed to end customers.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun aliases(): Optional<List<Alias>> = aliases.getOptional("aliases")

        /**
         * Required when using custom pricing units in rates.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun creditTypeConversions(): Optional<List<CreditTypeConversion>> =
            creditTypeConversions.getOptional("credit_type_conversions")

        /**
         * Custom fields to be added eg. { "key1": "value1", "key2": "value2" }
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun customFields(): Optional<CustomFields> = customFields.getOptional("custom_fields")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * The Metronome ID of the credit type to associate with the rate card, defaults to USD
         * (cents) if not passed.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun fiatCreditTypeId(): Optional<String> =
            fiatCreditTypeId.getOptional("fiat_credit_type_id")

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [aliases].
         *
         * Unlike [aliases], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("aliases") @ExcludeMissing fun _aliases(): JsonField<List<Alias>> = aliases

        /**
         * Returns the raw JSON value of [creditTypeConversions].
         *
         * Unlike [creditTypeConversions], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("credit_type_conversions")
        @ExcludeMissing
        fun _creditTypeConversions(): JsonField<List<CreditTypeConversion>> = creditTypeConversions

        /**
         * Returns the raw JSON value of [customFields].
         *
         * Unlike [customFields], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("custom_fields")
        @ExcludeMissing
        fun _customFields(): JsonField<CustomFields> = customFields

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [fiatCreditTypeId].
         *
         * Unlike [fiatCreditTypeId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("fiat_credit_type_id")
        @ExcludeMissing
        fun _fiatCreditTypeId(): JsonField<String> = fiatCreditTypeId

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .name()
             * ```
             */
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

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * Reference this alias when creating a contract. If the same alias is assigned to
             * multiple rate cards, it will reference the rate card to which it was most recently
             * assigned. It is not exposed to end customers.
             */
            fun aliases(aliases: List<Alias>) = aliases(JsonField.of(aliases))

            /**
             * Sets [Builder.aliases] to an arbitrary JSON value.
             *
             * You should usually call [Builder.aliases] with a well-typed `List<Alias>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun aliases(aliases: JsonField<List<Alias>>) = apply {
                this.aliases = aliases.map { it.toMutableList() }
            }

            /**
             * Adds a single [Alias] to [aliases].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAlias(alias: Alias) = apply {
                aliases =
                    (aliases ?: JsonField.of(mutableListOf())).also {
                        checkKnown("aliases", it).add(alias)
                    }
            }

            /** Required when using custom pricing units in rates. */
            fun creditTypeConversions(creditTypeConversions: List<CreditTypeConversion>) =
                creditTypeConversions(JsonField.of(creditTypeConversions))

            /**
             * Sets [Builder.creditTypeConversions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditTypeConversions] with a well-typed
             * `List<CreditTypeConversion>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun creditTypeConversions(
                creditTypeConversions: JsonField<List<CreditTypeConversion>>
            ) = apply {
                this.creditTypeConversions = creditTypeConversions.map { it.toMutableList() }
            }

            /**
             * Adds a single [CreditTypeConversion] to [creditTypeConversions].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCreditTypeConversion(creditTypeConversion: CreditTypeConversion) = apply {
                creditTypeConversions =
                    (creditTypeConversions ?: JsonField.of(mutableListOf())).also {
                        checkKnown("creditTypeConversions", it).add(creditTypeConversion)
                    }
            }

            /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
            fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

            /**
             * Sets [Builder.customFields] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customFields] with a well-typed [CustomFields] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customFields(customFields: JsonField<CustomFields>) = apply {
                this.customFields = customFields
            }

            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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
             * Sets [Builder.fiatCreditTypeId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fiatCreditTypeId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("name", name),
                    (aliases ?: JsonMissing.of()).map { it.toImmutable() },
                    (creditTypeConversions ?: JsonMissing.of()).map { it.toImmutable() },
                    customFields,
                    description,
                    fiatCreditTypeId,
                    additionalProperties.toMutableMap(),
                )
        }

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
            (if (name.asKnown().isPresent) 1 else 0) +
                (aliases.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (creditTypeConversions.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                    ?: 0) +
                (customFields.asKnown().getOrNull()?.validity() ?: 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (fiatCreditTypeId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                name == other.name &&
                aliases == other.aliases &&
                creditTypeConversions == other.creditTypeConversions &&
                customFields == other.customFields &&
                description == other.description &&
                fiatCreditTypeId == other.fiatCreditTypeId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                name,
                aliases,
                creditTypeConversions,
                customFields,
                description,
                fiatCreditTypeId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{name=$name, aliases=$aliases, creditTypeConversions=$creditTypeConversions, customFields=$customFields, description=$description, fiatCreditTypeId=$fiatCreditTypeId, additionalProperties=$additionalProperties}"
    }

    class Alias
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val name: JsonField<String>,
        private val endingBefore: JsonField<OffsetDateTime>,
        private val startingAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ending_before")
            @ExcludeMissing
            endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("starting_at")
            @ExcludeMissing
            startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(name, endingBefore, startingAt, mutableMapOf())

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun endingBefore(): Optional<OffsetDateTime> = endingBefore.getOptional("ending_before")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun startingAt(): Optional<OffsetDateTime> = startingAt.getOptional("starting_at")

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [endingBefore].
         *
         * Unlike [endingBefore], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("ending_before")
        @ExcludeMissing
        fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

        /**
         * Returns the raw JSON value of [startingAt].
         *
         * Unlike [startingAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("starting_at")
        @ExcludeMissing
        fun _startingAt(): JsonField<OffsetDateTime> = startingAt

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
             * Returns a mutable builder for constructing an instance of [Alias].
             *
             * The following fields are required:
             * ```java
             * .name()
             * ```
             */
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

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun endingBefore(endingBefore: OffsetDateTime) =
                endingBefore(JsonField.of(endingBefore))

            /**
             * Sets [Builder.endingBefore] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endingBefore] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                this.endingBefore = endingBefore
            }

            fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

            /**
             * Sets [Builder.startingAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startingAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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

            /**
             * Returns an immutable instance of [Alias].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Alias =
                Alias(
                    checkRequired("name", name),
                    endingBefore,
                    startingAt,
                    additionalProperties.toMutableMap(),
                )
        }

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
            (if (name.asKnown().isPresent) 1 else 0) +
                (if (endingBefore.asKnown().isPresent) 1 else 0) +
                (if (startingAt.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Alias &&
                name == other.name &&
                endingBefore == other.endingBefore &&
                startingAt == other.startingAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(name, endingBefore, startingAt, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Alias{name=$name, endingBefore=$endingBefore, startingAt=$startingAt, additionalProperties=$additionalProperties}"
    }

    class CreditTypeConversion
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val customCreditTypeId: JsonField<String>,
        private val fiatPerCustomCredit: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("custom_credit_type_id")
            @ExcludeMissing
            customCreditTypeId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("fiat_per_custom_credit")
            @ExcludeMissing
            fiatPerCustomCredit: JsonField<Double> = JsonMissing.of(),
        ) : this(customCreditTypeId, fiatPerCustomCredit, mutableMapOf())

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun customCreditTypeId(): String = customCreditTypeId.getRequired("custom_credit_type_id")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun fiatPerCustomCredit(): Double =
            fiatPerCustomCredit.getRequired("fiat_per_custom_credit")

        /**
         * Returns the raw JSON value of [customCreditTypeId].
         *
         * Unlike [customCreditTypeId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("custom_credit_type_id")
        @ExcludeMissing
        fun _customCreditTypeId(): JsonField<String> = customCreditTypeId

        /**
         * Returns the raw JSON value of [fiatPerCustomCredit].
         *
         * Unlike [fiatPerCustomCredit], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("fiat_per_custom_credit")
        @ExcludeMissing
        fun _fiatPerCustomCredit(): JsonField<Double> = fiatPerCustomCredit

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
             * Returns a mutable builder for constructing an instance of [CreditTypeConversion].
             *
             * The following fields are required:
             * ```java
             * .customCreditTypeId()
             * .fiatPerCustomCredit()
             * ```
             */
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

            /**
             * Sets [Builder.customCreditTypeId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customCreditTypeId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customCreditTypeId(customCreditTypeId: JsonField<String>) = apply {
                this.customCreditTypeId = customCreditTypeId
            }

            fun fiatPerCustomCredit(fiatPerCustomCredit: Double) =
                fiatPerCustomCredit(JsonField.of(fiatPerCustomCredit))

            /**
             * Sets [Builder.fiatPerCustomCredit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fiatPerCustomCredit] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
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

            /**
             * Returns an immutable instance of [CreditTypeConversion].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .customCreditTypeId()
             * .fiatPerCustomCredit()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): CreditTypeConversion =
                CreditTypeConversion(
                    checkRequired("customCreditTypeId", customCreditTypeId),
                    checkRequired("fiatPerCustomCredit", fiatPerCustomCredit),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): CreditTypeConversion = apply {
            if (validated) {
                return@apply
            }

            customCreditTypeId()
            fiatPerCustomCredit()
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
            (if (customCreditTypeId.asKnown().isPresent) 1 else 0) +
                (if (fiatPerCustomCredit.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CreditTypeConversion &&
                customCreditTypeId == other.customCreditTypeId &&
                fiatPerCustomCredit == other.fiatPerCustomCredit &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(customCreditTypeId, fiatPerCustomCredit, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CreditTypeConversion{customCreditTypeId=$customCreditTypeId, fiatPerCustomCredit=$fiatPerCustomCredit, additionalProperties=$additionalProperties}"
    }

    /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
    class CustomFields
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [CustomFields]. */
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

            /**
             * Returns an immutable instance of [CustomFields].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CustomFields = CustomFields(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): CustomFields = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CustomFields && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RateCardCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "RateCardCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
