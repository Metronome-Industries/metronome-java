// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.contracts

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.metronome.api.core.Enum
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.checkKnown
import com.metronome.api.core.checkRequired
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ContractListSeatBalancesResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<List<Data>>,
    private val pagination: JsonField<Pagination>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<List<Data>> = JsonMissing.of(),
        @JsonProperty("pagination")
        @ExcludeMissing
        pagination: JsonField<Pagination> = JsonMissing.of(),
    ) : this(data, pagination, mutableMapOf())

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): List<Data> = data.getRequired("data")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pagination(): Pagination = pagination.getRequired("pagination")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Data>> = data

    /**
     * Returns the raw JSON value of [pagination].
     *
     * Unlike [pagination], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pagination")
    @ExcludeMissing
    fun _pagination(): JsonField<Pagination> = pagination

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
         * [ContractListSeatBalancesResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * .pagination()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ContractListSeatBalancesResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var pagination: JsonField<Pagination>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(contractListSeatBalancesResponse: ContractListSeatBalancesResponse) =
            apply {
                data = contractListSeatBalancesResponse.data.map { it.toMutableList() }
                pagination = contractListSeatBalancesResponse.pagination
                additionalProperties =
                    contractListSeatBalancesResponse.additionalProperties.toMutableMap()
            }

        fun data(data: List<Data>) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed `List<Data>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<List<Data>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        /**
         * Adds a single [Data] to [Builder.data].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addData(data: Data) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).also {
                    checkKnown("data", it).add(data)
                }
        }

        fun pagination(pagination: Pagination) = pagination(JsonField.of(pagination))

        /**
         * Sets [Builder.pagination] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pagination] with a well-typed [Pagination] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun pagination(pagination: JsonField<Pagination>) = apply { this.pagination = pagination }

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
         * Returns an immutable instance of [ContractListSeatBalancesResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .data()
         * .pagination()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ContractListSeatBalancesResponse =
            ContractListSeatBalancesResponse(
                checkRequired("data", data).map { it.toImmutable() },
                checkRequired("pagination", pagination),
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
    fun validate(): ContractListSeatBalancesResponse = apply {
        if (validated) {
            return@apply
        }

        data().forEach { it.validate() }
        pagination().validate()
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
        (data.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (pagination.asKnown().getOrNull()?.validity() ?: 0)

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val balances: JsonField<List<Balance>>,
        private val seatId: JsonField<String>,
        private val commits: JsonField<List<Commit>>,
        private val credits: JsonField<List<Credit>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("balances")
            @ExcludeMissing
            balances: JsonField<List<Balance>> = JsonMissing.of(),
            @JsonProperty("seat_id") @ExcludeMissing seatId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("commits")
            @ExcludeMissing
            commits: JsonField<List<Commit>> = JsonMissing.of(),
            @JsonProperty("credits")
            @ExcludeMissing
            credits: JsonField<List<Credit>> = JsonMissing.of(),
        ) : this(balances, seatId, commits, credits, mutableMapOf())

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun balances(): List<Balance> = balances.getRequired("balances")

        /**
         * The unique identifier for the seat
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun seatId(): String = seatId.getRequired("seat_id")

        /**
         * Array of commits applicable to this seat with their balances
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun commits(): Optional<List<Commit>> = commits.getOptional("commits")

        /**
         * Array of credits applicable to this seat with their balances
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun credits(): Optional<List<Credit>> = credits.getOptional("credits")

        /**
         * Returns the raw JSON value of [balances].
         *
         * Unlike [balances], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("balances")
        @ExcludeMissing
        fun _balances(): JsonField<List<Balance>> = balances

        /**
         * Returns the raw JSON value of [seatId].
         *
         * Unlike [seatId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("seat_id") @ExcludeMissing fun _seatId(): JsonField<String> = seatId

        /**
         * Returns the raw JSON value of [commits].
         *
         * Unlike [commits], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("commits") @ExcludeMissing fun _commits(): JsonField<List<Commit>> = commits

        /**
         * Returns the raw JSON value of [credits].
         *
         * Unlike [credits], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("credits") @ExcludeMissing fun _credits(): JsonField<List<Credit>> = credits

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
             * .balances()
             * .seatId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var balances: JsonField<MutableList<Balance>>? = null
            private var seatId: JsonField<String>? = null
            private var commits: JsonField<MutableList<Commit>>? = null
            private var credits: JsonField<MutableList<Credit>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                balances = data.balances.map { it.toMutableList() }
                seatId = data.seatId
                commits = data.commits.map { it.toMutableList() }
                credits = data.credits.map { it.toMutableList() }
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun balances(balances: List<Balance>) = balances(JsonField.of(balances))

            /**
             * Sets [Builder.balances] to an arbitrary JSON value.
             *
             * You should usually call [Builder.balances] with a well-typed `List<Balance>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun balances(balances: JsonField<List<Balance>>) = apply {
                this.balances = balances.map { it.toMutableList() }
            }

            /**
             * Adds a single [Balance] to [balances].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addBalance(balance: Balance) = apply {
                balances =
                    (balances ?: JsonField.of(mutableListOf())).also {
                        checkKnown("balances", it).add(balance)
                    }
            }

            /** The unique identifier for the seat */
            fun seatId(seatId: String) = seatId(JsonField.of(seatId))

            /**
             * Sets [Builder.seatId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.seatId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun seatId(seatId: JsonField<String>) = apply { this.seatId = seatId }

            /** Array of commits applicable to this seat with their balances */
            fun commits(commits: List<Commit>?) = commits(JsonField.ofNullable(commits))

            /** Alias for calling [Builder.commits] with `commits.orElse(null)`. */
            fun commits(commits: Optional<List<Commit>>) = commits(commits.getOrNull())

            /**
             * Sets [Builder.commits] to an arbitrary JSON value.
             *
             * You should usually call [Builder.commits] with a well-typed `List<Commit>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun commits(commits: JsonField<List<Commit>>) = apply {
                this.commits = commits.map { it.toMutableList() }
            }

            /**
             * Adds a single [Commit] to [commits].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCommit(commit: Commit) = apply {
                commits =
                    (commits ?: JsonField.of(mutableListOf())).also {
                        checkKnown("commits", it).add(commit)
                    }
            }

            /** Array of credits applicable to this seat with their balances */
            fun credits(credits: List<Credit>) = credits(JsonField.of(credits))

            /**
             * Sets [Builder.credits] to an arbitrary JSON value.
             *
             * You should usually call [Builder.credits] with a well-typed `List<Credit>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun credits(credits: JsonField<List<Credit>>) = apply {
                this.credits = credits.map { it.toMutableList() }
            }

            /**
             * Adds a single [Credit] to [credits].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCredit(credit: Credit) = apply {
                credits =
                    (credits ?: JsonField.of(mutableListOf())).also {
                        checkKnown("credits", it).add(credit)
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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .balances()
             * .seatId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("balances", balances).map { it.toImmutable() },
                    checkRequired("seatId", seatId),
                    (commits ?: JsonMissing.of()).map { it.toImmutable() },
                    (credits ?: JsonMissing.of()).map { it.toImmutable() },
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
        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            balances().forEach { it.validate() }
            seatId()
            commits().ifPresent { it.forEach { it.validate() } }
            credits().ifPresent { it.forEach { it.validate() } }
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
            (balances.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (seatId.asKnown().isPresent) 1 else 0) +
                (commits.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (credits.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        class Balance
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val balance: JsonField<Double>,
            private val creditTypeId: JsonField<String>,
            private val startingBalance: JsonField<Double>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("balance")
                @ExcludeMissing
                balance: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("credit_type_id")
                @ExcludeMissing
                creditTypeId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("starting_balance")
                @ExcludeMissing
                startingBalance: JsonField<Double> = JsonMissing.of(),
            ) : this(balance, creditTypeId, startingBalance, mutableMapOf())

            /**
             * The total balance across all commits and credits for this seat, of this credit type.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun balance(): Double = balance.getRequired("balance")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun creditTypeId(): String = creditTypeId.getRequired("credit_type_id")

            /**
             * The total initial balances of all commits and credits for this seat, of this credit
             * type.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun startingBalance(): Double = startingBalance.getRequired("starting_balance")

            /**
             * Returns the raw JSON value of [balance].
             *
             * Unlike [balance], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("balance") @ExcludeMissing fun _balance(): JsonField<Double> = balance

            /**
             * Returns the raw JSON value of [creditTypeId].
             *
             * Unlike [creditTypeId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("credit_type_id")
            @ExcludeMissing
            fun _creditTypeId(): JsonField<String> = creditTypeId

            /**
             * Returns the raw JSON value of [startingBalance].
             *
             * Unlike [startingBalance], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("starting_balance")
            @ExcludeMissing
            fun _startingBalance(): JsonField<Double> = startingBalance

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
                 * Returns a mutable builder for constructing an instance of [Balance].
                 *
                 * The following fields are required:
                 * ```java
                 * .balance()
                 * .creditTypeId()
                 * .startingBalance()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Balance]. */
            class Builder internal constructor() {

                private var balance: JsonField<Double>? = null
                private var creditTypeId: JsonField<String>? = null
                private var startingBalance: JsonField<Double>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(balance: Balance) = apply {
                    this.balance = balance.balance
                    creditTypeId = balance.creditTypeId
                    startingBalance = balance.startingBalance
                    additionalProperties = balance.additionalProperties.toMutableMap()
                }

                /**
                 * The total balance across all commits and credits for this seat, of this credit
                 * type.
                 */
                fun balance(balance: Double) = balance(JsonField.of(balance))

                /**
                 * Sets [Builder.balance] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.balance] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun balance(balance: JsonField<Double>) = apply { this.balance = balance }

                fun creditTypeId(creditTypeId: String) = creditTypeId(JsonField.of(creditTypeId))

                /**
                 * Sets [Builder.creditTypeId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.creditTypeId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun creditTypeId(creditTypeId: JsonField<String>) = apply {
                    this.creditTypeId = creditTypeId
                }

                /**
                 * The total initial balances of all commits and credits for this seat, of this
                 * credit type.
                 */
                fun startingBalance(startingBalance: Double) =
                    startingBalance(JsonField.of(startingBalance))

                /**
                 * Sets [Builder.startingBalance] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.startingBalance] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun startingBalance(startingBalance: JsonField<Double>) = apply {
                    this.startingBalance = startingBalance
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
                 * Returns an immutable instance of [Balance].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .balance()
                 * .creditTypeId()
                 * .startingBalance()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Balance =
                    Balance(
                        checkRequired("balance", balance),
                        checkRequired("creditTypeId", creditTypeId),
                        checkRequired("startingBalance", startingBalance),
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
            fun validate(): Balance = apply {
                if (validated) {
                    return@apply
                }

                balance()
                creditTypeId()
                startingBalance()
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
                (if (balance.asKnown().isPresent) 1 else 0) +
                    (if (creditTypeId.asKnown().isPresent) 1 else 0) +
                    (if (startingBalance.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Balance &&
                    balance == other.balance &&
                    creditTypeId == other.creditTypeId &&
                    startingBalance == other.startingBalance &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(balance, creditTypeId, startingBalance, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Balance{balance=$balance, creditTypeId=$creditTypeId, startingBalance=$startingBalance, additionalProperties=$additionalProperties}"
        }

        class Commit
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val balance: JsonField<Double>,
            private val startDate: JsonField<OffsetDateTime>,
            private val endDate: JsonField<OffsetDateTime>,
            private val ledgerEntries: JsonField<List<LedgerEntry>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("balance")
                @ExcludeMissing
                balance: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("start_date")
                @ExcludeMissing
                startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("end_date")
                @ExcludeMissing
                endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("ledger_entries")
                @ExcludeMissing
                ledgerEntries: JsonField<List<LedgerEntry>> = JsonMissing.of(),
            ) : this(id, balance, startDate, endDate, ledgerEntries, mutableMapOf())

            /**
             * The commit or credit ID
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * The current balance for this commit for this specific seat
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun balance(): Double = balance.getRequired("balance")

            /**
             * The datetime when the commit becomes active
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

            /**
             * The datetime when the commit expires
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun endDate(): Optional<OffsetDateTime> = endDate.getOptional("end_date")

            /**
             * Transaction history for this commit for this seat (only included if
             * include_ledgers=true)
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun ledgerEntries(): Optional<List<LedgerEntry>> =
                ledgerEntries.getOptional("ledger_entries")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [balance].
             *
             * Unlike [balance], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("balance") @ExcludeMissing fun _balance(): JsonField<Double> = balance

            /**
             * Returns the raw JSON value of [startDate].
             *
             * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("start_date")
            @ExcludeMissing
            fun _startDate(): JsonField<OffsetDateTime> = startDate

            /**
             * Returns the raw JSON value of [endDate].
             *
             * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("end_date")
            @ExcludeMissing
            fun _endDate(): JsonField<OffsetDateTime> = endDate

            /**
             * Returns the raw JSON value of [ledgerEntries].
             *
             * Unlike [ledgerEntries], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("ledger_entries")
            @ExcludeMissing
            fun _ledgerEntries(): JsonField<List<LedgerEntry>> = ledgerEntries

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
                 * Returns a mutable builder for constructing an instance of [Commit].
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .balance()
                 * .startDate()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Commit]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var balance: JsonField<Double>? = null
                private var startDate: JsonField<OffsetDateTime>? = null
                private var endDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var ledgerEntries: JsonField<MutableList<LedgerEntry>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(commit: Commit) = apply {
                    id = commit.id
                    balance = commit.balance
                    startDate = commit.startDate
                    endDate = commit.endDate
                    ledgerEntries = commit.ledgerEntries.map { it.toMutableList() }
                    additionalProperties = commit.additionalProperties.toMutableMap()
                }

                /** The commit or credit ID */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /** The current balance for this commit for this specific seat */
                fun balance(balance: Double) = balance(JsonField.of(balance))

                /**
                 * Sets [Builder.balance] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.balance] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun balance(balance: JsonField<Double>) = apply { this.balance = balance }

                /** The datetime when the commit becomes active */
                fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

                /**
                 * Sets [Builder.startDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.startDate] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun startDate(startDate: JsonField<OffsetDateTime>) = apply {
                    this.startDate = startDate
                }

                /** The datetime when the commit expires */
                fun endDate(endDate: OffsetDateTime?) = endDate(JsonField.ofNullable(endDate))

                /** Alias for calling [Builder.endDate] with `endDate.orElse(null)`. */
                fun endDate(endDate: Optional<OffsetDateTime>) = endDate(endDate.getOrNull())

                /**
                 * Sets [Builder.endDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.endDate] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

                /**
                 * Transaction history for this commit for this seat (only included if
                 * include_ledgers=true)
                 */
                fun ledgerEntries(ledgerEntries: List<LedgerEntry>) =
                    ledgerEntries(JsonField.of(ledgerEntries))

                /**
                 * Sets [Builder.ledgerEntries] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ledgerEntries] with a well-typed
                 * `List<LedgerEntry>` value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun ledgerEntries(ledgerEntries: JsonField<List<LedgerEntry>>) = apply {
                    this.ledgerEntries = ledgerEntries.map { it.toMutableList() }
                }

                /**
                 * Adds a single [LedgerEntry] to [ledgerEntries].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addLedgerEntry(ledgerEntry: LedgerEntry) = apply {
                    ledgerEntries =
                        (ledgerEntries ?: JsonField.of(mutableListOf())).also {
                            checkKnown("ledgerEntries", it).add(ledgerEntry)
                        }
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
                 * Returns an immutable instance of [Commit].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .balance()
                 * .startDate()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Commit =
                    Commit(
                        checkRequired("id", id),
                        checkRequired("balance", balance),
                        checkRequired("startDate", startDate),
                        endDate,
                        (ledgerEntries ?: JsonMissing.of()).map { it.toImmutable() },
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
            fun validate(): Commit = apply {
                if (validated) {
                    return@apply
                }

                id()
                balance()
                startDate()
                endDate()
                ledgerEntries().ifPresent { it.forEach { it.validate() } }
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
                    (if (balance.asKnown().isPresent) 1 else 0) +
                    (if (startDate.asKnown().isPresent) 1 else 0) +
                    (if (endDate.asKnown().isPresent) 1 else 0) +
                    (ledgerEntries.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

            class LedgerEntry
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val amount: JsonField<Double>,
                private val timestamp: JsonField<OffsetDateTime>,
                private val type: JsonField<Type>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("amount")
                    @ExcludeMissing
                    amount: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("timestamp")
                    @ExcludeMissing
                    timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                ) : this(amount, timestamp, type, mutableMapOf())

                /**
                 * Amount of the ledger entry
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun amount(): Double = amount.getRequired("amount")

                /**
                 * The datetime when the ledger is created
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

                /**
                 * Commit ledger type
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun type(): Type = type.getRequired("type")

                /**
                 * Returns the raw JSON value of [amount].
                 *
                 * Unlike [amount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

                /**
                 * Returns the raw JSON value of [timestamp].
                 *
                 * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("timestamp")
                @ExcludeMissing
                fun _timestamp(): JsonField<OffsetDateTime> = timestamp

                /**
                 * Returns the raw JSON value of [type].
                 *
                 * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
                     * Returns a mutable builder for constructing an instance of [LedgerEntry].
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * .timestamp()
                     * .type()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [LedgerEntry]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Double>? = null
                    private var timestamp: JsonField<OffsetDateTime>? = null
                    private var type: JsonField<Type>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(ledgerEntry: LedgerEntry) = apply {
                        amount = ledgerEntry.amount
                        timestamp = ledgerEntry.timestamp
                        type = ledgerEntry.type
                        additionalProperties = ledgerEntry.additionalProperties.toMutableMap()
                    }

                    /** Amount of the ledger entry */
                    fun amount(amount: Double) = amount(JsonField.of(amount))

                    /**
                     * Sets [Builder.amount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amount] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                    /** The datetime when the ledger is created */
                    fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                    /**
                     * Sets [Builder.timestamp] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.timestamp] with a well-typed
                     * [OffsetDateTime] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                        this.timestamp = timestamp
                    }

                    /** Commit ledger type */
                    fun type(type: Type) = type(JsonField.of(type))

                    /**
                     * Sets [Builder.type] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.type] with a well-typed [Type] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun type(type: JsonField<Type>) = apply { this.type = type }

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
                     * Returns an immutable instance of [LedgerEntry].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * .timestamp()
                     * .type()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): LedgerEntry =
                        LedgerEntry(
                            checkRequired("amount", amount),
                            checkRequired("timestamp", timestamp),
                            checkRequired("type", type),
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
                 * @throws MetronomeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): LedgerEntry = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    timestamp()
                    type().validate()
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
                        (if (timestamp.asKnown().isPresent) 1 else 0) +
                        (type.asKnown().getOrNull()?.validity() ?: 0)

                /** Commit ledger type */
                class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                    Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField
                        val PREPAID_COMMIT_SEGMENT_START = of("PREPAID_COMMIT_SEGMENT_START")

                        @JvmField
                        val PREPAID_COMMIT_AUTOMATED_INVOICE_DEDUCTION =
                            of("PREPAID_COMMIT_AUTOMATED_INVOICE_DEDUCTION")

                        @JvmField val PREPAID_COMMIT_ROLLOVER = of("PREPAID_COMMIT_ROLLOVER")

                        @JvmField val PREPAID_COMMIT_EXPIRATION = of("PREPAID_COMMIT_EXPIRATION")

                        @JvmField val PREPAID_COMMIT_CANCELED = of("PREPAID_COMMIT_CANCELED")

                        @JvmField val PREPAID_COMMIT_CREDITED = of("PREPAID_COMMIT_CREDITED")

                        @JvmField val PREPAID_COMMIT_MANUAL = of("PREPAID_COMMIT_MANUAL")

                        @JvmField
                        val PREPAID_COMMIT_SEAT_BASED_ADJUSTMENT =
                            of("PREPAID_COMMIT_SEAT_BASED_ADJUSTMENT")

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    /** An enum containing [Type]'s known values. */
                    enum class Known {
                        PREPAID_COMMIT_SEGMENT_START,
                        PREPAID_COMMIT_AUTOMATED_INVOICE_DEDUCTION,
                        PREPAID_COMMIT_ROLLOVER,
                        PREPAID_COMMIT_EXPIRATION,
                        PREPAID_COMMIT_CANCELED,
                        PREPAID_COMMIT_CREDITED,
                        PREPAID_COMMIT_MANUAL,
                        PREPAID_COMMIT_SEAT_BASED_ADJUSTMENT,
                    }

                    /**
                     * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Type] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        PREPAID_COMMIT_SEGMENT_START,
                        PREPAID_COMMIT_AUTOMATED_INVOICE_DEDUCTION,
                        PREPAID_COMMIT_ROLLOVER,
                        PREPAID_COMMIT_EXPIRATION,
                        PREPAID_COMMIT_CANCELED,
                        PREPAID_COMMIT_CREDITED,
                        PREPAID_COMMIT_MANUAL,
                        PREPAID_COMMIT_SEAT_BASED_ADJUSTMENT,
                        /**
                         * An enum member indicating that [Type] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            PREPAID_COMMIT_SEGMENT_START -> Value.PREPAID_COMMIT_SEGMENT_START
                            PREPAID_COMMIT_AUTOMATED_INVOICE_DEDUCTION ->
                                Value.PREPAID_COMMIT_AUTOMATED_INVOICE_DEDUCTION
                            PREPAID_COMMIT_ROLLOVER -> Value.PREPAID_COMMIT_ROLLOVER
                            PREPAID_COMMIT_EXPIRATION -> Value.PREPAID_COMMIT_EXPIRATION
                            PREPAID_COMMIT_CANCELED -> Value.PREPAID_COMMIT_CANCELED
                            PREPAID_COMMIT_CREDITED -> Value.PREPAID_COMMIT_CREDITED
                            PREPAID_COMMIT_MANUAL -> Value.PREPAID_COMMIT_MANUAL
                            PREPAID_COMMIT_SEAT_BASED_ADJUSTMENT ->
                                Value.PREPAID_COMMIT_SEAT_BASED_ADJUSTMENT
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws MetronomeInvalidDataException if this class instance's value is a not
                     *   a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            PREPAID_COMMIT_SEGMENT_START -> Known.PREPAID_COMMIT_SEGMENT_START
                            PREPAID_COMMIT_AUTOMATED_INVOICE_DEDUCTION ->
                                Known.PREPAID_COMMIT_AUTOMATED_INVOICE_DEDUCTION
                            PREPAID_COMMIT_ROLLOVER -> Known.PREPAID_COMMIT_ROLLOVER
                            PREPAID_COMMIT_EXPIRATION -> Known.PREPAID_COMMIT_EXPIRATION
                            PREPAID_COMMIT_CANCELED -> Known.PREPAID_COMMIT_CANCELED
                            PREPAID_COMMIT_CREDITED -> Known.PREPAID_COMMIT_CREDITED
                            PREPAID_COMMIT_MANUAL -> Known.PREPAID_COMMIT_MANUAL
                            PREPAID_COMMIT_SEAT_BASED_ADJUSTMENT ->
                                Known.PREPAID_COMMIT_SEAT_BASED_ADJUSTMENT
                            else -> throw MetronomeInvalidDataException("Unknown Type: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws MetronomeInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            MetronomeInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws MetronomeInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): Type = apply {
                        if (validated) {
                            return@apply
                        }

                        known()
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
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Type && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is LedgerEntry &&
                        amount == other.amount &&
                        timestamp == other.timestamp &&
                        type == other.type &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(amount, timestamp, type, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "LedgerEntry{amount=$amount, timestamp=$timestamp, type=$type, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Commit &&
                    id == other.id &&
                    balance == other.balance &&
                    startDate == other.startDate &&
                    endDate == other.endDate &&
                    ledgerEntries == other.ledgerEntries &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(id, balance, startDate, endDate, ledgerEntries, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Commit{id=$id, balance=$balance, startDate=$startDate, endDate=$endDate, ledgerEntries=$ledgerEntries, additionalProperties=$additionalProperties}"
        }

        class Credit
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val balance: JsonField<Double>,
            private val startDate: JsonField<OffsetDateTime>,
            private val endDate: JsonField<OffsetDateTime>,
            private val ledgerEntries: JsonField<List<LedgerEntry>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("balance")
                @ExcludeMissing
                balance: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("start_date")
                @ExcludeMissing
                startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("end_date")
                @ExcludeMissing
                endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("ledger_entries")
                @ExcludeMissing
                ledgerEntries: JsonField<List<LedgerEntry>> = JsonMissing.of(),
            ) : this(id, balance, startDate, endDate, ledgerEntries, mutableMapOf())

            /**
             * The credit ID
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * The current balance for this credit for this specific seat
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun balance(): Double = balance.getRequired("balance")

            /**
             * The datetime when the credit becomes active
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

            /**
             * The datetime when the credit expires
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun endDate(): Optional<OffsetDateTime> = endDate.getOptional("end_date")

            /**
             * Transaction history for this credit for this seat (only included if
             * include_ledgers=true)
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun ledgerEntries(): Optional<List<LedgerEntry>> =
                ledgerEntries.getOptional("ledger_entries")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [balance].
             *
             * Unlike [balance], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("balance") @ExcludeMissing fun _balance(): JsonField<Double> = balance

            /**
             * Returns the raw JSON value of [startDate].
             *
             * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("start_date")
            @ExcludeMissing
            fun _startDate(): JsonField<OffsetDateTime> = startDate

            /**
             * Returns the raw JSON value of [endDate].
             *
             * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("end_date")
            @ExcludeMissing
            fun _endDate(): JsonField<OffsetDateTime> = endDate

            /**
             * Returns the raw JSON value of [ledgerEntries].
             *
             * Unlike [ledgerEntries], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("ledger_entries")
            @ExcludeMissing
            fun _ledgerEntries(): JsonField<List<LedgerEntry>> = ledgerEntries

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
                 * Returns a mutable builder for constructing an instance of [Credit].
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .balance()
                 * .startDate()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Credit]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var balance: JsonField<Double>? = null
                private var startDate: JsonField<OffsetDateTime>? = null
                private var endDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var ledgerEntries: JsonField<MutableList<LedgerEntry>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(credit: Credit) = apply {
                    id = credit.id
                    balance = credit.balance
                    startDate = credit.startDate
                    endDate = credit.endDate
                    ledgerEntries = credit.ledgerEntries.map { it.toMutableList() }
                    additionalProperties = credit.additionalProperties.toMutableMap()
                }

                /** The credit ID */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /** The current balance for this credit for this specific seat */
                fun balance(balance: Double) = balance(JsonField.of(balance))

                /**
                 * Sets [Builder.balance] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.balance] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun balance(balance: JsonField<Double>) = apply { this.balance = balance }

                /** The datetime when the credit becomes active */
                fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

                /**
                 * Sets [Builder.startDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.startDate] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun startDate(startDate: JsonField<OffsetDateTime>) = apply {
                    this.startDate = startDate
                }

                /** The datetime when the credit expires */
                fun endDate(endDate: OffsetDateTime?) = endDate(JsonField.ofNullable(endDate))

                /** Alias for calling [Builder.endDate] with `endDate.orElse(null)`. */
                fun endDate(endDate: Optional<OffsetDateTime>) = endDate(endDate.getOrNull())

                /**
                 * Sets [Builder.endDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.endDate] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

                /**
                 * Transaction history for this credit for this seat (only included if
                 * include_ledgers=true)
                 */
                fun ledgerEntries(ledgerEntries: List<LedgerEntry>) =
                    ledgerEntries(JsonField.of(ledgerEntries))

                /**
                 * Sets [Builder.ledgerEntries] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ledgerEntries] with a well-typed
                 * `List<LedgerEntry>` value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun ledgerEntries(ledgerEntries: JsonField<List<LedgerEntry>>) = apply {
                    this.ledgerEntries = ledgerEntries.map { it.toMutableList() }
                }

                /**
                 * Adds a single [LedgerEntry] to [ledgerEntries].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addLedgerEntry(ledgerEntry: LedgerEntry) = apply {
                    ledgerEntries =
                        (ledgerEntries ?: JsonField.of(mutableListOf())).also {
                            checkKnown("ledgerEntries", it).add(ledgerEntry)
                        }
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
                 * Returns an immutable instance of [Credit].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .balance()
                 * .startDate()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Credit =
                    Credit(
                        checkRequired("id", id),
                        checkRequired("balance", balance),
                        checkRequired("startDate", startDate),
                        endDate,
                        (ledgerEntries ?: JsonMissing.of()).map { it.toImmutable() },
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
            fun validate(): Credit = apply {
                if (validated) {
                    return@apply
                }

                id()
                balance()
                startDate()
                endDate()
                ledgerEntries().ifPresent { it.forEach { it.validate() } }
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
                    (if (balance.asKnown().isPresent) 1 else 0) +
                    (if (startDate.asKnown().isPresent) 1 else 0) +
                    (if (endDate.asKnown().isPresent) 1 else 0) +
                    (ledgerEntries.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

            class LedgerEntry
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val amount: JsonField<Double>,
                private val timestamp: JsonField<OffsetDateTime>,
                private val type: JsonField<Type>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("amount")
                    @ExcludeMissing
                    amount: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("timestamp")
                    @ExcludeMissing
                    timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                ) : this(amount, timestamp, type, mutableMapOf())

                /**
                 * Amount of the ledger entry
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun amount(): Double = amount.getRequired("amount")

                /**
                 * The datetime when the ledger is created
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

                /**
                 * Credit ledger type
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun type(): Type = type.getRequired("type")

                /**
                 * Returns the raw JSON value of [amount].
                 *
                 * Unlike [amount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

                /**
                 * Returns the raw JSON value of [timestamp].
                 *
                 * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("timestamp")
                @ExcludeMissing
                fun _timestamp(): JsonField<OffsetDateTime> = timestamp

                /**
                 * Returns the raw JSON value of [type].
                 *
                 * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
                     * Returns a mutable builder for constructing an instance of [LedgerEntry].
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * .timestamp()
                     * .type()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [LedgerEntry]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Double>? = null
                    private var timestamp: JsonField<OffsetDateTime>? = null
                    private var type: JsonField<Type>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(ledgerEntry: LedgerEntry) = apply {
                        amount = ledgerEntry.amount
                        timestamp = ledgerEntry.timestamp
                        type = ledgerEntry.type
                        additionalProperties = ledgerEntry.additionalProperties.toMutableMap()
                    }

                    /** Amount of the ledger entry */
                    fun amount(amount: Double) = amount(JsonField.of(amount))

                    /**
                     * Sets [Builder.amount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amount] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                    /** The datetime when the ledger is created */
                    fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                    /**
                     * Sets [Builder.timestamp] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.timestamp] with a well-typed
                     * [OffsetDateTime] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                        this.timestamp = timestamp
                    }

                    /** Credit ledger type */
                    fun type(type: Type) = type(JsonField.of(type))

                    /**
                     * Sets [Builder.type] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.type] with a well-typed [Type] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun type(type: JsonField<Type>) = apply { this.type = type }

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
                     * Returns an immutable instance of [LedgerEntry].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * .timestamp()
                     * .type()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): LedgerEntry =
                        LedgerEntry(
                            checkRequired("amount", amount),
                            checkRequired("timestamp", timestamp),
                            checkRequired("type", type),
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
                 * @throws MetronomeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): LedgerEntry = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    timestamp()
                    type().validate()
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
                        (if (timestamp.asKnown().isPresent) 1 else 0) +
                        (type.asKnown().getOrNull()?.validity() ?: 0)

                /** Credit ledger type */
                class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                    Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val CREDIT_SEGMENT_START = of("CREDIT_SEGMENT_START")

                        @JvmField
                        val CREDIT_AUTOMATED_INVOICE_DEDUCTION =
                            of("CREDIT_AUTOMATED_INVOICE_DEDUCTION")

                        @JvmField val CREDIT_EXPIRATION = of("CREDIT_EXPIRATION")

                        @JvmField val CREDIT_CANCELED = of("CREDIT_CANCELED")

                        @JvmField val CREDIT_CREDITED = of("CREDIT_CREDITED")

                        @JvmField val CREDIT_MANUAL = of("CREDIT_MANUAL")

                        @JvmField
                        val CREDIT_SEAT_BASED_ADJUSTMENT = of("CREDIT_SEAT_BASED_ADJUSTMENT")

                        @JvmField val CREDIT_ROLLOVER = of("CREDIT_ROLLOVER")

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    /** An enum containing [Type]'s known values. */
                    enum class Known {
                        CREDIT_SEGMENT_START,
                        CREDIT_AUTOMATED_INVOICE_DEDUCTION,
                        CREDIT_EXPIRATION,
                        CREDIT_CANCELED,
                        CREDIT_CREDITED,
                        CREDIT_MANUAL,
                        CREDIT_SEAT_BASED_ADJUSTMENT,
                        CREDIT_ROLLOVER,
                    }

                    /**
                     * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Type] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        CREDIT_SEGMENT_START,
                        CREDIT_AUTOMATED_INVOICE_DEDUCTION,
                        CREDIT_EXPIRATION,
                        CREDIT_CANCELED,
                        CREDIT_CREDITED,
                        CREDIT_MANUAL,
                        CREDIT_SEAT_BASED_ADJUSTMENT,
                        CREDIT_ROLLOVER,
                        /**
                         * An enum member indicating that [Type] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            CREDIT_SEGMENT_START -> Value.CREDIT_SEGMENT_START
                            CREDIT_AUTOMATED_INVOICE_DEDUCTION ->
                                Value.CREDIT_AUTOMATED_INVOICE_DEDUCTION
                            CREDIT_EXPIRATION -> Value.CREDIT_EXPIRATION
                            CREDIT_CANCELED -> Value.CREDIT_CANCELED
                            CREDIT_CREDITED -> Value.CREDIT_CREDITED
                            CREDIT_MANUAL -> Value.CREDIT_MANUAL
                            CREDIT_SEAT_BASED_ADJUSTMENT -> Value.CREDIT_SEAT_BASED_ADJUSTMENT
                            CREDIT_ROLLOVER -> Value.CREDIT_ROLLOVER
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws MetronomeInvalidDataException if this class instance's value is a not
                     *   a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            CREDIT_SEGMENT_START -> Known.CREDIT_SEGMENT_START
                            CREDIT_AUTOMATED_INVOICE_DEDUCTION ->
                                Known.CREDIT_AUTOMATED_INVOICE_DEDUCTION
                            CREDIT_EXPIRATION -> Known.CREDIT_EXPIRATION
                            CREDIT_CANCELED -> Known.CREDIT_CANCELED
                            CREDIT_CREDITED -> Known.CREDIT_CREDITED
                            CREDIT_MANUAL -> Known.CREDIT_MANUAL
                            CREDIT_SEAT_BASED_ADJUSTMENT -> Known.CREDIT_SEAT_BASED_ADJUSTMENT
                            CREDIT_ROLLOVER -> Known.CREDIT_ROLLOVER
                            else -> throw MetronomeInvalidDataException("Unknown Type: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws MetronomeInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            MetronomeInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws MetronomeInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): Type = apply {
                        if (validated) {
                            return@apply
                        }

                        known()
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
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Type && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is LedgerEntry &&
                        amount == other.amount &&
                        timestamp == other.timestamp &&
                        type == other.type &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(amount, timestamp, type, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "LedgerEntry{amount=$amount, timestamp=$timestamp, type=$type, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Credit &&
                    id == other.id &&
                    balance == other.balance &&
                    startDate == other.startDate &&
                    endDate == other.endDate &&
                    ledgerEntries == other.ledgerEntries &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(id, balance, startDate, endDate, ledgerEntries, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Credit{id=$id, balance=$balance, startDate=$startDate, endDate=$endDate, ledgerEntries=$ledgerEntries, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                balances == other.balances &&
                seatId == other.seatId &&
                commits == other.commits &&
                credits == other.credits &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(balances, seatId, commits, credits, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{balances=$balances, seatId=$seatId, commits=$commits, credits=$credits, additionalProperties=$additionalProperties}"
    }

    class Pagination
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val seatsAvailableForNextPage: JsonField<Double>,
        private val seatsIncluded: JsonField<Double>,
        private val nextPage: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("seats_available_for_next_page")
            @ExcludeMissing
            seatsAvailableForNextPage: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("seats_included")
            @ExcludeMissing
            seatsIncluded: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("next_page")
            @ExcludeMissing
            nextPage: JsonField<String> = JsonMissing.of(),
        ) : this(seatsAvailableForNextPage, seatsIncluded, nextPage, mutableMapOf())

        /**
         * Number of seats available to fetch in the next page
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun seatsAvailableForNextPage(): Double =
            seatsAvailableForNextPage.getRequired("seats_available_for_next_page")

        /**
         * Number of seats included in this response
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun seatsIncluded(): Double = seatsIncluded.getRequired("seats_included")

        /**
         * Token to retrieve the next page of results. Null if no more pages available
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun nextPage(): Optional<String> = nextPage.getOptional("next_page")

        /**
         * Returns the raw JSON value of [seatsAvailableForNextPage].
         *
         * Unlike [seatsAvailableForNextPage], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("seats_available_for_next_page")
        @ExcludeMissing
        fun _seatsAvailableForNextPage(): JsonField<Double> = seatsAvailableForNextPage

        /**
         * Returns the raw JSON value of [seatsIncluded].
         *
         * Unlike [seatsIncluded], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("seats_included")
        @ExcludeMissing
        fun _seatsIncluded(): JsonField<Double> = seatsIncluded

        /**
         * Returns the raw JSON value of [nextPage].
         *
         * Unlike [nextPage], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("next_page") @ExcludeMissing fun _nextPage(): JsonField<String> = nextPage

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
             * Returns a mutable builder for constructing an instance of [Pagination].
             *
             * The following fields are required:
             * ```java
             * .seatsAvailableForNextPage()
             * .seatsIncluded()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Pagination]. */
        class Builder internal constructor() {

            private var seatsAvailableForNextPage: JsonField<Double>? = null
            private var seatsIncluded: JsonField<Double>? = null
            private var nextPage: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(pagination: Pagination) = apply {
                seatsAvailableForNextPage = pagination.seatsAvailableForNextPage
                seatsIncluded = pagination.seatsIncluded
                nextPage = pagination.nextPage
                additionalProperties = pagination.additionalProperties.toMutableMap()
            }

            /** Number of seats available to fetch in the next page */
            fun seatsAvailableForNextPage(seatsAvailableForNextPage: Double) =
                seatsAvailableForNextPage(JsonField.of(seatsAvailableForNextPage))

            /**
             * Sets [Builder.seatsAvailableForNextPage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.seatsAvailableForNextPage] with a well-typed
             * [Double] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun seatsAvailableForNextPage(seatsAvailableForNextPage: JsonField<Double>) = apply {
                this.seatsAvailableForNextPage = seatsAvailableForNextPage
            }

            /** Number of seats included in this response */
            fun seatsIncluded(seatsIncluded: Double) = seatsIncluded(JsonField.of(seatsIncluded))

            /**
             * Sets [Builder.seatsIncluded] to an arbitrary JSON value.
             *
             * You should usually call [Builder.seatsIncluded] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun seatsIncluded(seatsIncluded: JsonField<Double>) = apply {
                this.seatsIncluded = seatsIncluded
            }

            /** Token to retrieve the next page of results. Null if no more pages available */
            fun nextPage(nextPage: String?) = nextPage(JsonField.ofNullable(nextPage))

            /** Alias for calling [Builder.nextPage] with `nextPage.orElse(null)`. */
            fun nextPage(nextPage: Optional<String>) = nextPage(nextPage.getOrNull())

            /**
             * Sets [Builder.nextPage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.nextPage] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun nextPage(nextPage: JsonField<String>) = apply { this.nextPage = nextPage }

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
             * Returns an immutable instance of [Pagination].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .seatsAvailableForNextPage()
             * .seatsIncluded()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Pagination =
                Pagination(
                    checkRequired("seatsAvailableForNextPage", seatsAvailableForNextPage),
                    checkRequired("seatsIncluded", seatsIncluded),
                    nextPage,
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
        fun validate(): Pagination = apply {
            if (validated) {
                return@apply
            }

            seatsAvailableForNextPage()
            seatsIncluded()
            nextPage()
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
            (if (seatsAvailableForNextPage.asKnown().isPresent) 1 else 0) +
                (if (seatsIncluded.asKnown().isPresent) 1 else 0) +
                (if (nextPage.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Pagination &&
                seatsAvailableForNextPage == other.seatsAvailableForNextPage &&
                seatsIncluded == other.seatsIncluded &&
                nextPage == other.nextPage &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(seatsAvailableForNextPage, seatsIncluded, nextPage, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Pagination{seatsAvailableForNextPage=$seatsAvailableForNextPage, seatsIncluded=$seatsIncluded, nextPage=$nextPage, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ContractListSeatBalancesResponse &&
            data == other.data &&
            pagination == other.pagination &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, pagination, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ContractListSeatBalancesResponse{data=$data, pagination=$pagination, additionalProperties=$additionalProperties}"
}
