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
import com.metronome.api.core.toUnmodifiable
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = CreditListEntriesResponse.Builder::class)
@NoAutoDetect
class CreditListEntriesResponse
private constructor(
    private val data: JsonField<List<Data>>,
    private val nextPage: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun data(): List<Data> = data.getRequired("data")

    fun nextPage(): Optional<String> = Optional.ofNullable(nextPage.getNullable("next_page"))

    @JsonProperty("data") @ExcludeMissing fun _data() = data

    @JsonProperty("next_page") @ExcludeMissing fun _nextPage() = nextPage

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): CreditListEntriesResponse = apply {
        if (!validated) {
            data().forEach { it.validate() }
            nextPage()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CreditListEntriesResponse &&
            this.data == other.data &&
            this.nextPage == other.nextPage &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    data,
                    nextPage,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "CreditListEntriesResponse{data=$data, nextPage=$nextPage, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var data: JsonField<List<Data>> = JsonMissing.of()
        private var nextPage: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(creditListEntriesResponse: CreditListEntriesResponse) = apply {
            this.data = creditListEntriesResponse.data
            this.nextPage = creditListEntriesResponse.nextPage
            additionalProperties(creditListEntriesResponse.additionalProperties)
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

        fun build(): CreditListEntriesResponse =
            CreditListEntriesResponse(
                data.map { it.toUnmodifiable() },
                nextPage,
                additionalProperties.toUnmodifiable(),
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

        private var hashCode: Int = 0

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                this.customerId == other.customerId &&
                this.ledgers == other.ledgers &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        customerId,
                        ledgers,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Data{customerId=$customerId, ledgers=$ledgers, additionalProperties=$additionalProperties}"

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
                    ledgers.map { it.toUnmodifiable() },
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = Ledger.Builder::class)
        @NoAutoDetect
        class Ledger
        private constructor(
            private val creditType: JsonField<CreditType>,
            private val startingBalance: JsonField<StartingBalance>,
            private val endingBalance: JsonField<EndingBalance>,
            private val entries: JsonField<List<Entry>>,
            private val pendingEntries: JsonField<List<PendingEntry>>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun creditType(): CreditType = creditType.getRequired("credit_type")

            fun startingBalance(): StartingBalance = startingBalance.getRequired("starting_balance")

            /** the effective balances at the end of the specified time window */
            fun endingBalance(): EndingBalance = endingBalance.getRequired("ending_balance")

            fun entries(): List<Entry> = entries.getRequired("entries")

            fun pendingEntries(): List<PendingEntry> = pendingEntries.getRequired("pending_entries")

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Ledger &&
                    this.creditType == other.creditType &&
                    this.startingBalance == other.startingBalance &&
                    this.endingBalance == other.endingBalance &&
                    this.entries == other.entries &&
                    this.pendingEntries == other.pendingEntries &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            creditType,
                            startingBalance,
                            endingBalance,
                            entries,
                            pendingEntries,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Ledger{creditType=$creditType, startingBalance=$startingBalance, endingBalance=$endingBalance, entries=$entries, pendingEntries=$pendingEntries, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var creditType: JsonField<CreditType> = JsonMissing.of()
                private var startingBalance: JsonField<StartingBalance> = JsonMissing.of()
                private var endingBalance: JsonField<EndingBalance> = JsonMissing.of()
                private var entries: JsonField<List<Entry>> = JsonMissing.of()
                private var pendingEntries: JsonField<List<PendingEntry>> = JsonMissing.of()
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

                fun creditType(creditType: CreditType) = creditType(JsonField.of(creditType))

                @JsonProperty("credit_type")
                @ExcludeMissing
                fun creditType(creditType: JsonField<CreditType>) = apply {
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

                fun entries(entries: List<Entry>) = entries(JsonField.of(entries))

                @JsonProperty("entries")
                @ExcludeMissing
                fun entries(entries: JsonField<List<Entry>>) = apply { this.entries = entries }

                fun pendingEntries(pendingEntries: List<PendingEntry>) =
                    pendingEntries(JsonField.of(pendingEntries))

                @JsonProperty("pending_entries")
                @ExcludeMissing
                fun pendingEntries(pendingEntries: JsonField<List<PendingEntry>>) = apply {
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
                        entries.map { it.toUnmodifiable() },
                        pendingEntries.map { it.toUnmodifiable() },
                        additionalProperties.toUnmodifiable(),
                    )
            }

            @JsonDeserialize(builder = CreditType.Builder::class)
            @NoAutoDetect
            class CreditType
            private constructor(
                private val name: JsonField<String>,
                private val id: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                fun name(): String = name.getRequired("name")

                fun id(): String = id.getRequired("id")

                @JsonProperty("name") @ExcludeMissing fun _name() = name

                @JsonProperty("id") @ExcludeMissing fun _id() = id

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): CreditType = apply {
                    if (!validated) {
                        name()
                        id()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CreditType &&
                        this.name == other.name &&
                        this.id == other.id &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                name,
                                id,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "CreditType{name=$name, id=$id, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var name: JsonField<String> = JsonMissing.of()
                    private var id: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(creditType: CreditType) = apply {
                        this.name = creditType.name
                        this.id = creditType.id
                        additionalProperties(creditType.additionalProperties)
                    }

                    fun name(name: String) = name(JsonField.of(name))

                    @JsonProperty("name")
                    @ExcludeMissing
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    fun id(id: String) = id(JsonField.of(id))

                    @JsonProperty("id")
                    @ExcludeMissing
                    fun id(id: JsonField<String>) = apply { this.id = id }

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

                    fun build(): CreditType =
                        CreditType(
                            name,
                            id,
                            additionalProperties.toUnmodifiable(),
                        )
                }
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

                private var hashCode: Int = 0

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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is EndingBalance &&
                        this.excludingPending == other.excludingPending &&
                        this.includingPending == other.includingPending &&
                        this.effectiveAt == other.effectiveAt &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                excludingPending,
                                includingPending,
                                effectiveAt,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "EndingBalance{excludingPending=$excludingPending, includingPending=$includingPending, effectiveAt=$effectiveAt, additionalProperties=$additionalProperties}"

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
                            additionalProperties.toUnmodifiable(),
                        )
                }
            }

            @JsonDeserialize(builder = Entry.Builder::class)
            @NoAutoDetect
            class Entry
            private constructor(
                private val amount: JsonField<Double>,
                private val reason: JsonField<String>,
                private val runningBalance: JsonField<Double>,
                private val effectiveAt: JsonField<OffsetDateTime>,
                private val createdBy: JsonField<String>,
                private val creditGrantId: JsonField<String>,
                private val invoiceId: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** an amount representing the change to the customer's credit balance */
                fun amount(): Double = amount.getRequired("amount")

                fun reason(): String = reason.getRequired("reason")

                /**
                 * the running balance for this credit type at the time of the ledger entry,
                 * including all preceding charges
                 */
                fun runningBalance(): Double = runningBalance.getRequired("running_balance")

                fun effectiveAt(): OffsetDateTime = effectiveAt.getRequired("effective_at")

                fun createdBy(): String = createdBy.getRequired("created_by")

                /** the credit grant this entry is related to */
                fun creditGrantId(): String = creditGrantId.getRequired("credit_grant_id")

                /**
                 * if this entry is a deduction, the Metronome ID of the invoice where the credit
                 * deduction was consumed; if this entry is a grant, the Metronome ID of the invoice
                 * where the grant's paid_amount was charged
                 */
                fun invoiceId(): Optional<String> =
                    Optional.ofNullable(invoiceId.getNullable("invoice_id"))

                /** an amount representing the change to the customer's credit balance */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

                /**
                 * the running balance for this credit type at the time of the ledger entry,
                 * including all preceding charges
                 */
                @JsonProperty("running_balance")
                @ExcludeMissing
                fun _runningBalance() = runningBalance

                @JsonProperty("effective_at") @ExcludeMissing fun _effectiveAt() = effectiveAt

                @JsonProperty("created_by") @ExcludeMissing fun _createdBy() = createdBy

                /** the credit grant this entry is related to */
                @JsonProperty("credit_grant_id")
                @ExcludeMissing
                fun _creditGrantId() = creditGrantId

                /**
                 * if this entry is a deduction, the Metronome ID of the invoice where the credit
                 * deduction was consumed; if this entry is a grant, the Metronome ID of the invoice
                 * where the grant's paid_amount was charged
                 */
                @JsonProperty("invoice_id") @ExcludeMissing fun _invoiceId() = invoiceId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Entry = apply {
                    if (!validated) {
                        amount()
                        reason()
                        runningBalance()
                        effectiveAt()
                        createdBy()
                        creditGrantId()
                        invoiceId()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Entry &&
                        this.amount == other.amount &&
                        this.reason == other.reason &&
                        this.runningBalance == other.runningBalance &&
                        this.effectiveAt == other.effectiveAt &&
                        this.createdBy == other.createdBy &&
                        this.creditGrantId == other.creditGrantId &&
                        this.invoiceId == other.invoiceId &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                amount,
                                reason,
                                runningBalance,
                                effectiveAt,
                                createdBy,
                                creditGrantId,
                                invoiceId,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "Entry{amount=$amount, reason=$reason, runningBalance=$runningBalance, effectiveAt=$effectiveAt, createdBy=$createdBy, creditGrantId=$creditGrantId, invoiceId=$invoiceId, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var amount: JsonField<Double> = JsonMissing.of()
                    private var reason: JsonField<String> = JsonMissing.of()
                    private var runningBalance: JsonField<Double> = JsonMissing.of()
                    private var effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var createdBy: JsonField<String> = JsonMissing.of()
                    private var creditGrantId: JsonField<String> = JsonMissing.of()
                    private var invoiceId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(entry: Entry) = apply {
                        this.amount = entry.amount
                        this.reason = entry.reason
                        this.runningBalance = entry.runningBalance
                        this.effectiveAt = entry.effectiveAt
                        this.createdBy = entry.createdBy
                        this.creditGrantId = entry.creditGrantId
                        this.invoiceId = entry.invoiceId
                        additionalProperties(entry.additionalProperties)
                    }

                    /** an amount representing the change to the customer's credit balance */
                    fun amount(amount: Double) = amount(JsonField.of(amount))

                    /** an amount representing the change to the customer's credit balance */
                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                    fun reason(reason: String) = reason(JsonField.of(reason))

                    @JsonProperty("reason")
                    @ExcludeMissing
                    fun reason(reason: JsonField<String>) = apply { this.reason = reason }

                    /**
                     * the running balance for this credit type at the time of the ledger entry,
                     * including all preceding charges
                     */
                    fun runningBalance(runningBalance: Double) =
                        runningBalance(JsonField.of(runningBalance))

                    /**
                     * the running balance for this credit type at the time of the ledger entry,
                     * including all preceding charges
                     */
                    @JsonProperty("running_balance")
                    @ExcludeMissing
                    fun runningBalance(runningBalance: JsonField<Double>) = apply {
                        this.runningBalance = runningBalance
                    }

                    fun effectiveAt(effectiveAt: OffsetDateTime) =
                        effectiveAt(JsonField.of(effectiveAt))

                    @JsonProperty("effective_at")
                    @ExcludeMissing
                    fun effectiveAt(effectiveAt: JsonField<OffsetDateTime>) = apply {
                        this.effectiveAt = effectiveAt
                    }

                    fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

                    @JsonProperty("created_by")
                    @ExcludeMissing
                    fun createdBy(createdBy: JsonField<String>) = apply {
                        this.createdBy = createdBy
                    }

                    /** the credit grant this entry is related to */
                    fun creditGrantId(creditGrantId: String) =
                        creditGrantId(JsonField.of(creditGrantId))

                    /** the credit grant this entry is related to */
                    @JsonProperty("credit_grant_id")
                    @ExcludeMissing
                    fun creditGrantId(creditGrantId: JsonField<String>) = apply {
                        this.creditGrantId = creditGrantId
                    }

                    /**
                     * if this entry is a deduction, the Metronome ID of the invoice where the
                     * credit deduction was consumed; if this entry is a grant, the Metronome ID of
                     * the invoice where the grant's paid_amount was charged
                     */
                    fun invoiceId(invoiceId: String) = invoiceId(JsonField.of(invoiceId))

                    /**
                     * if this entry is a deduction, the Metronome ID of the invoice where the
                     * credit deduction was consumed; if this entry is a grant, the Metronome ID of
                     * the invoice where the grant's paid_amount was charged
                     */
                    @JsonProperty("invoice_id")
                    @ExcludeMissing
                    fun invoiceId(invoiceId: JsonField<String>) = apply {
                        this.invoiceId = invoiceId
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

                    fun build(): Entry =
                        Entry(
                            amount,
                            reason,
                            runningBalance,
                            effectiveAt,
                            createdBy,
                            creditGrantId,
                            invoiceId,
                            additionalProperties.toUnmodifiable(),
                        )
                }
            }

            @JsonDeserialize(builder = PendingEntry.Builder::class)
            @NoAutoDetect
            class PendingEntry
            private constructor(
                private val amount: JsonField<Double>,
                private val reason: JsonField<String>,
                private val runningBalance: JsonField<Double>,
                private val effectiveAt: JsonField<OffsetDateTime>,
                private val createdBy: JsonField<String>,
                private val creditGrantId: JsonField<String>,
                private val invoiceId: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** an amount representing the change to the customer's credit balance */
                fun amount(): Double = amount.getRequired("amount")

                fun reason(): String = reason.getRequired("reason")

                /**
                 * the running balance for this credit type at the time of the ledger entry,
                 * including all preceding charges
                 */
                fun runningBalance(): Double = runningBalance.getRequired("running_balance")

                fun effectiveAt(): OffsetDateTime = effectiveAt.getRequired("effective_at")

                fun createdBy(): String = createdBy.getRequired("created_by")

                /** the credit grant this entry is related to */
                fun creditGrantId(): String = creditGrantId.getRequired("credit_grant_id")

                /**
                 * if this entry is a deduction, the Metronome ID of the invoice where the credit
                 * deduction was consumed; if this entry is a grant, the Metronome ID of the invoice
                 * where the grant's paid_amount was charged
                 */
                fun invoiceId(): Optional<String> =
                    Optional.ofNullable(invoiceId.getNullable("invoice_id"))

                /** an amount representing the change to the customer's credit balance */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

                /**
                 * the running balance for this credit type at the time of the ledger entry,
                 * including all preceding charges
                 */
                @JsonProperty("running_balance")
                @ExcludeMissing
                fun _runningBalance() = runningBalance

                @JsonProperty("effective_at") @ExcludeMissing fun _effectiveAt() = effectiveAt

                @JsonProperty("created_by") @ExcludeMissing fun _createdBy() = createdBy

                /** the credit grant this entry is related to */
                @JsonProperty("credit_grant_id")
                @ExcludeMissing
                fun _creditGrantId() = creditGrantId

                /**
                 * if this entry is a deduction, the Metronome ID of the invoice where the credit
                 * deduction was consumed; if this entry is a grant, the Metronome ID of the invoice
                 * where the grant's paid_amount was charged
                 */
                @JsonProperty("invoice_id") @ExcludeMissing fun _invoiceId() = invoiceId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): PendingEntry = apply {
                    if (!validated) {
                        amount()
                        reason()
                        runningBalance()
                        effectiveAt()
                        createdBy()
                        creditGrantId()
                        invoiceId()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is PendingEntry &&
                        this.amount == other.amount &&
                        this.reason == other.reason &&
                        this.runningBalance == other.runningBalance &&
                        this.effectiveAt == other.effectiveAt &&
                        this.createdBy == other.createdBy &&
                        this.creditGrantId == other.creditGrantId &&
                        this.invoiceId == other.invoiceId &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                amount,
                                reason,
                                runningBalance,
                                effectiveAt,
                                createdBy,
                                creditGrantId,
                                invoiceId,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "PendingEntry{amount=$amount, reason=$reason, runningBalance=$runningBalance, effectiveAt=$effectiveAt, createdBy=$createdBy, creditGrantId=$creditGrantId, invoiceId=$invoiceId, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var amount: JsonField<Double> = JsonMissing.of()
                    private var reason: JsonField<String> = JsonMissing.of()
                    private var runningBalance: JsonField<Double> = JsonMissing.of()
                    private var effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var createdBy: JsonField<String> = JsonMissing.of()
                    private var creditGrantId: JsonField<String> = JsonMissing.of()
                    private var invoiceId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(pendingEntry: PendingEntry) = apply {
                        this.amount = pendingEntry.amount
                        this.reason = pendingEntry.reason
                        this.runningBalance = pendingEntry.runningBalance
                        this.effectiveAt = pendingEntry.effectiveAt
                        this.createdBy = pendingEntry.createdBy
                        this.creditGrantId = pendingEntry.creditGrantId
                        this.invoiceId = pendingEntry.invoiceId
                        additionalProperties(pendingEntry.additionalProperties)
                    }

                    /** an amount representing the change to the customer's credit balance */
                    fun amount(amount: Double) = amount(JsonField.of(amount))

                    /** an amount representing the change to the customer's credit balance */
                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                    fun reason(reason: String) = reason(JsonField.of(reason))

                    @JsonProperty("reason")
                    @ExcludeMissing
                    fun reason(reason: JsonField<String>) = apply { this.reason = reason }

                    /**
                     * the running balance for this credit type at the time of the ledger entry,
                     * including all preceding charges
                     */
                    fun runningBalance(runningBalance: Double) =
                        runningBalance(JsonField.of(runningBalance))

                    /**
                     * the running balance for this credit type at the time of the ledger entry,
                     * including all preceding charges
                     */
                    @JsonProperty("running_balance")
                    @ExcludeMissing
                    fun runningBalance(runningBalance: JsonField<Double>) = apply {
                        this.runningBalance = runningBalance
                    }

                    fun effectiveAt(effectiveAt: OffsetDateTime) =
                        effectiveAt(JsonField.of(effectiveAt))

                    @JsonProperty("effective_at")
                    @ExcludeMissing
                    fun effectiveAt(effectiveAt: JsonField<OffsetDateTime>) = apply {
                        this.effectiveAt = effectiveAt
                    }

                    fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

                    @JsonProperty("created_by")
                    @ExcludeMissing
                    fun createdBy(createdBy: JsonField<String>) = apply {
                        this.createdBy = createdBy
                    }

                    /** the credit grant this entry is related to */
                    fun creditGrantId(creditGrantId: String) =
                        creditGrantId(JsonField.of(creditGrantId))

                    /** the credit grant this entry is related to */
                    @JsonProperty("credit_grant_id")
                    @ExcludeMissing
                    fun creditGrantId(creditGrantId: JsonField<String>) = apply {
                        this.creditGrantId = creditGrantId
                    }

                    /**
                     * if this entry is a deduction, the Metronome ID of the invoice where the
                     * credit deduction was consumed; if this entry is a grant, the Metronome ID of
                     * the invoice where the grant's paid_amount was charged
                     */
                    fun invoiceId(invoiceId: String) = invoiceId(JsonField.of(invoiceId))

                    /**
                     * if this entry is a deduction, the Metronome ID of the invoice where the
                     * credit deduction was consumed; if this entry is a grant, the Metronome ID of
                     * the invoice where the grant's paid_amount was charged
                     */
                    @JsonProperty("invoice_id")
                    @ExcludeMissing
                    fun invoiceId(invoiceId: JsonField<String>) = apply {
                        this.invoiceId = invoiceId
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

                    fun build(): PendingEntry =
                        PendingEntry(
                            amount,
                            reason,
                            runningBalance,
                            effectiveAt,
                            createdBy,
                            creditGrantId,
                            invoiceId,
                            additionalProperties.toUnmodifiable(),
                        )
                }
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

                private var hashCode: Int = 0

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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is StartingBalance &&
                        this.excludingPending == other.excludingPending &&
                        this.includingPending == other.includingPending &&
                        this.effectiveAt == other.effectiveAt &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                excludingPending,
                                includingPending,
                                effectiveAt,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "StartingBalance{excludingPending=$excludingPending, includingPending=$includingPending, effectiveAt=$effectiveAt, additionalProperties=$additionalProperties}"

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
                            additionalProperties.toUnmodifiable(),
                        )
                }
            }
        }
    }
}
