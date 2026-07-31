// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.plans

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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PlanDetail
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val customFields: JsonField<CustomFields>,
    private val name: JsonField<String>,
    private val creditGrants: JsonField<List<CreditGrant>>,
    private val description: JsonField<String>,
    private val minimums: JsonField<List<Minimum>>,
    private val overageRates: JsonField<List<OverageRate>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("custom_fields")
        @ExcludeMissing
        customFields: JsonField<CustomFields> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("credit_grants")
        @ExcludeMissing
        creditGrants: JsonField<List<CreditGrant>> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("minimums")
        @ExcludeMissing
        minimums: JsonField<List<Minimum>> = JsonMissing.of(),
        @JsonProperty("overage_rates")
        @ExcludeMissing
        overageRates: JsonField<List<OverageRate>> = JsonMissing.of(),
    ) : this(
        id,
        customFields,
        name,
        creditGrants,
        description,
        minimums,
        overageRates,
        mutableMapOf(),
    )

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Custom fields to be added eg. { "key1": "value1", "key2": "value2" }
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customFields(): CustomFields = customFields.getRequired("custom_fields")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun creditGrants(): Optional<List<CreditGrant>> = creditGrants.getOptional("credit_grants")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun minimums(): Optional<List<Minimum>> = minimums.getOptional("minimums")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun overageRates(): Optional<List<OverageRate>> = overageRates.getOptional("overage_rates")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [customFields].
     *
     * Unlike [customFields], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("custom_fields")
    @ExcludeMissing
    fun _customFields(): JsonField<CustomFields> = customFields

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [creditGrants].
     *
     * Unlike [creditGrants], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("credit_grants")
    @ExcludeMissing
    fun _creditGrants(): JsonField<List<CreditGrant>> = creditGrants

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [minimums].
     *
     * Unlike [minimums], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("minimums") @ExcludeMissing fun _minimums(): JsonField<List<Minimum>> = minimums

    /**
     * Returns the raw JSON value of [overageRates].
     *
     * Unlike [overageRates], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("overage_rates")
    @ExcludeMissing
    fun _overageRates(): JsonField<List<OverageRate>> = overageRates

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
         * Returns a mutable builder for constructing an instance of [PlanDetail].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .customFields()
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PlanDetail]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var customFields: JsonField<CustomFields>? = null
        private var name: JsonField<String>? = null
        private var creditGrants: JsonField<MutableList<CreditGrant>>? = null
        private var description: JsonField<String> = JsonMissing.of()
        private var minimums: JsonField<MutableList<Minimum>>? = null
        private var overageRates: JsonField<MutableList<OverageRate>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(planDetail: PlanDetail) = apply {
            id = planDetail.id
            customFields = planDetail.customFields
            name = planDetail.name
            creditGrants = planDetail.creditGrants.map { it.toMutableList() }
            description = planDetail.description
            minimums = planDetail.minimums.map { it.toMutableList() }
            overageRates = planDetail.overageRates.map { it.toMutableList() }
            additionalProperties = planDetail.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

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

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun creditGrants(creditGrants: List<CreditGrant>) = creditGrants(JsonField.of(creditGrants))

        /**
         * Sets [Builder.creditGrants] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditGrants] with a well-typed `List<CreditGrant>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun creditGrants(creditGrants: JsonField<List<CreditGrant>>) = apply {
            this.creditGrants = creditGrants.map { it.toMutableList() }
        }

        /**
         * Adds a single [CreditGrant] to [creditGrants].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCreditGrant(creditGrant: CreditGrant) = apply {
            creditGrants =
                (creditGrants ?: JsonField.of(mutableListOf())).also {
                    checkKnown("creditGrants", it).add(creditGrant)
                }
        }

        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun minimums(minimums: List<Minimum>) = minimums(JsonField.of(minimums))

        /**
         * Sets [Builder.minimums] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minimums] with a well-typed `List<Minimum>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun minimums(minimums: JsonField<List<Minimum>>) = apply {
            this.minimums = minimums.map { it.toMutableList() }
        }

        /**
         * Adds a single [Minimum] to [minimums].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMinimum(minimum: Minimum) = apply {
            minimums =
                (minimums ?: JsonField.of(mutableListOf())).also {
                    checkKnown("minimums", it).add(minimum)
                }
        }

        fun overageRates(overageRates: List<OverageRate>) = overageRates(JsonField.of(overageRates))

        /**
         * Sets [Builder.overageRates] to an arbitrary JSON value.
         *
         * You should usually call [Builder.overageRates] with a well-typed `List<OverageRate>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun overageRates(overageRates: JsonField<List<OverageRate>>) = apply {
            this.overageRates = overageRates.map { it.toMutableList() }
        }

        /**
         * Adds a single [OverageRate] to [overageRates].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOverageRate(overageRate: OverageRate) = apply {
            overageRates =
                (overageRates ?: JsonField.of(mutableListOf())).also {
                    checkKnown("overageRates", it).add(overageRate)
                }
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
         * Returns an immutable instance of [PlanDetail].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .customFields()
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PlanDetail =
            PlanDetail(
                checkRequired("id", id),
                checkRequired("customFields", customFields),
                checkRequired("name", name),
                (creditGrants ?: JsonMissing.of()).map { it.toImmutable() },
                description,
                (minimums ?: JsonMissing.of()).map { it.toImmutable() },
                (overageRates ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
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
    fun validate(): PlanDetail = apply {
        if (validated) {
            return@apply
        }

        id()
        customFields().validate()
        name()
        creditGrants().ifPresent { it.forEach { it.validate() } }
        description()
        minimums().ifPresent { it.forEach { it.validate() } }
        overageRates().ifPresent { it.forEach { it.validate() } }
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (customFields.asKnown().getOrNull()?.validity() ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (creditGrants.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (minimums.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (overageRates.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

    class CreditGrant
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val amountGranted: JsonField<Double>,
        private val amountGrantedCreditType: JsonField<CreditTypeData>,
        private val amountPaid: JsonField<Double>,
        private val amountPaidCreditType: JsonField<CreditTypeData>,
        private val effectiveDuration: JsonField<Double>,
        private val name: JsonField<String>,
        private val priority: JsonField<String>,
        private val sendInvoice: JsonField<Boolean>,
        private val reason: JsonField<String>,
        private val recurrenceDuration: JsonField<Double>,
        private val recurrenceInterval: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("amount_granted")
            @ExcludeMissing
            amountGranted: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("amount_granted_credit_type")
            @ExcludeMissing
            amountGrantedCreditType: JsonField<CreditTypeData> = JsonMissing.of(),
            @JsonProperty("amount_paid")
            @ExcludeMissing
            amountPaid: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("amount_paid_credit_type")
            @ExcludeMissing
            amountPaidCreditType: JsonField<CreditTypeData> = JsonMissing.of(),
            @JsonProperty("effective_duration")
            @ExcludeMissing
            effectiveDuration: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("priority")
            @ExcludeMissing
            priority: JsonField<String> = JsonMissing.of(),
            @JsonProperty("send_invoice")
            @ExcludeMissing
            sendInvoice: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of(),
            @JsonProperty("recurrence_duration")
            @ExcludeMissing
            recurrenceDuration: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("recurrence_interval")
            @ExcludeMissing
            recurrenceInterval: JsonField<Double> = JsonMissing.of(),
        ) : this(
            amountGranted,
            amountGrantedCreditType,
            amountPaid,
            amountPaidCreditType,
            effectiveDuration,
            name,
            priority,
            sendInvoice,
            reason,
            recurrenceDuration,
            recurrenceInterval,
            mutableMapOf(),
        )

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amountGranted(): Double = amountGranted.getRequired("amount_granted")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amountGrantedCreditType(): CreditTypeData =
            amountGrantedCreditType.getRequired("amount_granted_credit_type")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amountPaid(): Double = amountPaid.getRequired("amount_paid")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amountPaidCreditType(): CreditTypeData =
            amountPaidCreditType.getRequired("amount_paid_credit_type")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun effectiveDuration(): Double = effectiveDuration.getRequired("effective_duration")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun priority(): String = priority.getRequired("priority")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun sendInvoice(): Boolean = sendInvoice.getRequired("send_invoice")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun reason(): Optional<String> = reason.getOptional("reason")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun recurrenceDuration(): Optional<Double> =
            recurrenceDuration.getOptional("recurrence_duration")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun recurrenceInterval(): Optional<Double> =
            recurrenceInterval.getOptional("recurrence_interval")

        /**
         * Returns the raw JSON value of [amountGranted].
         *
         * Unlike [amountGranted], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("amount_granted")
        @ExcludeMissing
        fun _amountGranted(): JsonField<Double> = amountGranted

        /**
         * Returns the raw JSON value of [amountGrantedCreditType].
         *
         * Unlike [amountGrantedCreditType], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("amount_granted_credit_type")
        @ExcludeMissing
        fun _amountGrantedCreditType(): JsonField<CreditTypeData> = amountGrantedCreditType

        /**
         * Returns the raw JSON value of [amountPaid].
         *
         * Unlike [amountPaid], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount_paid")
        @ExcludeMissing
        fun _amountPaid(): JsonField<Double> = amountPaid

        /**
         * Returns the raw JSON value of [amountPaidCreditType].
         *
         * Unlike [amountPaidCreditType], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("amount_paid_credit_type")
        @ExcludeMissing
        fun _amountPaidCreditType(): JsonField<CreditTypeData> = amountPaidCreditType

        /**
         * Returns the raw JSON value of [effectiveDuration].
         *
         * Unlike [effectiveDuration], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("effective_duration")
        @ExcludeMissing
        fun _effectiveDuration(): JsonField<Double> = effectiveDuration

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [priority].
         *
         * Unlike [priority], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<String> = priority

        /**
         * Returns the raw JSON value of [sendInvoice].
         *
         * Unlike [sendInvoice], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("send_invoice")
        @ExcludeMissing
        fun _sendInvoice(): JsonField<Boolean> = sendInvoice

        /**
         * Returns the raw JSON value of [reason].
         *
         * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

        /**
         * Returns the raw JSON value of [recurrenceDuration].
         *
         * Unlike [recurrenceDuration], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("recurrence_duration")
        @ExcludeMissing
        fun _recurrenceDuration(): JsonField<Double> = recurrenceDuration

        /**
         * Returns the raw JSON value of [recurrenceInterval].
         *
         * Unlike [recurrenceInterval], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("recurrence_interval")
        @ExcludeMissing
        fun _recurrenceInterval(): JsonField<Double> = recurrenceInterval

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
             * Returns a mutable builder for constructing an instance of [CreditGrant].
             *
             * The following fields are required:
             * ```java
             * .amountGranted()
             * .amountGrantedCreditType()
             * .amountPaid()
             * .amountPaidCreditType()
             * .effectiveDuration()
             * .name()
             * .priority()
             * .sendInvoice()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CreditGrant]. */
        class Builder internal constructor() {

            private var amountGranted: JsonField<Double>? = null
            private var amountGrantedCreditType: JsonField<CreditTypeData>? = null
            private var amountPaid: JsonField<Double>? = null
            private var amountPaidCreditType: JsonField<CreditTypeData>? = null
            private var effectiveDuration: JsonField<Double>? = null
            private var name: JsonField<String>? = null
            private var priority: JsonField<String>? = null
            private var sendInvoice: JsonField<Boolean>? = null
            private var reason: JsonField<String> = JsonMissing.of()
            private var recurrenceDuration: JsonField<Double> = JsonMissing.of()
            private var recurrenceInterval: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(creditGrant: CreditGrant) = apply {
                amountGranted = creditGrant.amountGranted
                amountGrantedCreditType = creditGrant.amountGrantedCreditType
                amountPaid = creditGrant.amountPaid
                amountPaidCreditType = creditGrant.amountPaidCreditType
                effectiveDuration = creditGrant.effectiveDuration
                name = creditGrant.name
                priority = creditGrant.priority
                sendInvoice = creditGrant.sendInvoice
                reason = creditGrant.reason
                recurrenceDuration = creditGrant.recurrenceDuration
                recurrenceInterval = creditGrant.recurrenceInterval
                additionalProperties = creditGrant.additionalProperties.toMutableMap()
            }

            fun amountGranted(amountGranted: Double) = amountGranted(JsonField.of(amountGranted))

            /**
             * Sets [Builder.amountGranted] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amountGranted] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amountGranted(amountGranted: JsonField<Double>) = apply {
                this.amountGranted = amountGranted
            }

            fun amountGrantedCreditType(amountGrantedCreditType: CreditTypeData) =
                amountGrantedCreditType(JsonField.of(amountGrantedCreditType))

            /**
             * Sets [Builder.amountGrantedCreditType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amountGrantedCreditType] with a well-typed
             * [CreditTypeData] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun amountGrantedCreditType(amountGrantedCreditType: JsonField<CreditTypeData>) =
                apply {
                    this.amountGrantedCreditType = amountGrantedCreditType
                }

            fun amountPaid(amountPaid: Double) = amountPaid(JsonField.of(amountPaid))

            /**
             * Sets [Builder.amountPaid] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amountPaid] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amountPaid(amountPaid: JsonField<Double>) = apply { this.amountPaid = amountPaid }

            fun amountPaidCreditType(amountPaidCreditType: CreditTypeData) =
                amountPaidCreditType(JsonField.of(amountPaidCreditType))

            /**
             * Sets [Builder.amountPaidCreditType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amountPaidCreditType] with a well-typed
             * [CreditTypeData] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun amountPaidCreditType(amountPaidCreditType: JsonField<CreditTypeData>) = apply {
                this.amountPaidCreditType = amountPaidCreditType
            }

            fun effectiveDuration(effectiveDuration: Double) =
                effectiveDuration(JsonField.of(effectiveDuration))

            /**
             * Sets [Builder.effectiveDuration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.effectiveDuration] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun effectiveDuration(effectiveDuration: JsonField<Double>) = apply {
                this.effectiveDuration = effectiveDuration
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

            fun priority(priority: String) = priority(JsonField.of(priority))

            /**
             * Sets [Builder.priority] to an arbitrary JSON value.
             *
             * You should usually call [Builder.priority] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun priority(priority: JsonField<String>) = apply { this.priority = priority }

            fun sendInvoice(sendInvoice: Boolean) = sendInvoice(JsonField.of(sendInvoice))

            /**
             * Sets [Builder.sendInvoice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sendInvoice] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sendInvoice(sendInvoice: JsonField<Boolean>) = apply {
                this.sendInvoice = sendInvoice
            }

            fun reason(reason: String) = reason(JsonField.of(reason))

            /**
             * Sets [Builder.reason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reason] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reason(reason: JsonField<String>) = apply { this.reason = reason }

            fun recurrenceDuration(recurrenceDuration: Double) =
                recurrenceDuration(JsonField.of(recurrenceDuration))

            /**
             * Sets [Builder.recurrenceDuration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recurrenceDuration] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recurrenceDuration(recurrenceDuration: JsonField<Double>) = apply {
                this.recurrenceDuration = recurrenceDuration
            }

            fun recurrenceInterval(recurrenceInterval: Double) =
                recurrenceInterval(JsonField.of(recurrenceInterval))

            /**
             * Sets [Builder.recurrenceInterval] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recurrenceInterval] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recurrenceInterval(recurrenceInterval: JsonField<Double>) = apply {
                this.recurrenceInterval = recurrenceInterval
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
             * Returns an immutable instance of [CreditGrant].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .amountGranted()
             * .amountGrantedCreditType()
             * .amountPaid()
             * .amountPaidCreditType()
             * .effectiveDuration()
             * .name()
             * .priority()
             * .sendInvoice()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): CreditGrant =
                CreditGrant(
                    checkRequired("amountGranted", amountGranted),
                    checkRequired("amountGrantedCreditType", amountGrantedCreditType),
                    checkRequired("amountPaid", amountPaid),
                    checkRequired("amountPaidCreditType", amountPaidCreditType),
                    checkRequired("effectiveDuration", effectiveDuration),
                    checkRequired("name", name),
                    checkRequired("priority", priority),
                    checkRequired("sendInvoice", sendInvoice),
                    reason,
                    recurrenceDuration,
                    recurrenceInterval,
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
        fun validate(): CreditGrant = apply {
            if (validated) {
                return@apply
            }

            amountGranted()
            amountGrantedCreditType().validate()
            amountPaid()
            amountPaidCreditType().validate()
            effectiveDuration()
            name()
            priority()
            sendInvoice()
            reason()
            recurrenceDuration()
            recurrenceInterval()
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
            (if (amountGranted.asKnown().isPresent) 1 else 0) +
                (amountGrantedCreditType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (amountPaid.asKnown().isPresent) 1 else 0) +
                (amountPaidCreditType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (effectiveDuration.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (priority.asKnown().isPresent) 1 else 0) +
                (if (sendInvoice.asKnown().isPresent) 1 else 0) +
                (if (reason.asKnown().isPresent) 1 else 0) +
                (if (recurrenceDuration.asKnown().isPresent) 1 else 0) +
                (if (recurrenceInterval.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CreditGrant &&
                amountGranted == other.amountGranted &&
                amountGrantedCreditType == other.amountGrantedCreditType &&
                amountPaid == other.amountPaid &&
                amountPaidCreditType == other.amountPaidCreditType &&
                effectiveDuration == other.effectiveDuration &&
                name == other.name &&
                priority == other.priority &&
                sendInvoice == other.sendInvoice &&
                reason == other.reason &&
                recurrenceDuration == other.recurrenceDuration &&
                recurrenceInterval == other.recurrenceInterval &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                amountGranted,
                amountGrantedCreditType,
                amountPaid,
                amountPaidCreditType,
                effectiveDuration,
                name,
                priority,
                sendInvoice,
                reason,
                recurrenceDuration,
                recurrenceInterval,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CreditGrant{amountGranted=$amountGranted, amountGrantedCreditType=$amountGrantedCreditType, amountPaid=$amountPaid, amountPaidCreditType=$amountPaidCreditType, effectiveDuration=$effectiveDuration, name=$name, priority=$priority, sendInvoice=$sendInvoice, reason=$reason, recurrenceDuration=$recurrenceDuration, recurrenceInterval=$recurrenceInterval, additionalProperties=$additionalProperties}"
    }

    class Minimum
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val creditType: JsonField<CreditTypeData>,
        private val name: JsonField<String>,
        private val startPeriod: JsonField<Double>,
        private val value: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("credit_type")
            @ExcludeMissing
            creditType: JsonField<CreditTypeData> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("start_period")
            @ExcludeMissing
            startPeriod: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonField<Double> = JsonMissing.of(),
        ) : this(creditType, name, startPeriod, value, mutableMapOf())

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun creditType(): CreditTypeData = creditType.getRequired("credit_type")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * Used in price ramps. Indicates how many billing periods pass before the charge applies.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun startPeriod(): Double = startPeriod.getRequired("start_period")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun value(): Double = value.getRequired("value")

        /**
         * Returns the raw JSON value of [creditType].
         *
         * Unlike [creditType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("credit_type")
        @ExcludeMissing
        fun _creditType(): JsonField<CreditTypeData> = creditType

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [startPeriod].
         *
         * Unlike [startPeriod], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start_period")
        @ExcludeMissing
        fun _startPeriod(): JsonField<Double> = startPeriod

        /**
         * Returns the raw JSON value of [value].
         *
         * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Double> = value

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
             * Returns a mutable builder for constructing an instance of [Minimum].
             *
             * The following fields are required:
             * ```java
             * .creditType()
             * .name()
             * .startPeriod()
             * .value()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Minimum]. */
        class Builder internal constructor() {

            private var creditType: JsonField<CreditTypeData>? = null
            private var name: JsonField<String>? = null
            private var startPeriod: JsonField<Double>? = null
            private var value: JsonField<Double>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(minimum: Minimum) = apply {
                creditType = minimum.creditType
                name = minimum.name
                startPeriod = minimum.startPeriod
                value = minimum.value
                additionalProperties = minimum.additionalProperties.toMutableMap()
            }

            fun creditType(creditType: CreditTypeData) = creditType(JsonField.of(creditType))

            /**
             * Sets [Builder.creditType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditType] with a well-typed [CreditTypeData] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun creditType(creditType: JsonField<CreditTypeData>) = apply {
                this.creditType = creditType
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

            /**
             * Used in price ramps. Indicates how many billing periods pass before the charge
             * applies.
             */
            fun startPeriod(startPeriod: Double) = startPeriod(JsonField.of(startPeriod))

            /**
             * Sets [Builder.startPeriod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startPeriod] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startPeriod(startPeriod: JsonField<Double>) = apply {
                this.startPeriod = startPeriod
            }

            fun value(value: Double) = value(JsonField.of(value))

            /**
             * Sets [Builder.value] to an arbitrary JSON value.
             *
             * You should usually call [Builder.value] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun value(value: JsonField<Double>) = apply { this.value = value }

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
             * Returns an immutable instance of [Minimum].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .creditType()
             * .name()
             * .startPeriod()
             * .value()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Minimum =
                Minimum(
                    checkRequired("creditType", creditType),
                    checkRequired("name", name),
                    checkRequired("startPeriod", startPeriod),
                    checkRequired("value", value),
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
        fun validate(): Minimum = apply {
            if (validated) {
                return@apply
            }

            creditType().validate()
            name()
            startPeriod()
            value()
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
            (creditType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (startPeriod.asKnown().isPresent) 1 else 0) +
                (if (value.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Minimum &&
                creditType == other.creditType &&
                name == other.name &&
                startPeriod == other.startPeriod &&
                value == other.value &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(creditType, name, startPeriod, value, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Minimum{creditType=$creditType, name=$name, startPeriod=$startPeriod, value=$value, additionalProperties=$additionalProperties}"
    }

    class OverageRate
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val creditType: JsonField<CreditTypeData>,
        private val fiatCreditType: JsonField<CreditTypeData>,
        private val startPeriod: JsonField<Double>,
        private val toFiatConversionFactor: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("credit_type")
            @ExcludeMissing
            creditType: JsonField<CreditTypeData> = JsonMissing.of(),
            @JsonProperty("fiat_credit_type")
            @ExcludeMissing
            fiatCreditType: JsonField<CreditTypeData> = JsonMissing.of(),
            @JsonProperty("start_period")
            @ExcludeMissing
            startPeriod: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("to_fiat_conversion_factor")
            @ExcludeMissing
            toFiatConversionFactor: JsonField<Double> = JsonMissing.of(),
        ) : this(creditType, fiatCreditType, startPeriod, toFiatConversionFactor, mutableMapOf())

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun creditType(): CreditTypeData = creditType.getRequired("credit_type")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun fiatCreditType(): CreditTypeData = fiatCreditType.getRequired("fiat_credit_type")

        /**
         * Used in price ramps. Indicates how many billing periods pass before the charge applies.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun startPeriod(): Double = startPeriod.getRequired("start_period")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun toFiatConversionFactor(): Double =
            toFiatConversionFactor.getRequired("to_fiat_conversion_factor")

        /**
         * Returns the raw JSON value of [creditType].
         *
         * Unlike [creditType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("credit_type")
        @ExcludeMissing
        fun _creditType(): JsonField<CreditTypeData> = creditType

        /**
         * Returns the raw JSON value of [fiatCreditType].
         *
         * Unlike [fiatCreditType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("fiat_credit_type")
        @ExcludeMissing
        fun _fiatCreditType(): JsonField<CreditTypeData> = fiatCreditType

        /**
         * Returns the raw JSON value of [startPeriod].
         *
         * Unlike [startPeriod], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start_period")
        @ExcludeMissing
        fun _startPeriod(): JsonField<Double> = startPeriod

        /**
         * Returns the raw JSON value of [toFiatConversionFactor].
         *
         * Unlike [toFiatConversionFactor], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("to_fiat_conversion_factor")
        @ExcludeMissing
        fun _toFiatConversionFactor(): JsonField<Double> = toFiatConversionFactor

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
             * Returns a mutable builder for constructing an instance of [OverageRate].
             *
             * The following fields are required:
             * ```java
             * .creditType()
             * .fiatCreditType()
             * .startPeriod()
             * .toFiatConversionFactor()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [OverageRate]. */
        class Builder internal constructor() {

            private var creditType: JsonField<CreditTypeData>? = null
            private var fiatCreditType: JsonField<CreditTypeData>? = null
            private var startPeriod: JsonField<Double>? = null
            private var toFiatConversionFactor: JsonField<Double>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(overageRate: OverageRate) = apply {
                creditType = overageRate.creditType
                fiatCreditType = overageRate.fiatCreditType
                startPeriod = overageRate.startPeriod
                toFiatConversionFactor = overageRate.toFiatConversionFactor
                additionalProperties = overageRate.additionalProperties.toMutableMap()
            }

            fun creditType(creditType: CreditTypeData) = creditType(JsonField.of(creditType))

            /**
             * Sets [Builder.creditType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditType] with a well-typed [CreditTypeData] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun creditType(creditType: JsonField<CreditTypeData>) = apply {
                this.creditType = creditType
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

            /**
             * Used in price ramps. Indicates how many billing periods pass before the charge
             * applies.
             */
            fun startPeriod(startPeriod: Double) = startPeriod(JsonField.of(startPeriod))

            /**
             * Sets [Builder.startPeriod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startPeriod] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startPeriod(startPeriod: JsonField<Double>) = apply {
                this.startPeriod = startPeriod
            }

            fun toFiatConversionFactor(toFiatConversionFactor: Double) =
                toFiatConversionFactor(JsonField.of(toFiatConversionFactor))

            /**
             * Sets [Builder.toFiatConversionFactor] to an arbitrary JSON value.
             *
             * You should usually call [Builder.toFiatConversionFactor] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun toFiatConversionFactor(toFiatConversionFactor: JsonField<Double>) = apply {
                this.toFiatConversionFactor = toFiatConversionFactor
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
             * Returns an immutable instance of [OverageRate].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .creditType()
             * .fiatCreditType()
             * .startPeriod()
             * .toFiatConversionFactor()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): OverageRate =
                OverageRate(
                    checkRequired("creditType", creditType),
                    checkRequired("fiatCreditType", fiatCreditType),
                    checkRequired("startPeriod", startPeriod),
                    checkRequired("toFiatConversionFactor", toFiatConversionFactor),
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
        fun validate(): OverageRate = apply {
            if (validated) {
                return@apply
            }

            creditType().validate()
            fiatCreditType().validate()
            startPeriod()
            toFiatConversionFactor()
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
            (creditType.asKnown().getOrNull()?.validity() ?: 0) +
                (fiatCreditType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (startPeriod.asKnown().isPresent) 1 else 0) +
                (if (toFiatConversionFactor.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is OverageRate &&
                creditType == other.creditType &&
                fiatCreditType == other.fiatCreditType &&
                startPeriod == other.startPeriod &&
                toFiatConversionFactor == other.toFiatConversionFactor &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                creditType,
                fiatCreditType,
                startPeriod,
                toFiatConversionFactor,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "OverageRate{creditType=$creditType, fiatCreditType=$fiatCreditType, startPeriod=$startPeriod, toFiatConversionFactor=$toFiatConversionFactor, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PlanDetail &&
            id == other.id &&
            customFields == other.customFields &&
            name == other.name &&
            creditGrants == other.creditGrants &&
            description == other.description &&
            minimums == other.minimums &&
            overageRates == other.overageRates &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            customFields,
            name,
            creditGrants,
            description,
            minimums,
            overageRates,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PlanDetail{id=$id, customFields=$customFields, name=$name, creditGrants=$creditGrants, description=$description, minimums=$minimums, overageRates=$overageRates, additionalProperties=$additionalProperties}"
}
