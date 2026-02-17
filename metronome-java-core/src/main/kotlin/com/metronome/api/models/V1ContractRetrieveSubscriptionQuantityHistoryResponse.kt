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
import com.metronome.api.core.checkRequired
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class V1ContractRetrieveSubscriptionQuantityHistoryResponse
@JsonCreator
private constructor(
    @JsonProperty("data") @ExcludeMissing private val data: JsonField<Data> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun data(): Data = data.getRequired("data")

    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): V1ContractRetrieveSubscriptionQuantityHistoryResponse = apply {
        if (validated) {
            return@apply
        }

        data().validate()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1ContractRetrieveSubscriptionQuantityHistoryResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            v1ContractRetrieveSubscriptionQuantityHistoryResponse:
                V1ContractRetrieveSubscriptionQuantityHistoryResponse
        ) = apply {
            data = v1ContractRetrieveSubscriptionQuantityHistoryResponse.data
            additionalProperties =
                v1ContractRetrieveSubscriptionQuantityHistoryResponse.additionalProperties
                    .toMutableMap()
        }

        fun data(data: Data) = data(JsonField.of(data))

        fun data(data: JsonField<Data>) = apply { this.data = data }

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

        fun build(): V1ContractRetrieveSubscriptionQuantityHistoryResponse =
            V1ContractRetrieveSubscriptionQuantityHistoryResponse(
                checkRequired("data", data),
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Data
    @JsonCreator
    private constructor(
        @JsonProperty("fiat_credit_type_id")
        @ExcludeMissing
        private val fiatCreditTypeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("history")
        @ExcludeMissing
        private val history: JsonField<List<History>> = JsonMissing.of(),
        @JsonProperty("subscription_id")
        @ExcludeMissing
        private val subscriptionId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun fiatCreditTypeId(): Optional<String> =
            Optional.ofNullable(fiatCreditTypeId.getNullable("fiat_credit_type_id"))

        fun history(): Optional<List<History>> = Optional.ofNullable(history.getNullable("history"))

        fun subscriptionId(): Optional<String> =
            Optional.ofNullable(subscriptionId.getNullable("subscription_id"))

        @JsonProperty("fiat_credit_type_id")
        @ExcludeMissing
        fun _fiatCreditTypeId(): JsonField<String> = fiatCreditTypeId

        @JsonProperty("history") @ExcludeMissing fun _history(): JsonField<List<History>> = history

        @JsonProperty("subscription_id")
        @ExcludeMissing
        fun _subscriptionId(): JsonField<String> = subscriptionId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            fiatCreditTypeId()
            history().ifPresent { it.forEach { it.validate() } }
            subscriptionId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var fiatCreditTypeId: JsonField<String> = JsonMissing.of()
            private var history: JsonField<MutableList<History>>? = null
            private var subscriptionId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                fiatCreditTypeId = data.fiatCreditTypeId
                history = data.history.map { it.toMutableList() }
                subscriptionId = data.subscriptionId
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun fiatCreditTypeId(fiatCreditTypeId: String) =
                fiatCreditTypeId(JsonField.of(fiatCreditTypeId))

            fun fiatCreditTypeId(fiatCreditTypeId: JsonField<String>) = apply {
                this.fiatCreditTypeId = fiatCreditTypeId
            }

            fun history(history: List<History>) = history(JsonField.of(history))

            fun history(history: JsonField<List<History>>) = apply {
                this.history = history.map { it.toMutableList() }
            }

            fun addHistory(history: History) = apply {
                this.history =
                    (this.history ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(history)
                    }
            }

            fun subscriptionId(subscriptionId: String) =
                subscriptionId(JsonField.of(subscriptionId))

            fun subscriptionId(subscriptionId: JsonField<String>) = apply {
                this.subscriptionId = subscriptionId
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

            fun build(): Data =
                Data(
                    fiatCreditTypeId,
                    (history ?: JsonMissing.of()).map { it.toImmutable() },
                    subscriptionId,
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class History
        @JsonCreator
        private constructor(
            @JsonProperty("data")
            @ExcludeMissing
            private val data: JsonField<List<InnerData>> = JsonMissing.of(),
            @JsonProperty("starting_at")
            @ExcludeMissing
            private val startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun data(): List<InnerData> = data.getRequired("data")

            fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

            @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<InnerData>> = data

            @JsonProperty("starting_at")
            @ExcludeMissing
            fun _startingAt(): JsonField<OffsetDateTime> = startingAt

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): History = apply {
                if (validated) {
                    return@apply
                }

                data().forEach { it.validate() }
                startingAt()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [History]. */
            class Builder internal constructor() {

                private var data: JsonField<MutableList<InnerData>>? = null
                private var startingAt: JsonField<OffsetDateTime>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(history: History) = apply {
                    data = history.data.map { it.toMutableList() }
                    startingAt = history.startingAt
                    additionalProperties = history.additionalProperties.toMutableMap()
                }

                fun data(data: List<InnerData>) = data(JsonField.of(data))

                fun data(data: JsonField<List<InnerData>>) = apply {
                    this.data = data.map { it.toMutableList() }
                }

                fun addData(data: InnerData) = apply {
                    this.data =
                        (this.data ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(data)
                        }
                }

                fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

                fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                    this.startingAt = startingAt
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

                fun build(): History =
                    History(
                        checkRequired("data", data).map { it.toImmutable() },
                        checkRequired("startingAt", startingAt),
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class InnerData
            @JsonCreator
            private constructor(
                @JsonProperty("quantity")
                @ExcludeMissing
                private val quantity: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("total")
                @ExcludeMissing
                private val total: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("unit_price")
                @ExcludeMissing
                private val unitPrice: JsonField<Double> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun quantity(): Double = quantity.getRequired("quantity")

                fun total(): Double = total.getRequired("total")

                fun unitPrice(): Double = unitPrice.getRequired("unit_price")

                @JsonProperty("quantity")
                @ExcludeMissing
                fun _quantity(): JsonField<Double> = quantity

                @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<Double> = total

                @JsonProperty("unit_price")
                @ExcludeMissing
                fun _unitPrice(): JsonField<Double> = unitPrice

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): InnerData = apply {
                    if (validated) {
                        return@apply
                    }

                    quantity()
                    total()
                    unitPrice()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [InnerData]. */
                class Builder internal constructor() {

                    private var quantity: JsonField<Double>? = null
                    private var total: JsonField<Double>? = null
                    private var unitPrice: JsonField<Double>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(innerData: InnerData) = apply {
                        quantity = innerData.quantity
                        total = innerData.total
                        unitPrice = innerData.unitPrice
                        additionalProperties = innerData.additionalProperties.toMutableMap()
                    }

                    fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                    fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                    fun total(total: Double) = total(JsonField.of(total))

                    fun total(total: JsonField<Double>) = apply { this.total = total }

                    fun unitPrice(unitPrice: Double) = unitPrice(JsonField.of(unitPrice))

                    fun unitPrice(unitPrice: JsonField<Double>) = apply {
                        this.unitPrice = unitPrice
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

                    fun build(): InnerData =
                        InnerData(
                            checkRequired("quantity", quantity),
                            checkRequired("total", total),
                            checkRequired("unitPrice", unitPrice),
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is InnerData && quantity == other.quantity && total == other.total && unitPrice == other.unitPrice && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(quantity, total, unitPrice, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "InnerData{quantity=$quantity, total=$total, unitPrice=$unitPrice, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is History && data == other.data && startingAt == other.startingAt && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(data, startingAt, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "History{data=$data, startingAt=$startingAt, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Data && fiatCreditTypeId == other.fiatCreditTypeId && history == other.history && subscriptionId == other.subscriptionId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(fiatCreditTypeId, history, subscriptionId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{fiatCreditTypeId=$fiatCreditTypeId, history=$history, subscriptionId=$subscriptionId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is V1ContractRetrieveSubscriptionQuantityHistoryResponse && data == other.data && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "V1ContractRetrieveSubscriptionQuantityHistoryResponse{data=$data, additionalProperties=$additionalProperties}"
}
