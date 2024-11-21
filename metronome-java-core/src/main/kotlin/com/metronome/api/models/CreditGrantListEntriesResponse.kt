// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = CreditGrantListEntriesResponse.Builder::class)
@NoAutoDetect
class CreditGrantListEntriesResponse
private constructor(
    private val data: JsonField<List<Data>>,
    private val nextPage: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun data(): List<Data> = data.getRequired("data")

    fun nextPage(): Optional<String> = Optional.ofNullable(nextPage.getNullable("next_page"))

    @JsonProperty("data") @ExcludeMissing fun _data() = data

    @JsonProperty("next_page") @ExcludeMissing fun _nextPage() = nextPage

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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
            this.data = creditGrantListEntriesResponse.data
            this.nextPage = creditGrantListEntriesResponse.nextPage
            additionalProperties(creditGrantListEntriesResponse.additionalProperties)
        }

        fun data(data: List<Data>) = data(JsonField.of(data))

        @JsonProperty("data")
        @ExcludeMissing
        fun data(data: JsonField<List<Data>>) = apply { this.data = data }

        fun nextPage(nextPage: String) = nextPage(JsonField.of(nextPage))

        @JsonProperty("next_page")
        @ExcludeMissing
        fun nextPage(nextPage: JsonField<String>) = apply { this.nextPage = nextPage }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): CreditGrantListEntriesResponse =
            CreditGrantListEntriesResponse(
                data.map { it.toImmutable() },
                nextPage,
                additionalProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = Data.Builder::class)
    @NoAutoDetect
    class Data
    private constructor(
        private val customerId: JsonField<String>,
        private val ledgers: JsonField<List<Ledger>>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun customerId(): String = customerId.getRequired("customer_id")

        fun ledgers(): List<Ledger> = ledgers.getRequired("ledgers")

        @JsonProperty("customer_id") @ExcludeMissing fun _customerId() = customerId

        @JsonProperty("ledgers") @ExcludeMissing fun _ledgers() = ledgers

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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
                this.customerId = data.customerId
                this.ledgers = data.ledgers
                additionalProperties(data.additionalProperties)
            }

            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            @JsonProperty("customer_id")
            @ExcludeMissing
            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            fun ledgers(ledgers: List<Ledger>) = ledgers(JsonField.of(ledgers))

            @JsonProperty("ledgers")
            @ExcludeMissing
            fun ledgers(ledgers: JsonField<List<Ledger>>) = apply { this.ledgers = ledgers }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Data =
                Data(
                    customerId,
                    ledgers.map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        @JsonDeserialize(builder = Ledger.Builder::class)
        @NoAutoDetect
        class Ledger
        private constructor(
            private val creditType: JsonField<CreditTypeData>,
            private val startingBalance: JsonField<StartingBalance>,
            private val endingBalance: JsonField<EndingBalance>,
            private val entries: JsonField<List<CreditLedgerEntry>>,
            private val pendingEntries: JsonField<List<CreditLedgerEntry>>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun creditType(): CreditTypeData = creditType.getRequired("credit_type")

            fun startingBalance(): StartingBalance = startingBalance.getRequired("starting_balance")

            /** the effective balances at the end of the specified time window */
            fun endingBalance(): EndingBalance = endingBalance.getRequired("ending_balance")

            fun entries(): List<CreditLedgerEntry> = entries.getRequired("entries")

            fun pendingEntries(): List<CreditLedgerEntry> =
                pendingEntries.getRequired("pending_entries")

            @JsonProperty("credit_type") @ExcludeMissing fun _creditType() = creditType

            @JsonProperty("starting_balance")
            @ExcludeMissing
            fun _startingBalance() = startingBalance

            /** the effective balances at the end of the specified time window */
            @JsonProperty("ending_balance") @ExcludeMissing fun _endingBalance() = endingBalance

            @JsonProperty("entries") @ExcludeMissing fun _entries() = entries

            @JsonProperty("pending_entries") @ExcludeMissing fun _pendingEntries() = pendingEntries

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Ledger = apply {
                if (!validated) {
                    creditType().validate()
                    startingBalance().validate()
                    endingBalance().validate()
                    entries().forEach { it.validate() }
                    pendingEntries().forEach { it.validate() }
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var creditType: JsonField<CreditTypeData> = JsonMissing.of()
                private var startingBalance: JsonField<StartingBalance> = JsonMissing.of()
                private var endingBalance: JsonField<EndingBalance> = JsonMissing.of()
                private var entries: JsonField<List<CreditLedgerEntry>> = JsonMissing.of()
                private var pendingEntries: JsonField<List<CreditLedgerEntry>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(ledger: Ledger) = apply {
                    this.creditType = ledger.creditType
                    this.startingBalance = ledger.startingBalance
                    this.endingBalance = ledger.endingBalance
                    this.entries = ledger.entries
                    this.pendingEntries = ledger.pendingEntries
                    additionalProperties(ledger.additionalProperties)
                }

                fun creditType(creditType: CreditTypeData) = creditType(JsonField.of(creditType))

                @JsonProperty("credit_type")
                @ExcludeMissing
                fun creditType(creditType: JsonField<CreditTypeData>) = apply {
                    this.creditType = creditType
                }

                fun startingBalance(startingBalance: StartingBalance) =
                    startingBalance(JsonField.of(startingBalance))

                @JsonProperty("starting_balance")
                @ExcludeMissing
                fun startingBalance(startingBalance: JsonField<StartingBalance>) = apply {
                    this.startingBalance = startingBalance
                }

                /** the effective balances at the end of the specified time window */
                fun endingBalance(endingBalance: EndingBalance) =
                    endingBalance(JsonField.of(endingBalance))

                /** the effective balances at the end of the specified time window */
                @JsonProperty("ending_balance")
                @ExcludeMissing
                fun endingBalance(endingBalance: JsonField<EndingBalance>) = apply {
                    this.endingBalance = endingBalance
                }

                fun entries(entries: List<CreditLedgerEntry>) = entries(JsonField.of(entries))

                @JsonProperty("entries")
                @ExcludeMissing
                fun entries(entries: JsonField<List<CreditLedgerEntry>>) = apply {
                    this.entries = entries
                }

                fun pendingEntries(pendingEntries: List<CreditLedgerEntry>) =
                    pendingEntries(JsonField.of(pendingEntries))

                @JsonProperty("pending_entries")
                @ExcludeMissing
                fun pendingEntries(pendingEntries: JsonField<List<CreditLedgerEntry>>) = apply {
                    this.pendingEntries = pendingEntries
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Ledger =
                    Ledger(
                        creditType,
                        startingBalance,
                        endingBalance,
                        entries.map { it.toImmutable() },
                        pendingEntries.map { it.toImmutable() },
                        additionalProperties.toImmutable(),
                    )
            }

            /** the effective balances at the end of the specified time window */
            @JsonDeserialize(builder = EndingBalance.Builder::class)
            @NoAutoDetect
            class EndingBalance
            private constructor(
                private val excludingPending: JsonField<Double>,
                private val includingPending: JsonField<Double>,
                private val effectiveAt: JsonField<OffsetDateTime>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

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
                fun effectiveAt(): OffsetDateTime = effectiveAt.getRequired("effective_at")

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

                /**
                 * the ending_before request parameter (if supplied) or the current billing period's
                 * end date
                 */
                @JsonProperty("effective_at") @ExcludeMissing fun _effectiveAt() = effectiveAt

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): EndingBalance = apply {
                    if (!validated) {
                        excludingPending()
                        includingPending()
                        effectiveAt()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var excludingPending: JsonField<Double> = JsonMissing.of()
                    private var includingPending: JsonField<Double> = JsonMissing.of()
                    private var effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(endingBalance: EndingBalance) = apply {
                        this.excludingPending = endingBalance.excludingPending
                        this.includingPending = endingBalance.includingPending
                        this.effectiveAt = endingBalance.effectiveAt
                        additionalProperties(endingBalance.additionalProperties)
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
                    @JsonProperty("excluding_pending")
                    @ExcludeMissing
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
                    @JsonProperty("including_pending")
                    @ExcludeMissing
                    fun includingPending(includingPending: JsonField<Double>) = apply {
                        this.includingPending = includingPending
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
                    @JsonProperty("effective_at")
                    @ExcludeMissing
                    fun effectiveAt(effectiveAt: JsonField<OffsetDateTime>) = apply {
                        this.effectiveAt = effectiveAt
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): EndingBalance =
                        EndingBalance(
                            excludingPending,
                            includingPending,
                            effectiveAt,
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is EndingBalance && excludingPending == other.excludingPending && includingPending == other.includingPending && effectiveAt == other.effectiveAt && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(excludingPending, includingPending, effectiveAt, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "EndingBalance{excludingPending=$excludingPending, includingPending=$includingPending, effectiveAt=$effectiveAt, additionalProperties=$additionalProperties}"
            }

            @JsonDeserialize(builder = StartingBalance.Builder::class)
            @NoAutoDetect
            class StartingBalance
            private constructor(
                private val excludingPending: JsonField<Double>,
                private val includingPending: JsonField<Double>,
                private val effectiveAt: JsonField<OffsetDateTime>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

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
                fun effectiveAt(): OffsetDateTime = effectiveAt.getRequired("effective_at")

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

                /**
                 * the starting_on request parameter (if supplied) or the first credit grant's
                 * effective_at date
                 */
                @JsonProperty("effective_at") @ExcludeMissing fun _effectiveAt() = effectiveAt

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): StartingBalance = apply {
                    if (!validated) {
                        excludingPending()
                        includingPending()
                        effectiveAt()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var excludingPending: JsonField<Double> = JsonMissing.of()
                    private var includingPending: JsonField<Double> = JsonMissing.of()
                    private var effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(startingBalance: StartingBalance) = apply {
                        this.excludingPending = startingBalance.excludingPending
                        this.includingPending = startingBalance.includingPending
                        this.effectiveAt = startingBalance.effectiveAt
                        additionalProperties(startingBalance.additionalProperties)
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
                    @JsonProperty("excluding_pending")
                    @ExcludeMissing
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
                    @JsonProperty("including_pending")
                    @ExcludeMissing
                    fun includingPending(includingPending: JsonField<Double>) = apply {
                        this.includingPending = includingPending
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
                    @JsonProperty("effective_at")
                    @ExcludeMissing
                    fun effectiveAt(effectiveAt: JsonField<OffsetDateTime>) = apply {
                        this.effectiveAt = effectiveAt
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): StartingBalance =
                        StartingBalance(
                            excludingPending,
                            includingPending,
                            effectiveAt,
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is StartingBalance && excludingPending == other.excludingPending && includingPending == other.includingPending && effectiveAt == other.effectiveAt && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(excludingPending, includingPending, effectiveAt, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "StartingBalance{excludingPending=$excludingPending, includingPending=$includingPending, effectiveAt=$effectiveAt, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Ledger && creditType == other.creditType && startingBalance == other.startingBalance && endingBalance == other.endingBalance && entries == other.entries && pendingEntries == other.pendingEntries && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(creditType, startingBalance, endingBalance, entries, pendingEntries, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Ledger{creditType=$creditType, startingBalance=$startingBalance, endingBalance=$endingBalance, entries=$entries, pendingEntries=$pendingEntries, additionalProperties=$additionalProperties}"
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
