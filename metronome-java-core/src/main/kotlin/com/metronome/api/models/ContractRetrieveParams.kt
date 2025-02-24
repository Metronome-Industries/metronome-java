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
import java.util.Objects
import java.util.Optional

/** Get a specific contract */
class ContractRetrieveParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun contractId(): String = body.contractId()

    fun customerId(): String = body.customerId()

    /**
     * Include the balance of credits and commits in the response. Setting this flag may cause the
     * query to be slower.
     */
    fun includeBalance(): Optional<Boolean> = body.includeBalance()

    /**
     * Include commit ledgers in the response. Setting this flag may cause the query to be slower.
     */
    fun includeLedgers(): Optional<Boolean> = body.includeLedgers()

    fun _contractId(): JsonField<String> = body._contractId()

    fun _customerId(): JsonField<String> = body._customerId()

    /**
     * Include the balance of credits and commits in the response. Setting this flag may cause the
     * query to be slower.
     */
    fun _includeBalance(): JsonField<Boolean> = body._includeBalance()

    /**
     * Include commit ledgers in the response. Setting this flag may cause the query to be slower.
     */
    fun _includeLedgers(): JsonField<Boolean> = body._includeLedgers()

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
        @JsonProperty("contract_id")
        @ExcludeMissing
        private val contractId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customer_id")
        @ExcludeMissing
        private val customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("include_balance")
        @ExcludeMissing
        private val includeBalance: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("include_ledgers")
        @ExcludeMissing
        private val includeLedgers: JsonField<Boolean> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun contractId(): String = contractId.getRequired("contract_id")

        fun customerId(): String = customerId.getRequired("customer_id")

        /**
         * Include the balance of credits and commits in the response. Setting this flag may cause
         * the query to be slower.
         */
        fun includeBalance(): Optional<Boolean> =
            Optional.ofNullable(includeBalance.getNullable("include_balance"))

        /**
         * Include commit ledgers in the response. Setting this flag may cause the query to be
         * slower.
         */
        fun includeLedgers(): Optional<Boolean> =
            Optional.ofNullable(includeLedgers.getNullable("include_ledgers"))

        @JsonProperty("contract_id")
        @ExcludeMissing
        fun _contractId(): JsonField<String> = contractId

        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        /**
         * Include the balance of credits and commits in the response. Setting this flag may cause
         * the query to be slower.
         */
        @JsonProperty("include_balance")
        @ExcludeMissing
        fun _includeBalance(): JsonField<Boolean> = includeBalance

        /**
         * Include commit ledgers in the response. Setting this flag may cause the query to be
         * slower.
         */
        @JsonProperty("include_ledgers")
        @ExcludeMissing
        fun _includeLedgers(): JsonField<Boolean> = includeLedgers

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            contractId()
            customerId()
            includeBalance()
            includeLedgers()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var contractId: JsonField<String>? = null
            private var customerId: JsonField<String>? = null
            private var includeBalance: JsonField<Boolean> = JsonMissing.of()
            private var includeLedgers: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                contractId = body.contractId
                customerId = body.customerId
                includeBalance = body.includeBalance
                includeLedgers = body.includeLedgers
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun contractId(contractId: String) = contractId(JsonField.of(contractId))

            fun contractId(contractId: JsonField<String>) = apply { this.contractId = contractId }

            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            /**
             * Include the balance of credits and commits in the response. Setting this flag may
             * cause the query to be slower.
             */
            fun includeBalance(includeBalance: Boolean) =
                includeBalance(JsonField.of(includeBalance))

            /**
             * Include the balance of credits and commits in the response. Setting this flag may
             * cause the query to be slower.
             */
            fun includeBalance(includeBalance: JsonField<Boolean>) = apply {
                this.includeBalance = includeBalance
            }

            /**
             * Include commit ledgers in the response. Setting this flag may cause the query to be
             * slower.
             */
            fun includeLedgers(includeLedgers: Boolean) =
                includeLedgers(JsonField.of(includeLedgers))

            /**
             * Include commit ledgers in the response. Setting this flag may cause the query to be
             * slower.
             */
            fun includeLedgers(includeLedgers: JsonField<Boolean>) = apply {
                this.includeLedgers = includeLedgers
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
                    checkRequired("contractId", contractId),
                    checkRequired("customerId", customerId),
                    includeBalance,
                    includeLedgers,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && contractId == other.contractId && customerId == other.customerId && includeBalance == other.includeBalance && includeLedgers == other.includeLedgers && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(contractId, customerId, includeBalance, includeLedgers, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{contractId=$contractId, customerId=$customerId, includeBalance=$includeBalance, includeLedgers=$includeLedgers, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ContractRetrieveParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(contractRetrieveParams: ContractRetrieveParams) = apply {
            body = contractRetrieveParams.body.toBuilder()
            additionalHeaders = contractRetrieveParams.additionalHeaders.toBuilder()
            additionalQueryParams = contractRetrieveParams.additionalQueryParams.toBuilder()
        }

        fun contractId(contractId: String) = apply { body.contractId(contractId) }

        fun contractId(contractId: JsonField<String>) = apply { body.contractId(contractId) }

        fun customerId(customerId: String) = apply { body.customerId(customerId) }

        fun customerId(customerId: JsonField<String>) = apply { body.customerId(customerId) }

        /**
         * Include the balance of credits and commits in the response. Setting this flag may cause
         * the query to be slower.
         */
        fun includeBalance(includeBalance: Boolean) = apply { body.includeBalance(includeBalance) }

        /**
         * Include the balance of credits and commits in the response. Setting this flag may cause
         * the query to be slower.
         */
        fun includeBalance(includeBalance: JsonField<Boolean>) = apply {
            body.includeBalance(includeBalance)
        }

        /**
         * Include commit ledgers in the response. Setting this flag may cause the query to be
         * slower.
         */
        fun includeLedgers(includeLedgers: Boolean) = apply { body.includeLedgers(includeLedgers) }

        /**
         * Include commit ledgers in the response. Setting this flag may cause the query to be
         * slower.
         */
        fun includeLedgers(includeLedgers: JsonField<Boolean>) = apply {
            body.includeLedgers(includeLedgers)
        }

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

        fun build(): ContractRetrieveParams =
            ContractRetrieveParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ContractRetrieveParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ContractRetrieveParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
