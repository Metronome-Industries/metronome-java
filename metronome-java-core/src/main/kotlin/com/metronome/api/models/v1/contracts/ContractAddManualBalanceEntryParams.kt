// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.contracts

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.Params
import com.metronome.api.core.checkRequired
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Manually adjust the available balance on a commit or credit. This entry is appended to the commit
 * ledger as a new event. Optionally include a description that provides the reasoning for the
 * entry.
 *
 * ### Use this endpoint to:
 * - Address incorrect usage burn-down caused by malformed usage or invalid config
 * - Decrease available balance to account for outages where usage may have not been tracked or sent
 *   to Metronome
 * - Issue credits to customers in the form of increased balance on existing commit or credit
 *
 * ### Usage guidelines:
 * Manual ledger entries can be extremely useful for resolving discrepancies in Metronome. However,
 * most corrections to inaccurate billings can be modified upstream of the commit, whether that is
 * via contract editing, rate editing, or other actions that cause an invoice to be recalculated.
 */
class ContractAddManualBalanceEntryParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * ID of the balance (commit or credit) to update.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = body.id()

    /**
     * Amount to add to the segment. A negative number will draw down from the balance.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Double = body.amount()

    /**
     * ID of the customer whose balance is to be updated.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customerId(): String = body.customerId()

    /**
     * Reason for the manual adjustment. This will be displayed in the ledger.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun reason(): String = body.reason()

    /**
     * ID of the segment to update.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun segmentId(): String = body.segmentId()

    /**
     * ID of the contract to update. Leave blank to update a customer level balance.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun contractId(): Optional<String> = body.contractId()

    /**
     * If using individually configured commits/credits attached to seat managed subscriptions, the
     * amount to add for each seat. Must sum to total amount.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun perGroupAmounts(): Optional<PerGroupAmounts> = body.perGroupAmounts()

    /**
     * RFC 3339 timestamp indicating when the manual adjustment takes place. If not provided, it
     * will default to the start of the segment.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timestamp(): Optional<OffsetDateTime> = body.timestamp()

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _id(): JsonField<String> = body._id()

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _amount(): JsonField<Double> = body._amount()

    /**
     * Returns the raw JSON value of [customerId].
     *
     * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _customerId(): JsonField<String> = body._customerId()

    /**
     * Returns the raw JSON value of [reason].
     *
     * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _reason(): JsonField<String> = body._reason()

    /**
     * Returns the raw JSON value of [segmentId].
     *
     * Unlike [segmentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _segmentId(): JsonField<String> = body._segmentId()

    /**
     * Returns the raw JSON value of [contractId].
     *
     * Unlike [contractId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _contractId(): JsonField<String> = body._contractId()

    /**
     * Returns the raw JSON value of [perGroupAmounts].
     *
     * Unlike [perGroupAmounts], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _perGroupAmounts(): JsonField<PerGroupAmounts> = body._perGroupAmounts()

    /**
     * Returns the raw JSON value of [timestamp].
     *
     * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _timestamp(): JsonField<OffsetDateTime> = body._timestamp()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ContractAddManualBalanceEntryParams].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .amount()
         * .customerId()
         * .reason()
         * .segmentId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ContractAddManualBalanceEntryParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            contractAddManualBalanceEntryParams: ContractAddManualBalanceEntryParams
        ) = apply {
            body = contractAddManualBalanceEntryParams.body.toBuilder()
            additionalHeaders = contractAddManualBalanceEntryParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                contractAddManualBalanceEntryParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [id]
         * - [amount]
         * - [customerId]
         * - [reason]
         * - [segmentId]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** ID of the balance (commit or credit) to update. */
        fun id(id: String) = apply { body.id(id) }

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { body.id(id) }

        /** Amount to add to the segment. A negative number will draw down from the balance. */
        fun amount(amount: Double) = apply { body.amount(amount) }

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Double>) = apply { body.amount(amount) }

        /** ID of the customer whose balance is to be updated. */
        fun customerId(customerId: String) = apply { body.customerId(customerId) }

        /**
         * Sets [Builder.customerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerId(customerId: JsonField<String>) = apply { body.customerId(customerId) }

        /** Reason for the manual adjustment. This will be displayed in the ledger. */
        fun reason(reason: String) = apply { body.reason(reason) }

        /**
         * Sets [Builder.reason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reason] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun reason(reason: JsonField<String>) = apply { body.reason(reason) }

        /** ID of the segment to update. */
        fun segmentId(segmentId: String) = apply { body.segmentId(segmentId) }

        /**
         * Sets [Builder.segmentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.segmentId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun segmentId(segmentId: JsonField<String>) = apply { body.segmentId(segmentId) }

        /** ID of the contract to update. Leave blank to update a customer level balance. */
        fun contractId(contractId: String) = apply { body.contractId(contractId) }

        /**
         * Sets [Builder.contractId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contractId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contractId(contractId: JsonField<String>) = apply { body.contractId(contractId) }

        /**
         * If using individually configured commits/credits attached to seat managed subscriptions,
         * the amount to add for each seat. Must sum to total amount.
         */
        fun perGroupAmounts(perGroupAmounts: PerGroupAmounts) = apply {
            body.perGroupAmounts(perGroupAmounts)
        }

        /**
         * Sets [Builder.perGroupAmounts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.perGroupAmounts] with a well-typed [PerGroupAmounts]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun perGroupAmounts(perGroupAmounts: JsonField<PerGroupAmounts>) = apply {
            body.perGroupAmounts(perGroupAmounts)
        }

        /**
         * RFC 3339 timestamp indicating when the manual adjustment takes place. If not provided, it
         * will default to the start of the segment.
         */
        fun timestamp(timestamp: OffsetDateTime) = apply { body.timestamp(timestamp) }

        /**
         * Sets [Builder.timestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timestamp] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply { body.timestamp(timestamp) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [ContractAddManualBalanceEntryParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .amount()
         * .customerId()
         * .reason()
         * .segmentId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ContractAddManualBalanceEntryParams =
            ContractAddManualBalanceEntryParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val amount: JsonField<Double>,
        private val customerId: JsonField<String>,
        private val reason: JsonField<String>,
        private val segmentId: JsonField<String>,
        private val contractId: JsonField<String>,
        private val perGroupAmounts: JsonField<PerGroupAmounts>,
        private val timestamp: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("customer_id")
            @ExcludeMissing
            customerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of(),
            @JsonProperty("segment_id")
            @ExcludeMissing
            segmentId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("contract_id")
            @ExcludeMissing
            contractId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("per_group_amounts")
            @ExcludeMissing
            perGroupAmounts: JsonField<PerGroupAmounts> = JsonMissing.of(),
            @JsonProperty("timestamp")
            @ExcludeMissing
            timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            id,
            amount,
            customerId,
            reason,
            segmentId,
            contractId,
            perGroupAmounts,
            timestamp,
            mutableMapOf(),
        )

        /**
         * ID of the balance (commit or credit) to update.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * Amount to add to the segment. A negative number will draw down from the balance.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): Double = amount.getRequired("amount")

        /**
         * ID of the customer whose balance is to be updated.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun customerId(): String = customerId.getRequired("customer_id")

        /**
         * Reason for the manual adjustment. This will be displayed in the ledger.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun reason(): String = reason.getRequired("reason")

        /**
         * ID of the segment to update.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun segmentId(): String = segmentId.getRequired("segment_id")

        /**
         * ID of the contract to update. Leave blank to update a customer level balance.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun contractId(): Optional<String> = contractId.getOptional("contract_id")

        /**
         * If using individually configured commits/credits attached to seat managed subscriptions,
         * the amount to add for each seat. Must sum to total amount.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun perGroupAmounts(): Optional<PerGroupAmounts> =
            perGroupAmounts.getOptional("per_group_amounts")

        /**
         * RFC 3339 timestamp indicating when the manual adjustment takes place. If not provided, it
         * will default to the start of the segment.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun timestamp(): Optional<OffsetDateTime> = timestamp.getOptional("timestamp")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

        /**
         * Returns the raw JSON value of [customerId].
         *
         * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        /**
         * Returns the raw JSON value of [reason].
         *
         * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

        /**
         * Returns the raw JSON value of [segmentId].
         *
         * Unlike [segmentId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("segment_id") @ExcludeMissing fun _segmentId(): JsonField<String> = segmentId

        /**
         * Returns the raw JSON value of [contractId].
         *
         * Unlike [contractId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("contract_id")
        @ExcludeMissing
        fun _contractId(): JsonField<String> = contractId

        /**
         * Returns the raw JSON value of [perGroupAmounts].
         *
         * Unlike [perGroupAmounts], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("per_group_amounts")
        @ExcludeMissing
        fun _perGroupAmounts(): JsonField<PerGroupAmounts> = perGroupAmounts

        /**
         * Returns the raw JSON value of [timestamp].
         *
         * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("timestamp")
        @ExcludeMissing
        fun _timestamp(): JsonField<OffsetDateTime> = timestamp

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .amount()
             * .customerId()
             * .reason()
             * .segmentId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var amount: JsonField<Double>? = null
            private var customerId: JsonField<String>? = null
            private var reason: JsonField<String>? = null
            private var segmentId: JsonField<String>? = null
            private var contractId: JsonField<String> = JsonMissing.of()
            private var perGroupAmounts: JsonField<PerGroupAmounts> = JsonMissing.of()
            private var timestamp: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                id = body.id
                amount = body.amount
                customerId = body.customerId
                reason = body.reason
                segmentId = body.segmentId
                contractId = body.contractId
                perGroupAmounts = body.perGroupAmounts
                timestamp = body.timestamp
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** ID of the balance (commit or credit) to update. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Amount to add to the segment. A negative number will draw down from the balance. */
            fun amount(amount: Double) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            /** ID of the customer whose balance is to be updated. */
            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            /**
             * Sets [Builder.customerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            /** Reason for the manual adjustment. This will be displayed in the ledger. */
            fun reason(reason: String) = reason(JsonField.of(reason))

            /**
             * Sets [Builder.reason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reason] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reason(reason: JsonField<String>) = apply { this.reason = reason }

            /** ID of the segment to update. */
            fun segmentId(segmentId: String) = segmentId(JsonField.of(segmentId))

            /**
             * Sets [Builder.segmentId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.segmentId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun segmentId(segmentId: JsonField<String>) = apply { this.segmentId = segmentId }

            /** ID of the contract to update. Leave blank to update a customer level balance. */
            fun contractId(contractId: String) = contractId(JsonField.of(contractId))

            /**
             * Sets [Builder.contractId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contractId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contractId(contractId: JsonField<String>) = apply { this.contractId = contractId }

            /**
             * If using individually configured commits/credits attached to seat managed
             * subscriptions, the amount to add for each seat. Must sum to total amount.
             */
            fun perGroupAmounts(perGroupAmounts: PerGroupAmounts) =
                perGroupAmounts(JsonField.of(perGroupAmounts))

            /**
             * Sets [Builder.perGroupAmounts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.perGroupAmounts] with a well-typed [PerGroupAmounts]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun perGroupAmounts(perGroupAmounts: JsonField<PerGroupAmounts>) = apply {
                this.perGroupAmounts = perGroupAmounts
            }

            /**
             * RFC 3339 timestamp indicating when the manual adjustment takes place. If not
             * provided, it will default to the start of the segment.
             */
            fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

            /**
             * Sets [Builder.timestamp] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timestamp] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                this.timestamp = timestamp
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .amount()
             * .customerId()
             * .reason()
             * .segmentId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("id", id),
                    checkRequired("amount", amount),
                    checkRequired("customerId", customerId),
                    checkRequired("reason", reason),
                    checkRequired("segmentId", segmentId),
                    contractId,
                    perGroupAmounts,
                    timestamp,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            id()
            amount()
            customerId()
            reason()
            segmentId()
            contractId()
            perGroupAmounts().ifPresent { it.validate() }
            timestamp()
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
                (if (amount.asKnown().isPresent) 1 else 0) +
                (if (customerId.asKnown().isPresent) 1 else 0) +
                (if (reason.asKnown().isPresent) 1 else 0) +
                (if (segmentId.asKnown().isPresent) 1 else 0) +
                (if (contractId.asKnown().isPresent) 1 else 0) +
                (perGroupAmounts.asKnown().getOrNull()?.validity() ?: 0) +
                (if (timestamp.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                id == other.id &&
                amount == other.amount &&
                customerId == other.customerId &&
                reason == other.reason &&
                segmentId == other.segmentId &&
                contractId == other.contractId &&
                perGroupAmounts == other.perGroupAmounts &&
                timestamp == other.timestamp &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                amount,
                customerId,
                reason,
                segmentId,
                contractId,
                perGroupAmounts,
                timestamp,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{id=$id, amount=$amount, customerId=$customerId, reason=$reason, segmentId=$segmentId, contractId=$contractId, perGroupAmounts=$perGroupAmounts, timestamp=$timestamp, additionalProperties=$additionalProperties}"
    }

    /**
     * If using individually configured commits/credits attached to seat managed subscriptions, the
     * amount to add for each seat. Must sum to total amount.
     */
    class PerGroupAmounts
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

            /** Returns a mutable builder for constructing an instance of [PerGroupAmounts]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PerGroupAmounts]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(perGroupAmounts: PerGroupAmounts) = apply {
                additionalProperties = perGroupAmounts.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [PerGroupAmounts].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): PerGroupAmounts = PerGroupAmounts(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): PerGroupAmounts = apply {
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

            return other is PerGroupAmounts && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "PerGroupAmounts{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ContractAddManualBalanceEntryParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ContractAddManualBalanceEntryParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
