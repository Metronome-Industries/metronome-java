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
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class CreditGrantListEntriesResponse
@JsonCreator
private constructor(
    @JsonProperty("data")
    @ExcludeMissing
    private val data: JsonField<List<Data>> = JsonMissing.of(),
    @JsonProperty("next_page")
    @ExcludeMissing
    private val nextPage: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun data(): List<Data> = data.getRequired("data")

    fun nextPage(): Optional<String> = Optional.ofNullable(nextPage.getNullable("next_page"))

    @JsonProperty("data") @ExcludeMissing fun _data() = data

    @JsonProperty("next_page") @ExcludeMissing fun _nextPage() = nextPage

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): CreditGrantListEntriesResponse = apply {
        if (!validated) {
            data().forEach { it.validate() }
            nextPage()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var data: JsonField<List<Data>> = JsonMissing.of()
        private var nextPage: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(creditGrantListEntriesResponse: CreditGrantListEntriesResponse) = apply {
            data = creditGrantListEntriesResponse.data
            nextPage = creditGrantListEntriesResponse.nextPage
            additionalProperties =
                creditGrantListEntriesResponse.additionalProperties.toMutableMap()
        }

        fun data(data: List<Data>) = data(JsonField.of(data))

        fun data(data: JsonField<List<Data>>) = apply { this.data = data }

        fun nextPage(nextPage: String) = nextPage(JsonField.of(nextPage))

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

        fun build(): CreditGrantListEntriesResponse =
            CreditGrantListEntriesResponse(
                data.map { it.toImmutable() },
                nextPage,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Data
    @JsonCreator
    private constructor(
        @JsonProperty("customer_id")
        @ExcludeMissing
        private val customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ledgers")
        @ExcludeMissing
        private val ledgers: JsonField<List<Ledger>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun customerId(): String = customerId.getRequired("customer_id")

        fun ledgers(): List<Ledger> = ledgers.getRequired("ledgers")

        @JsonProperty("customer_id") @ExcludeMissing fun _customerId() = customerId

        @JsonProperty("ledgers") @ExcludeMissing fun _ledgers() = ledgers

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (!validated) {
                customerId()
                ledgers().forEach { it.validate() }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var customerId: JsonField<String> = JsonMissing.of()
            private var ledgers: JsonField<List<Ledger>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                customerId = data.customerId
                ledgers = data.ledgers
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            fun ledgers(ledgers: List<Ledger>) = ledgers(JsonField.of(ledgers))

            fun ledgers(ledgers: JsonField<List<Ledger>>) = apply { this.ledgers = ledgers }

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

            fun build(): Data =
                Data(
                    customerId,
                    ledgers.map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class Ledger
        @JsonCreator
        private constructor(
            @JsonProperty("credit_type")
            @ExcludeMissing
            private val creditType: JsonField<CreditTypeData> = JsonMissing.of(),
            @JsonProperty("ending_balance")
            @ExcludeMissing
            private val endingBalance: JsonField<EndingBalance> = JsonMissing.of(),
            @JsonProperty("entries")
            @ExcludeMissing
            private val entries: JsonField<List<CreditLedgerEntry>> = JsonMissing.of(),
            @JsonProperty("pending_entries")
            @ExcludeMissing
            private val pendingEntries: JsonField<List<CreditLedgerEntry>> = JsonMissing.of(),
            @JsonProperty("starting_balance")
            @ExcludeMissing
            private val startingBalance: JsonField<StartingBalance> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun creditType(): CreditTypeData = creditType.getRequired("credit_type")

            /** the effective balances at the end of the specified time window */
            fun endingBalance(): EndingBalance = endingBalance.getRequired("ending_balance")

            fun entries(): List<CreditLedgerEntry> = entries.getRequired("entries")

            fun pendingEntries(): List<CreditLedgerEntry> =
                pendingEntries.getRequired("pending_entries")

            fun startingBalance(): StartingBalance = startingBalance.getRequired("starting_balance")

            @JsonProperty("credit_type") @ExcludeMissing fun _creditType() = creditType

            /** the effective balances at the end of the specified time window */
            @JsonProperty("ending_balance") @ExcludeMissing fun _endingBalance() = endingBalance

            @JsonProperty("entries") @ExcludeMissing fun _entries() = entries

            @JsonProperty("pending_entries") @ExcludeMissing fun _pendingEntries() = pendingEntries

            @JsonProperty("starting_balance")
            @ExcludeMissing
            fun _startingBalance() = startingBalance

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Ledger = apply {
                if (!validated) {
                    creditType().validate()
                    endingBalance().validate()
                    entries().forEach { it.validate() }
                    pendingEntries().forEach { it.validate() }
                    startingBalance().validate()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var creditType: JsonField<CreditTypeData> = JsonMissing.of()
                private var endingBalance: JsonField<EndingBalance> = JsonMissing.of()
                private var entries: JsonField<List<CreditLedgerEntry>> = JsonMissing.of()
                private var pendingEntries: JsonField<List<CreditLedgerEntry>> = JsonMissing.of()
                private var startingBalance: JsonField<StartingBalance> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(ledger: Ledger) = apply {
                    creditType = ledger.creditType
                    endingBalance = ledger.endingBalance
                    entries = ledger.entries
                    pendingEntries = ledger.pendingEntries
                    startingBalance = ledger.startingBalance
                    additionalProperties = ledger.additionalProperties.toMutableMap()
                }

                fun creditType(creditType: CreditTypeData) = creditType(JsonField.of(creditType))

                fun creditType(creditType: JsonField<CreditTypeData>) = apply {
                    this.creditType = creditType
                }

                /** the effective balances at the end of the specified time window */
                fun endingBalance(endingBalance: EndingBalance) =
                    endingBalance(JsonField.of(endingBalance))

                /** the effective balances at the end of the specified time window */
                fun endingBalance(endingBalance: JsonField<EndingBalance>) = apply {
                    this.endingBalance = endingBalance
                }

                fun entries(entries: List<CreditLedgerEntry>) = entries(JsonField.of(entries))

                fun entries(entries: JsonField<List<CreditLedgerEntry>>) = apply {
                    this.entries = entries
                }

                fun pendingEntries(pendingEntries: List<CreditLedgerEntry>) =
                    pendingEntries(JsonField.of(pendingEntries))

                fun pendingEntries(pendingEntries: JsonField<List<CreditLedgerEntry>>) = apply {
                    this.pendingEntries = pendingEntries
                }

                fun startingBalance(startingBalance: StartingBalance) =
                    startingBalance(JsonField.of(startingBalance))

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

                fun build(): Ledger =
                    Ledger(
                        creditType,
                        endingBalance,
                        entries.map { it.toImmutable() },
                        pendingEntries.map { it.toImmutable() },
                        startingBalance,
                        additionalProperties.toImmutable(),
                    )
            }

            /** the effective balances at the end of the specified time window */
            @NoAutoDetect
            class EndingBalance
            @JsonCreator
            private constructor(
                @JsonProperty("effective_at")
                @ExcludeMissing
                private val effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("excluding_pending")
                @ExcludeMissing
                private val excludingPending: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("including_pending")
                @ExcludeMissing
                private val includingPending: JsonField<Double> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /**
                 * the ending_before request parameter (if supplied) or the current billing period's
                 * end date
                 */
                fun effectiveAt(): OffsetDateTime = effectiveAt.getRequired("effective_at")

                /**
                 * the ending balance, including the balance of all grants that have not expired
                 * before the effective_at date and deductions that happened before the effective_at
                 * date
                 */
                fun excludingPending(): Double = excludingPending.getRequired("excluding_pending")

                /**
                 * the excluding_pending balance plus any pending invoice deductions and expirations
                 * that will happen by the effective_at date
                 */
                fun includingPending(): Double = includingPending.getRequired("including_pending")

                /**
                 * the ending_before request parameter (if supplied) or the current billing period's
                 * end date
                 */
                @JsonProperty("effective_at") @ExcludeMissing fun _effectiveAt() = effectiveAt

                /**
                 * the ending balance, including the balance of all grants that have not expired
                 * before the effective_at date and deductions that happened before the effective_at
                 * date
                 */
                @JsonProperty("excluding_pending")
                @ExcludeMissing
                fun _excludingPending() = excludingPending

                /**
                 * the excluding_pending balance plus any pending invoice deductions and expirations
                 * that will happen by the effective_at date
                 */
                @JsonProperty("including_pending")
                @ExcludeMissing
                fun _includingPending() = includingPending

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): EndingBalance = apply {
                    if (!validated) {
                        effectiveAt()
                        excludingPending()
                        includingPending()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var excludingPending: JsonField<Double> = JsonMissing.of()
                    private var includingPending: JsonField<Double> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(endingBalance: EndingBalance) = apply {
                        effectiveAt = endingBalance.effectiveAt
                        excludingPending = endingBalance.excludingPending
                        includingPending = endingBalance.includingPending
                        additionalProperties = endingBalance.additionalProperties.toMutableMap()
                    }

                    /**
                     * the ending_before request parameter (if supplied) or the current billing
                     * period's end date
                     */
                    fun effectiveAt(effectiveAt: OffsetDateTime) =
                        effectiveAt(JsonField.of(effectiveAt))

                    /**
                     * the ending_before request parameter (if supplied) or the current billing
                     * period's end date
                     */
                    fun effectiveAt(effectiveAt: JsonField<OffsetDateTime>) = apply {
                        this.effectiveAt = effectiveAt
                    }

                    /**
                     * the ending balance, including the balance of all grants that have not expired
                     * before the effective_at date and deductions that happened before the
                     * effective_at date
                     */
                    fun excludingPending(excludingPending: Double) =
                        excludingPending(JsonField.of(excludingPending))

                    /**
                     * the ending balance, including the balance of all grants that have not expired
                     * before the effective_at date and deductions that happened before the
                     * effective_at date
                     */
                    fun excludingPending(excludingPending: JsonField<Double>) = apply {
                        this.excludingPending = excludingPending
                    }

                    /**
                     * the excluding_pending balance plus any pending invoice deductions and
                     * expirations that will happen by the effective_at date
                     */
                    fun includingPending(includingPending: Double) =
                        includingPending(JsonField.of(includingPending))

                    /**
                     * the excluding_pending balance plus any pending invoice deductions and
                     * expirations that will happen by the effective_at date
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

                    fun build(): EndingBalance =
                        EndingBalance(
                            effectiveAt,
                            excludingPending,
                            includingPending,
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is EndingBalance && effectiveAt == other.effectiveAt && excludingPending == other.excludingPending && includingPending == other.includingPending && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(effectiveAt, excludingPending, includingPending, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "EndingBalance{effectiveAt=$effectiveAt, excludingPending=$excludingPending, includingPending=$includingPending, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class StartingBalance
            @JsonCreator
            private constructor(
                @JsonProperty("effective_at")
                @ExcludeMissing
                private val effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("excluding_pending")
                @ExcludeMissing
                private val excludingPending: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("including_pending")
                @ExcludeMissing
                private val includingPending: JsonField<Double> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /**
                 * the starting_on request parameter (if supplied) or the first credit grant's
                 * effective_at date
                 */
                fun effectiveAt(): OffsetDateTime = effectiveAt.getRequired("effective_at")

                /**
                 * the starting balance, including all posted grants, deductions, and expirations
                 * that happened at or before the effective_at timestamp
                 */
                fun excludingPending(): Double = excludingPending.getRequired("excluding_pending")

                /**
                 * the excluding_pending balance plus any pending activity that has not been posted
                 * at the time of the query
                 */
                fun includingPending(): Double = includingPending.getRequired("including_pending")

                /**
                 * the starting_on request parameter (if supplied) or the first credit grant's
                 * effective_at date
                 */
                @JsonProperty("effective_at") @ExcludeMissing fun _effectiveAt() = effectiveAt

                /**
                 * the starting balance, including all posted grants, deductions, and expirations
                 * that happened at or before the effective_at timestamp
                 */
                @JsonProperty("excluding_pending")
                @ExcludeMissing
                fun _excludingPending() = excludingPending

                /**
                 * the excluding_pending balance plus any pending activity that has not been posted
                 * at the time of the query
                 */
                @JsonProperty("including_pending")
                @ExcludeMissing
                fun _includingPending() = includingPending

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): StartingBalance = apply {
                    if (!validated) {
                        effectiveAt()
                        excludingPending()
                        includingPending()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var excludingPending: JsonField<Double> = JsonMissing.of()
                    private var includingPending: JsonField<Double> = JsonMissing.of()
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
                     * the starting_on request parameter (if supplied) or the first credit grant's
                     * effective_at date
                     */
                    fun effectiveAt(effectiveAt: JsonField<OffsetDateTime>) = apply {
                        this.effectiveAt = effectiveAt
                    }

                    /**
                     * the starting balance, including all posted grants, deductions, and
                     * expirations that happened at or before the effective_at timestamp
                     */
                    fun excludingPending(excludingPending: Double) =
                        excludingPending(JsonField.of(excludingPending))

                    /**
                     * the starting balance, including all posted grants, deductions, and
                     * expirations that happened at or before the effective_at timestamp
                     */
                    fun excludingPending(excludingPending: JsonField<Double>) = apply {
                        this.excludingPending = excludingPending
                    }

                    /**
                     * the excluding_pending balance plus any pending activity that has not been
                     * posted at the time of the query
                     */
                    fun includingPending(includingPending: Double) =
                        includingPending(JsonField.of(includingPending))

                    /**
                     * the excluding_pending balance plus any pending activity that has not been
                     * posted at the time of the query
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

                    fun build(): StartingBalance =
                        StartingBalance(
                            effectiveAt,
                            excludingPending,
                            includingPending,
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is StartingBalance && effectiveAt == other.effectiveAt && excludingPending == other.excludingPending && includingPending == other.includingPending && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(effectiveAt, excludingPending, includingPending, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "StartingBalance{effectiveAt=$effectiveAt, excludingPending=$excludingPending, includingPending=$includingPending, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Ledger && creditType == other.creditType && endingBalance == other.endingBalance && entries == other.entries && pendingEntries == other.pendingEntries && startingBalance == other.startingBalance && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(creditType, endingBalance, entries, pendingEntries, startingBalance, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Ledger{creditType=$creditType, endingBalance=$endingBalance, entries=$entries, pendingEntries=$pendingEntries, startingBalance=$startingBalance, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Data && customerId == other.customerId && ledgers == other.ledgers && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(customerId, ledgers, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{customerId=$customerId, ledgers=$ledgers, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CreditGrantListEntriesResponse && data == other.data && nextPage == other.nextPage && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(data, nextPage, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CreditGrantListEntriesResponse{data=$data, nextPage=$nextPage, additionalProperties=$additionalProperties}"
}
