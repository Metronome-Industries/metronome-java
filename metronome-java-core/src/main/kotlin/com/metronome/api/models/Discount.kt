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
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class Discount
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("product")
    @ExcludeMissing
    private val product: JsonField<Product> = JsonMissing.of(),
    @JsonProperty("schedule")
    @ExcludeMissing
    private val schedule: JsonField<SchedulePointInTime> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("netsuite_sales_order_id")
    @ExcludeMissing
    private val netsuiteSalesOrderId: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    fun product(): Product = product.getRequired("product")

    fun schedule(): SchedulePointInTime = schedule.getRequired("schedule")

    fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

    /** This field's availability is dependent on your client's configuration. */
    fun netsuiteSalesOrderId(): Optional<String> =
        Optional.ofNullable(netsuiteSalesOrderId.getNullable("netsuite_sales_order_id"))

    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    @JsonProperty("product") @ExcludeMissing fun _product(): JsonField<Product> = product

    @JsonProperty("schedule")
    @ExcludeMissing
    fun _schedule(): JsonField<SchedulePointInTime> = schedule

    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /** This field's availability is dependent on your client's configuration. */
    @JsonProperty("netsuite_sales_order_id")
    @ExcludeMissing
    fun _netsuiteSalesOrderId(): JsonField<String> = netsuiteSalesOrderId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Discount = apply {
        if (!validated) {
            id()
            product().validate()
            schedule().validate()
            name()
            netsuiteSalesOrderId()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String>? = null
        private var product: JsonField<Product>? = null
        private var schedule: JsonField<SchedulePointInTime>? = null
        private var name: JsonField<String> = JsonMissing.of()
        private var netsuiteSalesOrderId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(discount: Discount) = apply {
            id = discount.id
            product = discount.product
            schedule = discount.schedule
            name = discount.name
            netsuiteSalesOrderId = discount.netsuiteSalesOrderId
            additionalProperties = discount.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        fun product(product: Product) = product(JsonField.of(product))

        fun product(product: JsonField<Product>) = apply { this.product = product }

        fun schedule(schedule: SchedulePointInTime) = schedule(JsonField.of(schedule))

        fun schedule(schedule: JsonField<SchedulePointInTime>) = apply { this.schedule = schedule }

        fun name(name: String) = name(JsonField.of(name))

        fun name(name: JsonField<String>) = apply { this.name = name }

        /** This field's availability is dependent on your client's configuration. */
        fun netsuiteSalesOrderId(netsuiteSalesOrderId: String) =
            netsuiteSalesOrderId(JsonField.of(netsuiteSalesOrderId))

        /** This field's availability is dependent on your client's configuration. */
        fun netsuiteSalesOrderId(netsuiteSalesOrderId: JsonField<String>) = apply {
            this.netsuiteSalesOrderId = netsuiteSalesOrderId
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

        fun build(): Discount =
            Discount(
                checkNotNull(id) { "`id` is required but was not set" },
                checkNotNull(product) { "`product` is required but was not set" },
                checkNotNull(schedule) { "`schedule` is required but was not set" },
                name,
                netsuiteSalesOrderId,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Product
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        fun name(): String = name.getRequired("name")

        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Product = apply {
            if (!validated) {
                id()
                name()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(product: Product) = apply {
                id = product.id
                name = product.name
                additionalProperties = product.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            fun name(name: String) = name(JsonField.of(name))

            fun name(name: JsonField<String>) = apply { this.name = name }

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

            fun build(): Product =
                Product(
                    checkNotNull(id) { "`id` is required but was not set" },
                    checkNotNull(name) { "`name` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Product && id == other.id && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, name, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Product{id=$id, name=$name, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Discount && id == other.id && product == other.product && schedule == other.schedule && name == other.name && netsuiteSalesOrderId == other.netsuiteSalesOrderId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, product, schedule, name, netsuiteSalesOrderId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Discount{id=$id, product=$product, schedule=$schedule, name=$name, netsuiteSalesOrderId=$netsuiteSalesOrderId, additionalProperties=$additionalProperties}"
}
