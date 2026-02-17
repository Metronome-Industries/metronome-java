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
import com.metronome.api.core.Params
import com.metronome.api.core.checkRequired
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

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
 *
 * Manual ledger entries can be extremely useful for resolving discrepancies in Metronome. However,
 * most corrections to inaccurate billings can be modified upstream of the commit, whether that is
 * via contract editing, rate editing, or other actions that cause an invoice to be recalculated.
 */
class V1ContractAddManualBalanceEntryParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** ID of the balance (commit or credit) to update. */
    fun id(): String = body.id()

    /** Amount to add to the segment. A negative number will draw down from the balance. */
    fun amount(): Double = body.amount()

    /** ID of the customer whose balance is to be updated. */
    fun customerId(): String = body.customerId()

    /** Reason for the manual adjustment. This will be displayed in the ledger. */
    fun reason(): String = body.reason()

    /** ID of the segment to update. */
    fun segmentId(): String = body.segmentId()

    /** ID of the contract to update. Leave blank to update a customer level balance. */
    fun contractId(): Optional<String> = body.contractId()

    /**
     * If using individually configured commits/credits attached to seat managed subscriptions, the
     * amount to add for each seat. Must sum to total amount.
     */
    fun perGroupAmounts(): Optional<PerGroupAmounts> = body.perGroupAmounts()

    /**
     * RFC 3339 timestamp indicating when the manual adjustment takes place. If not provided, it
     * will default to the start of the segment.
     */
    fun timestamp(): Optional<OffsetDateTime> = body.timestamp()

    /** ID of the balance (commit or credit) to update. */
    fun _id(): JsonField<String> = body._id()

    /** Amount to add to the segment. A negative number will draw down from the balance. */
    fun _amount(): JsonField<Double> = body._amount()

    /** ID of the customer whose balance is to be updated. */
    fun _customerId(): JsonField<String> = body._customerId()

    /** Reason for the manual adjustment. This will be displayed in the ledger. */
    fun _reason(): JsonField<String> = body._reason()

    /** ID of the segment to update. */
    fun _segmentId(): JsonField<String> = body._segmentId()

    /** ID of the contract to update. Leave blank to update a customer level balance. */
    fun _contractId(): JsonField<String> = body._contractId()

    /**
     * If using individually configured commits/credits attached to seat managed subscriptions, the
     * amount to add for each seat. Must sum to total amount.
     */
    fun _perGroupAmounts(): JsonField<PerGroupAmounts> = body._perGroupAmounts()

    /**
     * RFC 3339 timestamp indicating when the manual adjustment takes place. If not provided, it
     * will default to the start of the segment.
     */
    fun _timestamp(): JsonField<OffsetDateTime> = body._timestamp()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("customer_id")
        @ExcludeMissing
        private val customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reason")
        @ExcludeMissing
        private val reason: JsonField<String> = JsonMissing.of(),
        @JsonProperty("segment_id")
        @ExcludeMissing
        private val segmentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("contract_id")
        @ExcludeMissing
        private val contractId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("per_group_amounts")
        @ExcludeMissing
        private val perGroupAmounts: JsonField<PerGroupAmounts> = JsonMissing.of(),
        @JsonProperty("timestamp")
        @ExcludeMissing
        private val timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** ID of the balance (commit or credit) to update. */
        fun id(): String = id.getRequired("id")

        /** Amount to add to the segment. A negative number will draw down from the balance. */
        fun amount(): Double = amount.getRequired("amount")

        /** ID of the customer whose balance is to be updated. */
        fun customerId(): String = customerId.getRequired("customer_id")

        /** Reason for the manual adjustment. This will be displayed in the ledger. */
        fun reason(): String = reason.getRequired("reason")

        /** ID of the segment to update. */
        fun segmentId(): String = segmentId.getRequired("segment_id")

        /** ID of the contract to update. Leave blank to update a customer level balance. */
        fun contractId(): Optional<String> =
            Optional.ofNullable(contractId.getNullable("contract_id"))

        /**
         * If using individually configured commits/credits attached to seat managed subscriptions,
         * the amount to add for each seat. Must sum to total amount.
         */
        fun perGroupAmounts(): Optional<PerGroupAmounts> =
            Optional.ofNullable(perGroupAmounts.getNullable("per_group_amounts"))

        /**
         * RFC 3339 timestamp indicating when the manual adjustment takes place. If not provided, it
         * will default to the start of the segment.
         */
        fun timestamp(): Optional<OffsetDateTime> =
            Optional.ofNullable(timestamp.getNullable("timestamp"))

        /** ID of the balance (commit or credit) to update. */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /** Amount to add to the segment. A negative number will draw down from the balance. */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

        /** ID of the customer whose balance is to be updated. */
        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        /** Reason for the manual adjustment. This will be displayed in the ledger. */
        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

        /** ID of the segment to update. */
        @JsonProperty("segment_id") @ExcludeMissing fun _segmentId(): JsonField<String> = segmentId

        /** ID of the contract to update. Leave blank to update a customer level balance. */
        @JsonProperty("contract_id")
        @ExcludeMissing
        fun _contractId(): JsonField<String> = contractId

        /**
         * If using individually configured commits/credits attached to seat managed subscriptions,
         * the amount to add for each seat. Must sum to total amount.
         */
        @JsonProperty("per_group_amounts")
        @ExcludeMissing
        fun _perGroupAmounts(): JsonField<PerGroupAmounts> = perGroupAmounts

        /**
         * RFC 3339 timestamp indicating when the manual adjustment takes place. If not provided, it
         * will default to the start of the segment.
         */
        @JsonProperty("timestamp")
        @ExcludeMissing
        fun _timestamp(): JsonField<OffsetDateTime> = timestamp

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

        fun toBuilder() = Builder().from(this)

        companion object {

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

            /** ID of the balance (commit or credit) to update. */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Amount to add to the segment. A negative number will draw down from the balance. */
            fun amount(amount: Double) = amount(JsonField.of(amount))

            /** Amount to add to the segment. A negative number will draw down from the balance. */
            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            /** ID of the customer whose balance is to be updated. */
            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            /** ID of the customer whose balance is to be updated. */
            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            /** Reason for the manual adjustment. This will be displayed in the ledger. */
            fun reason(reason: String) = reason(JsonField.of(reason))

            /** Reason for the manual adjustment. This will be displayed in the ledger. */
            fun reason(reason: JsonField<String>) = apply { this.reason = reason }

            /** ID of the segment to update. */
            fun segmentId(segmentId: String) = segmentId(JsonField.of(segmentId))

            /** ID of the segment to update. */
            fun segmentId(segmentId: JsonField<String>) = apply { this.segmentId = segmentId }

            /** ID of the contract to update. Leave blank to update a customer level balance. */
            fun contractId(contractId: String) = contractId(JsonField.of(contractId))

            /** ID of the contract to update. Leave blank to update a customer level balance. */
            fun contractId(contractId: JsonField<String>) = apply { this.contractId = contractId }

            /**
             * If using individually configured commits/credits attached to seat managed
             * subscriptions, the amount to add for each seat. Must sum to total amount.
             */
            fun perGroupAmounts(perGroupAmounts: PerGroupAmounts) =
                perGroupAmounts(JsonField.of(perGroupAmounts))

            /**
             * If using individually configured commits/credits attached to seat managed
             * subscriptions, the amount to add for each seat. Must sum to total amount.
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
             * RFC 3339 timestamp indicating when the manual adjustment takes place. If not
             * provided, it will default to the start of the segment.
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
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && id == other.id && amount == other.amount && customerId == other.customerId && reason == other.reason && segmentId == other.segmentId && contractId == other.contractId && perGroupAmounts == other.perGroupAmounts && timestamp == other.timestamp && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, amount, customerId, reason, segmentId, contractId, perGroupAmounts, timestamp, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{id=$id, amount=$amount, customerId=$customerId, reason=$reason, segmentId=$segmentId, contractId=$contractId, perGroupAmounts=$perGroupAmounts, timestamp=$timestamp, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1ContractAddManualBalanceEntryParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            v1ContractAddManualBalanceEntryParams: V1ContractAddManualBalanceEntryParams
        ) = apply {
            body = v1ContractAddManualBalanceEntryParams.body.toBuilder()
            additionalHeaders = v1ContractAddManualBalanceEntryParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                v1ContractAddManualBalanceEntryParams.additionalQueryParams.toBuilder()
        }

        /** ID of the balance (commit or credit) to update. */
        fun id(id: String) = apply { body.id(id) }

        /** ID of the balance (commit or credit) to update. */
        fun id(id: JsonField<String>) = apply { body.id(id) }

        /** Amount to add to the segment. A negative number will draw down from the balance. */
        fun amount(amount: Double) = apply { body.amount(amount) }

        /** Amount to add to the segment. A negative number will draw down from the balance. */
        fun amount(amount: JsonField<Double>) = apply { body.amount(amount) }

        /** ID of the customer whose balance is to be updated. */
        fun customerId(customerId: String) = apply { body.customerId(customerId) }

        /** ID of the customer whose balance is to be updated. */
        fun customerId(customerId: JsonField<String>) = apply { body.customerId(customerId) }

        /** Reason for the manual adjustment. This will be displayed in the ledger. */
        fun reason(reason: String) = apply { body.reason(reason) }

        /** Reason for the manual adjustment. This will be displayed in the ledger. */
        fun reason(reason: JsonField<String>) = apply { body.reason(reason) }

        /** ID of the segment to update. */
        fun segmentId(segmentId: String) = apply { body.segmentId(segmentId) }

        /** ID of the segment to update. */
        fun segmentId(segmentId: JsonField<String>) = apply { body.segmentId(segmentId) }

        /** ID of the contract to update. Leave blank to update a customer level balance. */
        fun contractId(contractId: String) = apply { body.contractId(contractId) }

        /** ID of the contract to update. Leave blank to update a customer level balance. */
        fun contractId(contractId: JsonField<String>) = apply { body.contractId(contractId) }

        /**
         * If using individually configured commits/credits attached to seat managed subscriptions,
         * the amount to add for each seat. Must sum to total amount.
         */
        fun perGroupAmounts(perGroupAmounts: PerGroupAmounts) = apply {
            body.perGroupAmounts(perGroupAmounts)
        }

        /**
         * If using individually configured commits/credits attached to seat managed subscriptions,
         * the amount to add for each seat. Must sum to total amount.
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
         * RFC 3339 timestamp indicating when the manual adjustment takes place. If not provided, it
         * will default to the start of the segment.
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

        fun build(): V1ContractAddManualBalanceEntryParams =
            V1ContractAddManualBalanceEntryParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /**
     * If using individually configured commits/credits attached to seat managed subscriptions, the
     * amount to add for each seat. Must sum to total amount.
     */
    @NoAutoDetect
    class PerGroupAmounts
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): PerGroupAmounts = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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

            fun build(): PerGroupAmounts = PerGroupAmounts(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PerGroupAmounts && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "PerGroupAmounts{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is V1ContractAddManualBalanceEntryParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "V1ContractAddManualBalanceEntryParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
