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
class CreditLedgerEntry
@JsonCreator
private constructor(
    @JsonProperty("amount")
    @ExcludeMissing
    private val amount: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("reason")
    @ExcludeMissing
    private val reason: JsonField<String> = JsonMissing.of(),
    @JsonProperty("running_balance")
    @ExcludeMissing
    private val runningBalance: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("effective_at")
    @ExcludeMissing
    private val effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("created_by")
    @ExcludeMissing
    private val createdBy: JsonField<String> = JsonMissing.of(),
    @JsonProperty("credit_grant_id")
    @ExcludeMissing
    private val creditGrantId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("invoice_id")
    @ExcludeMissing
    private val invoiceId: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** an amount representing the change to the customer's credit balance */
    fun amount(): Double = amount.getRequired("amount")

    fun reason(): String = reason.getRequired("reason")

    /**
     * the running balance for this credit type at the time of the ledger entry, including all
     * preceding charges
     */
    fun runningBalance(): Double = runningBalance.getRequired("running_balance")

    fun effectiveAt(): OffsetDateTime = effectiveAt.getRequired("effective_at")

    fun createdBy(): String = createdBy.getRequired("created_by")

    /** the credit grant this entry is related to */
    fun creditGrantId(): String = creditGrantId.getRequired("credit_grant_id")

    /**
     * if this entry is a deduction, the Metronome ID of the invoice where the credit deduction was
     * consumed; if this entry is a grant, the Metronome ID of the invoice where the grant's
     * paid_amount was charged
     */
    fun invoiceId(): Optional<String> = Optional.ofNullable(invoiceId.getNullable("invoice_id"))

    /** an amount representing the change to the customer's credit balance */
    @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

    @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

    /**
     * the running balance for this credit type at the time of the ledger entry, including all
     * preceding charges
     */
    @JsonProperty("running_balance") @ExcludeMissing fun _runningBalance() = runningBalance

    @JsonProperty("effective_at") @ExcludeMissing fun _effectiveAt() = effectiveAt

    @JsonProperty("created_by") @ExcludeMissing fun _createdBy() = createdBy

    /** the credit grant this entry is related to */
    @JsonProperty("credit_grant_id") @ExcludeMissing fun _creditGrantId() = creditGrantId

    /**
     * if this entry is a deduction, the Metronome ID of the invoice where the credit deduction was
     * consumed; if this entry is a grant, the Metronome ID of the invoice where the grant's
     * paid_amount was charged
     */
    @JsonProperty("invoice_id") @ExcludeMissing fun _invoiceId() = invoiceId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): CreditLedgerEntry = apply {
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
        internal fun from(creditLedgerEntry: CreditLedgerEntry) = apply {
            amount = creditLedgerEntry.amount
            reason = creditLedgerEntry.reason
            runningBalance = creditLedgerEntry.runningBalance
            effectiveAt = creditLedgerEntry.effectiveAt
            createdBy = creditLedgerEntry.createdBy
            creditGrantId = creditLedgerEntry.creditGrantId
            invoiceId = creditLedgerEntry.invoiceId
            additionalProperties = creditLedgerEntry.additionalProperties.toMutableMap()
        }

        /** an amount representing the change to the customer's credit balance */
        fun amount(amount: Double) = amount(JsonField.of(amount))

        /** an amount representing the change to the customer's credit balance */
        fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

        fun reason(reason: String) = reason(JsonField.of(reason))

        fun reason(reason: JsonField<String>) = apply { this.reason = reason }

        /**
         * the running balance for this credit type at the time of the ledger entry, including all
         * preceding charges
         */
        fun runningBalance(runningBalance: Double) = runningBalance(JsonField.of(runningBalance))

        /**
         * the running balance for this credit type at the time of the ledger entry, including all
         * preceding charges
         */
        fun runningBalance(runningBalance: JsonField<Double>) = apply {
            this.runningBalance = runningBalance
        }

        fun effectiveAt(effectiveAt: OffsetDateTime) = effectiveAt(JsonField.of(effectiveAt))

        fun effectiveAt(effectiveAt: JsonField<OffsetDateTime>) = apply {
            this.effectiveAt = effectiveAt
        }

        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        /** the credit grant this entry is related to */
        fun creditGrantId(creditGrantId: String) = creditGrantId(JsonField.of(creditGrantId))

        /** the credit grant this entry is related to */
        fun creditGrantId(creditGrantId: JsonField<String>) = apply {
            this.creditGrantId = creditGrantId
        }

        /**
         * if this entry is a deduction, the Metronome ID of the invoice where the credit deduction
         * was consumed; if this entry is a grant, the Metronome ID of the invoice where the grant's
         * paid_amount was charged
         */
        fun invoiceId(invoiceId: String) = invoiceId(JsonField.of(invoiceId))

        /**
         * if this entry is a deduction, the Metronome ID of the invoice where the credit deduction
         * was consumed; if this entry is a grant, the Metronome ID of the invoice where the grant's
         * paid_amount was charged
         */
        fun invoiceId(invoiceId: JsonField<String>) = apply { this.invoiceId = invoiceId }

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

        fun build(): CreditLedgerEntry =
            CreditLedgerEntry(
                amount,
                reason,
                runningBalance,
                effectiveAt,
                createdBy,
                creditGrantId,
                invoiceId,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CreditLedgerEntry && amount == other.amount && reason == other.reason && runningBalance == other.runningBalance && effectiveAt == other.effectiveAt && createdBy == other.createdBy && creditGrantId == other.creditGrantId && invoiceId == other.invoiceId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(amount, reason, runningBalance, effectiveAt, createdBy, creditGrantId, invoiceId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CreditLedgerEntry{amount=$amount, reason=$reason, runningBalance=$runningBalance, effectiveAt=$effectiveAt, createdBy=$createdBy, creditGrantId=$creditGrantId, invoiceId=$invoiceId, additionalProperties=$additionalProperties}"
}
