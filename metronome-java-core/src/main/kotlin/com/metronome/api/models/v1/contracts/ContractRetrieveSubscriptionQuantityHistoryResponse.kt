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
import com.metronome.api.core.checkKnown
import com.metronome.api.core.checkRequired
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ContractRetrieveSubscriptionQuantityHistoryResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<Data>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of()
    ) : this(data, mutableMapOf())

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): Data = data.getRequired("data")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

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
         * [ContractRetrieveSubscriptionQuantityHistoryResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ContractRetrieveSubscriptionQuantityHistoryResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            contractRetrieveSubscriptionQuantityHistoryResponse:
                ContractRetrieveSubscriptionQuantityHistoryResponse
        ) = apply {
            data = contractRetrieveSubscriptionQuantityHistoryResponse.data
            additionalProperties =
                contractRetrieveSubscriptionQuantityHistoryResponse.additionalProperties
                    .toMutableMap()
        }

        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
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

        /**
         * Returns an immutable instance of [ContractRetrieveSubscriptionQuantityHistoryResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ContractRetrieveSubscriptionQuantityHistoryResponse =
            ContractRetrieveSubscriptionQuantityHistoryResponse(
                checkRequired("data", data),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ContractRetrieveSubscriptionQuantityHistoryResponse = apply {
        if (validated) {
            return@apply
        }

        data().validate()
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
    @JvmSynthetic internal fun validity(): Int = (data.asKnown().getOrNull()?.validity() ?: 0)

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val fiatCreditTypeId: JsonField<String>,
        private val history: JsonField<List<History>>,
        private val subscriptionId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("fiat_credit_type_id")
            @ExcludeMissing
            fiatCreditTypeId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("history")
            @ExcludeMissing
            history: JsonField<List<History>> = JsonMissing.of(),
            @JsonProperty("subscription_id")
            @ExcludeMissing
            subscriptionId: JsonField<String> = JsonMissing.of(),
        ) : this(fiatCreditTypeId, history, subscriptionId, mutableMapOf())

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun fiatCreditTypeId(): Optional<String> =
            fiatCreditTypeId.getOptional("fiat_credit_type_id")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun history(): Optional<List<History>> = history.getOptional("history")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun subscriptionId(): Optional<String> = subscriptionId.getOptional("subscription_id")

        /**
         * Returns the raw JSON value of [fiatCreditTypeId].
         *
         * Unlike [fiatCreditTypeId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("fiat_credit_type_id")
        @ExcludeMissing
        fun _fiatCreditTypeId(): JsonField<String> = fiatCreditTypeId

        /**
         * Returns the raw JSON value of [history].
         *
         * Unlike [history], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("history") @ExcludeMissing fun _history(): JsonField<List<History>> = history

        /**
         * Returns the raw JSON value of [subscriptionId].
         *
         * Unlike [subscriptionId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("subscription_id")
        @ExcludeMissing
        fun _subscriptionId(): JsonField<String> = subscriptionId

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

            /** Returns a mutable builder for constructing an instance of [Data]. */
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

            /**
             * Sets [Builder.fiatCreditTypeId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fiatCreditTypeId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fiatCreditTypeId(fiatCreditTypeId: JsonField<String>) = apply {
                this.fiatCreditTypeId = fiatCreditTypeId
            }

            fun history(history: List<History>) = history(JsonField.of(history))

            /**
             * Sets [Builder.history] to an arbitrary JSON value.
             *
             * You should usually call [Builder.history] with a well-typed `List<History>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun history(history: JsonField<List<History>>) = apply {
                this.history = history.map { it.toMutableList() }
            }

            /**
             * Adds a single [History] to [Builder.history].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addHistory(history: History) = apply {
                this.history =
                    (this.history ?: JsonField.of(mutableListOf())).also {
                        checkKnown("history", it).add(history)
                    }
            }

            fun subscriptionId(subscriptionId: String) =
                subscriptionId(JsonField.of(subscriptionId))

            /**
             * Sets [Builder.subscriptionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subscriptionId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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

            /**
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Data =
                Data(
                    fiatCreditTypeId,
                    (history ?: JsonMissing.of()).map { it.toImmutable() },
                    subscriptionId,
                    additionalProperties.toMutableMap(),
                )
        }

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
            (if (fiatCreditTypeId.asKnown().isPresent) 1 else 0) +
                (history.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (subscriptionId.asKnown().isPresent) 1 else 0)

        class History
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val data: JsonField<List<InnerData>>,
            private val startingAt: JsonField<OffsetDateTime>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("data")
                @ExcludeMissing
                data: JsonField<List<InnerData>> = JsonMissing.of(),
                @JsonProperty("starting_at")
                @ExcludeMissing
                startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            ) : this(data, startingAt, mutableMapOf())

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun data(): List<InnerData> = data.getRequired("data")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

            /**
             * Returns the raw JSON value of [data].
             *
             * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<InnerData>> = data

            /**
             * Returns the raw JSON value of [startingAt].
             *
             * Unlike [startingAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("starting_at")
            @ExcludeMissing
            fun _startingAt(): JsonField<OffsetDateTime> = startingAt

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
                 * Returns a mutable builder for constructing an instance of [History].
                 *
                 * The following fields are required:
                 * ```java
                 * .data()
                 * .startingAt()
                 * ```
                 */
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

                /**
                 * Sets [Builder.data] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.data] with a well-typed `List<InnerData>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun data(data: JsonField<List<InnerData>>) = apply {
                    this.data = data.map { it.toMutableList() }
                }

                /**
                 * Adds a single [InnerData] to [Builder.data].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addData(data: InnerData) = apply {
                    this.data =
                        (this.data ?: JsonField.of(mutableListOf())).also {
                            checkKnown("data", it).add(data)
                        }
                }

                fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

                /**
                 * Sets [Builder.startingAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.startingAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
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

                /**
                 * Returns an immutable instance of [History].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .data()
                 * .startingAt()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): History =
                    History(
                        checkRequired("data", data).map { it.toImmutable() },
                        checkRequired("startingAt", startingAt),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): History = apply {
                if (validated) {
                    return@apply
                }

                data().forEach { it.validate() }
                startingAt()
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
                (data.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (startingAt.asKnown().isPresent) 1 else 0)

            class InnerData
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val quantity: JsonField<Double>,
                private val total: JsonField<Double>,
                private val unitPrice: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("quantity")
                    @ExcludeMissing
                    quantity: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("total")
                    @ExcludeMissing
                    total: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("unit_price")
                    @ExcludeMissing
                    unitPrice: JsonField<Double> = JsonMissing.of(),
                ) : this(quantity, total, unitPrice, mutableMapOf())

                /**
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun quantity(): Double = quantity.getRequired("quantity")

                /**
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun total(): Double = total.getRequired("total")

                /**
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun unitPrice(): Double = unitPrice.getRequired("unit_price")

                /**
                 * Returns the raw JSON value of [quantity].
                 *
                 * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("quantity")
                @ExcludeMissing
                fun _quantity(): JsonField<Double> = quantity

                /**
                 * Returns the raw JSON value of [total].
                 *
                 * Unlike [total], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<Double> = total

                /**
                 * Returns the raw JSON value of [unitPrice].
                 *
                 * Unlike [unitPrice], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("unit_price")
                @ExcludeMissing
                fun _unitPrice(): JsonField<Double> = unitPrice

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
                     * Returns a mutable builder for constructing an instance of [InnerData].
                     *
                     * The following fields are required:
                     * ```java
                     * .quantity()
                     * .total()
                     * .unitPrice()
                     * ```
                     */
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

                    /**
                     * Sets [Builder.quantity] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.quantity] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                    fun total(total: Double) = total(JsonField.of(total))

                    /**
                     * Sets [Builder.total] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.total] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun total(total: JsonField<Double>) = apply { this.total = total }

                    fun unitPrice(unitPrice: Double) = unitPrice(JsonField.of(unitPrice))

                    /**
                     * Sets [Builder.unitPrice] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.unitPrice] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
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

                    /**
                     * Returns an immutable instance of [InnerData].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .quantity()
                     * .total()
                     * .unitPrice()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): InnerData =
                        InnerData(
                            checkRequired("quantity", quantity),
                            checkRequired("total", total),
                            checkRequired("unitPrice", unitPrice),
                            additionalProperties.toMutableMap(),
                        )
                }

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
                    (if (quantity.asKnown().isPresent) 1 else 0) +
                        (if (total.asKnown().isPresent) 1 else 0) +
                        (if (unitPrice.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is InnerData &&
                        quantity == other.quantity &&
                        total == other.total &&
                        unitPrice == other.unitPrice &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(quantity, total, unitPrice, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "InnerData{quantity=$quantity, total=$total, unitPrice=$unitPrice, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is History &&
                    data == other.data &&
                    startingAt == other.startingAt &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(data, startingAt, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "History{data=$data, startingAt=$startingAt, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                fiatCreditTypeId == other.fiatCreditTypeId &&
                history == other.history &&
                subscriptionId == other.subscriptionId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(fiatCreditTypeId, history, subscriptionId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{fiatCreditTypeId=$fiatCreditTypeId, history=$history, subscriptionId=$subscriptionId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ContractRetrieveSubscriptionQuantityHistoryResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ContractRetrieveSubscriptionQuantityHistoryResponse{data=$data, additionalProperties=$additionalProperties}"
}
