// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers.plans

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

class PlanListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val customFields: JsonField<CustomFields>,
    private val planDescription: JsonField<String>,
    private val planId: JsonField<String>,
    private val planName: JsonField<String>,
    private val startingOn: JsonField<OffsetDateTime>,
    private val endingBefore: JsonField<OffsetDateTime>,
    private val netPaymentTermsDays: JsonField<Double>,
    private val trialInfo: JsonField<TrialInfo>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("custom_fields")
        @ExcludeMissing
        customFields: JsonField<CustomFields> = JsonMissing.of(),
        @JsonProperty("plan_description")
        @ExcludeMissing
        planDescription: JsonField<String> = JsonMissing.of(),
        @JsonProperty("plan_id") @ExcludeMissing planId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("plan_name") @ExcludeMissing planName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("starting_on")
        @ExcludeMissing
        startingOn: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("ending_before")
        @ExcludeMissing
        endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("net_payment_terms_days")
        @ExcludeMissing
        netPaymentTermsDays: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("trial_info")
        @ExcludeMissing
        trialInfo: JsonField<TrialInfo> = JsonMissing.of(),
    ) : this(
        id,
        customFields,
        planDescription,
        planId,
        planName,
        startingOn,
        endingBefore,
        netPaymentTermsDays,
        trialInfo,
        mutableMapOf(),
    )

    /**
     * the ID of the customer plan
     *
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
    fun planDescription(): String = planDescription.getRequired("plan_description")

    /**
     * the ID of the plan
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun planId(): String = planId.getRequired("plan_id")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun planName(): String = planName.getRequired("plan_name")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startingOn(): OffsetDateTime = startingOn.getRequired("starting_on")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endingBefore(): Optional<OffsetDateTime> = endingBefore.getOptional("ending_before")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun netPaymentTermsDays(): Optional<Double> =
        netPaymentTermsDays.getOptional("net_payment_terms_days")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun trialInfo(): Optional<TrialInfo> = trialInfo.getOptional("trial_info")

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
     * Returns the raw JSON value of [planDescription].
     *
     * Unlike [planDescription], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("plan_description")
    @ExcludeMissing
    fun _planDescription(): JsonField<String> = planDescription

    /**
     * Returns the raw JSON value of [planId].
     *
     * Unlike [planId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("plan_id") @ExcludeMissing fun _planId(): JsonField<String> = planId

    /**
     * Returns the raw JSON value of [planName].
     *
     * Unlike [planName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("plan_name") @ExcludeMissing fun _planName(): JsonField<String> = planName

    /**
     * Returns the raw JSON value of [startingOn].
     *
     * Unlike [startingOn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("starting_on")
    @ExcludeMissing
    fun _startingOn(): JsonField<OffsetDateTime> = startingOn

    /**
     * Returns the raw JSON value of [endingBefore].
     *
     * Unlike [endingBefore], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ending_before")
    @ExcludeMissing
    fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

    /**
     * Returns the raw JSON value of [netPaymentTermsDays].
     *
     * Unlike [netPaymentTermsDays], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("net_payment_terms_days")
    @ExcludeMissing
    fun _netPaymentTermsDays(): JsonField<Double> = netPaymentTermsDays

    /**
     * Returns the raw JSON value of [trialInfo].
     *
     * Unlike [trialInfo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trial_info") @ExcludeMissing fun _trialInfo(): JsonField<TrialInfo> = trialInfo

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
         * Returns a mutable builder for constructing an instance of [PlanListResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .customFields()
         * .planDescription()
         * .planId()
         * .planName()
         * .startingOn()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PlanListResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var customFields: JsonField<CustomFields>? = null
        private var planDescription: JsonField<String>? = null
        private var planId: JsonField<String>? = null
        private var planName: JsonField<String>? = null
        private var startingOn: JsonField<OffsetDateTime>? = null
        private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
        private var netPaymentTermsDays: JsonField<Double> = JsonMissing.of()
        private var trialInfo: JsonField<TrialInfo> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(planListResponse: PlanListResponse) = apply {
            id = planListResponse.id
            customFields = planListResponse.customFields
            planDescription = planListResponse.planDescription
            planId = planListResponse.planId
            planName = planListResponse.planName
            startingOn = planListResponse.startingOn
            endingBefore = planListResponse.endingBefore
            netPaymentTermsDays = planListResponse.netPaymentTermsDays
            trialInfo = planListResponse.trialInfo
            additionalProperties = planListResponse.additionalProperties.toMutableMap()
        }

        /** the ID of the customer plan */
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

        fun planDescription(planDescription: String) =
            planDescription(JsonField.of(planDescription))

        /**
         * Sets [Builder.planDescription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.planDescription] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun planDescription(planDescription: JsonField<String>) = apply {
            this.planDescription = planDescription
        }

        /** the ID of the plan */
        fun planId(planId: String) = planId(JsonField.of(planId))

        /**
         * Sets [Builder.planId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.planId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun planId(planId: JsonField<String>) = apply { this.planId = planId }

        fun planName(planName: String) = planName(JsonField.of(planName))

        /**
         * Sets [Builder.planName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.planName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun planName(planName: JsonField<String>) = apply { this.planName = planName }

        fun startingOn(startingOn: OffsetDateTime) = startingOn(JsonField.of(startingOn))

        /**
         * Sets [Builder.startingOn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startingOn] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startingOn(startingOn: JsonField<OffsetDateTime>) = apply {
            this.startingOn = startingOn
        }

        fun endingBefore(endingBefore: OffsetDateTime) = endingBefore(JsonField.of(endingBefore))

        /**
         * Sets [Builder.endingBefore] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endingBefore] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
            this.endingBefore = endingBefore
        }

        fun netPaymentTermsDays(netPaymentTermsDays: Double) =
            netPaymentTermsDays(JsonField.of(netPaymentTermsDays))

        /**
         * Sets [Builder.netPaymentTermsDays] to an arbitrary JSON value.
         *
         * You should usually call [Builder.netPaymentTermsDays] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun netPaymentTermsDays(netPaymentTermsDays: JsonField<Double>) = apply {
            this.netPaymentTermsDays = netPaymentTermsDays
        }

        fun trialInfo(trialInfo: TrialInfo) = trialInfo(JsonField.of(trialInfo))

        /**
         * Sets [Builder.trialInfo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trialInfo] with a well-typed [TrialInfo] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun trialInfo(trialInfo: JsonField<TrialInfo>) = apply { this.trialInfo = trialInfo }

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
         * Returns an immutable instance of [PlanListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .customFields()
         * .planDescription()
         * .planId()
         * .planName()
         * .startingOn()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PlanListResponse =
            PlanListResponse(
                checkRequired("id", id),
                checkRequired("customFields", customFields),
                checkRequired("planDescription", planDescription),
                checkRequired("planId", planId),
                checkRequired("planName", planName),
                checkRequired("startingOn", startingOn),
                endingBefore,
                netPaymentTermsDays,
                trialInfo,
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
    fun validate(): PlanListResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        customFields().validate()
        planDescription()
        planId()
        planName()
        startingOn()
        endingBefore()
        netPaymentTermsDays()
        trialInfo().ifPresent { it.validate() }
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
            (if (planDescription.asKnown().isPresent) 1 else 0) +
            (if (planId.asKnown().isPresent) 1 else 0) +
            (if (planName.asKnown().isPresent) 1 else 0) +
            (if (startingOn.asKnown().isPresent) 1 else 0) +
            (if (endingBefore.asKnown().isPresent) 1 else 0) +
            (if (netPaymentTermsDays.asKnown().isPresent) 1 else 0) +
            (trialInfo.asKnown().getOrNull()?.validity() ?: 0)

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

    class TrialInfo
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val endingBefore: JsonField<OffsetDateTime>,
        private val spendingCaps: JsonField<List<SpendingCap>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("ending_before")
            @ExcludeMissing
            endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("spending_caps")
            @ExcludeMissing
            spendingCaps: JsonField<List<SpendingCap>> = JsonMissing.of(),
        ) : this(endingBefore, spendingCaps, mutableMapOf())

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun endingBefore(): OffsetDateTime = endingBefore.getRequired("ending_before")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun spendingCaps(): List<SpendingCap> = spendingCaps.getRequired("spending_caps")

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
         * Returns the raw JSON value of [spendingCaps].
         *
         * Unlike [spendingCaps], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("spending_caps")
        @ExcludeMissing
        fun _spendingCaps(): JsonField<List<SpendingCap>> = spendingCaps

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
             * Returns a mutable builder for constructing an instance of [TrialInfo].
             *
             * The following fields are required:
             * ```java
             * .endingBefore()
             * .spendingCaps()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [TrialInfo]. */
        class Builder internal constructor() {

            private var endingBefore: JsonField<OffsetDateTime>? = null
            private var spendingCaps: JsonField<MutableList<SpendingCap>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(trialInfo: TrialInfo) = apply {
                endingBefore = trialInfo.endingBefore
                spendingCaps = trialInfo.spendingCaps.map { it.toMutableList() }
                additionalProperties = trialInfo.additionalProperties.toMutableMap()
            }

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

            fun spendingCaps(spendingCaps: List<SpendingCap>) =
                spendingCaps(JsonField.of(spendingCaps))

            /**
             * Sets [Builder.spendingCaps] to an arbitrary JSON value.
             *
             * You should usually call [Builder.spendingCaps] with a well-typed `List<SpendingCap>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun spendingCaps(spendingCaps: JsonField<List<SpendingCap>>) = apply {
                this.spendingCaps = spendingCaps.map { it.toMutableList() }
            }

            /**
             * Adds a single [SpendingCap] to [spendingCaps].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSpendingCap(spendingCap: SpendingCap) = apply {
                spendingCaps =
                    (spendingCaps ?: JsonField.of(mutableListOf())).also {
                        checkKnown("spendingCaps", it).add(spendingCap)
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
             * Returns an immutable instance of [TrialInfo].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .endingBefore()
             * .spendingCaps()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): TrialInfo =
                TrialInfo(
                    checkRequired("endingBefore", endingBefore),
                    checkRequired("spendingCaps", spendingCaps).map { it.toImmutable() },
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
        fun validate(): TrialInfo = apply {
            if (validated) {
                return@apply
            }

            endingBefore()
            spendingCaps().forEach { it.validate() }
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
            (if (endingBefore.asKnown().isPresent) 1 else 0) +
                (spendingCaps.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        class SpendingCap
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val amount: JsonField<Double>,
            private val amountRemaining: JsonField<Double>,
            private val creditType: JsonField<CreditTypeData>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                amount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("amount_remaining")
                @ExcludeMissing
                amountRemaining: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("credit_type")
                @ExcludeMissing
                creditType: JsonField<CreditTypeData> = JsonMissing.of(),
            ) : this(amount, amountRemaining, creditType, mutableMapOf())

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): Double = amount.getRequired("amount")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amountRemaining(): Double = amountRemaining.getRequired("amount_remaining")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun creditType(): CreditTypeData = creditType.getRequired("credit_type")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

            /**
             * Returns the raw JSON value of [amountRemaining].
             *
             * Unlike [amountRemaining], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("amount_remaining")
            @ExcludeMissing
            fun _amountRemaining(): JsonField<Double> = amountRemaining

            /**
             * Returns the raw JSON value of [creditType].
             *
             * Unlike [creditType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("credit_type")
            @ExcludeMissing
            fun _creditType(): JsonField<CreditTypeData> = creditType

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
                 * Returns a mutable builder for constructing an instance of [SpendingCap].
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .amountRemaining()
                 * .creditType()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [SpendingCap]. */
            class Builder internal constructor() {

                private var amount: JsonField<Double>? = null
                private var amountRemaining: JsonField<Double>? = null
                private var creditType: JsonField<CreditTypeData>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(spendingCap: SpendingCap) = apply {
                    amount = spendingCap.amount
                    amountRemaining = spendingCap.amountRemaining
                    creditType = spendingCap.creditType
                    additionalProperties = spendingCap.additionalProperties.toMutableMap()
                }

                fun amount(amount: Double) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                fun amountRemaining(amountRemaining: Double) =
                    amountRemaining(JsonField.of(amountRemaining))

                /**
                 * Sets [Builder.amountRemaining] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amountRemaining] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun amountRemaining(amountRemaining: JsonField<Double>) = apply {
                    this.amountRemaining = amountRemaining
                }

                fun creditType(creditType: CreditTypeData) = creditType(JsonField.of(creditType))

                /**
                 * Sets [Builder.creditType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.creditType] with a well-typed [CreditTypeData]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun creditType(creditType: JsonField<CreditTypeData>) = apply {
                    this.creditType = creditType
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
                 * Returns an immutable instance of [SpendingCap].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .amountRemaining()
                 * .creditType()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): SpendingCap =
                    SpendingCap(
                        checkRequired("amount", amount),
                        checkRequired("amountRemaining", amountRemaining),
                        checkRequired("creditType", creditType),
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
            fun validate(): SpendingCap = apply {
                if (validated) {
                    return@apply
                }

                amount()
                amountRemaining()
                creditType().validate()
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
                (if (amount.asKnown().isPresent) 1 else 0) +
                    (if (amountRemaining.asKnown().isPresent) 1 else 0) +
                    (creditType.asKnown().getOrNull()?.validity() ?: 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is SpendingCap &&
                    amount == other.amount &&
                    amountRemaining == other.amountRemaining &&
                    creditType == other.creditType &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(amount, amountRemaining, creditType, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "SpendingCap{amount=$amount, amountRemaining=$amountRemaining, creditType=$creditType, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TrialInfo &&
                endingBefore == other.endingBefore &&
                spendingCaps == other.spendingCaps &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(endingBefore, spendingCaps, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TrialInfo{endingBefore=$endingBefore, spendingCaps=$spendingCaps, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PlanListResponse &&
            id == other.id &&
            customFields == other.customFields &&
            planDescription == other.planDescription &&
            planId == other.planId &&
            planName == other.planName &&
            startingOn == other.startingOn &&
            endingBefore == other.endingBefore &&
            netPaymentTermsDays == other.netPaymentTermsDays &&
            trialInfo == other.trialInfo &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            customFields,
            planDescription,
            planId,
            planName,
            startingOn,
            endingBefore,
            netPaymentTermsDays,
            trialInfo,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PlanListResponse{id=$id, customFields=$customFields, planDescription=$planDescription, planId=$planId, planName=$planName, startingOn=$startingOn, endingBefore=$endingBefore, netPaymentTermsDays=$netPaymentTermsDays, trialInfo=$trialInfo, additionalProperties=$additionalProperties}"
}
