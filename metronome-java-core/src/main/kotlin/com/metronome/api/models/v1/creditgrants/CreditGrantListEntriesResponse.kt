// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.creditgrants

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
import kotlin.jvm.optionals.getOrNull

class CreditGrantListEntriesResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val customerId: JsonField<String>,
    private val ledgers: JsonField<List<Ledger>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("customer_id")
        @ExcludeMissing
        customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ledgers") @ExcludeMissing ledgers: JsonField<List<Ledger>> = JsonMissing.of(),
    ) : this(customerId, ledgers, mutableMapOf())

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customerId(): String = customerId.getRequired("customer_id")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ledgers(): List<Ledger> = ledgers.getRequired("ledgers")

    /**
     * Returns the raw JSON value of [customerId].
     *
     * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customer_id") @ExcludeMissing fun _customerId(): JsonField<String> = customerId

    /**
     * Returns the raw JSON value of [ledgers].
     *
     * Unlike [ledgers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ledgers") @ExcludeMissing fun _ledgers(): JsonField<List<Ledger>> = ledgers

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
         * Returns a mutable builder for constructing an instance of
         * [CreditGrantListEntriesResponse].
         *
         * The following fields are required:
         * ```java
         * .customerId()
         * .ledgers()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CreditGrantListEntriesResponse]. */
    class Builder internal constructor() {

        private var customerId: JsonField<String>? = null
        private var ledgers: JsonField<MutableList<Ledger>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(creditGrantListEntriesResponse: CreditGrantListEntriesResponse) = apply {
            customerId = creditGrantListEntriesResponse.customerId
            ledgers = creditGrantListEntriesResponse.ledgers.map { it.toMutableList() }
            additionalProperties =
                creditGrantListEntriesResponse.additionalProperties.toMutableMap()
        }

        fun customerId(customerId: String) = customerId(JsonField.of(customerId))

        /**
         * Sets [Builder.customerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

        fun ledgers(ledgers: List<Ledger>) = ledgers(JsonField.of(ledgers))

        /**
         * Sets [Builder.ledgers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ledgers] with a well-typed `List<Ledger>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ledgers(ledgers: JsonField<List<Ledger>>) = apply {
            this.ledgers = ledgers.map { it.toMutableList() }
        }

        /**
         * Adds a single [Ledger] to [ledgers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLedger(ledger: Ledger) = apply {
            ledgers =
                (ledgers ?: JsonField.of(mutableListOf())).also {
                    checkKnown("ledgers", it).add(ledger)
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
         * Returns an immutable instance of [CreditGrantListEntriesResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .customerId()
         * .ledgers()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CreditGrantListEntriesResponse =
            CreditGrantListEntriesResponse(
                checkRequired("customerId", customerId),
                checkRequired("ledgers", ledgers).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CreditGrantListEntriesResponse = apply {
        if (validated) {
            return@apply
        }

        customerId()
        ledgers().forEach { it.validate() }
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
        (if (customerId.asKnown().isPresent) 1 else 0) +
            (ledgers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Ledger
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val creditType: JsonField<CreditTypeData>,
        private val endingBalance: JsonField<EndingBalance>,
        private val entries: JsonField<List<CreditLedgerEntry>>,
        private val pendingEntries: JsonField<List<CreditLedgerEntry>>,
        private val startingBalance: JsonField<StartingBalance>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("credit_type")
            @ExcludeMissing
            creditType: JsonField<CreditTypeData> = JsonMissing.of(),
            @JsonProperty("ending_balance")
            @ExcludeMissing
            endingBalance: JsonField<EndingBalance> = JsonMissing.of(),
            @JsonProperty("entries")
            @ExcludeMissing
            entries: JsonField<List<CreditLedgerEntry>> = JsonMissing.of(),
            @JsonProperty("pending_entries")
            @ExcludeMissing
            pendingEntries: JsonField<List<CreditLedgerEntry>> = JsonMissing.of(),
            @JsonProperty("starting_balance")
            @ExcludeMissing
            startingBalance: JsonField<StartingBalance> = JsonMissing.of(),
        ) : this(
            creditType,
            endingBalance,
            entries,
            pendingEntries,
            startingBalance,
            mutableMapOf(),
        )

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun creditType(): CreditTypeData = creditType.getRequired("credit_type")

        /**
         * the effective balances at the end of the specified time window
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun endingBalance(): EndingBalance = endingBalance.getRequired("ending_balance")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun entries(): List<CreditLedgerEntry> = entries.getRequired("entries")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun pendingEntries(): List<CreditLedgerEntry> =
            pendingEntries.getRequired("pending_entries")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun startingBalance(): StartingBalance = startingBalance.getRequired("starting_balance")

        /**
         * Returns the raw JSON value of [creditType].
         *
         * Unlike [creditType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("credit_type")
        @ExcludeMissing
        fun _creditType(): JsonField<CreditTypeData> = creditType

        /**
         * Returns the raw JSON value of [endingBalance].
         *
         * Unlike [endingBalance], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("ending_balance")
        @ExcludeMissing
        fun _endingBalance(): JsonField<EndingBalance> = endingBalance

        /**
         * Returns the raw JSON value of [entries].
         *
         * Unlike [entries], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("entries")
        @ExcludeMissing
        fun _entries(): JsonField<List<CreditLedgerEntry>> = entries

        /**
         * Returns the raw JSON value of [pendingEntries].
         *
         * Unlike [pendingEntries], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("pending_entries")
        @ExcludeMissing
        fun _pendingEntries(): JsonField<List<CreditLedgerEntry>> = pendingEntries

        /**
         * Returns the raw JSON value of [startingBalance].
         *
         * Unlike [startingBalance], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("starting_balance")
        @ExcludeMissing
        fun _startingBalance(): JsonField<StartingBalance> = startingBalance

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
             * Returns a mutable builder for constructing an instance of [Ledger].
             *
             * The following fields are required:
             * ```java
             * .creditType()
             * .endingBalance()
             * .entries()
             * .pendingEntries()
             * .startingBalance()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Ledger]. */
        class Builder internal constructor() {

            private var creditType: JsonField<CreditTypeData>? = null
            private var endingBalance: JsonField<EndingBalance>? = null
            private var entries: JsonField<MutableList<CreditLedgerEntry>>? = null
            private var pendingEntries: JsonField<MutableList<CreditLedgerEntry>>? = null
            private var startingBalance: JsonField<StartingBalance>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(ledger: Ledger) = apply {
                creditType = ledger.creditType
                endingBalance = ledger.endingBalance
                entries = ledger.entries.map { it.toMutableList() }
                pendingEntries = ledger.pendingEntries.map { it.toMutableList() }
                startingBalance = ledger.startingBalance
                additionalProperties = ledger.additionalProperties.toMutableMap()
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

            /** the effective balances at the end of the specified time window */
            fun endingBalance(endingBalance: EndingBalance) =
                endingBalance(JsonField.of(endingBalance))

            /**
             * Sets [Builder.endingBalance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endingBalance] with a well-typed [EndingBalance]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun endingBalance(endingBalance: JsonField<EndingBalance>) = apply {
                this.endingBalance = endingBalance
            }

            fun entries(entries: List<CreditLedgerEntry>) = entries(JsonField.of(entries))

            /**
             * Sets [Builder.entries] to an arbitrary JSON value.
             *
             * You should usually call [Builder.entries] with a well-typed `List<CreditLedgerEntry>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun entries(entries: JsonField<List<CreditLedgerEntry>>) = apply {
                this.entries = entries.map { it.toMutableList() }
            }

            /**
             * Adds a single [CreditLedgerEntry] to [entries].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addEntry(entry: CreditLedgerEntry) = apply {
                entries =
                    (entries ?: JsonField.of(mutableListOf())).also {
                        checkKnown("entries", it).add(entry)
                    }
            }

            fun pendingEntries(pendingEntries: List<CreditLedgerEntry>) =
                pendingEntries(JsonField.of(pendingEntries))

            /**
             * Sets [Builder.pendingEntries] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pendingEntries] with a well-typed
             * `List<CreditLedgerEntry>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun pendingEntries(pendingEntries: JsonField<List<CreditLedgerEntry>>) = apply {
                this.pendingEntries = pendingEntries.map { it.toMutableList() }
            }

            /**
             * Adds a single [CreditLedgerEntry] to [pendingEntries].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPendingEntry(pendingEntry: CreditLedgerEntry) = apply {
                pendingEntries =
                    (pendingEntries ?: JsonField.of(mutableListOf())).also {
                        checkKnown("pendingEntries", it).add(pendingEntry)
                    }
            }

            fun startingBalance(startingBalance: StartingBalance) =
                startingBalance(JsonField.of(startingBalance))

            /**
             * Sets [Builder.startingBalance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startingBalance] with a well-typed [StartingBalance]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun startingBalance(startingBalance: JsonField<StartingBalance>) = apply {
                this.startingBalance = startingBalance
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
             * Returns an immutable instance of [Ledger].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .creditType()
             * .endingBalance()
             * .entries()
             * .pendingEntries()
             * .startingBalance()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Ledger =
                Ledger(
                    checkRequired("creditType", creditType),
                    checkRequired("endingBalance", endingBalance),
                    checkRequired("entries", entries).map { it.toImmutable() },
                    checkRequired("pendingEntries", pendingEntries).map { it.toImmutable() },
                    checkRequired("startingBalance", startingBalance),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Ledger = apply {
            if (validated) {
                return@apply
            }

            creditType().validate()
            endingBalance().validate()
            entries().forEach { it.validate() }
            pendingEntries().forEach { it.validate() }
            startingBalance().validate()
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
                (endingBalance.asKnown().getOrNull()?.validity() ?: 0) +
                (entries.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (pendingEntries.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (startingBalance.asKnown().getOrNull()?.validity() ?: 0)

        /** the effective balances at the end of the specified time window */
        class EndingBalance
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val effectiveAt: JsonField<OffsetDateTime>,
            private val excludingPending: JsonField<Double>,
            private val includingPending: JsonField<Double>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("effective_at")
                @ExcludeMissing
                effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("excluding_pending")
                @ExcludeMissing
                excludingPending: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("including_pending")
                @ExcludeMissing
                includingPending: JsonField<Double> = JsonMissing.of(),
            ) : this(effectiveAt, excludingPending, includingPending, mutableMapOf())

            /**
             * the ending_before request parameter (if supplied) or the current billing period's end
             * date
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun effectiveAt(): OffsetDateTime = effectiveAt.getRequired("effective_at")

            /**
             * the ending balance, including the balance of all grants that have not expired before
             * the effective_at date and deductions that happened before the effective_at date
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun excludingPending(): Double = excludingPending.getRequired("excluding_pending")

            /**
             * the excluding_pending balance plus any pending invoice deductions and expirations
             * that will happen by the effective_at date
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun includingPending(): Double = includingPending.getRequired("including_pending")

            /**
             * Returns the raw JSON value of [effectiveAt].
             *
             * Unlike [effectiveAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("effective_at")
            @ExcludeMissing
            fun _effectiveAt(): JsonField<OffsetDateTime> = effectiveAt

            /**
             * Returns the raw JSON value of [excludingPending].
             *
             * Unlike [excludingPending], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("excluding_pending")
            @ExcludeMissing
            fun _excludingPending(): JsonField<Double> = excludingPending

            /**
             * Returns the raw JSON value of [includingPending].
             *
             * Unlike [includingPending], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("including_pending")
            @ExcludeMissing
            fun _includingPending(): JsonField<Double> = includingPending

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
                 * Returns a mutable builder for constructing an instance of [EndingBalance].
                 *
                 * The following fields are required:
                 * ```java
                 * .effectiveAt()
                 * .excludingPending()
                 * .includingPending()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [EndingBalance]. */
            class Builder internal constructor() {

                private var effectiveAt: JsonField<OffsetDateTime>? = null
                private var excludingPending: JsonField<Double>? = null
                private var includingPending: JsonField<Double>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(endingBalance: EndingBalance) = apply {
                    effectiveAt = endingBalance.effectiveAt
                    excludingPending = endingBalance.excludingPending
                    includingPending = endingBalance.includingPending
                    additionalProperties = endingBalance.additionalProperties.toMutableMap()
                }

                /**
                 * the ending_before request parameter (if supplied) or the current billing period's
                 * end date
                 */
                fun effectiveAt(effectiveAt: OffsetDateTime) =
                    effectiveAt(JsonField.of(effectiveAt))

                /**
                 * Sets [Builder.effectiveAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.effectiveAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun effectiveAt(effectiveAt: JsonField<OffsetDateTime>) = apply {
                    this.effectiveAt = effectiveAt
                }

                /**
                 * the ending balance, including the balance of all grants that have not expired
                 * before the effective_at date and deductions that happened before the effective_at
                 * date
                 */
                fun excludingPending(excludingPending: Double) =
                    excludingPending(JsonField.of(excludingPending))

                /**
                 * Sets [Builder.excludingPending] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.excludingPending] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun excludingPending(excludingPending: JsonField<Double>) = apply {
                    this.excludingPending = excludingPending
                }

                /**
                 * the excluding_pending balance plus any pending invoice deductions and expirations
                 * that will happen by the effective_at date
                 */
                fun includingPending(includingPending: Double) =
                    includingPending(JsonField.of(includingPending))

                /**
                 * Sets [Builder.includingPending] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.includingPending] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun includingPending(includingPending: JsonField<Double>) = apply {
                    this.includingPending = includingPending
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
                 * Returns an immutable instance of [EndingBalance].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .effectiveAt()
                 * .excludingPending()
                 * .includingPending()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): EndingBalance =
                    EndingBalance(
                        checkRequired("effectiveAt", effectiveAt),
                        checkRequired("excludingPending", excludingPending),
                        checkRequired("includingPending", includingPending),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): EndingBalance = apply {
                if (validated) {
                    return@apply
                }

                effectiveAt()
                excludingPending()
                includingPending()
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
                (if (effectiveAt.asKnown().isPresent) 1 else 0) +
                    (if (excludingPending.asKnown().isPresent) 1 else 0) +
                    (if (includingPending.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is EndingBalance &&
                    effectiveAt == other.effectiveAt &&
                    excludingPending == other.excludingPending &&
                    includingPending == other.includingPending &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(effectiveAt, excludingPending, includingPending, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "EndingBalance{effectiveAt=$effectiveAt, excludingPending=$excludingPending, includingPending=$includingPending, additionalProperties=$additionalProperties}"
        }

        class StartingBalance
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val effectiveAt: JsonField<OffsetDateTime>,
            private val excludingPending: JsonField<Double>,
            private val includingPending: JsonField<Double>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("effective_at")
                @ExcludeMissing
                effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("excluding_pending")
                @ExcludeMissing
                excludingPending: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("including_pending")
                @ExcludeMissing
                includingPending: JsonField<Double> = JsonMissing.of(),
            ) : this(effectiveAt, excludingPending, includingPending, mutableMapOf())

            /**
             * the starting_on request parameter (if supplied) or the first credit grant's
             * effective_at date
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun effectiveAt(): OffsetDateTime = effectiveAt.getRequired("effective_at")

            /**
             * the starting balance, including all posted grants, deductions, and expirations that
             * happened at or before the effective_at timestamp
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun excludingPending(): Double = excludingPending.getRequired("excluding_pending")

            /**
             * the excluding_pending balance plus any pending activity that has not been posted at
             * the time of the query
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun includingPending(): Double = includingPending.getRequired("including_pending")

            /**
             * Returns the raw JSON value of [effectiveAt].
             *
             * Unlike [effectiveAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("effective_at")
            @ExcludeMissing
            fun _effectiveAt(): JsonField<OffsetDateTime> = effectiveAt

            /**
             * Returns the raw JSON value of [excludingPending].
             *
             * Unlike [excludingPending], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("excluding_pending")
            @ExcludeMissing
            fun _excludingPending(): JsonField<Double> = excludingPending

            /**
             * Returns the raw JSON value of [includingPending].
             *
             * Unlike [includingPending], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("including_pending")
            @ExcludeMissing
            fun _includingPending(): JsonField<Double> = includingPending

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
                 * Returns a mutable builder for constructing an instance of [StartingBalance].
                 *
                 * The following fields are required:
                 * ```java
                 * .effectiveAt()
                 * .excludingPending()
                 * .includingPending()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [StartingBalance]. */
            class Builder internal constructor() {

                private var effectiveAt: JsonField<OffsetDateTime>? = null
                private var excludingPending: JsonField<Double>? = null
                private var includingPending: JsonField<Double>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(startingBalance: StartingBalance) = apply {
                    effectiveAt = startingBalance.effectiveAt
                    excludingPending = startingBalance.excludingPending
                    includingPending = startingBalance.includingPending
                    additionalProperties = startingBalance.additionalProperties.toMutableMap()
                }

                /**
                 * the starting_on request parameter (if supplied) or the first credit grant's
                 * effective_at date
                 */
                fun effectiveAt(effectiveAt: OffsetDateTime) =
                    effectiveAt(JsonField.of(effectiveAt))

                /**
                 * Sets [Builder.effectiveAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.effectiveAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun effectiveAt(effectiveAt: JsonField<OffsetDateTime>) = apply {
                    this.effectiveAt = effectiveAt
                }

                /**
                 * the starting balance, including all posted grants, deductions, and expirations
                 * that happened at or before the effective_at timestamp
                 */
                fun excludingPending(excludingPending: Double) =
                    excludingPending(JsonField.of(excludingPending))

                /**
                 * Sets [Builder.excludingPending] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.excludingPending] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun excludingPending(excludingPending: JsonField<Double>) = apply {
                    this.excludingPending = excludingPending
                }

                /**
                 * the excluding_pending balance plus any pending activity that has not been posted
                 * at the time of the query
                 */
                fun includingPending(includingPending: Double) =
                    includingPending(JsonField.of(includingPending))

                /**
                 * Sets [Builder.includingPending] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.includingPending] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun includingPending(includingPending: JsonField<Double>) = apply {
                    this.includingPending = includingPending
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
                 * Returns an immutable instance of [StartingBalance].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .effectiveAt()
                 * .excludingPending()
                 * .includingPending()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): StartingBalance =
                    StartingBalance(
                        checkRequired("effectiveAt", effectiveAt),
                        checkRequired("excludingPending", excludingPending),
                        checkRequired("includingPending", includingPending),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): StartingBalance = apply {
                if (validated) {
                    return@apply
                }

                effectiveAt()
                excludingPending()
                includingPending()
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
                (if (effectiveAt.asKnown().isPresent) 1 else 0) +
                    (if (excludingPending.asKnown().isPresent) 1 else 0) +
                    (if (includingPending.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is StartingBalance &&
                    effectiveAt == other.effectiveAt &&
                    excludingPending == other.excludingPending &&
                    includingPending == other.includingPending &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(effectiveAt, excludingPending, includingPending, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "StartingBalance{effectiveAt=$effectiveAt, excludingPending=$excludingPending, includingPending=$includingPending, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Ledger &&
                creditType == other.creditType &&
                endingBalance == other.endingBalance &&
                entries == other.entries &&
                pendingEntries == other.pendingEntries &&
                startingBalance == other.startingBalance &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                creditType,
                endingBalance,
                entries,
                pendingEntries,
                startingBalance,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Ledger{creditType=$creditType, endingBalance=$endingBalance, entries=$entries, pendingEntries=$pendingEntries, startingBalance=$startingBalance, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CreditGrantListEntriesResponse &&
            customerId == other.customerId &&
            ledgers == other.ledgers &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(customerId, ledgers, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CreditGrantListEntriesResponse{customerId=$customerId, ledgers=$ledgers, additionalProperties=$additionalProperties}"
}
