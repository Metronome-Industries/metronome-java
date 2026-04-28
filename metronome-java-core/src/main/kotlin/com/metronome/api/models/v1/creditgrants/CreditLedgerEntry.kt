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
import com.metronome.api.core.checkRequired
import com.metronome.api.errors.MetronomeInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CreditLedgerEntry
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val amount: JsonField<Double>,
    private val createdBy: JsonField<String>,
    private val creditGrantId: JsonField<String>,
    private val effectiveAt: JsonField<OffsetDateTime>,
    private val reason: JsonField<String>,
    private val runningBalance: JsonField<Double>,
    private val invoiceId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("created_by") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("credit_grant_id")
        @ExcludeMissing
        creditGrantId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("effective_at")
        @ExcludeMissing
        effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of(),
        @JsonProperty("running_balance")
        @ExcludeMissing
        runningBalance: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("invoice_id") @ExcludeMissing invoiceId: JsonField<String> = JsonMissing.of(),
    ) : this(
        amount,
        createdBy,
        creditGrantId,
        effectiveAt,
        reason,
        runningBalance,
        invoiceId,
        mutableMapOf(),
    )

    /**
     * an amount representing the change to the customer's credit balance
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Double = amount.getRequired("amount")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdBy(): String = createdBy.getRequired("created_by")

    /**
     * the credit grant this entry is related to
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun creditGrantId(): String = creditGrantId.getRequired("credit_grant_id")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun effectiveAt(): OffsetDateTime = effectiveAt.getRequired("effective_at")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun reason(): String = reason.getRequired("reason")

    /**
     * the running balance for this credit type at the time of the ledger entry, including all
     * preceding charges
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun runningBalance(): Double = runningBalance.getRequired("running_balance")

    /**
     * if this entry is a deduction, the Metronome ID of the invoice where the credit deduction was
     * consumed; if this entry is a grant, the Metronome ID of the invoice where the grant's
     * paid_amount was charged
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun invoiceId(): Optional<String> = invoiceId.getOptional("invoice_id")

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

    /**
     * Returns the raw JSON value of [createdBy].
     *
     * Unlike [createdBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_by") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

    /**
     * Returns the raw JSON value of [creditGrantId].
     *
     * Unlike [creditGrantId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("credit_grant_id")
    @ExcludeMissing
    fun _creditGrantId(): JsonField<String> = creditGrantId

    /**
     * Returns the raw JSON value of [effectiveAt].
     *
     * Unlike [effectiveAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("effective_at")
    @ExcludeMissing
    fun _effectiveAt(): JsonField<OffsetDateTime> = effectiveAt

    /**
     * Returns the raw JSON value of [reason].
     *
     * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

    /**
     * Returns the raw JSON value of [runningBalance].
     *
     * Unlike [runningBalance], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("running_balance")
    @ExcludeMissing
    fun _runningBalance(): JsonField<Double> = runningBalance

    /**
     * Returns the raw JSON value of [invoiceId].
     *
     * Unlike [invoiceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("invoice_id") @ExcludeMissing fun _invoiceId(): JsonField<String> = invoiceId

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
         * Returns a mutable builder for constructing an instance of [CreditLedgerEntry].
         *
         * The following fields are required:
         * ```java
         * .amount()
         * .createdBy()
         * .creditGrantId()
         * .effectiveAt()
         * .reason()
         * .runningBalance()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CreditLedgerEntry]. */
    class Builder internal constructor() {

        private var amount: JsonField<Double>? = null
        private var createdBy: JsonField<String>? = null
        private var creditGrantId: JsonField<String>? = null
        private var effectiveAt: JsonField<OffsetDateTime>? = null
        private var reason: JsonField<String>? = null
        private var runningBalance: JsonField<Double>? = null
        private var invoiceId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(creditLedgerEntry: CreditLedgerEntry) = apply {
            amount = creditLedgerEntry.amount
            createdBy = creditLedgerEntry.createdBy
            creditGrantId = creditLedgerEntry.creditGrantId
            effectiveAt = creditLedgerEntry.effectiveAt
            reason = creditLedgerEntry.reason
            runningBalance = creditLedgerEntry.runningBalance
            invoiceId = creditLedgerEntry.invoiceId
            additionalProperties = creditLedgerEntry.additionalProperties.toMutableMap()
        }

        /** an amount representing the change to the customer's credit balance */
        fun amount(amount: Double) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /**
         * Sets [Builder.createdBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        /** the credit grant this entry is related to */
        fun creditGrantId(creditGrantId: String) = creditGrantId(JsonField.of(creditGrantId))

        /**
         * Sets [Builder.creditGrantId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditGrantId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun creditGrantId(creditGrantId: JsonField<String>) = apply {
            this.creditGrantId = creditGrantId
        }

        fun effectiveAt(effectiveAt: OffsetDateTime) = effectiveAt(JsonField.of(effectiveAt))

        /**
         * Sets [Builder.effectiveAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.effectiveAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun effectiveAt(effectiveAt: JsonField<OffsetDateTime>) = apply {
            this.effectiveAt = effectiveAt
        }

        fun reason(reason: String) = reason(JsonField.of(reason))

        /**
         * Sets [Builder.reason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reason] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun reason(reason: JsonField<String>) = apply { this.reason = reason }

        /**
         * the running balance for this credit type at the time of the ledger entry, including all
         * preceding charges
         */
        fun runningBalance(runningBalance: Double) = runningBalance(JsonField.of(runningBalance))

        /**
         * Sets [Builder.runningBalance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.runningBalance] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun runningBalance(runningBalance: JsonField<Double>) = apply {
            this.runningBalance = runningBalance
        }

        /**
         * if this entry is a deduction, the Metronome ID of the invoice where the credit deduction
         * was consumed; if this entry is a grant, the Metronome ID of the invoice where the grant's
         * paid_amount was charged
         */
        fun invoiceId(invoiceId: String?) = invoiceId(JsonField.ofNullable(invoiceId))

        /** Alias for calling [Builder.invoiceId] with `invoiceId.orElse(null)`. */
        fun invoiceId(invoiceId: Optional<String>) = invoiceId(invoiceId.getOrNull())

        /**
         * Sets [Builder.invoiceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invoiceId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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

        /**
         * Returns an immutable instance of [CreditLedgerEntry].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .amount()
         * .createdBy()
         * .creditGrantId()
         * .effectiveAt()
         * .reason()
         * .runningBalance()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CreditLedgerEntry =
            CreditLedgerEntry(
                checkRequired("amount", amount),
                checkRequired("createdBy", createdBy),
                checkRequired("creditGrantId", creditGrantId),
                checkRequired("effectiveAt", effectiveAt),
                checkRequired("reason", reason),
                checkRequired("runningBalance", runningBalance),
                invoiceId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CreditLedgerEntry = apply {
        if (validated) {
            return@apply
        }

        amount()
        createdBy()
        creditGrantId()
        effectiveAt()
        reason()
        runningBalance()
        invoiceId()
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
        (if (amount.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (creditGrantId.asKnown().isPresent) 1 else 0) +
            (if (effectiveAt.asKnown().isPresent) 1 else 0) +
            (if (reason.asKnown().isPresent) 1 else 0) +
            (if (runningBalance.asKnown().isPresent) 1 else 0) +
            (if (invoiceId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CreditLedgerEntry &&
            amount == other.amount &&
            createdBy == other.createdBy &&
            creditGrantId == other.creditGrantId &&
            effectiveAt == other.effectiveAt &&
            reason == other.reason &&
            runningBalance == other.runningBalance &&
            invoiceId == other.invoiceId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            amount,
            createdBy,
            creditGrantId,
            effectiveAt,
            reason,
            runningBalance,
            invoiceId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CreditLedgerEntry{amount=$amount, createdBy=$createdBy, creditGrantId=$creditGrantId, effectiveAt=$effectiveAt, reason=$reason, runningBalance=$runningBalance, invoiceId=$invoiceId, additionalProperties=$additionalProperties}"
}
