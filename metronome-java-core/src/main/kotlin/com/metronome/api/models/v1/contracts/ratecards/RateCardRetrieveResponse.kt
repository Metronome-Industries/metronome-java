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
import com.metronome.api.core.checkKnown
import com.metronome.api.core.checkRequired
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import com.metronome.api.models.CreditTypeData
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class RateCardRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<Data>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of()
    ) : this(data, mutableMapOf())

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): Data = data.getRequired("data")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

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
         * Returns a mutable builder for constructing an instance of [RateCardRetrieveResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RateCardRetrieveResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(rateCardRetrieveResponse: RateCardRetrieveResponse) = apply {
            data = rateCardRetrieveResponse.data
            additionalProperties = rateCardRetrieveResponse.additionalProperties.toMutableMap()
        }

        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

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
         * Returns an immutable instance of [RateCardRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RateCardRetrieveResponse =
            RateCardRetrieveResponse(
                checkRequired("data", data),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RateCardRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        data().validate()
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
    @JvmSynthetic internal fun validity(): Int = (data.asKnown().getOrNull()?.validity() ?: 0)

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val createdBy: JsonField<String>,
        private val name: JsonField<String>,
        private val aliases: JsonField<List<Alias>>,
        private val creditTypeConversions: JsonField<List<CreditTypeConversion>>,
        private val customFields: JsonField<CustomFields>,
        private val description: JsonField<String>,
        private val fiatCreditType: JsonField<CreditTypeData>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("created_by")
            @ExcludeMissing
            createdBy: JsonField<String> = JsonMissing.of(),
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
            @JsonProperty("fiat_credit_type")
            @ExcludeMissing
            fiatCreditType: JsonField<CreditTypeData> = JsonMissing.of(),
        ) : this(
            id,
            createdAt,
            createdBy,
            name,
            aliases,
            creditTypeConversions,
            customFields,
            description,
            fiatCreditType,
            mutableMapOf(),
        )

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdBy(): String = createdBy.getRequired("created_by")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun aliases(): Optional<List<Alias>> = aliases.getOptional("aliases")

        /**
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
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun fiatCreditType(): Optional<CreditTypeData> =
            fiatCreditType.getOptional("fiat_credit_type")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [createdBy].
         *
         * Unlike [createdBy], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_by") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

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
         * Returns the raw JSON value of [fiatCreditType].
         *
         * Unlike [fiatCreditType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("fiat_credit_type")
        @ExcludeMissing
        fun _fiatCreditType(): JsonField<CreditTypeData> = fiatCreditType

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
             * Returns a mutable builder for constructing an instance of [Data].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .createdAt()
             * .createdBy()
             * .name()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var createdBy: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var aliases: JsonField<MutableList<Alias>>? = null
            private var creditTypeConversions: JsonField<MutableList<CreditTypeConversion>>? = null
            private var customFields: JsonField<CustomFields> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var fiatCreditType: JsonField<CreditTypeData> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                createdAt = data.createdAt
                createdBy = data.createdBy
                name = data.name
                aliases = data.aliases.map { it.toMutableList() }
                creditTypeConversions = data.creditTypeConversions.map { it.toMutableList() }
                customFields = data.customFields
                description = data.description
                fiatCreditType = data.fiatCreditType
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

            /**
             * Sets [Builder.createdBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

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

            fun fiatCreditType(fiatCreditType: CreditTypeData) =
                fiatCreditType(JsonField.of(fiatCreditType))

            /**
             * Sets [Builder.fiatCreditType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fiatCreditType] with a well-typed [CreditTypeData]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun fiatCreditType(fiatCreditType: JsonField<CreditTypeData>) = apply {
                this.fiatCreditType = fiatCreditType
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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .createdAt()
             * .createdBy()
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("id", id),
                    checkRequired("createdAt", createdAt),
                    checkRequired("createdBy", createdBy),
                    checkRequired("name", name),
                    (aliases ?: JsonMissing.of()).map { it.toImmutable() },
                    (creditTypeConversions ?: JsonMissing.of()).map { it.toImmutable() },
                    customFields,
                    description,
                    fiatCreditType,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            id()
            createdAt()
            createdBy()
            name()
            aliases().ifPresent { it.forEach { it.validate() } }
            creditTypeConversions().ifPresent { it.forEach { it.validate() } }
            customFields().ifPresent { it.validate() }
            description()
            fiatCreditType().ifPresent { it.validate() }
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (createdBy.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (aliases.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (creditTypeConversions.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                    ?: 0) +
                (customFields.asKnown().getOrNull()?.validity() ?: 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (fiatCreditType.asKnown().getOrNull()?.validity() ?: 0)

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
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.getRequired("name")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun endingBefore(): Optional<OffsetDateTime> = endingBefore.getOptional("ending_before")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
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
             * Unlike [startingAt], this method doesn't throw if the JSON field has an unexpected
             * type.
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
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun endingBefore(endingBefore: OffsetDateTime) =
                    endingBefore(JsonField.of(endingBefore))

                /**
                 * Sets [Builder.endingBefore] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.endingBefore] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                    this.endingBefore = endingBefore
                }

                fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

                /**
                 * Sets [Builder.startingAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.startingAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
            private val customCreditType: JsonField<CreditTypeData>,
            private val fiatPerCustomCredit: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("custom_credit_type")
                @ExcludeMissing
                customCreditType: JsonField<CreditTypeData> = JsonMissing.of(),
                @JsonProperty("fiat_per_custom_credit")
                @ExcludeMissing
                fiatPerCustomCredit: JsonField<String> = JsonMissing.of(),
            ) : this(customCreditType, fiatPerCustomCredit, mutableMapOf())

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun customCreditType(): CreditTypeData =
                customCreditType.getRequired("custom_credit_type")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun fiatPerCustomCredit(): String =
                fiatPerCustomCredit.getRequired("fiat_per_custom_credit")

            /**
             * Returns the raw JSON value of [customCreditType].
             *
             * Unlike [customCreditType], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("custom_credit_type")
            @ExcludeMissing
            fun _customCreditType(): JsonField<CreditTypeData> = customCreditType

            /**
             * Returns the raw JSON value of [fiatPerCustomCredit].
             *
             * Unlike [fiatPerCustomCredit], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("fiat_per_custom_credit")
            @ExcludeMissing
            fun _fiatPerCustomCredit(): JsonField<String> = fiatPerCustomCredit

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
                 * .customCreditType()
                 * .fiatPerCustomCredit()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CreditTypeConversion]. */
            class Builder internal constructor() {

                private var customCreditType: JsonField<CreditTypeData>? = null
                private var fiatPerCustomCredit: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(creditTypeConversion: CreditTypeConversion) = apply {
                    customCreditType = creditTypeConversion.customCreditType
                    fiatPerCustomCredit = creditTypeConversion.fiatPerCustomCredit
                    additionalProperties = creditTypeConversion.additionalProperties.toMutableMap()
                }

                fun customCreditType(customCreditType: CreditTypeData) =
                    customCreditType(JsonField.of(customCreditType))

                /**
                 * Sets [Builder.customCreditType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.customCreditType] with a well-typed
                 * [CreditTypeData] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun customCreditType(customCreditType: JsonField<CreditTypeData>) = apply {
                    this.customCreditType = customCreditType
                }

                fun fiatPerCustomCredit(fiatPerCustomCredit: String) =
                    fiatPerCustomCredit(JsonField.of(fiatPerCustomCredit))

                /**
                 * Sets [Builder.fiatPerCustomCredit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fiatPerCustomCredit] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun fiatPerCustomCredit(fiatPerCustomCredit: JsonField<String>) = apply {
                    this.fiatPerCustomCredit = fiatPerCustomCredit
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
                 * Returns an immutable instance of [CreditTypeConversion].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .customCreditType()
                 * .fiatPerCustomCredit()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): CreditTypeConversion =
                    CreditTypeConversion(
                        checkRequired("customCreditType", customCreditType),
                        checkRequired("fiatPerCustomCredit", fiatPerCustomCredit),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): CreditTypeConversion = apply {
                if (validated) {
                    return@apply
                }

                customCreditType().validate()
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
                (customCreditType.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (fiatPerCustomCredit.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CreditTypeConversion &&
                    customCreditType == other.customCreditType &&
                    fiatPerCustomCredit == other.fiatPerCustomCredit &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(customCreditType, fiatPerCustomCredit, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CreditTypeConversion{customCreditType=$customCreditType, fiatPerCustomCredit=$fiatPerCustomCredit, additionalProperties=$additionalProperties}"
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

            return other is Data &&
                id == other.id &&
                createdAt == other.createdAt &&
                createdBy == other.createdBy &&
                name == other.name &&
                aliases == other.aliases &&
                creditTypeConversions == other.creditTypeConversions &&
                customFields == other.customFields &&
                description == other.description &&
                fiatCreditType == other.fiatCreditType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                createdAt,
                createdBy,
                name,
                aliases,
                creditTypeConversions,
                customFields,
                description,
                fiatCreditType,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, createdAt=$createdAt, createdBy=$createdBy, name=$name, aliases=$aliases, creditTypeConversions=$creditTypeConversions, customFields=$customFields, description=$description, fiatCreditType=$fiatCreditType, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RateCardRetrieveResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RateCardRetrieveResponse{data=$data, additionalProperties=$additionalProperties}"
}
